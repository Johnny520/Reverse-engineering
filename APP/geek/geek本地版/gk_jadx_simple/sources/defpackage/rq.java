package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends ke implements eg {
    public static final AtomicIntegerFieldUpdater h = null;
    public final ke c;
    public final int d;
    public final /* synthetic */ eg e;
    public final wr f;
    public final Object g;
    private volatile int runningWorkers;

    static {
        h = AtomicIntegerFieldUpdater.newUpdater(rq.class, "runningWorkers");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rq(ke r1, int r2) {
        this.c = r1;
        this.d = r2;
        if ((r1 instanceof eg) == false) goto L5;
        eg r12 = (eg) r1;
    L6:
        if (r12 != null) goto L8;
        r12 = lf.a;
    L8:
        this.e = r12;
        this.f = new wr();
        this.g = new Object();
        return;
    L5:
        r12 = null;
        goto L6
    }

    @Override // defpackage.eg
    public final void c(long r2, i8 r4) {
        this.e.c(r2, r4);
    }

    @Override // defpackage.ke
    public final void d(ge r3, Runnable r4) {
        this.f.a(r4);
        AtomicIntegerFieldUpdater r32 = h;
        if (r32.get(this) >= this.d) goto L20;
        Object r42 = this.g;
        monitor-enter(r42);
    L17:
        th = move-exception;
        throw th;
    L7:
        if (r32.get(this) < this.d) goto L10;
        monitor-exit(r42);
        return;
    L10:
        r32.incrementAndGet(this);     // Catch: Throwable -> L17
        monitor-exit(r42);
        Runnable r33 = f();
        if (r33 == null) goto L23;
        h1 r43 = new h1(this, 7, r33);
        this.c.d(this, r43);
        return;
    L23:
        return;
    }

    public final Runnable f() {
    L2:
        Runnable r0 = (Runnable) this.f.d();
        if (r0 != null) goto L17;
        Object r02 = this.g;
        monitor-enter(r02);
        AtomicIntegerFieldUpdater r1 = h;     // Catch: Throwable -> L14
        r1.decrementAndGet(this);     // Catch: Throwable -> L14
        if (this.f.c() == 0) goto L8;
        r1.incrementAndGet(this);     // Catch: Throwable -> L14
        monitor-exit(r02);
        goto L2
    L8:
        monitor-exit(r02);
        return null;
    L14:
        th = move-exception;
        throw th;
    L17:
        return r0;
    }
}
