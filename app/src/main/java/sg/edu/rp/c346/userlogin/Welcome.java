package sg.edu.rp.c346.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView tvSuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvSuccess = findViewById(R.id.textViewSuccess);

        Intent intentReceived = getIntent();
        String name = intentReceived.getStringExtra("login_name");
        tvSuccess.setText("Welcome, "+name);
    }
}
