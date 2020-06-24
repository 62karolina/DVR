package com.example.dvr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Camera;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

import java.io.File;
import java.util.Date;

public class MainActivity extends Activity {

    private SurfaceView sv;
    private SurfaceHolder holder;
    private HolderCallback holderCallback;
    private Camera camera;

    private MediaRecorder mediaRecorder;
    File videoFile;
    Date date;

    final int CAMERA_ID = 0;
    final boolean FULL_SCREEN = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sv = findViewById(R.id.surfaceView);
        holder = sv.getHolder();
        holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
