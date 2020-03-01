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
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var listAdapter: UserListRecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycleView()
        addDataSet()

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_pedidos, R.id.navigation_tienda, R.id.navigation_clientes))
        // setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        listAdapter.submitList(data)
    }
    private fun initRecycleView(){
        recycler_view.apply {
//            recycler_view.layoutManager= LinearLayoutManager(this@MainActivity)
            val topSpacingItemsDecoration= TopSpacingItemsDecoration(20)
//            addItemDecoration(topSpacingItemsDecoration)
            listAdapter = UserListRecycle()
//            adapter = listAdapter
        }
    }

}
