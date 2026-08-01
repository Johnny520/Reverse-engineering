package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ε */
    public final p000.t41 f10888;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0384i5 f10889;

    /* JADX INFO: renamed from: η */
    public final p000.xk1 f10890;

    /* JADX INFO: renamed from: θ */
    public final p000.tk1 f10891;

    /* JADX INFO: renamed from: ι */
    public final java.util.concurrent.atomic.AtomicBoolean f10892;

    /* JADX INFO: renamed from: κ */
    public android.util.CloseGuard f10893;

    /* JADX INFO: renamed from: λ */
    public p000.c00 f10894;

    /* JADX INFO: renamed from: μ */
    public p000.vk1 f10895;

    /* JADX INFO: renamed from: ν */
    public boolean f10896;

    /* JADX INFO: renamed from: ξ */
    public p000.C1076zz f10897;

    /* JADX INFO: renamed from: ο */
    public boolean f10898;

    /* JADX INFO: renamed from: π */
    public boolean f10899;

    /* JADX INFO: renamed from: ρ */
    public boolean f10900;

    /* JADX INFO: renamed from: σ */
    public boolean f10901;

    /* JADX INFO: renamed from: τ */
    public boolean f10902;

    /* JADX INFO: renamed from: υ */
    public volatile boolean f10903;

    /* JADX INFO: renamed from: φ */
    public volatile p000.C1076zz f10904;

    /* JADX INFO: renamed from: χ */
    public final java.util.concurrent.CopyOnWriteArrayList f10905;

    public uk1(p000.t41 r3, p000.C0384i5 r4) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f10888 = r3
            r2.f10889 = r4
            n r0 = r3.f10174
            java.lang.Object r0 = r0.f7336
            xk1 r0 = (p000.xk1) r0
            r2.f10890 = r0
            ql1 r3 = r3.f10178
            r3.getClass()
            tk1 r3 = new tk1
            r3.<init>(r2)
            r0 = 0
            long r0 = (long) r0
            r3.mo2874(r0)
            r2.f10891 = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.f10892 = r3
            r3 = 1
            r2.f10902 = r3
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>()
            r2.f10905 = r3
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r3 = r4.f4918
            x r3 = (p000.C0966x) r3
            r2.<init>(r3)
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            uk1 r0 = new uk1
            t41 r1 = r2.f10888
            i5 r2 = r2.f10889
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final void m5927(p000.vk1 r3) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = p000.ud2.f10709
            vk1 r0 = r2.f10895
            if (r0 != 0) goto L18
            r2.f10895 = r3
            java.util.ArrayList r3 = r3.f11338
            sk1 r0 = new sk1
            android.util.CloseGuard r1 = r2.f10893
            r0.<init>(r2, r1)
            r3.add(r0)
            return
        L18:
            java.lang.String r2 = "Check failed."
            p000.C1080.m7279(r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public final java.io.IOException m5928(java.io.IOException r3) {
            r2 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            vk1 r0 = r2.f10895
            if (r0 == 0) goto L23
            monitor-enter(r0)
            java.net.Socket r1 = r2.m5935()     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            vk1 r0 = r2.f10895
            if (r0 != 0) goto L16
            if (r1 == 0) goto L23
            p000.ud2.m5845(r1)
            goto L23
        L16:
            if (r1 != 0) goto L19
            goto L23
        L19:
            java.lang.String r2 = "Check failed."
            p000.C1080.m7279(r2)
            r2 = 0
            return r2
        L20:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L23:
            boolean r0 = r2.f10896
            if (r0 == 0) goto L28
            goto L30
        L28:
            tk1 r2 = r2.f10891
            boolean r2 = r2.m2629()
            if (r2 != 0) goto L32
        L30:
            r2 = r3
            goto L3e
        L32:
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException
            java.lang.String r0 = "timeout"
            r2.<init>(r0)
            if (r3 == 0) goto L3e
            r2.initCause(r3)
        L3e:
            if (r3 == 0) goto L43
            r2.getClass()
        L43:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m5929() {
            r1 = this;
            boolean r0 = r1.f10903
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.f10903 = r0
            zz r0 = r1.f10904
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.f13382
            b00 r0 = (p000.b00) r0
            r0.cancel()
        L13:
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.f10905
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()
            bp1 r0 = (p000.bp1) r0
            r0.cancel()
            goto L1c
        L2c:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.zn1 m5930() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f10892
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L48
            tk1 r0 = r3.f10891
            r0.m2628()
            f0 r0 = p000.gh1.f4375
            f0 r0 = p000.gh1.f4375
            java.lang.String r1 = "response.body().close()"
            r0.getClass()
            android.util.CloseGuard r0 = new android.util.CloseGuard
            r0.<init>()
            r0.open(r1)
            r3.f10893 = r0
            t41 r0 = r3.f10888     // Catch: java.lang.Throwable -> L3b
            i0 r0 = r0.f10175     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r0.f4860     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L3d
            r1.add(r3)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            zn1 r0 = r3.m5932()     // Catch: java.lang.Throwable -> L3b
            t41 r1 = r3.f10888
            i0 r1 = r1.f10175
            r1.m2569(r3)
            return r0
        L3b:
            r0 = move-exception
            goto L40
        L3d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r1     // Catch: java.lang.Throwable -> L3b
        L40:
            t41 r1 = r3.f10888
            i0 r1 = r1.f10175
            r1.m2569(r3)
            throw r0
        L48:
            java.lang.String r3 = "Already Executed"
            p000.C1080.m7279(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public final void m5931(boolean r9) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f10902     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L24
            monitor-exit(r8)
            if (r9 == 0) goto L20
            zz r2 = r8.f10904
            if (r2 == 0) goto L20
            java.lang.Object r9 = r2.f13382
            b00 r9 = (p000.b00) r9
            r9.cancel()
            java.lang.Object r9 = r2.f13380
            r1 = r9
            uk1 r1 = (p000.uk1) r1
            r6 = 1
            r7 = 0
            r3 = 1
            r4 = 1
            r5 = 1
            r1.m5933(r2, r3, r4, r5, r6, r7)
        L20:
            r9 = 0
            r8.f10897 = r9
            return
        L24:
            java.lang.String r9 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L2c:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.zn1 m5932() {
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            t41 r0 = r9.f10888
            java.util.List r0 = r0.f10176
            p000.AbstractC0984xh.m6660(r2, r0)
            lc r0 = new lc
            t41 r1 = r9.f10888
            r0.<init>(r1)
            r2.add(r0)
            lc r0 = new lc
            t41 r1 = r9.f10888
            x r1 = r1.f10184
            r0.<init>(r1)
            r2.add(r0)
            kd r0 = new kd
            t41 r1 = r9.f10888
            r1.getClass()
            r1 = 2
            r0.<init>(r1)
            r2.add(r0)
            kd r0 = p000.C0465kd.f5857
            r2.add(r0)
            t41 r0 = r9.f10888
            java.util.List r0 = r0.f10177
            p000.AbstractC0984xh.m6660(r2, r0)
            kd r0 = p000.C0465kd.f5856
            r2.add(r0)
            yk1 r0 = new yk1
            i5 r5 = r9.f10889
            t41 r1 = r9.f10888
            int r6 = r1.f10196
            int r7 = r1.f10197
            int r8 = r1.f10198
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9 = 0
            r2 = 0
            zn1 r0 = r0.m6922(r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            boolean r3 = r1.f10903     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            if (r3 != 0) goto L61
            r1.m5934(r9)
            return r0
        L61:
            p000.sd2.m5472(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
        L6c:
            r0 = move-exception
            goto L78
        L6e:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r1.m5934(r0)     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.Throwable -> L6c
        L78:
            if (r2 != 0) goto L7d
            r1.m5934(r9)
        L7d:
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public final java.io.IOException m5933(p000.C1076zz r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
            r3 = this;
            r4.getClass()
            zz r0 = r3.f10904
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.f10898     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.f10899     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.f10900     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.f10901     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.f10898 = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.f10899 = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.f10900 = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.f10901 = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.f10898     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f10899     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f10900     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.f10901     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.f10902     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.f10904 = r6
            vk1 r6 = r3.f10895
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.f11335     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.f11335 = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.m5928(r9)
            return r3
        L78:
            return r9
    }

    /* JADX INFO: renamed from: θ */
    public final java.io.IOException m5934(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f10902     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            if (r0 == 0) goto L1c
            r2.f10902 = r1     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r2.f10898     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f10899     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f10900     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            boolean r0 = r2.f10901     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L1c
            r1 = 1
            goto L1c
        L1a:
            r3 = move-exception
            goto L25
        L1c:
            monitor-exit(r2)
            if (r1 == 0) goto L24
            java.io.IOException r2 = r2.m5928(r3)
            return r2
        L24:
            return r3
        L25:
            monitor-exit(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ι */
    public final java.net.Socket m5935() {
            r6 = this;
            vk1 r0 = r6.f10895
            r0.getClass()
            java.util.TimeZone r1 = p000.ud2.f10709
            java.util.ArrayList r1 = r0.f11338
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        Le:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L29
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L26
            goto L2a
        L26:
            int r3 = r3 + 1
            goto Le
        L29:
            r3 = r5
        L2a:
            r2 = 0
            if (r3 == r5) goto L79
            r1.remove(r3)
            r6.f10895 = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L78
            long r3 = java.lang.System.nanoTime()
            r0.f11339 = r3
            xk1 r6 = r6.f10890
            java.util.concurrent.ConcurrentLinkedQueue r1 = r6.f12204
            java.util.TimeZone r3 = p000.ud2.f10709
            boolean r3 = r0.f11332
            if (r3 != 0) goto L52
            w22 r0 = r6.f12202
            wk1 r6 = r6.f12203
            r3 = 0
            r0.m6311(r6, r3)
            return r2
        L52:
            r2 = 1
            r0.f11332 = r2
            r1.remove(r0)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L75
            w22 r6 = r6.f12202
            x22 r1 = r6.f11548
            monitor-enter(r1)
            boolean r2 = r6.m6310()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            x22 r2 = r6.f11548     // Catch: java.lang.Throwable -> L6f
            r2.m6508(r6)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r6 = move-exception
            goto L73
        L71:
            monitor-exit(r1)
            goto L75
        L73:
            monitor-exit(r1)
            throw r6
        L75:
            java.net.Socket r6 = r0.f11327
            return r6
        L78:
            return r2
        L79:
            java.lang.String r6 = "Check failed."
            p000.C1080.m7279(r6)
            return r2
    }
}
