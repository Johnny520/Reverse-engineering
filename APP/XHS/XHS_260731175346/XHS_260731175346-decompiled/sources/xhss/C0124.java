package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛱᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0124 extends xhss.AbstractC0959 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0124 f549 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.ExecutorC0335 f550;

    static {
            xhss.ᛲᛱᛶᲇ r0 = new xhss.ᛲᛱᛶᲇ
            int r5 = xhss.AbstractC0662.f2269
            int r6 = xhss.AbstractC0662.f2272
            long r2 = xhss.AbstractC0662.f2270
            java.lang.String r4 = xhss.AbstractC0662.f2271
            r0.<init>()
            xhss.ᛴᛱᲀᛴ r1 = new xhss.ᛴᛱᲀᛴ
            r1.<init>(r2, r4, r5, r6)
            r0.f550 = r1
            xhss.C0124.f549 = r0
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

    @Override // xhss.AbstractC0180
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void mo359(xhss.InterfaceC0362 r1, java.lang.Runnable r2) {
            r0 = this;
            xhss.ᛴᛱᲀᛴ r0 = r0.f550
            r1 = 0
            r0.m678(r2, r1)
            return
    }
}
