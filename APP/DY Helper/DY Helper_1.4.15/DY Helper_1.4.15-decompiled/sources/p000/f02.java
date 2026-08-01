package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f02 extends p000.AbstractC1112 implements p000.f40, p000.d02, p000.g40 {

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f3717 = null;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    /* JADX INFO: renamed from: ι */
    public int f3718;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state$volatile"
            java.lang.Class<f02> r2 = p000.f02.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.f02.f3717 = r0
            return
    }

    public f02(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state$volatile = r1
            return
    }

    @Override // p000.d02
    public final java.lang.Object getValue() {
            r2 = this;
            uy r0 = p000.AbstractC0978xb.f12108
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.f02.f3717
            java.lang.Object r2 = r1.get(r2)
            if (r2 != r0) goto Lb
            r2 = 0
        Lb:
            return r2
    }

    @Override // p000.AbstractC1112
    /* JADX INFO: renamed from: β */
    public final p000.AbstractC1113 mo1984() {
            r0 = this;
            g02 r0 = new g02
            r0.<init>()
            return r0
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: γ */
    public final java.lang.Object mo601(p000.g40 r14, p000.InterfaceC0631op r15) {
            r13 = this;
            boolean r0 = r15 instanceof p000.e02
            if (r0 == 0) goto L13
            r0 = r15
            e02 r0 = (p000.e02) r0
            int r1 = r0.f3366
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3366 = r1
            goto L18
        L13:
            e02 r0 = new e02
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f3364
            int r1 = r0.f3366
            cq r2 = p000.EnumC0184cq.f2716
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L60
            if (r1 == r6) goto L51
            if (r1 == r5) goto L42
            if (r1 != r4) goto L3b
            java.lang.Object r13 = r0.f3363
            fo0 r14 = r0.f3362
            g02 r1 = r0.f3361
            g40 r7 = r0.f3360
            f02 r8 = r0.f3359
            p000.i81.m2649(r15)     // Catch: java.lang.Throwable -> L38
            goto L7b
        L38:
            r13 = move-exception
            goto Lf8
        L3b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r13)
            r13 = 0
            return r13
        L42:
            java.lang.Object r13 = r0.f3363
            fo0 r14 = r0.f3362
            g02 r1 = r0.f3361
            g40 r7 = r0.f3360
            f02 r8 = r0.f3359
            p000.i81.m2649(r15)     // Catch: java.lang.Throwable -> L38
            goto Lb2
        L51:
            g02 r1 = r0.f3361
            g40 r14 = r0.f3360
            f02 r13 = r0.f3359
            p000.i81.m2649(r15)     // Catch: java.lang.Throwable -> L5b
            goto L6a
        L5b:
            r14 = move-exception
            r8 = r13
            r13 = r14
            goto Lf8
        L60:
            p000.i81.m2649(r15)
            л r15 = r13.m7287()
            g02 r15 = (p000.g02) r15
            r1 = r15
        L6a:
            up r15 = r0.f8639     // Catch: java.lang.Throwable -> L5b
            r15.getClass()     // Catch: java.lang.Throwable -> L5b
            xn0 r7 = p000.xn0.f12226     // Catch: java.lang.Throwable -> L5b
            sp r15 = r15.mo1785(r7)     // Catch: java.lang.Throwable -> L5b
            fo0 r15 = (p000.fo0) r15     // Catch: java.lang.Throwable -> L5b
            r8 = r13
            r7 = r14
            r14 = r15
            r13 = r3
        L7b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = p000.f02.f3717     // Catch: java.lang.Throwable -> L38
            java.lang.Object r15 = r15.get(r8)     // Catch: java.lang.Throwable -> L38
            if (r14 == 0) goto L8f
            boolean r9 = r14.m2169()     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L8a
            goto L8f
        L8a:
            java.util.concurrent.CancellationException r13 = r14.m2159()     // Catch: java.lang.Throwable -> L38
            throw r13     // Catch: java.lang.Throwable -> L38
        L8f:
            if (r13 == 0) goto L97
            boolean r9 = r13.equals(r15)     // Catch: java.lang.Throwable -> L38
            if (r9 != 0) goto Lb2
        L97:
            uy r13 = p000.AbstractC0978xb.f12108     // Catch: java.lang.Throwable -> L38
            if (r15 != r13) goto L9d
            r13 = r3
            goto L9e
        L9d:
            r13 = r15
        L9e:
            r0.f3359 = r8     // Catch: java.lang.Throwable -> L38
            r0.f3360 = r7     // Catch: java.lang.Throwable -> L38
            r0.f3361 = r1     // Catch: java.lang.Throwable -> L38
            r0.f3362 = r14     // Catch: java.lang.Throwable -> L38
            r0.f3363 = r15     // Catch: java.lang.Throwable -> L38
            r0.f3366 = r5     // Catch: java.lang.Throwable -> L38
            java.lang.Object r13 = r7.mo1985(r13, r0)     // Catch: java.lang.Throwable -> L38
            if (r13 != r2) goto Lb1
            goto Lf7
        Lb1:
            r13 = r15
        Lb2:
            java.util.concurrent.atomic.AtomicReference r15 = r1.f4184     // Catch: java.lang.Throwable -> L38
            uy r9 = p000.ln0.f6722     // Catch: java.lang.Throwable -> L38
            java.lang.Object r15 = r15.getAndSet(r9)     // Catch: java.lang.Throwable -> L38
            r15.getClass()     // Catch: java.lang.Throwable -> L38
            uy r10 = p000.ln0.f6723     // Catch: java.lang.Throwable -> L38
            if (r15 != r10) goto Lc2
            goto L7b
        Lc2:
            r0.f3359 = r8     // Catch: java.lang.Throwable -> L38
            r0.f3360 = r7     // Catch: java.lang.Throwable -> L38
            r0.f3361 = r1     // Catch: java.lang.Throwable -> L38
            r0.f3362 = r14     // Catch: java.lang.Throwable -> L38
            r0.f3363 = r13     // Catch: java.lang.Throwable -> L38
            r0.f3366 = r4     // Catch: java.lang.Throwable -> L38
            s62 r15 = p000.s62.f9751     // Catch: java.lang.Throwable -> L38
            ae r10 = new ae     // Catch: java.lang.Throwable -> L38
            op r11 = p000.AbstractC0978xb.m6563(r0)     // Catch: java.lang.Throwable -> L38
            r10.<init>(r6, r11)     // Catch: java.lang.Throwable -> L38
            r10.m87()     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.atomic.AtomicReference r11 = r1.f4184     // Catch: java.lang.Throwable -> L38
        Lde:
            boolean r12 = r11.compareAndSet(r9, r10)     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto Le5
            goto Lee
        Le5:
            java.lang.Object r12 = r11.get()     // Catch: java.lang.Throwable -> L38
            if (r12 == r9) goto Lde
            r10.mo75(r15)     // Catch: java.lang.Throwable -> L38
        Lee:
            java.lang.Object r9 = r10.m86()     // Catch: java.lang.Throwable -> L38
            if (r9 != r2) goto Lf5
            r15 = r9
        Lf5:
            if (r15 != r2) goto L7b
        Lf7:
            return r2
        Lf8:
            r8.m7288(r1)
            throw r13
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r1, p000.InterfaceC0631op r2) {
            r0 = this;
            r0.m1987(r1)
            s62 r0 = p000.s62.f9751
            return r0
    }

    @Override // p000.AbstractC1112
    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC1113[] mo1986() {
            r0 = this;
            r0 = 2
            g02[] r0 = new p000.g02[r0]
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final void m1987(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            uy r2 = p000.AbstractC0978xb.f12108
        L4:
            r0 = 0
            r1.m1988(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final boolean m1988(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.f02.f3717     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r10 == 0) goto L15
            boolean r10 = p000.ln0.m3626(r1, r10)     // Catch: java.lang.Throwable -> L12
            if (r10 != 0) goto L15
            monitor-exit(r9)
            return r2
        L12:
            r10 = move-exception
            goto L8c
        L15:
            boolean r10 = p000.ln0.m3626(r1, r11)     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r10 == 0) goto L1e
            monitor-exit(r9)
            return r1
        L1e:
            r0.set(r9, r11)     // Catch: java.lang.Throwable -> L12
            int r10 = r9.f3718     // Catch: java.lang.Throwable -> L12
            r11 = r10 & 1
            if (r11 != 0) goto L86
            int r10 = r10 + r1
            r9.f3718 = r10     // Catch: java.lang.Throwable -> L12
            л[] r11 = r9.f13442     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
        L2d:
            g02[] r11 = (p000.g02[]) r11
            if (r11 == 0) goto L71
            int r0 = r11.length
            r3 = r2
        L33:
            if (r3 >= r0) goto L71
            r4 = r11[r3]
            if (r4 == 0) goto L6e
            java.util.concurrent.atomic.AtomicReference r4 = r4.f4184
        L3b:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L42
            goto L6e
        L42:
            uy r6 = p000.ln0.f6723
            if (r5 != r6) goto L47
            goto L6e
        L47:
            uy r7 = p000.ln0.f6722
            if (r5 != r7) goto L59
        L4b:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L52
            goto L6e
        L52:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L4b
            goto L3b
        L59:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L67
            ae r5 = (p000.C0015ae) r5
            s62 r4 = p000.s62.f9751
            r5.mo75(r4)
            goto L6e
        L67:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L59
            goto L3b
        L6e:
            int r3 = r3 + 1
            goto L33
        L71:
            monitor-enter(r9)
            int r11 = r9.f3718     // Catch: java.lang.Throwable -> L7b
            if (r11 != r10) goto L7d
            int r10 = r10 + r1
            r9.f3718 = r10     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            return r1
        L7b:
            r10 = move-exception
            goto L84
        L7d:
            л[] r10 = r9.f13442     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L2d
        L84:
            monitor-exit(r9)
            throw r10
        L86:
            int r10 = r10 + 2
            r9.f3718 = r10     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
            return r1
        L8c:
            monitor-exit(r9)
            throw r10
    }
}
