package com.tecbayportal;

import android.app.Application;

import com.tecbayportal.adapters.PicassoImageLoadingService;

import ss.com.bannerslider.Slider;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Slider.init(new PicassoImageLoadingService(this));
    }
}
