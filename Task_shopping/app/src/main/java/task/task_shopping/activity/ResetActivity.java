package task.task_shopping.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import task.task_shopping.R;

/**
 * Created by 201612221434 on 1/4/2017.
 */

public class ResetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);
//                startActivity(new Intent(ResetActivity.this,MainActivity.class));


            }
        });

    }


}