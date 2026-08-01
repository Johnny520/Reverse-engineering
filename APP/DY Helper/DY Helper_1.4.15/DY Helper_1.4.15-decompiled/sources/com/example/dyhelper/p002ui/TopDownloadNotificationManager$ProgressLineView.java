package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class TopDownloadNotificationManager$ProgressLineView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public int f2583;

    /* JADX INFO: renamed from: ζ */
    public int f2584;

    /* JADX INFO: renamed from: η */
    public p000.f52 f2585;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Paint f2586;

    public TopDownloadNotificationManager$ProgressLineView(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            r2 = -1
            r1.f2583 = r2
            r2 = -15103494(0xffffffffff1989fa, float:-2.040883E38)
            r1.f2584 = r2
            f52 r2 = p000.f52.f3753
            r1.f2585 = r2
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 1
            r2.<init>(r0)
            r1.f2586 = r2
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            r10.getClass()
            int r0 = r9.getHeight()
            float r5 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r6 = r5 / r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            android.graphics.Paint r8 = r9.f2586
            r8.setStyle(r0)
            r0 = -1644308(0xffffffffffe6e8ec, float:NaN)
            r8.setColor(r0)
            int r0 = r9.getWidth()
            float r4 = (float) r0
            r2 = 0
            r3 = 0
            r7 = r6
            r1 = r10
            r1.drawRoundRect(r2, r3, r4, r5, r6, r7, r8)
            f52 r10 = r9.f2585
            f52 r0 = p000.f52.f3755
            if (r10 != r0) goto L2f
            r10 = -1750963(0xffffffffffe5484d, float:NaN)
            goto L31
        L2f:
            int r10 = r9.f2584
        L31:
            r8.setColor(r10)
            f52 r10 = r9.f2585
            f52 r0 = p000.f52.f3754
            if (r10 != r0) goto L40
            int r9 = r9.getWidth()
            float r9 = (float) r9
            goto L60
        L40:
            int r10 = r9.f2583
            if (r10 < 0) goto L57
            int r10 = r9.getWidth()
            int r9 = r9.f2583
            r0 = 0
            r2 = 100
            int r9 = p000.j81.m2906(r9, r0, r2)
            int r9 = r9 * r10
            float r9 = (float) r9
            r10 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r10
            goto L60
        L57:
            int r9 = r9.getWidth()
            float r9 = (float) r9
            r10 = 1052266988(0x3eb851ec, float:0.36)
            float r9 = r9 * r10
        L60:
            r3 = 0
            float r4 = java.lang.Math.max(r6, r9)
            r2 = 0
            r7 = r6
            r1.drawRoundRect(r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
