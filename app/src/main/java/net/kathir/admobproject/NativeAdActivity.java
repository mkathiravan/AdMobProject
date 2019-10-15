package net.kathir.admobproject;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;

import com.google.android.gms.ads.NativeExpressAdView;

public class NativeAdActivity extends AppCompatActivity {

    private static final String TAG = NativeAdActivity.class.getSimpleName();

    NativeExpressAdView nativeExpressAdView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.native_adview);



        nativeExpressAdView = (NativeExpressAdView) findViewById(R.id.native_expressView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("DC790CCE3B34C5B86098A9489B57AD6A")
                .build();
        nativeExpressAdView.loadAd(adRequest);


    }

}
