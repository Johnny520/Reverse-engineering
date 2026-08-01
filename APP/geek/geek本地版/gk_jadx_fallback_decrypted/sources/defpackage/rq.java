package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends defpackage.ke implements defpackage.eg {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater h = null;
    public final defpackage.ke c;
    public final int d;
    public final /* synthetic */ defpackage.eg e;
    public final defpackage.wr f;
    public final java.lang.Object g;
    private volatile int runningWorkers;

    static {
            java.lang.Class<rq> r0 = defpackage.rq.class
            java.lang.String r1 = "runningWorkers"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.rq.h = r0
            return
    }

    public rq(defpackage.ke r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            boolean r2 = r1 instanceof defpackage.eg
            if (r2 == 0) goto Le
            eg r1 = (defpackage.eg) r1
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 != 0) goto L13
            eg r1 = defpackage.lf.a
        L13:
            r0.e = r1
            wr r1 = new wr
            r1.<init>()
            r0.f = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.g = r1
            return
    }

    @Override // defpackage.eg
    public final void c(long r2, defpackage.i8 r4) {
            r1 = this;
            eg r0 = r1.e
            r0.c(r2, r4)
            return
    }

    @Override // defpackage.ke
    public final void d(defpackage.ge r3, java.lang.Runnable r4) {
            r2 = this;
            wr r3 = r2.f
            r3.a(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.rq.h
            int r4 = r3.get(r2)
            int r0 = r2.d
            if (r4 >= r0) goto L36
            java.lang.Object r4 = r2.g
            monitor-enter(r4)
            int r0 = r3.get(r2)     // Catch: java.lang.Throwable -> L33
            int r1 = r2.d     // Catch: java.lang.Throwable -> L33
            if (r0 < r1) goto L1c
            monitor-exit(r4)
            return
        L1c:
            r3.incrementAndGet(r2)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r4)
            java.lang.Runnable r3 = r2.f()
            if (r3 != 0) goto L27
            goto L36
        L27:
            h1 r4 = new h1
            r0 = 7
            r4.<init>(r2, r0, r3)
            ke r3 = r2.c
            r3.d(r2, r4)
            return
        L33:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L36:
            return
    }

    public final java.lang.Runnable f() {
            r3 = this;
        L0:
            wr r0 = r3.f
            java.lang.Object r0 = r0.d()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L25
            java.lang.Object r0 = r3.g
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.rq.h     // Catch: java.lang.Throwable -> L22
            r1.decrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            wr r2 = r3.f     // Catch: java.lang.Throwable -> L22
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1d
            monitor-exit(r0)
            r0 = 0
            return r0
        L1d:
            r1.incrementAndGet(r3)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L0
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L25:
            return r0
    }
}
