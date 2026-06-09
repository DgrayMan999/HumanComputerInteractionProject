package com.my.emergency_support_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class CallFamilyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_family);

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        List<String> familyNumbers = NumbersService.getFamilyNumbers();

        for (String number : familyNumbers) {
            Button button = new Button(this);
            button.setText(number);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://example.com?number=" + number));
                    startActivity(intent);
                }
            });
            linearLayout.addView(button);
        }
    }
}
