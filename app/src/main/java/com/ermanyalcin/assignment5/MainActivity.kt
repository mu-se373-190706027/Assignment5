package com.ermanyalcin.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf("Erman Yalçın", "Melis Kara", "İlayda Gülasar", "Arda Deniz Küçükçoban", "Melih Sahtiyan")

        // access the listView from xml file
        val mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }

    fun addPic(view: View){
        val pic = findViewById<View>(R.id.picture) as ImageView
        pic.setBackgroundResource(R.mipmap.picture)
        pic.isVisible = true
    }

    fun changePage(view: View){
        val intent = Intent(applicationContext, MainActivity2::class.java)
        startActivity(intent)
    }
}