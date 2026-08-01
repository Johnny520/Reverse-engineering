package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ol1 {

    /* JADX INFO: renamed from: α */
    public final androidx.compose.p001ui.platform.AndroidComposeView f8137;

    /* JADX INFO: renamed from: β */
    public final p000.C0571n2 f8138;

    /* JADX INFO: renamed from: γ */
    public final p000.j42 f8139;

    /* JADX INFO: renamed from: δ */
    public final p000.v11 f8140;

    /* JADX INFO: renamed from: ε */
    public boolean f8141;

    /* JADX INFO: renamed from: ζ */
    public boolean f8142;

    /* JADX INFO: renamed from: η */
    public boolean f8143;

    /* JADX INFO: renamed from: θ */
    public p000.RunnableC0744r0 f8144;

    /* JADX INFO: renamed from: ι */
    public long f8145;

    /* JADX INFO: renamed from: κ */
    public final p000.C0453k1 f8146;

    /* JADX INFO: renamed from: λ */
    public final p000.a21 f8147;

    public ol1(androidx.compose.p001ui.platform.AndroidComposeView r3) {
            r2 = this;
            r2.<init>()
            r2.f8137 = r3
            n2 r3 = new n2
            r0 = 2
            r3.<init>(r0)
            r0 = 192(0xc0, float:2.69E-43)
            long[] r1 = new long[r0]
            r3.f7359 = r1
            long[] r0 = new long[r0]
            r3.f7360 = r0
            r2.f8138 = r3
            j42 r3 = new j42
            r3.<init>()
            r2.f8139 = r3
            v11 r3 = new v11
            r3.<init>()
            r2.f8140 = r3
            r0 = -1
            r2.f8145 = r0
            k1 r3 = new k1
            r0 = 7
            r3.<init>(r0, r2)
            r2.f8146 = r3
            a21 r3 = new a21
            r3.<init>()
            r2.f8147 = r3
            return
    }

    /* JADX INFO: renamed from: δ */
    public static long m4247(p000.yp0 r5) {
            k31 r5 = r5.f12733
            q31 r0 = r5.f5727
            gm0 r5 = r5.f5726
            r1 = 0
        L8:
            if (r5 == 0) goto L29
            if (r5 == r0) goto L29
            w81 r3 = r5.f8838
            if (r3 == 0) goto L20
            float[] r3 = r3.mo7375getUnderlyingMatrixsQKQjiQ()
            boolean r3 = p000.AbstractC1021yh.m6869(r3)
            if (r3 != 0) goto L20
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r0
        L20:
            long r3 = r5.f8826
            long r1 = p000.um0.m5940(r1, r3)
            q31 r5 = r5.f8841
            goto L8
        L29:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static void m4248(p000.yp0 r5) {
            boolean r0 = r5.f12745
            if (r0 == 0) goto L47
            k31 r0 = r5.f12733
            q31 r0 = r0.f5727
            w81 r0 = r0.f8838
            if (r0 == 0) goto L17
            float[] r0 = r0.mo7375getUnderlyingMatrixsQKQjiQ()
            boolean r0 = p000.AbstractC1021yh.m6869(r0)
            if (r0 != 0) goto L17
            return
        L17:
            r0 = 0
            r5.f12745 = r0
            boolean r1 = r5.f12747
            if (r1 == 0) goto L26
            long r1 = m4247(r5)
            r5.f12746 = r1
            r5.f12747 = r0
        L26:
            long r1 = r5.f12746
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r1 = p000.um0.m5938(r1, r3)
            if (r1 != 0) goto L47
            k21 r5 = r5.m7009()
            java.lang.Object[] r1 = r5.f5716
            int r5 = r5.f5718
        L3b:
            if (r0 >= r5) goto L47
            r2 = r1[r0]
            yp0 r2 = (p000.yp0) r2
            m4248(r2)
            int r0 = r0 + 1
            goto L3b
        L47:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m4249() {
            r25 = this;
            r0 = r25
            r0 r1 = r0.f8144
            if (r1 == 0) goto Le
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f8137
            r2.removeCallbacks(r1)
            r1 = 0
            r0.f8144 = r1
        Le:
            long r1 = java.lang.System.currentTimeMillis()
            boolean r3 = r0.f8141
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L1f
            boolean r6 = r0.f8142
            if (r6 == 0) goto L1d
            goto L1f
        L1d:
            r6 = r5
            goto L20
        L1f:
            r6 = r4
        L20:
            n2 r7 = r0.f8138
            j42 r8 = r0.f8139
            if (r3 == 0) goto L8d
            r0.f8141 = r5
            v11 r3 = r0.f8140
            java.lang.Object[] r9 = r3.f11064
            int r3 = r3.f11065
            r10 = r5
        L2f:
            if (r10 >= r3) goto L3b
            r11 = r9[r10]
            p70 r11 = (p000.p70) r11
            r11.invoke()
            int r10 = r10 + 1
            goto L2f
        L3b:
            java.lang.Object r3 = r7.f7359
            long[] r3 = (long[]) r3
            int r9 = r7.f7358
            r10 = r5
        L42:
            int r11 = r3.length
            int r11 = r11 + (-2)
            if (r10 >= r11) goto L70
            if (r10 >= r9) goto L70
            int r11 = r10 + 2
            r11 = r3[r11]
            r13 = 60
            long r13 = r11 >> r13
            int r13 = (int) r13
            r13 = r13 & r4
            if (r13 == 0) goto L6d
            r13 = r3[r10]
            int r13 = r10 + 1
            r13 = r3[r13]
            int r11 = (int) r11
            r12 = 33554431(0x1ffffff, float:9.403954E-38)
            r11 = r11 & r12
            n11 r12 = r8.f5315
            java.lang.Object r11 = r12.m5525(r11)
            if (r11 != 0) goto L69
            goto L6d
        L69:
            p000.C1080.m7264()
            return
        L6d:
            int r10 = r10 + 3
            goto L42
        L70:
            java.lang.Object r3 = r7.f7359
            long[] r3 = (long[]) r3
            int r4 = r7.f7358
            r9 = r5
        L77:
            int r10 = r3.length
            int r10 = r10 + (-2)
            if (r9 >= r10) goto L8d
            if (r9 >= r4) goto L8d
            int r10 = r9 + 2
            r11 = r3[r10]
            r13 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r11 = r11 & r13
            r3[r10] = r11
            int r9 = r9 + 3
            goto L77
        L8d:
            boolean r3 = r0.f8142
            r13 = 8
            if (r3 == 0) goto Le0
            r0.f8142 = r5
            n11 r3 = r8.f5315
            r16 = 7
            java.lang.Object[] r4 = r3.f9964
            long[] r3 = r3.f9962
            r17 = 128(0x80, double:6.3E-322)
            int r9 = r3.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Le4
            r10 = r5
            r19 = 255(0xff, double:1.26E-321)
        La7:
            r11 = r3[r10]
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = ~r11
            long r14 = r14 << r16
            long r14 = r14 & r11
            long r14 = r14 & r21
            int r14 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r14 == 0) goto Ldb
            int r14 = r10 - r9
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = r5
        Lc0:
            if (r15 >= r14) goto Ld9
            long r23 = r11 & r19
            int r23 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r23 >= 0) goto Ld5
            int r23 = r10 << 3
            int r23 = r23 + r15
            r23 = r4[r23]
            if (r23 != 0) goto Ld1
            goto Ld5
        Ld1:
            p000.C1080.m7264()
            return
        Ld5:
            long r11 = r11 >> r13
            int r15 = r15 + 1
            goto Lc0
        Ld9:
            if (r14 != r13) goto Leb
        Ldb:
            if (r10 == r9) goto Leb
            int r10 = r10 + 1
            goto La7
        Le0:
            r16 = 7
            r17 = 128(0x80, double:6.3E-322)
        Le4:
            r19 = 255(0xff, double:1.26E-321)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        Leb:
            if (r6 == 0) goto Lf0
            r8.getClass()
        Lf0:
            boolean r3 = r0.f8143
            if (r3 == 0) goto L135
            r0.f8143 = r5
            java.lang.Object r3 = r7.f7359
            long[] r3 = (long[]) r3
            int r4 = r7.f7358
            java.lang.Object r6 = r7.f7360
            long[] r6 = (long[]) r6
            r9 = r5
            r10 = r9
        L102:
            int r11 = r3.length
            int r11 = r11 + (-2)
            if (r9 >= r11) goto L12f
            int r11 = r6.length
            int r11 = r11 + (-2)
            if (r10 >= r11) goto L12f
            if (r9 >= r4) goto L12f
            int r11 = r9 + 2
            r14 = r3[r11]
            long r23 = p000.nl1.f7669
            int r12 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r12 == 0) goto L12c
            r14 = r3[r9]
            r6[r10] = r14
            int r12 = r10 + 1
            int r14 = r9 + 1
            r14 = r3[r14]
            r6[r12] = r14
            int r12 = r10 + 2
            r14 = r3[r11]
            r6[r12] = r14
            int r10 = r10 + 3
        L12c:
            int r9 = r9 + 3
            goto L102
        L12f:
            r7.f7358 = r10
            r7.f7359 = r6
            r7.f7360 = r3
        L135:
            long r3 = r8.f5316
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L13c
            goto L17f
        L13c:
            n11 r1 = r8.f5315
            java.lang.Object[] r2 = r1.f9964
            long[] r1 = r1.f9962
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L17b
            r4 = r5
        L148:
            r6 = r1[r4]
            long r9 = ~r6
            long r9 = r9 << r16
            long r9 = r9 & r6
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L176
            int r9 = r4 - r3
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r5
        L15c:
            if (r10 >= r9) goto L174
            long r11 = r6 & r19
            int r11 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r11 >= 0) goto L170
            int r11 = r4 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            if (r11 != 0) goto L16c
            goto L170
        L16c:
            p000.C1080.m7264()
            return
        L170:
            long r6 = r6 >> r13
            int r10 = r10 + 1
            goto L15c
        L174:
            if (r9 != r13) goto L17b
        L176:
            if (r4 == r3) goto L17b
            int r4 = r4 + 1
            goto L148
        L17b:
            r1 = -1
            r8.f5316 = r1
        L17f:
            long r1 = r8.f5316
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L18a
            r0.m4254()
        L18a:
            return
    }

    /* JADX INFO: renamed from: β */
    public final long m4250(p000.yp0 r9) {
            r8 = this;
            int r9 = r9.f12744
            r0 = 33554431(0x1ffffff, float:9.403954E-38)
            r9 = r9 & r0
            n2 r8 = r8.f8138
            java.lang.Object r1 = r8.f7359
            long[] r1 = (long[]) r1
            int r8 = r8.f7358
            r2 = 0
        Lf:
            int r3 = r1.length
            int r3 = r3 + (-2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 >= r3) goto L29
            if (r2 >= r8) goto L29
            int r3 = r2 + 2
            r6 = r1[r3]
            int r3 = (int) r6
            r3 = r3 & r0
            if (r3 != r9) goto L26
            r8 = r1[r2]
            goto L2a
        L26:
            int r2 = r2 + 3
            goto Lf
        L29:
            r8 = r4
        L2a:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L34
            r8 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            return r8
        L34:
            r0 = 32
            long r1 = r8 >> r0
            int r1 = (int) r1
            int r8 = (int) r8
            long r1 = (long) r1
            long r0 = r1 << r0
            long r8 = (long) r8
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r2
            long r8 = r8 | r0
            return r8
    }

    /* JADX INFO: renamed from: γ */
    public final void m4251(p000.yp0 r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 1
            r1.f12745 = r2
            k31 r3 = r1.f12733
            q31 r4 = r3.f5727
            bq0 r5 = r1.f12734
            ox0 r5 = r5.f1815
            int r6 = r5.mo1185()
            int r5 = r5.mo1184()
            float r6 = (float) r6
            float r5 = (float) r5
            a21 r7 = r0.f8147
            r8 = 0
            r7.f49 = r8
            r7.f50 = r8
            r7.f51 = r6
            r7.f52 = r5
        L24:
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            if (r4 == 0) goto L90
            yp0 r9 = r4.f8839
            k31 r10 = r9.f12733
            q31 r10 = r10.f5727
            if (r4 != r10) goto L62
            boolean r10 = r9.f12745
            if (r10 != 0) goto L62
            long r9 = r0.m4250(r9)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            boolean r11 = p000.um0.m5938(r9, r11)
            if (r11 != 0) goto L62
            long r11 = r9 >> r8
            int r4 = (int) r11
            float r4 = (float) r4
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r4
            long r9 = r10 << r8
            long r11 = r12 & r5
            long r9 = r9 | r11
            r7.m25(r9)
            goto L90
        L62:
            w81 r9 = r4.f8838
            if (r9 == 0) goto L73
            float[] r9 = r9.mo7375getUnderlyingMatrixsQKQjiQ()
            boolean r10 = p000.AbstractC1021yh.m6869(r9)
            if (r10 != 0) goto L73
            p000.AbstractC0073bd.m851(r9, r7)
        L73:
            long r9 = r4.f8826
            long r11 = r9 >> r8
            int r11 = (int) r11
            float r11 = (float) r11
            long r9 = r9 & r5
            int r9 = (int) r9
            float r9 = (float) r9
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r12 = (long) r9
            long r8 = r10 << r8
            long r5 = r5 & r12
            long r5 = r5 | r8
            r7.m25(r5)
            q31 r4 = r4.f8841
            goto L24
        L90:
            float r4 = r7.f49
            int r11 = (int) r4
            float r4 = r7.f50
            int r12 = (int) r4
            float r4 = r7.f51
            int r13 = (int) r4
            float r4 = r7.f52
            int r14 = (int) r4
            int r10 = r1.f12744
            boolean r4 = r1.f12749
            r1.f12749 = r2
            n2 r9 = r0.f8138
            if (r4 == 0) goto Lf4
            r4 = 33554431(0x1ffffff, float:9.403954E-38)
            r15 = r10 & r4
            r16 = r4
            java.lang.Object r4 = r9.f7359
            long[] r4 = (long[]) r4
            r17 = r5
            int r5 = r9.f7358
            r19 = r8
            r6 = 0
        Lb8:
            int r8 = r4.length
            int r8 = r8 + (-2)
            if (r6 >= r8) goto Lf4
            if (r6 >= r5) goto Lf4
            int r8 = r6 + 2
            r20 = r8
            r7 = r4[r20]
            r21 = r2
            int r2 = (int) r7
            r2 = r2 & r16
            if (r2 != r15) goto Lef
            long r2 = (long) r11
            long r2 = r2 << r19
            long r9 = (long) r12
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            int r6 = r6 + 1
            long r2 = (long) r13
            long r2 = r2 << r19
            long r9 = (long) r14
            long r9 = r9 & r17
            long r2 = r2 | r9
            r4[r6] = r2
            r2 = 63
            long r2 = r7 >> r2
            r5 = 1
            long r2 = r2 & r5
            r5 = 60
            long r2 = r2 << r5
            long r2 = r2 | r7
            r4[r20] = r2
        Led:
            r2 = 0
            goto L11c
        Lef:
            int r6 = r6 + 3
            r2 = r21
            goto Lb8
        Lf4:
            r21 = r2
            yp0 r2 = r1.m7005()
            if (r2 == 0) goto L100
            int r2 = r2.f12744
        Lfe:
            r15 = r2
            goto L102
        L100:
            r2 = -1
            goto Lfe
        L102:
            r2 = 1024(0x400, float:1.435E-42)
            boolean r16 = r3.m3144(r2)
            r2 = 16
            boolean r17 = r3.m3144(r2)
            j42 r2 = r0.f8139
            n11 r2 = r2.f5315
            boolean r18 = r2.m5524(r10)
            r19 = 512(0x200, float:7.17E-43)
            p000.C0571n2.m3943(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto Led
        L11c:
            r1.f12748 = r2
            r3 = r21
            r0.f8141 = r3
            k21 r1 = r1.m7009()
            java.lang.Object[] r3 = r1.f5716
            int r1 = r1.f5718
            r7 = r2
        L12b:
            if (r7 >= r1) goto L13d
            r2 = r3[r7]
            yp0 r2 = (p000.yp0) r2
            boolean r4 = r2.m6978()
            if (r4 == 0) goto L13a
            r0.m4251(r2)
        L13a:
            int r7 = r7 + 1
            goto L12b
        L13d:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m4252(p000.yp0 r32) {
            r31 = this;
            r0 = r31
            r1 = r32
            boolean r2 = r1.m6978()
            k31 r3 = r1.f12733
            if (r2 == 0) goto L238
            boolean r2 = r1.f12748
            if (r2 != 0) goto L12
            goto L238
        L12:
            yp0 r2 = r1.m7005()
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r6 = 0
            if (r2 == 0) goto L31
            boolean r7 = r2.f12745
            if (r7 != 0) goto L31
            boolean r7 = r2.f12747
            if (r7 == 0) goto L2e
            r2.f12747 = r6
            long r7 = m4247(r2)
            r2.f12746 = r7
        L2e:
            long r7 = r2.f12746
            goto L37
        L31:
            if (r2 != 0) goto L36
            r7 = 0
            goto L37
        L36:
            r7 = r4
        L37:
            q31 r9 = r3.f5727
            boolean r4 = p000.um0.m5938(r7, r4)
            if (r4 != 0) goto L22b
            w81 r4 = r9.f8838
            if (r4 == 0) goto L4f
            float[] r4 = r4.mo7375getUnderlyingMatrixsQKQjiQ()
            boolean r4 = p000.AbstractC1021yh.m6869(r4)
            if (r4 != 0) goto L4f
            goto L22b
        L4f:
            boolean r4 = r1.f12745
            if (r4 != 0) goto L223
            long r9 = r9.f8826
            long r7 = p000.um0.m5940(r7, r9)
            bq0 r4 = r1.f12734
            ox0 r4 = r4.f1815
            int r9 = r4.mo1185()
            int r4 = r4.mo1184()
            int r11 = r1.f12744
            boolean r10 = r1.f12749
            n2 r12 = r0.f8138
            r13 = 33554431(0x1ffffff, float:9.403954E-38)
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r16 = 32
            if (r10 == 0) goto L1b0
            r17 = 1
            r19 = 63
            if (r2 == 0) goto L12c
            int r2 = r2.f12744
            r20 = r4
            r21 = 25
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r7 = r7 & r14
            int r4 = (int) r7
            r7 = r11 & r13
            java.lang.Object r8 = r12.f7359
            long[] r8 = (long[]) r8
            int r11 = r12.f7358
            r10 = r6
            r23 = r13
            r22 = 60
        L95:
            int r13 = r8.length
            int r13 = r13 + (-2)
            if (r10 >= r13) goto L129
            if (r10 >= r11) goto L129
            int r13 = r10 + 2
            r24 = r14
            r14 = r8[r13]
            int r13 = (int) r14
            r13 = r13 & r23
            if (r13 != r2) goto L114
            r13 = r8[r10]
            long r5 = r13 >> r16
            int r5 = (int) r5
            int r6 = (int) r13
            int r5 = r5 + r3
            int r6 = r6 + r4
            int r13 = r5 + r9
            int r14 = r6 + r20
            int r10 = r10 + 3
        Lb5:
            int r15 = r8.length
            int r15 = r15 + (-2)
            if (r10 >= r15) goto L114
            if (r10 >= r11) goto L114
            int r15 = r10 + 2
            r26 = r2
            r27 = r3
            r2 = r8[r15]
            r28 = r4
            int r4 = (int) r2
            r4 = r4 & r23
            if (r4 != r7) goto L10a
            r29 = r2
            r2 = r8[r10]
            r4 = r8
            long r7 = r2 >> r16
            int r7 = (int) r7
            int r2 = (int) r2
            int r3 = r5 - r7
            int r2 = r6 - r2
            long r7 = (long) r5
            long r7 = r7 << r16
            long r5 = (long) r6
            long r5 = r5 & r24
            long r5 = r5 | r7
            r4[r10] = r5
            int r5 = r10 + 1
            long r6 = (long) r13
            long r6 = r6 << r16
            long r8 = (long) r14
            long r8 = r8 & r24
            long r6 = r6 | r8
            r4[r5] = r6
            long r5 = r29 >> r19
            long r5 = r5 & r17
            long r5 = r5 << r22
            long r5 = r29 | r5
            r4[r15] = r5
            if (r3 != 0) goto Lfa
            if (r2 == 0) goto L129
        Lfa:
            int r10 = r10 + 3
            long r4 = p000.nl1.f7668
            long r4 = r29 & r4
            r6 = r10 & r23
            long r6 = (long) r6
            long r6 = r6 << r21
            long r4 = r4 | r6
            r12.m3947(r3, r2, r4)
            goto L129
        L10a:
            r4 = r8
            int r10 = r10 + 3
            r2 = r26
            r3 = r27
            r4 = r28
            goto Lb5
        L114:
            r26 = r2
            r27 = r3
            r28 = r4
            r4 = r8
            int r10 = r10 + 3
            r8 = r4
            r14 = r24
            r2 = r26
            r3 = r27
            r4 = r28
            r6 = 0
            goto L95
        L129:
            r2 = 0
            goto L230
        L12c:
            r20 = r4
            r23 = r13
            r24 = r14
            r21 = 25
            r22 = 60
            long r2 = r7 >> r16
            int r2 = (int) r2
            long r3 = r7 & r24
            int r3 = (int) r3
            int r9 = r9 + r2
            int r4 = r3 + r20
            r5 = r11 & r23
            java.lang.Object r6 = r12.f7359
            long[] r6 = (long[]) r6
            int r7 = r12.f7358
            r8 = 0
        L148:
            int r10 = r6.length
            int r10 = r10 + (-2)
            if (r8 >= r10) goto L129
            if (r8 >= r7) goto L129
            int r10 = r8 + 2
            r13 = r6[r10]
            int r11 = (int) r13
            r11 = r11 & r23
            if (r11 != r5) goto L1a7
            r11 = r6
            r5 = r11[r8]
            r15 = r8
            long r7 = (long) r2
            long r7 = r7 << r16
            r26 = r7
            long r7 = (long) r3
            long r7 = r7 & r24
            long r7 = r26 | r7
            r11[r15] = r7
            int r8 = r15 + 1
            r26 = r2
            r27 = r3
            long r2 = (long) r9
            long r2 = r2 << r16
            r28 = r2
            long r2 = (long) r4
            long r2 = r2 & r24
            long r2 = r28 | r2
            r11[r8] = r2
            long r2 = r13 >> r19
            long r2 = r2 & r17
            long r2 = r2 << r22
            long r2 = r2 | r13
            r11[r10] = r2
            long r2 = r5 >> r16
            int r2 = (int) r2
            int r2 = r26 - r2
            int r3 = (int) r5
            int r3 = r27 - r3
            if (r2 == 0) goto L18f
            r4 = 1
            goto L190
        L18f:
            r4 = 0
        L190:
            if (r3 == 0) goto L194
            r5 = 1
            goto L195
        L194:
            r5 = 0
        L195:
            r4 = r4 | r5
            if (r4 == 0) goto L129
            int r8 = r15 + 3
            long r4 = p000.nl1.f7668
            long r4 = r4 & r13
            r6 = r8 & r23
            long r6 = (long) r6
            long r6 = r6 << r21
            long r4 = r4 | r6
            r12.m3947(r2, r3, r4)
            goto L129
        L1a7:
            r26 = r2
            r27 = r3
            r11 = r6
            r15 = r8
            int r8 = r15 + 3
            goto L148
        L1b0:
            r20 = r4
            r23 = r13
            r24 = r14
            r4 = 1
            r1.f12749 = r4
            r4 = 1024(0x400, float:1.435E-42)
            boolean r17 = r3.m3144(r4)
            r4 = 16
            boolean r18 = r3.m3144(r4)
            j42 r3 = r0.f8139
            n11 r3 = r3.f5315
            boolean r19 = r3.m5524(r11)
            if (r2 == 0) goto L20f
            int r2 = r2.f12744
            long r3 = r7 >> r16
            int r3 = (int) r3
            long r4 = r7 & r24
            int r4 = (int) r4
            r13 = r11 & r23
            java.lang.Object r5 = r12.f7359
            long[] r5 = (long[]) r5
            int r6 = r12.f7358
            int r6 = r6 + (-3)
            r22 = r6
        L1e3:
            if (r22 < 0) goto L129
            int r6 = r22 + 2
            r6 = r5[r6]
            int r6 = (int) r6
            r6 = r6 & r23
            if (r6 != r2) goto L20b
            r5 = r5[r22]
            long r7 = r5 >> r16
            int r7 = (int) r7
            int r5 = (int) r5
            int r14 = r7 + r3
            int r15 = r5 + r4
            int r16 = r14 + r9
            int r4 = r15 + r20
            r20 = r18
            r21 = r19
            r18 = r2
            r19 = r17
            r17 = r4
            r12.m3945(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L129
        L20b:
            r10 = r12
            int r22 = r22 + (-3)
            goto L1e3
        L20f:
            r10 = r12
            long r2 = r7 >> r16
            int r12 = (int) r2
            long r2 = r7 & r24
            int r13 = (int) r2
            int r14 = r12 + r9
            int r15 = r13 + r20
            r16 = 0
            r20 = 544(0x220, float:7.62E-43)
            p000.C0571n2.m3943(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L129
        L223:
            r31.m4251(r32)
            m4248(r1)
            goto L129
        L22b:
            r31.m4251(r32)
            goto L129
        L230:
            r1.f12748 = r2
            r4 = 1
            r0.f8141 = r4
            r0.m4254()
        L238:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m4253(p000.yp0 r11) {
            r10 = this;
            boolean r0 = r11.f12749
            if (r0 == 0) goto L3b
            int r0 = r11.f12744
            r1 = 33554431(0x1ffffff, float:9.403954E-38)
            r0 = r0 & r1
            n2 r2 = r10.f8138
            java.lang.Object r3 = r2.f7359
            long[] r3 = (long[]) r3
            int r2 = r2.f7358
            r4 = 0
            r5 = r4
        L14:
            int r6 = r3.length
            int r6 = r6 + (-2)
            r7 = 1
            if (r5 >= r6) goto L33
            if (r5 >= r2) goto L33
            int r6 = r5 + 2
            r8 = r3[r6]
            int r8 = (int) r8
            r8 = r8 & r1
            if (r8 != r0) goto L30
            r0 = -1
            r3[r5] = r0
            int r5 = r5 + r7
            r3[r5] = r0
            long r0 = p000.nl1.f7669
            r3[r6] = r0
            goto L33
        L30:
            int r5 = r5 + 3
            goto L14
        L33:
            r11.f12749 = r4
            r11.f12748 = r7
            r10.f8141 = r7
            r10.f8143 = r7
        L3b:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m4254() {
            r8 = this;
            r0 r0 = r8.f8144
            if (r0 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            j42 r2 = r8.f8139
            long r2 = r2.f5316
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L14
            if (r1 == 0) goto L14
            goto L1c
        L14:
            long r4 = r8.f8145
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L1d
            if (r1 == 0) goto L1d
        L1c:
            return
        L1d:
            androidx.compose.ui.platform.AndroidComposeView r1 = r8.f8137
            if (r0 == 0) goto L24
            r1.removeCallbacks(r0)
        L24:
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 16
            long r6 = (long) r0
            long r6 = r6 + r4
            long r2 = java.lang.Math.max(r2, r6)
            r8.f8145 = r2
            long r2 = r2 - r4
            r0 r0 = new r0
            r4 = 0
            k1 r5 = r8.f8146
            r0.<init>(r4, r5)
            r1.postDelayed(r0, r2)
            r8.f8144 = r0
            return
    }
}
