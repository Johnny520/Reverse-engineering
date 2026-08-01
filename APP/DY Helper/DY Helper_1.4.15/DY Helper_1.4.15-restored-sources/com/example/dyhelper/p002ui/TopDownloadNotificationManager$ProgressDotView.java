package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class TopDownloadNotificationManager$ProgressDotView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public boolean f2577;

    /* JADX INFO: renamed from: ζ */
    public int f2578;

    /* JADX INFO: renamed from: η */
    public int f2579;

    /* JADX INFO: renamed from: θ */
    public p000.f52 f2580;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Paint f2581;

    /* JADX INFO: renamed from: κ */
    public final android.graphics.RectF f2582;

    public TopDownloadNotificationManager$ProgressDotView(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            r2 = -1
            r1.f2578 = r2
            r2 = -15103494(0xffffffffff1989fa, float:-2.040883E38)
            r1.f2579 = r2
            f52 r2 = p000.f52.f3753
            r1.f2580 = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 1
            r2.<init>(r0)
            r1.f2581 = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.f2582 = r2
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            r13.getClass()
            super.onDraw(r13)
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            int r0 = java.lang.Math.min(r0, r1)
            float r0 = (float) r0
            int r1 = r12.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r12.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r4 = r12.f2577
            r5 = 1078774989(0x404ccccd, float:3.2)
            if (r4 == 0) goto L2a
            r4 = r5
            goto L2d
        L2a:
            r4 = 1077097267(0x40333333, float:2.8)
        L2d:
            android.os.Handler r6 = com.example.dyhelper.p002ui.C0182.f2694
            android.content.Context r6 = r12.getContext()
            r6.getClass()
            int r4 = com.example.dyhelper.p002ui.C0182.m1589(r6, r4)
            float r4 = (float) r4
            float r0 = r0 / r2
            float r0 = r0 - r4
            android.content.Context r2 = r12.getContext()
            r2.getClass()
            r6 = 1069547520(0x3fc00000, float:1.5)
            int r2 = com.example.dyhelper.p002ui.C0182.m1589(r2, r6)
            float r2 = (float) r2
            float r0 = r0 - r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL
            android.graphics.Paint r11 = r12.f2581
            r11.setStyle(r2)
            r6 = -1
            r11.setColor(r6)
            r13.drawCircle(r1, r3, r0, r11)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r11.setStyle(r6)
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.ROUND
            r11.setStrokeCap(r6)
            r11.setStrokeWidth(r4)
            r4 = -1644308(0xffffffffffe6e8ec, float:NaN)
            r11.setColor(r4)
            float r4 = r1 - r0
            float r6 = r3 - r0
            float r7 = r1 + r0
            float r0 = r0 + r3
            r8 = r7
            android.graphics.RectF r7 = r12.f2582
            r7.set(r4, r6, r8, r0)
            r9 = 1135869952(0x43b40000, float:360.0)
            r10 = 0
            r8 = 0
            r6 = r13
            r6.drawArc(r7, r8, r9, r10, r11)
            f52 r13 = r12.f2580
            r0 = -1750963(0xffffffffffe5484d, float:NaN)
            f52 r4 = p000.f52.f3755
            if (r13 != r4) goto L8d
            r13 = r0
            goto L8f
        L8d:
            int r13 = r12.f2579
        L8f:
            r11.setColor(r13)
            f52 r13 = r12.f2580
            f52 r8 = p000.f52.f3754
            if (r13 != r8) goto L9c
            r13 = 1135869952(0x43b40000, float:360.0)
        L9a:
            r9 = r13
            goto Lb0
        L9c:
            int r13 = r12.f2578
            if (r13 < 0) goto Lad
            r8 = 0
            r9 = 100
            int r13 = p000.j81.m2906(r13, r8, r9)
            float r13 = (float) r13
            r8 = 1080452710(0x40666666, float:3.6)
            float r13 = r13 * r8
            goto L9a
        Lad:
            r13 = 1119354880(0x42b80000, float:92.0)
            goto L9a
        Lb0:
            r8 = 0
            r10 = 0
            r6.drawArc(r7, r8, r9, r10, r11)
            r11.setStyle(r2)
            f52 r13 = r12.f2580
            if (r13 != r4) goto Lbd
            goto Lbf
        Lbd:
            int r0 = r12.f2579
        Lbf:
            r11.setColor(r0)
            boolean r13 = r12.f2577
            if (r13 == 0) goto Lc7
            goto Lca
        Lc7:
            r5 = 1076258406(0x40266666, float:2.6)
        Lca:
            android.content.Context r12 = r12.getContext()
            r12.getClass()
            int r12 = com.example.dyhelper.p002ui.C0182.m1589(r12, r5)
            float r12 = (float) r12
            r6.drawCircle(r1, r3, r12, r11)
            return
    }
}
