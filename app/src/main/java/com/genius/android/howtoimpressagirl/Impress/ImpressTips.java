package com.genius.android.howtoimpressagirl.Impress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.genius.android.howtoimpressagirl.R;

public class ImpressTips extends AppCompatActivity {
  WebView Details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impress_tips);
        Details=(WebView)findViewById(R.id.Details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebSettings webSetting = Details.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);
        //Details.setBackgroundResource(R.drawable.img);
        //Details.setBackgroundColor(0x00000000);
        Details.setWebViewClient(new ImpressTips.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0)
        {

            Details.loadUrl("file:///android_asset/chat.html");
        }
        else if (position == 1)
        {
            Details.loadUrl("file:///android_asset/date.html");
        }
        else if (position == 2) {
            Details.loadUrl("file:///android_asset/easy.html");
        }
        else if (position == 3) {
            Details.loadUrl("file:///android_asset/indian.html");
        }
        else if (position == 4) {
            Details.loadUrl("file:///android_asset/words.html");

        }
        else if (position == 5)
        {
            Details.loadUrl("file:///android_asset/question.html");
        }

        else if (position == 6)
        {
            Details.loadUrl("file:///android_asset/love.html");
        }


    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:


                this.finish();
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }

}




