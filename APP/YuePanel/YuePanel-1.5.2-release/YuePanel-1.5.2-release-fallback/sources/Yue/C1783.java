package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1783 extends Yue.C5509 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1783 f5500 = null;

    static {
            Yue.ۥ۟ۨۦۥ r0 = new Yue.ۥ۟ۨۦۥ
            r0.<init>()
            Yue.C1783.f5500 = r0
            return
    }

    public C1783() {
            r6 = this;
            int r1 = Yue.C6129.f22089
            int r2 = Yue.C6129.f22090
            long r3 = Yue.C6129.f22091
            java.lang.String r5 = "DefaultDispatcher"
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @Override // Yue.C5509, Yue.AbstractC2277, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // Yue.AbstractC1643
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public final void m8470() {
            r0 = this;
            super.close()
            return
    }
}
