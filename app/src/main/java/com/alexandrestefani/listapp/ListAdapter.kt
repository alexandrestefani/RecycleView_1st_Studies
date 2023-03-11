package com.alexandrestefani.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter: RecyclerView.Adapter<ListAdapter.ListViewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout,parent, false)

        return ListViewholder(view)
    }

    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ListViewholder, position: Int) {
        holder.posicao.text = position.toString()
        holder.conteudo.text = "lista experimental aula1"
    }

    class ListViewholder(view: View): RecyclerView.ViewHolder(view){
        var posicao = view.findViewById<TextView>(R.id.posicao)
        var conteudo = view.findViewById<TextView>(R.id.conteudo)

    }
}