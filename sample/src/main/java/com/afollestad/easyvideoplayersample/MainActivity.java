package com.afollestad.easyvideoplayersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.tamerbarsbay.easyvideoplayer.EasyVideoCallback;
import com.tamerbarsbay.easyvideoplayer.EasyVideoPlayer;
import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity implements EasyVideoCallback {

    private EasyVideoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = (EasyVideoPlayer) findViewById(R.id.player);
        assert player != null;
        player.setCallback(this);
        // All further configuration is done from the XML layout.
    }

    @Override
    protected void onPause() {
        super.onPause();
        player.pause();
    }

    @Override
    public void onPreparing(EasyVideoPlayer player) {
        Log.d("EVP-Sample", "onPreparing()");
    }

    @Override
    public void onPrepared(EasyVideoPlayer player) {
        Log.d("EVP-Sample", "onPrepared()");
    }

    @Override
    public void onBuffering(int percent) {
        Log.d("EVP-Sample", "onBuffering(): " + percent + "%");
    }

    @Override
    public void onError(EasyVideoPlayer player, Exception e) {
        Log.d("EVP-Sample", "onError(): " + e.getMessage());
        new MaterialDialog.Builder(this)
                .title(R.string.error)
                .content(e.getMessage())
                .positiveText(android.R.string.ok)
                .show();
    }

    @Override
    public void onCompletion(EasyVideoPlayer player) {
        Log.d("EVP-Sample", "onCompletion()");
    }

    @Override
    public void onNext(EasyVideoPlayer player) {
        Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPrevious(EasyVideoPlayer player) {
        Toast.makeText(this, "Previous", Toast.LENGTH_SHORT).show();
    }
}