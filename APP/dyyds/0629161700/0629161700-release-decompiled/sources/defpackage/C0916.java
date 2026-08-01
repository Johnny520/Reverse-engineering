package defpackage;

/* JADX INFO: renamed from: ᛵᛶᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0916 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0302 f4154;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2131 f4155;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.InputStream f4156;

    public C0916(defpackage.C0302 r2) {
            r1 = this;
            r1.<init>()
            r1.f4154 = r2
            java.lang.Object r2 = r2.f1616
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.InputStream r0 = r2.getInputStream()
            r1.f4156 = r0
            ᲇᲁᛸᛷ r0 = new ᲇᲁᛸᛷ
            r0.<init>(r2)
            r1.f4155 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            ᛲᛶᛲᲁ r0 = r5.f4154
            ᲇᲁᛸᛷ r1 = r5.f4155
            r1.m3418()
            java.lang.Object r2 = r0.f1615     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            java.lang.Object r0 = r0.f1616     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
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
            java.io.InputStream r5 = r5.f4156     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            r5.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
            goto L49
        L42:
            r1.m3419()
            return
        L46:
            r0.close()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L3a
        L49:
            boolean r5 = r1.m3419()
            if (r5 != 0) goto L50
            return
        L50:
            r5 = 0
            java.io.IOException r5 = r1.m3550(r5)
            throw r5
        L56:
            r1.m3419()
            return
        L5a:
            boolean r0 = r1.m3419()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L61
            goto L65
        L61:
            java.io.IOException r5 = r1.m3550(r5)     // Catch: java.lang.Throwable -> L38
        L65:
            throw r5     // Catch: java.lang.Throwable -> L38
        L66:
            r1.m3419()
            throw r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            ᛲᛶᛲᲁ r2 = r2.f4154
            java.lang.Object r2 = r2.f1616
            java.net.Socket r2 = (java.net.Socket) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᲇᲁᛸᛷ r0 = r0.f4155
            return r0
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final long mo782(long r5, defpackage.C1569 r7) {
            r4 = this;
            ᲇᲁᛸᛷ r5 = r4.f4155
            r5.mo1364()
            r6 = 1
            ᲁᲇᛶᛶ r6 = r7.m2846(r6)
            int r0 = r6.f8466
            int r0 = 8192 - r0
            long r0 = (long) r0
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r0 = (int) r0
            r5.m3418()     // Catch: java.lang.AssertionError -> L63
            java.io.InputStream r4 = r4.f4156     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            byte[] r1 = r6.f8467     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r2 = r6.f8466     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            int r4 = r4.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L52
            boolean r0 = r5.m3419()     // Catch: java.lang.AssertionError -> L63
            if (r0 != 0) goto L4a
            r5 = -1
            if (r4 != r5) goto L3e
            int r4 = r6.f8468
            int r5 = r6.f8466
            if (r4 != r5) goto L3b
            ᲁᲇᛶᛶ r4 = r6.m3361()
            r7.f6929 = r4
            defpackage.AbstractC1590.m2869(r6)
        L3b:
            r4 = -1
            return r4
        L3e:
            int r5 = r6.f8466
            int r5 = r5 + r4
            r6.f8466 = r5
            long r5 = r7.f6928
            long r0 = (long) r4
            long r5 = r5 + r0
            r7.f6928 = r5
            return r0
        L4a:
            r4 = 0
            java.io.IOException r4 = r5.m3550(r4)     // Catch: java.lang.AssertionError -> L63
            throw r4     // Catch: java.lang.AssertionError -> L63
        L50:
            r4 = move-exception
            goto L5f
        L52:
            r4 = move-exception
            boolean r6 = r5.m3419()     // Catch: java.lang.Throwable -> L50
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            java.io.IOException r4 = r5.m3550(r4)     // Catch: java.lang.Throwable -> L50
        L5e:
            throw r4     // Catch: java.lang.Throwable -> L50
        L5f:
            r5.m3419()     // Catch: java.lang.AssertionError -> L63
            throw r4     // Catch: java.lang.AssertionError -> L63
        L63:
            r4 = move-exception
            boolean r5 = defpackage.AbstractC1607.m2906(r4)
            if (r5 == 0) goto L70
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L70:
            throw r4
    }
}
