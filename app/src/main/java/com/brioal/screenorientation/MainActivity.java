package com.brioal.screenorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //TODO 添加Activity
    //TODo 另一篇博客 GridLayout填充的
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //1
    public void unspecified(View view) {
        startActivity(new Intent(MainActivity.this, unspecified.class));
    }

    //2
    public void landscape(View view) {
        startActivity(new Intent(MainActivity.this, landscape.class));

    }

    //3
    public void portrait(View view) {
        startActivity(new Intent(MainActivity.this, portrait.class));

    }

    //4
    public void user(View view) {
        startActivity(new Intent(MainActivity.this, user.class));

    }

    //5
    public void behind(View view) {
        startActivity(new Intent(MainActivity.this, behind.class));

    }

    //6
    public void sensor(View view) {
        startActivity(new Intent(MainActivity.this, sensor.class));

    }

    //7
    public void nosensor(View view) {
        startActivity(new Intent(MainActivity.this, nosensor.class));

    }

    //8
    public void sensorLandscape(View view) {
        startActivity(new Intent(MainActivity.this, sensorLandscape.class));

    }

    //9
    public void sensorPortrait(View view) {
        startActivity(new Intent(MainActivity.this, sensorPortrait.class));

    }

    //10
    public void reverseLandscape(View view) {
        startActivity(new Intent(MainActivity.this, reverseLandscape.class));

    }

    //11
    public void reversePortrait(View view) {
        startActivity(new Intent(MainActivity.this, reversePortrait.class));

    }

    //12
    public void fullSensor(View view) {
        startActivity(new Intent(MainActivity.this, fullSensor.class));

    }

    //13
    public void userLandscape(View view) {
        startActivity(new Intent(MainActivity.this, userLandscape.class));

    }

    //14
    public void userPortrait(View view) {
        startActivity(new Intent(MainActivity.this, userPortrait.class));

    }

    //15
    public void fullUser(View view) {
        startActivity(new Intent(MainActivity.this, fullUser.class));

    }

    //16
    public void locked(View view) {
        startActivity(new Intent(MainActivity.this, locked.class));
    }
}
