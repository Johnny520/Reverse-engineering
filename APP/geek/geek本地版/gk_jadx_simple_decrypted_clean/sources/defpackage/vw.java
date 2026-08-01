package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final class vw {
    public static final vw a = null;

    static {
        a = new vw();
    }

    public final OnBackInvokedCallback a(sm r2, sm r3, hm r4, hm r5) {
        ip.o("onBackStarted", r2);
        ip.o("onBackProgressed", r3);
        ip.o("onBackInvoked", r4);
        ip.o("onBackCancelled", r5);
        return new uw(r2, r3, r4, r5);
    }
}
