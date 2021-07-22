package com.example.ecommerceactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CategoriesActivity(var categoriesList:List<Categories>,var  context:Context):RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.row_items,parent,false)
        return CategoriesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        var currentCategory=categoriesList.get(position)
        holder.type.text=currentCategory.type
        holder.percentage.text=currentCategory.percentage
        holder.gender.text=currentCategory.gender
//        holder.photo.text=currentCategory.photo
        Picasso.get().load(currentCategory.photo).resize(100,100).into(holder.photo)
        holder.apply {

        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}
class CategoriesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var type=itemView.findViewById<TextView>(R.id.type)
    var percentage=itemView.findViewById<TextView>(R.id.percentage)
    var gender=itemView.findViewById<TextView>(R.id.gender)
    var photo=itemView.findViewById<ImageView>(R.id.photo)

}