package com.example.dyhelper.hook.panel;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class HeartIconView extends com.example.dyhelper.hook.panel.BaseIconView {
    public HeartIconView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            r13.getClass()
            super.onDraw(r13)
            int r0 = r12.getWidth()
            float r0 = (float) r0
            int r1 = r12.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto La2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1b
            goto La2
        L1b:
            float r2 = java.lang.Math.min(r0, r1)
            r3 = 1033476506(0x3d99999a, float:0.075)
            float r2 = r2 * r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L2a
            r2 = r3
        L2a:
            float r9 = r0 / r3
            float r6 = r1 / r3
            android.graphics.Paint r3 = r12.getPaint()
            int r4 = r12.getIconColor()
            r3.setColor(r4)
            android.graphics.Paint r3 = r12.getPaint()
            r3.setStrokeWidth(r2)
            android.graphics.Paint r2 = r12.getPaint()
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.Path r2 = r12.getPath()
            r2.reset()
            float r0 = java.lang.Math.min(r0, r1)
            r1 = 1025758986(0x3d23d70a, float:0.04)
            float r0 = r0 * r1
            android.graphics.Path r1 = r12.getPath()
            r2 = 3
            float r2 = (float) r2
            float r2 = r2 * r0
            float r3 = r6 + r2
            r1.moveTo(r9, r3)
            android.graphics.Path r4 = r12.getPath()
            r1 = 6
            float r1 = (float) r1
            float r1 = r1 * r0
            float r5 = r9 - r1
            r7 = 9
            float r7 = (float) r7
            float r7 = r7 * r0
            float r8 = r7 + r6
            r7 = 12
            float r7 = (float) r7
            float r0 = r0 * r7
            float r7 = r9 - r0
            float r10 = r6 - r2
            r11 = r8
            r8 = r6
            r6 = r11
            r4.cubicTo(r5, r6, r7, r8, r9, r10)
            r11 = r8
            r8 = r6
            r6 = r11
            android.graphics.Path r4 = r12.getPath()
            float r5 = r9 + r0
            float r7 = r9 + r1
            r10 = r3
            r4.cubicTo(r5, r6, r7, r8, r9, r10)
            android.graphics.Path r0 = r12.getPath()
            r0.close()
            android.graphics.Path r0 = r12.getPath()
            android.graphics.Paint r12 = r12.getPaint()
            r13.drawPath(r0, r12)
        La2:
            return
    }
}
