package p057e1;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1972b {
    /* JADX INFO: renamed from: b */
    public static C1974c m7131b(boolean z10) {
        return m7130a(new C1974c(z10 ? 1 : 0));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m7132c(C1974c c1974c) {
        return c1974c.get() != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m7133d(C1974c c1974c, boolean z10) {
        return c1974c.compareAndSet(1, z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final void m7134e(C1974c c1974c, boolean z10) {
        c1974c.set(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static C1974c m7130a(C1974c c1974c) {
        return c1974c;
    }
}
