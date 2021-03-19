package com.example.wsr_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Связываемся с элементами нашего интерфейса:
        username = (EditText) findViewById(R.id.edit_user);
        password = (EditText) findViewById(R.id.edit_password);
    }

    // Обрабатываем нажатие кнопки "Войти":
    public void login(View view) {

        // Если введенные логин и пароль будут словом "admin",
        // показываем Toast сообщение об успешном входе:
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();

            // Выполняем переход на другой экран:
            Intent intent = new Intent(Login.this,Bank.class);
            startActivity(intent);
        }

        // В другом случае выдаем сообщение с ошибкой:
        else {
            Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();


        }
    }
}