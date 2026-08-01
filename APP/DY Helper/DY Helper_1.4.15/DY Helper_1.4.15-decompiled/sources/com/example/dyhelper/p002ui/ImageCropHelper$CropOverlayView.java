package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ImageCropHelper$CropOverlayView extends android.view.View {

    /* JADX INFO: renamed from: χ */
    public static final /* synthetic */ int f2550 = 0;

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Rect f2551;

    /* JADX INFO: renamed from: ζ */
    public final int f2552;

    /* JADX INFO: renamed from: η */
    public final int f2553;

    /* JADX INFO: renamed from: θ */
    public android.graphics.Bitmap f2554;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Paint f2555;

    /* JADX INFO: renamed from: κ */
    public final android.graphics.Paint f2556;

    /* JADX INFO: renamed from: λ */
    public final android.graphics.Paint f2557;

    /* JADX INFO: renamed from: μ */
    public final android.graphics.Paint f2558;

    /* JADX INFO: renamed from: ν */
    public final android.graphics.Paint f2559;

    /* JADX INFO: renamed from: ξ */
    public final android.graphics.Matrix f2560;

    /* JADX INFO: renamed from: ο */
    public float f2561;

    /* JADX INFO: renamed from: π */
    public float f2562;

    /* JADX INFO: renamed from: ρ */
    public final float f2563;

    /* JADX INFO: renamed from: σ */
    public final android.view.ScaleGestureDetector f2564;

    /* JADX INFO: renamed from: τ */
    public float f2565;

    /* JADX INFO: renamed from: υ */
    public float f2566;

    /* JADX INFO: renamed from: φ */
    public boolean f2567;

    public ImageCropHelper$CropOverlayView(android.app.Activity r2, android.graphics.Bitmap r3, android.graphics.Rect r4, int r5, int r6) {
            r1 = this;
            r3.getClass()
            r1.<init>(r2)
            r1.f2551 = r4
            r1.f2552 = r5
            r1.f2553 = r6
            r1.f2554 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 2
            r3.<init>(r4)
            r1.f2555 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r4 = 1
            r3.<init>(r4)
            r5 = 160(0xa0, float:2.24E-43)
            r6 = 0
            int r5 = android.graphics.Color.argb(r5, r6, r6, r6)
            r3.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r3.setStyle(r5)
            r1.f2556 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r5 = 220(0xdc, float:3.08E-43)
            r6 = 255(0xff, float:3.57E-43)
            int r5 = android.graphics.Color.argb(r5, r6, r6, r6)
            r3.setColor(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            r3.setStrokeWidth(r0)
            r1.f2557 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r0 = -1
            r3.setColor(r0)
            r3.setStyle(r5)
            r0 = 1082130432(0x40800000, float:4.0)
            r3.setStrokeWidth(r0)
            r1.f2558 = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r4)
            r4 = 80
            int r4 = android.graphics.Color.argb(r4, r6, r6, r6)
            r3.setColor(r4)
            r3.setStyle(r5)
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setStrokeWidth(r4)
            r1.f2559 = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r1.f2560 = r3
            r1.f2561 = r4
            r1.f2562 = r4
            r3 = 1084227584(0x40a00000, float:5.0)
            r1.f2563 = r3
            r1.m1564()
            android.view.ScaleGestureDetector r3 = new android.view.ScaleGestureDetector
            com.example.dyhelper.ui.τ r4 = new com.example.dyhelper.ui.τ
            r4.<init>(r1)
            r3.<init>(r2, r4)
            r1.f2564 = r3
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            r14.getClass()
            android.graphics.Bitmap r0 = r13.f2554
            android.graphics.Matrix r1 = r13.f2560
            android.graphics.Paint r2 = r13.f2555
            r14.drawBitmap(r0, r1, r2)
            android.graphics.Rect r0 = r13.f2551
            int r1 = r0.left
            float r3 = (float) r1
            int r1 = r0.top
            float r6 = (float) r1
            int r1 = r0.right
            float r1 = (float) r1
            int r2 = r0.bottom
            float r2 = (float) r2
            int r4 = r13.f2552
            float r7 = (float) r4
            int r4 = r13.f2553
            float r11 = (float) r4
            r5 = 0
            r4 = r6
            r6 = 0
            android.graphics.Paint r9 = r13.f2556
            r8 = r4
            r4 = r14
            r4.drawRect(r5, r6, r7, r8, r9)
            r6 = r8
            r8 = 0
            r10 = r7
            r12 = r9
            r9 = r2
            r7 = r4
            r7.drawRect(r8, r9, r10, r11, r12)
            r5 = r3
            r2 = r7
            r7 = r12
            r3 = 0
            r4 = r6
            r6 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
            r3 = r5
            r8 = r6
            r9 = r7
            r7 = r10
            r5 = r1
            r6 = r4
            r4 = r2
            r4.drawRect(r5, r6, r7, r8, r9)
            r14 = r5
            r9 = r8
            android.graphics.Paint r1 = r13.f2557
            r2.drawRect(r0, r1)
            int r1 = r0.width()
            float r1 = (float) r1
            r4 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r4
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r4
            r4 = 1
            r10 = r4
        L5d:
            r4 = 3
            if (r10 >= r4) goto L7f
            float r11 = (float) r10
            float r4 = r1 * r11
            float r5 = r4 + r3
            android.graphics.Paint r7 = r13.f2559
            r4 = r9
            r9 = r7
            r7 = r5
            r8 = r4
            r4 = r2
            r4.drawLine(r5, r6, r7, r8, r9)
            r12 = r8
            r8 = r6
            float r11 = r11 * r0
            float r4 = r11 + r8
            r6 = r4
            r5 = r14
            r7 = r9
            r2.drawLine(r3, r4, r5, r6, r7)
            int r10 = r10 + 1
            r6 = r8
            r9 = r12
            goto L5d
        L7f:
            r8 = r6
            r12 = r9
            r0 = 1103101952(0x41c00000, float:24.0)
            float r5 = r3 + r0
            android.graphics.Paint r7 = r13.f2558
            r4 = r8
            r2.drawLine(r3, r4, r5, r6, r7)
            r6 = r4
            r13 = r5
            float r8 = r6 + r0
            r5 = r3
            r6 = r8
            r2.drawLine(r3, r4, r5, r6, r7)
            r1 = r6
            r6 = r4
            float r10 = r14 - r0
            r8 = r6
            r5 = r14
            r4 = r2
            r9 = r7
            r7 = r10
            r4.drawLine(r5, r6, r7, r8, r9)
            r7 = r9
            r8 = r1
            r7 = r14
            r4.drawLine(r5, r6, r7, r8, r9)
            r7 = r9
            r6 = r12
            r5 = r13
            r4 = r12
            r2.drawLine(r3, r4, r5, r6, r7)
            r9 = r4
            float r6 = r9 - r0
            r5 = r3
            r2.drawLine(r3, r4, r5, r6, r7)
            r11 = r9
            r8 = r14
            r12 = r7
            r7 = r2
            r7.drawLine(r8, r9, r10, r11, r12)
            r5 = r8
            r7 = r12
            r10 = r5
            r11 = r6
            r7 = r2
            r7.drawLine(r8, r9, r10, r11, r12)
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            int r1 = r0.f2552
            int r2 = r0.f2553
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            r5.getClass()
            android.view.ScaleGestureDetector r0 = r4.f2564
            r0.onTouchEvent(r5)
            int r0 = r5.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto L54
            r2 = 0
            if (r0 == r1) goto L51
            r3 = 2
            if (r0 == r3) goto L21
            r5 = 3
            if (r0 == r5) goto L51
            r5 = 5
            if (r0 == r5) goto L1e
            goto L50
        L1e:
            r4.f2567 = r2
            return r1
        L21:
            boolean r0 = r4.f2567
            if (r0 == 0) goto L50
            int r0 = r5.getPointerCount()
            if (r0 != r1) goto L50
            float r0 = r5.getX()
            float r2 = r4.f2565
            float r0 = r0 - r2
            float r2 = r5.getY()
            float r3 = r4.f2566
            float r2 = r2 - r3
            android.graphics.Matrix r3 = r4.f2560
            r3.postTranslate(r0, r2)
            r4.m1563()
            r4.invalidate()
            float r0 = r5.getX()
            r4.f2565 = r0
            float r5 = r5.getY()
            r4.f2566 = r5
        L50:
            return r1
        L51:
            r4.f2567 = r2
            return r1
        L54:
            r4.f2567 = r1
            float r0 = r5.getX()
            r4.f2565 = r0
            float r5 = r5.getY()
            r4.f2566 = r5
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final void m1563() {
            r7 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.Bitmap r1 = r7.f2554
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.graphics.Bitmap r2 = r7.f2554
            int r2 = r2.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r7.f2560
            r1.mapRect(r0)
            float r2 = r0.width()
            android.graphics.Rect r7 = r7.f2551
            int r4 = r7.width()
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L33
            int r2 = r7.centerX()
            float r2 = (float) r2
            float r4 = r0.centerX()
        L31:
            float r2 = r2 - r4
            goto L4c
        L33:
            float r2 = r0.left
            int r4 = r7.left
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L40
            float r4 = (float) r4
            float r4 = r4 - r2
            r2 = r4
            goto L41
        L40:
            r2 = r3
        L41:
            float r4 = r0.right
            int r5 = r7.right
            float r6 = (float) r5
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L4c
            float r2 = (float) r5
            goto L31
        L4c:
            float r4 = r0.height()
            int r5 = r7.height()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L64
            int r7 = r7.centerY()
            float r7 = (float) r7
            float r0 = r0.centerY()
        L62:
            float r7 = r7 - r0
            goto L7d
        L64:
            float r4 = r0.top
            int r5 = r7.top
            float r6 = (float) r5
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L70
            float r5 = (float) r5
            float r5 = r5 - r4
            goto L71
        L70:
            r5 = r3
        L71:
            float r0 = r0.bottom
            int r7 = r7.bottom
            float r4 = (float) r7
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L7c
            float r7 = (float) r7
            goto L62
        L7c:
            r7 = r5
        L7d:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L86
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L86
            return
        L86:
            r1.postTranslate(r2, r7)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1564() {
            r5 = this;
            android.graphics.Matrix r0 = r5.f2560
            r0.reset()
            android.graphics.Rect r1 = r5.f2551
            int r2 = r1.width()
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r5.f2554
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r3 = r1.height()
            float r3 = (float) r3
            android.graphics.Bitmap r4 = r5.f2554
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = java.lang.Math.max(r2, r3)
            r5.f2561 = r2
            r5.f2562 = r2
            int r2 = r1.centerX()
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r5.f2554
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r4 = r5.f2561
            float r3 = r3 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 - r3
            int r1 = r1.centerY()
            float r1 = (float) r1
            android.graphics.Bitmap r3 = r5.f2554
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r5 = r5.f2561
            float r3 = r3 * r5
            float r3 = r3 / r4
            float r1 = r1 - r3
            r0.postScale(r5, r5)
            r0.postTranslate(r2, r1)
            return
    }
}
