// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

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
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS340;
import t.ﾞᐧ.CLS341;
import t.ﾞᐧ.CLS344;

public final class CLS280 implements CLS144 {
    public final Activity FLD505;
    public final AlertDialog[] FLD506;
    public final MediaPlayer FLD507;
    public final Handler FLD508;

    public CLS280(Activity activity0, MediaPlayer mediaPlayer0, AlertDialog[] arr_alertDialog, Handler handler0) {
        this.FLD505 = activity0;
        this.FLD507 = mediaPlayer0;
        this.FLD506 = arr_alertDialog;
        this.FLD508 = handler0;
        super();
    }

    @Override  // t.ⁱʾ.CLS144
    public final void MTH2170(Object[] arr_object) {
        public final class CLS47 implements SurfaceHolder.Callback {
            public final CLS280 FLD498;

            public CLS47(CLS280 ᵔˉ0) {
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


        public final class CLS50 implements MediaPlayer.OnPreparedListener {
            public final SurfaceView FLD502;
            public final CLS280 FLD503;
            public final CLS340 FLD504;

            public CLS50(CLS280 ᵔˉ0, SurfaceView surfaceView0, CLS340 ـﹳ0) {
            }

            @Override  // android.media.MediaPlayer$OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer0) {
                public final class CLS48 implements SeekBar.OnSeekBarChangeListener {
                    public final MediaPlayer FLD499;

                    public CLS48(MediaPlayer mediaPlayer0) {
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


                public final class CLS49 implements Runnable {
                    public final SeekBar FLD500;
                    public final CLS50 FLD501;

                    public CLS49(CLS50 ᵔˉ$ᵔʾ0, SeekBar seekBar0) {
                    }

                    @Override
                    public final void run() {
                    }
                }

            }
        }

        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        SurfaceView surfaceView0 = new SurfaceView(this.FLD505);
        CLS341 ᵔˉ0 = new CLS341(this.FLD505);
        ᵔˉ0.FLD1272.add(surfaceView0);
        ᵔˉ0.FLD1277 = true;
        CLS340 ـﹳ0 = new CLS340(this.FLD505);
        surfaceView0.getHolder().addCallback(new CLS47(this));
        CLS50 ᵔˉ$ᵔʾ0 = new CLS50(this, surfaceView0, ـﹳ0);
        this.FLD507.setOnPreparedListener(ᵔˉ$ᵔʾ0);
        CLS344 ⁱˉ0 = new CLS344(this.FLD505);
        ⁱˉ0.MTH2481(new Object[]{ᵔˉ0, ـﹳ0});
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), CLS43.MTH1439(10));
    }
}

