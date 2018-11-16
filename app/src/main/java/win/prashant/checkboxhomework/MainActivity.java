package win.prashant.checkboxhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

CheckBox ch1,ch2,ch3,ch4,ch5,ch6;

Button btn;
TextView textView1,textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1= findViewById(R.id.checkBoxElectronic);
        ch2=findViewById(R.id.checkBoxMobile);
        ch3=findViewById(R.id.checkBoxLaptop);
        ch4=findViewById(R.id.checkBoxFashion);
        ch5=findViewById(R.id.checkBoxMen);
        ch6=findViewById(R.id.checkBoxWomen);
        btn=findViewById(R.id.buttonTotalamount);
        textView1=findViewById(R.id.textViewMobile);
        textView2=findViewById(R.id.textViewLaptop);
        textView3=findViewById(R.id.textViewWomen);
        textView4=findViewById(R.id.textViewMen);
        textView5=findViewById(R.id.textViewDisplayAmount);

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    ch2.setVisibility(View.VISIBLE);
                    ch3.setVisibility(View.VISIBLE);
                }
                else{
                    ch2.setVisibility(View.GONE);
                    ch3.setVisibility(View.GONE);
                }
            }
        });
        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isChecked()){
                    ch5.setVisibility(View.VISIBLE);
                    ch6.setVisibility(View.VISIBLE);
                }
                else{
                    ch5.setVisibility(View.GONE);
                    ch6.setVisibility(View.GONE);
                }
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamount =0;
                StringBuilder str=new StringBuilder();
                if (ch1.isChecked()){
                    str.append(ch1.getText().toString());

                }
                if (ch2.isChecked()){
                    str.append(ch2.getText().toString());
                    String Mobileprice=textView1.getText().toString();
                    int a =Integer.parseInt(Mobileprice);
                    totalamount=totalamount+a;
                }
                if (ch3.isChecked()){
                    str.append(ch3.getText().toString());

                    String Laptopprice=textView2.getText().toString();
                    int a =Integer.parseInt(Laptopprice);
                    totalamount=totalamount+a;
                }
                if (ch4.isChecked()){
                    str.append(ch4.getText().toString());
                }
                if (ch5.isChecked()){
                    str.append(ch5.getText().toString());
                    String Menprice=textView4.getText().toString();
                    int a =Integer.parseInt(Menprice);
                    totalamount=totalamount+a;
                }
                if (ch6.isChecked()){
                    str.append(ch6.getText().toString());
                    String Womenprice=textView3.getText().toString();
                    int a =Integer.parseInt(Womenprice);
                    totalamount=totalamount+a;
                }
                textView5.setText("your total amount is " +totalamount);
            }
        });
    }
}
