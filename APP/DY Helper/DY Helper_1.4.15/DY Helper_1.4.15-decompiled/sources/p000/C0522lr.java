package p000;

/* JADX INFO: renamed from: lr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0522lr implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final java.io.InputStream f6745;

    /* JADX INFO: renamed from: ζ */
    public final p000.nx1 f6746;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0379i0 f6747;

    public C0522lr(p000.C0379i0 r2) {
            r1 = this;
            r1.<init>()
            r1.f6747 = r2
            java.lang.Object r2 = r2.f4857
            java.net.Socket r2 = (java.net.Socket) r2
            java.io.InputStream r0 = r2.getInputStream()
            r1.f6745 = r0
            nx1 r0 = new nx1
            r0.<init>(r2)
            r1.f6746 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r5 = this;
            i0 r0 = r5.f6747
            nx1 r1 = r5.f6746
            r1.m2628()
            java.lang.Object r2 = r0.f4858     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.lang.Object r0 = r0.f4857     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.net.Socket r0 = (java.net.Socket) r0     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r2.getClass()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L12:
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r4 = r3 & 2
            if (r4 == 0) goto L1c
            r2 = 0
            goto L25
        L1c:
            r4 = r3 | 2
            boolean r3 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r3 == 0) goto L12
            r2 = r4
        L25:
            if (r2 == 0) goto L59
            r3 = 3
            if (r2 == r3) goto L49
            boolean r2 = r0.isClosed()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r2 != 0) goto L45
            boolean r2 = r0.isInputShutdown()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r2 == 0) goto L37
            goto L45
        L37:
            r0.shutdownInput()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d java.lang.UnsupportedOperationException -> L3f
            goto L4c
        L3b:
            r5 = move-exception
            goto L69
        L3d:
            r5 = move-exception
            goto L5d
        L3f:
            java.io.InputStream r5 = r5.f6745     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.close()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            goto L4c
        L45:
            r1.m2629()
            return
        L49:
            r0.close()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L4c:
            boolean r5 = r1.m2629()
            if (r5 != 0) goto L53
            return
        L53:
            r5 = 0
            java.io.IOException r5 = r1.mo2630(r5)
            throw r5
        L59:
            r1.m2629()
            return
        L5d:
            boolean r0 = r1.m2629()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L64
            goto L68
        L64:
            java.io.IOException r5 = r1.mo2630(r5)     // Catch: java.lang.Throwable -> L3b
        L68:
            throw r5     // Catch: java.lang.Throwable -> L3b
        L69:
            r1.m2629()
            throw r5
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            i0 r2 = r2.f6747
            java.lang.Object r2 = r2.f4857
            java.net.Socket r2 = (java.net.Socket) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            nx1 r0 = r0.f6746
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r5, p000.C0793sc r7) {
            r4 = this;
            r7.getClass()
            nx1 r5 = r4.f6746
            r5.mo2873()
            r6 = 1
            rr1 r6 = r7.m5462(r6)
            int r0 = r6.f9473
            int r0 = 8192 - r0
            long r0 = (long) r0
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r0 = (int) r0
            r5.m2628()     // Catch: java.lang.AssertionError -> L66
            java.io.InputStream r4 = r4.f6745     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            byte[] r1 = r6.f9471     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            int r2 = r6.f9473     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            int r4 = r4.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            boolean r0 = r5.m2629()     // Catch: java.lang.AssertionError -> L66
            if (r0 != 0) goto L4d
            r5 = -1
            if (r4 != r5) goto L41
            int r4 = r6.f9472
            int r5 = r6.f9473
            if (r4 != r5) goto L3e
            rr1 r4 = r6.m5123()
            r7.f9827 = r4
            p000.tr1.m5737(r6)
        L3e:
            r4 = -1
            return r4
        L41:
            int r5 = r6.f9473
            int r5 = r5 + r4
            r6.f9473 = r5
            long r5 = r7.f9828
            long r0 = (long) r4
            long r5 = r5 + r0
            r7.f9828 = r5
            return r0
        L4d:
            r4 = 0
            java.io.IOException r4 = r5.mo2630(r4)     // Catch: java.lang.AssertionError -> L66
            throw r4     // Catch: java.lang.AssertionError -> L66
        L53:
            r4 = move-exception
            goto L62
        L55:
            r4 = move-exception
            boolean r6 = r5.m2629()     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L5d
            goto L61
        L5d:
            java.io.IOException r4 = r5.mo2630(r4)     // Catch: java.lang.Throwable -> L53
        L61:
            throw r4     // Catch: java.lang.Throwable -> L53
        L62:
            r5.m2629()     // Catch: java.lang.AssertionError -> L66
            throw r4     // Catch: java.lang.AssertionError -> L66
        L66:
            r4 = move-exception
            boolean r5 = p000.rd2.m5080(r4)
            if (r5 == 0) goto L73
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L73:
            throw r4
    }
}
