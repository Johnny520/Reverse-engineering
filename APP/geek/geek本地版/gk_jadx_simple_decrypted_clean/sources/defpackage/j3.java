package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j3(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void onBackInvoked() {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) this.b).run();
        return;
    L6:
        hm r0 = (hm) this.b;
        ip.o("$onBackInvoked", r0);
        r0.a();
        return;
    L8:
        ((r3) this.b).D();
    }
}
