package io.github.fanky10.android.utestingxsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int PASSWORD_SIZE = 6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onValidateClicked(View v) {
        String text = ((EditText)findViewById(R.id.txtEmail)).getText().toString();
        String password = ((EditText)findViewById(R.id.txtPassword)).getText().toString();
        String message = "Email not valid";
        if(FormValidator.isEmail(text) && FormValidator.isLongEnough(PASSWORD_SIZE, password)) {
            message = "Email valid";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
