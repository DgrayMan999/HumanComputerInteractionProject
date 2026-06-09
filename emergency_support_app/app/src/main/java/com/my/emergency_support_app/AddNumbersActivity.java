package com.my.emergency_support_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddNumbersActivity extends AppCompatActivity {

    private EditText familyNumberInput;
    private EditText helpNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_numbers);

        familyNumberInput = findViewById(R.id.familyNumberInput);
        helpNumberInput = findViewById(R.id.helpNumberInput);
        Button saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String familyNumber = familyNumberInput.getText().toString();
                String helpNumber = helpNumberInput.getText().toString();

                if (!familyNumber.isEmpty()) {
                    NumbersService.addFamilyNumber(familyNumber);
                }

                if (!helpNumber.isEmpty()) {
                    NumbersService.addHelpNumber(helpNumber);
                }

                startActivity(new Intent(AddNumbersActivity.this, MainActivity.class));
            }
        });
    }
}
