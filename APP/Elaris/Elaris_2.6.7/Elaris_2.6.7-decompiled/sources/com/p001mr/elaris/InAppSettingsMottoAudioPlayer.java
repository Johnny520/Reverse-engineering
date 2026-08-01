package com.p001mr.elaris;

import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.widget.TextView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p000.AbstractC0198e7;
import p000.C0479u2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsMottoAudioPlayer {
    private static InAppSettingsMottoAudioPlayer activePlayer;
    private final AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private WeakReference<TextView> button = new WeakReference<>(null);
    private MediaPlayer player;
    private boolean playing;
    private final InAppSettings settings;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InAppSettingsMottoAudioPlayer(InAppSettings inAppSettings) {
        this.settings = inAppSettings;
        Object systemService = inAppSettings.activity.getSystemService("audio");
        this.audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.audioFocusRequest = new AudioFocusRequest.Builder(3).setAudioAttributes(audioAttributes()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.mr.elaris.InAppSettingsMottoAudioPlayer.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                if (i == -1 || i == -2) {
                    InAppSettingsMottoAudioPlayer.this.release();
                }
            }
        }).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void abandonAudioFocus() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return;
        }
        try {
            audioManager.abandonAudioFocusRequest(this.audioFocusRequest);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static AudioAttributes audioAttributes() {
        return new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    private MediaPlayer createPlayer() throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.settings.activity.createPackageContext(Prefs.PACKAGE_NAME, 2).getResources().openRawResourceFd(R.raw.home_motto_audio);
        if (assetFileDescriptorOpenRawResourceFd == null) {
            C0479u2.m1037b("motto MP3 resource unavailable");
            return null;
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setAudioAttributes(audioAttributes());
            mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mr.elaris.InAppSettingsMottoAudioPlayer.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer2) {
                    InAppSettingsMottoAudioPlayer.this.release();
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.mr.elaris.InAppSettingsMottoAudioPlayer.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    AbstractC0198e7.m343a(Prefs.PREFS_NAME, "motto-mp3-error-" + i + "-" + i2, null);
                    InAppSettingsMottoAudioPlayer.this.release();
                    return true;
                }
            });
            mediaPlayer.prepare();
            assetFileDescriptorOpenRawResourceFd.close();
            return mediaPlayer;
        } catch (Throwable th) {
            try {
                mediaPlayer.release();
            } catch (Throwable unused) {
            }
            try {
                if (th instanceof Exception) {
                    throw th;
                }
                throw new Exception("motto MP3 player creation failed", th);
            } catch (Throwable th2) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void renderButton() {
        Drawable drawable;
        TextView textView = this.button.get();
        if (textView == null) {
            return;
        }
        InAppSettingsMottoAudioPlayer inAppSettingsMottoAudioPlayer = activePlayer;
        boolean z = inAppSettingsMottoAudioPlayer != null && inAppSettingsMottoAudioPlayer.playing;
        try {
            drawable = this.settings.activity.createPackageContext(Prefs.PACKAGE_NAME, 2).getDrawable(z ? R.drawable.ic_motto_pause_circle_outline : R.drawable.ic_motto_play_circle_outline);
            if (drawable != null) {
                try {
                    drawable = drawable.mutate();
                    drawable.setTint(InAppSettingsSecondaryStyle.subtitleColor(this.settings));
                    drawable.setBounds(0, 0, this.settings.m139dp(13.0f), this.settings.m139dp(13.0f));
                } catch (Throwable th) {
                    th = th;
                    AbstractC0198e7.m343a(Prefs.PREFS_NAME, "motto-icon", th);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        textView.setCompoundDrawables(drawable, null, null, null);
        String str = z ? "停止题词音频" : "播放题词音频";
        textView.setContentDescription(str);
        textView.setTooltipText(str);
        textView.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean requestAudioFocus() {
        AudioManager audioManager = this.audioManager;
        return audioManager == null || audioManager.requestAudioFocus(this.audioFocusRequest) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void bindButton(TextView textView) {
        this.button = new WeakReference<>(textView);
        InAppSettingsMottoAudioPlayer inAppSettingsMottoAudioPlayer = activePlayer;
        if (inAppSettingsMottoAudioPlayer != null && inAppSettingsMottoAudioPlayer != this) {
            inAppSettingsMottoAudioPlayer.button = new WeakReference<>(textView);
        }
        renderButton();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void release() {
        this.playing = false;
        if (activePlayer == this) {
            activePlayer = null;
        }
        MediaPlayer mediaPlayer = this.player;
        this.player = null;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setOnCompletionListener(null);
                mediaPlayer.setOnErrorListener(null);
                mediaPlayer.release();
            } catch (Throwable th) {
                AbstractC0198e7.m343a(Prefs.PREFS_NAME, "motto-mp3-release", th);
            }
        }
        abandonAudioFocus();
        renderButton();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void toggle() {
        InAppSettingsMottoAudioPlayer inAppSettingsMottoAudioPlayer = activePlayer;
        if (inAppSettingsMottoAudioPlayer != null) {
            inAppSettingsMottoAudioPlayer.release();
            if (inAppSettingsMottoAudioPlayer != this) {
                renderButton();
                return;
            }
            return;
        }
        try {
            if (!requestAudioFocus()) {
                this.settings.toast("暂时无法获得音频播放权限");
                return;
            }
            MediaPlayer mediaPlayerCreatePlayer = createPlayer();
            this.player = mediaPlayerCreatePlayer;
            mediaPlayerCreatePlayer.start();
            this.playing = true;
            activePlayer = this;
            renderButton();
        } catch (Throwable th) {
            AbstractC0198e7.m343a(Prefs.PREFS_NAME, "motto-mp3-play", th);
            release();
            this.settings.toast("题词音频暂时无法播放");
        }
    }
}
