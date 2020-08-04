package com.balkrishnashah.imagesliderdemo.slider;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.balkrishnashah.imagesliderdemo.R;
import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends SliderViewAdapter<SliderViewHolder> {


    Context mcontext;

//    List<ImageSliderModel> imageSliderModelList;

    public SliderAdapter(Context mcontext) { // add this parameter for drawable list from mainActivity List<ImageSliderModel> imageSliderModelList
        this.mcontext = mcontext;
//        this.imageSliderModelList = imageSliderModelList;

    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View slideView = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item_layout,parent, false);

        return new SliderViewHolder(slideView);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, int position) {
//        below line is for from drawable
//        viewHolder.msliderImageView.setImageResource(imageSliderModelList.get(position).getImage());
//        https://balkrishnashahportfolio.ml/images/code.png
        Uri uri0, uri1,uri2, uri3;
                uri0 = Uri.parse("https://www.elegantthemes.com/blog/wp-content/uploads/2018/04/Best-Code-and-Text-Editors.png");


        switch (position){
            case 0:
//                Picasso.get().load(uri0).into(viewHolder.msliderImageView);
//                Picasso.get().load("https://balkrishnashahportfolio.ml/images/repeat.jpg").into(viewHolder.msliderImageView);
                Glide.with(viewHolder.itemView).load("https://balkrishnashahportfolio.ml/images/repeat.jpg").into(viewHolder.msliderImageView);
                break;
            case 1:
//                Picasso.get().load("https://balkrishnashahportfolio.ml/images/code.png").into(viewHolder.msliderImageView);
                Glide.with(viewHolder.itemView).load("https://balkrishnashahportfolio.ml/images/code.png").into(viewHolder.msliderImageView);
                break;
            case 2:
//                Picasso.get().load("https://balkrishnashahportfolio.ml/images/sleep.png").into(viewHolder.msliderImageView);
                Glide.with(viewHolder.itemView).load("https://balkrishnashahportfolio.ml/images/sleep.png").into(viewHolder.msliderImageView);
                break;
            case 3:
//                Picasso.get().load("https://balkrishnashahportfolio.ml/images/eat.png").into(viewHolder.msliderImageView);
                Glide.with(viewHolder.itemView).load("https://balkrishnashahportfolio.ml/images/eat.png").into(viewHolder.msliderImageView);
                break;


        }


    }

    @Override
    public int getCount() {
        return 4;
    }
}
class SliderViewHolder extends SliderViewAdapter.ViewHolder{
    ImageView msliderImageView;
    View itemView;
    public SliderViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        msliderImageView = itemView.findViewById(R.id.sliderItemImageView_ID);
    }


}
