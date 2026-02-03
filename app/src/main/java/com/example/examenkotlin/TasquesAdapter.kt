package com.example.examenkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TasquesAdapter(private val dataSet: List<Tasca>) :
    RecyclerView.Adapter<TasquesAdapter.TascaViewHolder>() {

    class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var tvNom : TextView
        lateinit var tvCategoria : TextView
        lateinit var tvData : TextView
        lateinit var tvEstat : TextView
        init{
            tvNom = itemView.findViewById(R.id.tvNom)
            tvCategoria = itemView.findViewById(R.id.tvCategoria)
            tvEstat = itemView.findViewById(R.id.tvEstat)
            tvData = itemView.findViewById(R.id.tvData)
        }

    }

    private var tasques = listOf<Tasca>()

    fun setTasques(novesTasques: List<Tasca>) {
        tasques = novesTasques
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TascaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tasca, parent, false)
        return TascaViewHolder(view)
    }

    override fun onBindViewHolder(holder: TascaViewHolder, position: Int) {
        val item = dataSet[position]
        holder.tvNom.text
        holder.tvCategoria.text
        holder.tvData.text
        holder.tvEstat.text
    }
    override fun getItemCount() = dataSet.size

}