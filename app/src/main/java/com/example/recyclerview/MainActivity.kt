package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var personArray = ArrayList<Person>()
        personArray.add(Person("James", "Developer"))
        personArray.add(Person("John", "Manager"))
        personArray.add(Person("Alex", "Coach"))
        personArray.add(Person("Tiger", "Player"))

        var personAdapter = PersonAdapter(personArray)
//        recyclerView.layoutManager = LinearLayoutManager(this) // this is vertical
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = personAdapter
    }
}
