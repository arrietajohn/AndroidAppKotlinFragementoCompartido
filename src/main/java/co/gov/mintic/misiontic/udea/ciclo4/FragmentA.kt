package co.gov.mintic.misiontic.udea.ciclo4
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentA : Fragment() {
    private lateinit var mensaje: TextView
    private var cuenta = 0

    override fun onCreate(savedInstanceState: Bundle?) {  super.onCreate(savedInstanceState)  }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_fragmento, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnLimpilar).setOnClickListener { limpiar() }
        view.findViewById<Button>(R.id.btnCuenta).setOnClickListener { contar() }
        mensaje = view.findViewById(R.id.txtMensaje)
        actualizarLaVista()
    }

    private fun contar() {   cuenta++
        actualizarLaVista()
    }

    private fun limpiar() {  cuenta = 0
        actualizarLaVista()
    }

    private fun actualizarLaVista() { mensaje.text =  cuenta.toString()    }
}

/*
// en el oncreate

     arguments?.let {
         cuenta = it.getInt(CONTEO, 0)
     }

// al final de la clase
   companion object {
        const val CONTEO = "count"

        fun newInstance(cuenta: Int): FragmentA =
            FragmentA().apply {
                arguments = Bundle().apply {
                    putInt(CONTEO, cuenta)
                }
            }
    }
  */