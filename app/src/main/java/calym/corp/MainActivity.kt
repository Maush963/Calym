 package calym.corp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TableLayout
import android.widget.TextView

 class MainActivity : AppCompatActivity() {
     //Definición de una matriz
     var matriz = arrayOf(
         arrayOf(0,1,2),
         arrayOf(3,4,5),
         arrayOf(6,7,8))
     //Aquí estamos creando t1Tabla y decimos que es una variable tipo TableLayout
     var tlTabla: TableLayout?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*Aquí vinculamos la tabla que tenemos en el xml con la variable que creamos en kotlin*/
        tlTabla = findViewById(R.id.tlTabla)
        //With this we remove all the content from the table, now we can fill it without problems.
        tlTabla?.removeAllViews()
        //Este for se repite 3 veces, por la cantidad de filas que tiene la matriz.
        for (i in (0 until matriz.count())) {
            //*Layoutinflater* es como insertar y *inflate* se utiliza para rellenar
            val registro = LayoutInflater.from(this).inflate(R.layout.my_layout, null,false)
            //Ahora mandamos a llamar a c/u de los tv, para esto hacemos variables para c/u
            //primero decimos que esta dentro de registro y luego usamos una función para encontrarlo
            val tv0=registro.findViewById<View>(R.id.tv0) as TextView
            val tv1=registro.findViewById<View>(R.id.tv1) as TextView
            val tv2=registro.findViewById<View>(R.id.tv2) as TextView
            //Ahora vamos a asignar los valores de la matriz dentro de cada Text View
            tv0.text = matriz[i][0].toString()
            tv1.text = matriz[i][1].toString()
            tv2.text = matriz[i][2].toString()
            //Ahora actualizamos nuestra tabla con el registro que tenemos.
            tlTabla?.addView(registro)

        }


    }
}


