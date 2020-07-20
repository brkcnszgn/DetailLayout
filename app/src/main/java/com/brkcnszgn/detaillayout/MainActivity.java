package com.brkcnszgn.detaillayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.brkcnszgn.detail_layout.DetailFabLayout;

public class MainActivity extends AppCompatActivity {
    private DetailFabLayout layout;
    private View one, two, three, four;
    private ListView list;
    private View fab;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (DetailFabLayout) findViewById(R.id.fabtoolbar);
        fab = findViewById(R.id.fabtoolbar_fab);
        relativeLayout = findViewById(R.id.layoutRoot);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.isToolbar()){
                    layout.hide();
                }
            }
        });
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.show();
            }
        });

    }
    @Override
    public void onBackPressed() {
        layout.hide();
    }
}






