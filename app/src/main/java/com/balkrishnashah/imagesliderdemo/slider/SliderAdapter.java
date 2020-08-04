package com.balkrishnashah.imagesliderdemo.slider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.balkrishnashah.imagesliderdemo.R;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderViewHolder> {


    Context mcontext;
    List<ImageSliderModel> imageSliderModelList;

    public SliderAdapter(Context mcontext, List<ImageSliderModel> imageSliderModelList) {
        this.mcontext = mcontext;
        this.imageSliderModelList = imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View slideView = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_layout,parent, false);

        return new SliderViewHolder(slideView);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {

        viewHolder.msliderImageView.setImageResource(imageSliderModelList.get(position).getImage());

    }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }
}
class SliderViewHolder extends SliderViewAdapter.ViewHolder{
    ImageView msliderImageView;

    public SliderViewHolder(View itemView) {
        super(itemView);
        msliderImageView = itemView.findViewById(R.id.sliderItemImageView_ID);
    }


}
