package com.example.bikeview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bikeview.Adapter.MyCustomAdapter;
import com.example.bikeview.model.bikeModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<bikeModel> bikeModdelList;
    RecyclerView recyclerView;
    MyCustomAdapter MyCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        bikeModdelList=new ArrayList<>();

        bikeModel c1 =new bikeModel("Royal en field",R.drawable.r15,200000);
        bikeModel c2 =new bikeModel("Royal en field2",R.drawable.r15,300000);
        bikeModel c3 =new bikeModel("Royal en field",R.drawable.r15,400000);
        bikeModel c4 =new bikeModel("Royal en field4",R.drawable.r15,200000);
        bikeModel c5 =new bikeModel("Royal en field4",R.drawable.r15,800000);
        bikeModel c6 =new bikeModel("Royal en field",R.drawable.r15,200000);
        bikeModel c7 =new bikeModel("Royal en field",R.drawable.r15,500000);
        bikeModel c8 =new bikeModel("Royal en field",R.drawable.r15,200000);
        bikeModel c9 =new bikeModel("Royal en field",R.drawable.r15,400000);
        bikeModel c10 =new bikeModel("Royal en field",R.drawable.r15,800000);
        bikeModel c11=new bikeModel("Royal en field",R.drawable.r15,500000);
        bikeModel c12 =new bikeModel("Royal en field",R.drawable.r15,700000);
        bikeModel c13 =new bikeModel("Royal en field",R.drawable.r15,800000);
        bikeModel c14 =new bikeModel("Royal en field",R.drawable.r15,900000);
        bikeModel c15 =new bikeModel("Royal en field",R.drawable.r15,500000);

        bikeModdelList.add(c1);
        bikeModdelList.add(c1);
        bikeModdelList.add(c2);
        bikeModdelList.add(c3);
        bikeModdelList.add(c11);
        bikeModdelList.add(c4);
        bikeModdelList.add(c5);
        bikeModdelList.add(c6);
        bikeModdelList.add(c7);
        bikeModdelList.add(c8);
        bikeModdelList.add(c9);
        bikeModdelList.add(c10);
        bikeModdelList.add(c14);
        bikeModdelList.add(c12);
        bikeModdelList.add(c13);
        bikeModdelList.add(c15);

        MyCustomAdapter = new MyCustomAdapter(bikeModdelList);

       recyclerView.setLayoutManager(new LinearLayoutManager(this));
       recyclerView.setAdapter(MyCustomAdapter);

    
    }
}