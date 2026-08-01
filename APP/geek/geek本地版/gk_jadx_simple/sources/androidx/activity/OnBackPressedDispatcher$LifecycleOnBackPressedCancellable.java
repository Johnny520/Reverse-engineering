package androidx.activity;

import defpackage.h8;
import defpackage.ip;
import defpackage.iq;
import defpackage.mq;
import defpackage.oq;
import defpackage.sl;
import defpackage.ww;
import defpackage.xw;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements mq, h8 {
    public final androidx.lifecycle.a a;
    public final sl b;
    public ww c;
    public final /* synthetic */ a d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(a r2, androidx.lifecycle.a r3, sl r4) {
        ip.o("onBackPressedCallback", r4);
        this.d = r2;
        this.a = r3;
        this.b = r4;
        r3.a(this);
    }

    @Override // defpackage.mq
    public final void b(oq r4, iq r5) {
        if (r5 != iq.ON_START) goto L7;
        a r42 = this.d;
        r42.getClass();
        sl r0 = this.b;
        ip.o("onBackPressedCallback", r0);
        r42.b.addLast(r0);
        ww r52 = new ww(r42, r0);
        r0.b.add(r52);
        r42.d();
        r0.c = new xw(1, r42);
        this.c = r52;
        return;
    L7:
        if (r5 != iq.ON_STOP) goto L13;
        ww r43 = this.c;
        if (r43 == null) goto L16;
        r43.cancel();
        return;
    L16:
        return;
    L13:
        if (r5 != iq.ON_DESTROY) goto L17;
        cancel();
        return;
    }

    @Override // defpackage.h8
    public final void cancel() {
        this.a.f(this);
        this.b.b.remove(this);
        ww r0 = this.c;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.c = null;
    }
}
