package com.cursoandroid.dannybastos.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final int BASE_DOG_TO_HUMAN_MULTIPLIER = 7;

    Button btnIdade;
    EditText txtInputAge;
    TextView txtHumanAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIdade = (Button) findViewById(R.id.btnGetAge);
        txtInputAge = (EditText) findViewById(R.id.txtInputAge);
        txtHumanAge = (TextView) findViewById(R.id.txtHumanAge);
        txtHumanAge.setText("");
        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!txtInputAge.getText().toString().isEmpty()) {
                    int humanAge = Integer.parseInt(txtInputAge.getText().toString()) * BASE_DOG_TO_HUMAN_MULTIPLIER;
                    String strResult = String.format(Locale.getDefault(), "A idade do em anos humanos é : %d anos", humanAge);
                    txtHumanAge.setText(strResult);
                }
            }
        });

    }
}
