package net.kathir.admobproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BannerActivity extends AppCompatActivity {

    AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize Mobile SDK Ads
        MobileAds.initialize(BannerActivity.this,"ca-app-pub-5740851151726677~7682389601");

        mAdView = (AdView)findViewById(R.id.addView);


        AdRequest adRequest = new AdRequest.Builder().addTestDevice("EC96221798770126B0345B81CABCD712").build();
        //Display the banner ad
        mAdView.loadAd(adRequest);


    }
}
