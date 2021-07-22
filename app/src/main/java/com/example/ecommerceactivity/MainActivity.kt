package com.example.ecommerceactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var home:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClick()
        categories()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when(item.itemId){

           R.id.search-> Toast.makeText(this,"Search your fit",Toast.LENGTH_SHORT).show()
           R.id.favourite-> Toast.makeText(this,"Every one has style",Toast.LENGTH_SHORT).show()

       }
        return true
    }
    fun onClick(){
        home=findViewById(R.id.home)


    }
    fun categories(){
        home.setOnClickListener {
            var intent=Intent(baseContext,CategoriesActivity::class.java)
            startActivity(intent)
        }
    }
}