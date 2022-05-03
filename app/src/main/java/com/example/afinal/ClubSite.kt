package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import com.example.afinal.databinding.ActivityClubSiteBinding

class ClubSite : AppCompatActivity() {
    private lateinit var binding: ActivityClubSiteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityClubSiteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var myWebView: WebView = findViewById(R.id.club_webView)
        myWebView.loadUrl("file:///android_asset/sites/sites/index.html")
        myWebView.settings.javaScriptEnabled = true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.example_site2_navigation_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //opens index.html
        if(item.itemId == R.id.home_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/index.html")
        }
        //opens personaldev.html
        if(item.itemId == R.id.development_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/personaldev.html")
        }
        //opens tutoring.html
        if(item.itemId == R.id.tutoring_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/tutoring.html")
        }
        //opens adventures.html
        if(item.itemId == R.id.adventures_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/adventures.html")
        }
        //opens volunteen.html
        if(item.itemId == R.id.volunteen_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/volunteen.html")
        }
        //opens mentoring.html
        if(item.itemId == R.id.mentoring_menu_item){
            var myWebView: WebView = findViewById(R.id.club_webView)
            myWebView.loadUrl("file:///android_asset/sites/sites/mentoring.html")
        }
        //runs the openMainActivity function
        if(item.itemId == R.id.main__menu_item){
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