package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.cookies.R.drawable.after_cookie;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView cookieEatenImageView = (ImageView) findViewById(R.id.cookie_image_view);
        cookieEatenImageView.setImageResource(after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView cookieEatenTextView = (TextView) findViewById(R.id.before_eating_status_text_view);
        cookieEatenTextView.setText("More, Please?");

        Button refillButton = (Button) findViewById(R.id.button);
        refillButton.setText("Refill");
    }


}