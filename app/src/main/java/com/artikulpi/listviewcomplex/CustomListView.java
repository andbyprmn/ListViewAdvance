package com.artikulpi.listviewcomplex;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by andhikabayupermana on 1/5/15.
 */
public class CustomListView extends ArrayAdapter<String> {
    //Declarasi
    private final Activity context;
    private final String[] web;
    private final String[] isi;
    private final Integer[] imageId;

    public CustomListView(Activity context,String[] web, Integer[] imageId) {
        super(context, R.layout.list_single_data, web);
        this.context = context;
        this.web = web;
        this.isi = isi;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        //Load Custom Layout untuk list
        View rowView= inflater.inflate(R.layout.list_single_data, null, true);
        //Declarasi komponen
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txtList);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.txtList1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgIcon);

        //Set Parameter Value
        txtTitle.setText(web[position]);
        txtTitle1.setText(isi[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}
