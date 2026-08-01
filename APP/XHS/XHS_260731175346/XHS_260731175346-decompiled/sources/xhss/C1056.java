package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛷᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1056 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0976 f3413;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.zip.Inflater f3414;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f3415;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3416;

    public C1056(xhss.C0976 r1, java.util.zip.Inflater r2) {
            r0 = this;
            r0.<init>()
            r0.f3413 = r1
            r0.f3414 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.f3415
            if (r0 == 0) goto L5
            return
        L5:
            java.util.zip.Inflater r0 = r1.f3414
            r0.end()
            r0 = 1
            r1.f3415 = r0
            xhss.ᲁᛸᛵᛳ r1 = r1.f3413
            r1.close()
            return
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0213 mo250() {
            r0 = this;
            xhss.ᲁᛸᛵᛳ r0 = r0.f3413
            xhss.ᲇᲁᲀᲇ r0 = r0.f3177
            xhss.ᛲᲁᲈᛲ r0 = r0.mo250()
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r8, xhss.C0338 r10) {
            r7 = this;
            java.util.zip.Inflater r8 = r7.f3414
        L2:
            boolean r9 = r7.f3415
            r0 = 0
            if (r9 != 0) goto L9e
            r9 = 1
            xhss.ᛲᛳᲁᛳ r9 = r10.m691(r9)     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = r9.f620     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L97
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = (int) r2     // Catch: java.util.zip.DataFormatException -> L97
            boolean r3 = r8.needsInput()     // Catch: java.util.zip.DataFormatException -> L97
            xhss.ᲁᛸᛵᛳ r4 = r7.f3413
            if (r3 != 0) goto L22
            goto L39
        L22:
            boolean r3 = r4.m1606()     // Catch: java.util.zip.DataFormatException -> L97
            if (r3 == 0) goto L29
            goto L39
        L29:
            xhss.ᛴᛲᛴᛶ r3 = r4.f3178     // Catch: java.util.zip.DataFormatException -> L97
            xhss.ᛲᛳᲁᛳ r3 = r3.f1260     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r3.f620     // Catch: java.util.zip.DataFormatException -> L97
            int r6 = r3.f619     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r5 - r6
            r7.f3416 = r5     // Catch: java.util.zip.DataFormatException -> L97
            byte[] r3 = r3.f622     // Catch: java.util.zip.DataFormatException -> L97
            r8.setInput(r3, r6, r5)     // Catch: java.util.zip.DataFormatException -> L97
        L39:
            byte[] r3 = r9.f622     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r9.f620     // Catch: java.util.zip.DataFormatException -> L97
            int r2 = r8.inflate(r3, r5, r2)     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r7.f3416     // Catch: java.util.zip.DataFormatException -> L97
            if (r3 != 0) goto L46
            goto L54
        L46:
            int r5 = r8.getRemaining()     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r3 - r5
            int r5 = r7.f3416     // Catch: java.util.zip.DataFormatException -> L97
            int r5 = r5 - r3
            r7.f3416 = r5     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = (long) r3     // Catch: java.util.zip.DataFormatException -> L97
            r4.m1612(r5)     // Catch: java.util.zip.DataFormatException -> L97
        L54:
            if (r2 <= 0) goto L62
            int r3 = r9.f620     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r3 + r2
            r9.f620 = r3     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = r10.f1261     // Catch: java.util.zip.DataFormatException -> L97
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> L97
            long r5 = r5 + r2
            r10.f1261 = r5     // Catch: java.util.zip.DataFormatException -> L97
            goto L72
        L62:
            int r2 = r9.f619     // Catch: java.util.zip.DataFormatException -> L97
            int r3 = r9.f620     // Catch: java.util.zip.DataFormatException -> L97
            if (r2 != r3) goto L71
            xhss.ᛲᛳᲁᛳ r2 = r9.m391()     // Catch: java.util.zip.DataFormatException -> L97
            r10.f1260 = r2     // Catch: java.util.zip.DataFormatException -> L97
            xhss.AbstractC0185.m445(r9)     // Catch: java.util.zip.DataFormatException -> L97
        L71:
            r2 = r0
        L72:
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 <= 0) goto L77
            return r2
        L77:
            boolean r9 = r8.finished()
            if (r9 != 0) goto L94
            boolean r9 = r8.needsDictionary()
            if (r9 == 0) goto L84
            goto L94
        L84:
            boolean r9 = r4.m1606()
            if (r9 != 0) goto L8c
            goto L2
        L8c:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)
            throw r7
        L94:
            r7 = -1
            return r7
        L97:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L9e:
            java.lang.String r7 = "closed"
            xhss.C0532.m950(r7)
            return r0
    }
}
