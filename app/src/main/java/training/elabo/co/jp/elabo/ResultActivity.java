package training.elabo.co.jp.elabo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    ImageView mAriesView;
    ImageView mTaurusView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mAriesView = findViewById(R.id.btn_aries);
        mTaurusView = findViewById(R.id.btn_taurus);

    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
