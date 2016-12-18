package com.example.nhatvhn.nicepose.Class;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nhatvhn.nicepose.ChooseBackGround;
import com.example.nhatvhn.nicepose.R;

/**
 * Created by NhatVHN on 12/18/2016.
 */

public class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.activity_choose_back_ground, web);
        this.context = context;
        this.web = web;
        Log.d("KAKAKKA", "??? " + imageId.length);
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Log.d("KAKAKKA", "???  getview khi nao nhi  " + position);
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.simplerow, null, true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imagelist);


        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
