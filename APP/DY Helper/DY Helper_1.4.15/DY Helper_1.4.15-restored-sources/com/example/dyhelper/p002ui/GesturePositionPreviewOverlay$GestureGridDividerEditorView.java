package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class GesturePositionPreviewOverlay$GestureGridDividerEditorView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public final p000.C0535m3 f2539;

    /* JADX INFO: renamed from: ζ */
    public p000.w90 f2540;

    /* JADX INFO: renamed from: η */
    public p000.x90 f2541;

    /* JADX INFO: renamed from: θ */
    public p000.pa0 f2542;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Paint f2543;

    /* JADX INFO: renamed from: κ */
    public final android.graphics.Paint f2544;

    /* JADX INFO: renamed from: λ */
    public final android.graphics.Paint f2545;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Paint f2546;

    /* JADX INFO: renamed from: ν */
    public final android.graphics.Paint f2547;

    /* JADX INFO: renamed from: ξ */
    public final android.graphics.Paint f2548;

    /* JADX INFO: renamed from: ο */
    public final android.graphics.RectF f2549;

    public GesturePositionPreviewOverlay$GestureGridDividerEditorView(android.app.Activity r4, p000.w90 r5, p000.x90 r6, p000.C0535m3 r7) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r3.<init>(r4)
            r3.f2539 = r7
            w90 r4 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            w90 r4 = p000.C0381i2.m2584(r5, r6)
            r3.f2540 = r4
            r3.f2541 = r6
            android.graphics.Paint r4 = new android.graphics.Paint
            r5 = 1
            r4.<init>(r5)
            r6 = 120(0x78, float:1.68E-43)
            r7 = 0
            int r6 = android.graphics.Color.argb(r6, r7, r7, r7)
            r4.setColor(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r4.setStyle(r6)
            r3.f2543 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r0 = 255(0xff, float:3.57E-43)
            r1 = 235(0xeb, float:3.3E-43)
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            r4.setColor(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r3.m1555(r0)
            r4.setStrokeWidth(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r0)
            r3.f2544 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r2 = 190(0xbe, float:2.66E-43)
            int r7 = android.graphics.Color.argb(r2, r7, r7, r7)
            r4.setColor(r7)
            r7 = 1084227584(0x40a00000, float:5.0)
            float r7 = r3.m1555(r7)
            r4.setStrokeWidth(r7)
            r4.setStyle(r0)
            r3.f2545 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r7 = 28
            r0 = 34
            int r7 = android.graphics.Color.argb(r1, r7, r7, r0)
            r4.setColor(r7)
            r4.setStyle(r6)
            r3.f2546 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r6 = -1
            r4.setColor(r6)
            android.content.res.Resources r7 = r3.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r0 = 2
            r1 = 1102053376(0x41b00000, float:22.0)
            float r7 = android.util.TypedValue.applyDimension(r0, r1, r7)
            r4.setTextSize(r7)
            android.graphics.Paint$Align r7 = android.graphics.Paint.Align.CENTER
            r4.setTextAlign(r7)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r1)
            r3.f2547 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r5)
            r4.setColor(r6)
            android.content.res.Resources r6 = r3.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            r2 = 1093664768(0x41300000, float:11.0)
            float r6 = android.util.TypedValue.applyDimension(r0, r2, r6)
            r4.setTextSize(r6)
            r4.setTextAlign(r7)
            r4.setTypeface(r1)
            r3.f2548 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r3.f2549 = r4
            r3.setClickable(r5)
            r3.setFocusable(r5)
            r3.setImportantForAccessibility(r5)
            java.lang.String r4 = "可拖动的手势有效边界和分割线"
            r3.setContentDescription(r4)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r19) {
            r18 = this;
            r0 = r18
            r19.getClass()
            super.onDraw(r19)
            int r1 = r0.getWidth()
            if (r1 <= 0) goto L155
            int r1 = r0.getHeight()
            if (r1 > 0) goto L16
            goto L155
        L16:
            w90 r1 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r2 = r0.getHeight()
            float r2 = (float) r2
            w90 r3 = r0.f2540
            v90 r7 = p000.C0381i2.m2589(r1, r2, r3)
            float r8 = r7.f11186
            float r9 = r7.f11187
            float r10 = r7.f11185
            float r11 = r7.f11184
            w90 r1 = r0.f2540
            float r1 = r1.f11606
            float r2 = r7.m6140()
            float r2 = r2 * r1
            float r12 = r2 + r11
            w90 r1 = r0.f2540
            float r1 = r1.f11607
            float r2 = r7.m6140()
            float r2 = r2 * r1
            float r13 = r2 + r11
            w90 r1 = r0.f2540
            float r1 = r1.f11608
            float r2 = r7.m6139()
            float r2 = r2 * r1
            float r14 = r2 + r10
            w90 r1 = r0.f2540
            float r1 = r1.f11609
            float r2 = r7.m6139()
            float r2 = r2 * r1
            float r15 = r2 + r10
            int r1 = r0.getWidth()
            float r4 = (float) r1
            float r5 = r7.f11185
            r2 = 0
            r3 = 0
            android.graphics.Paint r6 = r0.f2543
            r1 = r19
            r1.drawRect(r2, r3, r4, r5, r6)
            float r3 = r7.f11187
            int r1 = r0.getWidth()
            float r4 = (float) r1
            int r1 = r0.getHeight()
            float r5 = (float) r1
            r1 = r19
            r1.drawRect(r2, r3, r4, r5, r6)
            float r3 = r7.f11185
            float r4 = r7.f11184
            float r5 = r7.f11187
            r1.drawRect(r2, r3, r4, r5, r6)
            float r2 = r7.f11186
            float r3 = r7.f11185
            int r1 = r0.getWidth()
            float r4 = (float) r1
            float r5 = r7.f11187
            r1 = r19
            r1.drawRect(r2, r3, r4, r5, r6)
            android.graphics.Paint r6 = r0.f2545
            r4 = r12
            r5 = r9
            r3 = r10
            r2 = r12
            r1.drawLine(r2, r3, r4, r5, r6)
            r9 = r6
            android.graphics.Paint r6 = r0.f2544
            r4 = r2
            r1.drawLine(r2, r3, r4, r5, r6)
            r10 = r6
            float r4 = r3 + r5
            r12 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r12
            java.lang.String r6 = "↔"
            r0.m1556(r2, r4, r1, r6)
            r2 = r4
            r4 = r13
            r17 = r9
            r9 = r2
            r2 = r13
            r13 = r6
            r6 = r17
            r1.drawLine(r2, r3, r4, r5, r6)
            r16 = r6
            r4 = r2
            r6 = r10
            r1.drawLine(r2, r3, r4, r5, r6)
            r0.m1556(r2, r9, r1, r13)
            r5 = r14
            r4 = r8
            r2 = r11
            r3 = r14
            r6 = r16
            r1.drawLine(r2, r3, r4, r5, r6)
            r5 = r3
            r6 = r10
            r1.drawLine(r2, r3, r4, r5, r6)
            float r11 = r2 + r4
            float r11 = r11 / r12
            java.lang.String r8 = "↕"
            r0.m1556(r11, r3, r1, r8)
            r5 = r15
            r3 = r15
            r6 = r16
            r1.drawLine(r2, r3, r4, r5, r6)
            r5 = r3
            r6 = r10
            r1.drawLine(r2, r3, r4, r5, r6)
            r0.m1556(r11, r3, r1, r8)
            float r2 = r7.f11184
            w90 r3 = r0.f2540
            float r3 = r3.f11610
            int r4 = r0.getWidth()
            int r3 = r0.m1560(r4, r3)
            java.lang.String r4 = "左 "
            java.lang.String r6 = "dp"
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r3, r6)
            r5 = 1
            r3 = r7
            r0.m1559(r1, r2, r3, r4, r5)
            float r2 = r3.f11186
            w90 r1 = r0.f2540
            float r1 = r1.f11611
            int r4 = r0.getWidth()
            int r1 = r0.m1560(r4, r1)
            java.lang.String r4 = "右 "
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r1, r6)
            r5 = 0
            r1 = r19
            r0.m1559(r1, r2, r3, r4, r5)
            float r2 = r3.f11185
            w90 r1 = r0.f2540
            float r1 = r1.f11612
            int r4 = r0.getHeight()
            int r1 = r0.m1560(r4, r1)
            java.lang.String r4 = "上 "
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r1, r6)
            r5 = 1
            r1 = r19
            r0.m1557(r1, r2, r3, r4, r5)
            float r2 = r3.f11187
            w90 r1 = r0.f2540
            float r1 = r1.f11613
            int r4 = r0.getHeight()
            int r1 = r0.m1560(r4, r1)
            java.lang.String r4 = "下 "
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r1, r6)
            r5 = 0
            r1 = r19
            r0.m1557(r1, r2, r3, r4, r5)
        L155:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r26) {
            r25 = this;
            r0 = r25
            r26.getClass()
            int r1 = r26.getActionMasked()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L5f
            if (r1 == r4) goto L40
            pa0 r5 = r0.f2542
            r6 = 2
            if (r1 == r6) goto L31
            r6 = 3
            if (r1 == r6) goto L21
            if (r5 == 0) goto L1d
            r1 = r4
            goto L2fc
        L1d:
            r16 = r3
            goto L2f1
        L21:
            if (r5 == 0) goto L24
            goto L25
        L24:
            r4 = r3
        L25:
            r0.f2542 = r2
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L30
            r0.requestDisallowInterceptTouchEvent(r3)
        L30:
            return r4
        L31:
            if (r5 != 0) goto L34
            goto L1d
        L34:
            float r1 = r26.getX()
            float r2 = r26.getY()
            r0.m1562(r5, r1, r2)
            return r4
        L40:
            pa0 r1 = r0.f2542
            if (r1 != 0) goto L45
            goto L1d
        L45:
            float r5 = r26.getX()
            float r6 = r26.getY()
            r0.m1562(r1, r5, r6)
            r0.f2542 = r2
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L5b
            r1.requestDisallowInterceptTouchEvent(r3)
        L5b:
            super.performClick()
            return r4
        L5f:
            float r1 = r26.getX()
            float r5 = r26.getY()
            int r6 = r0.getWidth()
            if (r6 <= 0) goto L73
            int r6 = r0.getHeight()
            if (r6 > 0) goto L77
        L73:
            r16 = r3
            goto L2d5
        L77:
            w90 r6 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            int r6 = r0.getWidth()
            float r6 = (float) r6
            int r7 = r0.getHeight()
            float r7 = (float) r7
            w90 r8 = r0.f2540
            v90 r6 = p000.C0381i2.m2589(r6, r7, r8)
            float r7 = r6.f11187
            float r8 = r6.f11186
            float r9 = r6.f11185
            float r10 = r6.f11184
            w90 r11 = r0.f2540
            float r11 = r11.f11606
            float r12 = r6.m6140()
            float r12 = r12 * r11
            float r12 = r12 + r10
            w90 r11 = r0.f2540
            float r11 = r11.f11607
            float r13 = r6.m6140()
            float r13 = r13 * r11
            float r13 = r13 + r10
            w90 r11 = r0.f2540
            float r11 = r11.f11608
            float r14 = r6.m6139()
            float r14 = r14 * r11
            float r14 = r14 + r9
            w90 r11 = r0.f2540
            float r11 = r11.f11609
            float r15 = r6.m6139()
            float r15 = r15 * r11
            float r15 = r15 + r9
            r11 = 1106247680(0x41f00000, float:30.0)
            float r11 = r0.m1555(r11)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r16 = r3
            r3 = 1111490560(0x42400000, float:48.0)
            float r17 = r0.m1555(r3)
            int r4 = r0.getWidth()
            float r4 = (float) r4
            r18 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r18
            int r19 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r19 <= 0) goto Lda
            goto Ldc
        Lda:
            r4 = r17
        Ldc:
            float r3 = r0.m1555(r3)
            r17 = r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r18
            int r18 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r18 <= 0) goto Lee
            r3 = r1
        Lee:
            float r1 = r6.m6139()
            r18 = 1060655596(0x3f3851ec, float:0.72)
            float r1 = r1 * r18
            float r1 = r1 + r9
            r26 = r1
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r4
            float r1 = p000.j81.m2905(r10, r4, r1)
            r19 = r1
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r4
            float r1 = p000.j81.m2905(r8, r4, r1)
            float r4 = r6.m6140()
            float r4 = r4 * r18
            float r4 = r4 + r10
            float r6 = r6.m6140()
            r18 = 1034147594(0x3da3d70a, float:0.08)
            float r6 = r6 * r18
            float r6 = r6 + r10
            r18 = r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r3
            float r1 = p000.j81.m2905(r9, r3, r1)
            r20 = r1
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r3
            float r1 = p000.j81.m2905(r7, r3, r1)
            float r3 = r9 - r11
            float r21 = r7 + r11
            int r21 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            r22 = 2139095040(0x7f800000, float:Infinity)
            if (r21 > 0) goto L1f0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L1f0
            float r3 = r17 - r10
            float r3 = java.lang.Math.abs(r3)
            float r19 = r17 - r19
            float r19 = java.lang.Math.abs(r19)
            java.lang.Float r19 = java.lang.Float.valueOf(r19)
            float r21 = r5 - r26
            float r23 = java.lang.Math.abs(r21)
            int r23 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r23 > 0) goto L162
            goto L164
        L162:
            r19 = 0
        L164:
            if (r19 == 0) goto L16f
            float r19 = r19.floatValue()
            r26 = r1
            r1 = r19
            goto L173
        L16f:
            r26 = r1
            r1 = r22
        L173:
            float r1 = java.lang.Math.min(r3, r1)
            float r3 = r17 - r8
            float r3 = java.lang.Math.abs(r3)
            float r18 = r17 - r18
            float r18 = java.lang.Math.abs(r18)
            java.lang.Float r18 = java.lang.Float.valueOf(r18)
            float r19 = java.lang.Math.abs(r21)
            int r19 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
            if (r19 > 0) goto L190
            goto L192
        L190:
            r18 = 0
        L192:
            if (r18 == 0) goto L19f
            float r18 = r18.floatValue()
            r24 = r18
            r18 = r1
            r1 = r24
            goto L1a3
        L19f:
            r18 = r1
            r1 = r22
        L1a3:
            float r1 = java.lang.Math.min(r3, r1)
            java.lang.Float r3 = java.lang.Float.valueOf(r18)
            r18 = r1
            l91 r1 = new l91
            r19 = r4
            pa0 r4 = p000.pa0.f8463
            r1.<init>(r4, r3)
            r2.add(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r18)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8464
            r3.<init>(r4, r1)
            r2.add(r3)
            float r1 = r17 - r12
            float r1 = java.lang.Math.abs(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8467
            r3.<init>(r4, r1)
            r2.add(r3)
            float r1 = r17 - r13
            float r1 = java.lang.Math.abs(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8468
            r3.<init>(r4, r1)
            r2.add(r3)
            goto L1f4
        L1f0:
            r26 = r1
            r19 = r4
        L1f4:
            float r10 = r10 - r11
            float r8 = r8 + r11
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 > 0) goto L292
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 > 0) goto L292
            float r1 = r5 - r9
            float r1 = java.lang.Math.abs(r1)
            float r3 = r5 - r20
            float r3 = java.lang.Math.abs(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r4 = r17 - r19
            float r4 = java.lang.Math.abs(r4)
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 > 0) goto L219
            goto L21a
        L219:
            r3 = 0
        L21a:
            if (r3 == 0) goto L221
            float r3 = r3.floatValue()
            goto L223
        L221:
            r3 = r22
        L223:
            float r1 = java.lang.Math.min(r1, r3)
            float r3 = r5 - r7
            float r3 = java.lang.Math.abs(r3)
            float r4 = r5 - r26
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r6 = r17 - r6
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 > 0) goto L242
            goto L243
        L242:
            r4 = 0
        L243:
            if (r4 == 0) goto L249
            float r22 = r4.floatValue()
        L249:
            r4 = r22
            float r3 = java.lang.Math.min(r3, r4)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            l91 r4 = new l91
            pa0 r6 = p000.pa0.f8465
            r4.<init>(r6, r1)
            r2.add(r4)
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8466
            r3.<init>(r4, r1)
            r2.add(r3)
            float r1 = r5 - r14
            float r1 = java.lang.Math.abs(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8469
            r3.<init>(r4, r1)
            r2.add(r3)
            float r5 = r5 - r15
            float r1 = java.lang.Math.abs(r5)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            l91 r3 = new l91
            pa0 r4 = p000.pa0.f8470
            r3.<init>(r4, r1)
            r2.add(r3)
        L292:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L29e
            r2 = 0
            goto L2d1
        L29e:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L2a9
            goto L2d1
        L2a9:
            r3 = r2
            l91 r3 = (p000.l91) r3
            java.lang.Object r3 = r3.f6503
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
        L2b4:
            java.lang.Object r4 = r1.next()
            r5 = r4
            l91 r5 = (p000.l91) r5
            java.lang.Object r5 = r5.f6503
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r6 = java.lang.Float.compare(r3, r5)
            if (r6 <= 0) goto L2cb
            r2 = r4
            r3 = r5
        L2cb:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L2b4
        L2d1:
            l91 r2 = (p000.l91) r2
            if (r2 != 0) goto L2d7
        L2d5:
            r2 = 0
            goto L2ed
        L2d7:
            java.lang.Object r1 = r2.f6502
            r3 = r1
            pa0 r3 = (p000.pa0) r3
            java.lang.Object r2 = r2.f6503
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 > 0) goto L2ea
            r2 = r1
            goto L2eb
        L2ea:
            r2 = 0
        L2eb:
            pa0 r2 = (p000.pa0) r2
        L2ed:
            r0.f2542 = r2
            if (r2 != 0) goto L2f2
        L2f1:
            return r16
        L2f2:
            android.view.ViewParent r0 = r0.getParent()
            r1 = 1
            if (r0 == 0) goto L2fc
            r0.requestDisallowInterceptTouchEvent(r1)
        L2fc:
            return r1
    }

    @Override // android.view.View
    public final boolean performClick() {
            r0 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final float m1555(float r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m1556(float r7, float r8, android.graphics.Canvas r9, java.lang.String r10) {
            r6 = this;
            r0 = 1103101952(0x41c00000, float:24.0)
            float r0 = r6.m1555(r0)
            r1 = 1099956224(0x41900000, float:18.0)
            float r2 = r6.m1555(r1)
            float r3 = r7 - r0
            float r4 = r8 - r2
            float r0 = r0 + r7
            float r2 = r2 + r8
            android.graphics.RectF r5 = r6.f2549
            r5.set(r3, r4, r0, r2)
            float r0 = r6.m1555(r1)
            float r1 = r6.m1555(r1)
            android.graphics.Paint r2 = r6.f2546
            r9.drawRoundRect(r5, r0, r1, r2)
            android.graphics.Paint r6 = r6.f2547
            android.graphics.Paint$FontMetrics r0 = r6.getFontMetrics()
            float r1 = r0.ascent
            float r0 = r0.descent
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            float r8 = r8 - r1
            r9.drawText(r10, r7, r8, r6)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1557(android.graphics.Canvas r7, float r8, p000.v90 r9, java.lang.String r10, boolean r11) {
            r6 = this;
            float r1 = r9.f11184
            float r3 = r9.f11186
            android.graphics.Paint r5 = r6.f2545
            r4 = r8
            r0 = r7
            r2 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
            float r1 = r9.f11184
            float r3 = r9.f11186
            android.graphics.Paint r5 = r6.f2544
            r0.drawLine(r1, r2, r3, r4, r5)
            float r1 = r9.f11184
            float r2 = r9.m6140()
            if (r11 == 0) goto L21
            r3 = 1060655596(0x3f3851ec, float:0.72)
            goto L24
        L21:
            r3 = 1034147594(0x3da3d70a, float:0.08)
        L24:
            float r2 = r2 * r3
            float r2 = r2 + r1
            r1 = 1111490560(0x42400000, float:48.0)
            float r1 = r6.m1555(r1)
            int r3 = r6.getHeight()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L39
            r1 = r3
        L39:
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r1
            float r1 = p000.j81.m2905(r8, r1, r3)
            java.lang.String r3 = "↕"
            r6.m1556(r2, r1, r7, r3)
            r3 = 1107820544(0x42080000, float:34.0)
            float r3 = r6.m1555(r3)
            if (r11 == 0) goto L52
            float r1 = r1 + r3
            goto L53
        L52:
            float r1 = r1 - r3
        L53:
            r6.m1558(r2, r1, r7, r10)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1558(float r8, float r9, android.graphics.Canvas r10, java.lang.String r11) {
            r7 = this;
            android.graphics.Paint r0 = r7.f2548
            float r1 = r0.measureText(r11)
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 1090519040(0x41000000, float:8.0)
            float r3 = r7.m1555(r3)
            float r1 = r1 + r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r2
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L1b
            r1 = r3
        L1b:
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = r7.m1555(r3)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r2
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L2c
            r3 = r4
        L2c:
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r4 - r1
            float r8 = p000.j81.m2905(r8, r1, r4)
            int r4 = r7.getHeight()
            float r4 = (float) r4
            float r4 = r4 - r3
            float r9 = p000.j81.m2905(r9, r3, r4)
            float r4 = r8 - r1
            float r5 = r9 - r3
            float r1 = r1 + r8
            float r3 = r3 + r9
            android.graphics.RectF r6 = r7.f2549
            r6.set(r4, r5, r1, r3)
            r1 = 1092616192(0x41200000, float:10.0)
            float r3 = r7.m1555(r1)
            float r1 = r7.m1555(r1)
            android.graphics.Paint r7 = r7.f2546
            r10.drawRoundRect(r6, r3, r1, r7)
            android.graphics.Paint$FontMetrics r7 = r0.getFontMetrics()
            float r1 = r7.ascent
            float r7 = r7.descent
            float r1 = r1 + r7
            float r1 = r1 / r2
            float r9 = r9 - r1
            r10.drawText(r11, r8, r9, r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1559(android.graphics.Canvas r7, float r8, p000.v90 r9, java.lang.String r10, boolean r11) {
            r6 = this;
            float r2 = r9.f11185
            float r4 = r9.f11187
            android.graphics.Paint r5 = r6.f2545
            r3 = r8
            r0 = r7
            r1 = r8
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = r9.f11185
            float r4 = r9.f11187
            android.graphics.Paint r5 = r6.f2544
            r0.drawLine(r1, r2, r3, r4, r5)
            r1 = 1111490560(0x42400000, float:48.0)
            float r1 = r6.m1555(r1)
            int r2 = r6.getWidth()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L28
            r1 = r2
        L28:
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r2 = r2 - r1
            float r1 = p000.j81.m2905(r8, r1, r2)
            float r2 = r9.f11185
            float r3 = r9.m6139()
            r4 = 1060655596(0x3f3851ec, float:0.72)
            float r3 = r3 * r4
            float r3 = r3 + r2
            java.lang.String r2 = "↔"
            r6.m1556(r1, r3, r7, r2)
            r2 = 1110179840(0x422c0000, float:43.0)
            float r2 = r6.m1555(r2)
            if (r11 == 0) goto L4c
            float r1 = r1 + r2
            goto L4d
        L4c:
            float r1 = r1 - r2
        L4d:
            r6.m1558(r1, r3, r7, r10)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final int m1560(int r1, float r2) {
            r0 = this;
            float r1 = (float) r1
            float r2 = r2 * r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = r2 / r0
            int r0 = p000.jx0.m3061(r2)
            if (r0 >= 0) goto L14
            r0 = 0
        L14:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final void m1561(p000.x90 r2) {
            r1 = this;
            r2.getClass()
            r1.f2541 = r2
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            w90 r0 = r1.f2540
            w90 r2 = p000.C0381i2.m2584(r0, r2)
            w90 r0 = r1.f2540
            boolean r0 = p000.w90.m6331(r2, r0)
            if (r0 == 0) goto L19
            r1.invalidate()
            return
        L19:
            r1.f2540 = r2
            r1.invalidate()
            m3 r1 = r1.f2539
            r1.invoke(r2)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m1562(p000.pa0 r22, float r23, float r24) {
            r21 = this;
            r0 = r21
            int r1 = r0.getWidth()
            if (r1 <= 0) goto L20b
            int r1 = r0.getHeight()
            if (r1 > 0) goto L10
            goto L20b
        L10:
            w90 r1 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            int r1 = r0.getWidth()
            float r1 = (float) r1
            int r2 = r0.getHeight()
            float r2 = (float) r2
            w90 r3 = r0.f2540
            v90 r1 = p000.C0381i2.m2589(r1, r2, r3)
            float r2 = r1.f11184
            float r2 = r23 - r2
            float r3 = r1.m6140()
            float r2 = r2 / r3
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = p000.j81.m2905(r2, r3, r4)
            float r5 = r1.f11185
            float r5 = r24 - r5
            float r1 = r1.m6139()
            float r5 = r5 / r1
            float r1 = p000.j81.m2905(r5, r3, r4)
            int r5 = r22.ordinal()
            r6 = 1062836634(0x3f59999a, float:0.85)
            r7 = 1060320051(0x3f333333, float:0.7)
            r8 = 1055286886(0x3ee66666, float:0.45)
            r9 = 1051931443(0x3eb33333, float:0.35)
            r10 = 1041865114(0x3e19999a, float:0.15)
            switch(r5) {
                case 0: goto L1ab;
                case 1: goto L15b;
                case 2: goto L110;
                case 3: goto Lbf;
                case 4: goto La6;
                case 5: goto L8d;
                case 6: goto L75;
                case 7: goto L59;
                default: goto L55;
            }
        L55:
            p000.C1080.m7272()
            return
        L59:
            w90 r11 = r0.f2540
            float r2 = r11.f11608
            float r2 = r2 + r10
            float r15 = p000.j81.m2905(r1, r2, r6)
            r19 = 0
            r20 = 247(0xf7, float:3.46E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            w90 r1 = p000.w90.m6330(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L1f4
        L75:
            w90 r2 = r0.f2540
            float r3 = r2.f11609
            float r3 = r3 - r10
            float r5 = p000.j81.m2905(r1, r10, r3)
            r10 = 0
            r11 = 251(0xfb, float:3.52E-43)
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            w90 r1 = p000.w90.m6330(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L1f4
        L8d:
            w90 r1 = r0.f2540
            float r3 = r1.f11606
            float r3 = r3 + r10
            float r4 = p000.j81.m2905(r2, r3, r6)
            r10 = 0
            r11 = 253(0xfd, float:3.55E-43)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            w90 r1 = p000.w90.m6330(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L1f4
        La6:
            w90 r1 = r0.f2540
            float r3 = r1.f11607
            float r3 = r3 - r10
            float r3 = p000.j81.m2905(r2, r10, r3)
            r10 = 0
            r11 = 254(0xfe, float:3.56E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r1
            w90 r1 = p000.w90.m6330(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L1f4
        Lbf:
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r24
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r1 = p000.j81.m2905(r1, r3, r4)
            x90 r2 = r0.f2541
            boolean r2 = r2.f12080
            if (r2 == 0) goto Led
            float r17 = p000.j81.m2905(r1, r3, r9)
            w90 r10 = r0.f2540
            r16 = 0
            r19 = 63
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = r17
            w90 r1 = p000.w90.m6330(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L1f4
        Led:
            w90 r2 = r0.f2540
            float r2 = r2.f11612
            float r7 = r7 - r2
            float r2 = java.lang.Math.min(r8, r7)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lfb
            r2 = r3
        Lfb:
            w90 r4 = r0.f2540
            float r12 = p000.j81.m2905(r1, r3, r2)
            r13 = 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            w90 r1 = p000.w90.m6330(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L1f4
        L110:
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r24 / r1
            float r1 = p000.j81.m2905(r1, r3, r4)
            x90 r2 = r0.f2541
            boolean r2 = r2.f12080
            if (r2 == 0) goto L138
            float r17 = p000.j81.m2905(r1, r3, r9)
            w90 r10 = r0.f2540
            r16 = 0
            r19 = 63
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = r17
            w90 r1 = p000.w90.m6330(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L1f4
        L138:
            w90 r2 = r0.f2540
            float r2 = r2.f11613
            float r7 = r7 - r2
            float r2 = java.lang.Math.min(r8, r7)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L146
            r2 = r3
        L146:
            w90 r4 = r0.f2540
            float r11 = p000.j81.m2905(r1, r3, r2)
            r12 = 0
            r13 = 191(0xbf, float:2.68E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            w90 r1 = p000.w90.m6330(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L1f4
        L15b:
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r23
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r1 = p000.j81.m2905(r1, r3, r4)
            x90 r2 = r0.f2541
            boolean r2 = r2.f12079
            if (r2 == 0) goto L189
            float r15 = p000.j81.m2905(r1, r3, r9)
            w90 r10 = r0.f2540
            r18 = 0
            r19 = 207(0xcf, float:2.9E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r16 = r15
            w90 r1 = p000.w90.m6330(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L1f4
        L189:
            w90 r2 = r0.f2540
            float r2 = r2.f11610
            float r7 = r7 - r2
            float r2 = java.lang.Math.min(r8, r7)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L197
            r2 = r3
        L197:
            w90 r4 = r0.f2540
            float r10 = p000.j81.m2905(r1, r3, r2)
            r12 = 0
            r13 = 223(0xdf, float:3.12E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            w90 r1 = p000.w90.m6330(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L1f4
        L1ab:
            int r1 = r0.getWidth()
            float r1 = (float) r1
            float r1 = r23 / r1
            float r1 = p000.j81.m2905(r1, r3, r4)
            x90 r2 = r0.f2541
            boolean r2 = r2.f12079
            if (r2 == 0) goto L1d3
            float r15 = p000.j81.m2905(r1, r3, r9)
            w90 r10 = r0.f2540
            r18 = 0
            r19 = 207(0xcf, float:2.9E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r16 = r15
            w90 r1 = p000.w90.m6330(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L1f4
        L1d3:
            w90 r2 = r0.f2540
            float r2 = r2.f11611
            float r7 = r7 - r2
            float r2 = java.lang.Math.min(r8, r7)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L1e1
            r2 = r3
        L1e1:
            w90 r4 = r0.f2540
            float r9 = p000.j81.m2905(r1, r3, r2)
            r12 = 0
            r13 = 239(0xef, float:3.35E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            w90 r1 = p000.w90.m6330(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L1f4:
            w90 r1 = p000.C0381i2.m2599(r1)
            w90 r2 = r0.f2540
            boolean r2 = p000.w90.m6331(r1, r2)
            if (r2 == 0) goto L201
            goto L20b
        L201:
            r0.f2540 = r1
            r0.invalidate()
            m3 r0 = r0.f2539
            r0.invoke(r1)
        L20b:
            return
    }
}
