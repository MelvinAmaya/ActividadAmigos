package com.example.actividadamigos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //creamos variable nulas
    private var recyclerView:RecyclerView?=null
    private var recyclerViewAdapter:AddFriends?=null
    //creamos una lista la cual le enviar datos a la clase Movie_amigos
    private var movieList = mutableListOf<Movie_amigos>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declaramos la lista como un arrayList
        movieList = ArrayList()
        //enlazamos los elementos graficos para utilizarlos en la programacion
        recyclerView = findViewById<View>(R.id.recycler_view) as RecyclerView
        //el adapter sera igual a la clase Addfiends la cual recibe como paramero la lista
        recyclerViewAdapter = AddFriends(movieList)
        //creamos una varable
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        //igualamos la variable recyclerView a layoutManager
        recyclerView!!.layoutManager = layoutManager
        //creamos el metoso ClickListener para cuando precionen un rejistro se muestre el titulo del mismo
        recyclerViewAdapter!!.setOnItemClickListener(object : ClickListener<Movie_amigos> {
            override fun onItemClick(data: Movie_amigos) {
                //enviamos un toast
                Toast.makeText(this@MainActivity, data.title, Toast.LENGTH_SHORT).show()
            }
        })
        //enviamos el adapter al recyclerView
        recyclerView!!.adapter = recyclerViewAdapter
        //llamamos el metodo
        prepareMovie()
    }

    //creamos el metodo
    private fun prepareMovie() {
        //creamos la variable movie la cual alamcenara los registros
        var movie = Movie_amigos("Joel Cristopher Turcios Turcios", R.drawable.cris,21)
        //agregamos el registro a la lista
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