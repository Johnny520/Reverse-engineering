package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛷᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0290 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.InputStream f1121;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0213 f1122;

    public C0290(java.io.InputStream r1, xhss.C0213 r2) {
            r0 = this;
            r0.<init>()
            r0.f1121 = r1
            r0.f1122 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.f1121
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            java.io.InputStream r2 = r2.f1121
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᛲᲁᲈᛲ r0 = r0.f1122
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r5, xhss.C0338 r7) {
            r4 = this;
            xhss.ᛲᲁᲈᛲ r5 = r4.f1122     // Catch: java.lang.AssertionError -> L41
            r5.mo483()     // Catch: java.lang.AssertionError -> L41
            r5 = 1
            xhss.ᛲᛳᲁᛳ r5 = r7.m691(r5)     // Catch: java.lang.AssertionError -> L41
            int r6 = r5.f620     // Catch: java.lang.AssertionError -> L41
            int r6 = 8192 - r6
            long r0 = (long) r6     // Catch: java.lang.AssertionError -> L41
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.AssertionError -> L41
            int r6 = (int) r0     // Catch: java.lang.AssertionError -> L41
            java.io.InputStream r4 = r4.f1121     // Catch: java.lang.AssertionError -> L41
            byte[] r0 = r5.f622     // Catch: java.lang.AssertionError -> L41
            int r1 = r5.f620     // Catch: java.lang.AssertionError -> L41
            int r4 = r4.read(r0, r1, r6)     // Catch: java.lang.AssertionError -> L41
            r6 = -1
            if (r4 != r6) goto L35
            int r4 = r5.f619     // Catch: java.lang.AssertionError -> L41
            int r6 = r5.f620     // Catch: java.lang.AssertionError -> L41
            if (r4 != r6) goto L32
            xhss.ᛲᛳᲁᛳ r4 = r5.m391()     // Catch: java.lang.AssertionError -> L41
            r7.f1260 = r4     // Catch: java.lang.AssertionError -> L41
            xhss.AbstractC0185.m445(r5)     // Catch: java.lang.AssertionError -> L41
        L32:
            r4 = -1
            return r4
        L35:
            int r6 = r5.f620     // Catch: java.lang.AssertionError -> L41
            int r6 = r6 + r4
            r5.f620 = r6     // Catch: java.lang.AssertionError -> L41
            long r5 = r7.f1261     // Catch: java.lang.AssertionError -> L41
            long r0 = (long) r4     // Catch: java.lang.AssertionError -> L41
            long r5 = r5 + r0
            r7.f1261 = r5     // Catch: java.lang.AssertionError -> L41
            return r0
        L41:
            r4 = move-exception
            boolean r5 = xhss.AbstractC0235.m540(r4)
            if (r5 == 0) goto L4e
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L4e:
            throw r4
    }
}
