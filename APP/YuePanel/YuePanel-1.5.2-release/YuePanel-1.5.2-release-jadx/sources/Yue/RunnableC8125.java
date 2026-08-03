package Yue;

import android.widget.CheckBox;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۢۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC8125 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ CheckBox f24058;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ TextView f24059;

    static {
        NativeUtil.classesInit0(893);
    }

    public /* synthetic */ RunnableC8125(CheckBox checkBox, TextView textView) {
        this.f24058 = checkBox;
        this.f24059 = textView;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
