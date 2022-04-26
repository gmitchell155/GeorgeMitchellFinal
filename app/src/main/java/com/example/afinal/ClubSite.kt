package com.example.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}