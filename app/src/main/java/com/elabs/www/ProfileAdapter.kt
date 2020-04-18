package com.elabs.www

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile.view.*

class ProfileAdapter(var list: List<Profile>, val context:Context): RecyclerView.Adapter<ProfileAdapter.ProfileHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.profile,parent,false)
        return ProfileHolder(inflater);
    }

    override fun getItemCount(): Int =list.size


    override fun onBindViewHolder(holder: ProfileHolder, position: Int) {
        val currentObj = list.get(position)
        holder.name.text = "${currentObj.name.title} ${currentObj.name.first} ${currentObj.name.last}"
        holder.email.text = currentObj.email
    }
    class ProfileHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val name = itemView.name
        val email = itemView.emailId
    }
}