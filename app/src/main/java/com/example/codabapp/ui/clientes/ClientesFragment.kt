package com.example.codabapp.ui.clientes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.codabapp.R

class ClientesFragment : Fragment() {

    private lateinit var clientesViewModel: ClientesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        clientesViewModel =
                ViewModelProviders.of(this).get(ClientesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_clientes, container, false)
        //val textView: TextView = root.findViewById(R.id.text_notifications)
        clientesViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
        })
        return root
    }
}
