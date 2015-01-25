package com.example.xiaobozhang.ari;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends ActionBarActivity implements View.OnClickListener {

    Button goTutorialBtn, goAboutusBtn, goSettingBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        goTutorialBtn = (Button) findViewById(R.id.button_tutorial);
        goTutorialBtn.setOnClickListener(this);

        goAboutusBtn = (Button) findViewById(R.id.button_aboutus);
        goAboutusBtn.setOnClickListener(this);

        goSettingBtn = (Button) findViewById(R.id.button_goSetting);
        goSettingBtn.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void buttonClick1() {

        startActivity(new Intent("android.intent.action.Tutorial"));
    }
    private void buttonClick2() {

        startActivity(new Intent("android.intent.action.AboutusActivity"));
    }
    private void buttonClick3() {

        startActivity(new Intent("android.intent.action.setting"));
    }
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.button_tutorial:
                buttonClick1();
                break;
            case R.id.button_aboutus:
                buttonClick2();
                break;
            case R.id.button_goSetting:
                buttonClick3();
                break;
        }

    }
}
