package com.example.hp.terrofinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity {

    private Button myUpload;

    protected static final int CAMERA_REQUEST = 0;
    protected static final int GALLERY_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        myUpload =(Button)findViewById(R.id.upload);

        myUpload.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                
                Intent pictureActionIntent = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(
                        pictureActionIntent,
                        GALLERY_PICTURE);
            }
        });
    }
}
