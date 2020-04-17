package com.elabs.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Profile>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = ArrayList<Profile>();
        setData()
        val adapter1 = ProfileAdapter(list,this)
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager= LinearLayoutManager(this@MainActivity)
            adapter=adapter1
        }


    }
    //this function set the fake data
    fun setData()
    {
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))
        list.add(Profile("Abhishek raj","abhishekraj2772@gmail.com","M","https://picsum.photos/200/300"))



    }
}
