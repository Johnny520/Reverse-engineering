package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class ColorPickerDialog$ColorPreviewView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public int f2483;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.Paint f2484;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Paint f2485;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Path f2486;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.RectF f2487;

    /* JADX INFO: renamed from: κ */
    public final float f2488;

    /* JADX INFO: renamed from: λ */
    public final int f2489;

    /* JADX INFO: renamed from: μ */
    public final int f2490;

    public ColorPickerDialog$ColorPreviewView(android.content.Context r3, int r4, p000.C1000xx r5) {
            r2 = this;
            r3.getClass()
            r2.<init>(r3)
            r2.f2483 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = 1
            r4.<init>(r0)
            r2.f2484 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r1)
            int r0 = p000.jx0.m3056(r3, r0)
            float r0 = (float) r0
            r4.setStrokeWidth(r0)
            java.lang.String r0 = r5.f12353
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setColor(r0)
            r2.f2485 = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r2.f2486 = r4
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r2.f2487 = r4
            r4 = 10
            int r3 = p000.jx0.m3056(r3, r4)
            float r3 = (float) r3
            r2.f2488 = r3
            java.lang.String r3 = r5.f12352
            int r3 = android.graphics.Color.parseColor(r3)
            r2.f2489 = r3
            java.lang.String r3 = r5.f12354
            int r3 = android.graphics.Color.parseColor(r3)
            r2.f2490 = r3
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r8) {
            r7 = this;
            r8.getClass()
            super.onDraw(r8)
            int r0 = r7.getWidth()
            float r2 = (float) r0
            int r0 = r7.getHeight()
            float r3 = (float) r0
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto L63
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1a
            goto L63
        L1a:
            int r0 = r8.save()
            android.graphics.Path r1 = r7.f2486
            r8.clipPath(r1)
            int r5 = r7.f2489
            int r6 = r7.f2490
            android.graphics.Paint r4 = r7.f2484
            r1 = r8
            com.example.dyhelper.p002ui.C0169.m1581(r1, r2, r3, r4, r5, r6)
            int r8 = r7.f2483
            r4.setColor(r8)
            r6 = r4
            r4 = r2
            r2 = 0
            r5 = r3
            r3 = 0
            r1.drawRect(r2, r3, r4, r5, r6)
            r2 = r4
            r3 = r5
            r1.restoreToCount(r0)
            android.graphics.Paint r8 = r7.f2485
            float r0 = r8.getStrokeWidth()
            r4 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r4
            float r5 = r8.getStrokeWidth()
            float r5 = r5 / r4
            float r6 = r8.getStrokeWidth()
            float r6 = r6 / r4
            float r2 = r2 - r6
            float r6 = r8.getStrokeWidth()
            float r6 = r6 / r4
            float r3 = r3 - r6
            android.graphics.RectF r4 = r7.f2487
            r4.set(r0, r5, r2, r3)
            float r7 = r7.f2488
            r1.drawRoundRect(r4, r7, r7, r8)
        L63:
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r2, int r3, int r4, int r5) {
            r1 = this;
            super.onSizeChanged(r2, r3, r4, r5)
            android.graphics.Path r4 = r1.f2486
            r4.reset()
            float r2 = (float) r2
            float r3 = (float) r3
            android.graphics.RectF r5 = r1.f2487
            r0 = 0
            r5.set(r0, r0, r2, r3)
            float r1 = r1.f2488
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r4.addRoundRect(r5, r1, r1, r2)
            return
    }
}
