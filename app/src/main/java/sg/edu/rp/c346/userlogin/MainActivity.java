package sg.edu.rp.c346.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etName,etPass;
    Button login;
    TimePicker tp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log.d("MainActivity","Registration is completed");

        etName = findViewById(R.id.editTextName);
        etPass = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.buttonLogin);

        tp1 = findViewById(R.id.timePicker);

        tp1.setCurrentHour(19);
        tp1.setCurrentMinute(20);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String pass = etPass.getText().toString();

                if(pass.equals("123")){
                    Intent intent = new Intent(MainActivity.this,Welcome.class) ;
                    intent.putExtra("login_name",name);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
