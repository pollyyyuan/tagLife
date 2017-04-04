package me.yuanye.taglife.target;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import me.yuanye.taglife.R;

public class TargetManagerActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_manager_activity);
        toolbar = (Toolbar)findViewById(R.id.target_manager_toolbar);
        toolbar.setTitle("目标");
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.target_manager_add:
                        Intent intent = new Intent();
                        intent.setClass(TargetManagerActivity.this, TargetManagerAddActivity.class);
                        startActivity(intent);
                        return true;
                    default:
                        return true;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_target_manager, menu);
        return true;
    }
}
