package com.kostya_zinoview.mvpmoxy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.kostya_zinoview.mvpmoxy.presenters.MainPresenter;
import com.kostya_zinoview.mvpmoxy.view.MainView;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    @InjectPresenter
    public MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.showMessage();
    }

    @Override
    public void showMessage(int message) {
        TextView viewById = findViewById(R.id.textView);
        viewById.setText(getString(message));
    }

}
