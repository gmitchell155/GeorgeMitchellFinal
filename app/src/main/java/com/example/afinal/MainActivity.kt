package com.example.afinal

import android.app.AlertDialog
import android.content.Intent
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
        var myWebView: WebView = findViewById(R.id.test)
        myWebView.loadUrl("file:///android_asset/index.html")
        myWebView.settings.javaScriptEnabled = true

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.home_navigation_menu){
            var myWebView: WebView = findViewById(R.id.test)
            myWebView.loadUrl("file:///android_asset/index.html")
        }

        if(item.itemId == R.id.portfolio_navigation_menu){
            var myWebView: WebView = findViewById(R.id.test)
            myWebView.loadUrl("file:///android_asset/portfolio.html")
        }

        if(item.itemId == R.id.about_navigation_menu){
            var myWebView: WebView = findViewById(R.id.test)
            myWebView.loadUrl("file:///android_asset/about.html")
        }

        if(item.itemId == R.id.education_navigation_menu){
            var myWebView: WebView = findViewById(R.id.test)
            myWebView.loadUrl("file:///android_asset/education.html")
        }

        if(item.itemId == R.id.contact_navigation_menu){
            var myWebView: WebView = findViewById(R.id.test)
            myWebView.loadUrl("file:///android_asset/contact.html")
        }

        if(item.itemId == R.id.developer_navigation_menu){
            //displays acknowledgement message
            val builder = AlertDialog.Builder(binding.root.context)
                .setTitle("About the Developer")
                .setMessage(R.string.developer_info)
                .setPositiveButton("ok", null)
                .show()
        }

        if(item.itemId == R.id.exampleSite_navigation_menu){
            openBagwellActivity()
        }

        if(item.itemId == R.id.exampleSite2_navigation_menu){
            openClubSiteActivity()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun openBagwellActivity() {
        val intent = Intent(this, BagwellSite::class.java)
        startActivity(intent)
    }

    private fun openClubSiteActivity(){
        val intent = Intent(this, ClubSite::class.java)
        startActivity(intent)
    }

}