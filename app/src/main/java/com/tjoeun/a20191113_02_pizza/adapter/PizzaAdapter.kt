package com.tjoeun.a20191113_02_pizza.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.tjoeun.a20191113_02_pizza.PizzaStoreActivity
import com.tjoeun.a20191113_02_pizza.R
import com.tjoeun.a20191113_02_pizza.data.PizzaData

class PizzaAdapter(context: Context, res:Int, list: ArrayList<PizzaData>) : ArrayAdapter<PizzaData>(context,res,list) {

    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.pizza_list_item,null)
        }

        var row = tempRow!!
        var list = mList.get(position)

        var url = list.url
        var name = row.findViewById<TextView>(R.id.pizzaTxt)
        var img = row.findViewById<ImageView>(R.id.pizzaImg)
        var arrowImg = row.findViewById<ImageView>(R.id.pizzaImgArrow)
        var listBlank = row.findViewById<LinearLayout>(R.id.pizzaLinear)

        name.text = list.name
        Glide.with(mContext).load(url).into(img)

        arrowImg.setOnClickListener {
            var intent = Intent(mContext,PizzaStoreActivity::class.java)

            intent.putExtra("url",list.url)
            intent.putExtra("name",list.name)
            intent.putExtra("phoneNum",list.phoneNum)

            ContextCompat.startActivity(mContext,intent,null)
        }

        listBlank.setOnClickListener {
            var intent = Intent(mContext,PizzaStoreActivity::class.java)

            intent.putExtra("url",list.url)
            intent.putExtra("name",list.name)
            intent.putExtra("phoneNum",list.phoneNum)

            ContextCompat.startActivity(mContext,intent,null)
        }



        return row
    }

}