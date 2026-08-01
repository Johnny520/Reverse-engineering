package com.example.dyhelper.hook.panel;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class EyeIconView extends com.example.dyhelper.hook.panel.BaseIconView {
    public EyeIconView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            r14.getClass()
            super.onDraw(r14)
            int r0 = r13.getWidth()
            float r0 = (float) r0
            int r1 = r13.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto Laa
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1b
            goto Laa
        L1b:
            float r2 = java.lang.Math.min(r0, r1)
            r3 = 1033476506(0x3d99999a, float:0.075)
            float r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L2a
            r2 = r3
        L2a:
            float r4 = r0 / r3
            float r11 = r1 / r3
            android.graphics.Paint r5 = r13.getPaint()
            int r6 = r13.getIconColor()
            r5.setColor(r6)
            android.graphics.Paint r5 = r13.getPaint()
            r5.setStrokeWidth(r2)
            android.graphics.Paint r2 = r13.getPaint()
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r5)
            r2 = 1061662228(0x3f47ae14, float:0.78)
            float r2 = r2 * r0
            r5 = 1055286886(0x3ee66666, float:0.45)
            float r5 = r5 * r1
            float r6 = r2 / r3
            float r12 = r4 - r6
            float r10 = r4 + r6
            float r5 = r5 / r3
            float r7 = r11 - r5
            float r3 = r11 + r5
            android.graphics.Path r5 = r13.getPath()
            r5.reset()
            android.graphics.Path r5 = r13.getPath()
            r5.moveTo(r12, r11)
            android.graphics.Path r5 = r13.getPath()
            r6 = 1046562734(0x3e6147ae, float:0.22)
            float r2 = r2 * r6
            float r6 = r12 + r2
            float r8 = r10 - r2
            r9 = r7
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            android.graphics.Path r5 = r13.getPath()
            r9 = r3
            r7 = r8
            r8 = r6
            r6 = r7
            r7 = r3
            r10 = r12
            r5.cubicTo(r6, r7, r8, r9, r10, r11)
            android.graphics.Path r2 = r13.getPath()
            android.graphics.Paint r3 = r13.getPaint()
            r14.drawPath(r2, r3)
            android.graphics.Paint r2 = r13.getPaint()
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            float r0 = java.lang.Math.min(r0, r1)
            r1 = 1040522936(0x3e051eb8, float:0.13)
            float r0 = r0 * r1
            android.graphics.Paint r13 = r13.getPaint()
            r14.drawCircle(r4, r11, r0, r13)
        Laa:
            return
    }
}
