package com.example.afinal

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import com.example.afinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myWebView: WebView = findViewById(R.id.test)
        myWebView.loadUrl("file:///android_asset/index.html")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.developer_navigation_menu){
            //displays acknowledgement message
            val builder = AlertDialog.Builder(binding.root.context)
                .setTitle("About the Developer")
                .setMessage(R.string.developer_info)
                .setPositiveButton("ok", null)
                .show()
        }
        return super.onOptionsItemSelected(item)
    }

}