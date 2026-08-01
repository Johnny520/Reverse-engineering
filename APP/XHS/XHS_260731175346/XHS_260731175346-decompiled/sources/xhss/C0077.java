package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0077 extends xhss.AbstractC1133 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0323 f418;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public long f419;

    public C0077(xhss.C0323 r1, xhss.C0669 r2, long r3) {
            r0 = this;
            r0.f418 = r1
            r0.<init>(r1, r2)
            r0.f419 = r3
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            xhss.ᲁᛸᛱᛵ r1 = xhss.C0972.f3172
            r0.m1826(r1)
        L12:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            boolean r0 = r4.f3660
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r4.f419
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 100
            boolean r0 = xhss.AbstractC0559.m995(r4, r0)     // Catch: java.io.IOException -> L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L23
            xhss.ᛳᲇᲁᲈ r0 = r4.f418
            xhss.ᲀᲀᲁᛱ r0 = r0.f1232
            r0.mo593()
            xhss.ᲁᛸᛱᛵ r0 = xhss.C0323.f1231
            r4.m1826(r0)
        L23:
            r0 = 1
            r4.f3660 = r0
            return
    }

    @Override // xhss.AbstractC1133, xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final long mo235(long r8, xhss.C0338 r10) {
            r7 = this;
            boolean r8 = r7.f3660
            r0 = 0
            if (r8 != 0) goto L40
            long r8 = r7.f419
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto Lf
            return r3
        Lf:
            r5 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r8, r5)
            long r8 = super.mo235(r8, r10)
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 == 0) goto L2c
            long r2 = r7.f419
            long r2 = r2 - r8
            r7.f419 = r2
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L2b
            xhss.ᲁᛸᛱᛵ r10 = xhss.C0972.f3172
            r7.m1826(r10)
        L2b:
            return r8
        L2c:
            xhss.ᛳᲇᲁᲈ r8 = r7.f418
            xhss.ᲀᲀᲁᛱ r8 = r8.f1232
            r8.mo593()
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "unexpected end of stream"
            r8.<init>(r9)
            xhss.ᲁᛸᛱᛵ r9 = xhss.C0323.f1231
            r7.m1826(r9)
            throw r8
        L40:
            java.lang.String r7 = "closed"
            xhss.C0532.m950(r7)
            return r0
    }
}
