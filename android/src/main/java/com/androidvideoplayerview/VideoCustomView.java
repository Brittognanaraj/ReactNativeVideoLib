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
        this.updateWebview();
    }

    private void updateWebview() {
        WebView webView=findViewById(R.id.webview);
        webView.loadUrl(this.url);

    }

    private void init() {
        View layoutInflate = inflate(myContext, R.layout.generator_layout, this);
          WebView webView=layoutInflate.findViewById(R.id.webview);
        webView.loadUrl("https://prdcusswlapisa.blob.core.windows.net/video/video_welcome_organic(1080p).mp4");
    }
}
