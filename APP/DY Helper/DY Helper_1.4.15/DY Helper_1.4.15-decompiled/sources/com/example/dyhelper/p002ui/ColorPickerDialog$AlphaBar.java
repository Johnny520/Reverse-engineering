package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ColorPickerDialog$AlphaBar extends android.view.View implements p000.InterfaceC0396ii {

    /* JADX INFO: renamed from: φ */
    public static final /* synthetic */ int f2437 = 0;

    /* JADX INFO: renamed from: ε */
    public int f2438;

    /* JADX INFO: renamed from: ζ */
    public int f2439;

    /* JADX INFO: renamed from: η */
    public com.example.dyhelper.p002ui.C0163 f2440;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Paint f2441;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Path f2442;

    /* JADX INFO: renamed from: κ */
    public final android.graphics.RectF f2443;

    /* JADX INFO: renamed from: λ */
    public android.graphics.LinearGradient f2444;

    /* JADX INFO: renamed from: μ */
    public float f2445;

    /* JADX INFO: renamed from: ν */
    public int f2446;

    /* JADX INFO: renamed from: ξ */
    public final int f2447;

    /* JADX INFO: renamed from: ο */
    public final int f2448;

    /* JADX INFO: renamed from: π */
    public final android.graphics.Paint f2449;

    /* JADX INFO: renamed from: ρ */
    public final android.graphics.Paint f2450;

    /* JADX INFO: renamed from: σ */
    public final android.graphics.Paint f2451;

    /* JADX INFO: renamed from: τ */
    public float f2452;

    /* JADX INFO: renamed from: υ */
    public android.animation.ValueAnimator f2453;

    public ColorPickerDialog$AlphaBar(android.content.Context r6, p000.C1000xx r7) {
            r5 = this;
            r6.getClass()
            r5.<init>(r6)
            r0 = 255(0xff, float:3.57E-43)
            r5.f2438 = r0
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r5.f2439 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.f2441 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.f2442 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.f2443 = r0
            r0 = -1
            r5.f2446 = r0
            java.lang.String r2 = r7.f12352
            int r2 = android.graphics.Color.parseColor(r2)
            r5.f2447 = r2
            java.lang.String r2 = r7.f12354
            int r2 = android.graphics.Color.parseColor(r2)
            r5.f2448 = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>(r1)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            int r4 = p000.jx0.m3056(r6, r1)
            float r4 = (float) r4
            r2.setStrokeWidth(r4)
            java.lang.String r7 = r7.f12353
            int r7 = android.graphics.Color.parseColor(r7)
            r2.setColor(r7)
            r5.f2449 = r2
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r1)
            r7.setStyle(r3)
            r2 = 2
            int r6 = p000.jx0.m3056(r6, r2)
            float r6 = (float) r6
            r7.setStrokeWidth(r6)
            r7.setColor(r0)
            r5.f2450 = r7
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r1)
            r6.setStyle(r3)
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setColor(r7)
            r7 = 90
            r6.setAlpha(r7)
            r5.f2451 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f2452 = r6
            java.lang.String r6 = "透明度选择轨道"
            r5.setContentDescription(r6)
            r5.setFocusable(r1)
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f2453
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            r1.f2453 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            r14.getClass()
            super.onDraw(r14)
            int r0 = r13.getWidth()
            float r4 = (float) r0
            int r0 = r13.getHeight()
            float r3 = (float) r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf3
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto Lf3
        L1b:
            r0 = 1073741824(0x40000000, float:2.0)
            float r9 = r3 / r0
            int r10 = r14.save()
            android.graphics.Path r1 = r13.f2442
            r14.clipPath(r1)
            int r5 = r13.f2447
            int r6 = r13.f2448
            r2 = r4
            android.graphics.Paint r4 = r13.f2441
            r1 = r14
            com.example.dyhelper.p002ui.C0169.m1581(r1, r2, r3, r4, r5, r6)
            r11 = r3
            r12 = r4
            float r1 = r13.f2445
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L41
            int r1 = r13.f2439
            int r3 = r13.f2446
            if (r1 == r3) goto L58
        L41:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            int r7 = r13.f2439
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.CLAMP
            r4 = r2
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r2 = r4
            r13.f2444 = r1
            r13.f2445 = r2
            int r1 = r13.f2439
            r13.f2446 = r1
        L58:
            android.graphics.LinearGradient r1 = r13.f2444
            r12.setShader(r1)
            r4 = r2
            r2 = 0
            r3 = 0
            r1 = r14
            r5 = r11
            r6 = r12
            r1.drawRect(r2, r3, r4, r5, r6)
            r2 = r4
            r3 = r5
            r4 = r6
            r14 = 0
            r4.setShader(r14)
            r1.restoreToCount(r10)
            android.graphics.Paint r14 = r13.f2449
            float r4 = r14.getStrokeWidth()
            float r4 = r4 / r0
            float r5 = r14.getStrokeWidth()
            float r5 = r5 / r0
            float r6 = r14.getStrokeWidth()
            float r6 = r6 / r0
            float r6 = r2 - r6
            float r7 = r14.getStrokeWidth()
            float r7 = r7 / r0
            float r3 = r3 - r7
            android.graphics.RectF r7 = r13.f2443
            r7.set(r4, r5, r6, r3)
            r1.drawRoundRect(r7, r9, r9, r14)
            android.content.Context r14 = r13.getContext()
            r14.getClass()
            r3 = 3
            int r14 = p000.jx0.m3056(r14, r3)
            float r14 = (float) r14
            float r14 = r9 - r14
            android.content.Context r3 = r13.getContext()
            r3.getClass()
            r4 = 7
            int r3 = p000.jx0.m3056(r3, r4)
            float r3 = (float) r3
            int r4 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lb2
            r14 = r3
        Lb2:
            float r3 = r13.f2452
            float r14 = r14 * r3
            int r3 = r13.f2438
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            float r3 = r3 * r2
            android.content.Context r4 = r13.getContext()
            r4.getClass()
            r5 = 2
            int r4 = p000.jx0.m3056(r4, r5)
            float r4 = (float) r4
            float r4 = r4 + r14
            float r2 = r2 - r14
            android.content.Context r6 = r13.getContext()
            r6.getClass()
            int r5 = p000.jx0.m3056(r6, r5)
            float r5 = (float) r5
            float r2 = r2 - r5
            float r2 = p000.j81.m2905(r3, r4, r2)
            r3 = 1054280253(0x3ed70a3d, float:0.42)
            float r3 = r3 * r14
            android.graphics.Paint r4 = r13.f2451
            r4.setStrokeWidth(r3)
            float r3 = r4.getStrokeWidth()
            float r3 = r3 / r0
            float r3 = r3 + r14
            r1.drawCircle(r2, r9, r3, r4)
            android.graphics.Paint r13 = r13.f2450
            r1.drawCircle(r2, r9, r14, r13)
        Lf3:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r3 / r4
            android.graphics.Path r5 = r1.f2442
            r5.reset()
            r0 = 0
            float r2 = (float) r2
            android.graphics.RectF r1 = r1.f2443
            r1.set(r0, r0, r2, r3)
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r5.addRoundRect(r1, r4, r4, r2)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            r3.getClass()
            com.example.dyhelper.ui.γ r0 = new com.example.dyhelper.ui.γ
            r1 = 0
            r0.<init>(r2, r1)
            boolean r0 = com.example.dyhelper.p002ui.C0169.m1582(r2, r3, r0)
            if (r0 == 0) goto L19
            int r3 = r3.getActionMasked()
            r1 = 1
            if (r3 != r1) goto L19
            super.performClick()
        L19:
            return r0
    }

    @Override // android.view.View
    public final boolean performClick() {
            r0 = this;
            super.performClick()
            r0 = 1
            return r0
    }

    @Override // p000.InterfaceC0396ii
    /* JADX INFO: renamed from: α */
    public final void mo1530(boolean r4) {
            r3 = this;
            android.animation.ValueAnimator r0 = r3.f2453
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            if (r4 == 0) goto Ld
            r4 = 1066863165(0x3f970a3d, float:1.18)
            goto Lf
        Ld:
            r4 = 1065353216(0x3f800000, float:1.0)
        Lf:
            float r0 = r3.f2452
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)
            r0 = 150(0x96, double:7.4E-322)
            r4.setDuration(r0)
            com.example.dyhelper.ui.δ r0 = new com.example.dyhelper.ui.δ
            r0.<init>(r3, r2)
            r4.addUpdateListener(r0)
            r4.start()
            r3.f2453 = r4
            return
    }
}
