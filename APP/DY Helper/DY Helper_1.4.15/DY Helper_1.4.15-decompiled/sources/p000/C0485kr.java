package p000;

/* JADX INFO: renamed from: kr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0485kr implements p000.iw1 {

    /* JADX INFO: renamed from: ε */
    public final java.io.OutputStream f6094;

    /* JADX INFO: renamed from: ζ */
    public final p000.nx1 f6095;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0379i0 f6096;

    public C0485kr(p000.C0379i0 r2) {
            r1 = this;
            r1.<init>()
            r1.f6096 = r2
            java.lang.Object r2 = r2.f4857
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.OutputStream r0 = r2.getOutputStream()
            r1.f6094 = r0
            nx1 r0 = new nx1
            r0.<init>(r2)
            r1.f6095 = r0
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            java.io.OutputStream r0 = r5.f6094
            i0 r1 = r5.f6096
            nx1 r5 = r5.f6095
            r5.m2628()
            java.lang.Object r2 = r1.f4858     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.lang.Object r1 = r1.f4857     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            java.net.Socket r1 = (java.net.Socket) r1     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
        L14:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r4 = r3 & 1
            if (r4 == 0) goto L1e
            r2 = 0
            goto L27
        L1e:
            r4 = r3 | 1
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r3 == 0) goto L14
            r2 = r4
        L27:
            if (r2 == 0) goto L5c
            r3 = 3
            if (r2 == r3) goto L4c
            boolean r2 = r1.isClosed()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r2 != 0) goto L48
            boolean r2 = r1.isOutputShutdown()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            if (r2 == 0) goto L39
            goto L48
        L39:
            r0.flush()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            r1.shutdownOutput()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42 java.lang.UnsupportedOperationException -> L44
            goto L4f
        L40:
            r0 = move-exception
            goto L6c
        L42:
            r0 = move-exception
            goto L60
        L44:
            r0.close()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
            goto L4f
        L48:
            r5.m2629()
            return
        L4c:
            r1.close()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L42
        L4f:
            boolean r0 = r5.m2629()
            if (r0 != 0) goto L56
            return
        L56:
            r0 = 0
            java.io.IOException r5 = r5.mo2630(r0)
            throw r5
        L5c:
            r5.m2629()
            return
        L60:
            boolean r1 = r5.m2629()     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L67
            goto L6b
        L67:
            java.io.IOException r0 = r5.mo2630(r0)     // Catch: java.lang.Throwable -> L40
        L6b:
            throw r0     // Catch: java.lang.Throwable -> L40
        L6c:
            r5.m2629()
            throw r0
    }

    @Override // p000.iw1, java.io.Flushable
    public final void flush() {
            r2 = this;
            nx1 r0 = r2.f6095
            r0.m2628()
            java.io.OutputStream r2 = r2.f6094     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            r2.flush()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
            boolean r2 = r0.m2629()
            if (r2 != 0) goto L11
            return
        L11:
            r2 = 0
            java.io.IOException r2 = r0.mo2630(r2)
            throw r2
        L17:
            r2 = move-exception
            goto L26
        L19:
            r2 = move-exception
            boolean r1 = r0.m2629()     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L21
            goto L25
        L21:
            java.io.IOException r2 = r0.mo2630(r2)     // Catch: java.lang.Throwable -> L17
        L25:
            throw r2     // Catch: java.lang.Throwable -> L17
        L26:
            r0.m2629()
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "sink("
            r0.<init>(r1)
            i0 r2 = r2.f6096
            java.lang.Object r2 = r2.f4857
            java.net.Socket r2 = (java.net.Socket) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            nx1 r0 = r0.f6095
            return r0
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r7, p000.C0793sc r9) {
            r6 = this;
            long r0 = r9.f9828
            r2 = 0
            r4 = r7
            p000.ln0.m3629(r0, r2, r4)
        L8:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L6a
            nx1 r1 = r6.f6095
            r1.mo2873()
            rr1 r0 = r9.f9827
            r0.getClass()
            int r2 = r0.f9473
            int r3 = r0.f9472
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = java.lang.Math.min(r7, r2)
            int r2 = (int) r2
            r1.m2628()
            java.io.OutputStream r3 = r6.f6094     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            byte[] r4 = r0.f9471     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            int r5 = r0.f9472     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            r3.write(r4, r5, r2)     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L58
            boolean r3 = r1.m2629()
            if (r3 != 0) goto L4f
            int r1 = r0.f9472
            int r1 = r1 + r2
            r0.f9472 = r1
            long r2 = (long) r2
            long r7 = r7 - r2
            long r4 = r9.f9828
            long r4 = r4 - r2
            r9.f9828 = r4
            int r2 = r0.f9473
            if (r1 != r2) goto L8
            rr1 r1 = r0.m5123()
            r9.f9827 = r1
            p000.tr1.m5737(r0)
            goto L8
        L4f:
            r6 = 0
            java.io.IOException r6 = r1.mo2630(r6)
            throw r6
        L55:
            r0 = move-exception
            r6 = r0
            goto L66
        L58:
            r0 = move-exception
            r6 = r0
            boolean r7 = r1.m2629()     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L61
            goto L65
        L61:
            java.io.IOException r6 = r1.mo2630(r6)     // Catch: java.lang.Throwable -> L55
        L65:
            throw r6     // Catch: java.lang.Throwable -> L55
        L66:
            r1.m2629()
            throw r6
        L6a:
            return
    }
}
