package com.linko.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    int green = Color.rgb(0, 150, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(28, 30, 28, 30);
        root.setBackgroundColor(Color.WHITE);

        TextView logo = new TextView(this);
        logo.setText("LINKO");
        logo.setTextSize(42);
        logo.setTypeface(null, Typeface.BOLD);
        logo.setTextColor(green);
        logo.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Connect • Chat • Share");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        TextView welcome = new TextView(this);
        welcome.setText("Хуш омадед!");
        welcome.setTextSize(26);
        welcome.setTypeface(null, Typeface.BOLD);
        welcome.setTextColor(Color.BLACK);
        welcome.setGravity(Gravity.CENTER);
        welcome.setPadding(0, 45, 0, 12);

        TextView info = new TextView(this);
        info.setText("Бо дӯстонат пайваст шав");
        info.setTextSize(16);
        info.setTextColor(Color.GRAY);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, 0, 0, 25);

        EditText phone = new EditText(this);
        phone.setHint("Рақами телефон: +992...");
        phone.setTextSize(16);
        phone.setSingleLine(true);
        phone.setInputType(3);
        phone.setPadding(16, 12, 16, 12);
        phone.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(green)
        );

        Button login = new Button(this);
        login.setText("ИДОМА ДОДАН");
        login.setTextColor(Color.WHITE);
        login.setTextSize(16);
        login.setAllCaps(false);
        login.setBackgroundTintList(
            android.content.res.ColorStateList.valueOf(green)
        );

        TextView note = new TextView(this);
        note.setText("Паёмнависии осон ва зуд 💚");
        note.setTextSize(14);
        note.setTextColor(Color.GRAY);
        note.setGravity(Gravity.CENTER);
        note.setPadding(0, 28, 0, 0);

        root.addView(logo);
        root.addView(subtitle);
        root.addView(welcome);
        root.addView(info);
        root.addView(phone,
            new LinearLayout.LayoutParams(
                -1, -2
            )
        );
        root.addView(login,
            new LinearLayout.LayoutParams(
                -1, -2
            )
        );
        root.addView(note);

        setContentView(root);
    }
          }
