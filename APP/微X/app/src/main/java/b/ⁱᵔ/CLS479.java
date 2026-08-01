// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;
import android.os.Handler;
import android.widget.ImageButton;

public final class CLS479 implements MediaPlayer.OnCompletionListener {
    public final Handler FLD4703;
    public final ImageButton FLD4704;
    public final Runnable[] FLD4705;
    public final ImageButton FLD4706;

    public CLS479(Handler handler0, Runnable[] arr_runnable, ImageButton imageButton0, ImageButton imageButton1) {
        this.FLD4703 = handler0;
        this.FLD4705 = arr_runnable;
        this.FLD4704 = imageButton0;
        this.FLD4706 = imageButton1;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        this.FLD4703.removeCallbacks(this.FLD4705[0]);
        if(mediaPlayer0 != null) {
            CLS462.FLD4512 = false;
            this.FLD4704.setVisibility(8);
            this.FLD4706.setVisibility(0);
        }
    }
}

