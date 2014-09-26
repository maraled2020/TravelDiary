package com.khodadadi.delaram.traveldiary;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by deli on 9/26/2014.
 */
public class MainActivity extends Activity {

    private TextView animatedTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animatedTextView = (TextView) findViewById(R.id.animatedTextView);
        final RotateAnimation rotateAnimation = new RotateAnimation(0, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setRepeatCount(1);
        rotateAnimation.setDuration(1000);
        Button button = (Button) findViewById(R.id.testButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animatedTextView.clearAnimation();
                animatedTextView.setAnimation(rotateAnimation);
            }

        });
    }
}
