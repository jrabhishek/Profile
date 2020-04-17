package com.elabs.www

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ProfileAdapter(var list: ArrayList<Profile>,val context:Context): RecyclerView.Adapter<ProfileAdapter.ProfileHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.profile,parent,false)
        return ProfileHolder(inflater);
    }

    override fun getItemCount(): Int =list.size


    override fun onBindViewHolder(holder: ProfileHolder, position: Int) {
        val currentObj = list.get(position)
        holder.name.text = currentObj.name
        holder.email.text = currentObj.email

        Glide.with(context).load(currentObj.image).centerCrop().into(holder.image)



    }
    class ProfileHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val image = itemView.findViewById<ImageView>(R.id.profileImage)
        val name = itemView.findViewById<TextView>(R.id.name)
        val email = itemView.findViewById<TextView>(R.id.emailId)
    }
}