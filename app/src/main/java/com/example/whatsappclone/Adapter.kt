package com.example.whatsappclone

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class Adapter(
    var wplist: List<Whatsapp>
):RecyclerView.Adapter<Adapter.WhatsappViewHolder>() {
    inner class WhatsappViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val photo: CircleImageView = itemView.findViewById(R.id.photo)
        val name: TextView = itemView.findViewById(R.id.name)
        val lst_msg: TextView = itemView.findViewById(R.id.lst_msg)
        val time: TextView = itemView.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhatsappViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_item, parent, false)
        return WhatsappViewHolder(view)
    }

    override fun onBindViewHolder(holder: WhatsappViewHolder, position: Int) {
        holder.photo.setImageResource(wplist[position].photo)
        holder.name.text = wplist[position].name
        holder.lst_msg.text = wplist[position].lst_msg
        holder.time.text = wplist[position].time

    }

    override fun getItemCount(): Int {
        return wplist.size

    }
}