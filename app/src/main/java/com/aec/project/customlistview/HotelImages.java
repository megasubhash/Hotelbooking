package com.aec.project.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HotelImages extends AppCompatActivity {

    ImageView img1,img2,img3,img4,img5;
    private boolean zoomOut =  false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_images);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoomOut) {
                    //Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600);
                    lp.setMargins(0, 0, 0, 10);
                    img1.setLayoutParams(lp);
                    img1.setAdjustViewBounds(true);
                    img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    //img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    zoomOut =false;
                }else{
                    Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
                    img1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                    img1.setScaleType(ImageView.ScaleType.FIT_XY);
                    zoomOut = true;
                }
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoomOut) {
                    //Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600);
                    lp.setMargins(0, 0, 0, 10);
                    img2.setLayoutParams(lp);
                    img2.setAdjustViewBounds(true);
                    img2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    //img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    zoomOut =false;
                }else{
                    Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
                    img2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                    img2.setScaleType(ImageView.ScaleType.FIT_XY);
                    zoomOut = true;
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoomOut) {
                    Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600);
                    lp.setMargins(0, 0, 0, 10);
                    img3.setLayoutParams(lp);
                    img3.setAdjustViewBounds(true);
                    img3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    //img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    zoomOut =false;
                }else{
                    Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
                    img3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                    img3.setScaleType(ImageView.ScaleType.FIT_XY);
                    zoomOut = true;
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoomOut) {
                    Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600);
                    lp.setMargins(0, 0, 0, 10);
                    img4.setLayoutParams(lp);
                    img4.setAdjustViewBounds(true);
                    img4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    //img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    zoomOut =false;
                }else{
                    Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
                    img4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                    img4.setScaleType(ImageView.ScaleType.FIT_XY);
                    zoomOut = true;
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zoomOut) {
                    Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 600);
                    lp.setMargins(0, 0, 0, 10);
                    img5.setLayoutParams(lp);
                    img5.setAdjustViewBounds(true);
                    img5.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    //img1.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    zoomOut =false;
                }else{
                    Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
                    img5.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                    img5.setScaleType(ImageView.ScaleType.FIT_XY);
                    zoomOut = true;
                }
            }
        });

    }

}
