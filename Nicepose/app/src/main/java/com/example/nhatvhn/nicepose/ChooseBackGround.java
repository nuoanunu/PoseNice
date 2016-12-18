package com.example.nhatvhn.nicepose;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.nhatvhn.nicepose.Class.CustomList;

import java.util.ArrayList;
import java.util.Arrays;

public class ChooseBackGround extends AppCompatActivity {
    private ListView mainListView ;
    private ArrayAdapter<Image> listAdapter ;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_choose_back_ground);

        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );

        // Create and populate a List of planet names.
        String[] web = {
                "Google Plus",
                "Twitter",
                "Windows",
                "Bing"
        } ;
        final Integer[] imageId = {
                R.drawable.hinhde,
                R.drawable.hinhoverlau,
                R.drawable.mompose2,
                R.drawable.manpose
        };
        CustomList adapter = new
                CustomList(this, web, imageId);

        mainListView.setAdapter(adapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent data = new Intent();

                data.setData(Uri.parse(imageId[position]+""));
                setResult(RESULT_OK, data);
                finish();

            }
        });

        // Set the ArrayAdapter as the ListView's adapter.

    }
}
