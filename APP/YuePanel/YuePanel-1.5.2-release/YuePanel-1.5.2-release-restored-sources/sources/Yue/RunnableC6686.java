package Yue;

import android.widget.SeekBar;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۤۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC6686 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ TextView f17176;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ int f17177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ SeekBar f17178;

    static {
        NativeUtil.classesInit0(753);
    }

    public /* synthetic */ RunnableC6686(TextView textView, int i, SeekBar seekBar) {
        this.f17176 = textView;
        this.f17177 = i;
        this.f17178 = seekBar;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
