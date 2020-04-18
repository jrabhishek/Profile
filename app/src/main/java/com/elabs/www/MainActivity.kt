package com.elabs.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setUpRecyclerView(list:List<Profile>) {
        val adapter1 = ProfileAdapter(list, this)
        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = adapter1
        }
    }

    override fun onResume() {
        super.onResume()
        userApi.getUsers(5).enqueue(object : Callback<ProfileResponce> {
            override fun onFailure(call: Call<ProfileResponce>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<ProfileResponce?>,
                response: Response<ProfileResponce>
            ) {


            }
        })


    }

}
