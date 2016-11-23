package com.bawei.yigongguanli;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 登录界面
 */
public class MainActivity extends Activity implements View.OnClickListener{
    private static final String TAG = "MainActivity";
    private EditText main_name;
    private EditText main_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_name = (EditText) findViewById(R.id.main_name);
        main_pass = (EditText) findViewById(R.id.main_pass);
        Button main_login= (Button) findViewById(R.id.main_login);
        TextView main_register= (TextView) findViewById(R.id.main_register);
        main_login.setOnClickListener(this);
        main_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_login:
                Log.d(TAG, "onClick() returned: " + "登录");
                break;
            case R.id.main_register:
                Log.d(TAG, "onClick() returned: " + "注册");
                break;
        }
    }
}
