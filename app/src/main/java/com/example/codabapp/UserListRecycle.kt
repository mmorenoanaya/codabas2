package com.example.codabapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.codabapp.R
import kotlinx.android.synthetic.main.layout_listclient.view.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_listclient.view.*

class UserListRecycle : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<UserList> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return UserListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_listclient, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is UserListViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


    fun submitList(userList: List<UserList>) {
        items = userList
    }
    class UserListViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val list_name= itemView.name
        val list_descripcion = itemView.descripcion
        val list_estado = itemView.estado

        fun bind(listUser: UserList){
            list_name.setText(listUser.name)
            list_descripcion.setText(listUser.description)
            list_estado.setText(listUser.estado)
        }
    }
}