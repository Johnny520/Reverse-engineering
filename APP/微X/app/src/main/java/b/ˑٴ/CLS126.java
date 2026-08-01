// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.provider.Settings;
import android.view.SurfaceView;
import android.widget.Toolbar;

public final class CLS126 {
    public static Drawable MTH2601(Toolbar toolbar0) {
        return toolbar0.getOverflowIcon();
    }

    public static void MTH2602(SurfaceView surfaceView0) {
        surfaceView0.setForegroundGravity(17);
    }

    public static PlaybackParams MTH2603(PlaybackParams playbackParams0, float f) {
        return playbackParams0.setSpeed(f);
    }

    public static PlaybackParams MTH2604(MediaPlayer mediaPlayer0) {
        return mediaPlayer0.getPlaybackParams();
    }

    public static void MTH2605(MediaPlayer mediaPlayer0, PlaybackParams playbackParams0) {
        mediaPlayer0.setPlaybackParams(playbackParams0);
    }

    public static boolean MTH2606(Activity activity0) {
        return Settings.canDrawOverlays(activity0);
    }

    public static void MTH2607(Toolbar toolbar0, Drawable drawable0) {
        toolbar0.setOverflowIcon(drawable0);
    }
}

