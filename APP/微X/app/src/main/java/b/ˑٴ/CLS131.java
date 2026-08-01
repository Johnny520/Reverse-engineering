// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer;

public final class CLS131 implements MediaPlayer.OnCompletionListener {
    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            mediaPlayer0.release();
        }
    }
}

