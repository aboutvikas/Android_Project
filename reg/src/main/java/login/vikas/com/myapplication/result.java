package login.vikas.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class result extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView rName,rEmail,rMobile,rAdd,hiddenName;
        String name,email,add;

        name=getIntent().getStringExtra("I_Name");
        email=getIntent().getStringExtra("I_Email");
        Long mobile=getIntent().getLongExtra("I_Mobile",0);
        add=getIntent().getStringExtra("I_Add");

        String strName = "Name : " +name;
        String strEmail = "Email : " +email;
        String strMobile = "Mobile : " +mobile;
        String strAdd = "Address : " +add;

        if(strMobile.equals("0")){
            strMobile="null";
        }
        rName=(TextView) findViewById(R.id.rName);
        rName.setText(strName);

        rEmail=(TextView) findViewById(R.id.rEmail);
        rEmail.setText(strEmail);

        rMobile=(TextView) findViewById(R.id.rMobile);
        rMobile.setText(strMobile);

        rAdd=(TextView) findViewById(R.id.rAdd);
        rAdd.setText(strAdd);

        hiddenName=(TextView) findViewById(R.id.hiddenName);
        hiddenName.setText(name);
    }
}
