package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jp extends defpackage.op {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;
    private volatile int _invoked;
    public final defpackage.sp e;

    static {
            java.lang.Class<jp> r0 = defpackage.jp.class
            java.lang.String r1 = "_invoked"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.jp.f = r0
            return
    }

    public jp(defpackage.sp r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ java.lang.Object f(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.l(r1)
            vh r1 = defpackage.vh.n
            return r1
    }

    @Override // defpackage.sp
    public final void l(java.lang.Throwable r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.jp.f
            boolean r0 = r2.compareAndSet(r3, r0, r1)
            if (r0 == 0) goto Lf
            sp r0 = r3.e
            r0.f(r4)
        Lf:
            return
    }
}
