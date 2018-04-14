package softwarecommunity.internetsharingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button b1=(Button)findViewById(R.id.button2);
        Button b2=(Button)findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(myintent2);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(FirstActivity.this,FourthActivity.class);
                startActivity(myintent2);

            }
        });
    }


}
