// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer;

public final class CLS118 implements MediaPlayer.OnErrorListener {
    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            mediaPlayer0.release();
        }
        return false;
    }
}

