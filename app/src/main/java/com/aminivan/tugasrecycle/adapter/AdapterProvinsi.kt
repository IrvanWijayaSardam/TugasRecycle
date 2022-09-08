package com.aminivan.tugasrecycle.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.tugasrecycle.R

class AdapterProvinsi(val dataProvinsi: ArrayList<DataProvinsi>) :
    RecyclerView.Adapter<AdapterProvinsi.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaProvisi = view.findViewById<TextView>(R.id.txtProvinsi)
        var namaIbuKota = view.findViewById<TextView>(R.id.txtIbuKota)
        var imgProvinsi = view.findViewById<ImageView>(R.id.imgProvinsi)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_provinsi,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProvisi.text = "Provinsi : "+dataProvinsi[position].namaProvinsi
        holder.namaIbuKota.text = "Ibu Kota : "+dataProvinsi[position].namaIbukota
        holder.imgProvinsi.setImageResource(dataProvinsi[position].imgIbukota)
    }

    override fun getItemCount(): Int {
        return dataProvinsi.size
    }
}