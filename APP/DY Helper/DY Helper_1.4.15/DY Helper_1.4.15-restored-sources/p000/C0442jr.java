package p000;

/* JADX INFO: renamed from: jr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0442jr extends kotlinx.coroutines.AbstractC0482 {

    /* JADX INFO: renamed from: θ */
    public static final p000.C0442jr f5554 = null;

    /* JADX INFO: renamed from: η */
    public p000.ExecutorC0049aq f5555;

    static {
            jr r0 = new jr
            int r2 = p000.y22.f12431
            int r3 = p000.y22.f12432
            long r4 = p000.y22.f12433
            java.lang.String r6 = p000.y22.f12429
            r0.<init>()
            aq r1 = new aq
            r1.<init>(r2, r3, r4, r6)
            r0.f5555 = r1
            p000.C0442jr.f5554 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Dispatchers.Default cannot be closed"
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r1, java.lang.Runnable r2) {
            r0 = this;
            aq r0 = r0.f5555
            r1 = 6
            p000.ExecutorC0049aq.m573(r0, r2, r1)
            return
    }
}
