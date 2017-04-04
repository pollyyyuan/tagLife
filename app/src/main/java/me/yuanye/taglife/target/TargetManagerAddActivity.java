package me.yuanye.taglife.target;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import me.yuanye.taglife.R;

public class TargetManagerAddActivity extends AppCompatActivity {

    private Button createGoalButton;

    private EditText goalNameEdit;

    private TextView makeDateTextView;

    private EditText finishDateEdit;

    private EditText goalContent;

    private EditText goalPlan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.target_manager_add_activity);
        initGoalView();
        createGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        finishDateEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(TargetManagerAddActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                Log.d("日期选择", i + " " + i1 + "  " + i2);
                                finishDateEdit.setText(i + "-" + (i1 + 1) + "-" + i2);
                            }
                        }, year, month, day);
                datePickerDialog.show();

            }
        });

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        makeDateTextView.setText(dateFormat.format(new Date()));
    }

    private void initGoalView() {
        goalNameEdit = (EditText) findViewById(R.id.goal_name_edit);
        makeDateTextView = (TextView) findViewById(R.id.make_date_tv);
        finishDateEdit = (EditText) findViewById(R.id.finish_date_edit);
        goalContent = (EditText) findViewById(R.id.goal_content);
        goalPlan = (EditText) findViewById(R.id.goal_plan);
        createGoalButton = (Button) findViewById(R.id.create_goal);
    }
}
