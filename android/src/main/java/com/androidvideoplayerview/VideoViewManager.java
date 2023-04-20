package com.androidvideoplayerview;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class VideoViewManager extends SimpleViewManager<VideoCustomView> {

     @ReactProp(name = "sourceUrl")
    public void setSourceUrlProp(VideoCustomView view, String sourceUrl) {
        view.setSourceUrl(sourceUrl);
    }

    @NonNull
    @Override
    public String getName() {
        return "VideoView";
    }

    @NonNull
    @Override
    protected VideoCustomView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new VideoCustomView(themedReactContext);
    }
}
