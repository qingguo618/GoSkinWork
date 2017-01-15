package task.task_shopping.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import task.task_shopping.R;
import task.task_shopping.utils.Common;

// test comment

public class MainActivity extends AppCompatActivity {

    private EditText text;
    private EditText password;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = (EditText) findViewById(R.id.editText3);
                password = (EditText) findViewById(R.id.editText4);
//                if (text.getText().length() == 0 || password.getText().length() == 0) {                 //email or password is checking
                    openDialog();
//                    text.setError("This field can not be blank");
////                    Toast.makeText(MainActivity.this,text.getText(), Toast.LENGTH_LONG).show();
//                }
            }

        });

        findViewById(R.id.sign_up).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ProfileActivity.class));


            }
        });
        findViewById(R.id.forget_button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,ResetActivity.class));
                overridePendingTransition(R.anim.abc_slide_in_bottom, R.anim.abc_slide_out_bottom);

            }
        });
        findViewById(R.id.passbutton).setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View v) {
                Common.getInstance().hideProgressDialog();
                finish();
            }
        });


    //coutom font setting

//        TextView tx1 = (TextView)findViewById(R.id.textView1);
//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/NeologyDeco-Light.otf");
//        tx1.setTypeface(custom_font);
    }

    private void openDialog(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        if (text.getText().length() == 0 || password.getText().length() == 0) {
            dialog.setTitle("Warring..").setMessage("Email or Password is black..Please enter key..");
            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //When OK button is clicked, an int with value of 1 will be saved in sharedPreferences.

                    text.setFocusable(true);
                }
            });
            dialog.show();
        }else {
 //           dialog.setIcon(R.mipmap.loadingcream);
 //           AlertDialog.Builder builder = new AlertDialog.Builder(this );
 //           builder.setIcon(getResources().getDrawable(R.mipmap.loadingcream));
 //           dialog.setMessage("loading...");
//            dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    //When OK button is clicked, an int with value of 1 will be saved in sharedPreferences.
//
//                    text.setFocusable(true);
//                }
//            });
//            final Dialog dialog1 = new Dialog(context);
//            dialog1.setContentView(R.layout.activity_dialog);
//            dialog1.setTitle("Title...");
//
//            Button dialogButton = (Button) dialog1.findViewById(R.id.passbutton);
//            // if button is clicked, close the custom dialog
//            dialogButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    dialog1.dismiss();
//                }
//            });
//            dialog1.show();

            Common.getInstance().showProgressDialog(MainActivity.this, "Authenticating...");


        }


    }


}
