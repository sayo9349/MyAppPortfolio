package com.sayo.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openExternalApp(View view) {
        Button pressedButtons = (Button)view;
        String buttonText = pressedButtons.getText().toString();

        displayToast(buttonText);
    }

    private void displayToast(String toastString) {
        Context context = getApplicationContext();
        CharSequence text = toastString.subSequence(0,toastString.length());
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
