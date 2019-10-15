package net.kathir.admobproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class IndustrailActivity extends AppCompatActivity {

    AdView adView;
    private InterstitialAd mInterstialad;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.industrial_view);

        adView = (AdView)findViewById(R.id.addView);

        MobileAds.initialize(this, "ca-app-pub-5740851151726677~7682389601");
        mInterstialad = new InterstitialAd(this);
        mInterstialad.setAdUnitId("ca-app-pub-5740851151726677/3562835712");
       // mInterstialad.loadAd(new AdRequest.Builder().build());

        mInterstialad.loadAd(new AdRequest.Builder().build());
        mInterstialad.setAdListener(new AdListener() {

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                Intent intent = new Intent(IndustrailActivity.this,MainActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                super.onAdFailedToLoad(errorCode);

            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                if (mInterstialad.isLoaded()) {
                    mInterstialad.show();
                }
            }

        });


    }
}
