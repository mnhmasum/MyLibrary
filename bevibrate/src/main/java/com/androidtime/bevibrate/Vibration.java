package com.androidtime.bevibrate;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/**
 * Created by nazmul on 2/1/18.
 */

public class Vibration {

    public static void makeShortTimeVibrate(final int duration, final Context context) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    VibrationEffect.createOneShot(duration, 1);
                } else {
                    Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(duration);
                }

            }
        }).start();

    }
}
