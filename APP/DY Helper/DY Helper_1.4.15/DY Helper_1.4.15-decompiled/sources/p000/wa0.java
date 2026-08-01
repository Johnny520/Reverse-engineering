package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wa0 {

    /* JADX INFO: renamed from: α */
    public final p000.bb0 f11620;

    /* JADX INFO: renamed from: β */
    public p000.InterfaceC1031yr f11621;

    /* JADX INFO: renamed from: γ */
    public p000.np0 f11622;

    /* JADX INFO: renamed from: δ */
    public p000.a80 f11623;

    /* JADX INFO: renamed from: ε */
    public final p000.C0060b0 f11624;

    /* JADX INFO: renamed from: ζ */
    public android.graphics.Outline f11625;

    /* JADX INFO: renamed from: η */
    public boolean f11626;

    /* JADX INFO: renamed from: θ */
    public long f11627;

    /* JADX INFO: renamed from: ι */
    public long f11628;

    /* JADX INFO: renamed from: κ */
    public float f11629;

    /* JADX INFO: renamed from: λ */
    public p000.u81 f11630;

    /* JADX INFO: renamed from: μ */
    public p000.z91 f11631;

    /* JADX INFO: renamed from: ν */
    public p000.C0969x2 f11632;

    /* JADX INFO: renamed from: ξ */
    public boolean f11633;

    /* JADX INFO: renamed from: ο */
    public p000.C0282fe f11634;

    /* JADX INFO: renamed from: π */
    public p000.C0709q2 f11635;

    /* JADX INFO: renamed from: ρ */
    public int f11636;

    /* JADX INFO: renamed from: σ */
    public final p000.C0796sf f11637;

    /* JADX INFO: renamed from: τ */
    public boolean f11638;

    /* JADX INFO: renamed from: υ */
    public long f11639;

    /* JADX INFO: renamed from: φ */
    public long f11640;

    /* JADX INFO: renamed from: χ */
    public long f11641;

    /* JADX INFO: renamed from: ψ */
    public boolean f11642;

    /* JADX INFO: renamed from: ω */
    public android.graphics.RectF f11643;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "robolectric"
            r0.equals(r1)
            return
    }

    public wa0(p000.bb0 r6) {
            r5 = this;
            r5.<init>()
            r5.f11620 = r6
            zr r0 = p000.AbstractC0782s1.f9643
            r5.f11621 = r0
            np0 r0 = p000.np0.f7701
            r5.f11622 = r0
            a1 r0 = p000.C0002a1.f30
            r5.f11623 = r0
            b0 r0 = new b0
            r1 = 11
            r0.<init>(r1, r5)
            r5.f11624 = r0
            r0 = 1
            r5.f11626 = r0
            r0 = 0
            r5.f11627 = r0
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r5.f11628 = r2
            sf r4 = new sf
            r4.<init>()
            r5.f11637 = r4
            r4 = 0
            r6.f1615 = r4
            r6.m841()
            r5.f11639 = r0
            r5.f11640 = r0
            r5.f11641 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6341() {
            r17 = this;
            r0 = r17
            bb0 r1 = r0.f11620
            android.graphics.RenderNode r2 = r1.f1602
            boolean r3 = r0.f11626
            r4 = 0
            if (r3 == 0) goto L12b
            boolean r3 = r0.f11642
            if (r3 != 0) goto L27
            float r5 = r1.f1611
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L17
            goto L27
        L17:
            r1.f1615 = r4
            r1.m841()
            r3 = 0
            r2.setOutline(r3)
            r1.f1606 = r4
            r1.m841()
            goto L12b
        L27:
            z91 r5 = r0.f11631
            r6 = 1
            if (r5 == 0) goto La5
            android.graphics.RectF r3 = r0.f11643
            if (r3 != 0) goto L37
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r0.f11643 = r3
        L37:
            boolean r7 = r5 instanceof p000.C0969x2
            java.lang.String r8 = "Unable to obtain android.graphics.Path"
            if (r7 == 0) goto L9f
            r9 = r5
            x2 r9 = (p000.C0969x2) r9
            android.graphics.Path r9 = r9.f11999
            r9.computeBounds(r3, r4)
            android.graphics.Outline r9 = r0.f11625
            if (r9 != 0) goto L50
            android.graphics.Outline r9 = new android.graphics.Outline
            r9.<init>()
            r0.f11625 = r9
        L50:
            if (r7 == 0) goto L99
            r7 = r5
            x2 r7 = (p000.C0969x2) r7
            android.graphics.Path r7 = r7.f11999
            r9.setPath(r7)
            boolean r7 = r9.canClip()
            r7 = r7 ^ r6
            r0.f11633 = r7
            r0.f11631 = r5
            float r5 = r1.f1607
            r9.setAlpha(r5)
            float r5 = r3.width()
            java.lang.Math.round(r5)
            float r3 = r3.height()
            java.lang.Math.round(r3)
            r2.setOutline(r9)
            r1.f1606 = r6
            r1.m841()
            boolean r3 = r0.f11633
            if (r3 == 0) goto L90
            boolean r3 = r0.f11642
            if (r3 == 0) goto L90
            r1.f1615 = r4
            r1.m841()
            r2.discardDisplayList()
            goto L12b
        L90:
            boolean r2 = r0.f11642
            r1.f1615 = r2
            r1.m841()
            goto L12b
        L99:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r8)
            throw r0
        L9f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r8)
            throw r0
        La5:
            r1.f1615 = r3
            r1.m841()
            android.graphics.Outline r3 = r0.f11625
            if (r3 != 0) goto Lb5
            android.graphics.Outline r3 = new android.graphics.Outline
            r3.<init>()
            r0.f11625 = r3
        Lb5:
            r7 = r3
            long r8 = r0.f11640
            long r8 = p000.AbstractC0782s1.m5322(r8)
            long r10 = r0.f11627
            long r12 = r0.f11628
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto Lca
            goto Lcb
        Lca:
            r8 = r12
        Lcb:
            r3 = 32
            long r12 = r10 >> r3
            int r5 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r5)
            int r12 = java.lang.Math.round(r12)
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r13
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = java.lang.Math.round(r11)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r15 = r13
            long r13 = r8 >> r3
            int r3 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r3)
            float r13 = r13 + r5
            int r5 = java.lang.Math.round(r13)
            float r10 = java.lang.Float.intBitsToFloat(r10)
            long r8 = r8 & r15
            int r13 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r13)
            float r8 = r8 + r10
            int r8 = java.lang.Math.round(r8)
            r9 = r11
            r11 = r8
            r8 = r12
            float r12 = r0.f11629
            r10 = r5
            r7.setRoundRect(r8, r9, r10, r11, r12)
            float r5 = r1.f1607
            r7.setAlpha(r5)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.Math.round(r3)
            float r3 = java.lang.Float.intBitsToFloat(r13)
            java.lang.Math.round(r3)
            r2.setOutline(r7)
            r1.f1606 = r6
            r1.m841()
        L12b:
            r0.f11626 = r4
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6342() {
            r15 = this;
            boolean r0 = r15.f11638
            if (r0 == 0) goto L77
            int r0 = r15.f11636
            if (r0 != 0) goto L77
            sf r0 = r15.f11637
            java.lang.Object r1 = r0.f9880
            wa0 r1 = (p000.wa0) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f11636
            int r2 = r2 + (-1)
            r1.f11636 = r2
            r1.m6342()
            r1 = 0
            r0.f9880 = r1
        L1c:
            java.lang.Object r0 = r0.f9882
            c21 r0 = (p000.c21) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f1942
            long[] r2 = r0.f1941
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            wa0 r11 = (p000.wa0) r11
            int r12 = r11.f11636
            int r12 = r12 + (-1)
            r11.f11636 = r12
            r11.m6342()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.m1108()
        L70:
            bb0 r15 = r15.f11620
            android.graphics.RenderNode r15 = r15.f1602
            r15.discardDisplayList()
        L77:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m6343(p000.InterfaceC0190cw r14) {
            r13 = this;
            sf r0 = r13.f11637
            java.lang.Object r1 = r0.f9880
            wa0 r1 = (p000.wa0) r1
            r0.f9881 = r1
            java.lang.Object r1 = r0.f9882
            c21 r1 = (p000.c21) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.m1114()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f9883
            c21 r2 = (p000.c21) r2
            if (r2 != 0) goto L23
            int r2 = p000.uq1.f10933
            c21 r2 = new c21
            r2.<init>()
            r0.f9883 = r2
        L23:
            r2.m1115(r1)
            r1.m1108()
        L29:
            r1 = 1
            r0.f9879 = r1
            a80 r13 = r13.f11623
            r13.invoke(r14)
            r13 = 0
            r0.f9879 = r13
            java.lang.Object r14 = r0.f9881
            wa0 r14 = (p000.wa0) r14
            if (r14 == 0) goto L43
            int r1 = r14.f11636
            int r1 = r1 + (-1)
            r14.f11636 = r1
            r14.m6342()
        L43:
            java.lang.Object r14 = r0.f9883
            c21 r14 = (p000.c21) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.m1114()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.f1942
            long[] r1 = r14.f1941
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            wa0 r9 = (p000.wa0) r9
            int r10 = r9.f11636
            int r10 = r10 + (-1)
            r9.f11636 = r10
            r9.m6342()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.m1108()
        L9c:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.u81 m6344() {
            r14 = this;
            u81 r0 = r14.f11630
            z91 r1 = r14.f11631
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r1 == 0) goto L11
            r81 r0 = new r81
            r0.<init>(r1)
            r14.f11630 = r0
            return r0
        L11:
            long r0 = r14.f11640
            long r0 = p000.AbstractC0782s1.m5322(r0)
            long r2 = r14.f11627
            long r4 = r14.f11628
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 != 0) goto L25
            goto L26
        L25:
            r0 = r4
        L26:
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r7
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r9 = r0 >> r4
            int r3 = (int) r9
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 + r6
            long r0 = r0 & r7
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r9 = r0 + r2
            float r0 = r14.f11629
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            t81 r1 = new t81
            int r5 = java.lang.Float.floatToRawIntBits(r0)
            long r10 = (long) r5
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r12 = (long) r0
            long r4 = r10 << r4
            long r7 = r7 & r12
            long r10 = r4 | r7
            r7 = r2
            r8 = r3
            wo1 r0 = p000.u81.m5802(r6, r7, r8, r9, r10)
            r1.<init>(r0)
            goto L78
        L6c:
            r7 = r2
            r8 = r3
            s81 r1 = new s81
            ml1 r0 = new ml1
            r0.<init>(r6, r7, r8, r9)
            r1.<init>(r0)
        L78:
            r14.f11630 = r1
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public final void m6345(p000.InterfaceC1031yr r3, p000.np0 r4, long r5, p000.a80 r7) {
            r2 = this;
            long r0 = r2.f11640
            boolean r0 = p000.bn0.m985(r0, r5)
            if (r0 != 0) goto L20
            r2.f11640 = r5
            long r0 = r2.f11639
            r2.m6348(r0, r5)
            long r5 = r2.f11628
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L20
            r5 = 1
            r2.f11626 = r5
            r2.m6341()
        L20:
            r2.f11621 = r3
            r2.f11622 = r4
            r2.f11623 = r7
            r2.m6346()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m6346() {
            r10 = this;
            yr r0 = r10.f11621
            np0 r1 = r10.f11622
            b0 r2 = r10.f11624
            bb0 r3 = r10.f11620
            fe r4 = r3.f1601
            android.graphics.RenderNode r5 = r3.f1602
            android.graphics.RecordingCanvas r6 = r5.beginRecording()
            ge r7 = r3.f1600     // Catch: java.lang.Throwable -> L35
            l0 r8 = r7.f4335     // Catch: java.lang.Throwable -> L35
            android.graphics.Canvas r9 = r8.f6337     // Catch: java.lang.Throwable -> L35
            r8.f6337 = r6     // Catch: java.lang.Throwable -> L35
            m6 r6 = r4.f3907     // Catch: java.lang.Throwable -> L35
            r6.m3769(r0)     // Catch: java.lang.Throwable -> L35
            r6.m3770(r1)     // Catch: java.lang.Throwable -> L35
            r6.f6968 = r10     // Catch: java.lang.Throwable -> L35
            long r0 = r3.f1603     // Catch: java.lang.Throwable -> L35
            r6.m3771(r0)     // Catch: java.lang.Throwable -> L35
            r6.m3768(r8)     // Catch: java.lang.Throwable -> L35
            r2.invoke(r4)     // Catch: java.lang.Throwable -> L35
            l0 r10 = r7.f4335     // Catch: java.lang.Throwable -> L35
            r10.f6337 = r9     // Catch: java.lang.Throwable -> L35
            r5.endRecording()
            return
        L35:
            r10 = move-exception
            r5.endRecording()
            throw r10
    }

    /* JADX INFO: renamed from: η */
    public final void m6347(long r5) {
            r4 = this;
            long r0 = r4.f11641
            boolean r0 = p000.o41.m4203(r0, r5)
            if (r0 != 0) goto L3b
            r4.f11641 = r5
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r5
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            bb0 r4 = r4.f11620
            android.graphics.RenderNode r4 = r4.f1602
            if (r0 != 0) goto L21
            r4.resetPivot()
            return
        L21:
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r4.setPivotX(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r4.setPivotY(r5)
        L3b:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m6348(long r7, long r9) {
            r6 = this;
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            bb0 r6 = r6.f11620
            android.graphics.RenderNode r8 = r6.f1602
            long r4 = r9 >> r0
            int r0 = (int) r4
            int r0 = r0 + r1
            long r2 = r2 & r9
            int r2 = (int) r2
            int r2 = r2 + r7
            r8.setPosition(r1, r7, r0, r2)
            long r7 = p000.AbstractC0782s1.m5322(r9)
            r6.f1603 = r7
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m6349(p000.AbstractC0401in r3) {
            r2 = this;
            bb0 r2 = r2.f11620
            in r0 = r2.f1618
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L1f
            r2.f1618 = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1f
            android.graphics.RenderNode r2 = r2.f1602
            if (r3 == 0) goto L1b
            android.graphics.RenderEffect r3 = r3.m2766()
            goto L1c
        L1b:
            r3 = 0
        L1c:
            p000.AbstractC0671p1.m4374(r2, r3)
        L1f:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m6350(long r3, long r5, float r7) {
            r2 = this;
            long r0 = r2.f11627
            boolean r0 = p000.o41.m4203(r0, r3)
            if (r0 == 0) goto L1c
            long r0 = r2.f11628
            boolean r0 = p000.jw1.m2997(r0, r5)
            if (r0 == 0) goto L1c
            float r0 = r2.f11629
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L1c
            z91 r0 = r2.f11631
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            return
        L1c:
            r0 = 0
            r2.f11630 = r0
            r2.f11631 = r0
            r0 = 1
            r2.f11626 = r0
            r0 = 0
            r2.f11633 = r0
            r2.f11627 = r3
            r2.f11628 = r5
            r2.f11629 = r7
            r2.m6341()
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m6351(long r3) {
            r2 = this;
            long r0 = r2.f11639
            boolean r0 = p000.um0.m5938(r0, r3)
            if (r0 != 0) goto Lf
            r2.f11639 = r3
            long r0 = r2.f11640
            r2.m6348(r3, r0)
        Lf:
            return
    }
}
