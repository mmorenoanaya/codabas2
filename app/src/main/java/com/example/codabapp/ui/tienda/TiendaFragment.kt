package com.example.codabapp.ui.tienda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.codabapp.R

class TiendaFragment : Fragment() {

    private lateinit var tiendaViewModel: TiendaViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        tiendaViewModel =
                ViewModelProviders.of(this).get(TiendaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tienda, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        tiendaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
