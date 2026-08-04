package yyds;

import android.view.ViewGroup;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲀᲈᛸᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2136 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1606 f10557;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10558;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ ViewGroup f10559;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ long f10560;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2503 f10561;

    static {
        NativeUtil.classesInit0(83);
    }

    public /* synthetic */ RunnableC2136(ViewGroup viewGroup, C2503 c2503, C1606 c1606, long j, int i) {
        this.f10559 = viewGroup;
        this.f10561 = c2503;
        this.f10557 = c1606;
        this.f10560 = j;
        this.f10558 = i;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
