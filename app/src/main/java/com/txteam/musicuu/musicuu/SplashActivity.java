package com.txteam.musicuu.musicuu;

import android.content.Intent;
import android.os.Bundle;

import com.txteam.musicuu.musicuu.base.MvpActivity;
import com.txteam.musicuu.musicuu.presenter.SplashPresenter;
import com.txteam.musicuu.musicuu.view.SplashView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends MvpActivity<SplashPresenter> implements SplashView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {
            @Override
            public void run() {
                SplashActivity.this.startActivity(new Intent(getApplicationContext(), MainActivity.class));
                SplashActivity.this.finish();
            }
        };
        timer.schedule(tast, 1000);
    }

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenter(this);
    }




    @Override
    public void showSplash() {

    }
}
