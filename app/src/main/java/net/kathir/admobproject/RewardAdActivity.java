package net.kathir.admobproject;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class RewardAdActivity extends AppCompatActivity implements RewardedVideoAdListener {

    private static final String TAG = RewardAdActivity.class.getSimpleName();

    RewardedVideoAd mAd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reward_view);

        rewardAds();




    }

    private void rewardAds() {
        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
    }

    private void loadRewardedVideoAd() {
        mAd.loadAd("ca-app-pub-5740851151726677/9163836129",//use this id for testing
                new AdRequest.Builder().build());

    }




        @Override
        public void onRewardedVideoAdLoaded () {

            Log.i(TAG, "Rewarded: onRewardedVideoAdLoaded");
            try {
                if (mAd.isLoaded()) {
                    mAd.show();
                }
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }



        @Override
        public void onRewardedVideoAdOpened () {

        }

        @Override
        public void onRewardedVideoStarted () {

        }

        @Override
        public void onRewardedVideoAdClosed () {

        }

        @Override
        public void onRewarded (RewardItem rewardItem){

        }

        @Override
        public void onRewardedVideoAdLeftApplication () {

        }

        @Override
        public void onRewardedVideoAdFailedToLoad ( int i){

        }

        @Override
        public void onRewardedVideoCompleted () {


        }

    }
