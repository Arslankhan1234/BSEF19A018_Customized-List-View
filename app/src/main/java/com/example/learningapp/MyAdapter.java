package com.example.learningapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter {

    private final Activity context;
    private  final  String []heading;
    private  final  int [] images;

    public MyAdapter(Activity context,String[] heading,int []images){
        super(context,R.layout.activity_result,heading);

        this.context=context;
        this.heading=heading;
        this.images=images;
    }

    public View getView(int position, View view, ViewGroup parent){

        LayoutInflater inflater=context.getLayoutInflater();
        View Single=inflater.inflate(R.layout.activity_result,null,true);
        TextView v=Single.findViewById(R.id.textView);
        ImageView img=Single.findViewById(R.id.imageview);
        v.setText(heading[position]);
        img.setImageResource(images[position]);
        return Single;
}
