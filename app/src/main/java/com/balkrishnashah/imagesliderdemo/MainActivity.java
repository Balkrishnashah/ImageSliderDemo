package com.balkrishnashah.imagesliderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import com.balkrishnashah.imagesliderdemo.slider.ImageSliderModel;
import com.balkrishnashah.imagesliderdemo.slider.SliderAdapter;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    List<ImageSliderModel> imageSliderModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

        imageSliderModelList.add(new ImageSliderModel(R.drawable.road_safety));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.kids_on_bus));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.bus_safety));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.under_construction));
        sliderView.setSliderAdapter(new SliderAdapter(this, imageSliderModelList));
    }
}