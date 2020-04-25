
package com.example.moviesurfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.moviesurfer.R;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private ImageButton enter;
    private CountDownTimer timer;
    private Timer timer2;
    private ProgressBar progbar;
    public int myInt;
    private int myInt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        timer = new CountDownTimer(6000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                myInt = ((int)millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity.this, Start.class);

                startActivity(intent);

            };


        };

        timer.start();




    }
}