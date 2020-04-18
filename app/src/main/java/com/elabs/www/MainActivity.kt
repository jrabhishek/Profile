package com.elabs.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

    fun setUpRecyclerView(list: List<Profile>) {
        val profileAdapter = ProfileAdapter(list, this)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = profileAdapter
    }

    override fun onResume() {
        super.onResume()
        userApi.getUsers(5).enqueue(ResponseHandler())
    }

     inner class ResponseHandler : Callback<ProfileResponce> {
        override fun onFailure(call: Call<ProfileResponce>, t: Throwable) {
            Toast.makeText(this@MainActivity, "Kuch Gadbad hai ", Toast.LENGTH_LONG).show()
        }

        override fun onResponse(call: Call<ProfileResponce>, response: Response<ProfileResponce>) {
            val profileResponce = response.body()
            if (profileResponce != null) {
                setUpRecyclerView(profileResponce.results)
            }
        }
    }


}
