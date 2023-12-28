package com.example.projectdeveloper.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectdeveloper.R
import com.example.projectdeveloper.model.CustomAdapter
import com.example.projectdeveloper.model.ModeleRecyclerView
import com.example.projectdeveloper.model.onItemClickListener

class PageHome : AppCompatActivity() , onItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_home)
        //declaration de RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //Ajouter data dans une liste
        val dataList = listOf(
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java),
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java) ,
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java),
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java),
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java) ,
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
            ModeleRecyclerView("Langage_Java", "Developper en langage Java ", R.drawable.img_java) ,
            ModeleRecyclerView("Langage_Kotlin", "Developper en langage Kotlin", R.drawable.img_kotlin),
            ModeleRecyclerView("Langage_Swift", "Developper en langage Swift", R.drawable.img_swift),
        )
        //declarer Custome Adapter
        val customAdapter = CustomAdapter(this, dataList,this)

        //Operation au momment de click en RecyclerView
        /*customAdapter.setOnItemClickListener { modeleRecyclerView ->
            Toast.makeText(this, "Cliqué sur ${modeleRecyclerView.langage}", Toast.LENGTH_SHORT).show()
        }*/

        //affecter Custome Adapter dans une RecyclerView
        recyclerView.adapter = customAdapter

        //Creation de Menu "declarer Toolbar"
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
    //Inflat Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuhome, menu)
        return true
    }
    //les operations au momment de click dans chaque icon de menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var itemId:Int = item.itemId
        if (itemId == R.id.iconHome){
            var intent = Intent(this,PageHome::class.java)
            startActivity(intent)
        }

        else if (itemId == R.id.iconAccount){
            supportFragmentManager.beginTransaction().replace(R.id.fragment, FragmentProfile())
                .commit()
        }
        else if (itemId == R.id.iconLogout){
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        else if (itemId == R.id.ajouter){
            Toast.makeText(this,"Clicked in icon Add",Toast.LENGTH_SHORT).show()
        }
        else if (itemId == R.id.java){
            //supportFragmentManager.beginTransaction().replace(R.id.fragment,ProjetsJava()).commit()
            Toast.makeText(this,"Clicked in langage Java ",Toast.LENGTH_SHORT).show()
        }
        else if (itemId == R.id.kotlin){
            Toast.makeText(this,"Clicked in langage kotlin ",Toast.LENGTH_SHORT).show()
        }
        else if (itemId == R.id.swift){
            Toast.makeText(this,"Clicked in langage Swift",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onItemClick(modeleRecyclerView: ModeleRecyclerView) {
        var intent = Intent(this,activity_Information::class.java)
        startActivity(intent)
    }
}
