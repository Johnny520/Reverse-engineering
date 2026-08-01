package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0450 extends android.view.View {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f1602;

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public android.view.animation.Interpolator f1603;

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public java.lang.Runnable f1604;

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public xhss.RunnableC0695 f1605;

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public float f1606;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1607;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public float f1608;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public float f1609;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public android.graphics.RectF f1610;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0436 f1611;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public int f1612;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public boolean f1613;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public float f1614;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public float f1615;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public float f1616;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public int f1617;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public float f1618;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public float f1619;

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public float f1620;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public float f1621;

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public int f1622;

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public android.animation.ValueAnimator f1623;

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public boolean f1624;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0436 f1625;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public float f1626;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public float f1627;

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public int f1628;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public android.graphics.Paint f1629;

    public int getColor() {
            r0 = this;
            int r0 = r0.f1607
            return r0
    }

    public int getStatus() {
            r0 = this;
            int r0 = r0.f1612
            return r0
    }

    public int getStrokeWidth() {
            r0 = this;
            int r0 = r0.f1602
            return r0
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            xhss.ᛵᛱᛲᛶ r0 = r2.f1625
            r1 = 0
            if (r0 == 0) goto L7
            r0.f1564 = r1
        L7:
            xhss.ᛵᛱᛲᛶ r0 = r2.f1611
            if (r0 == 0) goto Ld
            r0.f1564 = r1
        Ld:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Paint r5 = r10.f1629
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L14
            android.graphics.RectF r1 = r10.f1610
            r3 = 1136033792(0x43b68000, float:365.0)
            r4 = 0
            r2 = 0
            r0 = r11
            r0.drawArc(r1, r2, r3, r4, r5)
            return
        L14:
            r0 = r11
            boolean r11 = r10.f1624
            r6 = 2
            if (r11 == 0) goto L2c
            android.graphics.RectF r1 = r10.f1610
            r3 = 1136033792(0x43b68000, float:365.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            r10.f1617 = r6
            int r11 = r10.f1612
            r10.m830(r11, r0)
            return
        L2c:
            int r11 = r10.f1612
            r7 = 1135869952(0x43b40000, float:360.0)
            if (r11 == 0) goto Lb3
            r8 = 0
            r9 = 1
            if (r11 == r9) goto L75
            if (r11 == r6) goto L75
            r1 = 3
            if (r11 == r1) goto L75
            r1 = 4
            if (r11 == r1) goto L40
            goto Lb2
        L40:
            int r11 = r10.f1617
            if (r11 == 0) goto L56
            if (r11 == r9) goto L47
            goto Lb2
        L47:
            android.graphics.RectF r1 = r10.f1610
            r3 = 1135869952(0x43b40000, float:360.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            int r11 = r10.f1612
            r10.m830(r11, r0)
            return
        L56:
            android.graphics.RectF r1 = r10.f1610
            float r3 = r10.f1626
            r4 = 0
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0.drawArc(r1, r2, r3, r4, r5)
            float r11 = r10.f1626
            r0 = 1136033792(0x43b68000, float:365.0)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 != 0) goto Lb2
            r10.f1617 = r9
            java.lang.Runnable r11 = r10.f1604
            if (r11 == 0) goto Lb2
            r11.run()
            r10.f1604 = r8
            return
        L75:
            int r11 = r10.f1617
            if (r11 == 0) goto L8b
            if (r11 == r9) goto L7c
            goto Lb2
        L7c:
            android.graphics.RectF r1 = r10.f1610
            r3 = 1135869952(0x43b40000, float:360.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            int r11 = r10.f1612
            r10.m830(r11, r0)
            return
        L8b:
            float r11 = r10.f1609
            r1 = 1084227584(0x40a00000, float:5.0)
            float r3 = r11 + r1
            r10.f1609 = r3
            android.graphics.RectF r1 = r10.f1610
            float r2 = r10.f1614
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            float r11 = r10.f1609
            float r0 = r10.f1606
            float r7 = r7 - r0
            float r11 = r11 - r7
            float r0 = r10.f1614
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 < 0) goto Lb2
            r10.f1617 = r9
            java.lang.Runnable r11 = r10.f1604
            if (r11 == 0) goto Lb2
            r11.run()
            r10.f1604 = r8
        Lb2:
            return
        Lb3:
            float r11 = r10.f1619
            double r1 = (double) r11
            float r11 = r10.f1621
            double r3 = (double) r11
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.sin(r3)
            double r3 = r3 * r1
            float r11 = (float) r3
            float r1 = r10.f1619
            float r11 = r11 + r1
            float r1 = r10.f1615
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r11
            float r2 = r10.f1626
            float r11 = r2 - r1
            r10.f1614 = r11
            r3 = 0
            int r4 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lda
            float r11 = r11 + r7
            r10.f1614 = r11
        Lda:
            r10.f1609 = r1
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto Le2
            float r7 = r7 - r1
            goto Le3
        Le2:
            r7 = r1
        Le3:
            r10.f1606 = r7
            android.graphics.RectF r10 = r10.f1610
            float r3 = -r1
            r4 = 0
            r1 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            r2.f1618 = r3
            float r3 = (float) r4
            float r3 = r3 * r5
            float r3 = r3 / r6
            r2.f1627 = r3
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 / 2
            int r4 = r2.f1602
            int r4 = r4 / 2
            int r3 = r3 - r4
            float r3 = (float) r3
            r2.f1608 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = r2.f1618
            float r5 = r2.f1608
            float r6 = r4 - r5
            float r0 = r2.f1627
            float r1 = r0 - r5
            float r4 = r4 + r5
            float r0 = r0 + r5
            r3.<init>(r6, r1, r4, r0)
            r2.f1610 = r3
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m828() {
            r8 = this;
            java.lang.Class<xhss.ᛵᛲᲇᛴ> r0 = xhss.C0450.class
            monitor-enter(r0)
            boolean r1 = r8.f1613     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r8 = move-exception
            goto Lb5
        Lc:
            r1 = 1
            r8.f1613 = r1     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1629     // Catch: java.lang.Throwable -> L9
            r2.setAntiAlias(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1629     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> L9
            r2.setStyle(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1629     // Catch: java.lang.Throwable -> L9
            int r3 = r8.f1602     // Catch: java.lang.Throwable -> L9
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L9
            r2.setStrokeWidth(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1629     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch: java.lang.Throwable -> L9
            r2.setStrokeCap(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1629     // Catch: java.lang.Throwable -> L9
            int r3 = r8.f1607     // Catch: java.lang.Throwable -> L9
            r2.setColor(r3)     // Catch: java.lang.Throwable -> L9
            boolean r2 = r8.isInEditMode()     // Catch: java.lang.Throwable -> L9
            if (r2 != 0) goto Lb3
            android.content.Context r2 = r8.getContext()     // Catch: java.lang.Throwable -> L9
            java.lang.Class<android.view.WindowManager> r3 = android.view.WindowManager.class
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L9
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L9
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L9
            android.view.Display$Mode r2 = r2.getMode()     // Catch: java.lang.Throwable -> L9
            float r2 = r2.getRefreshRate()     // Catch: java.lang.Throwable -> L9
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L5d
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L9
            double r4 = r4 / r6
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9
            goto L5f
        L5d:
            r4 = 16
        L5f:
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L9
            float r4 = r8.f1616     // Catch: java.lang.Throwable -> L9
            float r5 = r8.f1615     // Catch: java.lang.Throwable -> L9
            float r4 = r4 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r8.f1619 = r4     // Catch: java.lang.Throwable -> L9
            r4 = 1136033792(0x43b68000, float:365.0)
            xhss.ᛵᛱᛲᛶ r5 = xhss.C0436.m817(r3, r4)     // Catch: java.lang.Throwable -> L9
            r8.f1625 = r5     // Catch: java.lang.Throwable -> L9
            r6 = 1000(0x3e8, double:4.94E-321)
            r5.f1556 = r6     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r6.<init>()     // Catch: java.lang.Throwable -> L9
            r5.f1565 = r6     // Catch: java.lang.Throwable -> L9
            xhss.ᛵᛱᛲᛶ r5 = r8.f1625     // Catch: java.lang.Throwable -> L9
            r6 = -1
            r5.f1560 = r6     // Catch: java.lang.Throwable -> L9
            r5.f1566 = r2     // Catch: java.lang.Throwable -> L9
            xhss.ᲇᛲᛵ r7 = new xhss.ᲇᛲᛵ     // Catch: java.lang.Throwable -> L9
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L9
            r5.f1558 = r7     // Catch: java.lang.Throwable -> L9
            xhss.ᛵᛱᛲᛶ r1 = xhss.C0436.m817(r3, r4)     // Catch: java.lang.Throwable -> L9
            r8.f1611 = r1     // Catch: java.lang.Throwable -> L9
            r3 = 1500(0x5dc, double:7.41E-321)
            r1.f1556 = r3     // Catch: java.lang.Throwable -> L9
            r1.f1566 = r2     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r2.<init>()     // Catch: java.lang.Throwable -> L9
            r1.f1565 = r2     // Catch: java.lang.Throwable -> L9
            xhss.ᛵᛱᛲᛶ r1 = r8.f1611     // Catch: java.lang.Throwable -> L9
            r1.f1560 = r6     // Catch: java.lang.Throwable -> L9
            xhss.ᲇᛲᛵ r2 = new xhss.ᲇᛲᛵ     // Catch: java.lang.Throwable -> L9
            r3 = 2
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L9
            r1.f1558 = r2     // Catch: java.lang.Throwable -> L9
            r1.m818()     // Catch: java.lang.Throwable -> L9
            xhss.ᛵᛱᛲᛶ r8 = r8.f1625     // Catch: java.lang.Throwable -> L9
            r8.m818()     // Catch: java.lang.Throwable -> L9
        Lb3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        Lb5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r8
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m829(int r3, android.view.animation.Interpolator r4) {
            r2 = this;
            r2.f1603 = r4
            r2.f1612 = r3
            int r3 = r2.f1617
            if (r3 != 0) goto L11
            xhss.ᲈᛵᛲᲁ r3 = new xhss.ᲈᛵᛲᲁ
            r4 = 5
            r3.<init>(r2, r4)
            r2.f1604 = r3
            return
        L11:
            android.animation.ValueAnimator r3 = r2.f1623
            if (r3 == 0) goto L1b
            r3.cancel()
            r3 = 0
            r2.f1623 = r3
        L1b:
            r3 = 0
            r2.f1620 = r3
            r3 = 2
            float[] r4 = new float[r3]
            r4 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            r2.f1623 = r4
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            android.animation.ValueAnimator r4 = r2.f1623
            xhss.ᛴᲇᲀᛷ r0 = new xhss.ᛴᲇᲀᛷ
            r0.<init>(r3, r2)
            r4.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r2.f1623
            r2.start()
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m830(int r10, android.graphics.Canvas r11) {
            r9 = this;
            android.graphics.Paint r5 = r9.f1629
            xhss.ᛵᛱᛲᛶ r0 = r9.f1625
            android.view.animation.Interpolator r1 = r0.f1565
            android.view.animation.Interpolator r2 = r9.f1603
            if (r1 == r2) goto Lc
            r0.f1565 = r2
        Lc:
            xhss.ᛷᛸᲇᛸ r0 = r9.f1605
            r1 = 2
            r6 = 1
            r2 = 3
            if (r0 == 0) goto L51
            r0.run()
            r0 = 0
            r9.f1605 = r0
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            if (r10 == r6) goto L4e
            if (r10 == r1) goto L39
            if (r10 == r2) goto L22
            goto L51
        L22:
            r9.performHapticFeedback(r2)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            xhss.ᲈᛵᛲᲁ r3 = new xhss.ᲈᛵᛲᲁ
            r3.<init>(r9, r6)
            r7 = 150(0x96, double:7.4E-322)
            r0.postDelayed(r3, r7)
            goto L51
        L39:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            xhss.ᲈᛵᛲᲁ r3 = new xhss.ᲈᛵᛲᲁ
            r4 = 0
            r3.<init>(r9, r4)
            r7 = 240(0xf0, double:1.186E-321)
            r0.postDelayed(r3, r7)
            goto L51
        L4e:
            r9.performHapticFeedback(r2)
        L51:
            r0 = 1092616192(0x41200000, float:10.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r6) goto Lf1
            if (r10 == r1) goto Lae
            if (r10 == r2) goto L5c
            return
        L5c:
            float r10 = r9.f1627
            float r1 = r9.f1608
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r2
            float r1 = r1 / r0
            float r10 = r10 - r1
            int r10 = (int) r10
            float r0 = r9.f1618
            float r1 = r1 + r0
            int r0 = (int) r1
            float r1 = r9.f1620
            r6 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L86
            r2 = r1
            float r1 = (float) r10
            float r2 = r2 * r7
            int r0 = r0 - r10
            float r10 = (float) r0
            float r2 = r2 * r10
            float r2 = r2 + r1
            int r10 = (int) r2
            r9.f1622 = r10
            r9.f1628 = r10
            float r3 = (float) r10
            r2 = r1
            r4 = r3
            r0 = r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        L86:
            r2 = r0
            r0 = r11
            r11 = r2
            r2 = r1
            float r1 = (float) r10
            float r2 = r2 * r7
            int r10 = r11 - r10
            float r10 = (float) r10
            float r2 = r2 * r10
            float r2 = r2 + r1
            int r2 = (int) r2
            r9.f1622 = r2
            r9.f1628 = r2
            float r3 = (float) r11
            r2 = r1
            r4 = r3
            r0.drawLine(r1, r2, r3, r4, r5)
            float r9 = r9.f1620
            float r9 = r9 - r6
            float r9 = r9 * r7
            float r9 = r9 * r10
            float r10 = r3 - r9
            int r10 = (int) r10
            float r9 = r9 + r1
            int r9 = (int) r9
            float r10 = (float) r10
            float r4 = (float) r9
            r1 = r3
            r3 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Lae:
            r0 = r11
            float r10 = r9.f1618
            int r10 = (int) r10
            float r11 = r9.f1627
            float r1 = r9.f1608
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r3 = r2 / r7
            float r3 = r11 - r3
            int r3 = (int) r3
            r4 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 / r4
            float r2 = r2 + r11
            int r2 = (int) r2
            r4 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r4
            r4 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r4
            float r1 = r1 + r11
            int r11 = (int) r1
            float r9 = r9.f1620
            r1 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto Le2
            float r1 = (float) r10
            r4 = r2
            float r2 = (float) r3
            int r10 = r4 - r3
            float r10 = (float) r10
            float r10 = r10 * r9
            float r4 = r10 + r2
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Le2:
            r4 = r2
            float r1 = (float) r10
            float r2 = (float) r3
            float r4 = (float) r4
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = (float) r11
            int r11 = r11 + r6
            float r4 = (float) r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Lf1:
            r10 = r11
            float r11 = r9.f1608
            r1 = 1101004800(0x41a00000, float:20.0)
            float r1 = r11 / r1
            int r1 = (int) r1
            float r2 = r9.f1618
            float r0 = r11 / r0
            float r0 = r2 - r0
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            float r11 = r11 / r7
            float r3 = r2 - r11
            int r3 = (int) r3
            float r4 = r9.f1627
            float r4 = r4 + r1
            int r1 = (int) r4
            float r11 = r11 + r2
            int r11 = (int) r11
            float r2 = (float) r3
            int r11 = r11 - r3
            float r11 = (float) r11
            float r4 = r9.f1620
            float r11 = r11 * r4
            float r11 = r11 + r2
            int r11 = (int) r11
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r6 = (float) r1
            r4.moveTo(r2, r6)
            if (r11 >= r0) goto L12c
            r9.f1622 = r11
            int r0 = r11 - r3
            int r0 = r0 + r1
            r9.f1628 = r0
            float r9 = (float) r11
            float r11 = (float) r0
            r4.lineTo(r9, r11)
            goto L144
        L12c:
            r9.f1622 = r0
            int r2 = r0 - r3
            int r2 = r2 + r1
            r9.f1628 = r2
            float r0 = (float) r0
            float r1 = (float) r2
            r4.lineTo(r0, r1)
            int r0 = r9.f1628
            int r9 = r9.f1622
            int r9 = r11 - r9
            int r0 = r0 - r9
            float r9 = (float) r11
            float r11 = (float) r0
            r4.lineTo(r9, r11)
        L144:
            r10.drawPath(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m831(float r5) {
            r4 = this;
            xhss.ᛵᛱᛲᛶ r0 = r4.f1625
            r1 = 0
            if (r0 == 0) goto L7
            r0.f1564 = r1
        L7:
            xhss.ᛵᛱᛲᛶ r0 = r4.f1611
            if (r0 == 0) goto Ld
            r0.f1564 = r1
        Ld:
            int r0 = r4.f1612
            r2 = 4
            if (r0 == r2) goto L15
            r0 = 0
            r4.f1626 = r0
        L15:
            r4.f1624 = r1
            r4.f1612 = r2
            float r0 = r4.f1626
            r2 = 1136033792(0x43b68000, float:365.0)
            float r5 = r5 * r2
            xhss.ᛵᛱᛲᛶ r5 = xhss.C0436.m817(r0, r5)
            r4.f1625 = r5
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.f1556 = r2
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r2)
            r5.f1565 = r0
            xhss.ᛵᛱᛲᛶ r5 = r4.f1625
            r5.f1560 = r1
            xhss.ᲇᛲᛵ r0 = new xhss.ᲇᛲᛵ
            r0.<init>(r4, r1)
            r5.f1558 = r0
            r5.m818()
            return
    }
}
