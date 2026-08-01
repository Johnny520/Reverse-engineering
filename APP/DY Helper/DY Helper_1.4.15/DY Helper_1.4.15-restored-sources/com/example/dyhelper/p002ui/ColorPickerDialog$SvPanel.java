package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ColorPickerDialog$SvPanel extends android.view.View implements p000.InterfaceC0396ii {

    /* JADX INFO: renamed from: χ */
    public static final /* synthetic */ int f2504 = 0;

    /* JADX INFO: renamed from: ε */
    public float f2505;

    /* JADX INFO: renamed from: ζ */
    public float f2506;

    /* JADX INFO: renamed from: η */
    public float f2507;

    /* JADX INFO: renamed from: θ */
    public com.example.dyhelper.p002ui.C0166 f2508;

    /* JADX INFO: renamed from: ι */
    public android.graphics.LinearGradient f2509;

    /* JADX INFO: renamed from: κ */
    public android.graphics.LinearGradient f2510;

    /* JADX INFO: renamed from: λ */
    public final android.graphics.Paint f2511;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Path f2512;

    /* JADX INFO: renamed from: ν */
    public final android.graphics.RectF f2513;

    /* JADX INFO: renamed from: ξ */
    public final float f2514;

    /* JADX INFO: renamed from: ο */
    public final android.graphics.Paint f2515;

    /* JADX INFO: renamed from: π */
    public final android.graphics.Paint f2516;

    /* JADX INFO: renamed from: ρ */
    public final android.graphics.Paint f2517;

    /* JADX INFO: renamed from: σ */
    public final float f2518;

    /* JADX INFO: renamed from: τ */
    public final float f2519;

    /* JADX INFO: renamed from: υ */
    public float f2520;

    /* JADX INFO: renamed from: φ */
    public android.animation.ValueAnimator f2521;

    public ColorPickerDialog$SvPanel(android.content.Context r6, p000.C1000xx r7) {
            r5 = this;
            r6.getClass()
            r5.<init>(r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.f2506 = r0
            r5.f2507 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r5.f2511 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r5.f2512 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.f2513 = r0
            r0 = 10
            int r2 = p000.jx0.m3056(r6, r0)
            float r2 = (float) r2
            r5.f2514 = r2
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
            r5.f2515 = r2
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r1)
            r7.setStyle(r3)
            r2 = 2
            int r2 = p000.jx0.m3056(r6, r2)
            float r2 = (float) r2
            r7.setStrokeWidth(r2)
            r2 = -1
            r7.setColor(r2)
            r5.f2516 = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r1)
            r7.setStyle(r3)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r7.setColor(r2)
            r2 = 90
            r7.setAlpha(r2)
            r5.f2517 = r7
            int r7 = p000.jx0.m3056(r6, r0)
            float r7 = (float) r7
            r5.f2518 = r7
            r0 = 13
            int r6 = p000.jx0.m3056(r6, r0)
            float r6 = (float) r6
            r5.f2519 = r6
            r5.f2520 = r7
            java.lang.String r6 = "饱和度和明度选择区域"
            r5.setContentDescription(r6)
            r5.setFocusable(r1)
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f2521
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            r1.f2521 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            r10.getClass()
            super.onDraw(r10)
            int r0 = r9.getWidth()
            float r4 = (float) r0
            int r0 = r9.getHeight()
            float r5 = (float) r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 <= 0) goto La6
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto La6
        L1b:
            int r0 = r10.save()
            android.graphics.Path r1 = r9.f2512
            r10.clipPath(r1)
            android.graphics.LinearGradient r1 = r9.f2509
            android.graphics.Paint r6 = r9.f2511
            r6.setShader(r1)
            r2 = 0
            r3 = 0
            r1 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
            android.graphics.LinearGradient r10 = r9.f2510
            r6.setShader(r10)
            r1.drawRect(r2, r3, r4, r5, r6)
            r10 = 0
            r6.setShader(r10)
            r1.restoreToCount(r0)
            android.graphics.Paint r10 = r9.f2515
            float r0 = r10.getStrokeWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r3 = r10.getStrokeWidth()
            float r3 = r3 / r2
            float r6 = r10.getStrokeWidth()
            float r6 = r6 / r2
            float r6 = r4 - r6
            float r7 = r10.getStrokeWidth()
            float r7 = r7 / r2
            float r7 = r5 - r7
            android.graphics.RectF r8 = r9.f2513
            r8.set(r0, r3, r6, r7)
            float r0 = r9.f2514
            r1.drawRoundRect(r8, r0, r0, r10)
            float r10 = r9.f2520
            android.content.Context r0 = r9.getContext()
            r0.getClass()
            r3 = 2
            int r0 = p000.jx0.m3056(r0, r3)
            float r0 = (float) r0
            float r10 = r10 + r0
            float r0 = r9.f2506
            float r0 = r0 * r4
            float r4 = r4 - r10
            float r0 = p000.j81.m2905(r0, r10, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r9.f2507
            float r3 = r3 - r4
            float r3 = r3 * r5
            float r5 = r5 - r10
            float r10 = p000.j81.m2905(r3, r10, r5)
            float r3 = r9.f2520
            r4 = 1054280253(0x3ed70a3d, float:0.42)
            float r3 = r3 * r4
            android.graphics.Paint r4 = r9.f2517
            r4.setStrokeWidth(r3)
            float r3 = r9.f2520
            float r5 = r4.getStrokeWidth()
            float r5 = r5 / r2
            float r5 = r5 + r3
            r1.drawCircle(r0, r10, r5, r4)
            float r2 = r9.f2520
            android.graphics.Paint r9 = r9.f2516
            r1.drawCircle(r0, r10, r2, r9)
        La6:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r14, int r15, int r16, int r17) {
            r13 = this;
            super.onSizeChanged(r14, r15, r16, r17)
            android.graphics.Path r0 = r13.f2512
            r0.reset()
            float r4 = (float) r14
            float r9 = (float) r15
            android.graphics.RectF r14 = r13.f2513
            r15 = 0
            r14.set(r15, r15, r4, r9)
            float r15 = r13.f2514
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r0.addRoundRect(r14, r15, r15, r1)
            android.graphics.LinearGradient r5 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.f2510 = r5
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r14 = r13.f2505
            r15 = 3
            float[] r15 = new float[r15]
            r0 = 0
            r15[r0] = r14
            r14 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
            r15[r14] = r0
            r14 = 2
            r15[r14] = r0
            int r7 = android.graphics.Color.HSVToColor(r15)
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = -1
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.f2509 = r1
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            r3.getClass()
            com.example.dyhelper.ui.γ r0 = new com.example.dyhelper.ui.γ
            r1 = 2
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
    public final void mo1530(boolean r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f2521
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            if (r5 == 0) goto Lc
            float r5 = r4.f2519
            goto Le
        Lc:
            float r5 = r4.f2518
        Le:
            float r0 = r4.f2520
            r1 = 2
            float[] r2 = new float[r1]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r2)
            r2 = 150(0x96, double:7.4E-322)
            r5.setDuration(r2)
            com.example.dyhelper.ui.δ r0 = new com.example.dyhelper.ui.δ
            r0.<init>(r4, r1)
            r5.addUpdateListener(r0)
            r5.start()
            r4.f2521 = r5
            return
    }
}
