package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ig0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final long f5069;

    /* JADX INFO: renamed from: ζ */
    public boolean f5070;

    /* JADX INFO: renamed from: η */
    public final p000.C0793sc f5071;

    /* JADX INFO: renamed from: θ */
    public final p000.C0793sc f5072;

    /* JADX INFO: renamed from: ι */
    public boolean f5073;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.kg0 f5074;

    public ig0(p000.kg0 r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f5074 = r1
            r0.f5069 = r2
            r0.f5070 = r4
            sc r1 = new sc
            r1.<init>()
            r0.f5071 = r1
            sc r1 = new sc
            r1.<init>()
            r0.f5072 = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            kg0 r0 = r4.f5074
            monitor-enter(r0)
            r1 = 1
            r4.f5073 = r1     // Catch: java.lang.Throwable -> L26
            sc r1 = r4.f5072     // Catch: java.lang.Throwable -> L26
            long r2 = r1.f9828     // Catch: java.lang.Throwable -> L26
            r1.skip(r2)     // Catch: java.lang.Throwable -> L26
            r0.notifyAll()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r0)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            kg0 r0 = r4.f5074
            java.util.TimeZone r1 = p000.ud2.f10709
            dg0 r0 = r0.f5900
            r0.m1742(r2)
        L20:
            kg0 r4 = r4.f5074
            r4.m3242()
            return
        L26:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            kg0 r0 = r0.f5074
            jg0 r0 = r0.f5908
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public final long mo2106(long r22, p000.C0793sc r24) {
            r21 = this;
            r0 = r21
            r24.getClass()
        L5:
            kg0 r1 = r0.f5074
            monitor-enter(r1)
            dg0 r2 = r1.f5900     // Catch: java.lang.Throwable -> L25
            r2.getClass()     // Catch: java.lang.Throwable -> L25
            hg0 r2 = r1.f5907     // Catch: java.lang.Throwable -> L25
            boolean r3 = r2.f4727     // Catch: java.lang.Throwable -> L25
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1c
            boolean r2 = r2.f4725     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r5
            goto L1d
        L1c:
            r2 = r4
        L1d:
            if (r2 == 0) goto L28
            jg0 r3 = r1.f5908     // Catch: java.lang.Throwable -> L25
            r3.m2628()     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            goto Le8
        L28:
            sz r3 = r1.m3247()     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L46
            boolean r3 = r0.f5070     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L46
            java.io.IOException r3 = r1.f5911     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L47
            o02 r3 = new o02     // Catch: java.lang.Throwable -> L43
            sz r6 = r1.m3247()     // Catch: java.lang.Throwable -> L43
            r6.getClass()     // Catch: java.lang.Throwable -> L43
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r0 = move-exception
            goto Le0
        L46:
            r3 = 0
        L47:
            boolean r6 = r0.f5073     // Catch: java.lang.Throwable -> L43
            if (r6 != 0) goto Ld8
            sc r6 = r0.f5072     // Catch: java.lang.Throwable -> L43
            long r7 = r6.f9828     // Catch: java.lang.Throwable -> L43
            r9 = 0
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L9a
            r12 = 8192(0x2000, double:4.0474E-320)
            long r7 = java.lang.Math.min(r12, r7)     // Catch: java.lang.Throwable -> L43
            r9 = r24
            long r13 = r6.mo2106(r7, r9)     // Catch: java.lang.Throwable -> L43
            e62 r12 = r1.f5901     // Catch: java.lang.Throwable -> L43
            r15 = 0
            r17 = 2
            p000.e62.m1850(r12, r13, r15, r17)     // Catch: java.lang.Throwable -> L43
            e62 r4 = r1.f5901     // Catch: java.lang.Throwable -> L43
            long r6 = r4.m1852()     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L96
            dg0 r4 = r1.f5900     // Catch: java.lang.Throwable -> L43
            xs1 r4 = r4.f3148     // Catch: java.lang.Throwable -> L43
            int r4 = r4.m6782()     // Catch: java.lang.Throwable -> L43
            int r4 = r4 / 2
            r22 = -1
            long r10 = (long) r4     // Catch: java.lang.Throwable -> L43
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 < 0) goto L98
            dg0 r4 = r1.f5900     // Catch: java.lang.Throwable -> L43
            int r8 = r1.f5899     // Catch: java.lang.Throwable -> L43
            r4.m1745(r8, r6)     // Catch: java.lang.Throwable -> L43
            e62 r15 = r1.f5901     // Catch: java.lang.Throwable -> L43
            r16 = 0
            r20 = 1
            r18 = r6
            p000.e62.m1850(r15, r16, r18, r20)     // Catch: java.lang.Throwable -> L43
            goto L98
        L96:
            r22 = -1
        L98:
            r4 = r5
            goto Lba
        L9a:
            r9 = r24
            r22 = -1
            boolean r6 = r0.f5070     // Catch: java.lang.Throwable -> L43
            if (r6 != 0) goto Lb7
            if (r3 != 0) goto Lb7
            r1.wait()     // Catch: java.lang.Throwable -> L43 java.lang.InterruptedException -> Laa
            r13 = r22
            goto Lba
        Laa:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L43
            r0.interrupt()     // Catch: java.lang.Throwable -> L43
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        Lb7:
            r13 = r22
            goto L98
        Lba:
            if (r2 == 0) goto Lc1
            jg0 r2 = r1.f5908     // Catch: java.lang.Throwable -> L25
            r2.m2958()     // Catch: java.lang.Throwable -> L25
        Lc1:
            monitor-exit(r1)
            kg0 r1 = r0.f5074
            dg0 r1 = r1.f5900
            h40 r1 = r1.f3147
            r1.getClass()
            if (r4 == 0) goto Lcf
            goto L5
        Lcf:
            int r0 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r0 == 0) goto Ld4
            return r13
        Ld4:
            if (r3 != 0) goto Ld7
            return r22
        Ld7:
            throw r3
        Ld8:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "stream closed"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        Le0:
            if (r2 == 0) goto Le7
            jg0 r2 = r1.f5908     // Catch: java.lang.Throwable -> L25
            r2.m2958()     // Catch: java.lang.Throwable -> L25
        Le7:
            throw r0     // Catch: java.lang.Throwable -> L25
        Le8:
            monitor-exit(r1)
            throw r0
    }
}
