package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(), view);
                popupMenu.inflate(R.menu.menumain);
                popupMenu.show();
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.item1:
                                Toast.makeText(MainActivity.this, "Selected" + menuItem.toString(), Toast.LENGTH_SHORT).show();
                            case R.id.item2:
                                Toast.makeText(MainActivity.this, "Selected" + menuItem.toString(), Toast.LENGTH_SHORT).show();
                            case R.id.item3:
                                Toast.makeText(MainActivity.this, "Selected" + menuItem.toString(), Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
            }
        });
    }
}