package com.example.student.f21;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Dresses extends Activity{
    String[] main_menu = {
            "Textured A-Line Dress",
           /* "Velveteen Shift Dress",
            "Rose Print Cutout-Back Dress",*/
    };

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dresses);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView2);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position){

                    case 0:
                        Intent goToTextured = new Intent(Dresses.this, Textured.class);
                        startActivity(goToTextured);
                        break;

                   /* case 1:
                        Intent goToVelveteen = new Intent(Dresses.this,Velveteen.class);
                        startActivity(goToVelveteen);
                        break;

                    case 2:
                        Intent goToRose = new Intent(Dresses.this,Rose.class);
                        startActivity(goToRose);
                        break;*/

                }
            }
        });
    }
}
