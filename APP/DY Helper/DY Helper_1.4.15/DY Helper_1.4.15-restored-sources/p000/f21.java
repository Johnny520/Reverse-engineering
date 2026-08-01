package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class f21 extends p000.tw1 {

    /* JADX INFO: renamed from: ξ */
    public static final int[] f3726 = null;

    /* JADX INFO: renamed from: ε */
    public final p000.a80 f3727;

    /* JADX INFO: renamed from: ζ */
    public final p000.a80 f3728;

    /* JADX INFO: renamed from: η */
    public int f3729;

    /* JADX INFO: renamed from: θ */
    public p000.c21 f3730;

    /* JADX INFO: renamed from: ι */
    public java.util.ArrayList f3731;

    /* JADX INFO: renamed from: κ */
    public p000.yw1 f3732;

    /* JADX INFO: renamed from: λ */
    public int[] f3733;

    /* JADX INFO: renamed from: μ */
    public int f3734;

    /* JADX INFO: renamed from: ν */
    public boolean f3735;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            p000.f21.f3726 = r0
            return
    }

    public f21(long r1, p000.yw1 r3, p000.a80 r4, p000.a80 r5) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f3727 = r4
            r0.f3728 = r5
            yw1 r1 = p000.yw1.f12861
            r0.f3732 = r1
            int[] r1 = p000.f21.f3726
            r0.f3733 = r1
            r1 = 1
            r0.f3734 = r1
            return
    }

    /* JADX INFO: renamed from: Α */
    public p000.a80 mo1994() {
            r0 = this;
            a80 r0 = r0.f3727
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public final p000.g81 m1995(long r29, p000.c21 r31, java.util.HashMap r32, p000.yw1 r33) {
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = r31
            r4 = r32
            yw1 r5 = r0.mo5758()
            long r6 = r0.mo5759()
            yw1 r5 = r5.m7048(r6)
            yw1 r6 = r0.f3732
            yw1 r5 = r5.m7047(r6)
            java.lang.Object[] r6 = r3.f1942
            long[] r7 = r3.f1941
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L16b
            r11 = 0
            r12 = 0
            r13 = 0
        L26:
            r14 = r7[r11]
            r16 = 0
            long r9 = ~r14
            r17 = 7
            long r9 = r9 << r17
            long r9 = r9 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r17
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L155
            int r9 = r11 - r8
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r17 = r10
            r10 = 0
        L47:
            if (r10 >= r9) goto L144
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L127
            int r18 = r11 << 3
            int r18 = r18 + r10
            r18 = r6[r18]
            r19 = r6
            r6 = r18
            i02 r6 = (p000.i02) r6
            r18 = r7
            k02 r7 = r6.mo2200()
            r20 = r10
            r21 = r12
            r10 = r33
            k02 r12 = p000.ax1.m637(r7, r1, r10)
            if (r12 != 0) goto L78
            r25 = r5
            r22 = r13
            r23 = r14
            goto L95
        L78:
            r22 = r13
            r23 = r14
            long r13 = r0.mo5759()
            k02 r13 = p000.ax1.m637(r7, r13, r5)
            if (r13 != 0) goto L89
            r25 = r5
            goto L95
        L89:
            long r14 = r13.f5697
            r25 = r5
            r5 = 1
            r26 = r14
            long r14 = (long) r5
            int r5 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r5 != 0) goto L97
        L95:
            goto L124
        L97:
            boolean r5 = r12.equals(r13)
            if (r5 != 0) goto L124
            long r14 = r0.mo5759()
            yw1 r5 = r0.mo5758()
            k02 r5 = p000.ax1.m637(r7, r14, r5)
            if (r5 == 0) goto L120
            if (r4 == 0) goto Lb5
            java.lang.Object r7 = r4.get(r12)
            k02 r7 = (p000.k02) r7
            if (r7 != 0) goto Lb9
        Lb5:
            k02 r7 = r6.mo2578(r13, r12, r5)
        Lb9:
            if (r7 != 0) goto Lc1
            vw1 r1 = new vw1
            r1.<init>(r0)
            return r1
        Lc1:
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L124
            boolean r5 = r7.equals(r12)
            if (r5 == 0) goto Lf6
            if (r21 != 0) goto Ld5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto Ld7
        Ld5:
            r5 = r21
        Ld7:
            long r13 = r0.mo5759()
            k02 r7 = r12.mo1084(r13)
            l91 r12 = new l91
            r12.<init>(r6, r7)
            r5.add(r12)
            if (r22 != 0) goto Lef
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            goto Lf1
        Lef:
            r13 = r22
        Lf1:
            r13.add(r6)
            r12 = r5
            goto L137
        Lf6:
            if (r21 != 0) goto Lfe
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            goto L100
        Lfe:
            r12 = r21
        L100:
            boolean r5 = r7.equals(r13)
            if (r5 != 0) goto L10c
            l91 r5 = new l91
            r5.<init>(r6, r7)
            goto L11a
        L10c:
            long r14 = r0.mo5759()
            k02 r5 = r13.mo1084(r14)
            l91 r7 = new l91
            r7.<init>(r6, r5)
            r5 = r7
        L11a:
            r12.add(r5)
        L11d:
            r13 = r22
            goto L137
        L120:
            p000.ax1.m636()
            throw r16
        L124:
            r12 = r21
            goto L11d
        L127:
            r25 = r5
            r19 = r6
            r18 = r7
            r20 = r10
            r21 = r12
            r22 = r13
            r23 = r14
            r10 = r33
        L137:
            long r14 = r23 >> r17
            int r5 = r20 + 1
            r10 = r5
            r7 = r18
            r6 = r19
            r5 = r25
            goto L47
        L144:
            r10 = r33
            r25 = r5
            r19 = r6
            r18 = r7
            r21 = r12
            r22 = r13
            r5 = r17
            if (r9 != r5) goto L171
            goto L15d
        L155:
            r10 = r33
            r25 = r5
            r19 = r6
            r18 = r7
        L15d:
            if (r11 == r8) goto L169
            int r11 = r11 + 1
            r7 = r18
            r6 = r19
            r5 = r25
            goto L26
        L169:
            r9 = r12
            goto L170
        L16b:
            r16 = 0
            r9 = r16
            r13 = r9
        L170:
            r12 = r9
        L171:
            if (r12 == 0) goto L1a0
            r0.m2012()
            int r4 = r12.size()
            r5 = 0
        L17b:
            if (r5 >= r4) goto L1a0
            java.lang.Object r6 = r12.get(r5)
            l91 r6 = (p000.l91) r6
            java.lang.Object r7 = r6.f6502
            i02 r7 = (p000.i02) r7
            java.lang.Object r6 = r6.f6503
            k02 r6 = (p000.k02) r6
            r6.f5697 = r1
            java.lang.Object r8 = p000.ax1.f1362
            monitor-enter(r8)
            k02 r9 = r7.mo2200()     // Catch: java.lang.Throwable -> L19d
            r6.f5698 = r9     // Catch: java.lang.Throwable -> L19d
            r7.mo2201(r6)     // Catch: java.lang.Throwable -> L19d
            monitor-exit(r8)
            int r5 = r5 + 1
            goto L17b
        L19d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L1a0:
            if (r13 == 0) goto L1c0
            int r1 = r13.size()
            r10 = 0
        L1a7:
            if (r10 >= r1) goto L1b5
            java.lang.Object r2 = r13.get(r10)
            i02 r2 = (p000.i02) r2
            r3.m1117(r2)
            int r10 = r10 + 1
            goto L1a7
        L1b5:
            java.util.ArrayList r1 = r0.f3731
            if (r1 != 0) goto L1ba
            goto L1be
        L1ba:
            java.util.ArrayList r13 = p000.AbstractC0984xh.m6651(r1, r13)
        L1be:
            r0.f3731 = r13
        L1c0:
            ww1 r0 = p000.ww1.f11879
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public final void m1996(long r3) {
            r2 = this;
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            yw1 r1 = r2.f3732     // Catch: java.lang.Throwable -> Ld
            yw1 r3 = r1.m7048(r3)     // Catch: java.lang.Throwable -> Ld
            r2.f3732 = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: Δ */
    public void mo1997(p000.c21 r1) {
            r0 = this;
            r0.f3730 = r1
            return
    }

    /* JADX INFO: renamed from: Ε */
    public p000.f21 mo1998(p000.a80 r12, p000.a80 r13) {
            r11 = this;
            boolean r0 = r11.f10484
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            p000.pi1.m4544(r0)
        L9:
            boolean r0 = r11.f3735
            if (r0 == 0) goto L17
            int r0 = r11.f10485
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            p000.pi1.m4545(r0)
        L17:
            long r0 = r11.mo5759()
            r11.m1996(r0)
            java.lang.Object r1 = p000.ax1.f1362
            monitor-enter(r1)
            long r3 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L96
            r0 = 1
            long r9 = (long) r0     // Catch: java.lang.Throwable -> L96
            long r5 = r3 + r9
            p000.ax1.f1364 = r5     // Catch: java.lang.Throwable -> L96
            yw1 r2 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L96
            yw1 r2 = r2.m7048(r3)     // Catch: java.lang.Throwable -> L96
            p000.ax1.f1363 = r2     // Catch: java.lang.Throwable -> L96
            yw1 r2 = r11.mo5758()     // Catch: java.lang.Throwable -> L96
            yw1 r5 = r2.m7048(r3)     // Catch: java.lang.Throwable -> L96
            r11.mo5762(r5)     // Catch: java.lang.Throwable -> L96
            r5 = r2
            u21 r2 = new u21     // Catch: java.lang.Throwable -> L96
            long r6 = r11.mo5759()     // Catch: java.lang.Throwable -> L96
            long r6 = r6 + r9
            yw1 r5 = p000.ax1.m622(r5, r6, r3)     // Catch: java.lang.Throwable -> L96
            a80 r6 = r11.mo1994()     // Catch: java.lang.Throwable -> L96
            a80 r6 = p000.ax1.m629(r12, r6, r0)     // Catch: java.lang.Throwable -> L96
            a80 r12 = r11.mo2004()     // Catch: java.lang.Throwable -> L96
            a80 r7 = p000.ax1.m630(r13, r12)     // Catch: java.lang.Throwable -> L96
            r8 = r11
            r2.<init>(r3, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r1)
            boolean r11 = r8.f3735
            if (r11 != 0) goto L95
            boolean r11 = r8.f10484
            if (r11 != 0) goto L95
            long r11 = r8.mo5759()
            monitor-enter(r1)
            long r3 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L91
            long r5 = r3 + r9
            p000.ax1.f1364 = r5     // Catch: java.lang.Throwable -> L91
            r8.mo5763(r3)     // Catch: java.lang.Throwable -> L91
            yw1 r13 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L91
            long r3 = r8.mo5759()     // Catch: java.lang.Throwable -> L91
            yw1 r13 = r13.m7048(r3)     // Catch: java.lang.Throwable -> L91
            p000.ax1.f1363 = r13     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            yw1 r13 = r8.mo5758()
            long r11 = r11 + r9
            long r0 = r8.mo5759()
            yw1 r11 = p000.ax1.m622(r13, r11, r0)
            r8.mo5762(r11)
            return r2
        L91:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
        L95:
            return r2
        L96:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)
            throw r11
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: β */
    public final void mo1999() {
            r3 = this;
            yw1 r0 = p000.ax1.f1363
            long r1 = r3.mo5759()
            yw1 r0 = r0.m7045(r1)
            yw1 r3 = r3.f3732
            yw1 r3 = r0.m7044(r3)
            p000.ax1.f1363 = r3
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: γ */
    public void mo2000() {
            r1 = this;
            boolean r0 = r1.f10484
            if (r0 != 0) goto L15
            r0 = 1
            r1.f10484 = r0
            java.lang.Object r0 = p000.ax1.f1362
            monitor-enter(r0)
            r1.m5761()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            r1.mo2006()
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L15:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ε */
    public /* bridge */ /* synthetic */ p000.a80 mo2001() {
            r0 = this;
            a80 r0 = r0.mo1994()
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ζ */
    public boolean mo2002() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: θ */
    public int mo2003() {
            r0 = this;
            int r0 = r0.f3729
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ι */
    public p000.a80 mo2004() {
            r0 = this;
            a80 r0 = r0.f3728
            return r0
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: λ */
    public void mo2005() {
            r1 = this;
            int r0 = r1.f3734
            int r0 = r0 + 1
            r1.f3734 = r0
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: μ */
    public void mo2006() {
            r17 = this;
            r0 = r17
            int r1 = r0.f3734
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            p000.pi1.m4544(r1)
        Lc:
            int r1 = r0.f3734
            int r1 = r1 + (-1)
            r0.f3734 = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f3735
            if (r1 != 0) goto L94
            c21 r1 = r0.mo2014()
            if (r1 == 0) goto L91
            boolean r2 = r0.f3735
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            p000.pi1.m4545(r2)
        L27:
            r2 = 0
            r0.mo1997(r2)
            long r2 = r0.mo5759()
            java.lang.Object[] r4 = r1.f1942
            long[] r1 = r1.f1941
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            i02 r13 = (p000.i02) r13
            k02 r13 = r13.mo2200()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f5697
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            yw1 r6 = r0.f3732
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = p000.AbstractC0984xh.m6632(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            eu1 r6 = p000.ax1.f1360
            r14 = 0
            r13.f5697 = r14
        L83:
            k02 r13 = r13.f5698
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.m5757()
        L94:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ν */
    public void mo2007() {
            r1 = this;
            boolean r0 = r1.f3735
            if (r0 != 0) goto Lc
            boolean r0 = r1.f10484
            if (r0 == 0) goto L9
            goto Lc
        L9:
            r1.m2012()
        Lc:
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: ξ */
    public void mo2008(p000.i02 r2) {
            r1 = this;
            c21 r0 = r1.mo2014()
            if (r0 != 0) goto L10
            int r0 = p000.uq1.f10933
            c21 r0 = new c21
            r0.<init>()
            r1.mo1997(r0)
        L10:
            r0.m1107(r2)
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: π */
    public final void mo2009() {
            r3 = this;
            int[] r0 = r3.f3733
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L10
            int[] r2 = r3.f3733
            r2 = r2[r1]
            p000.ax1.m639(r2)
            int r1 = r1 + 1
            goto L4
        L10:
            r3.m5761()
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: υ */
    public void mo2010(int r1) {
            r0 = this;
            r0.f3729 = r1
            return
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: φ */
    public p000.tw1 mo2011(p000.a80 r12) {
            r11 = this;
            boolean r0 = r11.f10484
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot use a disposed snapshot"
            p000.pi1.m4544(r0)
        L9:
            boolean r0 = r11.f3735
            if (r0 == 0) goto L17
            int r0 = r11.f10485
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r0 = "Unsupported operation on a disposed or applied snapshot"
            p000.pi1.m4545(r0)
        L17:
            long r0 = r11.mo5759()
            long r2 = r11.mo5759()
            r11.m1996(r2)
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            long r4 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L88
            r3 = 1
            long r9 = (long) r3     // Catch: java.lang.Throwable -> L88
            long r6 = r4 + r9
            p000.ax1.f1364 = r6     // Catch: java.lang.Throwable -> L88
            yw1 r6 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L88
            yw1 r6 = r6.m7048(r4)     // Catch: java.lang.Throwable -> L88
            p000.ax1.f1363 = r6     // Catch: java.lang.Throwable -> L88
            r6 = r3
            v21 r3 = new v21     // Catch: java.lang.Throwable -> L88
            yw1 r7 = r11.mo5758()     // Catch: java.lang.Throwable -> L88
            long r0 = r0 + r9
            yw1 r0 = p000.ax1.m622(r7, r0, r4)     // Catch: java.lang.Throwable -> L88
            a80 r1 = r11.mo1994()     // Catch: java.lang.Throwable -> L88
            a80 r7 = p000.ax1.m629(r12, r1, r6)     // Catch: java.lang.Throwable -> L88
            r8 = r11
            r6 = r0
            r3.<init>(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r2)
            boolean r11 = r8.f3735
            if (r11 != 0) goto L87
            boolean r11 = r8.f10484
            if (r11 != 0) goto L87
            long r11 = r8.mo5759()
            monitor-enter(r2)
            long r0 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L83
            long r4 = r0 + r9
            p000.ax1.f1364 = r4     // Catch: java.lang.Throwable -> L83
            r8.mo5763(r0)     // Catch: java.lang.Throwable -> L83
            yw1 r0 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L83
            long r4 = r8.mo5759()     // Catch: java.lang.Throwable -> L83
            yw1 r0 = r0.m7048(r4)     // Catch: java.lang.Throwable -> L83
            p000.ax1.f1363 = r0     // Catch: java.lang.Throwable -> L83
            monitor-exit(r2)
            yw1 r0 = r8.mo5758()
            long r11 = r11 + r9
            long r1 = r8.mo5759()
            yw1 r11 = p000.ax1.m622(r0, r11, r1)
            r8.mo5762(r11)
            return r3
        L83:
            r0 = move-exception
            r11 = r0
            monitor-exit(r2)
            throw r11
        L87:
            return r3
        L88:
            r0 = move-exception
            r11 = r0
            monitor-exit(r2)
            throw r11
    }

    /* JADX INFO: renamed from: χ */
    public final void m2012() {
            r9 = this;
            long r0 = r9.mo5759()
            r9.m1996(r0)
            boolean r0 = r9.f3735
            if (r0 != 0) goto L42
            boolean r0 = r9.f10484
            if (r0 != 0) goto L42
            long r0 = r9.mo5759()
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            long r3 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L3f
            r5 = 1
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L3f
            long r7 = r3 + r5
            p000.ax1.f1364 = r7     // Catch: java.lang.Throwable -> L3f
            r9.mo5763(r3)     // Catch: java.lang.Throwable -> L3f
            yw1 r3 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L3f
            long r7 = r9.mo5759()     // Catch: java.lang.Throwable -> L3f
            yw1 r3 = r3.m7048(r7)     // Catch: java.lang.Throwable -> L3f
            p000.ax1.f1363 = r3     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)
            yw1 r2 = r9.mo5758()
            long r0 = r0 + r5
            long r3 = r9.mo5759()
            yw1 r0 = p000.ax1.m622(r2, r0, r3)
            r9.mo5762(r0)
            return
        L3f:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L42:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public p000.g81 mo2013() {
            r22 = this;
            r0 = r22
            c21 r3 = r0.mo2014()
            r6 = 0
            if (r3 == 0) goto L19
            sa0 r1 = p000.ax1.f1369
            long r1 = r1.f10483
            yw1 r4 = p000.ax1.f1363
            yw1 r4 = r4.m7045(r1)
            java.util.HashMap r1 = p000.ax1.m620(r1, r0, r4)
            r4 = r1
            goto L1a
        L19:
            r4 = r6
        L1a:
            jz r1 = p000.C0450jz.f5672
            java.lang.Object r7 = p000.ax1.f1362
            monitor-enter(r7)
            p000.ax1.m621(r0)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L58
            int r2 = r3.f1944     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L29
            goto L58
        L29:
            sa0 r8 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L55
            long r1 = p000.ax1.f1364     // Catch: java.lang.Throwable -> L55
            yw1 r5 = p000.ax1.f1363     // Catch: java.lang.Throwable -> L55
            long r9 = r8.f10483     // Catch: java.lang.Throwable -> L55
            yw1 r5 = r5.m7045(r9)     // Catch: java.lang.Throwable -> L55
            g81 r1 = r0.m1995(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L55
            ww1 r2 = p000.ww1.f11879     // Catch: java.lang.Throwable -> L55
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L43
            monitor-exit(r7)
            return r1
        L43:
            r0.mo1999()     // Catch: java.lang.Throwable -> L55
            c21 r1 = r8.f3730     // Catch: java.lang.Throwable -> L55
            eu1 r2 = p000.ax1.f1360     // Catch: java.lang.Throwable -> L55
            p000.ax1.m640(r8, r2)     // Catch: java.lang.Throwable -> L55
            r0.mo1997(r6)     // Catch: java.lang.Throwable -> L55
            r8.f3730 = r6     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L55
            goto L73
        L55:
            r0 = move-exception
            goto L169
        L58:
            r0.mo1999()     // Catch: java.lang.Throwable -> L55
            sa0 r2 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L55
            c21 r4 = r2.f3730     // Catch: java.lang.Throwable -> L55
            eu1 r5 = p000.ax1.f1360     // Catch: java.lang.Throwable -> L55
            p000.ax1.m640(r2, r5)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L71
            boolean r2 = r4.m1114()     // Catch: java.lang.Throwable -> L55
            if (r2 == 0) goto L71
            java.lang.Object r1 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L55
            r2 = r1
            r1 = r4
            goto L73
        L71:
            r2 = r1
            r1 = r6
        L73:
            monitor-exit(r7)
            r4 = 1
            r0.f3735 = r4
            if (r1 == 0) goto L97
            vq1 r5 = new vq1
            r5.<init>(r1)
            boolean r7 = r1.m1113()
            if (r7 != 0) goto L97
            int r7 = r2.size()
            r8 = 0
        L89:
            if (r8 >= r7) goto L97
            java.lang.Object r9 = r2.get(r8)
            e80 r9 = (p000.e80) r9
            r9.invoke(r5, r0)
            int r8 = r8 + 1
            goto L89
        L97:
            if (r3 == 0) goto Lb7
            boolean r5 = r3.m1114()
            if (r5 == 0) goto Lb7
            vq1 r5 = new vq1
            r5.<init>(r3)
            int r7 = r2.size()
            r8 = 0
        La9:
            if (r8 >= r7) goto Lb7
            java.lang.Object r9 = r2.get(r8)
            e80 r9 = (p000.e80) r9
            r9.invoke(r5, r0)
            int r8 = r8 + 1
            goto La9
        Lb7:
            java.lang.Object r2 = p000.ax1.f1362
            monitor-enter(r2)
            r0.mo2009()     // Catch: java.lang.Throwable -> Lfe
            p000.ax1.m624()     // Catch: java.lang.Throwable -> Lfe
            r5 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            if (r1 == 0) goto L10b
            java.lang.Object[] r14 = r1.f1942     // Catch: java.lang.Throwable -> Lfe
            long[] r1 = r1.f1941     // Catch: java.lang.Throwable -> Lfe
            int r15 = r1.length     // Catch: java.lang.Throwable -> Lfe
            int r15 = r15 + (-2)
            if (r15 < 0) goto L10b
            r4 = 0
            r16 = 128(0x80, double:6.3E-322)
        Ld6:
            r7 = r1[r4]     // Catch: java.lang.Throwable -> Lfe
            r18 = 255(0xff, double:1.26E-321)
            long r9 = ~r7     // Catch: java.lang.Throwable -> Lfe
            long r9 = r9 << r5
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L106
            int r9 = r4 - r15
            int r9 = ~r9     // Catch: java.lang.Throwable -> Lfe
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lea:
            if (r10 >= r9) goto L104
            long r20 = r7 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L100
            int r20 = r4 << 3
            int r20 = r20 + r10
            r20 = r14[r20]     // Catch: java.lang.Throwable -> Lfe
            i02 r20 = (p000.i02) r20     // Catch: java.lang.Throwable -> Lfe
            p000.ax1.m635(r20)     // Catch: java.lang.Throwable -> Lfe
            goto L100
        Lfe:
            r0 = move-exception
            goto L167
        L100:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto Lea
        L104:
            if (r9 != r13) goto L10f
        L106:
            if (r4 == r15) goto L10f
            int r4 = r4 + 1
            goto Ld6
        L10b:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L10f:
            if (r3 == 0) goto L14a
            java.lang.Object[] r1 = r3.f1942     // Catch: java.lang.Throwable -> Lfe
            long[] r3 = r3.f1941     // Catch: java.lang.Throwable -> Lfe
            int r4 = r3.length     // Catch: java.lang.Throwable -> Lfe
            int r4 = r4 + (-2)
            if (r4 < 0) goto L14a
            r7 = 0
        L11b:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> Lfe
            long r14 = ~r8     // Catch: java.lang.Throwable -> Lfe
            long r14 = r14 << r5
            long r14 = r14 & r8
            long r14 = r14 & r11
            int r10 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r10 == 0) goto L145
            int r10 = r7 - r4
            int r10 = ~r10     // Catch: java.lang.Throwable -> Lfe
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r14 = 0
        L12d:
            if (r14 >= r10) goto L143
            long r20 = r8 & r18
            int r15 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r15 >= 0) goto L13f
            int r15 = r7 << 3
            int r15 = r15 + r14
            r15 = r1[r15]     // Catch: java.lang.Throwable -> Lfe
            i02 r15 = (p000.i02) r15     // Catch: java.lang.Throwable -> Lfe
            p000.ax1.m635(r15)     // Catch: java.lang.Throwable -> Lfe
        L13f:
            long r8 = r8 >> r13
            int r14 = r14 + 1
            goto L12d
        L143:
            if (r10 != r13) goto L14a
        L145:
            if (r7 == r4) goto L14a
            int r7 = r7 + 1
            goto L11b
        L14a:
            java.util.ArrayList r1 = r0.f3731     // Catch: java.lang.Throwable -> Lfe
            if (r1 == 0) goto L161
            int r3 = r1.size()     // Catch: java.lang.Throwable -> Lfe
            r4 = 0
        L153:
            if (r4 >= r3) goto L161
            java.lang.Object r5 = r1.get(r4)     // Catch: java.lang.Throwable -> Lfe
            i02 r5 = (p000.i02) r5     // Catch: java.lang.Throwable -> Lfe
            p000.ax1.m635(r5)     // Catch: java.lang.Throwable -> Lfe
            int r4 = r4 + 1
            goto L153
        L161:
            r0.f3731 = r6     // Catch: java.lang.Throwable -> Lfe
            monitor-exit(r2)
            ww1 r0 = p000.ww1.f11879
            return r0
        L167:
            monitor-exit(r2)
            throw r0
        L169:
            monitor-exit(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ω */
    public p000.c21 mo2014() {
            r0 = this;
            c21 r0 = r0.f3730
            return r0
    }
}
