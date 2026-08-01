package com.example.dyhelper.hook.panel;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CopyIconView extends com.example.dyhelper.hook.panel.BaseIconView {
    public CopyIconView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r10) {
            r9 = this;
            r10.getClass()
            super.onDraw(r10)
            int r0 = r9.getWidth()
            float r0 = (float) r0
            int r1 = r9.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lce
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1b
            goto Lce
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
            float r3 = r1 / r3
            android.graphics.Paint r5 = r9.getPaint()
            int r6 = r9.getIconColor()
            r5.setColor(r6)
            android.graphics.Paint r5 = r9.getPaint()
            r5.setStrokeWidth(r2)
            android.graphics.Paint r2 = r9.getPaint()
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r5)
            float r0 = java.lang.Math.min(r0, r1)
            r1 = 1058642330(0x3f19999a, float:0.6)
            float r0 = r0 * r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            android.graphics.Path r2 = r9.getPath()
            r2.reset()
            android.graphics.Path r2 = r9.getPath()
            r5 = 2
            float r5 = (float) r5
            float r0 = r0 / r5
            float r5 = r4 - r0
            float r6 = r5 + r1
            float r7 = r3 - r0
            r2.moveTo(r6, r7)
            android.graphics.Path r2 = r9.getPath()
            float r4 = r4 + r0
            float r8 = r4 + r1
            r2.lineTo(r8, r7)
            android.graphics.Path r2 = r9.getPath()
            float r3 = r3 + r0
            r2.lineTo(r8, r3)
            android.graphics.Path r0 = r9.getPath()
            r0.lineTo(r6, r3)
            android.graphics.Path r0 = r9.getPath()
            r0.close()
            android.graphics.Path r0 = r9.getPath()
            android.graphics.Paint r2 = r9.getPaint()
            r10.drawPath(r0, r2)
            android.graphics.Path r0 = r9.getPath()
            r0.reset()
            android.graphics.Path r0 = r9.getPath()
            float r7 = r7 - r1
            r0.moveTo(r5, r7)
            android.graphics.Path r0 = r9.getPath()
            r0.lineTo(r4, r7)
            android.graphics.Path r0 = r9.getPath()
            float r3 = r3 - r1
            r0.lineTo(r4, r3)
            android.graphics.Path r0 = r9.getPath()
            r0.lineTo(r5, r3)
            android.graphics.Path r0 = r9.getPath()
            r0.close()
            android.graphics.Path r0 = r9.getPath()
            android.graphics.Paint r9 = r9.getPaint()
            r10.drawPath(r0, r9)
        Lce:
            return
    }
}
