package com.hma.sos.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hma.sos.R
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactAdapter : RecyclerView.Adapter<ContactAdapter.MyViewHolder>() {
    private val contactList = mutableListOf<Contact>()
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = contactList.get(position)
        holder.itemView.tvName.text = item.name
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
    fun setContactList(list:List<Contact>){
        contactList.clear()
        contactList.addAll(list)
        notifyDataSetChanged()
    }
}