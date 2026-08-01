package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ug extends w10 {
    public static final AtomicIntegerFieldUpdater e = null;
    private volatile int _decision;

    static {
        e = AtomicIntegerFieldUpdater.newUpdater(ug.class, "_decision");
    }

    @Override // defpackage.w10, defpackage.wp
    public final void k(Object r1) {
        l(r1);
    }

    @Override // defpackage.w10, defpackage.wp
    public final void l(Object r4) {
    L2:
        AtomicIntegerFieldUpdater r0 = e;
        int r1 = r0.get(this);
        if (r1 != 0) goto L5;
        if (r0.compareAndSet(this, 0, 2) == false) goto L2;
        return;
    L5:
        if (r1 != 1) goto L9;
        a80.B(ip.z(this.d), a80.A(r4));
        return;
    L9:
        throw new IllegalStateException("Already resumed");
    }
}
