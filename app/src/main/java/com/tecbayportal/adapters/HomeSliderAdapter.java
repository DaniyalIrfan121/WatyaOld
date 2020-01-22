package com.tecbayportal.adapters;

import com.tecbayportal.watya.R;

import ss.com.bannerslider.adapters.SliderAdapter;
import ss.com.bannerslider.viewholder.ImageSlideViewHolder;

public class HomeSliderAdapter extends SliderAdapter {

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public void onBindImageSlide(int position, ImageSlideViewHolder viewHolder) {
        switch (position) {
            case 0:
                viewHolder.bindImageSlide(R.drawable.img_slipper_banner);
                break;
            case 1:
                viewHolder.bindImageSlide(R.drawable.img_slipper_banner_two);
                break;
            case 2:
                viewHolder.bindImageSlide(R.drawable.img_slipper_banner_three);
                break;

            case 3:
                viewHolder.bindImageSlide(R.drawable.img_slipper_banner_four);
                break;
        }
    }
}