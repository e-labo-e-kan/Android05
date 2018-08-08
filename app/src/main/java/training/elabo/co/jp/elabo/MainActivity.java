package training.elabo.co.jp.elabo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mAriesView;
    ImageView mTaurusView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAriesView = findViewById(R.id.btn_aries);
        mTaurusView = findViewById(R.id.btn_taurus);

    }

    @Override
    public void onResume() {
        super.onResume();
        mAriesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ボタンを押した時に処理をするところ

                //Intent作成、SecondActivity画面へ移動するため
                Intent intent  = new Intent(MainActivity.this,ResultActivity.class);

                //作成したIntentへ不可情報をつける場合に使う
                //キー値と渡したい情報を入れる
                //キー値=情報を取り出す為の合言葉。移動先で情報を引き出す時に使う
                intent.putExtra("キー値","渡したい情報");

                //作成したIntent情報を元に画面を起動
                startActivity(intent);

            }
        });

        mTaurusView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ボタンを押した時に処理をするところ

            }
        });
    }
}
