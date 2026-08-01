package com.example.dyhelper.hook.panel;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class StarIconView extends com.example.dyhelper.hook.panel.BaseIconView {
    public StarIconView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r15) {
            r14 = this;
            r15.getClass()
            super.onDraw(r15)
            int r0 = r14.getWidth()
            float r0 = (float) r0
            int r1 = r14.getHeight()
            float r1 = (float) r1
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto Lac
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L1b
            goto Lac
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
            android.graphics.Paint r5 = r14.getPaint()
            int r6 = r14.getIconColor()
            r5.setColor(r6)
            android.graphics.Paint r5 = r14.getPaint()
            r5.setStrokeWidth(r2)
            android.graphics.Paint r2 = r14.getPaint()
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r2.setStyle(r5)
            android.graphics.Path r2 = r14.getPath()
            r2.reset()
            float r0 = java.lang.Math.min(r0, r1)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 * r1
            float r1 = r1 * r0
            r2 = 0
        L5a:
            r5 = 10
            if (r2 >= r5) goto L9a
            int r5 = r2 % 2
            if (r5 != 0) goto L64
            r5 = r0
            goto L65
        L64:
            r5 = r1
        L65:
            double r6 = (double) r2
            r8 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 * r8
            r8 = 5
            double r8 = (double) r8
            double r6 = r6 / r8
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 + r8
            double r8 = (double) r4
            double r10 = (double) r5
            double r12 = java.lang.Math.cos(r6)
            double r12 = r12 * r10
            double r12 = r12 + r8
            float r5 = (float) r12
            double r8 = (double) r3
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r10
            double r8 = r8 - r6
            float r6 = (float) r8
            if (r2 != 0) goto L90
            android.graphics.Path r7 = r14.getPath()
            r7.moveTo(r5, r6)
            goto L97
        L90:
            android.graphics.Path r7 = r14.getPath()
            r7.lineTo(r5, r6)
        L97:
            int r2 = r2 + 1
            goto L5a
        L9a:
            android.graphics.Path r0 = r14.getPath()
            r0.close()
            android.graphics.Path r0 = r14.getPath()
            android.graphics.Paint r14 = r14.getPaint()
            r15.drawPath(r0, r14)
        Lac:
            return
    }
}
