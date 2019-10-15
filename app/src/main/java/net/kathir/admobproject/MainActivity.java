package net.kathir.admobproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton bannerView,industrialView,nativeadView,rewardAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bannerView = (MaterialButton) findViewById(R.id.banner_adview);
        industrialView = (MaterialButton)findViewById(R.id.industrial_adview);
        nativeadView = (MaterialButton)findViewById(R.id.native_adview);
        rewardAdView = (MaterialButton)findViewById(R.id.reward_adview);


        bannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BannerActivity.class);
                startActivity(intent);
            }
        });

        industrialView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,IndustrailActivity.class);
                startActivity(intent);
            }
        });

        nativeadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,NativeAdActivity.class);
                startActivity(intent);

            }
        });

        rewardAdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,RewardAdActivity.class);
                startActivity(intent);


            }
        });

    }
}
