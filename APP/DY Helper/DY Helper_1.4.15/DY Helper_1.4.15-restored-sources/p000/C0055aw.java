package p000;

/* JADX INFO: renamed from: aw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0055aw extends p000.q01 implements p000.qp0, p000.InterfaceC0092bw, p000.qa0, p000.c41, p000.InterfaceC0047ao {

    /* JADX INFO: renamed from: Α */
    public boolean f1330;

    /* JADX INFO: renamed from: Β */
    public final p000.kv1 f1331;

    /* JADX INFO: renamed from: Γ */
    public final p000.C1035yv f1332;

    /* JADX INFO: renamed from: Δ */
    public final p000.C0924vv f1333;

    /* JADX INFO: renamed from: Ε */
    public final p000.C0924vv f1334;

    /* JADX INFO: renamed from: Ζ */
    public p000.wa0 f1335;

    /* JADX INFO: renamed from: Η */
    public final p000.x91 f1336;

    /* JADX INFO: renamed from: Θ */
    public final p000.t91 f1337;

    /* JADX INFO: renamed from: Ι */
    public final p000.C1085 f1338;

    /* JADX INFO: renamed from: Κ */
    public final p000.x91 f1339;

    /* JADX INFO: renamed from: Λ */
    public final p000.C0709q2 f1340;

    /* JADX INFO: renamed from: τ */
    public p000.ep0 f1341;

    /* JADX INFO: renamed from: υ */
    public p000.a80 f1342;

    /* JADX INFO: renamed from: φ */
    public p000.a80 f1343;

    /* JADX INFO: renamed from: χ */
    public p000.a80 f1344;

    /* JADX INFO: renamed from: ψ */
    public p000.e80 f1345;

    /* JADX INFO: renamed from: ω */
    public p000.a80 f1346;

    public C0055aw(p000.ep0 r1, p000.p70 r2, p000.a80 r3, p000.a80 r4, p000.a80 r5, p000.e80 r6, p000.a80 r7, boolean r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f1341 = r1
            r0.f1342 = r3
            r0.f1343 = r4
            r0.f1344 = r5
            r0.f1345 = r6
            r0.f1346 = r7
            r0.f1330 = r8
            kv1 r1 = new kv1
            r1.<init>(r2)
            r0.f1331 = r1
            yv r1 = new yv
            r1.<init>(r0)
            r0.f1332 = r1
            vv r1 = new vv
            r1.<init>(r0)
            r0.f1333 = r1
            vv r1 = new vv
            r1.<init>(r0)
            r0.f1334 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            x91 r1 = p000.j81.m2882(r1)
            r0.f1336 = r1
            t91 r1 = new t91
            r2 = 0
            r1.<init>(r2)
            r0.f1337 = r1
            θ r1 = new θ
            r2 = 13
            r1.<init>(r2, r0)
            r0.f1338 = r1
            xn0 r1 = p000.xn0.f12230
            x91 r2 = new x91
            r3 = 0
            r2.<init>(r3, r1)
            r0.f1339 = r2
            p000.pd2.m4479()
            q2 r1 = p000.pd2.m4479()
            r0.f1340 = r1
            return
    }

    /* JADX INFO: renamed from: В */
    public static final void m602(p000.C0055aw r4, p000.InterfaceC0190cw r5, p000.C0924vv r6) {
            t91 r0 = r6.f11417
            float r0 = r0.m5621()
            int r6 = r6.f11418
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto Lf
            r0 = r1
            goto L16
        Lf:
            r1 = 1
            if (r6 <= r1) goto L16
            float r1 = (float) r6
            float r0 = r0 / r1
            int r0 = (int) r0
            float r0 = (float) r0
        L16:
            m6 r1 = r5.mo579()
            java.lang.Object r1 = r1.f6967
            n r1 = (p000.C0568n) r1
            r1.m3925(r0, r0)
            e80 r1 = r4.f1345     // Catch: java.lang.Throwable -> L39
            uv r2 = new uv     // Catch: java.lang.Throwable -> L39
            r3 = 0
            r2.<init>(r6, r3, r4)     // Catch: java.lang.Throwable -> L39
            r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L39
            m6 r4 = r5.mo579()
            java.lang.Object r4 = r4.f6967
            n r4 = (p000.C0568n) r4
            float r5 = -r0
            r4.m3925(r5, r5)
            return
        L39:
            r4 = move-exception
            m6 r5 = r5.mo579()
            java.lang.Object r5 = r5.f6967
            n r5 = (p000.C0568n) r5
            float r6 = -r0
            r5.m3925(r6, r6)
            throw r4
    }

    @Override // p000.c41
    /* JADX INFO: renamed from: Ζ */
    public final void mo603() {
            r2 = this;
            η r0 = new η
            r1 = 8
            r0.<init>(r1, r2)
            p000.ln0.m3642(r2, r0)
            return
    }

    @Override // p000.InterfaceC0092bw
    /* JADX INFO: renamed from: Μ */
    public final void mo604(p000.aq0 r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            fe r2 = r1.f1284
            boolean r3 = r0.f1330
            if (r3 != 0) goto Le
            r1.m587()
            return
        Le:
            yv r3 = r0.f1332
            r3.getClass()
            float r4 = r2.mo586()
            float r5 = r2.mo590()
            long r6 = r2.mo585()
            np0 r8 = r1.getLayoutDirection()
            float r9 = r3.f12818
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r11 = 1
            if (r9 != 0) goto L3f
            float r9 = r3.f12819
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 != 0) goto L3f
            long r12 = r3.f12820
            boolean r9 = p000.jw1.m2997(r6, r12)
            if (r9 == 0) goto L3f
            np0 r9 = r3.f12821
            if (r8 == r9) goto L3d
            goto L3f
        L3d:
            r9 = 0
            goto L40
        L3f:
            r9 = r11
        L40:
            if (r9 == 0) goto L4d
            r3.f12818 = r4
            r3.f12819 = r5
            r3.f12820 = r6
            r8.getClass()
            r3.f12821 = r8
        L4d:
            if (r9 == 0) goto L52
            r0.m612()
        L52:
            vv r4 = r0.f1333
            r0.m611(r1, r4)
            x91 r4 = r0.f1336
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r4 == 0) goto Lc7
            wa0 r4 = r0.f1335
            if (r4 != 0) goto L7e
            androidx.compose.ui.platform.AndroidComposeView r4 = p000.h62.m2446(r0)
            ua0 r4 = r4.getGraphicsContext()
            wa0 r4 = r4.mo3470()
            r0.f1335 = r4
        L7e:
            long r8 = r2.mo585()
            long r8 = r8 >> r7
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = (int) r8
            if (r8 >= r11) goto L8c
            r8 = r11
        L8c:
            long r12 = r2.mo585()
            long r12 = r12 & r5
            int r9 = (int) r12
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = (int) r9
            if (r9 >= r11) goto L9a
            r9 = r11
        L9a:
            long r12 = (long) r8
            long r12 = r12 << r7
            long r8 = (long) r9
            long r8 = r8 & r5
            long r8 = r8 | r12
            yp0 r12 = p000.h62.m2445(r0)
            yr r12 = r12.f12726
            xv r13 = new xv
            r14 = 0
            r13.<init>(r12, r14, r0)
            r1.mo580(r4, r8, r13)
            t91 r8 = r0.f1337
            float r8 = r8.m5621()
            bb0 r9 = r4.f11620
            float r12 = r9.f1607
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 != 0) goto Lbd
            goto Lc4
        Lbd:
            r9.f1607 = r8
            android.graphics.RenderNode r9 = r9.f1602
            r9.setAlpha(r8)
        Lc4:
            p000.ln0.m3638(r1, r4)
        Lc7:
            a80 r4 = r0.f1346
            if (r4 == 0) goto Lce
            r4.invoke(r1)
        Lce:
            r1.m587()
            a80 r4 = r0.f1343
            if (r4 == 0) goto L2a1
            java.lang.Object r4 = r4.invoke(r3)
            ie0 r4 = (p000.ie0) r4
            if (r4 == 0) goto L2a1
            aw r8 = r3.f12817
            kv1 r8 = r8.f1331
            p70 r8 = r8.f6123
            java.lang.Object r8 = r8.invoke()
            iv1 r8 = (p000.iv1) r8
            jp1 r3 = r3.f12825
            la r9 = r4.f5062
            float r12 = r4.f5061
            r8.getClass()
            r3.getClass()
            q2 r0 = r0.f1340
            r0.getClass()
            float r4 = r4.f5060
            r13 = 0
            int r14 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r14 <= 0) goto L2a1
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 > 0) goto L107
            goto L2a1
        L107:
            long r14 = r2.mo585()
            r16 = r5
            long r5 = r14 >> r7
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 <= 0) goto L2a1
            r18 = r11
            long r10 = r14 & r16
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 > 0) goto L127
            goto L2a1
        L127:
            float r4 = r1.mo594(r4)
            float r11 = p000.jw1.m2998(r14)
            r13 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r13
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 <= 0) goto L137
            r4 = r11
        L137:
            boolean r11 = r9.f6516
            long r14 = r9.f6511
            boolean r19 = p000.p91.m4430()
            if (r19 != 0) goto L14a
            r22 = r2
            r16 = r5
            r19 = r10
            r1 = 0
            goto L279
        L14a:
            long r19 = r2.mo585()
            if (r11 == 0) goto L157
            java.lang.String r21 = "BloomStrokeDual"
        L152:
            r22 = r7
            r7 = r21
            goto L15a
        L157:
            java.lang.String r21 = "BloomStrokeSingle"
            goto L152
        L15a:
            if (r11 == 0) goto L163
            java.lang.String r21 = p000.ev1.f3676
        L15e:
            r23 = r13
            r13 = r21
            goto L166
        L163:
            java.lang.String r21 = p000.ev1.f3675
            goto L15e
        L166:
            b3 r3 = r3.mo2978(r7, r13)
            long r6 = r19 >> r22
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 * r7
            r22 = r7
            r13 = r8
            long r7 = r19 & r16
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 * r22
            r3.getClass()
            android.graphics.RuntimeShader r8 = r3.f1437
            r16 = r5
            java.lang.String r5 = "halfView"
            p000.AbstractC1124.m7334(r8, r5, r6, r7)
            double r5 = (double) r6
            double r5 = java.lang.Math.floor(r5)
            float r5 = (float) r5
            double r6 = (double) r7
            double r6 = java.lang.Math.floor(r6)
            float r6 = (float) r6
            android.graphics.RuntimeShader r7 = r3.f1437
            java.lang.String r8 = "halfViewFloor"
            p000.AbstractC1124.m7334(r7, r8, r5, r6)
            long r5 = r2.mo585()
            float r7 = p000.jw1.m2998(r5)
            float r7 = r7 / r23
            boolean r8 = r13 instanceof p000.xo1
            if (r8 == 0) goto L1b1
            r8 = r13
            xo1 r8 = (p000.xo1) r8
            goto L1b2
        L1b1:
            r8 = 0
        L1b2:
            if (r8 != 0) goto L1c1
            android.graphics.RuntimeShader r5 = r3.f1437
            p000.AbstractC1124.m7332(r5, r7, r7, r7, r7)
            r22 = r2
            r19 = r10
            r20 = r11
            goto L228
        L1c1:
            ea1 r13 = r8.f12250
            r17 = r7
            ea1 r7 = r8.f12249
            r19 = r10
            ea1 r10 = r8.f12248
            ea1 r8 = r8.f12247
            r20 = r11
            np0 r11 = r1.getLayoutDirection()
            r22 = r2
            np0 r2 = p000.np0.f7701
            if (r11 != r2) goto L1dc
            r2 = r18
            goto L1dd
        L1dc:
            r2 = 0
        L1dd:
            if (r2 == 0) goto L1e4
            float r11 = r8.m1890(r5)
            goto L1e8
        L1e4:
            float r11 = r10.m1890(r5)
        L1e8:
            if (r2 == 0) goto L1ef
            float r8 = r10.m1890(r5)
            goto L1f3
        L1ef:
            float r8 = r8.m1890(r5)
        L1f3:
            if (r2 == 0) goto L1fa
            float r10 = r7.m1890(r5)
            goto L1fe
        L1fa:
            float r10 = r13.m1890(r5)
        L1fe:
            if (r2 == 0) goto L205
            float r2 = r13.m1890(r5)
            goto L209
        L205:
            float r2 = r7.m1890(r5)
        L209:
            int r5 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r5 <= 0) goto L20f
            r11 = r17
        L20f:
            int r5 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r5 <= 0) goto L215
            r8 = r17
        L215:
            int r5 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r5 <= 0) goto L21b
            r2 = r17
        L21b:
            int r5 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r5 <= 0) goto L222
            r7 = r17
            goto L223
        L222:
            r7 = r10
        L223:
            android.graphics.RuntimeShader r5 = r3.f1437
            p000.AbstractC1124.m7332(r5, r11, r8, r2, r7)
        L228:
            java.lang.String r2 = "strokeWidth"
            android.graphics.RuntimeShader r5 = r3.f1437
            p000.AbstractC1124.m7333(r5, r2, r4)
            float r2 = r9.f6513
            float r1 = r1.mo594(r2)
            java.lang.String r2 = "innerBlurRadius"
            android.graphics.RuntimeShader r4 = r3.f1437
            p000.AbstractC1124.m7333(r4, r2, r1)
            float r1 = r1 * r1
            android.graphics.RuntimeShader r2 = r3.f1437
            java.lang.String r4 = "innerBlurRadiusSq"
            p000.AbstractC1124.m7333(r2, r4, r1)
            java.lang.String r1 = "highlightAlpha"
            android.graphics.RuntimeShader r2 = r3.f1437
            p000.AbstractC1124.m7333(r2, r1, r12)
            r1 = 1065353216(0x3f800000, float:1.0)
            long r1 = p000.C0114ci.m1191(r14, r1)
            android.graphics.RuntimeShader r4 = r3.f1437
            int r1 = p000.kn0.m3355(r1)
            java.lang.String r2 = "strokeColor"
            p000.AbstractC1124.m7336(r4, r2, r1)
            float r1 = p000.C0114ci.m1193(r14)
            android.graphics.RuntimeShader r2 = r3.f1437
            java.lang.String r4 = "strokeAlphaMul"
            p000.AbstractC1124.m7333(r2, r4, r1)
            pr0 r1 = r9.f6514
            r2 = r20 ^ 1
            java.lang.String r4 = "1"
            p000.AbstractC1021yh.m6878(r3, r4, r1, r2)
            java.lang.String r1 = "2"
            pr0 r4 = r9.f6515
            p000.AbstractC1021yh.m6878(r3, r1, r4, r2)
            android.graphics.RuntimeShader r1 = r3.f1437
        L279:
            if (r1 != 0) goto L27c
            goto L2a1
        L27c:
            r0.m4715(r1)
            int r1 = r9.f6512
            r0.m4713(r1)
            r1 = r22
            m6 r1 = r1.f3907
            de r13 = r1.m3787()
            float r16 = java.lang.Float.intBitsToFloat(r16)
            float r17 = java.lang.Float.intBitsToFloat(r19)
            r14 = 0
            r15 = 0
            r18 = r0
            r13.mo1731(r14, r15, r16, r17, r18)
            r1 = r18
            r0 = 0
            r1.m4715(r0)
        L2a1:
            return
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r3, p000.kx0 r4, long r5) {
            r2 = this;
            r4.getClass()
            ch1 r4 = r4.mo2146(r5)
            int r5 = r4.f2115
            int r6 = r4.f2116
            wa r0 = new wa
            r1 = 8
            r0.<init>(r2, r1, r4)
            kz r2 = p000.C0493kz.f6332
            qx0 r2 = r3.mo1612(r5, r6, r2, r0)
            return r2
    }

    @Override // p000.qa0
    /* JADX INFO: renamed from: ξ */
    public final void mo606(p000.q31 r2) {
            r1 = this;
            q01 r0 = r2.mo2315()
            boolean r0 = r0.f8784
            if (r0 == 0) goto L12
            ep0 r0 = r1.f1341
            r0.getClass()
            x91 r1 = r1.f1339
            r1.setValue(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: Г */
    public final void m607(p000.InterfaceC0190cw r14, p000.C0924vv r15, int r16, p000.wa0 r17, int r18, int r19, p000.wa0 r20, int r21, int r22, float r23, java.lang.String r24, java.lang.String r25) {
            r13 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r24
            in[] r5 = r15.f11422
            int[] r6 = r15.f11421
            int[] r7 = r15.f11420
            java.lang.String[] r8 = r15.f11419
            r5 = r5[r16]
            if (r5 == 0) goto L25
            r9 = r8[r16]
            boolean r9 = p000.ln0.m3626(r9, r4)
            if (r9 == 0) goto L25
            r9 = r7[r16]
            if (r9 != r2) goto L25
            r9 = r6[r16]
            if (r9 != r3) goto L25
            goto L4d
        L25:
            yv r5 = r13.f1332
            r9 = r25
            b3 r5 = r5.mo2978(r4, r9)
            float r9 = (float) r2
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 - r10
            float r11 = (float) r3
            float r11 = r11 - r10
            r5.getClass()
            android.graphics.RuntimeShader r10 = r5.f1437
            java.lang.String r12 = "maxCoord"
            p000.AbstractC1124.m7334(r10, r12, r9, r11)
            java.lang.String r9 = "child"
            a3 r5 = p000.g81.m2284(r5, r9)
            in[] r0 = r15.f11422
            r0[r16] = r5
            r8[r16] = r4
            r7[r16] = r2
            r6[r16] = r3
        L4d:
            r1.m6349(r5)
            r0 = r21
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            r0 = r22
            long r4 = (long) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            yp0 r13 = p000.h62.m2445(r13)
            yr r13 = r13.f12726
            wv r0 = new wv
            r4 = r23
            r0.<init>(r13, r4, r1)
            r13 = r20
            r14.mo580(r13, r2, r0)
            r13 = 0
            r1.m6349(r13)
            return
    }

    /* JADX INFO: renamed from: Д */
    public final void m608() {
            r0 = this;
            yv r0 = r0.f1332
            r0.getClass()
            return
    }

    /* JADX INFO: renamed from: Е */
    public final void m609(p000.InterfaceC0190cw r5, p000.C0924vv r6, p000.wa0 r7, float r8, float r9, int r10, float r11, float r12, int r13, int r14) {
            r4 = this;
            yv r4 = r4.f1332
            r4.getClass()
            r4 = 0
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r13 = 0
            if (r4 != 0) goto Le
            r9 = r13
            goto L1e
        Le:
            float r4 = (float) r10
            float r9 = r9 / r4
            int r4 = (int) r9
            int r4 = -r4
            long r9 = (long) r4
            r4 = 32
            long r0 = r9 << r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r2
            long r9 = r9 | r0
        L1e:
            r7.m6351(r9)
            float r4 = -r11
            float r6 = -r12
            m6 r9 = r5.mo579()
            java.lang.Object r9 = r9.f6967
            n r9 = (p000.C0568n) r9
            r9.m3925(r4, r6)
            m6 r9 = r5.mo579()     // Catch: java.lang.Throwable -> L5f
            long r10 = r9.m3758()     // Catch: java.lang.Throwable -> L5f
            de r12 = r9.m3787()     // Catch: java.lang.Throwable -> L5f
            r12.mo1729()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r12 = r9.f6967     // Catch: java.lang.Throwable -> L61
            n r12 = (p000.C0568n) r12     // Catch: java.lang.Throwable -> L61
            r12.m3923(r8, r8, r13)     // Catch: java.lang.Throwable -> L61
            p000.ln0.m3638(r5, r7)     // Catch: java.lang.Throwable -> L61
            de r7 = r9.m3787()     // Catch: java.lang.Throwable -> L5f
            r7.mo1727()     // Catch: java.lang.Throwable -> L5f
            r9.m3771(r10)     // Catch: java.lang.Throwable -> L5f
            m6 r5 = r5.mo579()
            java.lang.Object r5 = r5.f6967
            n r5 = (p000.C0568n) r5
            float r4 = -r4
            float r6 = -r6
            r5.m3925(r4, r6)
            return
        L5f:
            r7 = move-exception
            goto L6d
        L61:
            r7 = move-exception
            de r8 = r9.m3787()     // Catch: java.lang.Throwable -> L5f
            r8.mo1727()     // Catch: java.lang.Throwable -> L5f
            r9.m3771(r10)     // Catch: java.lang.Throwable -> L5f
            throw r7     // Catch: java.lang.Throwable -> L5f
        L6d:
            m6 r5 = r5.mo579()
            java.lang.Object r5 = r5.f6967
            n r5 = (p000.C0568n) r5
            float r4 = -r4
            float r6 = -r6
            r5.m3925(r4, r6)
            throw r7
    }

    /* JADX INFO: renamed from: Ж */
    public final void m610() {
            r4 = this;
            vv r0 = r4.f1333
            r0.m6276()
            vv r0 = r4.f1334
            r0.m6276()
            wa0 r0 = r4.f1335
            if (r0 == 0) goto L19
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r4)
            ua0 r1 = r1.getGraphicsContext()
            r1.mo3469(r0)
        L19:
            r0 = 0
            r4.f1335 = r0
            x91 r1 = r4.f1336
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            yv r4 = r4.f1332
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.f12818 = r1
            r4.f12819 = r1
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r4.f12820 = r1
            np0 r1 = p000.np0.f7701
            r4.f12821 = r1
            r1 = 0
            r4.f12822 = r1
            r4.f12823 = r0
            r2 = 1
            r4.f12824 = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r4.f12831 = r2
            r4.f12832 = r2
            r4.f12833 = r2
            r4.f12834 = r2
            r3 = -1
            r4.f12835 = r3
            r4.f12836 = r0
            r4.f12837 = r2
            r4.f12810 = r2
            r4.f12811 = r2
            r4.f12812 = r0
            r4.f12813 = r3
            r0 = 0
            r4.f12814 = r0
            r4.f12815 = r0
            r4.f12816 = r1
            return
    }

    /* JADX INFO: renamed from: З */
    public final void m611(p000.InterfaceC0190cw r20, p000.C0924vv r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            wa0 r7 = r2.f11413
            if (r7 != 0) goto Lb
            return
        Lb:
            t91 r3 = r2.f11417
            float r5 = r3.m5621()
            int r6 = r2.f11416
            long r3 = r1.mo585()
            r8 = 32
            long r3 = r3 >> r8
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 2
            float r9 = (float) r4
            float r9 = r9 * r5
            float r3 = r3 + r9
            int r3 = (int) r3
            long r10 = r1.mo585()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r9
            int r10 = (int) r10
            r14 = 1
            if (r6 > r14) goto L64
            r2.f11418 = r14
            long r3 = (long) r3
            long r3 = r3 << r8
            long r9 = (long) r10
            long r9 = r9 & r12
            long r3 = r3 | r9
            yp0 r6 = p000.h62.m2445(r0)
            yr r6 = r6.f12726
            zv r9 = new zv
            r10 = 0
            r9.<init>(r6, r0, r2, r10)
            r1.mo580(r7, r3, r9)
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L56
            r2 = 0
            goto L5d
        L56:
            int r0 = (int) r5
            int r0 = -r0
            long r2 = (long) r0
            long r4 = r2 << r8
            long r2 = r2 & r12
            long r2 = r2 | r4
        L5d:
            r7.m6351(r2)
            p000.ln0.m3638(r1, r7)
            return
        L64:
            if (r6 > r4) goto L97
            r2.f11418 = r4
            int r4 = r3 / 2
            if (r4 >= r14) goto L6d
            r4 = r14
        L6d:
            int r9 = r10 / 2
            if (r9 >= r14) goto L73
        L71:
            r11 = r8
            goto L75
        L73:
            r14 = r9
            goto L71
        L75:
            long r8 = (long) r4
            long r8 = r8 << r11
            long r14 = (long) r14
            long r11 = r14 & r12
            long r8 = r8 | r11
            yp0 r4 = p000.h62.m2445(r0)
            yr r4 = r4.f12726
            zv r11 = new zv
            r12 = 1
            r11.<init>(r4, r0, r2, r12)
            r1.mo580(r7, r8, r11)
            float r4 = (float) r6
            ep0 r8 = r0.f1341
            r9 = r3
            r3 = r7
            float r7 = r8.f3626
            float r8 = r8.f3627
            r0.m609(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L97:
            r17 = r3
            r16 = r5
            r3 = r6
            r15 = r7
            r11 = r8
            r18 = r10
            r2.f11418 = r4
            int r4 = r17 / 2
            if (r4 >= r14) goto La8
            r5 = r14
            goto La9
        La8:
            r5 = r4
        La9:
            int r10 = r18 / 2
            if (r10 >= r14) goto Laf
            r6 = r14
            goto Lb0
        Laf:
            r6 = r10
        Lb0:
            r4 = 0
            wa0 r4 = r2.m6275(r4)
            long r7 = (long) r5
            long r7 = r7 << r11
            long r9 = (long) r6
            long r9 = r9 & r12
            long r7 = r7 | r9
            yp0 r9 = p000.h62.m2445(r0)
            yr r9 = r9.f12726
            zv r10 = new zv
            r11 = 2
            r10.<init>(r9, r0, r2, r11)
            r1.mo580(r4, r7, r10)
            r7 = 4
            if (r3 == r7) goto L153
            r7 = 8
            if (r3 == r7) goto L131
            r7 = 16
            if (r3 != r7) goto L113
            int r7 = r5 / 4
            if (r7 >= r14) goto Lda
            r8 = r14
            goto Ldb
        Lda:
            r8 = r7
        Ldb:
            int r7 = r6 / 4
            if (r7 >= r14) goto Le1
            r9 = r14
            goto Le2
        Le1:
            r9 = r7
        Le2:
            wa0 r7 = r2.m6275(r14)
            java.lang.String r11 = "Downsample4x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r10 = r3
            r3 = 0
            r13 = r10
            r10 = 1048576000(0x3e800000, float:0.25)
            r0.m607(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r7
            r5 = r8
            r6 = r9
            int r8 = r5 / 2
            if (r8 >= r14) goto Lfa
            r8 = r14
        Lfa:
            int r9 = r6 / 2
            if (r9 >= r14) goto Lff
            r9 = r14
        Lff:
            java.lang.String r11 = "Downsample2x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r3 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r15
            r0.m607(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L110:
            r3 = r7
            goto L175
        L113:
            r13 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported scaleFactor: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r2 = " (must be 1/2/4/8/16)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L131:
            r13 = r3
            r3 = r15
            int r0 = r5 / 4
            if (r0 >= r14) goto L139
            r8 = r14
            goto L13a
        L139:
            r8 = r0
        L13a:
            int r0 = r6 / 4
            if (r0 >= r14) goto L140
            r9 = r14
            goto L141
        L140:
            r9 = r0
        L141:
            java.lang.String r11 = "Downsample4x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r7 = r3
            r3 = 0
            r10 = 1048576000(0x3e800000, float:0.25)
            r0 = r19
            r1 = r20
            r2 = r21
            r0.m607(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L110
        L153:
            r13 = r3
            r3 = r15
            int r0 = r5 / 2
            if (r0 >= r14) goto L15b
            r8 = r14
            goto L15c
        L15b:
            r8 = r0
        L15c:
            int r0 = r6 / 2
            if (r0 >= r14) goto L162
            r9 = r14
            goto L163
        L162:
            r9 = r0
        L163:
            java.lang.String r11 = "Downsample2x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r7 = r3
            r3 = 0
            r10 = 1056964608(0x3f000000, float:0.5)
            r0 = r19
            r1 = r20
            r2 = r21
            r0.m607(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L110
        L175:
            float r4 = (float) r13
            ep0 r1 = r0.f1341
            float r7 = r1.f3626
            float r8 = r1.f3627
            r1 = r20
            r2 = r21
            r6 = r13
            r5 = r16
            r9 = r17
            r10 = r18
            r0.m609(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* JADX INFO: renamed from: И */
    public final void m612() {
            r10 = this;
            boolean r0 = r10.f1330
            if (r0 != 0) goto L5
            return
        L5:
            vv r0 = r10.f1333
            wa0 r1 = r0.f11413
            if (r1 != 0) goto L1b
            aw r1 = r0.f11423
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r1)
            ua0 r1 = r1.getGraphicsContext()
            wa0 r1 = r1.mo3470()
            r0.f11413 = r1
        L1b:
            yv r1 = r10.f1332
            r2 = -1
            r1.f12813 = r2
            a80 r3 = r10.f1342
            r3.getClass()
            r4 = 0
            r1.f12822 = r4
            r5 = 0
            r1.f12823 = r5
            r6 = 1
            r1.f12824 = r6
            r3.invoke(r1)
            r10.m608()
            wa0 r3 = r0.f11413
            if (r3 == 0) goto L3d
            in r7 = r1.f12823
            r3.m6349(r7)
        L3d:
            float r3 = r1.f12822
            t91 r7 = r0.f11417
            r7.m5622(r3)
            int r3 = r1.f12824
            if (r3 >= r6) goto L49
            r3 = r6
        L49:
            r0.f11416 = r3
            int r0 = r1.f12814
            int r3 = r1.f12815
            float r7 = r1.f12816
            x91 r8 = r10.f1336
            if (r0 == r3) goto Lab
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L5d
            goto Lab
        L5d:
            vv r0 = r10.f1334
            wa0 r9 = r0.f11413
            if (r9 != 0) goto L73
            aw r9 = r0.f11423
            androidx.compose.ui.platform.AndroidComposeView r9 = p000.h62.m2446(r9)
            ua0 r9 = r9.getGraphicsContext()
            wa0 r9 = r9.mo3470()
            r0.f11413 = r9
        L73:
            r1.f12813 = r3
            a80 r3 = r10.f1342
            r3.getClass()
            r1.f12822 = r4
            r1.f12823 = r5
            r1.f12824 = r6
            r3.invoke(r1)
            r10.m608()
            wa0 r3 = r0.f11413
            if (r3 == 0) goto L8f
            in r4 = r1.f12823
            r3.m6349(r4)
        L8f:
            float r3 = r1.f12822
            t91 r4 = r0.f11417
            r4.m5622(r3)
            int r3 = r1.f12824
            if (r3 >= r6) goto L9b
            goto L9c
        L9b:
            r6 = r3
        L9c:
            r0.f11416 = r6
            r1.f12813 = r2
            t91 r10 = r10.f1337
            r10.m5622(r7)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r8.setValue(r10)
            return
        Lab:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.setValue(r10)
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ч */
    public final void mo613() {
            r2 = this;
            m02 r0 = p000.lp1.f6730
            java.lang.Object r0 = p000.AbstractC0782s1.m5331(r2, r0)
            jp1 r0 = (p000.jp1) r0
            yv r1 = r2.f1332
            r1.getClass()
            r0.getClass()
            r1.f12825 = r0
            boolean r0 = r2.f1330
            if (r0 == 0) goto L36
            vv r0 = r2.f1333
            wa0 r1 = r0.f11413
            if (r1 != 0) goto L2c
            aw r1 = r0.f11423
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r1)
            ua0 r1 = r1.getGraphicsContext()
            wa0 r1 = r1.mo3470()
            r0.f11413 = r1
        L2c:
            η r0 = new η
            r1 = 8
            r0.<init>(r1, r2)
            p000.ln0.m3642(r2, r0)
        L36:
            return
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ш */
    public final void mo614() {
            r1 = this;
            r1.m610()
            r0 = 0
            x91 r1 = r1.f1339
            r1.setValue(r0)
            return
    }
}
