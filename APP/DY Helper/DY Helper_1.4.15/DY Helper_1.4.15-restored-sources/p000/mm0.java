package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final java.io.InputStream f7209;

    /* JADX INFO: renamed from: ζ */
    public final p000.m42 f7210;

    public mm0(java.io.InputStream r1, p000.m42 r2) {
            r0 = this;
            r0.<init>()
            r0.f7209 = r1
            r0.f7210 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            java.io.InputStream r0 = r0.f7209
            r0.close()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "source("
            r0.<init>(r1)
            java.io.InputStream r2 = r2.f7209
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
            m42 r0 = r0.f7210
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r5, p000.C0793sc r7) {
            r4 = this;
            r7.getClass()
            m42 r5 = r4.f7210     // Catch: java.lang.AssertionError -> L44
            r5.mo2873()     // Catch: java.lang.AssertionError -> L44
            r5 = 1
            rr1 r5 = r7.m5462(r5)     // Catch: java.lang.AssertionError -> L44
            int r6 = r5.f9473     // Catch: java.lang.AssertionError -> L44
            int r6 = 8192 - r6
            long r0 = (long) r6     // Catch: java.lang.AssertionError -> L44
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.AssertionError -> L44
            int r6 = (int) r0     // Catch: java.lang.AssertionError -> L44
            java.io.InputStream r4 = r4.f7209     // Catch: java.lang.AssertionError -> L44
            byte[] r0 = r5.f9471     // Catch: java.lang.AssertionError -> L44
            int r1 = r5.f9473     // Catch: java.lang.AssertionError -> L44
            int r4 = r4.read(r0, r1, r6)     // Catch: java.lang.AssertionError -> L44
            r6 = -1
            if (r4 != r6) goto L38
            int r4 = r5.f9472     // Catch: java.lang.AssertionError -> L44
            int r6 = r5.f9473     // Catch: java.lang.AssertionError -> L44
            if (r4 != r6) goto L35
            rr1 r4 = r5.m5123()     // Catch: java.lang.AssertionError -> L44
            r7.f9827 = r4     // Catch: java.lang.AssertionError -> L44
            p000.tr1.m5737(r5)     // Catch: java.lang.AssertionError -> L44
        L35:
            r4 = -1
            return r4
        L38:
            int r6 = r5.f9473     // Catch: java.lang.AssertionError -> L44
            int r6 = r6 + r4
            r5.f9473 = r6     // Catch: java.lang.AssertionError -> L44
            long r5 = r7.f9828     // Catch: java.lang.AssertionError -> L44
            long r0 = (long) r4     // Catch: java.lang.AssertionError -> L44
            long r5 = r5 + r0
            r7.f9828 = r5     // Catch: java.lang.AssertionError -> L44
            return r0
        L44:
            r4 = move-exception
            boolean r5 = p000.rd2.m5080(r4)
            if (r5 == 0) goto L51
            java.io.IOException r5 = new java.io.IOException
            r5.<init>(r4)
            throw r5
        L51:
            throw r4
    }
}
