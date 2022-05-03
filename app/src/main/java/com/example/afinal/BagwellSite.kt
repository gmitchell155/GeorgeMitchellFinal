package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import com.example.afinal.databinding.ActivityBagwellSiteBinding
import com.example.afinal.databinding.ActivityMainBinding

class BagwellSite : AppCompatActivity() {
    private lateinit var binding: ActivityBagwellSiteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBagwellSiteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var myWebView: WebView = findViewById(R.id.bagwell_webView)
        myWebView.loadUrl("file:///android_asset/bagwell/index.html")
        myWebView.settings.javaScriptEnabled = true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_site_navigation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //opens index.html
        if(item.itemId == R.id.home_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/index.html")
        }
        //opens majors.html
        if(item.itemId == R.id.majors_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/majors.html")
        }
        //opens courses.html
        if(item.itemId == R.id.courses_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/courses.html")
        }
        //opens class.html
        if(item.itemId == R.id.classes_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/class.html")
        }
        //opens work.html
        if(item.itemId == R.id.work_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/work.html")
        }
        //opens contact.html
        if(item.itemId == R.id.contact_menu_item){
            var myWebView: WebView = findViewById(R.id.bagwell_webView)
            myWebView.loadUrl("file:///android_asset/bagwell/contact.html")
        }
        //runs the openMainActivity function
        if(item.itemId == R.id.main_menu_item){
            openMainActivity()
        }

        return super.onOptionsItemSelected(item)
    }
    //opens activity that has a WebView that displays the main site
    private fun openMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}