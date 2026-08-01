package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class om0 extends p000.wb2 implements java.lang.Runnable, p000.v41, android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ζ */
    public boolean f8150;

    /* JADX INFO: renamed from: η */
    public int f8151;

    /* JADX INFO: renamed from: θ */
    public p000.oc2 f8152;

    /* JADX INFO: renamed from: ι */
    public final p000.b21 f8153;

    /* JADX INFO: renamed from: κ */
    public final p000.u91 f8154;

    /* JADX INFO: renamed from: λ */
    public final p000.v11 f8155;

    /* JADX INFO: renamed from: μ */
    public final p000.ix1 f8156;

    public om0() {
            r4 = this;
            r0 = 1
            r4.<init>(r0)
            b21 r0 = new b21
            r1 = 9
            r0.<init>(r1)
            pc2 r1 = p000.qc2.f8962
            r1.getClass()
            rc2 r1 = p000.pc2.f8493
            ed2 r2 = new ed2
            java.lang.String r3 = "caption bar"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8494
            ed2 r2 = new ed2
            java.lang.String r3 = "display cutout"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8495
            ed2 r2 = new ed2
            java.lang.String r3 = "ime"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8496
            ed2 r2 = new ed2
            java.lang.String r3 = "mandatory system gestures"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8497
            ed2 r2 = new ed2
            java.lang.String r3 = "navigation bars"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8498
            ed2 r2 = new ed2
            java.lang.String r3 = "status bars"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8499
            ed2 r2 = new ed2
            java.lang.String r3 = "system gestures"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8500
            ed2 r2 = new ed2
            java.lang.String r3 = "tappable element"
            r2.<init>(r3)
            r0.m701(r1, r2)
            rc2 r1 = p000.pc2.f8501
            ed2 r2 = new ed2
            java.lang.String r3 = "waterfall"
            r2.<init>(r3)
            r0.m701(r1, r2)
            r4.f8153 = r0
            u91 r0 = new u91
            r1 = 0
            r0.<init>(r1)
            r4.f8154 = r0
            v11 r0 = new v11
            r1 = 4
            r0.<init>(r1)
            r4.f8155 = r0
            ix1 r0 = new ix1
            r0.<init>()
            r4.f8156 = r0
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lb
            android.view.View r0 = (android.view.View) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r3 = r0
        L10:
            java.util.WeakHashMap r0 = p000.b92.f1572
            p000.u82.m5827(r3, r2)
            xb2 r0 = new xb2
            r0.<init>(r2)
            r3.setWindowInsetsAnimationCallback(r0)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            android.view.ViewParent r2 = r3.getParent()
            boolean r0 = r2 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r2 = (android.view.View) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 != 0) goto L10
            goto L11
        L10:
            r3 = r2
        L11:
            java.util.WeakHashMap r2 = p000.b92.f1572
            p000.u82.m5827(r3, r1)
            r3.setWindowInsetsAnimationCallback(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            boolean r0 = r1.f8150
            if (r0 == 0) goto L13
            r0 = 0
            r1.f8151 = r0
            r1.f8150 = r0
            oc2 r0 = r1.f8152
            if (r0 == 0) goto L13
            r1.m4255(r0)
            r0 = 0
            r1.f8152 = r0
        L13:
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: α */
    public final void mo2608(p000.yb2 r6) {
            r5 = this;
            r0 = 0
            r5.f8150 = r0
            y21 r6 = r6.f12555
            java.lang.Object r6 = r6.f12428
            android.view.WindowInsetsAnimation r6 = (android.view.WindowInsetsAnimation) r6
            int r6 = r6.getTypeMask()
            int r1 = r5.f8151
            int r2 = ~r6
            r1 = r1 & r2
            r5.f8151 = r1
            r1 = 0
            r5.f8152 = r1
            n11 r1 = p000.sc2.f9834
            java.lang.Object r6 = r1.m5525(r6)
            qc2 r6 = (p000.qc2) r6
            if (r6 == 0) goto L76
            b21 r1 = r5.f8153
            java.lang.Object r6 = r1.m695(r6)
            r6.getClass()
            ed2 r6 = (p000.ed2) r6
            t91 r1 = r6.f3505
            r2 = 0
            r1.m5622(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            t91 r3 = r6.f3507
            r3.m5622(r1)
            r3 = 0
            v91 r1 = r6.f3506
            r1.m6141(r3)
            t91 r1 = r6.f3505
            r1.m5622(r2)
            x91 r1 = r6.f3504
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            r1 = -1
            r6.f3512 = r1
            r6.f3513 = r1
            u91 r5 = r5.f8154
            int r6 = r5.m5837()
            r1 = 1
            int r6 = r6 + r1
            r5.m5838(r6)
            java.lang.Object r5 = p000.ax1.f1362
            monitor-enter(r5)
            sa0 r6 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L73
            c21 r6 = r6.f3730     // Catch: java.lang.Throwable -> L73
            if (r6 == 0) goto L6c
            boolean r6 = r6.m1114()     // Catch: java.lang.Throwable -> L73
            if (r6 != r1) goto L6c
            r0 = r1
        L6c:
            monitor-exit(r5)
            if (r0 == 0) goto L76
            p000.ax1.m619()
            return
        L73:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L76:
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: β */
    public final void mo2609(p000.yb2 r1) {
            r0 = this;
            r1 = 1
            r0.f8150 = r1
            return
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: γ */
    public final p000.oc2 mo2610(p000.oc2 r7, java.util.List r8) {
            r6 = this;
            int r0 = r8.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L62
            java.lang.Object r2 = r8.get(r1)
            yb2 r2 = (p000.yb2) r2
            y21 r3 = r2.f12555
            java.lang.Object r3 = r3.f12428
            android.view.WindowInsetsAnimation r3 = (android.view.WindowInsetsAnimation) r3
            int r3 = r3.getTypeMask()
            n11 r4 = p000.sc2.f9834
            java.lang.Object r3 = r4.m5525(r3)
            qc2 r3 = (p000.qc2) r3
            if (r3 == 0) goto L5f
            b21 r4 = r6.f8153
            java.lang.Object r3 = r4.m695(r3)
            r3.getClass()
            ed2 r3 = (p000.ed2) r3
            x91 r4 = r3.f3504
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5f
            y21 r2 = r2.f12555
            java.lang.Object r4 = r2.f12428
            android.view.WindowInsetsAnimation r4 = (android.view.WindowInsetsAnimation) r4
            java.lang.Object r2 = r2.f12428
            android.view.WindowInsetsAnimation r2 = (android.view.WindowInsetsAnimation) r2
            float r4 = r4.getInterpolatedFraction()
            t91 r5 = r3.f3505
            r5.m5622(r4)
            float r4 = r2.getAlpha()
            t91 r5 = r3.f3507
            r5.m5622(r4)
            long r4 = r2.getDurationMillis()
            v91 r2 = r3.f3506
            r2.m6141(r4)
        L5f:
            int r1 = r1 + 1
            goto L5
        L62:
            r6.m4255(r7)
            return r7
    }

    @Override // p000.wb2
    /* JADX INFO: renamed from: δ */
    public final p000.cw1 mo2611(p000.yb2 r9, p000.cw1 r10) {
            r8 = this;
            oc2 r0 = r8.f8152
            r1 = 0
            r8.f8150 = r1
            r2 = 0
            r8.f8152 = r2
            y21 r2 = r9.f12555
            java.lang.Object r2 = r2.f12428
            android.view.WindowInsetsAnimation r2 = (android.view.WindowInsetsAnimation) r2
            long r2 = r2.getDurationMillis()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Lbd
            if (r0 == 0) goto Lbd
            y21 r2 = r9.f12555
            java.lang.Object r2 = r2.f12428
            android.view.WindowInsetsAnimation r2 = (android.view.WindowInsetsAnimation) r2
            int r2 = r2.getTypeMask()
            int r3 = r8.f8151
            r3 = r3 | r2
            r8.f8151 = r3
            n11 r3 = p000.sc2.f9834
            java.lang.Object r3 = r3.m5525(r2)
            qc2 r3 = (p000.qc2) r3
            if (r3 == 0) goto Lbd
            b21 r4 = r8.f8153
            java.lang.Object r3 = r4.m695(r3)
            r3.getClass()
            ed2 r3 = (p000.ed2) r3
            lc2 r0 = r0.f8033
            nm0 r0 = r0.mo1906(r2)
            int r2 = r0.f7674
            long r4 = (long) r2
            r2 = 48
            long r4 = r4 << r2
            int r2 = r0.f7675
            long r6 = (long) r2
            r2 = 32
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r2 = r0.f7676
            long r6 = (long) r2
            r2 = 16
            long r6 = r6 << r2
            long r4 = r4 | r6
            int r0 = r0.f7677
            long r6 = (long) r0
            long r4 = r4 | r6
            long r6 = r3.f3510
            boolean r0 = p000.j81.m2914(r4, r6)
            if (r0 != 0) goto Lbd
            r3.f3512 = r6
            r3.f3513 = r4
            x91 r0 = r3.f3504
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            y21 r9 = r9.f12555
            java.lang.Object r0 = r9.f12428
            android.view.WindowInsetsAnimation r0 = (android.view.WindowInsetsAnimation) r0
            float r0 = r0.getInterpolatedFraction()
            t91 r2 = r3.f3505
            r2.m5622(r0)
            java.lang.Object r0 = r9.f12428
            android.view.WindowInsetsAnimation r0 = (android.view.WindowInsetsAnimation) r0
            float r0 = r0.getAlpha()
            t91 r2 = r3.f3507
            r2.m5622(r0)
            java.lang.Object r9 = r9.f12428
            android.view.WindowInsetsAnimation r9 = (android.view.WindowInsetsAnimation) r9
            long r4 = r9.getDurationMillis()
            v91 r9 = r3.f3506
            r9.m6141(r4)
            u91 r8 = r8.f8154
            int r9 = r8.m5837()
            r0 = 1
            int r9 = r9 + r0
            r8.m5838(r9)
            java.lang.Object r8 = p000.ax1.f1362
            monitor-enter(r8)
            sa0 r9 = p000.ax1.f1369     // Catch: java.lang.Throwable -> Lba
            c21 r9 = r9.f3730     // Catch: java.lang.Throwable -> Lba
            if (r9 == 0) goto Lb3
            boolean r9 = r9.m1114()     // Catch: java.lang.Throwable -> Lba
            if (r9 != r0) goto Lb3
            r1 = r0
        Lb3:
            monitor-exit(r8)
            if (r1 == 0) goto Lbd
            p000.ax1.m619()
            return r10
        Lba:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        Lbd:
            return r10
    }

    /* JADX INFO: renamed from: ε */
    public final void m4255(p000.oc2 r28) {
            r27 = this;
            r0 = r27
            r1 = r28
            n11 r2 = p000.sc2.f9834
            int[] r3 = r2.f9963
            java.lang.Object[] r4 = r2.f9964
            long[] r2 = r2.f9962
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L114
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 16
            r17 = 32
        L18:
            r6 = r2[r13]
            r18 = 1
            long r11 = ~r6
            r19 = 7
            long r11 = r11 << r19
            long r11 = r11 & r6
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r19
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 == 0) goto L102
            int r11 = r13 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r8 = 0
            r19 = 48
        L39:
            if (r8 >= r11) goto Lf9
            r20 = 255(0xff, double:1.26E-321)
            long r20 = r6 & r20
            r22 = 128(0x80, double:6.3E-322)
            int r20 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r20 >= 0) goto Le5
            int r20 = r13 << 3
            int r20 = r20 + r8
            r12 = r3[r20]
            r20 = r4[r20]
            r9 = r20
            qc2 r9 = (p000.qc2) r9
            lc2 r10 = r1.f8033
            nm0 r10 = r10.mo1906(r12)
            r20 = r2
            int r2 = r10.f7674
            r24 = r3
            long r2 = (long) r2
            long r2 = r2 << r19
            r25 = r2
            int r2 = r10.f7675
            long r2 = (long) r2
            long r2 = r2 << r17
            long r2 = r25 | r2
            r25 = r2
            int r2 = r10.f7676
            long r2 = (long) r2
            long r2 = r2 << r16
            long r2 = r25 | r2
            int r10 = r10.f7677
            r25 = r2
            long r2 = (long) r10
            long r2 = r25 | r2
            b21 r10 = r0.f8153
            java.lang.Object r9 = r10.m695(r9)
            r9.getClass()
            ed2 r9 = (p000.ed2) r9
            r25 = r6
            long r6 = r9.f3510
            boolean r6 = p000.j81.m2914(r2, r6)
            if (r6 != 0) goto L9b
            r9.f3510 = r2
            r6 = 0
            boolean r2 = p000.j81.m2914(r2, r6)
            r14 = r18
            if (r2 != 0) goto L9b
            r15 = r14
        L9b:
            r2 = 8
            if (r12 == r2) goto Ld2
            lc2 r2 = r1.f8033
            nm0 r2 = r2.mo1907(r12)
            int r3 = r2.f7674
            long r6 = (long) r3
            long r6 = r6 << r19
            int r3 = r2.f7675
            r10 = r4
            long r3 = (long) r3
            long r3 = r3 << r17
            long r3 = r3 | r6
            int r6 = r2.f7676
            long r6 = (long) r6
            long r6 = r6 << r16
            long r3 = r3 | r6
            int r2 = r2.f7677
            long r6 = (long) r2
            long r2 = r3 | r6
            long r6 = r9.f3511
            boolean r4 = p000.j81.m2914(r6, r2)
            if (r4 != 0) goto Ld3
            r9.f3511 = r2
            r6 = 0
            boolean r2 = p000.j81.m2914(r2, r6)
            r14 = r18
            if (r2 != 0) goto Ld3
            r15 = r14
            goto Ld3
        Ld2:
            r10 = r4
        Ld3:
            lc2 r2 = r1.f8033
            boolean r2 = r2.mo1911(r12)
            x91 r3 = r9.f3503
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.setValue(r2)
            r2 = 8
            goto Led
        Le5:
            r20 = r2
            r24 = r3
            r10 = r4
            r25 = r6
            r2 = r12
        Led:
            long r6 = r25 >> r2
            int r8 = r8 + 1
            r12 = r2
            r4 = r10
            r2 = r20
            r3 = r24
            goto L39
        Lf9:
            r20 = r2
            r24 = r3
            r10 = r4
            r2 = r12
            if (r11 != r2) goto L11e
            goto L109
        L102:
            r20 = r2
            r24 = r3
            r10 = r4
            r19 = 48
        L109:
            if (r13 == r5) goto L11e
            int r13 = r13 + 1
            r4 = r10
            r2 = r20
            r3 = r24
            goto L18
        L114:
            r16 = 16
            r17 = 32
            r18 = 1
            r19 = 48
            r14 = 0
            r15 = 0
        L11e:
            lc2 r1 = r1.f8033
            mt r1 = r1.mo2297()
            if (r1 != 0) goto L129
            r6 = 0
            goto L149
        L129:
            android.view.DisplayCutout r2 = r1.f7267
            android.graphics.Insets r2 = r2.getWaterfallInsets()
            nm0 r2 = p000.nm0.m4081(r2)
            int r3 = r2.f7674
            long r3 = (long) r3
            long r3 = r3 << r19
            int r5 = r2.f7675
            long r5 = (long) r5
            long r5 = r5 << r17
            long r3 = r3 | r5
            int r5 = r2.f7676
            long r5 = (long) r5
            long r5 = r5 << r16
            long r3 = r3 | r5
            int r2 = r2.f7677
            long r5 = (long) r2
            long r6 = r3 | r5
        L149:
            b21 r2 = r0.f8153
            pc2 r3 = p000.qc2.f8962
            r3.getClass()
            rc2 r3 = p000.pc2.f8501
            java.lang.Object r2 = r2.m695(r3)
            r2.getClass()
            ed2 r2 = (p000.ed2) r2
            r3 = 0
            boolean r5 = p000.j81.m2914(r6, r3)
            r5 = r5 ^ 1
            x91 r8 = r2.f3503
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8.setValue(r5)
            long r8 = r2.f3510
            boolean r5 = p000.j81.m2914(r8, r6)
            if (r5 != 0) goto L181
            r2.f3510 = r6
            r2.f3511 = r6
            boolean r2 = p000.j81.m2914(r6, r3)
            r14 = r18
            if (r2 != 0) goto L181
            r15 = r14
        L181:
            if (r1 != 0) goto L195
            v11 r1 = r0.f8155
            int r2 = r1.f11065
            if (r2 <= 0) goto L22d
            r1.m6018()
            ix1 r1 = r0.f8156
            r1.clear()
            r14 = r18
            goto L22d
        L195:
            android.view.DisplayCutout r1 = r1.f7267
            java.util.List r1 = r1.getBoundingRects()
            int r2 = r1.size()
            v11 r3 = r0.f8155
            int r4 = r3.f11065
            if (r2 >= r4) goto L1c2
            int r2 = r1.size()
            v11 r4 = r0.f8155
            int r4 = r4.f11065
            r3.m6026(r2, r4)
            ix1 r2 = r0.f8156
            int r3 = r1.size()
            ix1 r4 = r0.f8156
            int r4 = r4.size()
            r2.m2827(r3, r4)
            r14 = r18
            goto L1fe
        L1c2:
            int r2 = r1.size()
            v11 r3 = r0.f8155
            int r3 = r3.f11065
            int r2 = r2 - r3
            r3 = 0
        L1cc:
            if (r3 >= r2) goto L1fe
            v11 r4 = r0.f8155
            int r5 = r4.f11065
            java.lang.Object r5 = r1.get(r5)
            x91 r5 = p000.j81.m2882(r5)
            r4.m6015(r5)
            ix1 r4 = r0.f8156
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "display cutout rect "
            r5.<init>(r6)
            v11 r6 = r0.f8155
            int r6 = r6.f11065
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            hm0 r6 = new hm0
            r6.<init>(r5)
            r4.add(r6)
            int r3 = r3 + 1
            r14 = r18
            goto L1cc
        L1fe:
            int r2 = r1.size()
            r3 = 0
        L203:
            if (r3 >= r2) goto L225
            java.lang.Object r4 = r1.get(r3)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            v11 r5 = r0.f8155
            java.lang.Object r5 = r5.m6020(r3)
            g21 r5 = (p000.g21) r5
            java.lang.Object r6 = r5.getValue()
            boolean r6 = p000.ln0.m3626(r6, r4)
            if (r6 != 0) goto L222
            r5.setValue(r4)
            r14 = r18
        L222:
            int r3 = r3 + 1
            goto L203
        L225:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22d
            r15 = r18
        L22d:
            if (r15 != 0) goto L237
            u91 r1 = r0.f8154
            int r1 = r1.m5837()
            if (r1 == 0) goto L262
        L237:
            if (r14 == 0) goto L262
            u91 r0 = r0.f8154
            int r1 = r0.m5837()
            int r1 = r1 + 1
            r0.m5838(r1)
            java.lang.Object r1 = p000.ax1.f1362
            monitor-enter(r1)
            sa0 r0 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L25f
            c21 r0 = r0.f3730     // Catch: java.lang.Throwable -> L25f
            if (r0 == 0) goto L257
            boolean r0 = r0.m1114()     // Catch: java.lang.Throwable -> L25f
            r2 = r18
            if (r0 != r2) goto L257
            r11 = r2
            goto L258
        L257:
            r11 = 0
        L258:
            monitor-exit(r1)
            if (r11 == 0) goto L262
            p000.ax1.m619()
            return
        L25f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L262:
            return
    }

    @Override // p000.v41
    /* JADX INFO: renamed from: η */
    public final p000.oc2 mo408(android.view.View r3, p000.oc2 r4) {
            r2 = this;
            boolean r0 = r2.f8150
            if (r0 == 0) goto L10
            r2.f8152 = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L17
            r3.post(r2)
            return r4
        L10:
            int r3 = r2.f8151
            if (r3 != 0) goto L17
            r2.m4255(r4)
        L17:
            return r4
    }
}
