package com.test.it.arcmenu;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    ArcMenu arcMenuAndroid;
    FloatingActionButton feb1;
    FloatingActionButton feb2;
    FloatingActionButton feb3;
    FloatingActionButton feb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arcMenuAndroid = (ArcMenu) findViewById(R.id.arcmenu_android_example_layout);
        arcMenuAndroid.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {
                //TODO something when menu is opened
                Context context = getApplicationContext();
                CharSequence text = "เปิดเมนู!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,text,duration);
                toast.show();
            }
            @Override
            public void onMenuClosed() {
                //TODO something when menu is closed
            }
        });

        feb1 = (FloatingActionButton) findViewById(R.id.fab_arc_menu_1);
        feb2 = (FloatingActionButton) findViewById(R.id.fab_arc_menu_2);
        feb3 = (FloatingActionButton) findViewById(R.id.fab_arc_menu_3);
        feb4 = (FloatingActionButton) findViewById(R.id.fab_arc_menu_4);


        feb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"OK Tested",Toast.LENGTH_LONG).show();

            }
        });

        feb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"OK Tested",Toast.LENGTH_LONG).show();

            }
        });

        feb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"OK Tested",Toast.LENGTH_LONG).show();

            }
        });

        feb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"OK Tested",Toast.LENGTH_LONG).show();

            }
        });

    }
}
