package Yue;

import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6681 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ SeekBar f17151;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ int f17152;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f17153;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f17154;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ TextView f17155;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final /* synthetic */ ImageView f17156;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ ProgressBar f17157;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final /* synthetic */ Timer f17158;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final /* synthetic */ TimerTask f17159;

    static {
        NativeUtil.classesInit0(748);
    }

    public /* synthetic */ RunnableC6681(SeekBar seekBar, int i, ProgressBar progressBar, MediaPlayer mediaPlayer, TextView textView, ImageView imageView, ProgressBar progressBar2, Timer timer, TimerTask timerTask) {
        this.f17151 = seekBar;
        this.f17152 = i;
        this.f17153 = progressBar;
        this.f17154 = mediaPlayer;
        this.f17155 = textView;
        this.f17156 = imageView;
        this.f17157 = progressBar2;
        this.f17158 = timer;
        this.f17159 = timerTask;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
