package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class TopDownloadNotificationManager$BackgroundLayerView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Paint f2572;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.RectF f2573;

    /* JADX INFO: renamed from: η */
    public int f2574;

    /* JADX INFO: renamed from: θ */
    public float f2575;

    public TopDownloadNotificationManager$BackgroundLayerView(android.content.Context r1, p000.g52 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>(r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 1
            r1.<init>(r2)
            r0.f2572 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2573 = r1
            r1 = 225(0xe1, float:3.15E-43)
            r2 = 255(0xff, float:3.57E-43)
            int r1 = android.graphics.Color.argb(r1, r2, r2, r2)
            r0.f2574 = r1
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            android.content.Context r1 = r0.getContext()
            r1.getClass()
            r2 = 1103101952(0x41c00000, float:24.0)
            int r1 = com.example.dyhelper.p002ui.C0182.m1589(r1, r2)
            float r1 = (float) r1
            r0.f2575 = r1
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.getWidth()
            float r0 = (float) r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            android.graphics.RectF r2 = r5.f2573
            r3 = 0
            r2.set(r3, r3, r0, r1)
            android.graphics.Paint r0 = r5.f2572
            r1 = 255(0xff, float:3.57E-43)
            r0.setAlpha(r1)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r0.setStyle(r3)
            int r3 = r5.f2574
            r0.setColor(r3)
            float r3 = r5.f2575
            r6.drawRoundRect(r2, r3, r3, r0)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r0.setStyle(r3)
            android.os.Handler r3 = com.example.dyhelper.p002ui.C0182.f2694
            android.content.Context r3 = r5.getContext()
            r3.getClass()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            int r3 = com.example.dyhelper.p002ui.C0182.m1589(r3, r4)
            float r3 = (float) r3
            r0.setStrokeWidth(r3)
            r3 = 34
            int r1 = android.graphics.Color.argb(r3, r1, r1, r1)
            r0.setColor(r1)
            float r1 = r0.getStrokeWidth()
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            r2.inset(r1, r1)
            float r5 = r5.f2575
            r6.drawRoundRect(r2, r5, r5, r0)
            return
    }
}
