package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements p000.w81 {

    /* JADX INFO: renamed from: Α */
    public final p000.C0060b0 f12517;

    /* JADX INFO: renamed from: ε */
    public p000.wa0 f12518;

    /* JADX INFO: renamed from: ζ */
    public final p000.ua0 f12519;

    /* JADX INFO: renamed from: η */
    public final androidx.compose.p001ui.platform.AndroidComposeView f12520;

    /* JADX INFO: renamed from: θ */
    public p000.e80 f12521;

    /* JADX INFO: renamed from: ι */
    public p000.p70 f12522;

    /* JADX INFO: renamed from: κ */
    public long f12523;

    /* JADX INFO: renamed from: λ */
    public boolean f12524;

    /* JADX INFO: renamed from: μ */
    public final float[] f12525;

    /* JADX INFO: renamed from: ν */
    public float[] f12526;

    /* JADX INFO: renamed from: ξ */
    public boolean f12527;

    /* JADX INFO: renamed from: ο */
    public p000.InterfaceC1031yr f12528;

    /* JADX INFO: renamed from: π */
    public p000.np0 f12529;

    /* JADX INFO: renamed from: ρ */
    public final p000.C0282fe f12530;

    /* JADX INFO: renamed from: σ */
    public int f12531;

    /* JADX INFO: renamed from: τ */
    public long f12532;

    /* JADX INFO: renamed from: υ */
    public p000.u81 f12533;

    /* JADX INFO: renamed from: φ */
    public boolean f12534;

    /* JADX INFO: renamed from: χ */
    public boolean f12535;

    /* JADX INFO: renamed from: ψ */
    public boolean f12536;

    /* JADX INFO: renamed from: ω */
    public boolean f12537;

    public ya0(p000.wa0 r3, p000.ua0 r4, androidx.compose.p001ui.platform.AndroidComposeView r5, p000.e80 r6, p000.p70 r7) {
            r2 = this;
            r2.<init>()
            r2.f12518 = r3
            r2.f12519 = r4
            r2.f12520 = r5
            r2.f12521 = r6
            r2.f12522 = r7
            r3 = 2147483647(0x7fffffff, float:NaN)
            long r3 = (long) r3
            r5 = 32
            long r5 = r3 << r5
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            long r3 = r3 | r5
            r2.f12523 = r3
            float[] r3 = p000.AbstractC0073bd.m878()
            r2.f12525 = r3
            zr r3 = new zr
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r4)
            r2.f12528 = r3
            np0 r3 = p000.np0.f7701
            r2.f12529 = r3
            fe r3 = new fe
            r3.<init>()
            r2.f12530 = r3
            long r3 = p000.r52.f9266
            r2.f12532 = r3
            r3 = 1
            r2.f12536 = r3
            b0 r3 = new b0
            r4 = 12
            r3.<init>(r4, r2)
            r2.f12517 = r3
            return
    }

    @Override // p000.w81
    public final void destroy() {
            r4 = this;
            r0 = 0
            r4.f12521 = r0
            r4.f12522 = r0
            r0 = 1
            r4.f12524 = r0
            r0 = 0
            r4.m6845(r0)
            ua0 r0 = r4.f12519
            if (r0 == 0) goto L3d
            wa0 r1 = r4.f12518
            r0.mo3469(r1)
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f12520
            cw1 r1 = r0.f956
        L19:
            java.lang.Object r2 = r1.f2790
            java.lang.ref.ReferenceQueue r2 = (java.lang.ref.ReferenceQueue) r2
            java.lang.Object r3 = r1.f2789
            k21 r3 = (p000.k21) r3
            java.lang.ref.Reference r2 = r2.poll()
            if (r2 == 0) goto L2a
            r3.m3135(r2)
        L2a:
            if (r2 != 0) goto L19
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            java.lang.Object r1 = r1.f2790
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1
            r2.<init>(r4, r1)
            r3.m3127(r2)
            v11 r0 = r0.f885
            r0.m6024(r4)
        L3d:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo7375getUnderlyingMatrixsQKQjiQ() {
            r0 = this;
            float[] r0 = r0.m6844()
            return r0
    }

    @Override // p000.w81
    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.f12527
            if (r0 != 0) goto L11
            boolean r0 = r1.f12524
            if (r0 != 0) goto L11
            androidx.compose.ui.platform.AndroidComposeView r0 = r1.f12520
            r0.invalidate()
            r0 = 1
            r1.m6845(r0)
        L11:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: α */
    public final void mo398(p000.io1 r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r1.f5141
            int r3 = r0.f12531
            r2 = r2 | r3
            np0 r3 = r1.f5155
            r0.f12529 = r3
            yr r3 = r1.f5154
            r0.f12528 = r3
            r3 = r2 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L19
            long r4 = r1.f5149
            r0.f12532 = r4
        L19:
            r4 = r2 & 1
            if (r4 == 0) goto L31
            wa0 r4 = r0.f12518
            float r5 = r1.f5142
            bb0 r4 = r4.f11620
            float r6 = r4.f1609
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L2a
            goto L31
        L2a:
            r4.f1609 = r5
            android.graphics.RenderNode r4 = r4.f1602
            r4.setScaleX(r5)
        L31:
            r4 = r2 & 2
            if (r4 == 0) goto L49
            wa0 r4 = r0.f12518
            float r5 = r1.f5143
            bb0 r4 = r4.f11620
            float r6 = r4.f1610
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L42
            goto L49
        L42:
            r4.f1610 = r5
            android.graphics.RenderNode r4 = r4.f1602
            r4.setScaleY(r5)
        L49:
            r4 = r2 & 4
            if (r4 == 0) goto L61
            wa0 r4 = r0.f12518
            float r5 = r1.f5144
            bb0 r4 = r4.f11620
            float r6 = r4.f1607
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L5a
            goto L61
        L5a:
            r4.f1607 = r5
            android.graphics.RenderNode r4 = r4.f1602
            r4.setAlpha(r5)
        L61:
            r4 = r2 & 8
            if (r4 == 0) goto L69
            wa0 r4 = r0.f12518
            bb0 r4 = r4.f11620
        L69:
            r4 = r2 & 16
            if (r4 == 0) goto L71
            wa0 r4 = r0.f12518
            bb0 r4 = r4.f11620
        L71:
            r4 = r2 & 32
            r5 = 0
            r6 = 1
            if (r4 == 0) goto La1
            wa0 r4 = r0.f12518
            float r7 = r1.f5145
            bb0 r8 = r4.f11620
            float r9 = r8.f1611
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 != 0) goto L84
            goto L90
        L84:
            r8.f1611 = r7
            android.graphics.RenderNode r8 = r8.f1602
            r8.setElevation(r7)
            r4.f11626 = r6
            r4.m6341()
        L90:
            float r4 = r1.f5145
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto La1
            boolean r4 = r0.f12537
            if (r4 != 0) goto La1
            p70 r4 = r0.f12522
            if (r4 == 0) goto La1
            r4.invoke()
        La1:
            r4 = r2 & 64
            if (r4 == 0) goto Lbe
            wa0 r4 = r0.f12518
            long r7 = r1.f5146
            bb0 r4 = r4.f11620
            long r9 = r4.f1612
            boolean r9 = p000.C0114ci.m1192(r7, r9)
            if (r9 != 0) goto Lbe
            r4.f1612 = r7
            android.graphics.RenderNode r4 = r4.f1602
            int r7 = p000.kn0.m3355(r7)
            r4.setAmbientShadowColor(r7)
        Lbe:
            r4 = r2 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto Ldb
            wa0 r4 = r0.f12518
            long r7 = r1.f5147
            bb0 r4 = r4.f11620
            long r9 = r4.f1613
            boolean r9 = p000.C0114ci.m1192(r7, r9)
            if (r9 != 0) goto Ldb
            r4.f1613 = r7
            android.graphics.RenderNode r4 = r4.f1602
            int r7 = p000.kn0.m3355(r7)
            r4.setSpotShadowColor(r7)
        Ldb:
            r4 = r2 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Le3
            wa0 r4 = r0.f12518
            bb0 r4 = r4.f11620
        Le3:
            r4 = r2 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto Leb
            wa0 r4 = r0.f12518
            bb0 r4 = r4.f11620
        Leb:
            r4 = r2 & 512(0x200, float:7.17E-43)
            if (r4 == 0) goto Lf3
            wa0 r4 = r0.f12518
            bb0 r4 = r4.f11620
        Lf3:
            r4 = r2 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L10b
            wa0 r4 = r0.f12518
            float r7 = r1.f5148
            bb0 r4 = r4.f11620
            float r8 = r4.f1614
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 != 0) goto L104
            goto L10b
        L104:
            r4.f1614 = r7
            android.graphics.RenderNode r4 = r4.f1602
            r4.setCameraDistance(r7)
        L10b:
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r4 = 0
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r3 == 0) goto L12c
            long r12 = r0.f12532
            long r14 = p000.r52.f9266
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto L124
            r3 = r6
            goto L125
        L124:
            r3 = r4
        L125:
            wa0 r14 = r0.f12518
            if (r3 == 0) goto L12e
            r14.m6347(r7)
        L12c:
            r15 = r9
            goto L159
        L12e:
            long r12 = r12 >> r11
            int r3 = (int) r12
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r12 = r0.f12523
            long r12 = r12 >> r11
            int r12 = (int) r12
            float r12 = (float) r12
            float r3 = r3 * r12
            long r12 = r0.f12532
            long r12 = r12 & r9
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r15 = r9
            long r9 = r0.f12523
            long r9 = r9 & r15
            int r9 = (int) r9
            float r9 = (float) r9
            float r12 = r12 * r9
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r9 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r3
            long r9 = r9 << r11
            long r12 = r12 & r15
            long r9 = r9 | r12
            r14.m6347(r9)
        L159:
            r3 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L16c
            wa0 r3 = r0.f12518
            boolean r9 = r1.f5151
            boolean r10 = r3.f11642
            if (r10 == r9) goto L16c
            r3.f11642 = r9
            r3.f11626 = r6
            r3.m6341()
        L16c:
            r3 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r2
            if (r3 == 0) goto L178
            wa0 r3 = r0.f12518
            in r9 = r1.f5156
            r3.m6349(r9)
        L178:
            r3 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r2
            if (r3 == 0) goto L181
            wa0 r3 = r0.f12518
            bb0 r3 = r3.f11620
        L181:
            r3 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r2
            if (r3 == 0) goto L1a8
            wa0 r3 = r0.f12518
            int r9 = r1.f5157
            bb0 r3 = r3.f11620
            int r10 = r3.f1608
            if (r10 != r9) goto L191
            goto L1a8
        L191:
            r3.f1608 = r9
            android.graphics.Paint r10 = r3.f1604
            if (r10 != 0) goto L19e
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            r3.f1604 = r10
        L19e:
            android.graphics.BlendMode r9 = p000.AbstractC0978xb.m6600(r9)
            r10.setBlendMode(r9)
            r3.m843()
        L1a8:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r2
            if (r3 == 0) goto L1d0
            wa0 r3 = r0.f12518
            int r9 = r1.f5152
            if (r9 != 0) goto L1b6
            r10 = r4
            goto L1bd
        L1b6:
            if (r9 != r6) goto L1ba
            r10 = r6
            goto L1bd
        L1ba:
            r10 = 2
            if (r9 != r10) goto L1ca
        L1bd:
            bb0 r3 = r3.f11620
            int r9 = r3.f1619
            if (r9 != r10) goto L1c4
            goto L1d0
        L1c4:
            r3.f1619 = r10
            r3.m843()
            goto L1d0
        L1ca:
            java.lang.String r0 = "Not supported composition strategy"
            p000.C1080.m7279(r0)
            return
        L1d0:
            r3 = r2 & 7963(0x1f1b, float:1.1159E-41)
            if (r3 == 0) goto L1d8
            r0.f12534 = r6
            r0.f12535 = r6
        L1d8:
            u81 r3 = r0.f12533
            u81 r9 = r1.f5158
            boolean r3 = p000.ln0.m3626(r3, r9)
            if (r3 != 0) goto L2c5
            u81 r3 = r1.f5158
            r0.f12533 = r3
            if (r3 != 0) goto L1ea
            goto L2c6
        L1ea:
            wa0 r9 = r0.f12518
            boolean r10 = r3 instanceof p000.s81
            if (r10 == 0) goto L229
            r4 = r3
            s81 r4 = (p000.s81) r4
            ml1 r4 = r4.f9764
            float r7 = r4.f7200
            float r8 = r4.f7201
            int r10 = java.lang.Float.floatToRawIntBits(r7)
            long r12 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r8)
            r14 = r11
            r17 = r12
            long r11 = (long) r10
            long r17 = r17 << r14
            long r10 = r11 & r15
            long r18 = r17 | r10
            float r10 = r4.f7202
            float r10 = r10 - r7
            float r4 = r4.f7203
            float r4 = r4 - r8
            int r7 = java.lang.Float.floatToRawIntBits(r10)
            long r7 = (long) r7
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            long r7 = r7 << r14
            long r10 = r10 & r15
            long r20 = r7 | r10
            r22 = 0
            r17 = r9
            r17.m6350(r18, r20, r22)
            goto L2a1
        L229:
            r14 = r11
            boolean r10 = r3 instanceof p000.r81
            r11 = 0
            r13 = 0
            if (r10 == 0) goto L248
            r10 = r3
            r81 r10 = (p000.r81) r10
            z91 r10 = r10.f9289
            r9.f11630 = r13
            r9.f11628 = r7
            r9.f11627 = r11
            r9.f11629 = r5
            r9.f11626 = r6
            r9.f11633 = r4
            r9.f11631 = r10
            r9.m6341()
            goto L2a1
        L248:
            boolean r10 = r3 instanceof p000.t81
            if (r10 == 0) goto L2c1
            r10 = r3
            t81 r10 = (p000.t81) r10
            r17 = r14
            x2 r14 = r10.f10248
            if (r14 == 0) goto L267
            r9.f11630 = r13
            r9.f11628 = r7
            r9.f11627 = r11
            r9.f11629 = r5
            r9.f11626 = r6
            r9.f11633 = r4
            r9.f11631 = r14
            r9.m6341()
            goto L2a1
        L267:
            wo1 r4 = r10.f10247
            float r7 = r4.f11788
            float r8 = r4.f11789
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r10 = r10 << r17
            long r7 = r7 & r15
            long r18 = r10 | r7
            float r7 = r4.m6400()
            float r8 = r4.m6399()
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r10 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            long r10 = r10 << r17
            long r7 = r7 & r15
            long r20 = r10 | r7
            long r7 = r4.f11795
            long r7 = r7 >> r17
            int r4 = (int) r7
            float r22 = java.lang.Float.intBitsToFloat(r4)
            r17 = r9
            r17.m6350(r18, r20, r22)
        L2a1:
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 33
            if (r4 >= r7) goto L2c6
            boolean r4 = r3 instanceof p000.r81
            if (r4 != 0) goto L2b9
            boolean r4 = r3 instanceof p000.t81
            if (r4 == 0) goto L2c6
            t81 r3 = (p000.t81) r3
            wo1 r3 = r3.f10247
            boolean r3 = p000.u81.m5810(r3)
            if (r3 != 0) goto L2c6
        L2b9:
            p70 r3 = r0.f12522
            if (r3 == 0) goto L2c6
            r3.invoke()
            goto L2c6
        L2c1:
            p000.C1080.m7272()
            return
        L2c5:
            r6 = r4
        L2c6:
            int r1 = r1.f5141
            r0.f12531 = r1
            if (r2 != 0) goto L2ce
            if (r6 == 0) goto L2e2
        L2ce:
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f12520
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L2d9
            r1.onDescendantInvalidated(r0, r0)
        L2d9:
            boolean r1 = androidx.compose.p001ui.platform.AndroidComposeView.m371()
            if (r1 == 0) goto L2e2
            r0.m383(r5)
        L2e2:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: β */
    public final long mo399(long r1, boolean r3) {
            r0 = this;
            if (r3 == 0) goto Le
            float[] r3 = r0.m6843()
            if (r3 != 0) goto L12
            r0 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            return r0
        Le:
            float[] r3 = r0.m6844()
        L12:
            boolean r0 = r0.f12536
            if (r0 == 0) goto L17
            return r1
        L17:
            long r0 = p000.AbstractC0073bd.m850(r3, r1)
            return r0
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: γ */
    public final void mo400(long r3) {
            r2 = this;
            long r0 = r2.f12523
            boolean r0 = p000.bn0.m985(r3, r0)
            if (r0 != 0) goto L26
            boolean r0 = androidx.compose.p001ui.platform.AndroidComposeView.m371()
            androidx.compose.ui.platform.AndroidComposeView r1 = r2.f12520
            if (r0 == 0) goto L15
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            r1.m383(r0)
        L15:
            r2.f12523 = r3
            boolean r3 = r2.f12527
            if (r3 != 0) goto L26
            boolean r3 = r2.f12524
            if (r3 != 0) goto L26
            r1.invalidate()
            r3 = 1
            r2.m6845(r3)
        L26:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: δ */
    public final void mo401(p000.a21 r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            float[] r2 = r0.m6843()
            goto Lb
        L7:
            float[] r2 = r0.m6844()
        Lb:
            boolean r0 = r0.f12536
            if (r0 != 0) goto L1e
            if (r2 != 0) goto L1b
            r0 = 0
            r1.f49 = r0
            r1.f50 = r0
            r1.f51 = r0
            r1.f52 = r0
            return
        L1b:
            p000.AbstractC0073bd.m851(r2, r1)
        L1e:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ε */
    public final void mo402(p000.e80 r6, p000.p70 r7) {
            r5 = this;
            ua0 r0 = r5.f12519
            if (r0 == 0) goto L4c
            wa0 r1 = r5.f12518
            boolean r1 = r1.f11638
            if (r1 != 0) goto Lf
            java.lang.String r1 = "layer should have been released before reuse"
            p000.am0.m177(r1)
        Lf:
            wa0 r0 = r0.mo3470()
            r5.f12518 = r0
            r0 = 0
            r5.f12524 = r0
            r5.f12521 = r6
            r5.f12522 = r7
            r5.f12534 = r0
            r5.f12535 = r0
            r6 = 1
            r5.f12536 = r6
            float[] r6 = r5.f12525
            p000.AbstractC0073bd.m867(r6)
            float[] r6 = r5.f12526
            if (r6 == 0) goto L2f
            p000.AbstractC0073bd.m867(r6)
        L2f:
            long r6 = p000.r52.f9266
            r5.f12532 = r6
            r5.f12537 = r0
            r6 = 2147483647(0x7fffffff, float:NaN)
            long r6 = (long) r6
            r1 = 32
            long r1 = r6 << r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r3
            long r6 = r6 | r1
            r5.f12523 = r6
            r6 = 0
            r5.f12533 = r6
            r5.f12531 = r0
            return
        L4c:
            java.lang.String r5 = "currently reuse is only supported when we manage the layer lifecycle"
            pm r5 = p000.lz1.m3680(r5)
            throw r5
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ζ */
    public final void mo403(p000.InterfaceC0209de r3, p000.wa0 r4) {
            r2 = this;
            r2.mo405()
            wa0 r0 = r2.f12518
            bb0 r0 = r0.f11620
            float r0 = r0.f1611
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r2.f12537 = r0
            fe r0 = r2.f12530
            m6 r1 = r0.f3907
            r1.m3768(r3)
            r1.f6968 = r4
            wa0 r2 = r2.f12518
            p000.ln0.m3638(r0, r2)
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: η */
    public final void mo404(long r3) {
            r2 = this;
            boolean r0 = androidx.compose.p001ui.platform.AndroidComposeView.m371()
            androidx.compose.ui.platform.AndroidComposeView r1 = r2.f12520
            if (r0 == 0) goto Ld
            r0 = -1065353216(0xffffffffc0800000, float:-4.0)
            r1.m383(r0)
        Ld:
            wa0 r2 = r2.f12518
            r2.m6351(r3)
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L1b
            r2.onDescendantInvalidated(r1, r1)
        L1b:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: θ */
    public final void mo405() {
            r9 = this;
            androidx.compose.p001ui.platform.AndroidComposeView.m371()
            boolean r0 = r9.f12527
            if (r0 == 0) goto L63
            long r0 = r9.f12532
            long r2 = p000.r52.f9266
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            goto L52
        L10:
            wa0 r0 = r9.f12518
            long r0 = r0.f11640
            long r2 = r9.f12523
            boolean r0 = p000.bn0.m985(r0, r2)
            if (r0 != 0) goto L52
            wa0 r0 = r9.f12518
            long r1 = r9.f12532
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r4 = r9.f12523
            long r4 = r4 >> r3
            int r2 = (int) r4
            float r2 = (float) r2
            float r1 = r1 * r2
            long r4 = r9.f12532
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r4 = r9.f12523
            long r4 = r4 & r6
            int r4 = (int) r4
            float r4 = (float) r4
            float r2 = r2 * r4
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            long r3 = r4 << r3
            long r1 = r1 & r6
            long r1 = r1 | r3
            r0.m6347(r1)
        L52:
            wa0 r3 = r9.f12518
            yr r4 = r9.f12528
            np0 r5 = r9.f12529
            long r6 = r9.f12523
            b0 r8 = r9.f12517
            r3.m6345(r4, r5, r6, r8)
            r0 = 0
            r9.m6845(r0)
        L63:
            return
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: ι */
    public final boolean mo406(long r22) {
            r21 = this;
            r0 = 32
            long r1 = r22 >> r0
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r22 & r3
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r5 = r21
            wa0 r5 = r5.f12518
            boolean r6 = r5.f11642
            if (r6 == 0) goto L16e
            u81 r5 = r5.m6344()
            boolean r6 = r5 instanceof p000.s81
            if (r6 == 0) goto L43
            s81 r5 = (p000.s81) r5
            ml1 r0 = r5.f9764
            float r3 = r0.f7200
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L159
            float r3 = r0.f7202
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L159
            float r2 = r0.f7201
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L159
            float r0 = r0.f7203
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L159
            goto L16e
        L43:
            boolean r6 = r5 instanceof p000.t81
            if (r6 == 0) goto L15b
            t81 r5 = (p000.t81) r5
            wo1 r5 = r5.f10247
            float r6 = r5.f11788
            long r7 = r5.f11793
            long r9 = r5.f11795
            long r11 = r5.f11794
            float r13 = r5.f11791
            float r14 = r5.f11789
            float r15 = r5.f11790
            r16 = r0
            r22 = r1
            long r0 = r5.f11792
            int r17 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r17 < 0) goto L159
            int r17 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r17 >= 0) goto L159
            int r17 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r17 < 0) goto L159
            int r17 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r17 < 0) goto L71
            goto L159
        L71:
            r17 = r3
            long r3 = r0 >> r16
            int r3 = (int) r3
            float r4 = java.lang.Float.intBitsToFloat(r3)
            r19 = r0
            long r0 = r7 >> r16
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 + r4
            float r4 = r5.m6400()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L14b
            r4 = r0
            long r0 = r9 >> r16
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r21 = r0
            r23 = r1
            long r0 = r11 >> r16
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 + r23
            float r16 = r5.m6400()
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L14b
            r16 = r0
            long r0 = r19 & r17
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            long r9 = r9 & r17
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            float r10 = r10 + r1
            float r1 = r5.m6399()
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L14b
            long r7 = r7 & r17
            int r1 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r1)
            long r10 = r11 & r17
            int r8 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r8)
            float r10 = r10 + r7
            float r7 = r5.m6399()
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 > 0) goto L14b
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = r0 + r14
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r15 - r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 + r14
            float r7 = java.lang.Float.intBitsToFloat(r16)
            float r15 = r15 - r7
            float r7 = java.lang.Float.intBitsToFloat(r8)
            float r7 = r13 - r7
            float r8 = java.lang.Float.intBitsToFloat(r9)
            float r13 = r13 - r8
            float r8 = java.lang.Float.intBitsToFloat(r21)
            float r8 = r8 + r6
            int r6 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r6 >= 0) goto L116
            int r6 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r6 >= 0) goto L116
            long r6 = r5.f11792
            r5 = r0
            r4 = r3
            r3 = r22
            boolean r0 = p000.u81.m5811(r2, r3, r4, r5, r6)
            return r0
        L116:
            r3 = r22
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L129
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 <= 0) goto L129
            long r6 = r5.f11795
            r4 = r8
            r5 = r13
            boolean r0 = p000.u81.m5811(r2, r3, r4, r5, r6)
            return r0
        L129:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L139
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L139
            long r6 = r5.f11793
            r5 = r1
            boolean r0 = p000.u81.m5811(r2, r3, r4, r5, r6)
            return r0
        L139:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L16e
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L16e
            r13 = r7
            long r6 = r5.f11794
            r5 = r13
            r4 = r15
            boolean r0 = p000.u81.m5811(r2, r3, r4, r5, r6)
            return r0
        L14b:
            r3 = r22
            x2 r0 = p000.AbstractC1006y2.m6812()
            p000.z91.m7119(r0, r5)
            boolean r0 = p000.u81.m5809(r0, r2, r3)
            return r0
        L159:
            r0 = 0
            return r0
        L15b:
            r3 = r1
            boolean r0 = r5 instanceof p000.r81
            if (r0 == 0) goto L169
            r81 r5 = (p000.r81) r5
            z91 r0 = r5.f9289
            boolean r0 = p000.u81.m5809(r0, r2, r3)
            return r0
        L169:
            p000.C1080.m7272()
            r0 = 0
            return r0
        L16e:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final float[] m6843() {
            r4 = this;
            float[] r0 = r4.f12526
            if (r0 != 0) goto La
            float[] r0 = p000.AbstractC0073bd.m878()
            r4.f12526 = r0
        La:
            boolean r1 = r4.f12535
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L19
            r4 = r0[r2]
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 == 0) goto L2a
            return r3
        L19:
            r4.f12535 = r2
            float[] r1 = r4.m6844()
            boolean r4 = r4.f12536
            if (r4 == 0) goto L24
            return r1
        L24:
            boolean r4 = p000.AbstractC0073bd.m848(r1, r0)
            if (r4 == 0) goto L2b
        L2a:
            return r0
        L2b:
            r4 = 2143289344(0x7fc00000, float:NaN)
            r0[r2] = r4
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public final float[] m6844() {
            r23 = this;
            r0 = r23
            boolean r1 = r0.f12534
            float[] r2 = r0.f12525
            if (r1 == 0) goto L109
            wa0 r1 = r0.f12518
            long r3 = r1.f11641
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L25
            long r3 = r0.f12523
            long r3 = p000.AbstractC0782s1.m5322(r3)
            long r3 = p000.i91.m2683(r3)
        L25:
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            bb0 r1 = r1.f11620
            float r4 = r1.f1609
            float r1 = r1.f1610
            r6 = 0
            double r7 = (double) r6
            r9 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r7 = r7 * r9
            double r9 = java.lang.Math.sin(r7)
            float r9 = (float) r9
            double r10 = java.lang.Math.cos(r7)
            float r10 = (float) r10
            float r11 = -r9
            float r12 = r6 * r10
            float r13 = r6 * r9
            float r14 = r12 - r13
            float r12 = r12 + r13
            r13 = r6
            r15 = r7
            double r6 = java.lang.Math.sin(r15)
            float r6 = (float) r6
            double r7 = java.lang.Math.cos(r15)
            float r7 = (float) r7
            float r8 = -r6
            float r17 = r9 * r6
            float r9 = r9 * r7
            float r18 = r10 * r6
            float r19 = r10 * r7
            float r20 = r13 * r7
            float r21 = r12 * r6
            float r21 = r21 + r20
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            float r20 = r20 * r6
            float r12 = r12 * r7
            float r12 = r12 + r20
            r20 = r13
            r6 = r14
            double r13 = java.lang.Math.sin(r15)
            float r13 = (float) r13
            double r14 = java.lang.Math.cos(r15)
            float r14 = (float) r14
            float r15 = -r13
            float r16 = r15 * r7
            float r22 = r14 * r17
            float r22 = r22 + r16
            float r7 = r7 * r14
            float r17 = r17 * r13
            float r17 = r17 + r7
            float r7 = r13 * r10
            float r10 = r10 * r14
            float r15 = r15 * r8
            float r16 = r14 * r9
            float r16 = r16 + r15
            float r14 = r14 * r8
            float r13 = r13 * r9
            float r13 = r13 + r14
            float r17 = r17 * r4
            float r7 = r7 * r4
            float r13 = r13 * r4
            float r22 = r22 * r1
            float r10 = r10 * r1
            float r16 = r16 * r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r18 = r18 * r1
            float r11 = r11 * r1
            float r19 = r19 * r1
            int r4 = r2.length
            r8 = 0
            r9 = 16
            if (r4 >= r9) goto Lb5
            goto L101
        Lb5:
            r2[r8] = r17
            r4 = 1
            r2[r4] = r7
            r4 = 2
            r2[r4] = r13
            r4 = 3
            r2[r4] = r20
            r4 = 4
            r2[r4] = r22
            r4 = 5
            r2[r4] = r10
            r4 = 6
            r2[r4] = r16
            r4 = 7
            r2[r4] = r20
            r4 = 8
            r2[r4] = r18
            r4 = 9
            r2[r4] = r11
            r4 = 10
            r2[r4] = r19
            r4 = 11
            r2[r4] = r20
            float r4 = -r5
            float r17 = r17 * r4
            float r22 = r22 * r3
            float r17 = r17 - r22
            float r17 = r17 + r21
            float r17 = r17 + r5
            r5 = 12
            r2[r5] = r17
            float r7 = r7 * r4
            float r10 = r10 * r3
            float r7 = r7 - r10
            float r7 = r7 + r6
            float r7 = r7 + r3
            r5 = 13
            r2[r5] = r7
            float r4 = r4 * r13
            float r3 = r3 * r16
            float r4 = r4 - r3
            float r4 = r4 + r12
            r3 = 14
            r2[r3] = r4
            r3 = 15
            r2[r3] = r1
        L101:
            r0.f12534 = r8
            boolean r1 = p000.AbstractC1021yh.m6869(r2)
            r0.f12536 = r1
        L109:
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public final void m6845(boolean r4) {
            r3 = this;
            boolean r0 = r3.f12527
            if (r4 == r0) goto L2f
            r3.f12527 = r4
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.f12520
            v11 r1 = r0.f885
            boolean r2 = r0.f887
            if (r4 != 0) goto L1b
            if (r2 != 0) goto L2f
            r1.m6024(r3)
            v11 r4 = r0.f886
            if (r4 == 0) goto L2f
            r4.m6024(r3)
            return
        L1b:
            if (r2 != 0) goto L21
            r1.m6015(r3)
            return
        L21:
            v11 r4 = r0.f886
            if (r4 != 0) goto L2c
            v11 r4 = new v11
            r4.<init>()
            r0.f886 = r4
        L2c:
            r4.m6015(r3)
        L2f:
            return
    }
}
