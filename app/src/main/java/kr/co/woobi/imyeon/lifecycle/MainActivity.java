package kr.co.woobi.imyeon.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int i;
    Button button1;
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        i=i+1;

        textViewResult = (TextView)findViewById(R.id.textViewResult);
        textViewResult.setText("점수"+i);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("level",i);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        i=savedInstanceState.getInt("level");
        textViewResult.setText("점수"+i);
    }
}
