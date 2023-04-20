package com.androidvideoplayerview;


import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.react.uimanager.ThemedReactContext;

public class VideoCustomView extends LinearLayout {
    ThemedReactContext myContext;
    String url = "";

    public VideoCustomView(ThemedReactContext context) {
        super(context);
        this.myContext = context;
        init();
    }

    public void setSourceUrl(String videoUrl) {
        this.url = videoUrl;
        this.updateRandomNumberLabel();
    }

    private void updateRandomNumberLabel() {
        WebView webView=findViewById(R.id.webview);
        webView.loadUrl("https://prdcusswlapisa.blob.core.windows.net/video/video_welcome_organic(1080p).mp4");
//        TextView randomNumberLabel = findViewById(R.id.randomNumber);
//        randomNumberLabel.setText("" + this.number);
    }

    private void init() {
        View layoutInflate = inflate(myContext, R.layout.generator_layout, this);
//        Button randomNumberButton=layoutInflate.findViewById(R.id.randomButton);
//        randomNumberButton.setOnClickListener {
//            this.number=(0 until 100).shuffled().last()
//            this.updateRandomNumberLabel()
//        }
    }
}