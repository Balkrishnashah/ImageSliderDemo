package com.balkrishnashah.imagesliderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.balkrishnashah.imagesliderdemo.slider.ImageSliderModel;
import com.balkrishnashah.imagesliderdemo.slider.SliderAdapter;
import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
//    List<ImageSliderModel> imageSliderModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
//        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);

//        imageSliderModelList.add(new ImageSliderModel(R.drawable.eat));
//        imageSliderModelList.add(new ImageSliderModel(R.drawable.sleep));
//        imageSliderModelList.add(new ImageSliderModel(R.drawable.code));
//        imageSliderModelList.add(new ImageSliderModel(R.drawable.repeat));

        sliderView.setSliderAdapter(new SliderAdapter(this));  // pass this for above list images "imageSliderModelList"
    }
}