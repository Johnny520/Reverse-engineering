package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0520nf extends AbstractC0450lj implements Executor {

    /* JADX INFO: renamed from: c */
    public static final ExecutorC0520nf f3410c = new ExecutorC0520nf();

    /* JADX INFO: renamed from: d */
    public static final AbstractC0408ke f3411d;

    static {
        AbstractC0408ke c0680rq = q80.f4041c;
        int i = r50.f4212a;
        if (64 >= i) {
            i = 64;
        }
        int iM1300F = AbstractC0273gt.m1300F("kotlinx.coroutines.io.parallelism", i, 12);
        c0680rq.getClass();
        if (iM1300F < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iM1300F).toString());
        }
        if (iM1300F < x50.f5099d) {
            if (iM1300F < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iM1300F).toString());
            }
            c0680rq = new C0680rq(c0680rq, iM1300F);
        }
        f3411d = c0680rq;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: d */
    public final void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        f3411d.mo1598d(interfaceC0258ge, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1598d(C0857wi.f4966a, runnable);
    }

    @Override // p000.AbstractC0408ke
    public final String toString() {
        return "Dispatchers.IO";
    }
}
