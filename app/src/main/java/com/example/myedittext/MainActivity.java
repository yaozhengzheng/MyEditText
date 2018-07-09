package com.example.myedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        EditTextLimitTextWatcher watcher = new EditTextLimitTextWatcher(this, editText, 10, "字数超出限制了！");
        editText.addTextChangedListener(watcher);
    }
}
