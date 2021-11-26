package co.gov.mintic.misiontic.udea.ciclo4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrir(v : View){
        val intento = Intent(this, MainActivity2::class.java)
        startActivity(intento)
    }
}
