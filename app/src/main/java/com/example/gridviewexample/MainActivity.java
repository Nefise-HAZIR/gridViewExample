package com.example.gridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<String>text=new ArrayList<>();
    ArrayList<Integer>image=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.GridView);
        fillArray();
        GridAdapter adapter=new GridAdapter(this,text,image);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "you selected "+text.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void fillArray(){
        text.add("Bird");
        text.add("cat");
        text.add("chicken");
        text.add("dog");
        text.add("fish");
        text.add("monkey");
        text.add("rabbit");
        text.add("sheep");
        text.add("lion");

        image.add(R.drawable.bird);
        image.add(R.drawable.cat);
        image.add(R.drawable.chicken);
        image.add(R.drawable.dog);
        image.add(R.drawable.fish);
        image.add(R.drawable.monkey);
        image.add(R.drawable.rabbit);
        image.add(R.drawable.sheep);
        image.add(R.drawable.lion);


    }
}