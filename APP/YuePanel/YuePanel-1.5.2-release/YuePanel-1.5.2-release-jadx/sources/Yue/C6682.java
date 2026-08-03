package Yue;

import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6682 implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ SeekBar f2232;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f2233;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ ImageView f17160;

    static {
        NativeUtil.classesInit0(749);
    }

    public /* synthetic */ C6682(SeekBar seekBar, TextView textView, ImageView imageView) {
        this.f2232 = seekBar;
        this.f2233 = textView;
        this.f17160 = imageView;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final native void onCompletion(MediaPlayer mediaPlayer);
}
