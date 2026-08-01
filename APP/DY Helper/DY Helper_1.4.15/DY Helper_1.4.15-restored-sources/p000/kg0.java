package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kg0 implements p000.lx1 {

    /* JADX INFO: renamed from: ε */
    public final int f5899;

    /* JADX INFO: renamed from: ζ */
    public final p000.dg0 f5900;

    /* JADX INFO: renamed from: η */
    public final p000.e62 f5901;

    /* JADX INFO: renamed from: θ */
    public long f5902;

    /* JADX INFO: renamed from: ι */
    public long f5903;

    /* JADX INFO: renamed from: κ */
    public final java.util.ArrayDeque f5904;

    /* JADX INFO: renamed from: λ */
    public boolean f5905;

    /* JADX INFO: renamed from: μ */
    public final p000.ig0 f5906;

    /* JADX INFO: renamed from: ν */
    public final p000.hg0 f5907;

    /* JADX INFO: renamed from: ξ */
    public final p000.jg0 f5908;

    /* JADX INFO: renamed from: ο */
    public final p000.jg0 f5909;

    /* JADX INFO: renamed from: π */
    public p000.EnumC0816sz f5910;

    /* JADX INFO: renamed from: ρ */
    public java.io.IOException f5911;

    public kg0(int r4, p000.dg0 r5, boolean r6, boolean r7, p000.vc0 r8) {
            r3 = this;
            r5.getClass()
            r3.<init>()
            r3.f5899 = r4
            r3.f5900 = r5
            e62 r0 = new e62
            r0.<init>(r4)
            r3.f5901 = r0
            xs1 r4 = r5.f3149
            int r4 = r4.m6782()
            long r0 = (long) r4
            r3.f5903 = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.f5904 = r4
            ig0 r0 = new ig0
            xs1 r5 = r5.f3148
            int r5 = r5.m6782()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.f5906 = r0
            hg0 r5 = new hg0
            r5.<init>(r3, r6)
            r3.f5907 = r5
            jg0 r5 = new jg0
            r5.<init>(r3)
            r3.f5908 = r5
            jg0 r5 = new jg0
            r5.<init>(r3)
            r3.f5909 = r5
            if (r8 == 0) goto L57
            boolean r3 = r3.m3248()
            if (r3 != 0) goto L50
            r4.add(r8)
            return
        L50:
            java.lang.String r3 = "locally-initiated streams shouldn't have headers yet"
            p000.C1080.m7279(r3)
            r3 = 0
            throw r3
        L57:
            boolean r3 = r3.m3248()
            if (r3 == 0) goto L5e
            return
        L5e:
            java.lang.String r3 = "remotely-initiated streams should have headers"
            p000.C1080.m7279(r3)
            r3 = 0
            throw r3
    }

    /* JADX INFO: renamed from: α */
    public final void m3242() {
            r2 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            monitor-enter(r2)
            ig0 r0 = r2.f5906     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f5070     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1c
            boolean r0 = r0.f5073     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            hg0 r0 = r2.f5907     // Catch: java.lang.Throwable -> L18
            boolean r1 = r0.f4725     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            boolean r0 = r0.f4727     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1c
            goto L1a
        L18:
            r0 = move-exception
            goto L35
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            boolean r1 = r2.m3249()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L2b
            sz r0 = p000.EnumC0816sz.f10092
            r1 = 0
            r2.m3244(r0, r1)
            return
        L2b:
            if (r1 != 0) goto L34
            dg0 r0 = r2.f5900
            int r2 = r2.f5899
            r0.m1740(r2)
        L34:
            return
        L35:
            monitor-exit(r2)
            throw r0
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: β */
    public final p000.rx1 mo2556() {
            r0 = this;
            ig0 r0 = r0.f5906
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m3243() {
            r2 = this;
            hg0 r0 = r2.f5907
            boolean r1 = r0.f4727
            if (r1 != 0) goto L29
            boolean r0 = r0.f4725
            if (r0 != 0) goto L23
            sz r0 = r2.m3247()
            if (r0 == 0) goto L22
            java.io.IOException r0 = r2.f5911
            if (r0 == 0) goto L15
            goto L21
        L15:
            o02 r0 = new o02
            sz r2 = r2.m3247()
            r2.getClass()
            r0.<init>(r2)
        L21:
            throw r0
        L22:
            return
        L23:
            java.lang.String r2 = "stream finished"
            p000.C1080.m7281(r2)
            return
        L29:
            java.lang.String r2 = "stream closed"
            p000.C1080.m7281(r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3244(p000.EnumC0816sz r1, java.io.IOException r2) {
            r0 = this;
            boolean r2 = r0.m3245(r1, r2)
            if (r2 != 0) goto L7
            return
        L7:
            dg0 r2 = r0.f5900
            r2.getClass()
            lg0 r2 = r2.f3129
            int r0 = r0.f5899
            r2.m3563(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m3245(p000.EnumC0816sz r3, java.io.IOException r4) {
            r2 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            monitor-enter(r2)
            sz r0 = r2.m3247()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto Lc
            monitor-exit(r2)
            return r1
        Lc:
            r2.f5910 = r3     // Catch: java.lang.Throwable -> L21
            r2.f5911 = r4     // Catch: java.lang.Throwable -> L21
            r2.notifyAll()     // Catch: java.lang.Throwable -> L21
            ig0 r3 = r2.f5906     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f5070     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            hg0 r3 = r2.f5907     // Catch: java.lang.Throwable -> L21
            boolean r3 = r3.f4725     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            monitor-exit(r2)
            return r1
        L21:
            r3 = move-exception
            goto L2d
        L23:
            monitor-exit(r2)
            dg0 r3 = r2.f5900
            int r2 = r2.f5899
            r3.m1740(r2)
            r2 = 1
            return r2
        L2d:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3246(p000.EnumC0816sz r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.m3245(r2, r0)
            if (r0 != 0) goto L8
            return
        L8:
            dg0 r0 = r1.f5900
            int r1 = r1.f5899
            r0.m1744(r1, r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public final p000.EnumC0816sz m3247() {
            r1 = this;
            monitor-enter(r1)
            sz r0 = r1.f5910     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m3248() {
            r3 = this;
            int r0 = r3.f5899
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            dg0 r3 = r3.f5900
            r3.getClass()
            if (r1 != r0) goto L12
            return r1
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m3249() {
            r3 = this;
            monitor-enter(r3)
            sz r0 = r3.m3247()     // Catch: java.lang.Throwable -> L15
            r1 = 0
            if (r0 == 0) goto La
            monitor-exit(r3)
            return r1
        La:
            ig0 r0 = r3.f5906     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f5070     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            boolean r0 = r0.f5073     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            goto L17
        L15:
            r0 = move-exception
            goto L2a
        L17:
            hg0 r0 = r3.f5907     // Catch: java.lang.Throwable -> L15
            boolean r2 = r0.f4725     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L21
            boolean r0 = r0.f4727     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
        L21:
            boolean r0 = r3.f5905     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L27
            monitor-exit(r3)
            return r1
        L27:
            monitor-exit(r3)
            r3 = 1
            return r3
        L2a:
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: κ */
    public final void m3250(p000.vc0 r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = p000.ud2.f10709
            monitor-enter(r2)
            boolean r0 = r2.f5905     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.m6168(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.m6168(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            ig0 r3 = r2.f5906     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r3 = move-exception
            goto L43
        L24:
            r2.f5905 = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r0 = r2.f5904     // Catch: java.lang.Throwable -> L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
        L2b:
            if (r4 == 0) goto L31
            ig0 r3 = r2.f5906     // Catch: java.lang.Throwable -> L22
            r3.f5070 = r1     // Catch: java.lang.Throwable -> L22
        L31:
            boolean r3 = r2.m3249()     // Catch: java.lang.Throwable -> L22
            r2.notifyAll()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 != 0) goto L42
            dg0 r3 = r2.f5900
            int r2 = r2.f5899
            r3.m1740(r2)
        L42:
            return
        L43:
            monitor-exit(r2)
            throw r3
    }

    @Override // p000.lx1
    /* JADX INFO: renamed from: λ */
    public final p000.iw1 mo2564() {
            r0 = this;
            hg0 r0 = r0.f5907
            return r0
    }
}
