package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛵᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0862 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC1095 f2785;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final long f2786;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public long f2787;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1066 f2788;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public boolean f2789;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public boolean f2790;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final boolean f2791;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f2792;

    public C0862(xhss.C1066 r1, xhss.InterfaceC1095 r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f2788 = r1
            r0.f2785 = r2
            r0.f2786 = r3
            r0.f2791 = r5
            r1 = 1
            r0.f2792 = r1
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L18
            r1 = 0
            r0.m1438(r1)
        L18:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f2789
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f2789 = r0
            r1.m1437()     // Catch: java.io.IOException -> L10
            r0 = 0
            r1.m1438(r0)     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.io.IOException r1 = r1.m1438(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<xhss.ᲀᛵᛶᲀ> r1 = xhss.C0862.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
            xhss.ᲇᲁᲀᲇ r2 = r2.f2785
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m1437() {
            r0 = this;
            xhss.ᲇᲁᲀᲇ r0 = r0.f2785
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.io.IOException m1438(java.io.IOException r3) {
            r2 = this;
            boolean r0 = r2.f2790
            if (r0 == 0) goto L5
            return r3
        L5:
            r0 = 1
            r2.f2790 = r0
            if (r3 != 0) goto L1a
            boolean r0 = r2.f2792
            if (r0 == 0) goto L1a
            r0 = 0
            r2.f2792 = r0
            xhss.ᲇᛸᛵᛴ r0 = r2.f2788
            xhss.ᛸᲇᲇᛶ r0 = r0.f3440
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665
            r0.getClass()
        L1a:
            xhss.ᲇᛸᛵᛴ r0 = r2.f2788
            boolean r2 = r2.f2791
            r1 = 8
            java.io.IOException r2 = xhss.C1066.m1722(r0, r2, r3, r1)
            return r2
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᲇᲁᲀᲇ r0 = r0.f2785
            xhss.ᛲᲁᲈᛲ r0 = r0.mo250()
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r9, xhss.C0338 r11) {
            r8 = this;
            java.lang.String r9 = "expected "
            boolean r10 = r8.f2789
            if (r10 != 0) goto L6b
            xhss.ᲇᲁᲀᲇ r10 = r8.f2785     // Catch: java.io.IOException -> L1f
            r0 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10.mo235(r0, r11)     // Catch: java.io.IOException -> L1f
            boolean r0 = r8.f2792     // Catch: java.io.IOException -> L1f
            if (r0 == 0) goto L21
            r0 = 0
            r8.f2792 = r0     // Catch: java.io.IOException -> L1f
            xhss.ᲇᛸᛵᛴ r0 = r8.f2788     // Catch: java.io.IOException -> L1f
            xhss.ᛸᲇᲇᛶ r0 = r0.f3440     // Catch: java.io.IOException -> L1f
            xhss.ᲀᲀᛱᲇ r0 = r0.f2665     // Catch: java.io.IOException -> L1f
            r0.getClass()     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r9 = move-exception
            goto L66
        L21:
            r0 = -1
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L2c
            r8.m1438(r3)     // Catch: java.io.IOException -> L1f
            return r0
        L2c:
            long r4 = r8.f2787     // Catch: java.io.IOException -> L1f
            long r4 = r4 + r10
            long r6 = r8.f2786     // Catch: java.io.IOException -> L1f
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L3a
            goto L56
        L3a:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.io.IOException -> L1f
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1f
            r11.<init>(r9)     // Catch: java.io.IOException -> L1f
            long r0 = r8.f2786     // Catch: java.io.IOException -> L1f
            r11.append(r0)     // Catch: java.io.IOException -> L1f
            java.lang.String r9 = " bytes but received "
            r11.append(r9)     // Catch: java.io.IOException -> L1f
            r11.append(r4)     // Catch: java.io.IOException -> L1f
            java.lang.String r9 = r11.toString()     // Catch: java.io.IOException -> L1f
            r10.<init>(r9)     // Catch: java.io.IOException -> L1f
            throw r10     // Catch: java.io.IOException -> L1f
        L56:
            r8.f2787 = r4     // Catch: java.io.IOException -> L1f
            xhss.ᲇᛸᛵᛴ r9 = r8.f2788     // Catch: java.io.IOException -> L1f
            xhss.ᛷᛶᛷᛲ r9 = r9.f3439     // Catch: java.io.IOException -> L1f
            boolean r9 = r9.mo632()     // Catch: java.io.IOException -> L1f
            if (r9 == 0) goto L65
            r8.m1438(r3)     // Catch: java.io.IOException -> L1f
        L65:
            return r10
        L66:
            java.io.IOException r8 = r8.m1438(r9)
            throw r8
        L6b:
            java.lang.String r8 = "closed"
            xhss.C0532.m950(r8)
            r8 = 0
            return r8
    }
}
