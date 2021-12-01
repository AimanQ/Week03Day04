package com.example.week03day04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapterPhone(val array:ArrayList<Phone>):RecyclerView.Adapter<CustomAdapterPhone.DataHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
        val dataHolder:DataHolder = DataHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.custom_layout_phone,parent,false))

        return dataHolder
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
        val person:Phone = array.get(position)

        holder.imageView.setImageResource(person.img)
        holder.textView.setText(person.name)
        holder.textViewBrand.setText(person.brand)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    class DataHolder(view:View):RecyclerView.ViewHolder(view){
        val imageView:ImageView = view.findViewById(R.id.ivProfile)
        val textView:TextView = view.findViewById(R.id.tvName)
        val textViewBrand:TextView = view.findViewById(R.id.tvBrand)
    }
}