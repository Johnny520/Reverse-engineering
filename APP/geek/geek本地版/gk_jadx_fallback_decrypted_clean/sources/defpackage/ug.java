package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug extends defpackage.w10 {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater e = null;
    private volatile int _decision;

    static {
            java.lang.Class<ug> r0 = defpackage.ug.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.ug.e = r0
            return
    }

    @Override // defpackage.w10, defpackage.wp
    public final void k(java.lang.Object r1) {
            r0 = this;
            r0.l(r1)
            return
    }

    @Override // defpackage.w10, defpackage.wp
    public final void l(java.lang.Object r4) {
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ug.e
            int r1 = r0.get(r3)
            if (r1 == 0) goto L21
            r0 = 1
            if (r1 != r0) goto L19
            m50 r0 = r3.d
            ld r0 = defpackage.ip.z(r0)
            java.lang.Object r4 = defpackage.a80.A(r4)
            defpackage.a80.B(r0, r4)
            return
        L19:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
        L21:
            r1 = 0
            r2 = 2
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return
    }
}
