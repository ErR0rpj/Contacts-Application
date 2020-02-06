package com.example.contacts;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TVcontact;
    Button BTNcontact;
    ImageView IVcall, IVsearch, IVlocation;
    final int resultfrom2 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTNcontact = findViewById(R.id.BTNcontact);
        TVcontact = findViewById(R.id.TVcontact);
        IVcall = findViewById(R.id.IVcall);
        IVsearch = findViewById(R.id.IVsearch);
        IVlocation = findViewById(R.id.IVlocation);

        IVcall.setVisibility(View.GONE);
        IVlocation.setVisibility(View.GONE);
        IVsearch.setVisibility(View.GONE);

        BTNcontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.contacts.Main2Activity.class);
                startActivityForResult(intent, resultfrom2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == resultfrom2) {
            if (resultCode == RESULT_OK) {
                IVlocation.setVisibility(View.VISIBLE);
                IVcall.setVisibility(View.VISIBLE);
                if (data.getIntExtra("pic", 0) == 1) {
                    IVsearch.setImageResource(R.drawable.poty);
                    IVsearch.setVisibility(View.VISIBLE);
                }
                else if (data.getIntExtra("pic", 0) == 2) {
                    IVsearch.setImageResource(R.drawable.kutta);
                    IVsearch.setVisibility(View.VISIBLE);
                }
                final String number= data.getStringExtra("number");
                final String address= data.getStringExtra("address");

                IVcall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                        startActivity(intent);
                    }
                });

                IVlocation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+address));
                        startActivity(intent);
                    }
                });
            }

            else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(MainActivity.this, "Bharo or kisi pe pic ko click kro", Toast.LENGTH_SHORT).show();
            }

        }
    }
}