package task.task_shopping.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import task.task_shopping.R;

/**
 * Created by 201612221434 on 1/15/2017.
 */

// Test Comment


public class ProfileActivity extends AppCompatActivity {

    LinearLayout lyContainer;

    String[] strCell1 = {"NICKNAME", "FIRSTNAME", "SURNAME", "EMAIL ADDRESS", "PASSWORD", "COMPANY"};
    String[] strCell2 = {"(Optional)","","","","","(Optional)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
 //               startActivity(new Intent(ProfileActivity.this,MainActivity.class));


            }
        });
        lyContainer = (LinearLayout)findViewById(R.id.lyContainer);
        presentData();
        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
                //               startActivity(new Intent(ProfileActivity.this,MainActivity.class));


            }
        });
    }

    void presentData() {
        for(int i = 0; i < strCell1.length; i ++) {



            LayoutInflater inflater = LayoutInflater.from(this);
            View viewResult = inflater.inflate(R.layout.profile_list, null);


            TextView option = (TextView)viewResult.findViewById(R.id.textView4);
            EditText optional = (EditText) viewResult.findViewById(R.id.editText3);


            option.setText(strCell1[i]);
            optional.setText(strCell2[i]);
            if (i==5) {
                viewResult.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(ProfileActivity.this, Select_Country.class);

                        startActivity(i);
                    }
                });
            }



            lyContainer.addView(viewResult);




        }
    }





}
