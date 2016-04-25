package login.vikas.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    Button submit;
    EditText name,email,mobile, add;
    Long mobileNo;
    String rr="0";
    String error="Blank Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openNextActivity();
    }

    public void openNextActivity(){
        submit=(Button)findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                name=(EditText)findViewById(R.id.name);
                String strName=name.getText().toString();

                email=(EditText)findViewById(R.id.email);
                String strEmail=email.getText().toString();

                add=(EditText)findViewById(R.id.add);
                String strAdd=add.getText().toString();

                mobile=(EditText) findViewById(R.id.mobile);
                String phoneNo = mobile.getText().toString();
                if(phoneNo.equals("")){
                    mobileNo=Long.parseLong(rr);
                }else{
                    mobileNo = Long.parseLong(phoneNo);
                }

                if (strName.equals("") && strEmail.equals("") && strAdd.equals("")){
                    strName=error;
                    strEmail=error;
                    strAdd=error;

                    Intent intent=new Intent(getApplicationContext(),result.class);

                    intent.putExtra("I_Name",strName);
                    intent.putExtra("I_Email",strEmail);
                    intent.putExtra("I_Add",strAdd);
                    intent.putExtra("I_Mobile",mobileNo);
                    startActivity(intent);
                }else
                {
                    Intent intent=new Intent(getApplicationContext(),result.class);

                    intent.putExtra("I_Name",strName);
                    intent.putExtra("I_Email",strEmail);
                    intent.putExtra("I_Add",strAdd);
                    intent.putExtra("I_Mobile",mobileNo);
                    startActivity(intent);
                }

            }
        });
    }
}
