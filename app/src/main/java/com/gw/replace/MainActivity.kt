package com.gw.replace

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.start)
        Log.e("ssss","dfdfdf")
        Log.v("ssss","dfdfdf")
        Log.i("ssss","dfdfdf")
        Log.d("ssss","dfdfdf")
        button.setOnClickListener {

//        Log.e("wei=====wei","Replace Success!");
           /* val list = mutableListOf<String>()
            list.add("1-1-0")
            Toast.makeText(this,"ss ${list.contains("1-0")}",Toast.LENGTH_LONG).show()*/
        }
    }

}