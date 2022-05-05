package com.example.actividadamigos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Desarrollador : AppCompatActivity() {
    private var recyclerView2: RecyclerView?=null
    private var recyclerViewAdapter2:AddFriends?=null
    private var movieList2= mutableListOf<Movie_amigos>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desarrollador)
        movieList2 = ArrayList()
        recyclerView2 = findViewById<View>(R.id.recycler_view2) as RecyclerView
        recyclerViewAdapter2 = AddFriends(movieList2)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView2!!.layoutManager = layoutManager
        recyclerViewAdapter2!!.setOnItemClickListener(object : ClickListener<Movie_amigos> {
            override fun onItemClick(data: Movie_amigos) {
                Toast.makeText(this@Desarrollador, data.title, Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView2!!.adapter = recyclerViewAdapter2
        prepareMovie()
    }

    private fun prepareMovie() {
        var movie = Movie_amigos("Melvin Josué Pereira Amaya", R.drawable.melvin, 20)
        movieList2.add(movie)

        recyclerViewAdapter2?.notifyDataSetChanged()
    }
}