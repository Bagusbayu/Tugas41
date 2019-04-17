package com.example.tugas41;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class about extends AppCompatActivity {
protected Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmenu();
            }
        });
    }
    public void openmenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){ Intent intent = new Intent(this,about.class);
            startActivity(intent);
            //Toast toast = Toast.makeText(this, "Anda Pilih Menu About" , Toast.LENGTH_SHORT);
            //toast.show();
        } else  if (item.getItemId() == R.id.help) {Intent intent = new Intent(this, help.class);
            startActivity(intent);
            Toast toast = Toast.makeText(this, "Anda Pilih Menu Help" , Toast.LENGTH_LONG);
            toast.show();
        } return true;
    }
}
