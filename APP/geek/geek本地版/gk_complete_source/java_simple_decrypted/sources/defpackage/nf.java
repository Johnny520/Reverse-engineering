package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends lj implements Executor {
    public static final nf c = null;
    public static final ke d = null;

    static {
        c = new nf();
        ke r0 = q80.c;
        int r1 = r50.a;
        if (64 < r1) goto L6;
        r1 = 64;
    L6:
        int r12 = gt.F("kotlinx.coroutines.io.parallelism", r1, 12);
        r0.getClass();
        if (r12 < 1) goto L18;
        if (r12 >= x50.d) goto L13;
        if (r12 < 1) goto L16;
        r0 = new rq(r0, r12);
        goto L13
    L16:
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + r12).toString());
    L13:
        d = r0;
        return;
    L18:
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + r12).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.ke
    public final void d(ge r2, Runnable r3) {
        d.d(r2, r3);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        d(wi.a, r2);
    }

    @Override // defpackage.ke
    public final String toString() {
        return "Dispatchers.IO";
    }
}
