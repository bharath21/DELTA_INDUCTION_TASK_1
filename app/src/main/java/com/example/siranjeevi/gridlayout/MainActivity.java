package com.example.siranjeevi.gridlayout;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
int counter=0; // counts from 0
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   final Button sirabut = (Button)findViewById(R.id.sirabutton);


        sirabut.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {

                          // event during sirabutton press.
                     counter+=1; //increases by 1 .
                     TextView   siratext = (TextView)findViewById(R.id.siratext); //associating textview object with widget id
                     siratext.setText(""+counter); // changing content of text view.

                    }
                }


        );

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
