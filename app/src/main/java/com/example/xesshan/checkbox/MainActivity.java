package com.example.xesshan.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button button_sbm;
    private static CheckBox check1,check2,check3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }
    public  void addListnerOnButton(){
        check1=(CheckBox)findViewById(R.id.checkBox_mobile);
        check2=(CheckBox)findViewById(R.id.checkBox_compter);
        check3=(CheckBox)findViewById(R.id.checkBox_laptop);
        button_sbm=(Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        StringBuffer result = new StringBuffer();
                        result.append("Mobile :").append(check1.isChecked());
                        result.append("Computer :").append(check2.isChecked());
                        result.append("LAptop :").append(check3.isChecked());
                        Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
