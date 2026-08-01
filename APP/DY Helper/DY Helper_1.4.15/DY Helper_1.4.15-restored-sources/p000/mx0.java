package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 {

    /* JADX INFO: renamed from: α */
    public final p000.yp0 f7310;

    /* JADX INFO: renamed from: β */
    public final p000.C0538m6 f7311;

    /* JADX INFO: renamed from: γ */
    public boolean f7312;

    /* JADX INFO: renamed from: δ */
    public boolean f7313;

    /* JADX INFO: renamed from: ε */
    public final p000.C0574n5 f7314;

    /* JADX INFO: renamed from: ζ */
    public final p000.k21 f7315;

    /* JADX INFO: renamed from: η */
    public final long f7316;

    /* JADX INFO: renamed from: θ */
    public final p000.k21 f7317;

    /* JADX INFO: renamed from: ι */
    public p000.C1028yo f7318;

    public mx0(p000.yp0 r4) {
            r3 = this;
            r3.<init>()
            r3.f7310 = r4
            m6 r4 = new m6
            r0 = 6
            r4.<init>(r0)
            r3.f7311 = r4
            n5 r4 = new n5
            r0 = 23
            r4.<init>(r0)
            r3.f7314 = r4
            k21 r4 = new k21
            r0 = 16
            yp0[] r1 = new p000.yp0[r0]
            r4.<init>(r1)
            r3.f7315 = r4
            r1 = 1
            r3.f7316 = r1
            k21 r4 = new k21
            lx0[] r0 = new p000.lx0[r0]
            r4.<init>(r0)
            r3.f7317 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m3894(p000.mx0 r9, p000.yp0 r10, boolean r11) {
            yp0 r0 = r9.f7310
            boolean r1 = r10.f12742
            bq0 r2 = r10.f12734
            r3 = 0
            if (r1 == 0) goto Lb
            goto L122
        Lb:
            boolean r1 = m3899(r10)
            if (r1 == 0) goto L122
            r1 = 0
            if (r10 != r0) goto L1a
            yo r4 = r9.f7318
            r4.getClass()
            goto L1b
        L1a:
            r4 = r1
        L1b:
            wp0 r5 = p000.wp0.f11798
            r6 = 1
            if (r11 == 0) goto L81
            boolean r11 = r2.f1804
            if (r11 == 0) goto L29
            boolean r11 = m3895(r10, r4)
            goto L2a
        L29:
            r11 = r3
        L2a:
            if (r11 != 0) goto L30
            boolean r0 = r2.f1805
            if (r0 == 0) goto L11e
        L30:
            java.lang.Boolean r0 = r10.m6979()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L11e
            wp0 r0 = r10.f12730
            if (r0 != r5) goto L43
            r10.m6994()
        L43:
            jw0 r10 = r2.f1816
            r10.getClass()
            r10.f5601 = r6     // Catch: java.lang.Throwable -> L54
            boolean r0 = r10.f5605     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L56
            java.lang.String r0 = "replace() called on item that was not placed"
            p000.am0.m178(r0)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r9 = move-exception
            goto L7e
        L56:
            r10.f5599 = r3     // Catch: java.lang.Throwable -> L54
            hw0 r0 = r10.f5610     // Catch: java.lang.Throwable -> L54
            hw0 r1 = p000.hw0.f4830     // Catch: java.lang.Throwable -> L54
            if (r0 == r1) goto L5f
            goto L60
        L5f:
            r6 = r3
        L60:
            long r0 = r10.f5608     // Catch: java.lang.Throwable -> L54
            a80 r2 = r10.f5609     // Catch: java.lang.Throwable -> L54
            r10.m2995(r0, r2)     // Catch: java.lang.Throwable -> L54
            if (r6 == 0) goto L7a
            boolean r0 = r10.f5599     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L7a
            bq0 r0 = r10.f5600     // Catch: java.lang.Throwable -> L54
            yp0 r0 = r0.f1800     // Catch: java.lang.Throwable -> L54
            yp0 r0 = r0.m7005()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L7a
            r0.m6986(r3)     // Catch: java.lang.Throwable -> L54
        L7a:
            r10.f5601 = r3
            goto L11e
        L7e:
            r10.f5601 = r3
            throw r9
        L81:
            boolean r11 = r10.m7002()
            if (r11 == 0) goto L8c
            boolean r11 = m3896(r10, r4)
            goto L8d
        L8c:
            r11 = r3
        L8d:
            boolean r4 = r10.m7001()
            if (r4 == 0) goto L11e
            if (r10 == r0) goto La7
            yp0 r4 = r10.m7005()
            if (r4 == 0) goto L11e
            boolean r4 = r4.m6978()
            if (r4 != r6) goto L11e
            ox0 r4 = r2.f1815
            boolean r4 = r4.f8341
            if (r4 == 0) goto L11e
        La7:
            wp0 r4 = r10.f12730
            if (r10 != r0) goto Lce
            if (r4 != r5) goto Lb0
            r10.m6994()
        Lb0:
            yp0 r0 = r10.m7005()
            if (r0 == 0) goto Lc0
            k31 r0 = r0.f12733
            gm0 r0 = r0.f5726
            if (r0 == 0) goto Lc0
            ew0 r0 = r0.f3310
            if (r0 != 0) goto Lc8
        Lc0:
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.ln0.m3646(r10)
            bh1 r0 = r0.getPlacementScope()
        Lc8:
            ox0 r1 = r2.f1815
            p000.bh1.m960(r0, r1, r3, r3)
            goto L101
        Lce:
            if (r4 != r5) goto Ld3
            r10.m6994()
        Ld3:
            ox0 r0 = r2.f1815
            bq0 r2 = r0.f8329
            r0.f8330 = r6     // Catch: java.lang.Throwable -> Le3
            boolean r4 = r0.f8334     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto Le5
            java.lang.String r4 = "replace called on unplaced item"
            p000.am0.m178(r4)     // Catch: java.lang.Throwable -> Le3
            goto Le5
        Le3:
            r9 = move-exception
            goto L114
        Le5:
            boolean r4 = r0.f8340     // Catch: java.lang.Throwable -> Le3
            long r7 = r0.f8336     // Catch: java.lang.Throwable -> Le3
            a80 r5 = r0.f8337     // Catch: java.lang.Throwable -> Le3
            r0.m4333(r7, r5)     // Catch: java.lang.Throwable -> Le3
            if (r4 == 0) goto Lff
            boolean r4 = r0.f8324     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto Lff
            yp0 r4 = r2.f1800     // Catch: java.lang.Throwable -> Le3
            yp0 r4 = r4.m7005()     // Catch: java.lang.Throwable -> Le3
            if (r4 == 0) goto Lff
            r4.m6987(r3)     // Catch: java.lang.Throwable -> Le3
        Lff:
            r0.f8330 = r3
        L101:
            n5 r0 = r9.f7314
            r0.getClass()
            int r1 = r10.f12741
            if (r1 <= 0) goto L11e
            java.lang.Object r0 = r0.f7387
            k21 r0 = (p000.k21) r0
            r0.m3127(r10)
            r10.f12740 = r6
            goto L11e
        L114:
            yp0 r10 = r2.f1800     // Catch: java.lang.Throwable -> L11a
            r10.m6989(r9)     // Catch: java.lang.Throwable -> L11a
            throw r1     // Catch: java.lang.Throwable -> L11a
        L11a:
            r9 = move-exception
            r0.f8330 = r3
            throw r9
        L11e:
            r9.m3901()
            return r11
        L122:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m3895(p000.yp0 r5, p000.C1028yo r6) {
            yp0 r0 = r5.f12750
            bq0 r1 = r5.f12734
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            if (r6 == 0) goto L1a
            if (r0 == 0) goto L18
            jw0 r0 = r1.f1816
            r0.getClass()
            long r3 = r6.f12706
            boolean r6 = r0.m2996(r3)
            goto L2f
        L18:
            r6 = r2
            goto L2f
        L1a:
            jw0 r6 = r1.f1816
            if (r6 == 0) goto L21
            yo r1 = r6.f5607
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L18
            if (r0 == 0) goto L18
            r6.getClass()
            long r0 = r1.f12706
            boolean r6 = r6.m2996(r0)
        L2f:
            yp0 r0 = r5.m7005()
            if (r6 == 0) goto L57
            if (r0 == 0) goto L57
            yp0 r1 = r0.f12750
            r3 = 3
            if (r1 != 0) goto L40
            p000.yp0.m6968(r0, r2, r3)
            return r6
        L40:
            wp0 r1 = r5.m7004()
            wp0 r4 = p000.wp0.f11796
            if (r1 != r4) goto L4c
            p000.yp0.m6967(r0, r2, r3)
            return r6
        L4c:
            wp0 r5 = r5.m7004()
            wp0 r1 = p000.wp0.f11797
            if (r5 != r1) goto L57
            r0.m6986(r2)
        L57:
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m3896(p000.yp0 r4, p000.C1028yo r5) {
            if (r5 == 0) goto L16
            wp0 r0 = r4.f12730
            wp0 r1 = p000.wp0.f11798
            if (r0 != r1) goto Lb
            r4.m6993()
        Lb:
            bq0 r0 = r4.f12734
            ox0 r0 = r0.f1815
            long r1 = r5.f12706
            boolean r5 = r0.m4334(r1)
            goto L1a
        L16:
            boolean r5 = p000.yp0.m6966(r4)
        L1a:
            yp0 r0 = r4.m7005()
            if (r5 == 0) goto L3b
            if (r0 == 0) goto L3b
            wp0 r1 = r4.m7003()
            wp0 r2 = p000.wp0.f11796
            r3 = 0
            if (r1 != r2) goto L30
            r4 = 3
            p000.yp0.m6968(r0, r3, r4)
            return r5
        L30:
            wp0 r4 = r4.m7003()
            wp0 r1 = p000.wp0.f11797
            if (r4 != r1) goto L3b
            r0.m6987(r3)
        L3b:
            return r5
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m3897(p000.yp0 r3) {
            bq0 r0 = r3.f12734
            boolean r0 = r0.f1804
            if (r0 == 0) goto L20
            wp0 r0 = r3.m7004()
            wp0 r1 = p000.wp0.f11798
            r2 = 1
            if (r0 != r1) goto L1f
            bq0 r3 = r3.f12734
            jw0 r3 = r3.f1816
            if (r3 == 0) goto L20
            zp0 r3 = r3.f5611
            if (r3 == 0) goto L20
            boolean r3 = r3.m7221()
            if (r3 != r2) goto L20
        L1f:
            return r2
        L20:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m3898(p000.yp0 r2) {
            boolean r0 = r2.m7002()
            if (r0 == 0) goto L39
        L6:
            wp0 r0 = r2.m7003()
            wp0 r1 = p000.wp0.f11798
            if (r0 != r1) goto L2a
            bq0 r0 = r2.f12734
            ox0 r0 = r0.f1815
            zp0 r0 = r0.f8316
            boolean r0 = r0.m7221()
            if (r0 != 0) goto L2a
            yp0 r0 = r2.m7005()
            if (r0 == 0) goto L25
            bq0 r0 = r0.f12734
            up0 r0 = r0.f1803
            goto L26
        L25:
            r0 = 0
        L26:
            up0 r1 = p000.up0.f10919
            if (r0 != r1) goto L39
        L2a:
            yp0 r2 = r2.m7005()
            if (r2 != 0) goto L31
            goto L39
        L31:
            boolean r0 = r2.m6978()
            if (r0 == 0) goto L6
            r2 = 1
            return r2
        L39:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m3899(p000.yp0 r4) {
            bq0 r0 = r4.f12734
            boolean r1 = r4.m6978()
            r2 = 1
            if (r1 != 0) goto L42
            ox0 r1 = r0.f1815
            boolean r1 = r1.f8341
            if (r1 != 0) goto L42
            boolean r1 = m3898(r4)
            if (r1 != 0) goto L42
            java.lang.Boolean r1 = r4.m6979()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L42
            boolean r4 = m3897(r4)
            if (r4 != 0) goto L42
            ox0 r4 = r0.f1815
            zp0 r4 = r4.f8316
            boolean r4 = r4.m7221()
            if (r4 != 0) goto L42
            jw0 r4 = r0.f1816
            if (r4 == 0) goto L40
            zp0 r4 = r4.f5611
            if (r4 == 0) goto L40
            boolean r4 = r4.m7221()
            if (r4 != r2) goto L40
            goto L42
        L40:
            r4 = 0
            return r4
        L42:
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final void m3900(boolean r3) {
            r2 = this;
            n5 r0 = r2.f7314
            if (r3 == 0) goto L17
            java.lang.Object r3 = r0.f7387
            k21 r3 = (p000.k21) r3
            yp0 r2 = r2.f7310
            int r1 = r2.f12741
            if (r1 <= 0) goto L17
            r3.m3132()
            r3.m3127(r2)
            r3 = 1
            r2.f12740 = r3
        L17:
            java.lang.Object r2 = r0.f7387
            k21 r2 = (p000.k21) r2
            int r2 = r2.f5718
            if (r2 == 0) goto L30
            java.lang.String r2 = "Compose:onPositionedCallbacks"
            android.os.Trace.beginSection(r2)
            r0.m3986()     // Catch: java.lang.Throwable -> L2b
            android.os.Trace.endSection()
            return
        L2b:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L30:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m3901() {
            r7 = this;
            k21 r7 = r7.f7317
            int r0 = r7.f5718
            if (r0 == 0) goto L2d
            java.lang.Object[] r1 = r7.f5716
            r2 = 0
        L9:
            if (r2 >= r0) goto L2a
            r3 = r1[r2]
            lx0 r3 = (p000.lx0) r3
            yp0 r4 = r3.f6834
            boolean r4 = r4.m6977()
            if (r4 == 0) goto L27
            boolean r4 = r3.f6835
            yp0 r5 = r3.f6834
            boolean r3 = r3.f6836
            r6 = 2
            if (r4 != 0) goto L24
            p000.yp0.m6968(r5, r3, r6)
            goto L27
        L24:
            p000.yp0.m6967(r5, r3, r6)
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            r7.m3132()
        L2d:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3902(p000.yp0 r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.f7312
            if (r0 != 0) goto L9
            java.lang.String r0 = "forceMeasureTheSubtree should be executed during the measureAndLayout pass"
            p000.am0.m178(r0)
        L9:
            if (r3 == 0) goto L10
            bq0 r0 = r2.f12734
            boolean r0 = r0.f1804
            goto L14
        L10:
            boolean r0 = r2.m7002()
        L14:
            if (r0 == 0) goto L1b
            java.lang.String r0 = "node not yet measured"
            p000.am0.m177(r0)
        L1b:
            r1.m3903(r2, r3)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m3903(p000.yp0 r11, boolean r12) {
            r10 = this;
            k21 r0 = r11.m7009()
            java.lang.Object[] r1 = r0.f5716
            int r0 = r0.f5718
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto La5
            r4 = r1[r3]
            yp0 r4 = (p000.yp0) r4
            wp0 r5 = p000.wp0.f11796
            r6 = 1
            if (r12 != 0) goto L28
            wp0 r7 = r4.m7003()
            if (r7 == r5) goto L40
            bq0 r7 = r4.f12734
            ox0 r7 = r7.f1815
            zp0 r7 = r7.f8316
            boolean r7 = r7.m7221()
            if (r7 == 0) goto L28
            goto L40
        L28:
            if (r12 == 0) goto La1
            wp0 r7 = r4.m7004()
            if (r7 == r5) goto L40
            bq0 r5 = r4.f12734
            jw0 r5 = r5.f1816
            if (r5 == 0) goto La1
            zp0 r5 = r5.f5611
            if (r5 == 0) goto La1
            boolean r5 = r5.m7221()
            if (r5 != r6) goto La1
        L40:
            boolean r5 = p000.AbstractC1021yh.m6870(r4)
            bq0 r7 = r4.f12734
            if (r5 == 0) goto L85
            if (r12 != 0) goto L85
            boolean r5 = r7.f1804
            if (r5 == 0) goto L82
            m6 r5 = r10.f7311
            r5.getClass()
            yp0 r8 = r4.f12750
            if (r8 != 0) goto L59
            r8 = r6
            goto L5a
        L59:
            r8 = r2
        L5a:
            java.lang.Object r9 = r5.f6967
            n r9 = (p000.C0568n) r9
            java.lang.Object r9 = r9.f7336
            qx1 r9 = (p000.qx1) r9
            boolean r9 = r9.contains(r4)
            if (r9 != 0) goto L79
            java.lang.Object r5 = r5.f6968
            n r5 = (p000.C0568n) r5
            java.lang.Object r5 = r5.f7336
            qx1 r5 = (p000.qx1) r5
            boolean r5 = r5.contains(r4)
            if (r5 == 0) goto L77
            goto L79
        L77:
            r5 = r2
            goto L7a
        L79:
            r5 = r6
        L7a:
            if (r8 != 0) goto L82
            if (r5 == 0) goto L82
            r10.m3906(r4, r6)
            goto L85
        L82:
            r10.m3902(r4, r6)
        L85:
            if (r12 == 0) goto L8a
            boolean r5 = r7.f1804
            goto L8e
        L8a:
            boolean r5 = r4.m7002()
        L8e:
            if (r5 == 0) goto L93
            r10.m3906(r4, r12)
        L93:
            if (r12 == 0) goto L98
            boolean r5 = r7.f1804
            goto L9c
        L98:
            boolean r5 = r4.m7002()
        L9c:
            if (r5 != 0) goto La1
            r10.m3903(r4, r12)
        La1:
            int r3 = r3 + 1
            goto La
        La5:
            if (r12 == 0) goto Lac
            bq0 r0 = r11.f12734
            boolean r0 = r0.f1804
            goto Lb0
        Lac:
            boolean r0 = r11.m7002()
        Lb0:
            if (r0 == 0) goto Lb5
            r10.m3906(r11, r12)
        Lb5:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m3904(p000.C0967x0 r17) {
            r16 = this;
            r1 = r16
            m6 r0 = r1.f7311
            yp0 r2 = r1.f7310
            boolean r3 = r2.m6977()
            if (r3 != 0) goto L11
            java.lang.String r3 = "performMeasureAndLayout called with unattached root"
            p000.am0.m177(r3)
        L11:
            boolean r3 = r2.m6978()
            if (r3 != 0) goto L1c
            java.lang.String r3 = "performMeasureAndLayout called with unplaced root"
            p000.am0.m177(r3)
        L1c:
            boolean r3 = r1.f7312
            if (r3 == 0) goto L25
            java.lang.String r3 = "performMeasureAndLayout called during measure layout"
            p000.am0.m177(r3)
        L25:
            yo r3 = r1.f7318
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lda
            r1.f7312 = r5
            r1.f7313 = r5
            boolean r3 = r0.m3762()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r6 = r0.f6967
            n r6 = (p000.C0568n) r6
            if (r3 == 0) goto Lcd
            r3 = r4
        L3a:
            java.lang.Object r7 = r0.f6969     // Catch: java.lang.Throwable -> L62
            n r7 = (p000.C0568n) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r0.f6968     // Catch: java.lang.Throwable -> L62
            n r8 = (p000.C0568n) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r9 = r6.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r9 = (p000.qx1) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L65
            java.lang.Object r7 = r6.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r7 = (p000.qx1) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            yp0 r7 = (p000.yp0) r7     // Catch: java.lang.Throwable -> L62
            r6.m3922(r7)     // Catch: java.lang.Throwable -> L62
            yp0 r8 = r7.f12750     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L5f
            r8 = r5
            goto L60
        L5f:
            r8 = r4
        L60:
            r9 = r4
            goto L9f
        L62:
            r0 = move-exception
            goto Ld3
        L65:
            java.lang.Object r9 = r8.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r9 = (p000.qx1) r9     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L85
            java.lang.Object r7 = r8.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r7 = (p000.qx1) r7     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r7.first()     // Catch: java.lang.Throwable -> L62
            yp0 r7 = (p000.yp0) r7     // Catch: java.lang.Throwable -> L62
            r8.m3922(r7)     // Catch: java.lang.Throwable -> L62
            yp0 r8 = r7.f12750     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L82
            r8 = r5
            goto L83
        L82:
            r8 = r4
        L83:
            r9 = r5
            goto L9f
        L85:
            java.lang.Object r8 = r7.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r8 = (p000.qx1) r8     // Catch: java.lang.Throwable -> L62
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto Lc7
            java.lang.Object r8 = r7.f7336     // Catch: java.lang.Throwable -> L62
            qx1 r8 = (p000.qx1) r8     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.first()     // Catch: java.lang.Throwable -> L62
            yp0 r8 = (p000.yp0) r8     // Catch: java.lang.Throwable -> L62
            r7.m3922(r8)     // Catch: java.lang.Throwable -> L62
            r9 = r5
            r7 = r8
            r8 = r4
        L9f:
            if (r9 == 0) goto La6
            boolean r8 = m3894(r1, r7, r8)     // Catch: java.lang.Throwable -> L62
            goto Lc0
        La6:
            boolean r8 = r1.m3906(r7, r8)     // Catch: java.lang.Throwable -> L62
            bq0 r9 = r7.f12734     // Catch: java.lang.Throwable -> L62
            boolean r9 = r9.f1805     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lb5
            qn0 r9 = p000.qn0.f9053     // Catch: java.lang.Throwable -> L62
            r0.m3781(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lb5:
            boolean r9 = r7.m7001()     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto Lc0
            qn0 r9 = p000.qn0.f9055     // Catch: java.lang.Throwable -> L62
            r0.m3781(r7, r9)     // Catch: java.lang.Throwable -> L62
        Lc0:
            if (r7 != r2) goto L3a
            if (r8 == 0) goto L3a
            r3 = r5
            goto L3a
        Lc7:
            if (r17 == 0) goto Lce
            r17.invoke()     // Catch: java.lang.Throwable -> L62
            goto Lce
        Lcd:
            r3 = r4
        Lce:
            r1.f7312 = r4
            r1.f7313 = r4
            goto Ldb
        Ld3:
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r0 = move-exception
            r1.f7312 = r4
            r1.f7313 = r4
            throw r0
        Lda:
            r3 = r4
        Ldb:
            k21 r0 = r1.f7315
            java.lang.Object[] r1 = r0.f5716
            int r2 = r0.f5718
            r6 = r4
        Le2:
            if (r6 >= r2) goto L16a
            r7 = r1[r6]
            yp0 r7 = (p000.yp0) r7
            k31 r7 = r7.f12733
            gm0 r8 = r7.f5726
            r9 = 4194304(0x400000, float:5.877472E-39)
            boolean r10 = p000.r31.m5060(r9)
            if (r10 == 0) goto Lf7
            q22 r11 = r8.f4419
            goto Lff
        Lf7:
            q22 r11 = r8.f4419
            q01 r11 = r11.f8775
            if (r11 != 0) goto Lff
            goto L165
        Lff:
            io1 r12 = p000.q31.f8818
            q01 r8 = r8.m4739(r10)
        L105:
            if (r8 == 0) goto L165
            int r10 = r8.f8774
            r10 = r10 & r9
            if (r10 == 0) goto L165
            int r10 = r8.f8773
            r10 = r10 & r9
            if (r10 == 0) goto L15f
            r10 = 0
            r12 = r8
            r13 = r10
        L114:
            if (r12 == 0) goto L15f
            boolean r14 = r12 instanceof p000.kp0
            if (r14 == 0) goto L122
            kp0 r12 = (p000.kp0) r12
            gm0 r14 = r7.f5726
            r12.mo1132(r14)
            goto L15a
        L122:
            int r14 = r12.f8773
            r14 = r14 & r9
            if (r14 == 0) goto L15a
            boolean r14 = r12 instanceof p000.C1014ya
            if (r14 == 0) goto L15a
            r14 = r12
            ya r14 = (p000.C1014ya) r14
            q01 r14 = r14.f12512
            r15 = r4
        L131:
            if (r14 == 0) goto L156
            int r4 = r14.f8773
            r4 = r4 & r9
            if (r4 == 0) goto L152
            int r15 = r15 + 1
            if (r15 != r5) goto L13e
            r12 = r14
            goto L152
        L13e:
            if (r13 != 0) goto L149
            k21 r13 = new k21
            r4 = 16
            q01[] r4 = new p000.q01[r4]
            r13.<init>(r4)
        L149:
            if (r12 == 0) goto L14f
            r13.m3127(r12)
            r12 = r10
        L14f:
            r13.m3127(r14)
        L152:
            q01 r14 = r14.f8776
            r4 = 0
            goto L131
        L156:
            if (r15 != r5) goto L15a
        L158:
            r4 = 0
            goto L114
        L15a:
            q01 r12 = p000.h62.m2387(r13)
            goto L158
        L15f:
            if (r8 == r11) goto L165
            q01 r8 = r8.f8776
            r4 = 0
            goto L105
        L165:
            int r6 = r6 + 1
            r4 = 0
            goto Le2
        L16a:
            r0.m3132()
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public final void m3905() {
            r5 = this;
            m6 r0 = r5.f7311
            boolean r1 = r0.m3762()
            if (r1 == 0) goto L70
            yp0 r1 = r5.f7310
            boolean r2 = r1.m6977()
            if (r2 != 0) goto L15
            java.lang.String r2 = "performMeasureAndLayout called with unattached root"
            p000.am0.m177(r2)
        L15:
            boolean r2 = r1.m6978()
            if (r2 != 0) goto L20
            java.lang.String r2 = "performMeasureAndLayout called with unplaced root"
            p000.am0.m177(r2)
        L20:
            boolean r2 = r5.f7312
            if (r2 == 0) goto L29
            java.lang.String r2 = "performMeasureAndLayout called during measure layout"
            p000.am0.m177(r2)
        L29:
            yo r2 = r5.f7318
            if (r2 == 0) goto L70
            r2 = 1
            r5.f7312 = r2
            r3 = 0
            r5.f7313 = r3
            java.lang.Object r4 = r0.f6969     // Catch: java.lang.Throwable -> L5c
            n r4 = (p000.C0568n) r4     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r4 = r4.f7336     // Catch: java.lang.Throwable -> L5c
            qx1 r4 = (p000.qx1) r4     // Catch: java.lang.Throwable -> L5c
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r4 != 0) goto L51
            java.lang.Object r0 = r0.f6967     // Catch: java.lang.Throwable -> L5c
            n r0 = (p000.C0568n) r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.f7336     // Catch: java.lang.Throwable -> L5c
            qx1 r0 = (p000.qx1) r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = r3
        L52:
            if (r0 == 0) goto L61
            yp0 r0 = r1.f12750     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5e
            r5.m3908(r1, r2)     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r0 = move-exception
            goto L69
        L5e:
            r5.m3907(r1)     // Catch: java.lang.Throwable -> L5c
        L61:
            r5.m3908(r1, r3)     // Catch: java.lang.Throwable -> L5c
            r5.f7312 = r3
            r5.f7313 = r3
            return
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r5.f7312 = r3
            r5.f7313 = r3
            throw r0
        L70:
            return
    }

    /* JADX INFO: renamed from: ν */
    public final boolean m3906(p000.yp0 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3.f12742
            r1 = 0
            if (r0 == 0) goto L6
            goto L31
        L6:
            boolean r0 = m3899(r3)
            if (r0 == 0) goto L31
            yp0 r0 = r2.f7310
            if (r3 != r0) goto L16
            yo r0 = r2.f7318
            r0.getClass()
            goto L17
        L16:
            r0 = 0
        L17:
            if (r4 == 0) goto L24
            bq0 r4 = r3.f12734
            boolean r4 = r4.f1804
            if (r4 == 0) goto L2e
            boolean r1 = m3895(r3, r0)
            goto L2e
        L24:
            boolean r4 = r3.m7002()
            if (r4 == 0) goto L2e
            boolean r1 = m3896(r3, r0)
        L2e:
            r2.m3901()
        L31:
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public final void m3907(p000.yp0 r6) {
            r5 = this;
            k21 r6 = r6.m7009()
            java.lang.Object[] r0 = r6.f5716
            int r6 = r6.f5718
            r1 = 0
        L9:
            if (r1 >= r6) goto L34
            r2 = r0[r1]
            yp0 r2 = (p000.yp0) r2
            wp0 r3 = r2.m7003()
            wp0 r4 = p000.wp0.f11796
            if (r3 == r4) goto L23
            bq0 r3 = r2.f12734
            ox0 r3 = r3.f1815
            zp0 r3 = r3.f8316
            boolean r3 = r3.m7221()
            if (r3 == 0) goto L31
        L23:
            boolean r3 = p000.AbstractC1021yh.m6870(r2)
            if (r3 == 0) goto L2e
            r3 = 1
            r5.m3908(r2, r3)
            goto L31
        L2e:
            r5.m3907(r2)
        L31:
            int r1 = r1 + 1
            goto L9
        L34:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m3908(p000.yp0 r2, boolean r3) {
            r1 = this;
            boolean r0 = r2.f12742
            if (r0 == 0) goto L5
            return
        L5:
            yp0 r0 = r1.f7310
            if (r2 != r0) goto Lf
            yo r1 = r1.f7318
            r1.getClass()
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r3 == 0) goto L16
            m3895(r2, r1)
            return
        L16:
            m3896(r2, r1)
            return
    }

    /* JADX INFO: renamed from: π */
    public final boolean m3909(p000.yp0 r5, boolean r6) {
            r4 = this;
            bq0 r0 = r5.f12734
            up0 r0 = r0.f1803
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L5f
            r2 = 1
            if (r0 == r2) goto L5f
            r3 = 2
            if (r0 == r3) goto L55
            r3 = 3
            if (r0 == r3) goto L55
            r3 = 4
            if (r0 != r3) goto L50
            boolean r0 = r5.m7002()
            if (r0 == 0) goto L20
            if (r6 != 0) goto L20
            goto L5f
        L20:
            bq0 r6 = r5.f12734
            ox0 r6 = r6.f1815
            r6.f8342 = r2
            boolean r6 = r5.f12742
            if (r6 == 0) goto L2b
            goto L5f
        L2b:
            boolean r6 = r5.m6978()
            if (r6 != 0) goto L37
            boolean r6 = m3898(r5)
            if (r6 == 0) goto L5f
        L37:
            yp0 r6 = r5.m7005()
            if (r6 == 0) goto L44
            boolean r6 = r6.m7002()
            if (r6 != r2) goto L44
            goto L4b
        L44:
            m6 r6 = r4.f7311
            qn0 r0 = p000.qn0.f9054
            r6.m3781(r5, r0)
        L4b:
            boolean r4 = r4.f7313
            if (r4 != 0) goto L5f
            return r2
        L50:
            p000.C1080.m7272()
            r4 = 0
            return r4
        L55:
            lx0 r0 = new lx0
            r0.<init>(r5, r1, r6)
            k21 r4 = r4.f7317
            r4.m3127(r0)
        L5f:
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public final void m3910(long r3) {
            r2 = this;
            yo r0 = r2.f7318
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            long r0 = r0.f12706
            boolean r0 = p000.C1028yo.m6947(r0, r3)
        Lc:
            if (r0 != 0) goto L39
            boolean r0 = r2.f7312
            if (r0 == 0) goto L17
            java.lang.String r0 = "updateRootConstraints called while measuring"
            p000.am0.m177(r0)
        L17:
            yo r0 = new yo
            r0.<init>(r3)
            r2.f7318 = r0
            yp0 r3 = r2.f7310
            yp0 r4 = r3.f12750
            bq0 r0 = r3.f12734
            r1 = 1
            if (r4 == 0) goto L29
            r0.f1804 = r1
        L29:
            ox0 r0 = r0.f1815
            r0.f8342 = r1
            if (r4 == 0) goto L32
            qn0 r4 = p000.qn0.f9052
            goto L34
        L32:
            qn0 r4 = p000.qn0.f9054
        L34:
            m6 r2 = r2.f7311
            r2.m3781(r3, r4)
        L39:
            return
    }
}
