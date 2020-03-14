package com.example.codabapp.model

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.codabapp.R
import kotlinx.android.synthetic.main.pedido_list_row.view.*
import kotlin.collections.*

class PedidosAdapter(var pedidosList: List<Pedido>) :
    RecyclerView.Adapter<PedidosAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var nombre: TextView = view.findViewById(R.id.rvrow_name)
        var entrega: TextView = view.findViewById(R.id.rvrow_entrega)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.pedido_list_row, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pedido: Pedido = pedidosList[position]
        holder.nombre.text = pedido.nombre
        holder.entrega.text = pedido.hora_de_entrega
    }

    override fun getItemCount(): Int{
        return pedidosList.size
    }

}