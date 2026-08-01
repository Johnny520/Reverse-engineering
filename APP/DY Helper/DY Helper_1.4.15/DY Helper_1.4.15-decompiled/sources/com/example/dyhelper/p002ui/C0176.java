package com.example.dyhelper.p002ui;

/* JADX INFO: renamed from: com.example.dyhelper.ui.τ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0176 extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ com.example.dyhelper.p002ui.ImageCropHelper$CropOverlayView f2685;

    public C0176(com.example.dyhelper.p002ui.ImageCropHelper$CropOverlayView r1) {
            r0 = this;
            r0.f2685 = r1
            r0.<init>()
            return
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(android.view.ScaleGestureDetector r5) {
            r4 = this;
            r5.getClass()
            float r0 = r5.getScaleFactor()
            com.example.dyhelper.ui.ImageCropHelper$CropOverlayView r4 = r4.f2685
            float r1 = r4.f2562
            float r1 = r1 * r0
            float r2 = r4.f2561
            float r3 = r4.f2563
            float r3 = r3 * r2
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L2e
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L2e
            android.graphics.Matrix r2 = r4.f2560
            float r3 = r5.getFocusX()
            float r5 = r5.getFocusY()
            r2.postScale(r0, r0, r3, r5)
            r4.f2562 = r1
            r4.m1563()
            r4.invalidate()
        L2e:
            r4 = 1
            return r4
    }
}
