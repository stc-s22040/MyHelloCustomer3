package jp.suntech.s22040;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン・オブジェクトの用意
        Button btClick = findViewById(R.id.btClick);
        //リスナ・オブジェクトの用意
        HelloListener listener = new HelloListener();
        //ボタンにリスナを設定
        btClick.setOnClickListener(listener);
        //ボタン・オブジェクトの用意
        Button btClearName = findViewById(R.id.btClearName);
        btClearName.setOnClickListener(listener);

        Button btClearLife = findViewById(R.id.btClearLife);
        btClearLife.setOnClickListener(listener);

    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            EditText input1 = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etLife);

            TextView output1 = findViewById(R.id.tvOutput);

            int id = v.getId();

            if(id==R.id.btClearName){
                input1.setText("");
            }
            else if(id==R.id.btClearLife){
                input2.setText("");
            }
            else if(id==R.id.btClick){
                String inputStr1 = input1.getText().toString();
                String inputStr2 = input2.getText().toString();
                output1.setText(inputStr2 + "にお住まいの" + inputStr1 + "さん、こんにちは！");

            }
        }
    }
}