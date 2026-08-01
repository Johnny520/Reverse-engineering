package defpackage;

/* JADX INFO: renamed from: ᛵᛵᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0899 implements defpackage.InterfaceC2085 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0302 f4069;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C2131 f4070;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.OutputStream f4071;

    public C0899(defpackage.C0302 r2) {
            r1 = this;
            r1.<init>()
            r1.f4069 = r2
            java.lang.Object r2 = r2.f1616
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.OutputStream r0 = r2.getOutputStream()
            r1.f4071 = r0
            ᲇᲁᛸᛷ r0 = new ᲇᲁᛸᛷ
            r0.<init>(r2)
            r1.f4070 = r0
            return
    }

    @Override // defpackage.InterfaceC2085, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            java.io.OutputStream r0 = r5.f4071
            ᛲᛶᛲᲁ r1 = r5.f4069
            ᲇᲁᛸᛷ r5 = r5.f4070
            r5.m3418()
            java.lang.Object r2 = r1.f1615     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.lang.Object r1 = r1.f1616     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            java.net.Socket r1 = (java.net.Socket) r1     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        L11:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r4 = r3 & 1
            if (r4 == 0) goto L1b
            r2 = 0
            goto L24
        L1b:
            r4 = r3 | 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r3 == 0) goto L11
            r2 = r4
        L24:
            if (r2 == 0) goto L59
            r3 = 3
            if (r2 == r3) goto L49
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r2 != 0) goto L45
            boolean r2 = r1.isOutputShutdown()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r2 == 0) goto L36
            goto L45
        L36:
            r0.flush()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r1.shutdownOutput()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f java.lang.UnsupportedOperationException -> L41
            goto L4c
        L3d:
            r0 = move-exception
            goto L69
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r0.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            goto L4c
        L45:
            r5.m3419()
            return
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        L4c:
            boolean r0 = r5.m3419()
            if (r0 != 0) goto L53
            return
        L53:
            r0 = 0
            java.io.IOException r5 = r5.m3550(r0)
            throw r5
        L59:
            r5.m3419()
            return
        L5d:
            boolean r1 = r5.m3419()     // Catch: java.lang.Throwable -> L3d
            if (r1 != 0) goto L64
            goto L68
        L64:
            java.io.IOException r0 = r5.m3550(r0)     // Catch: java.lang.Throwable -> L3d
        L68:
            throw r0     // Catch: java.lang.Throwable -> L3d
        L69:
            r5.m3419()
            throw r0
    }

    @Override // defpackage.InterfaceC2085, java.io.Flushable
    public final void flush() {
            r2 = this;
            ᲇᲁᛸᛷ r0 = r2.f4070
            r0.m3418()
            java.io.OutputStream r2 = r2.f4071     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r2.flush()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            boolean r2 = r0.m3419()
            if (r2 != 0) goto L11
            return
        L11:
            r2 = 0
            java.io.IOException r2 = r0.m3550(r2)
            throw r2
        L17:
            r2 = move-exception
            goto L26
        L19:
            r2 = move-exception
            boolean r1 = r0.m3419()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L21
            goto L25
        L21:
            java.io.IOException r2 = r0.m3550(r2)     // Catch: java.lang.Throwable -> L17
        L25:
            throw r2     // Catch: java.lang.Throwable -> L17
        L26:
            r0.m3419()
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sink("
            r0.<init>(r1)
            ᛲᛶᛲᲁ r2 = r2.f4069
            java.lang.Object r2 = r2.f1616
            java.net.Socket r2 = (java.net.Socket) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ */
    public final void mo484(long r7, defpackage.C1569 r9) {
            r6 = this;
            long r0 = r9.f6928
            r2 = 0
            r4 = r7
            defpackage.AbstractC1171.m2271(r0, r2, r4)
        L8:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L67
            ᲇᲁᛸᛷ r1 = r6.f4070
            r1.mo1364()
            ᲁᲇᛶᛶ r0 = r9.f6929
            int r2 = r0.f8466
            int r3 = r0.f8468
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r7, r2)
            int r2 = (int) r2
            r1.m3418()
            java.io.OutputStream r3 = r6.f4071     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            byte[] r4 = r0.f8467     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r5 = r0.f8468     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r3.write(r4, r5, r2)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            boolean r3 = r1.m3419()
            if (r3 != 0) goto L4c
            int r1 = r0.f8468
            int r1 = r1 + r2
            r0.f8468 = r1
            long r2 = (long) r2
            long r7 = r7 - r2
            long r4 = r9.f6928
            long r4 = r4 - r2
            r9.f6928 = r4
            int r2 = r0.f8466
            if (r1 != r2) goto L8
            ᲁᲇᛶᛶ r1 = r0.m3361()
            r9.f6929 = r1
            defpackage.AbstractC1590.m2869(r0)
            goto L8
        L4c:
            r6 = 0
            java.io.IOException r6 = r1.m3550(r6)
            throw r6
        L52:
            r0 = move-exception
            r6 = r0
            goto L63
        L55:
            r0 = move-exception
            r6 = r0
            boolean r7 = r1.m3419()     // Catch: java.lang.Throwable -> L52
            if (r7 != 0) goto L5e
            goto L62
        L5e:
            java.io.IOException r6 = r1.m3550(r6)     // Catch: java.lang.Throwable -> L52
        L62:
            throw r6     // Catch: java.lang.Throwable -> L52
        L63:
            r1.m3419()
            throw r6
        L67:
            return
    }

    @Override // defpackage.InterfaceC2085
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo485() {
            r0 = this;
            ᲇᲁᛸᛷ r0 = r0.f4070
            return r0
    }
}
