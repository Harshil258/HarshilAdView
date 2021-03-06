package com.Harshil.customadview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.harshil.customadview.CustomAdview
import com.harshil.customadview.CustomNativeAdview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var customadview: CustomAdview = findViewById(R.id.customadview)
        var fbbanner = "IMG_16_9_APP_INSTALL#YOUR_PLACEMENT_ID"
        var appnextbanner = "fsdsfzsfhgf"
        var maxbanner = "56304bd252a6996a"
        var googlebanner = "ca-app-pub-3940256099942544/6300978111"
        var googleinterstitial: String = "ca-app-pub-3940256099942544/1033173712"

//        customadview.showCustomBanner(true, fbbanner, maxbanner, appnextbanner, googlebanner)

//        customadview.showInterstitial(true,this,"adfgsadg","ca-app-pub-3940256099942544/1033173712")

//        AppLovinSdk.getInstance(this).showMediationDebugger()
//
//        var customInterstitial: CustomInterstitial =
//            CustomInterstitial(1)
//
//        customInterstitial.showInterstitial(
//            true,
//            this,
//            "sdgsdgsdgsdg",
//            googleinterstitial
//        )

        var customnativead: CustomNativeAdview =
            findViewById<CustomNativeAdview>(R.id.customnativead)
        customnativead.showCustomNative(
            this,
            false,
            "sdrtyjdyjdyjk",
            "98ccfa1dbd2cee76",
            fbbanner,
            maxbanner,
            appnextbanner,
            "ca-app-pub-3940256099942544/2247696110",
            googlebanner,
            1,
            100
        )

    }
}