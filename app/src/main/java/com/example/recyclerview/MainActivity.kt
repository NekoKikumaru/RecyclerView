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
        personArray.add(Person("James", "Developer", R.drawable.wei_wuxian))
        personArray.add(Person("John", "Manager", R.drawable.lan_wangji))
        personArray.add(Person("Alex", "Coach", R.drawable.lan_xichen))
        personArray.add(Person("Tiger", "Player", R.drawable.jin_guangyao))
        personArray.add(Person("James", "Developer", R.drawable.jiang_cheng))
        personArray.add(Person("John", "Manager", R.drawable.wen_qing))
        personArray.add(Person("Alex", "Coach", R.drawable.wen_ning))
        personArray.add(Person("Tiger", "Player", R.drawable.xue_yang))

        var personAdapter = PersonAdapter(personArray)
//        recyclerView.layoutManager = LinearLayoutManager(this) // this is vertical
//        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = personAdapter
    }
}
