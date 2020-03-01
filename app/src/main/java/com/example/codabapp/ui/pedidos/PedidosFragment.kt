package com.example.codabapp.ui.pedidos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.codabapp.R
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

const val EXTRA_MESSAGE = "com.example.codabapp.MESSAGE"

class PedidosFragment : Fragment() {

    private lateinit var pedidosViewModel: PedidosViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        pedidosViewModel = ViewModelProviders.of(this).get(PedidosViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_pedidos, container, false)

        val button: ImageButton = root.findViewById<ImageButton>(R.id.imageButton15)
        button.setOnClickListener(View.OnClickListener {
            fun onClick(view: View){
                val fr: FragmentTransaction = fragmentManager!!.beginTransaction()
                fr.replace(R.id.fragment_container, DetallePedidoFragment.newInstance())
                fr.commit()
            }
        })

        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        return root
    }


}
