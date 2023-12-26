package com.example.projectdeveloper.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectdeveloper.R

class CustomAdapter(private var context: Context, private var dataList: List<ModeleRecyclerView>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private var onItemClickListener: ((ModeleRecyclerView) -> Unit)? = null
    fun setOnItemClickListener(listener: (ModeleRecyclerView) -> Unit) {
        onItemClickListener = listener
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val langage: TextView = itemView.findViewById(R.id.langage)
        val developper: TextView = itemView.findViewById(R.id.developper)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.myreceyclerview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modeleRecyclerView: ModeleRecyclerView = dataList.get(position)

        holder.langage.text = modeleRecyclerView.langage
        holder.developper.text = modeleRecyclerView.developper
        holder.imageView.setImageResource(modeleRecyclerView.image)
        holder.itemView.setOnClickListener {
            onItemClickListener?.invoke(modeleRecyclerView)
        }
    }
    override fun getItemCount(): Int {
        return dataList.size
    }
}
