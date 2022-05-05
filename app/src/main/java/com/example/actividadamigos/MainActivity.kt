package com.example.actividadamigos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    private var recyclerViewAdapter:AddFriends?=null
    private var movieList = mutableListOf<Movie_amigos>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        movieList = ArrayList()
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        recyclerViewAdapter = AddFriends(movieList)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView!!.layoutManager = layoutManager
        recyclerViewAdapter!!.setOnItemClickListener(object : ClickListener<Movie_amigos> {
            override fun onItemClick(data: Movie_amigos) {
                Toast.makeText(this@MainActivity, data.title, Toast.LENGTH_SHORT).show()
            }
        })
        recyclerView!!.adapter = recyclerViewAdapter
        prepareMovie()
    }

    private fun prepareMovie() {
        var movie = Movie_amigos("Joel Cristopher Turcios Turcios", R.drawable.cris,21)
        movieList.add(movie)
        movie = Movie_amigos("Melvin Adiel Vasquez Mejia", R.drawable.adiel, 20)
        movieList.add(movie)
        movie = Movie_amigos("Luis Antonio Guevara Andrade", R.drawable.luis,20)
        movieList.add(movie)
        movie = Movie_amigos("Ivan Alexander Chavez Treminio", R.drawable.ivan,20)
        movieList.add(movie)
        movie = Movie_amigos("Luis Manuel Ayala Flores", R.drawable.luisu,20)
        movieList.add(movie)
        movie = Movie_amigos("Salvador Mauricio Chavarria", R.drawable.camba,19)
        movieList.add(movie)
        movie = Movie_amigos("Gabriel Eduardo Henriquez Gonzalez", R.drawable.gabriel,18)
        movieList.add(movie)
        movie = Movie_amigos("Jaime Arnoldo Rodriguez Meza", R.drawable.jaime,18)
        movieList.add(movie)
        movie = Movie_amigos("Melvin josue perez garcia", R.drawable.perez,18)
        movieList.add(movie)
        recyclerViewAdapter?.notifyDataSetChanged()
    }
}