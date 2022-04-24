package com.example.devsufy;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity{
    EditText to,sub,body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        to=findViewById(R.id.to);
        sub=findViewById(R.id.sub);
        body=findViewById(R.id.body);
        String[] receivers={body.getText().toString()};
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("vnd.android.cursor.dir/email");
        intent.putExtra(Intent.EXTRA_EMAIL,receivers);
        intent.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,body.getText().toString());
        startActivity(Intent.createChooser(intent,"Choose application"));
    }
}
