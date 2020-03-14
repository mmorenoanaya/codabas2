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
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.codabapp.model.Pedido
import com.example.codabapp.model.PedidosAdapter
import kotlinx.android.synthetic.main.fragment_pedidos.*

const val EXTRA_MESSAGE = "com.example.codabapp.MESSAGE"

class PedidosFragment : Fragment() {

    private lateinit var pedidosViewModel: PedidosViewModel

    var pedidosList: List<Pedido> = ArrayList()
    lateinit var recyclerView: RecyclerView
    lateinit var pAdapter: PedidosAdapter


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Pablo", "Entra a onActivityCreated")
        /*imageButton15.setOnClickListener {
            Log.d("Pablo", "entra a setOnClickListener")
            val fr: FragmentTransaction = fragmentManager!!.beginTransaction()
            fr.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            fr.replace(R.id.nav_host_fragment, DetallePedidoFragment.newInstance())
            fr.commit()
        }*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setting up the RecyclerView
        pAdapter = PedidosAdapter(pedidosList)
        recyclerView = view.findViewById(R.id.recycler_view_pedidos)

        val pLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity!!.applicationContext)
        recyclerView.layoutManager = pLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = pAdapter

        preparePedidoData()
        pAdapter.notifyDataSetChanged()
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

    private fun preparePedidoData(){
        var pedido: Pedido = Pedido("Ramon Valdez", "Pedido para las 8:00 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Vincent Vega", "Pedido para las 8:00 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Marcellus Wallace", "Pedido para las 8:30 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Mia Wallace", "Pedido para las 8:45 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Jules Winnfield", "Pedido para las 9:00 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Butch Coolidge", "Pedido para las 9:45 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Winston Wolfe", "Pedido para las 10:00 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Jimmie Dimmick", "Pedido para las 10:30 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Esmeralda Villalobos", "Pedido para las 11:00 de hoy")
        pedidosList.plus(pedido)

        pedido = Pedido("Quentin Tarantino", "Pedido para las 13:00 de hoy")
        pedidosList.plus(pedido)

        pAdapter.notifyDataSetChanged()
    }

}
