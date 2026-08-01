package p000;

/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0258er extends kotlinx.coroutines.AbstractC0482 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: η */
    public static final p000.ExecutorC0258er f3647 = null;

    /* JADX INFO: renamed from: θ */
    public static final kotlinx.coroutines.AbstractC0479 f3648 = null;

    static {
            er r0 = new er
            r0.<init>()
            p000.ExecutorC0258er.f3647 = r0
            t62 r0 = p000.t62.f10213
            int r1 = p000.j22.f5301
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = p000.u81.m5817(r1, r2, r3)
            kotlinx.coroutines.α r0 = r0.mo3393(r1)
            p000.ExecutorC0258er.f3648 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot be invoked on Dispatchers.IO"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            hz r0 = p000.C0377hz.f4846
            r1.mo1950(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r1, java.lang.Runnable r2) {
            r0 = this;
            kotlinx.coroutines.α r0 = p000.ExecutorC0258er.f3648
            r0.mo1950(r1, r2)
            return
    }
}
