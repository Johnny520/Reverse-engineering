package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k12 extends p000.AbstractC1112 implements p000.d02, p000.f40, p000.g40 {

    /* JADX INFO: renamed from: ι */
    public final int f5703;

    /* JADX INFO: renamed from: κ */
    public final int f5704;

    /* JADX INFO: renamed from: λ */
    public final p000.EnumC0867uc f5705;

    /* JADX INFO: renamed from: μ */
    public java.lang.Object[] f5706;

    /* JADX INFO: renamed from: ν */
    public long f5707;

    /* JADX INFO: renamed from: ξ */
    public long f5708;

    /* JADX INFO: renamed from: ο */
    public int f5709;

    /* JADX INFO: renamed from: π */
    public int f5710;

    public k12(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f5703 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.f5704 = r0
            uc r0 = p000.EnumC0867uc.f10688
            r1.f5705 = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m3117(r2)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m3108(p000.k12 r8, p000.g40 r9, p000.InterfaceC0631op r10) {
            boolean r0 = r10 instanceof p000.zv1
            if (r0 == 0) goto L13
            r0 = r10
            zv1 r0 = (p000.zv1) r0
            int r1 = r0.f13325
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13325 = r1
            goto L18
        L13:
            zv1 r0 = new zv1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f13323
            int r1 = r0.f13325
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            fo0 r8 = r0.f13322
            aw1 r9 = r0.f13321
            g40 r1 = r0.f13320
            k12 r4 = r0.f13319
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L73
        L36:
            r8 = move-exception
            goto Lb3
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r8)
            return
        L3f:
            fo0 r8 = r0.f13322
            aw1 r9 = r0.f13321
            g40 r1 = r0.f13320
            k12 r4 = r0.f13319
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L36
            goto L76
        L4b:
            aw1 r9 = r0.f13321
            g40 r8 = r0.f13320
            k12 r1 = r0.f13319
            p000.i81.m2649(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb3
        L5a:
            p000.i81.m2649(r10)
            л r10 = r8.m7287()
            aw1 r10 = (p000.aw1) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            up r1 = r0.f8639     // Catch: java.lang.Throwable -> Lb0
            r1.getClass()     // Catch: java.lang.Throwable -> Lb0
            xn0 r4 = p000.xn0.f12226     // Catch: java.lang.Throwable -> Lb0
            sp r1 = r1.mo1785(r4)     // Catch: java.lang.Throwable -> Lb0
            fo0 r1 = (p000.fo0) r1     // Catch: java.lang.Throwable -> Lb0
        L73:
            r4 = r8
            r8 = r1
            r1 = r10
        L76:
            java.lang.Object r10 = r4.m3120(r9)     // Catch: java.lang.Throwable -> L36
            uy r5 = p000.pd2.f8524     // Catch: java.lang.Throwable -> L36
            cq r6 = p000.EnumC0184cq.f2716
            if (r10 != r5) goto L91
            r0.f13319 = r4     // Catch: java.lang.Throwable -> L36
            r0.f13320 = r1     // Catch: java.lang.Throwable -> L36
            r0.f13321 = r9     // Catch: java.lang.Throwable -> L36
            r0.f13322 = r8     // Catch: java.lang.Throwable -> L36
            r0.f13325 = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.m3109(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L76
            goto Laf
        L91:
            if (r8 == 0) goto L9f
            boolean r5 = r8.m2169()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9a
            goto L9f
        L9a:
            java.util.concurrent.CancellationException r8 = r8.m2159()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9f:
            r0.f13319 = r4     // Catch: java.lang.Throwable -> L36
            r0.f13320 = r1     // Catch: java.lang.Throwable -> L36
            r0.f13321 = r9     // Catch: java.lang.Throwable -> L36
            r0.f13322 = r8     // Catch: java.lang.Throwable -> L36
            r0.f13325 = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.mo1985(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Laf:
            return
        Lb0:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb3:
            r4.m7288(r9)
            throw r8
    }

    @Override // p000.d02
    public final java.lang.Object getValue() {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object[] r0 = r7.f5706     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            long r1 = r7.f5707     // Catch: java.lang.Throwable -> L2c
            long r3 = r7.m3114()     // Catch: java.lang.Throwable -> L2c
            int r5 = r7.f5709     // Catch: java.lang.Throwable -> L2c
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 + r5
            long r5 = r7.f5707     // Catch: java.lang.Throwable -> L2c
            long r3 = r3 - r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L2c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2c
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L2c
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2c
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L2c
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2c
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r7)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    @Override // p000.AbstractC1112
    /* JADX INFO: renamed from: β */
    public final p000.AbstractC1113 mo1984() {
            r2 = this;
            aw1 r2 = new aw1
            r2.<init>()
            r0 = -1
            r2.f1351 = r0
            return r2
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: γ */
    public final java.lang.Object mo601(p000.g40 r1, p000.InterfaceC0631op r2) {
            r0 = this;
            m3108(r0, r1, r2)
            cq r0 = p000.EnumC0184cq.f2716
            return r0
    }

    @Override // p000.g40
    /* JADX INFO: renamed from: δ */
    public final java.lang.Object mo1985(java.lang.Object r8, p000.InterfaceC0631op r9) {
            r7 = this;
            boolean r0 = r7.m3117(r8)
            if (r0 == 0) goto L9
            s62 r7 = p000.s62.f9751
            return r7
        L9:
            ae r5 = new ae
            op r9 = p000.AbstractC0978xb.m6563(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.m87()
            op[] r9 = p000.AbstractC0978xb.f12098
            monitor-enter(r7)
            boolean r0 = r7.m3118(r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L30
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2b
            r5.mo75(r8)     // Catch: java.lang.Throwable -> L2b
            op[] r8 = r7.m3113(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8e
        L30:
            yv1 r0 = new yv1     // Catch: java.lang.Throwable -> L8b
            long r1 = r7.m3114()     // Catch: java.lang.Throwable -> L8b
            int r3 = r7.f5709     // Catch: java.lang.Throwable -> L86
            int r4 = r7.f5710     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.m3112(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.f5710     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.f5710 = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.f5704     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            op[] r9 = r1.m3113(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8e
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L65
            ud r7 = new ud
            r0 = 1
            r7.<init>(r0, r9)
            r5.m91(r7)
        L65:
            int r7 = r8.length
            r9 = 0
        L67:
            if (r9 >= r7) goto L75
            r0 = r8[r9]
            if (r0 == 0) goto L72
            s62 r1 = p000.s62.f9751
            r0.mo75(r1)
        L72:
            int r9 = r9 + 1
            goto L67
        L75:
            java.lang.Object r7 = r5.m86()
            cq r8 = p000.EnumC0184cq.f2716
            if (r7 != r8) goto L7e
            goto L80
        L7e:
            s62 r7 = p000.s62.f9751
        L80:
            if (r7 != r8) goto L83
            return r7
        L83:
            s62 r7 = p000.s62.f9751
            return r7
        L86:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8e
        L8b:
            r0 = move-exception
            r1 = r7
            goto L55
        L8e:
            monitor-exit(r1)
            throw r8
    }

    @Override // p000.AbstractC1112
    /* JADX INFO: renamed from: ε */
    public final p000.AbstractC1113[] mo1986() {
            r0 = this;
            r0 = 2
            aw1[] r0 = new p000.aw1[r0]
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object m3109(p000.aw1 r6, p000.zv1 r7) {
            r5 = this;
            ae r0 = new ae
            op r7 = p000.AbstractC0978xb.m6563(r7)
            r1 = 1
            r0.<init>(r1, r7)
            r0.m87()
            monitor-enter(r5)
            long r1 = r5.m3119(r6)     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1d
            r6.f1352 = r0     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r6 = move-exception
            goto L2f
        L1d:
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1b
            r0.mo75(r6)     // Catch: java.lang.Throwable -> L1b
        L22:
            monitor-exit(r5)
            java.lang.Object r5 = r0.m86()
            cq r6 = p000.EnumC0184cq.f2716
            if (r5 != r6) goto L2c
            return r5
        L2c:
            s62 r5 = p000.s62.f9751
            return r5
        L2f:
            monitor-exit(r5)
            throw r6
    }

    /* JADX INFO: renamed from: ι */
    public final void m3110() {
            r8 = this;
            int r0 = r8.f5704
            r1 = 1
            if (r0 != 0) goto La
            int r0 = r8.f5710
            if (r0 > r1) goto La
            goto L3f
        La:
            java.lang.Object[] r0 = r8.f5706
            r0.getClass()
        Lf:
            int r2 = r8.f5710
            if (r2 <= 0) goto L3f
            long r2 = r8.m3114()
            int r4 = r8.f5709
            int r5 = r8.f5710
            int r4 = r4 + r5
            long r6 = (long) r4
            long r2 = r2 + r6
            r6 = 1
            long r2 = r2 - r6
            int r2 = (int) r2
            int r3 = r0.length
            int r3 = r3 - r1
            r2 = r2 & r3
            r2 = r0[r2]
            uy r3 = p000.pd2.f8524
            if (r2 != r3) goto L3f
            int r5 = r5 + (-1)
            r8.f5710 = r5
            long r2 = r8.m3114()
            int r4 = r8.f5709
            int r5 = r8.f5710
            int r4 = r4 + r5
            long r4 = (long) r4
            long r2 = r2 + r4
            r4 = 0
            p000.pd2.m4480(r0, r2, r4)
            goto Lf
        L3f:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m3111() {
            r10 = this;
            java.lang.Object[] r0 = r10.f5706
            r0.getClass()
            long r1 = r10.m3114()
            r3 = 0
            p000.pd2.m4480(r0, r1, r3)
            int r0 = r10.f5709
            int r0 = r0 + (-1)
            r10.f5709 = r0
            long r0 = r10.m3114()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r10.f5707
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r10.f5707 = r0
        L22:
            long r2 = r10.f5708
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L4d
            int r2 = r10.f13443
            if (r2 == 0) goto L4b
            л[] r2 = r10.f13442
            if (r2 == 0) goto L4b
            int r3 = r2.length
            r4 = 0
        L32:
            if (r4 >= r3) goto L4b
            r5 = r2[r4]
            if (r5 == 0) goto L48
            aw1 r5 = (p000.aw1) r5
            long r6 = r5.f1351
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L48
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L48
            r5.f1351 = r0
        L48:
            int r4 = r4 + 1
            goto L32
        L4b:
            r10.f5708 = r0
        L4d:
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m3112(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f5709
            int r1 = r6.f5710
            int r0 = r0 + r1
            java.lang.Object[] r1 = r6.f5706
            r2 = 2
            if (r1 != 0) goto L11
            r1 = 0
            r3 = 0
            java.lang.Object[] r1 = r6.m3115(r1, r3, r2)
            goto L1a
        L11:
            int r3 = r1.length
            if (r0 < r3) goto L1a
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r1 = r6.m3115(r1, r0, r3)
        L1a:
            long r2 = r6.m3114()
            long r4 = (long) r0
            long r2 = r2 + r4
            p000.pd2.m4480(r1, r2, r7)
            return
    }

    /* JADX INFO: renamed from: ν */
    public final p000.InterfaceC0631op[] m3113(p000.InterfaceC0631op[] r11) {
            r10 = this;
            int r0 = r11.length
            int r1 = r10.f13443
            if (r1 == 0) goto L3e
            л[] r1 = r10.f13442
            if (r1 == 0) goto L3e
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L3e
            r4 = r1[r3]
            if (r4 == 0) goto L3b
            aw1 r4 = (p000.aw1) r4
            ae r5 = r4.f1352
            if (r5 != 0) goto L18
            goto L3b
        L18:
            long r6 = r10.m3119(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L3b
            int r6 = r11.length
            if (r0 < r6) goto L30
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
        L30:
            r6 = r11
            op[] r6 = (p000.InterfaceC0631op[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.f1352 = r0
            r0 = r7
        L3b:
            int r3 = r3 + 1
            goto Lb
        L3e:
            op[] r11 = (p000.InterfaceC0631op[]) r11
            return r11
    }

    /* JADX INFO: renamed from: ξ */
    public final long m3114() {
            r4 = this;
            long r0 = r4.f5708
            long r2 = r4.f5707
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public final java.lang.Object[] m3115(java.lang.Object[] r7, int r8, int r9) {
            r6 = this;
            if (r9 <= 0) goto L20
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r6.f5706 = r9
            if (r7 != 0) goto L9
            goto L1f
        L9:
            long r0 = r6.m3114()
            r6 = 0
        Le:
            if (r6 >= r8) goto L1f
            long r2 = (long) r6
            long r2 = r2 + r0
            int r4 = (int) r2
            int r5 = r7.length
            int r5 = r5 + (-1)
            r4 = r4 & r5
            r4 = r7[r4]
            p000.pd2.m4480(r9, r2, r4)
            int r6 = r6 + 1
            goto Le
        L1f:
            return r9
        L20:
            java.lang.String r6 = "Buffer size overflow"
            p000.C1080.m7279(r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: π */
    public final void m3116(int r8) {
            r7 = this;
            monitor-enter(r7)
            java.lang.Object[] r0 = r7.f5706     // Catch: java.lang.Throwable -> L30
            r0.getClass()     // Catch: java.lang.Throwable -> L30
            long r1 = r7.f5707     // Catch: java.lang.Throwable -> L30
            long r3 = r7.m3114()     // Catch: java.lang.Throwable -> L30
            int r5 = r7.f5709     // Catch: java.lang.Throwable -> L30
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L30
            long r3 = r3 + r5
            long r5 = r7.f5707     // Catch: java.lang.Throwable -> L30
            long r3 = r3 - r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L30
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L30
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch: java.lang.Throwable -> L30
            int r2 = r0.length     // Catch: java.lang.Throwable -> L30
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L30
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L30
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L30
            int r0 = r0 + r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            r7.m3117(r8)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)
            return
        L30:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    /* JADX INFO: renamed from: ρ */
    public final boolean m3117(java.lang.Object r5) {
            r4 = this;
            op[] r0 = p000.AbstractC0978xb.f12098
            monitor-enter(r4)
            boolean r5 = r4.m3118(r5)     // Catch: java.lang.Throwable -> L10
            r1 = 0
            if (r5 == 0) goto L12
            op[] r0 = r4.m3113(r0)     // Catch: java.lang.Throwable -> L10
            r5 = 1
            goto L13
        L10:
            r5 = move-exception
            goto L24
        L12:
            r5 = r1
        L13:
            monitor-exit(r4)
            int r4 = r0.length
        L15:
            if (r1 >= r4) goto L23
            r2 = r0[r1]
            if (r2 == 0) goto L20
            s62 r3 = p000.s62.f9751
            r2.mo75(r3)
        L20:
            int r1 = r1 + 1
            goto L15
        L23:
            return r5
        L24:
            monitor-exit(r4)
            throw r5
    }

    /* JADX INFO: renamed from: σ */
    public final boolean m3118(java.lang.Object r13) {
            r12 = this;
            int r1 = r12.f13443
            int r2 = r12.f5703
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.m3112(r13)
            int r1 = r12.f5709
            int r1 = r1 + r9
            r12.f5709 = r1
            if (r1 <= r2) goto L18
            r12.m3111()
        L18:
            long r1 = r12.m3114()
            int r3 = r12.f5709
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f5708 = r1
            return r9
        L23:
            int r1 = r12.f5709
            int r3 = r12.f5704
            if (r1 < r3) goto L46
            long r4 = r12.f5708
            long r6 = r12.f5707
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            uc r1 = r12.f5705
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            p000.C1080.m7272()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.m3112(r13)
            int r1 = r12.f5709
            int r1 = r1 + r9
            r12.f5709 = r1
            if (r1 <= r3) goto L53
            r12.m3111()
        L53:
            long r3 = r12.m3114()
            int r1 = r12.f5709
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f5707
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f5708
            long r5 = r12.m3114()
            int r7 = r12.f5709
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m3114()
            int r10 = r12.f5709
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f5710
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.m3121(r1, r3, r5, r7)
        L7e:
            return r9
    }

    /* JADX INFO: renamed from: τ */
    public final long m3119(p000.aw1 r7) {
            r6 = this;
            long r0 = r7.f1351
            long r2 = r6.m3114()
            int r7 = r6.f5709
            long r4 = (long) r7
            long r2 = r2 + r4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto Lf
            goto L24
        Lf:
            int r7 = r6.f5704
            if (r7 <= 0) goto L14
            goto L21
        L14:
            long r2 = r6.m3114()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L1d
            goto L21
        L1d:
            int r6 = r6.f5710
            if (r6 != 0) goto L24
        L21:
            r6 = -1
            return r6
        L24:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public final java.lang.Object m3120(p000.aw1 r9) {
            r8 = this;
            op[] r0 = p000.AbstractC0978xb.f12098
            monitor-enter(r8)
            long r1 = r8.m3119(r9)     // Catch: java.lang.Throwable -> L10
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L12
            uy r9 = p000.pd2.f8524     // Catch: java.lang.Throwable -> L10
            goto L34
        L10:
            r9 = move-exception
            goto L46
        L12:
            long r3 = r9.f1351     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r0 = r8.f5706     // Catch: java.lang.Throwable -> L10
            r0.getClass()     // Catch: java.lang.Throwable -> L10
            int r5 = (int) r1     // Catch: java.lang.Throwable -> L10
            int r6 = r0.length     // Catch: java.lang.Throwable -> L10
            int r6 = r6 + (-1)
            r5 = r5 & r6
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L10
            boolean r5 = r0 instanceof p000.yv1     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L28
            yv1 r0 = (p000.yv1) r0     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.f12841     // Catch: java.lang.Throwable -> L10
        L28:
            r5 = 1
            long r1 = r1 + r5
            r9.f1351 = r1     // Catch: java.lang.Throwable -> L10
            op[] r9 = r8.m3122(r3)     // Catch: java.lang.Throwable -> L10
            r7 = r0
            r0 = r9
            r9 = r7
        L34:
            monitor-exit(r8)
            int r8 = r0.length
            r1 = 0
        L37:
            if (r1 >= r8) goto L45
            r2 = r0[r1]
            if (r2 == 0) goto L42
            s62 r3 = p000.s62.f9751
            r2.mo75(r3)
        L42:
            int r1 = r1 + 1
            goto L37
        L45:
            return r9
        L46:
            monitor-exit(r8)
            throw r9
    }

    /* JADX INFO: renamed from: φ */
    public final void m3121(long r7, long r9, long r11, long r13) {
            r6 = this;
            long r0 = java.lang.Math.min(r9, r7)
            long r2 = r6.m3114()
        L8:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L19
            java.lang.Object[] r4 = r6.f5706
            r4.getClass()
            r5 = 0
            p000.pd2.m4480(r4, r2, r5)
            r4 = 1
            long r2 = r2 + r4
            goto L8
        L19:
            r6.f5707 = r7
            r6.f5708 = r9
            long r7 = r11 - r0
            int r7 = (int) r7
            r6.f5709 = r7
            long r13 = r13 - r11
            int r7 = (int) r13
            r6.f5710 = r7
            return
    }

    /* JADX INFO: renamed from: χ */
    public final p000.InterfaceC0631op[] m3122(long r21) {
            r20 = this;
            r0 = r20
            uy r1 = p000.pd2.f8524
            op[] r2 = p000.AbstractC0978xb.f12098
            long r3 = r0.f5708
            int r3 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r3 <= 0) goto Ld
            goto L49
        Ld:
            long r3 = r0.m3114()
            int r5 = r0.f5709
            long r5 = (long) r5
            long r5 = r5 + r3
            int r7 = r0.f5704
            r8 = 1
            if (r7 != 0) goto L20
            int r10 = r0.f5710
            if (r10 <= 0) goto L20
            long r5 = r5 + r8
        L20:
            int r10 = r0.f13443
            r11 = 0
            if (r10 == 0) goto L43
            л[] r10 = r0.f13442
            if (r10 == 0) goto L43
            int r12 = r10.length
            r13 = r11
        L2b:
            if (r13 >= r12) goto L43
            r14 = r10[r13]
            if (r14 == 0) goto L40
            aw1 r14 = (p000.aw1) r14
            long r14 = r14.f1351
            r16 = 0
            int r16 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r16 < 0) goto L40
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 >= 0) goto L40
            r5 = r14
        L40:
            int r13 = r13 + 1
            goto L2b
        L43:
            long r12 = r0.f5708
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 > 0) goto L4a
        L49:
            return r2
        L4a:
            long r12 = r0.m3114()
            int r10 = r0.f5709
            long r14 = (long) r10
            long r12 = r12 + r14
            int r10 = r0.f13443
            int r14 = r0.f5710
            if (r10 <= 0) goto L64
            r21 = r8
            long r8 = r12 - r5
            int r8 = (int) r8
            int r8 = r7 - r8
            int r14 = java.lang.Math.min(r14, r8)
            goto L66
        L64:
            r21 = r8
        L66:
            int r8 = r0.f5710
            long r8 = (long) r8
            long r8 = r8 + r12
            if (r14 <= 0) goto Lb5
            op[] r2 = new p000.InterfaceC0631op[r14]
            java.lang.Object[] r10 = r0.f5706
            r10.getClass()
            r15 = r3
            r4 = r2
            r2 = r12
        L76:
            int r17 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r17 >= 0) goto Lb0
            r17 = r4
            int r4 = (int) r12
            r18 = r4
            int r4 = r10.length
            int r4 = r4 + (-1)
            r4 = r18 & r4
            r4 = r10[r4]
            if (r4 == r1) goto La7
            r4.getClass()
            yv1 r4 = (p000.yv1) r4
            r18 = r5
            int r5 = r11 + 1
            ae r6 = r4.f12842
            r17[r11] = r6
            p000.pd2.m4480(r10, r12, r1)
            java.lang.Object r4 = r4.f12841
            p000.pd2.m4480(r10, r2, r4)
            long r2 = r2 + r21
            if (r5 >= r14) goto La3
            r11 = r5
            goto La9
        La3:
            r12 = r2
            r10 = r17
            goto Lb9
        La7:
            r18 = r5
        La9:
            long r12 = r12 + r21
            r4 = r17
            r5 = r18
            goto L76
        Lb0:
            r17 = r4
            r18 = r5
            goto La3
        Lb5:
            r15 = r3
            r18 = r5
            r10 = r2
        Lb9:
            long r2 = r12 - r15
            int r2 = (int) r2
            int r3 = r0.f13443
            if (r3 != 0) goto Lc2
            r3 = r12
            goto Lc4
        Lc2:
            r3 = r18
        Lc4:
            long r5 = r0.f5707
            int r11 = r0.f5703
            int r2 = java.lang.Math.min(r11, r2)
            long r14 = (long) r2
            long r14 = r12 - r14
            long r5 = java.lang.Math.max(r5, r14)
            if (r7 != 0) goto Lef
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto Lef
            java.lang.Object[] r2 = r0.f5706
            r2.getClass()
            int r7 = (int) r5
            int r11 = r2.length
            int r11 = r11 + (-1)
            r7 = r7 & r11
            r2 = r2[r7]
            boolean r1 = p000.ln0.m3626(r2, r1)
            if (r1 == 0) goto Lef
            long r12 = r12 + r21
            long r5 = r5 + r21
        Lef:
            r1 = r5
            r7 = r8
            r5 = r12
            r0.m3121(r1, r3, r5, r7)
            r0.m3110()
            int r1 = r10.length
            if (r1 != 0) goto Lfc
            return r10
        Lfc:
            op[] r0 = r0.m3113(r10)
            return r0
    }
}
