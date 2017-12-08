package com.fastaoe.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.fastaoe.butterknife.ButterKnife;
import com.fastaoe.butterknife.Unbinder;
import com.fastaoe.butterknife.annotations.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textview)
    TextView textview;

    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bind = ButterKnife.bind(this);

        textview.setText("修改后的文字");
    }

    @Override
    protected void onDestroy() {
        bind.unbind();
        super.onDestroy();
    }
}
