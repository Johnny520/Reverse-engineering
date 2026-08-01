package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hg0 implements p000.iw1 {

    /* JADX INFO: renamed from: ε */
    public final boolean f4725;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0793sc f4726;

    /* JADX INFO: renamed from: η */
    public boolean f4727;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.kg0 f4728;

    public hg0(p000.kg0 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f4728 = r1
            r0.f4725 = r2
            sc r1 = new sc
            r1.<init>()
            r0.f4726 = r1
            return
    }

    @Override // p000.iw1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r13 = this;
            kg0 r1 = r13.f4728
            java.util.TimeZone r0 = p000.ud2.f10709
            monitor-enter(r1)
            boolean r0 = r13.f4727     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lb
            monitor-exit(r1)
            return
        Lb:
            sz r0 = r1.m3247()     // Catch: java.lang.Throwable -> L5b
            r2 = 1
            if (r0 != 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r1)
            kg0 r1 = r13.f4728
            hg0 r3 = r1.f5907
            boolean r3 = r3.f4725
            if (r3 != 0) goto L41
            sc r3 = r13.f4726
            long r3 = r3.f9828
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L34
        L28:
            sc r0 = r13.f4726
            long r0 = r0.f9828
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L41
            r13.m2506(r2)
            goto L28
        L34:
            if (r0 == 0) goto L41
            dg0 r7 = r1.f5900
            int r8 = r1.f5899
            r10 = 0
            r11 = 0
            r9 = 1
            r7.m1743(r8, r9, r10, r11)
        L41:
            kg0 r1 = r13.f4728
            monitor-enter(r1)
            r13.f4727 = r2     // Catch: java.lang.Throwable -> L57
            r1.notifyAll()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            kg0 r0 = r13.f4728
            dg0 r0 = r0.f5900
            r0.flush()
            kg0 r13 = r13.f4728
            r13.m3242()
            return
        L57:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
        L5b:
            r0 = move-exception
            r13 = r0
            monitor-exit(r1)
            throw r13
    }

    @Override // p000.iw1, java.io.Flushable
    public final void flush() {
            r4 = this;
            kg0 r0 = r4.f4728
            java.util.TimeZone r1 = p000.ud2.f10709
            monitor-enter(r0)
            r0.m3243()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
        L9:
            sc r0 = r4.f4726
            long r0 = r0.f9828
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1f
            r0 = 0
            r4.m2506(r0)
            kg0 r0 = r4.f4728
            dg0 r0 = r0.f5900
            r0.flush()
            goto L9
        L1f:
            return
        L20:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2505() {
            r0 = this;
            kg0 r0 = r0.f4728
            jg0 r0 = r0.f5909
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m2506(boolean r13) {
            r12 = this;
            kg0 r1 = r12.f4728
            monitor-enter(r1)
            jg0 r0 = r1.f5909     // Catch: java.lang.Throwable -> L59
            r0.m2628()     // Catch: java.lang.Throwable -> L59
        L8:
            long r2 = r1.f5902     // Catch: java.lang.Throwable -> L2f
            long r4 = r1.f5903     // Catch: java.lang.Throwable -> L2f
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L32
            boolean r0 = r12.f4725     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            boolean r0 = r12.f4727     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            sz r0 = r1.m3247()     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L32
            r1.wait()     // Catch: java.lang.InterruptedException -> L22 java.lang.Throwable -> L2f
            goto L8
        L22:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r12.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r12.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r12     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            r12 = r0
            goto L83
        L32:
            jg0 r0 = r1.f5909     // Catch: java.lang.Throwable -> L59
            r0.m2958()     // Catch: java.lang.Throwable -> L59
            r1.m3243()     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f5903     // Catch: java.lang.Throwable -> L59
            long r4 = r1.f5902     // Catch: java.lang.Throwable -> L59
            long r2 = r2 - r4
            sc r0 = r12.f4726     // Catch: java.lang.Throwable -> L59
            long r4 = r0.f9828     // Catch: java.lang.Throwable -> L59
            long r10 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L59
            long r2 = r1.f5902     // Catch: java.lang.Throwable -> L59
            long r2 = r2 + r10
            r1.f5902 = r2     // Catch: java.lang.Throwable -> L59
            if (r13 == 0) goto L5c
            sc r13 = r12.f4726     // Catch: java.lang.Throwable -> L59
            long r2 = r13.f9828     // Catch: java.lang.Throwable -> L59
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L5c
            r13 = 1
        L57:
            r8 = r13
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L89
        L5c:
            r13 = 0
            goto L57
        L5e:
            monitor-exit(r1)
            kg0 r13 = r12.f4728
            jg0 r13 = r13.f5909
            r13.m2628()
            kg0 r13 = r12.f4728     // Catch: java.lang.Throwable -> L79
            dg0 r6 = r13.f5900     // Catch: java.lang.Throwable -> L79
            int r7 = r13.f5899     // Catch: java.lang.Throwable -> L79
            sc r9 = r12.f4726     // Catch: java.lang.Throwable -> L79
            r6.m1743(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            kg0 r12 = r12.f4728
            jg0 r12 = r12.f5909
            r12.m2958()
            return
        L79:
            r0 = move-exception
            r13 = r0
            kg0 r12 = r12.f4728
            jg0 r12 = r12.f5909
            r12.m2958()
            throw r13
        L83:
            jg0 r13 = r1.f5909     // Catch: java.lang.Throwable -> L59
            r13.m2958()     // Catch: java.lang.Throwable -> L59
            throw r12     // Catch: java.lang.Throwable -> L59
        L89:
            monitor-exit(r1)
            throw r12
    }

    @Override // p000.iw1
    /* JADX INFO: renamed from: ζ */
    public final void mo2507(long r4, p000.C0793sc r6) {
            r3 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            sc r0 = r3.f4726
            r0.mo2507(r4, r6)
        L7:
            long r4 = r0.f9828
            r1 = 16384(0x4000, double:8.095E-320)
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 < 0) goto L14
            r4 = 0
            r3.m2506(r4)
            goto L7
        L14:
            return
    }
}
