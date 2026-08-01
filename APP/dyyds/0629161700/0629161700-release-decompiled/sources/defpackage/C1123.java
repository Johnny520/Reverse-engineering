package defpackage;

/* JADX INFO: renamed from: ᛶᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1123 extends defpackage.AbstractC0767 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1123 f5006 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.ExecutorC1078 f5007;

    static {
            ᛶᛸᛳ r0 = new ᛶᛸᛳ
            int r5 = defpackage.AbstractC1155.f5251
            int r6 = defpackage.AbstractC1155.f5250
            long r2 = defpackage.AbstractC1155.f5249
            java.lang.String r4 = defpackage.AbstractC1155.f5252
            r0.<init>()
            ᛶᛵᛸᲁ r1 = new ᛶᛵᛸᲁ
            r1.<init>(r2, r4, r5, r6)
            r0.f5007 = r1
            defpackage.C1123.f5006 = r0
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

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public final void mo572(defpackage.InterfaceC0493 r1, java.lang.Runnable r2) {
            r0 = this;
            ᛶᛵᛸᲁ r0 = r0.f5007
            r1 = 0
            r0.m2058(r2, r1)
            return
    }
}
