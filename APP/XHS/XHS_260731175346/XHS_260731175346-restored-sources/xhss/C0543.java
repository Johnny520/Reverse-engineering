package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛲᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0543 extends xhss.AbstractC1133 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f1962;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f3660
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r1.f1962
            if (r0 != 0) goto Le
            xhss.ᲁᛸᛱᛵ r0 = xhss.C0323.f1231
            r1.m1826(r0)
        Le:
            r0 = 1
            r1.f3660 = r0
            return
    }

    @Override // xhss.AbstractC1133, xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r3, xhss.C0338 r5) {
            r2 = this;
            boolean r3 = r2.f3660
            if (r3 != 0) goto L1f
            boolean r3 = r2.f1962
            r0 = -1
            if (r3 == 0) goto Lb
            return r0
        Lb:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = super.mo235(r3, r5)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L1e
            r3 = 1
            r2.f1962 = r3
            xhss.ᲁᛸᛱᛵ r3 = xhss.C0972.f3172
            r2.m1826(r3)
            return r0
        L1e:
            return r3
        L1f:
            java.lang.String r2 = "closed"
            xhss.C0532.m950(r2)
            r2 = 0
            return r2
    }
}
