package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements java.io.Closeable {

    /* JADX INFO: renamed from: Ζ */
    public static final p000.xs1 f3126 = null;

    /* JADX INFO: renamed from: Α */
    public long f3127;

    /* JADX INFO: renamed from: Β */
    public final p000.C0538m6 f3128;

    /* JADX INFO: renamed from: Γ */
    public final p000.lg0 f3129;

    /* JADX INFO: renamed from: Δ */
    public final p000.cg0 f3130;

    /* JADX INFO: renamed from: Ε */
    public final java.util.LinkedHashSet f3131;

    /* JADX INFO: renamed from: ε */
    public final p000.bg0 f3132;

    /* JADX INFO: renamed from: ζ */
    public final java.util.LinkedHashMap f3133;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f3134;

    /* JADX INFO: renamed from: θ */
    public int f3135;

    /* JADX INFO: renamed from: ι */
    public int f3136;

    /* JADX INFO: renamed from: κ */
    public boolean f3137;

    /* JADX INFO: renamed from: λ */
    public final p000.x22 f3138;

    /* JADX INFO: renamed from: μ */
    public final p000.w22 f3139;

    /* JADX INFO: renamed from: ν */
    public final p000.w22 f3140;

    /* JADX INFO: renamed from: ξ */
    public final p000.w22 f3141;

    /* JADX INFO: renamed from: ο */
    public final p000.xn0 f3142;

    /* JADX INFO: renamed from: π */
    public long f3143;

    /* JADX INFO: renamed from: ρ */
    public long f3144;

    /* JADX INFO: renamed from: σ */
    public long f3145;

    /* JADX INFO: renamed from: τ */
    public long f3146;

    /* JADX INFO: renamed from: υ */
    public final p000.h40 f3147;

    /* JADX INFO: renamed from: φ */
    public final p000.xs1 f3148;

    /* JADX INFO: renamed from: χ */
    public p000.xs1 f3149;

    /* JADX INFO: renamed from: ψ */
    public final p000.e62 f3150;

    /* JADX INFO: renamed from: ω */
    public long f3151;

    static {
            xs1 r0 = new xs1
            r0.<init>()
            r1 = 4
            r2 = 65535(0xffff, float:9.1834E-41)
            r0.m6783(r1, r2)
            r1 = 5
            r2 = 16384(0x4000, float:2.2959E-41)
            r0.m6783(r1, r2)
            p000.dg0.f3126 = r0
            return
    }

    public dg0(p000.C0068b8 r5) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = r5.f1558
            bg0 r0 = (p000.bg0) r0
            r4.f3132 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.f3133 = r0
            java.lang.Object r0 = r5.f1557
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L8f
            r4.f3134 = r0
            r0 = 3
            r4.f3136 = r0
            java.lang.Object r0 = r5.f1555
            x22 r0 = (p000.x22) r0
            r4.f3138 = r0
            w22 r2 = r0.m6509()
            r4.f3139 = r2
            w22 r2 = r0.m6509()
            r4.f3140 = r2
            w22 r0 = r0.m6509()
            r4.f3141 = r0
            xn0 r0 = p000.xn0.f12217
            r4.f3142 = r0
            java.lang.Object r0 = r5.f1559
            h40 r0 = (p000.h40) r0
            r4.f3147 = r0
            xs1 r0 = new xs1
            r0.<init>()
            r2 = 4
            r3 = 16777216(0x1000000, float:2.3509887E-38)
            r0.m6783(r2, r3)
            r4.f3148 = r0
            xs1 r0 = p000.dg0.f3126
            r4.f3149 = r0
            e62 r2 = new e62
            r3 = 0
            r2.<init>(r3)
            r4.f3150 = r2
            int r0 = r0.m6782()
            long r2 = (long) r0
            r4.f3127 = r2
            java.lang.Object r5 = r5.f1556
            m6 r5 = (p000.C0538m6) r5
            if (r5 == 0) goto L89
            r4.f3128 = r5
            lg0 r0 = new lg0
            java.lang.Object r1 = r5.f6969
            qk1 r1 = (p000.qk1) r1
            r0.<init>(r1)
            r4.f3129 = r0
            cg0 r0 = new cg0
            gg0 r1 = new gg0
            java.lang.Object r5 = r5.f6968
            rk1 r5 = (p000.rk1) r5
            r1.<init>(r5)
            r0.<init>(r4, r1)
            r4.f3130 = r0
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r4.f3131 = r5
            return
        L89:
            java.lang.String r4 = "socket"
            p000.ln0.m3650(r4)
            throw r1
        L8f:
            java.lang.String r4 = "connectionName"
            p000.ln0.m3650(r4)
            throw r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            sz r0 = p000.EnumC0816sz.f10092
            r1 = 0
            sz r2 = p000.EnumC0816sz.f10087
            r3.m1738(r2, r0, r1)
            return
    }

    public final void flush() {
            r0 = this;
            lg0 r0 = r0.f3129
            r0.flush()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1738(p000.EnumC0816sz r4, p000.EnumC0816sz r5, java.io.IOException r6) {
            r3 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            r3.m1741(r4)     // Catch: java.io.IOException -> L5
        L5:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.f3133     // Catch: java.lang.Throwable -> L21
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 != 0) goto L23
            java.util.LinkedHashMap r4 = r3.f3133     // Catch: java.lang.Throwable -> L21
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L21
            kg0[] r1 = new p000.kg0[r0]     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.lang.Throwable -> L21
            java.util.LinkedHashMap r1 = r3.f3133     // Catch: java.lang.Throwable -> L21
            r1.clear()     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r4 = move-exception
            goto L56
        L23:
            r4 = 0
        L24:
            monitor-exit(r3)
            kg0[] r4 = (p000.kg0[]) r4
            if (r4 == 0) goto L34
            int r1 = r4.length
        L2a:
            if (r0 >= r1) goto L34
            r2 = r4[r0]
            r2.m3244(r5, r6)     // Catch: java.io.IOException -> L31
        L31:
            int r0 = r0 + 1
            goto L2a
        L34:
            lg0 r4 = r3.f3129     // Catch: java.io.IOException -> L39
            r4.close()     // Catch: java.io.IOException -> L39
        L39:
            m6 r4 = r3.f3128     // Catch: java.io.IOException -> L46
            java.lang.Object r4 = r4.f6967     // Catch: java.io.IOException -> L46
            i0 r4 = (p000.C0379i0) r4     // Catch: java.io.IOException -> L46
            java.lang.Object r4 = r4.f4857     // Catch: java.io.IOException -> L46
            java.net.Socket r4 = (java.net.Socket) r4     // Catch: java.io.IOException -> L46
            r4.close()     // Catch: java.io.IOException -> L46
        L46:
            w22 r4 = r3.f3139
            r4.m6313()
            w22 r4 = r3.f3140
            r4.m6313()
            w22 r3 = r3.f3141
            r3.m6313()
            return
        L56:
            monitor-exit(r3)
            throw r4
    }

    /* JADX INFO: renamed from: η */
    public final p000.kg0 m1739(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.f3133     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lf
            kg0 r2 = (p000.kg0) r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* JADX INFO: renamed from: θ */
    public final p000.kg0 m1740(int r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.f3133     // Catch: java.lang.Throwable -> L12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L12
            kg0 r2 = (p000.kg0) r2     // Catch: java.lang.Throwable -> L12
            r1.notifyAll()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    /* JADX INFO: renamed from: κ */
    public final void m1741(p000.EnumC0816sz r4) {
            r3 = this;
            lg0 r0 = r3.f3129
            monitor-enter(r0)
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r3.f3137     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto Ld
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r3 = move-exception
            goto L1f
        Ld:
            r1 = 1
            r3.f3137 = r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r3.f3135     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            lg0 r3 = r3.f3129     // Catch: java.lang.Throwable -> Lb
            byte[] r2 = p000.sd2.f9867     // Catch: java.lang.Throwable -> Lb
            r3.m3560(r1, r4, r2)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4     // Catch: java.lang.Throwable -> Lb
        L1f:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: λ */
    public final void m1742(long r7) {
            r6 = this;
            monitor-enter(r6)
            e62 r0 = r6.f3150     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r5 = 2
            r1 = r7
            p000.e62.m1850(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L2a
            e62 r7 = r6.f3150     // Catch: java.lang.Throwable -> L2a
            long r3 = r7.m1852()     // Catch: java.lang.Throwable -> L2a
            xs1 r7 = r6.f3148     // Catch: java.lang.Throwable -> L2a
            int r7 = r7.m6782()     // Catch: java.lang.Throwable -> L2a
            int r7 = r7 / 2
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L2a
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L2d
            r7 = 0
            r6.m1745(r7, r3)     // Catch: java.lang.Throwable -> L2a
            e62 r0 = r6.f3150     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r5 = 1
            p000.e62.m1850(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            r7 = r0
            goto L39
        L2d:
            h40 r7 = r6.f3147     // Catch: java.lang.Throwable -> L2a
            e62 r8 = r6.f3150     // Catch: java.lang.Throwable -> L2a
            r7.getClass()     // Catch: java.lang.Throwable -> L2a
            r8.getClass()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r6)
            return
        L39:
            monitor-exit(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ξ */
    public final void m1743(int r9, boolean r10, p000.C0793sc r11, long r12) {
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            lg0 r8 = r8.f3129
            r8.m3558(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f3151     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f3127     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f3133     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            lg0 r4 = r8.f3129     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f6620     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f3151     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f3151 = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            lg0 r4 = r8.f3129
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.m3558(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m1744(int r3, p000.EnumC0816sz r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f3134
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "] writeSynReset"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            xf0 r1 = new xf0
            r1.<init>(r2, r3, r4)
            w22 r2 = r2.f3139
            p000.w22.m6309(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: σ */
    public final void m1745(int r3, long r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f3134
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "] windowUpdate"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            wf0 r1 = new wf0
            r1.<init>(r2, r3, r4)
            w22 r2 = r2.f3139
            p000.w22.m6309(r2, r0, r1)
            return
    }
}
