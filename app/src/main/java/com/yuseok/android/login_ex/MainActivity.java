package com.yuseok.android.login_ex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editId, editPw;
    Button btnLogin;

    Intent intent;

    String chId, chPw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editId = (EditText) findViewById(R.id.editId);
        editPw = (EditText) findViewById(R.id.editPw);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginSuccess();
            }
        });

    }

    // ID와 PASSWORD가 일치하는지 확인
    public void LoginSuccess() {

        chId = editId.getText().toString();
        chPw = editPw.getText().toString();

        // ID가 admin이고 PW가 1234일때
        if (chId.equals("admin") && chPw.equals("1234")) {
            // 다음 Activity로 넘어감
            intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        } else  {
            // 아닐시에는 Toast를 띄워준다.
            Toast.makeText(this, "아이디 혹은 비밀번호가 일치하지 않습니다", Toast.LENGTH_SHORT).show();
        }
    }

}
