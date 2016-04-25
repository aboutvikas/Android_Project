package android.learn.com.learnandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// JAVA follows camelCase conventions
public class MainActivity extends Activity {
    private EditText editlogin;
    private EditText editpass;
    private Button btnlogin;
    private TextView error;
    private String vikas;
    private String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editlogin=(EditText) this.findViewById(R.id.ET1);
        editpass=(EditText) this.findViewById(R.id.ET2);
        error= (TextView) this.findViewById(R.id.TV2);
        btnlogin = (Button) this.findViewById(R.id.Login);

        vikas="aboutvikas";
        pass= "password";

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vikas.equals(editlogin.getText().toString()) && pass.equals(editpass.getText().toString())) {
                    error.setText("Welcome Sir");
                }
                else if ("".equals(editlogin.getText().toString()) && "".equals(editpass.getText().toString())){
                    error.setText("Please Fill Username and Password");
                }
                else if  ("".equals(editlogin.getText().toString())){
                    error.setText("Please Fill Username");
                }
                else if ( "".equals(editpass.getText().toString())){
                    error.setText("Please Fill Password");
                }
                else {
                    error.setText("Wrong Username or Password");
                }
            }
        });

    }
}
