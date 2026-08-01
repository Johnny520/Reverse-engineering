// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.SurfaceView;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SeekBar;

public final class CLS414 implements MediaPlayer.OnPreparedListener {
    public final CLS1496 FLD4012;
    public final Runnable[] FLD4013;
    public final SeekBar FLD4014;
    public final SurfaceView FLD4015;
    public final Handler FLD4016;
    public final ImageButton FLD4017;
    public final ImageButton FLD4018;

    public CLS414(CLS1496 ـˑ$ᵔʾ0, SurfaceView surfaceView0, SeekBar seekBar0, Handler handler0, Runnable[] arr_runnable, ImageButton imageButton0, ImageButton imageButton1) {
        this.FLD4012 = ـˑ$ᵔʾ0;
        this.FLD4015 = surfaceView0;
        this.FLD4014 = seekBar0;
        this.FLD4016 = handler0;
        this.FLD4013 = arr_runnable;
        this.FLD4018 = imageButton0;
        this.FLD4017 = imageButton1;
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        int v3;
        float f;
        int v4;
        this.FLD4012.getClass();
        int v = mediaPlayer0.getVideoWidth();
        int v1 = mediaPlayer0.getVideoHeight();
        int v2 = 640;
        if(v > 640 || v1 > 480) {
            if(((float)v1) / 480.0f > 1.0f || ((float)v) / 640.0f > 1.0f) {
                if(((float)v1) / 480.0f > ((float)v) / 640.0f) {
                    v4 = (int)Math.ceil(((float)v1) / (((float)v1) / 480.0f));
                    f = ((float)v) / (((float)v1) / 480.0f);
                }
                else {
                    v4 = (int)Math.ceil(((float)v1) / (((float)v) / 640.0f));
                    f = ((float)v) / (((float)v) / 640.0f);
                }
                v1 = v4;
                v = (int)Math.ceil(f);
            }
            v2 = v;
            v3 = v1;
        }
        else {
            v3 = Math.min(((int)(640.0f / ((float)v) * ((float)v1))), 480);
        }
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(v2, v3);
        this.FLD4015.setLayoutParams(linearLayout$LayoutParams0);
        mediaPlayer0.start();
        int v5 = mediaPlayer0.getDuration();
        this.FLD4014.setMax(v5);
        int v6 = mediaPlayer0.getCurrentPosition();
        this.FLD4014.setProgress(v6);
        CLS461 ـˑ$ᵔʾ$ⁱʾ0 = new CLS461(mediaPlayer0);
        this.FLD4014.setOnSeekBarChangeListener(ـˑ$ᵔʾ$ⁱʾ0);
        mediaPlayer0.setOnCompletionListener(new CLS479(this.FLD4016, this.FLD4013, this.FLD4018, this.FLD4017));
    }
}

