package com.example.codabapp.ui.pedidos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.codabapp.R
import android.os.Bundle
import android.transition.Transition
import android.util.Log
import android.view.View
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_pedidos.*

const val EXTRA_MESSAGE = "com.example.codabapp.MESSAGE"

class PedidosFragment : Fragment() {

    private lateinit var pedidosViewModel: PedidosViewModel

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        pedido_1.setOnClickListener {
            Log.d("Pablo", "entra a setOnClickListener")
            val fr: FragmentTransaction = fragmentManager!!.beginTransaction()
            fr.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            fr.replace(R.id.nav_host_fragment, DetallePedidoFragment.newInstance())
            fr.commit()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        pedidosViewModel = ViewModelProviders.of(this).get(PedidosViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_pedidos, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        return root
    }

}
