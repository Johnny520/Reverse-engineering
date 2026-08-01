package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲇᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0823 implements xhss.InterfaceC1095 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.InputStream f2684;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C1082 f2685;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C1068 f2686;

    public C0823(xhss.C1068 r2) {
            r1 = this;
            r1.<init>()
            r1.f2686 = r2
            java.lang.Object r2 = r2.f3444
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.InputStream r0 = r2.getInputStream()
            r1.f2684 = r0
            xhss.ᲇᲀᲁᛲ r0 = new xhss.ᲇᲀᲁᛲ
            r0.<init>(r2)
            r1.f2685 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            xhss.ᲇᛸᛶ r0 = r5.f2686
            xhss.ᲇᲀᲁᛲ r1 = r5.f2685
            r1.m1893()
            java.lang.Object r2 = r0.f3446     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.Object r0 = r0.f3444     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.net.Socket r0 = (java.net.Socket) r0     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        Lf:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r4 = r3 & 2
            if (r4 == 0) goto L19
            r2 = 0
            goto L22
        L19:
            r4 = r3 | 2
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r3 == 0) goto Lf
            r2 = r4
        L22:
            if (r2 == 0) goto L56
            r3 = 3
            if (r2 == r3) goto L46
            boolean r2 = r0.isClosed()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r2 != 0) goto L42
            boolean r2 = r0.isInputShutdown()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            if (r2 == 0) goto L34
            goto L42
        L34:
            r0.shutdownInput()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a java.lang.UnsupportedOperationException -> L3c
            goto L49
        L38:
            r5 = move-exception
            goto L66
        L3a:
            r5 = move-exception
            goto L5a
        L3c:
            java.io.InputStream r5 = r5.f2684     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r5.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            goto L49
        L42:
            r1.m1892()
            return
        L46:
            r0.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L49:
            boolean r5 = r1.m1892()
            if (r5 != 0) goto L50
            return
        L50:
            r5 = 0
            java.io.IOException r5 = r1.m1743(r5)
            throw r5
        L56:
            r1.m1892()
            return
        L5a:
            boolean r0 = r1.m1892()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L61
            goto L65
        L61:
            java.io.IOException r5 = r1.m1743(r5)     // Catch: java.lang.Throwable -> L38
        L65:
            throw r5     // Catch: java.lang.Throwable -> L38
        L66:
            r1.m1892()
            throw r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            xhss.ᲇᛸᛶ r2 = r2.f2686
            java.lang.Object r2 = r2.f3444
            java.net.Socket r2 = (java.net.Socket) r2
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
            xhss.ᲇᲀᲁᛲ r0 = r0.f2685
            return r0
    }

    @Override // xhss.InterfaceC1095
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final long mo235(long r5, xhss.C0338 r7) {
            r4 = this;
            xhss.ᲇᲀᲁᛲ r5 = r4.f2685
            r5.mo483()
            r6 = 1
            xhss.ᛲᛳᲁᛳ r6 = r7.m691(r6)
            int r0 = r6.f620
            int r0 = 8192 - r0
            long r0 = (long) r0
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r0 = (int) r0
            r5.m1893()     // Catch: java.lang.AssertionError -> L63
            java.io.InputStream r4 = r4.f2684     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            byte[] r1 = r6.f622     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r2 = r6.f620     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r4 = r4.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            boolean r0 = r5.m1892()     // Catch: java.lang.AssertionError -> L63
            if (r0 != 0) goto L4a
            r5 = -1
            if (r4 != r5) goto L3e
            int r4 = r6.f619
            int r5 = r6.f620
            if (r4 != r5) goto L3b
            xhss.ᛲᛳᲁᛳ r4 = r6.m391()
            r7.f1260 = r4
            xhss.AbstractC0185.m445(r6)
        L3b:
            r4 = -1
            return r4
        L3e:
            int r5 = r6.f620
            int r5 = r5 + r4
            r6.f620 = r5
            long r5 = r7.f1261
            long r0 = (long) r4
            long r5 = r5 + r0
            r7.f1261 = r5
            return r0
        L4a:
            r4 = 0
            java.io.IOException r4 = r5.m1743(r4)     // Catch: java.lang.AssertionError -> L63
            throw r4     // Catch: java.lang.AssertionError -> L63
        L50:
            r4 = move-exception
            goto L5f
        L52:
            r4 = move-exception
            boolean r6 = r5.m1892()     // Catch: java.lang.Throwable -> L50
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            java.io.IOException r4 = r5.m1743(r4)     // Catch: java.lang.Throwable -> L50
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L50
        L5f:
            r5.m1892()     // Catch: java.lang.AssertionError -> L63
            throw r4     // Catch: java.lang.AssertionError -> L63
        L63:
            r4 = move-exception
            boolean r5 = xhss.AbstractC0235.m540(r4)
            if (r5 == 0) goto L70
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L70:
            throw r4
    }
}
