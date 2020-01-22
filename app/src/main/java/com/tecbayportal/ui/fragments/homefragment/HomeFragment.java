package com.tecbayportal.ui.fragments.homefragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tecbayportal.data.model.Row;
import com.tecbayportal.adapters.HomeSliderAdapter;
import com.tecbayportal.adapters.StaggeredRecyclerAdapter;
import com.tecbayportal.watya.R;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.Slider;

public class HomeFragment extends Fragment {

    private HomeViewModel mViewModel;

    private View mView;

    private TextView mtv_Headline;
    private RecyclerView mHome_RecyclerView;

    private StaggeredRecyclerAdapter adapter ;
    private StaggeredGridLayoutManager manager;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.home_fragment_new, container, false);

        initialising();


        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mHome_RecyclerView.setLayoutManager(manager);
        // lets create a simple array list of images
        List<Row> lst = new ArrayList<>();
        lst.add(new Row(R.drawable.illustrationtwo));
        lst.add(new Row(R.drawable.clothes));
        lst.add(new Row(R.drawable.illustration));
        lst.add(new Row(R.drawable.clothes));
        lst.add(new Row(R.drawable.paint2));
        lst.add(new Row(R.drawable.paint));
        lst.add(new Row(R.drawable.clothestwo));
        lst.add(new Row(R.drawable.wallpaper));
        lst.add(new Row(R.drawable.illustrationtwo));
        lst.add(new Row(R.drawable.illustration));
        lst.add(new Row(R.drawable.clothes));
        lst.add(new Row(R.drawable.paint2));
        lst.add(new Row(R.drawable.paint));
        lst.add(new Row(R.drawable.clothestwo));
        lst.add(new Row(R.drawable.wallpaper));
        lst.add(new Row(R.drawable.clothes));





        adapter = new StaggeredRecyclerAdapter(getContext(),lst);
        mHome_RecyclerView.setAdapter(adapter);

        return mView;
    }

    private void initialising() {

      //  mtv_Headline = mView.findViewById(R.id.textView);

        Slider slider = mView.findViewById(R.id.header_image);
        slider.setAdapter(new HomeSliderAdapter());

        mHome_RecyclerView = mView.findViewById(R.id.recycler_Category);

      //  mtv_Headline.setText("daniyal irfan");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }

}
