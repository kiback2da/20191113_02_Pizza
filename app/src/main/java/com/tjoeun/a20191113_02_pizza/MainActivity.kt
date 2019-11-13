package com.tjoeun.a20191113_02_pizza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a20191113_02_pizza.adapter.PizzaAdapter
import com.tjoeun.a20191113_02_pizza.data.PizzaData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.pizza_list_item.*

class MainActivity : BaseActivity() {

    var pizzaList = ArrayList<PizzaData>()
    var pizzaAdapter:PizzaAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
        setTitle("피자가게 목록이얌")
    }

    override fun setupEvents() {
        pizzaAdapter = PizzaAdapter(this, R.layout.pizza_list_item, pizzaList)
        mainListView.adapter = pizzaAdapter

        /*mainListView.setOnItemClickListener { parent, view, position, id ->
            var intent = Intent(mContext,PizzaStoreActivity::class.java)
            var list = pizzaList.get(position)
            intent.putExtra("url",list.url)
            intent.putExtra("name",list.name)
            intent.putExtra("phoneNum",list.phoneNum)

            startActivity(intent)
        }*/

    }

    override fun setValues() {
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
        pizzaList.add(PizzaData("피자헛","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg","010-0000-1234"))
        pizzaList.add(PizzaData("파파존스","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800","010-0000-1235"))
        pizzaList.add(PizzaData("미스터피자","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200","010-0000-1238"))
        pizzaList.add(PizzaData("도미노피자","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png","010-0000-1239"))
    }
}
