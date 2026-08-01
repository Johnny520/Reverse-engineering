// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;
import android.widget.ImageButton;

public final class CLS439 implements MediaPlayer.OnCompletionListener {
    public final int FLD4206;
    public final ImageButton FLD4207;
    public final Runnable[] FLD4208;
    public final ImageButton FLD4209;

    public CLS439(Runnable[] arr_runnable, ImageButton imageButton0, ImageButton imageButton1, int v) {
        this.FLD4206 = v;
        this.FLD4208 = arr_runnable;
        this.FLD4207 = imageButton0;
        this.FLD4209 = imageButton1;
        super();
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        ImageButton imageButton0 = this.FLD4209;
        ImageButton imageButton1 = this.FLD4207;
        Runnable[] arr_runnable = this.FLD4208;
        switch(this.FLD4206) {
            case 0: {
                CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                if(mediaPlayer0 != null) {
                    CLS476.FLD4664 = false;
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
                return;
            }
            case 1: {
                CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                if(mediaPlayer0 != null) {
                    CLS476.FLD4664 = false;
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
                return;
            }
            default: {
                CLS476.FLD4666.removeCallbacks(arr_runnable[0]);
                if(mediaPlayer0 != null) {
                    CLS476.FLD4664 = false;
                    imageButton1.setVisibility(8);
                    imageButton0.setVisibility(0);
                }
            }
        }
    }
}

