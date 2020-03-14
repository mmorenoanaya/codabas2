package com.example.codabapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pedidos.*
import android.content.Intent
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.example.codabapp.model.Pedido
import com.example.codabapp.model.PedidosAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // var pedidosList: List<Pedido> = ArrayList<Pedido>()
    // lateinit var recyclerView: RecyclerView
    // lateinit var pAdapter: PedidosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_pedidos, R.id.navigation_tienda, R.id.navigation_clientes))
        // setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        /*
        // Setting up the RecyclerView
        recyclerView = findViewById(R.id.recycler_view_pedidos)

        pAdapter = PedidosAdapter(pedidosList)
        val pLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = pLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = pAdapter

        preparePedidoData()
        */
    }
    /*
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

        pAdapter.notifyDataSetChanged();
    }
    */

}
