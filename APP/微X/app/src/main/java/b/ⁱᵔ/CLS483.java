// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer;
import android.widget.ImageButton;
import android.widget.SeekBar;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;

public final class CLS483 implements MediaPlayer.OnPreparedListener {
    public final int FLD4726;
    public final Runnable[] FLD4727;
    public final ImageButton FLD4728;
    public final SeekBar FLD4729;
    public final ImageButton FLD4730;
    public final CLS17 FLD4731;

    public CLS483(CLS17 ﾞٴ0, SeekBar seekBar0, ImageButton imageButton0, ImageButton imageButton1, Runnable[] arr_runnable, int v) {
        this.FLD4726 = v;
        this.FLD4731 = ﾞٴ0;
        this.FLD4729 = seekBar0;
        this.FLD4728 = imageButton0;
        this.FLD4730 = imageButton1;
        this.FLD4727 = arr_runnable;
        super();
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        Runnable[] arr_runnable = this.FLD4727;
        ImageButton imageButton0 = this.FLD4730;
        ImageButton imageButton1 = this.FLD4728;
        SeekBar seekBar0 = this.FLD4729;
        CLS17 ﾞٴ0 = this.FLD4731;
        switch(this.FLD4726) {
            case 0: {
                ((CLS1515)ﾞٴ0).getClass();
                try {
                    seekBar0.setMax(mediaPlayer0.getDuration());
                    seekBar0.setProgress(mediaPlayer0.getCurrentPosition());
                    seekBar0.setOnSeekBarChangeListener(new CLS471(mediaPlayer0, imageButton1, imageButton0, arr_runnable));
                    CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ((CLS1517)ﾞٴ0).getClass();
                seekBar0.setMax(mediaPlayer0.getDuration());
                seekBar0.setProgress(mediaPlayer0.getCurrentPosition());
                seekBar0.setOnSeekBarChangeListener(new CLS475(mediaPlayer0, imageButton1, imageButton0, arr_runnable));
                CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
                return;
            }
            default: {
                ((CLS1516)ﾞٴ0).getClass();
                seekBar0.setMax(mediaPlayer0.getDuration());
                seekBar0.setProgress(mediaPlayer0.getCurrentPosition());
                seekBar0.setOnSeekBarChangeListener(new CLS473(mediaPlayer0, imageButton1, imageButton0, arr_runnable));
                CLS476.FLD4666.postDelayed(arr_runnable[0], 100L);
            }
        }
    }
}

