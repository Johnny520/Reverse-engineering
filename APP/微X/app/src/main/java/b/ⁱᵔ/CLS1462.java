// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.LinearLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SeekBar;
import b.ʻˑ.CLS17;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1618;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1628;

public final class CLS1462 implements CLS17 {
    public final Activity FLD4339;
    public final AlertDialog[] FLD4340;
    public final MediaPlayer FLD4341;
    public final Handler FLD4342;

    public CLS1462(Activity activity0, MediaPlayer mediaPlayer0, AlertDialog[] arr_alertDialog, Handler handler0) {
        this.FLD4339 = activity0;
        this.FLD4341 = mediaPlayer0;
        this.FLD4340 = arr_alertDialog;
        this.FLD4342 = handler0;
        super();
    }

    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        public final class CLS444 implements SurfaceHolder.Callback {
            public final CLS1462 FLD4332;

            public CLS444(CLS1462 ˏᵔ0) {
            }

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
            }

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
            }

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
            }
        }


        public final class CLS447 implements MediaPlayer.OnPreparedListener {
            public final SurfaceView FLD4336;
            public final CLS1462 FLD4337;
            public final CLS1628 FLD4338;

            public CLS447(CLS1462 ˏᵔ0, SurfaceView surfaceView0, CLS1628 ᐧי0) {
            }

            @Override  // android.media.MediaPlayer$OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer0) {
                public final class CLS445 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD4333;

                    public CLS445(MediaPlayer mediaPlayer0) {
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onProgressChanged(SeekBar seekBar0, int v, boolean z) {
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStartTrackingTouch(SeekBar seekBar0) {
                    }

                    @Override  // android.widget.SeekBar$OnSeekBarChangeListener
                    public final void onStopTrackingTouch(SeekBar seekBar0) {
                    }
                }


                public final class CLS446 implements Runnable {
                    public final SeekBar FLD4334;
                    public final CLS447 FLD4335;

                    public CLS446(CLS447 ˏᵔ$ᵔʾ0, SeekBar seekBar0) {
                    }

                    @Override
                    public final void run() {
                    }
                }

            }
        }

        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        SurfaceView surfaceView0 = new SurfaceView(this.FLD4339);
        CLS1618 ʽﹶ0 = new CLS1618(this.FLD4339);
        ʽﹶ0.FLD5172.add(surfaceView0);
        ʽﹶ0.FLD5176 = true;
        CLS1628 ᐧי0 = new CLS1628(this.FLD4339);
        surfaceView0.getHolder().addCallback(new CLS444(this));
        CLS447 ˏᵔ$ᵔʾ0 = new CLS447(this, surfaceView0, ᐧי0);
        this.FLD4341.setOnPreparedListener(ˏᵔ$ᵔʾ0);
        CLS1623 יᐧ0 = new CLS1623(this.FLD4339);
        CLS182.MTH3498(יᐧ0, new Object[]{ʽﹶ0, ᐧי0}, 10, linearLayout0, יᐧ0);
    }
}

