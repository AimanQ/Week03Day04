package com.example.week03day04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        connectViews()
        prepareRecycler()
    }

    private fun connectViews(){
        recyclerView = findViewById(R.id.recycler)
    }
    private fun prepareRecycler(){

        val array:ArrayList<Person> = ArrayList()
        array.add(Person("Khalid",R.drawable.profile))
        array.add(Person("Ahmad",R.drawable.profile))
        array.add(Person("Mohammed",R.drawable.profile))
        array.add(Person("Sarah",R.drawable.profile))
        array.add(Person("Faisal",R.drawable.profile))
        array.add(Person("Ali",R.drawable.profile))
        array.add(Person("Ayman",R.drawable.profile))


        val arrayPhones:ArrayList<Phone> = ArrayList()
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
        arrayPhones.add(Phone("Pixel 5","Google",R.drawable.phone))
//        array.add(Person("Ahmad",R.drawable.profile))
//        array.add(Person("Mohammed",R.drawable.profile))
//        array.add(Person("Sarah",R.drawable.profile))
//        array.add(Person("Faisal",R.drawable.profile))
//        array.add(Person("Ali",R.drawable.profile))
//        array.add(Person("Ayman",R.drawable.profile))

        val customAdapter = CustomAdapterPhone(arrayPhones)
//        val customAdapter:CustomAdapter = CustomAdapter(array)

        recyclerView?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView?.adapter = customAdapter

    }
}