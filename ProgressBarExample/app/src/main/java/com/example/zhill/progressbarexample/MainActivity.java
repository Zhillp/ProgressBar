package com.example.zhill.progressbarexample;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar indeterminatebar = (ProgressBar) findViewById(R.id.indeterminate);
        final ProgressBar determinatebar = (ProgressBar) findViewById(R.id.determinate);

        Button startindeterminate = (Button) findViewById(R.id.indeterminateprogress);
        Button startdeterminate = (Button) findViewById(R.id.determinateprogress);
        Button stopindeterminate = (Button) findViewById(R.id.stop);

        indeterminatebar.setVisibility(View.INVISIBLE);

        startindeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indeterminatebar.setVisibility(View.VISIBLE);
            }
        });


        stopindeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 indeterminatebar.setVisibility(View.GONE);
            }
        });

        startdeterminate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                determinatebar.setProgress(progress);
                determinatebar.incrementProgressBy(50);
            }
        });
    }


}
