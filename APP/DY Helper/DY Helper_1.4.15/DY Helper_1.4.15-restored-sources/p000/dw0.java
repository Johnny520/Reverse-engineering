package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class dw0 extends p000.ch1 implements p000.rx0, p000.d11 {

    /* JADX INFO: renamed from: κ */
    public p000.aw0 f3305;

    /* JADX INFO: renamed from: λ */
    public p000.a80 f3306;

    /* JADX INFO: renamed from: μ */
    public p000.eh1 f3307;

    /* JADX INFO: renamed from: ν */
    public boolean f3308;

    /* JADX INFO: renamed from: ξ */
    public boolean f3309;

    /* JADX INFO: renamed from: ο */
    public final p000.ew0 f3310;

    /* JADX INFO: renamed from: π */
    public p000.C0610o4 f3311;

    /* JADX INFO: renamed from: ρ */
    public p000.b21 f3312;

    public dw0() {
            r2 = this;
            r2.<init>()
            ew0 r0 = new ew0
            r1 = 0
            r0.<init>(r1, r2)
            r2.f3310 = r0
            return
    }

    /* JADX INFO: renamed from: Ж */
    public static void m1802(p000.q31 r1) {
            q31 r0 = r1.f8840
            yp0 r1 = r1.f8839
            if (r0 == 0) goto L9
            yp0 r0 = r0.f8839
            goto La
        L9:
            r0 = 0
        La:
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1a
            bq0 r1 = r1.f12734
            ox0 r1 = r1.f1815
            zp0 r1 = r1.f8316
            r1.m7222()
            return
        L1a:
            bq0 r1 = r1.f12734
            ox0 r1 = r1.f1815
            c0 r1 = r1.mo1087()
            if (r1 == 0) goto L2d
            ox0 r1 = (p000.ox0) r1
            zp0 r1 = r1.f8316
            if (r1 == 0) goto L2d
            r1.m7222()
        L2d:
            return
    }

    @Override // p000.d11
    /* JADX INFO: renamed from: Α */
    public final void mo1637() {
            r2 = this;
            dw0 r0 = r2.mo1806()
            r1 = 0
            if (r0 == 0) goto Lc
            yp0 r0 = r0.mo1804()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            yp0 r2 = r2.mo1804()
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L18
            goto L28
        L18:
            if (r0 == 0) goto L1e
            bq0 r2 = r0.f12734
            up0 r1 = r2.f1803
        L1e:
            up0 r2 = p000.up0.f10921
            if (r1 == r2) goto L28
            if (r0 == 0) goto L28
            bq0 r2 = r0.f12734
            up0 r2 = r2.f1803
        L28:
            return
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: Ν */
    public final p000.qx0 mo1609(int r9, int r10, java.util.Map r11, p000.a80 r12, p000.a80 r13) {
            r8 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r9 & r0
            if (r1 != 0) goto La
            r0 = r0 & r10
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.am0.m178(r0)
        L28:
            cw0 r1 = new cw0
            r7 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: ν */
    public boolean mo1610() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: А */
    public abstract boolean mo1803();

    /* JADX INFO: renamed from: Б */
    public abstract p000.yp0 mo1804();

    /* JADX INFO: renamed from: В */
    public abstract p000.qx0 mo1805();

    /* JADX INFO: renamed from: Г */
    public abstract p000.dw0 mo1806();

    /* JADX INFO: renamed from: Д */
    public abstract long mo1807();

    /* JADX INFO: renamed from: Е */
    public final p000.aw0 m1808() {
            r1 = this;
            aw0 r0 = r1.f3305
            if (r0 != 0) goto Lb
            aw0 r0 = new aw0
            r0.<init>(r1)
            r1.f3305 = r0
        Lb:
            return r0
    }

    /* JADX INFO: renamed from: З */
    public final void m1809(p000.c21 r14) {
            r13 = this;
            java.lang.Object[] r0 = r14.f1942
            long[] r14 = r14.f1941
            int r1 = r14.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L57
            r2 = 0
            r3 = r2
        Lb:
            r4 = r14[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L52
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L50
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4c
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            lb2 r9 = (p000.lb2) r9
            java.lang.Object r9 = r9.get()
            yp0 r9 = (p000.yp0) r9
            if (r9 == 0) goto L4c
            boolean r10 = r13.mo1610()
            if (r10 == 0) goto L49
            r9.m6986(r2)
            goto L4c
        L49:
            r9.m6987(r2)
        L4c:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L50:
            if (r6 != r7) goto L57
        L52:
            if (r3 == r1) goto L57
            int r3 = r3 + 1
            goto Lb
        L57:
            return
    }

    /* JADX INFO: renamed from: И */
    public abstract void mo1810();

    /* JADX INFO: renamed from: ц */
    public final void m1811(p000.yp0 r32, p000.te0 r33) {
            r31 = this;
            r0 = r31
            r1 = r33
            b21 r2 = r0.f3312
            r7 = 7
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = 8
            if (r2 == 0) goto L108
            java.lang.Object[] r12 = r2.f1429
            long[] r2 = r2.f1427
            int r13 = r2.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L108
            r14 = 0
            r15 = 128(0x80, double:6.3E-322)
        L1c:
            r3 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r5 = ~r3
            long r5 = r5 << r7
            long r5 = r5 & r3
            long r5 = r5 & r8
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto Lf0
            int r5 = r14 - r13
            int r5 = ~r5
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r6 = 0
        L30:
            if (r6 >= r5) goto Le4
            long r19 = r3 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Lc6
            int r19 = r14 << 3
            int r19 = r19 + r6
            r19 = r12[r19]
            r20 = r7
            r7 = r19
            c21 r7 = (p000.c21) r7
            r21 = r8
            java.lang.Object[] r8 = r7.f1942
            long[] r9 = r7.f1941
            int r11 = r9.length
            int r11 = r11 + (-2)
            if (r11 < 0) goto Lbb
            r23 = r15
            r15 = 0
            r16 = r10
        L54:
            r25 = r11
            r10 = r9[r15]
            r26 = r2
            r27 = r3
            long r2 = ~r10
            long r2 = r2 << r20
            long r2 = r2 & r10
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto Lab
            int r2 = r15 - r25
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L6e:
            if (r3 >= r2) goto La2
            long r29 = r10 & r17
            int r4 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r4 >= 0) goto L97
            int r4 = r15 << 3
            int r4 = r4 + r3
            r29 = r8[r4]
            lb2 r29 = (p000.lb2) r29
            java.lang.Object r29 = r29.get()
            yp0 r29 = (p000.yp0) r29
            r30 = r3
            if (r29 == 0) goto L91
            boolean r3 = r29.m6977()
            r29 = r6
            r6 = 1
            if (r3 != r6) goto L93
            goto L9b
        L91:
            r29 = r6
        L93:
            r7.m1118(r4)
            goto L9b
        L97:
            r30 = r3
            r29 = r6
        L9b:
            long r10 = r10 >> r16
            int r3 = r30 + 1
            r6 = r29
            goto L6e
        La2:
            r29 = r6
            r3 = r16
            if (r2 != r3) goto Lc3
        La8:
            r11 = r25
            goto Lae
        Lab:
            r29 = r6
            goto La8
        Lae:
            if (r15 == r11) goto Lc3
            int r15 = r15 + 1
            r2 = r26
            r3 = r27
            r6 = r29
            r16 = 8
            goto L54
        Lbb:
            r26 = r2
            r27 = r3
            r29 = r6
            r23 = r15
        Lc3:
            r3 = 8
            goto Ld3
        Lc6:
            r26 = r2
            r27 = r3
            r29 = r6
            r20 = r7
            r21 = r8
            r23 = r15
            r3 = r10
        Ld3:
            long r6 = r27 >> r3
            int r2 = r29 + 1
            r10 = r3
            r3 = r6
            r7 = r20
            r8 = r21
            r15 = r23
            r6 = r2
            r2 = r26
            goto L30
        Le4:
            r26 = r2
            r20 = r7
            r21 = r8
            r3 = r10
            r23 = r15
            if (r5 != r3) goto L110
            goto Lf8
        Lf0:
            r26 = r2
            r20 = r7
            r21 = r8
            r23 = r15
        Lf8:
            if (r14 == r13) goto L110
            int r14 = r14 + 1
            r7 = r20
            r8 = r21
            r15 = r23
            r2 = r26
            r10 = 8
            goto L1c
        L108:
            r20 = r7
            r21 = r8
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.3E-322)
        L110:
            b21 r2 = r0.f3312
            if (r2 == 0) goto L164
            long[] r3 = r2.f1427
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L164
            r5 = 0
        L11c:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L15d
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r16 = 8
            int r10 = 8 - r8
            r8 = 0
        L132:
            if (r8 >= r10) goto L158
            long r11 = r6 & r17
            int r9 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r9 >= 0) goto L152
            int r9 = r5 << 3
            int r9 = r9 + r8
            java.lang.Object[] r11 = r2.f1428
            r11 = r11[r9]
            java.lang.Object[] r12 = r2.f1429
            r12 = r12[r9]
            c21 r12 = (p000.c21) r12
            te0 r11 = (p000.te0) r11
            boolean r11 = r12.m1113()
            if (r11 == 0) goto L152
            r2.m700(r9)
        L152:
            r9 = 8
            long r6 = r6 >> r9
            int r8 = r8 + 1
            goto L132
        L158:
            r9 = 8
            if (r10 != r9) goto L164
            goto L15f
        L15d:
            r9 = 8
        L15f:
            if (r5 == r4) goto L164
            int r5 = r5 + 1
            goto L11c
        L164:
            b21 r2 = r0.f3312
            if (r2 != 0) goto L16f
            b21 r2 = new b21
            r2.<init>()
            r0.f3312 = r2
        L16f:
            java.lang.Object r0 = r2.m695(r1)
            if (r0 != 0) goto L17d
            c21 r0 = new c21
            r0.<init>()
            r2.m701(r1, r0)
        L17d:
            c21 r0 = (p000.c21) r0
            lb2 r1 = new lb2
            r2 = r32
            r1.<init>(r2)
            r0.m1116(r1)
            return
    }

    /* JADX INFO: renamed from: ч */
    public abstract int mo1812(p000.re0 r1);

    /* JADX INFO: renamed from: ш */
    public final void m1813(p000.eh1 r24, long r25, long r27) {
            r23 = this;
            r1 = r23
            b21 r7 = r1.f3312
            o4 r0 = r1.f3311
            if (r0 != 0) goto Lf
            o4 r0 = new o4
            r0.<init>()
            r1.f3311 = r0
        Lf:
            r8 = r0
            yp0 r0 = r1.mo1804()
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f12756
            if (r0 == 0) goto L30
            y81 r9 = r0.getSnapshotObserver()
            if (r9 == 0) goto L30
            a1 r10 = p000.C0002a1.f31
            bw0 r0 = new bw0
            r6 = r24
            r2 = r25
            r4 = r27
            r0.<init>(r1, r2, r4, r6)
            kx1 r1 = r9.f12491
            r1.m3425(r6, r10, r0)
        L30:
            boolean r0 = r23.mo1610()
            java.lang.Object r1 = r8.f7943
            c21 r1 = (p000.c21) r1
            java.lang.Object r2 = r8.f7944
            c21 r2 = (p000.c21) r2
            int r3 = r8.f7939
            r5 = 0
        L3f:
            if (r5 >= r3) goto L72
            java.lang.Object r6 = r8.f7942
            byte[] r6 = (byte[]) r6
            r6 = r6[r5]
            r9 = 3
            if (r6 != r9) goto L57
            java.lang.Object r6 = r8.f7940
            te0[] r6 = (p000.te0[]) r6
            r6 = r6[r5]
            r6.getClass()
            r2.m1116(r6)
            goto L6f
        L57:
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L6f
            java.lang.Object r6 = r8.f7940
            te0[] r6 = (p000.te0[]) r6
            r6 = r6[r5]
            r6.getClass()
            java.lang.Object r6 = r7.m699(r6)
            c21 r6 = (p000.c21) r6
            if (r6 == 0) goto L6f
            r1.m1115(r6)
        L6f:
            int r5 = r5 + 1
            goto L3f
        L72:
            int r3 = r8.f7939
            r5 = 0
            r6 = 0
        L76:
            r7 = 2
            if (r5 >= r3) goto L95
            java.lang.Object r9 = r8.f7942
            byte[] r9 = (byte[]) r9
            r10 = r9[r5]
            if (r10 != r7) goto L84
            int r6 = r6 + 1
            goto L90
        L84:
            if (r6 <= 0) goto L90
            int r10 = r5 - r6
            java.lang.Object r11 = r8.f7940
            te0[] r11 = (p000.te0[]) r11
            r12 = r11[r5]
            r11[r10] = r12
        L90:
            r9[r5] = r7
            int r5 = r5 + 1
            goto L76
        L95:
            int r3 = r8.f7939
            int r5 = r3 - r6
        L99:
            r9 = 0
            if (r5 >= r3) goto La5
            java.lang.Object r10 = r8.f7940
            te0[] r10 = (p000.te0[]) r10
            r10[r5] = r9
            int r5 = r5 + 1
            goto L99
        La5:
            int r3 = r8.f7939
            int r3 = r3 - r6
            r8.f7939 = r3
            dw0 r3 = r23.mo1806()
            java.lang.Object[] r5 = r2.f1942
            long[] r6 = r2.f1941
            int r8 = r6.length
            int r8 = r8 - r7
            r14 = 7
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r24 = r7
            r7 = 8
            if (r8 < 0) goto L159
            r26 = 128(0x80, double:6.3E-322)
            r9 = 0
        Lc3:
            r10 = r6[r9]
            r17 = 255(0xff, double:1.26E-321)
            long r12 = ~r10
            long r12 = r12 << r14
            long r12 = r12 & r10
            long r12 = r12 & r15
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L145
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        Ld7:
            if (r13 >= r12) goto L13b
            long r19 = r10 & r17
            int r19 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r19 >= 0) goto L126
            int r19 = r9 << 3
            int r19 = r19 + r13
            r19 = r5[r19]
            r28 = r14
            r14 = r19
            te0 r14 = (p000.te0) r14
            r19 = r15
            if (r3 != 0) goto Lf2
            r15 = r23
            goto Lf3
        Lf2:
            r15 = r3
        Lf3:
            r21 = r7
            r4 = r15
        Lf6:
            o4 r7 = r4.f3311
            if (r7 == 0) goto L108
            java.lang.Object r7 = r7.f7940
            te0[] r7 = (p000.te0[]) r7
            boolean r7 = p000.AbstractC0312g7.m2234(r7, r14)
            r22 = r0
            r0 = 1
            if (r7 != r0) goto L10a
            goto L110
        L108:
            r22 = r0
        L10a:
            dw0 r0 = r4.mo1806()
            if (r0 != 0) goto L122
        L110:
            b21 r0 = r4.f3312
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r0.m699(r14)
            c21 r0 = (p000.c21) r0
            goto L11c
        L11b:
            r0 = 0
        L11c:
            if (r0 == 0) goto L12e
            r15.m1809(r0)
            goto L12e
        L122:
            r4 = r0
            r0 = r22
            goto Lf6
        L126:
            r22 = r0
            r21 = r7
            r28 = r14
            r19 = r15
        L12e:
            long r10 = r10 >> r21
            int r13 = r13 + 1
            r14 = r28
            r15 = r19
            r7 = r21
            r0 = r22
            goto Ld7
        L13b:
            r22 = r0
            r0 = r7
            r28 = r14
            r19 = r15
            if (r12 != r0) goto L163
            goto L14b
        L145:
            r22 = r0
            r28 = r14
            r19 = r15
        L14b:
            if (r9 == r8) goto L163
            int r9 = r9 + 1
            r14 = r28
            r15 = r19
            r0 = r22
            r7 = 8
            goto Lc3
        L159:
            r22 = r0
            r28 = r14
            r19 = r15
            r26 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L163:
            r2.m1108()
            java.lang.Object[] r0 = r1.f1942
            long[] r2 = r1.f1941
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L1bf
            r4 = 0
        L170:
            r5 = r2[r4]
            long r7 = ~r5
            long r7 = r7 << r28
            long r7 = r7 & r5
            long r7 = r7 & r19
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L1b7
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r21 = 8
            int r7 = 8 - r7
            r8 = 0
        L186:
            if (r8 >= r7) goto L1b1
            long r9 = r5 & r17
            int r9 = (r9 > r26 ? 1 : (r9 == r26 ? 0 : -1))
            if (r9 >= 0) goto L1ab
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            lb2 r9 = (p000.lb2) r9
            java.lang.Object r9 = r9.get()
            yp0 r9 = (p000.yp0) r9
            if (r9 == 0) goto L1ab
            if (r22 == 0) goto L1a4
            r10 = 0
            r9.m6986(r10)
            goto L1a8
        L1a4:
            r10 = 0
            r9.m6987(r10)
        L1a8:
            r9 = 8
            goto L1ad
        L1ab:
            r10 = 0
            goto L1a8
        L1ad:
            long r5 = r5 >> r9
            int r8 = r8 + 1
            goto L186
        L1b1:
            r9 = 8
            r10 = 0
            if (r7 != r9) goto L1bf
            goto L1ba
        L1b7:
            r9 = 8
            r10 = 0
        L1ba:
            if (r4 == r3) goto L1bf
            int r4 = r4 + 1
            goto L170
        L1bf:
            r1.m1108()
            return
    }

    /* JADX INFO: renamed from: щ */
    public final void m1814(p000.qx0 r15) {
            r14 = this;
            b21 r0 = r14.f3312
            boolean r1 = r14.f3309
            if (r1 == 0) goto L8
            goto Lbd
        L8:
            a80 r1 = r15.mo1625()
            r2 = 0
            if (r1 != 0) goto L59
            if (r0 == 0) goto Lbd
            java.lang.Object[] r15 = r0.f1429
            long[] r1 = r0.f1427
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L55
            r4 = r2
        L1b:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L50
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L35:
            if (r9 >= r7) goto L4e
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4a
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            c21 r10 = (p000.c21) r10
            r14.m1809(r10)
        L4a:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L4e:
            if (r7 != r8) goto L55
        L50:
            if (r4 == r3) goto L55
            int r4 = r4 + 1
            goto L1b
        L55:
            r0.m689()
            return
        L59:
            a80 r0 = r14.f3306
            r3 = 1
            if (r0 == r1) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r2
        L61:
            r4 = 0
            if (r0 != 0) goto L9a
            aw0 r1 = r14.m1808()
            boolean r1 = r1.f1347
            if (r1 == 0) goto L9a
            mp0 r0 = r14.mo1817()
            long r4 = r0.mo2334(r4)
            long r4 = p000.h62.m2448(r4)
            long r0 = r0.mo2338()
            aw0 r6 = r14.m1808()
            long r6 = r6.f1348
            boolean r6 = p000.um0.m5938(r4, r6)
            if (r6 == 0) goto L95
            aw0 r6 = r14.m1808()
            long r6 = r6.f1349
            boolean r6 = p000.bn0.m985(r0, r6)
            if (r6 != 0) goto L96
        L95:
            r2 = r3
        L96:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La1
        L9a:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La1:
            if (r0 == 0) goto Lbd
            eh1 r0 = r14.f3307
            if (r0 == 0) goto Lac
            r0.f3561 = r15
        La9:
            r1 = r14
            r2 = r0
            goto Lb4
        Lac:
            eh1 r0 = new eh1
            r0.<init>(r15, r14)
            r14.f3307 = r0
            goto La9
        Lb4:
            r1.m1813(r2, r3, r5)
            a80 r14 = r15.mo1625()
            r1.f3306 = r14
        Lbd:
            return
    }

    /* JADX INFO: renamed from: э */
    public final int m1815(p000.re0 r5) {
            r4 = this;
            boolean r0 = r4.mo1803()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L9
            goto Lf
        L9:
            int r5 = r4.mo1812(r5)
            if (r5 != r1) goto L10
        Lf:
            return r1
        L10:
            long r0 = r4.f2119
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = (int) r0
            int r5 = r5 + r4
            return r5
    }

    /* JADX INFO: renamed from: ю */
    public abstract p000.dw0 mo1816();

    /* JADX INFO: renamed from: я */
    public abstract p000.mp0 mo1817();
}
