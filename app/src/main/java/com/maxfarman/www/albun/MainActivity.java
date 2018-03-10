package com.maxfarman.www.albun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView im1,im2,im3,im4,im5,im6,im7,im8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
        im3=findViewById(R.id.im3);
        im4=findViewById(R.id.im4);
        im5=findViewById(R.id.im5);
        im6=findViewById(R.id.im6);
        im7=findViewById(R.id.im7);
        im8=findViewById(R.id.im8);

        String url="http://www.programadoresperuanos.com/test_app/imagenes";


        Picasso.get().load(url + "imagen1.jpg").fit().into(im1);
        Picasso.get().load(url + "imagen2.jpg").fit().into(im2);
        Picasso.get().load(url + "imagen3.jpg").fit().into(im3);
        Picasso.get().load(url + "imagen4.jpg").fit().into(im4);
        Picasso.get().load(url + "imagen5.jpg").fit().into(im5);
        Picasso.get().load(url + "imagen6.jpg").fit().into(im6);
        Picasso.get().load(url + "imagen7.jpg").fit().into(im7);
        Picasso.get().load(url + "imagen8.jpg").fit().into(im8);


    }
}
