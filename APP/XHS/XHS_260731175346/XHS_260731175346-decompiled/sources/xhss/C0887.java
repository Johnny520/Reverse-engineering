package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛸᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0887 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0976 f2861;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2862;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f2863;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f2864;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f2865;

    public C0887(xhss.C0976 r1) {
            r0 = this;
            r0.<init>()
            r0.f2861 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᲁᛸᛵᛳ r0 = r0.f2861
            xhss.ᲇᲁᲀᲇ r0 = r0.f3177
            xhss.ᛲᲁᲈᛲ r0 = r0.mo250()
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r7, xhss.C0338 r9) {
            r6 = this;
        L0:
            int r7 = r6.f2863
            xhss.ᲁᛸᛵᛳ r8 = r6.f2861
            r0 = -1
            if (r7 != 0) goto L76
            int r7 = r6.f2865
            long r2 = (long) r7
            r8.m1612(r2)
            r7 = 0
            r6.f2865 = r7
            int r7 = r6.f2862
            r7 = r7 & 4
            if (r7 == 0) goto L18
            goto L85
        L18:
            int r7 = r6.f2864
            int r0 = xhss.AbstractC0577.m1049(r8)
            r6.f2863 = r0
            byte r1 = r8.m1615()
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = r8.m1615()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6.f2862 = r2
            java.util.logging.Logger r2 = xhss.C0331.f1243
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            boolean r3 = r2.isLoggable(r3)
            if (r3 == 0) goto L46
            xhss.ᛳᛶᲈᲈ r3 = xhss.AbstractC0922.f2974
            int r3 = r6.f2864
            int r4 = r6.f2862
            r5 = 1
            java.lang.String r0 = xhss.AbstractC0922.m1517(r5, r3, r0, r1, r4)
            r2.fine(r0)
        L46:
            int r8 = r8.m1611()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r0
            r6.f2864 = r8
            r0 = 9
            if (r1 != r0) goto L5f
            if (r8 != r7) goto L57
            goto L0
        L57:
            java.lang.String r6 = "TYPE_CONTINUATION streamId changed"
            xhss.C0532.m947(r6)
            r6 = 0
            return r6
        L5f:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r8 = " != TYPE_CONTINUATION"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L76:
            long r2 = (long) r7
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)
            long r7 = r8.mo235(r2, r9)
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 != 0) goto L86
        L85:
            return r0
        L86:
            int r9 = r6.f2863
            int r0 = (int) r7
            int r9 = r9 - r0
            r6.f2863 = r9
            return r7
    }
}
