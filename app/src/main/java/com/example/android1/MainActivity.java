package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btInvisible,btToast;
    ImageView firstImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btInvisible= (Button)findViewById(R.id.button_visibilitychanger);
        btToast=(Button) findViewById(R.id.button_toast);
        WebView web1 = (WebView)findViewById(R.id.web1);
//        ImageView im = (ImageView)findViewById(R.id.imageView3);
//        int imgRes = getResources().getIdentifier("@drawables/download",null,this.getPackageName());
//        im.setImageResource(imgRes);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("https://www.coursera.org/");
    }
    public void toDo(View v)
    {
        if(v.equals(btInvisible)&& v.getVisibility()==View.VISIBLE) {
            v.setVisibility(View.INVISIBLE);
        }

        if(v.equals(btToast)) //pop up toast
            Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_LONG).show();
    }
}