package me.yuanye.taglife.target;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import android.app.ListActivity;
import android.app.TabActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import me.yuanye.taglife.MainActivity;
import me.yuanye.taglife.R;

public class TargetManagerActivity extends TabActivity  {
//
    private Toolbar toolbar;
    private TabHost tabHost;
    private ListView list1;
    private ListView list2;
    private Button addBtn;
    private Button infoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_manager_activity);
        init();
        list1=(ListView)findViewById(R.id.targetList);
        SimpleAdapter adp=new SimpleAdapter(this,getData(),R.layout.target_list,new String[]{"target_name","make_time","expect_time","finish_time"},new int[]{R.id.target_name,R.id.make_time,R.id.expect_time,R.id.finish_time});
        list1.setAdapter(adp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_target_manager, menu);
        return true;
    }

    private void init(){

        toolbar = (Toolbar)findViewById(R.id.target_manager_toolbar);
        toolbar.setTitle("目标");
        addBtn=(Button)findViewById(R.id.target_add);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(TargetManagerActivity.this, TargetManagerAddActivity.class);
                startActivity(intent);
            }
        });
        infoBtn=(Button)findViewById(R.id.info_btn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent();
                intent.setClass(TargetManagerActivity.this,TargetManagerAddActivity.class);
                startActivity(intent);
            }
        });
        tabHost = getTabHost();
        tabHost.addTab(tabHost.newTabSpec("finish").setIndicator("已完成").setContent(R.id.finish_layout));
        tabHost.addTab(tabHost.newTabSpec("unfinish").setIndicator("未完成").setContent(R.id.unfinish_layout));



    }

    private List<Map<String,Object>> getData(){
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("target_name","目标一");
        map.put("make_time","2017-3-26");
        map.put("expect_time","2017-3-26");
        map.put("finish_time","2017-3-26");
        list.add(map);

        map.put("target_name","目标二");
        map.put("make_time","2014-3-26");
        map.put("expect_time","2014-3-26");
        map.put("finish_time","2014-3-26");
        list.add(map);
        return list;
    }

}
