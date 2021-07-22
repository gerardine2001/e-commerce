package com.example.ecommerceactivity

import android.icu.util.ULocale
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ShopCategoryActivity : AppCompatActivity() {
    lateinit var rvCategories:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_category)
    }
    fun displayCategories(){
        var categoryList= listOf<Categories>(
            Categories("Ethic wear","70%","+FOR HIM","https://wallpaperaccess.com/full/945374.jpg"),
            Categories("Ethic wear","70%","+FOR HIM","https://wallpaperaccess.com/full/945374.jpg"),
            Categories("Ethic wear","70%","+FOR HIM","https://wallpaperaccess.com/full/945374.jpg")

        )

        rvCategories=findViewById(R.id.rvCategory)
        var categoryAdapter=CategoriesActivity(categoryList,baseContext)
        rvCategories.layoutManager=GridLayoutManager(this,3)
        rvCategories.adapter=categoryAdapter
    }


}