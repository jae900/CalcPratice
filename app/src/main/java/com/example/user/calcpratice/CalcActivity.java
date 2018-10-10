package com.example.user.calcpratice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {
    TextView val1, val2, val3 ,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.calc);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        init();

    }

    private void init(){
        val1 = findViewById(R.id.value1);
        val2 = findViewById(R.id.value2);
        val3 = findViewById(R.id.value3);
        op = findViewById(R.id.operator);
    }


    public void clkBtn(View v){
        if(val3.getText().toString().equals("")){
            TextView target = null;
            if(v instanceof Button){
                if(op.getText().equals("")){
                    target = val1;
                } else{
                    target = val2;
                }
                Button btn = (Button) v;
                String input = btn.getText().toString();
                String output = target.getText().toString();
                output += input;
                target.setText(output);
            }
        }
    }

    public void operator(View v){
        if(val3.getText().toString().equals("")) {
            Button btn = (Button) v;
            String opt = btn.getText().toString();
            op.setText(opt);
        }
    }

    public void clear(View v){
        val1.setText("");
        val2.setText("");
        val3.setText("");
        op.setText("");
    }


    public void equals(View v){
        String oprt = op.getText().toString();
        String result = "";

        if(val1.getText().toString().equals("")||val2.getText().toString().equals("")||oprt.equals("")){
            result = "incomplete";
        } else{
            int first = Integer.parseInt(val1.getText().toString());
            int second = Integer.parseInt(val2.getText().toString());

            switch(oprt){
                case "+":
                    result = (first+second)+"";
                    break;
                case "-":
                    result = (first-second)+"";
                    break;
                case "*":
                    result = (first*second)+"";
                    break;
                case "/":
                    if(second==0){
                        result = "div 0";
                    } else{
                        result = ((double)first/second)+"";
                        break;
                    }
            }
        }
        val3.setText(result);
    }
}
