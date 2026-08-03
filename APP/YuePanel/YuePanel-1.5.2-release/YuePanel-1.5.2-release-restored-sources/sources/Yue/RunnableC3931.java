package Yue;

import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3931 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C3932 f7529;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ String f7530;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ String f7531;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ TextView f7532;

    static {
        NativeUtil.classesInit0(477);
    }

    public /* synthetic */ RunnableC3931(C3932 c3932, String str, String str2, TextView textView) {
        this.f7529 = c3932;
        this.f7530 = str;
        this.f7531 = str2;
        this.f7532 = textView;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
