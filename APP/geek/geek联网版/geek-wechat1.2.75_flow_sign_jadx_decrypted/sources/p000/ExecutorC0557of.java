package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: of */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0557of extends AbstractC0524nj implements Executor {

    /* JADX INFO: renamed from: c */
    public static final ExecutorC0557of f3450c = new ExecutorC0557of();

    /* JADX INFO: renamed from: d */
    public static final AbstractC0445le f3451d;

    static {
        AbstractC0445le c0827vq = v80.f4919c;
        int i = y50.f5358a;
        if (64 >= i) {
            i = 64;
        }
        int iM1884H = AbstractC0498mu.m1884H("kotlinx.coroutines.io.parallelism", i, 12);
        c0827vq.getClass();
        if (iM1884H < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iM1884H).toString());
        }
        if (iM1884H < d60.f1321d) {
            if (iM1884H < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + iM1884H).toString());
            }
            c0827vq = new C0827vq(c0827vq, iM1884H);
        }
        f3451d = c0827vq;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: d */
    public final void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        f3451d.mo584d(interfaceC0295he, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo584d(C0931yi.f5432a, runnable);
    }

    @Override // p000.AbstractC0445le
    public final String toString() {
        return "Dispatchers.IO";
    }
}
