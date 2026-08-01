package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class jp extends op {
    public static final AtomicIntegerFieldUpdater f = null;
    private volatile int _invoked;
    public final sp e;

    static {
        f = AtomicIntegerFieldUpdater.newUpdater(jp.class, "_invoked");
    }

    public jp(sp r1) {
        this.e = r1;
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ Object f(Object r1) {
        l((Throwable) r1);
        return vh.n;
    }

    @Override // defpackage.sp
    public final void l(Throwable r4) {
        if (f.compareAndSet(this, 0, 1) == false) goto L6;
        this.e.f(r4);
        return;
    }
}
