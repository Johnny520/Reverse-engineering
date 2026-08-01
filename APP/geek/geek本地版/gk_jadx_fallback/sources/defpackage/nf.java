package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends defpackage.lj implements java.util.concurrent.Executor {
    public static final defpackage.nf c = null;
    public static final defpackage.ke d = null;

    static {
            nf r0 = new nf
            r0.<init>()
            defpackage.nf.c = r0
            q80 r0 = defpackage.q80.c
            int r1 = defpackage.r50.a
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = defpackage.gt.F(r3, r1, r2)
            r0.getClass()
            java.lang.String r2 = "Expected positive parallelism level, but got "
            r3 = 1
            if (r1 < r3) goto L47
            int r4 = defpackage.x50.d
            if (r1 < r4) goto L26
            goto L2e
        L26:
            if (r1 < r3) goto L31
            rq r2 = new rq
            r2.<init>(r0, r1)
            r0 = r2
        L2e:
            defpackage.nf.d = r0
            return
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L47:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot be invoked on Dispatchers.IO"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.ke
    public final void d(defpackage.ge r2, java.lang.Runnable r3) {
            r1 = this;
            ke r0 = defpackage.nf.d
            r0.d(r2, r3)
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            wi r0 = defpackage.wi.a
            r1.d(r0, r2)
            return
    }

    @Override // defpackage.ke
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }
}
