package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ColorPickerDialog$HueBar extends android.view.View implements p000.InterfaceC0396ii {

    /* JADX INFO: renamed from: π */
    public static final /* synthetic */ int f2491 = 0;

    /* JADX INFO: renamed from: ε */
    public float f2492;

    /* JADX INFO: renamed from: ζ */
    public com.example.dyhelper.p002ui.C0163 f2493;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Paint f2494;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Path f2495;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.RectF f2496;

    /* JADX INFO: renamed from: κ */
    public android.graphics.LinearGradient f2497;

    /* JADX INFO: renamed from: λ */
    public final android.graphics.Paint f2498;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Paint f2499;

    /* JADX INFO: renamed from: ν */
    public final android.graphics.Paint f2500;

    /* JADX INFO: renamed from: ξ */
    public float f2501;

    /* JADX INFO: renamed from: ο */
    public android.animation.ValueAnimator f2502;

    public ColorPickerDialog$HueBar(android.content.Context r5, p000.C1000xx r6) {
            r4 = this;
            r5.getClass()
            r4.<init>(r5)
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 1
            r0.<init>(r1)
            r4.f2494 = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.f2495 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.f2496 = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r2)
            int r3 = p000.jx0.m3056(r5, r1)
            float r3 = (float) r3
            r0.setStrokeWidth(r3)
            java.lang.String r6 = r6.f12353
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setColor(r6)
            r4.f2498 = r0
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r1)
            r6.setStyle(r2)
            r0 = 2
            int r5 = p000.jx0.m3056(r5, r0)
            float r5 = (float) r5
            r6.setStrokeWidth(r5)
            r5 = -1
            r6.setColor(r5)
            r4.f2499 = r6
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>(r1)
            r5.setStyle(r2)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setColor(r6)
            r6 = 90
            r5.setAlpha(r6)
            r4.f2500 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.f2501 = r5
            java.lang.String r5 = "色相选择轨道"
            r4.setContentDescription(r5)
            r4.setFocusable(r1)
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            android.animation.ValueAnimator r0 = r1.f2502
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            r0 = 0
            r1.f2502 = r0
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
            if (r1 <= 0) goto Lbe
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
            goto Lbe
        L1b:
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r5 / r0
            int r8 = r10.save()
            android.graphics.Path r1 = r9.f2495
            r10.clipPath(r1)
            android.graphics.LinearGradient r1 = r9.f2497
            android.graphics.Paint r6 = r9.f2494
            r6.setShader(r1)
            r2 = 0
            r3 = 0
            r1 = r10
            r1.drawRect(r2, r3, r4, r5, r6)
            r10 = 0
            r6.setShader(r10)
            r1.restoreToCount(r8)
            android.graphics.Paint r10 = r9.f2498
            float r2 = r10.getStrokeWidth()
            float r2 = r2 / r0
            float r3 = r10.getStrokeWidth()
            float r3 = r3 / r0
            float r6 = r10.getStrokeWidth()
            float r6 = r6 / r0
            float r6 = r4 - r6
            float r8 = r10.getStrokeWidth()
            float r8 = r8 / r0
            float r5 = r5 - r8
            android.graphics.RectF r8 = r9.f2496
            r8.set(r2, r3, r6, r5)
            r1.drawRoundRect(r8, r7, r7, r10)
            android.content.Context r10 = r9.getContext()
            r10.getClass()
            r2 = 3
            int r10 = p000.jx0.m3056(r10, r2)
            float r10 = (float) r10
            float r10 = r7 - r10
            android.content.Context r2 = r9.getContext()
            r2.getClass()
            r3 = 7
            int r2 = p000.jx0.m3056(r2, r3)
            float r2 = (float) r2
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L7e
            r10 = r2
        L7e:
            float r2 = r9.f2501
            float r10 = r10 * r2
            float r2 = r9.f2492
            r3 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 / r3
            float r2 = r2 * r4
            android.content.Context r3 = r9.getContext()
            r3.getClass()
            r5 = 2
            int r3 = p000.jx0.m3056(r3, r5)
            float r3 = (float) r3
            float r3 = r3 + r10
            float r4 = r4 - r10
            android.content.Context r6 = r9.getContext()
            r6.getClass()
            int r5 = p000.jx0.m3056(r6, r5)
            float r5 = (float) r5
            float r4 = r4 - r5
            float r2 = p000.j81.m2905(r2, r3, r4)
            r3 = 1054280253(0x3ed70a3d, float:0.42)
            float r3 = r3 * r10
            android.graphics.Paint r4 = r9.f2500
            r4.setStrokeWidth(r3)
            float r3 = r4.getStrokeWidth()
            float r3 = r3 / r0
            float r3 = r3 + r10
            r1.drawCircle(r2, r7, r3, r4)
            android.graphics.Paint r9 = r9.f2499
            r1.drawCircle(r2, r7, r10, r9)
        Lbe:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r9, int r10, int r11, int r12) {
            r8 = this;
            super.onSizeChanged(r9, r10, r11, r12)
            float r10 = (float) r10
            r11 = 1073741824(0x40000000, float:2.0)
            float r11 = r10 / r11
            android.graphics.Path r12 = r8.f2495
            r12.reset()
            float r3 = (float) r9
            android.graphics.RectF r9 = r8.f2496
            r0 = 0
            r9.set(r0, r0, r3, r10)
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CW
            r12.addRoundRect(r9, r11, r11, r10)
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient
            r9 = 7
            int[] r5 = new int[r9]
            r5 = {x002e: FILL_ARRAY_DATA , data: [-65536, -256, -16711936, -16711681, -16776961, -65281, -65536} // fill-array
            r6 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r1 = 0
            r2 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f2497 = r0
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            r3.getClass()
            com.example.dyhelper.ui.γ r0 = new com.example.dyhelper.ui.γ
            r1 = 1
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
            android.animation.ValueAnimator r0 = r3.f2502
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            if (r4 == 0) goto Ld
            r4 = 1066863165(0x3f970a3d, float:1.18)
            goto Lf
        Ld:
            r4 = 1065353216(0x3f800000, float:1.0)
        Lf:
            float r0 = r3.f2501
            r1 = 2
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r1)
            r1 = 150(0x96, double:7.4E-322)
            r4.setDuration(r1)
            com.example.dyhelper.ui.δ r1 = new com.example.dyhelper.ui.δ
            r1.<init>(r3, r0)
            r4.addUpdateListener(r1)
            r4.start()
            r3.f2502 = r4
            return
    }
}
