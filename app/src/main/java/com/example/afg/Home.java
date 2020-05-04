package com.example.afg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ShowableListMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

    }
    public void openActivityGraphz(View v) {
        openActivityGraphs();
    }
    public void openActivityGraphs() {
        Intent intent = new Intent(this, Graphs.class);
        startActivity(intent);
    }


    public void openActivityGoalz(View v) {
        openActivityGoals();
    }
    public void openActivityGoals() {
        Intent intent = new Intent(this, Goals.class);
        startActivity(intent);
    }


    public void openActivitySettingz(View v) {
        openActivitySettings();
    }
    public void openActivitySettings() {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openActivityHomie(View v) {
        openActivityHome();
    }
    public void openActivityHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


}
