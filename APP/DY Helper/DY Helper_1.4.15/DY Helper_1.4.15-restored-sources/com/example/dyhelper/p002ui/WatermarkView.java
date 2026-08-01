package com.example.dyhelper.p002ui;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class WatermarkView extends android.view.View {

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Paint f2624;

    /* JADX INFO: renamed from: ζ */
    public java.lang.String f2625;

    public WatermarkView(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r0 = 1
            r2.setAntiAlias(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r2.setTextAlign(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            r1.f2624 = r2
            java.lang.String r2 = ""
            r1.f2625 = r2
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r13) {
            r12 = this;
            r13.getClass()
            super.onDraw(r13)
            java.lang.String r0 = r12.f2625
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L10
            goto Lc0
        L10:
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            if (r0 <= 0) goto Lc0
            if (r1 > 0) goto L1e
            goto Lc0
        L1e:
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r3 = 32
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L37
            r2 = 160(0xa0, float:2.24E-43)
            int r2 = android.graphics.Color.argb(r2, r4, r4, r4)
            goto L3d
        L37:
            r2 = 222(0xde, float:3.11E-43)
            int r2 = android.graphics.Color.argb(r4, r4, r2, r2)
        L3d:
            android.graphics.Paint r3 = r12.f2624
            r3.setColor(r2)
            r2 = 1111490560(0x42400000, float:48.0)
            r3.setTextSize(r2)
            float r2 = (float) r0
            r4 = 1062333317(0x3f51eb85, float:0.82)
            float r4 = r4 * r2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L53
            r4 = r5
        L53:
            java.lang.String r5 = r12.f2625
            float r5 = r3.measureText(r5)
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 <= 0) goto L6d
            float r6 = r3.getTextSize()
            float r6 = r6 * r4
            float r6 = r6 / r5
            r4 = 1096810496(0x41600000, float:14.0)
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 >= 0) goto L6a
            r6 = r4
        L6a:
            r3.setTextSize(r6)
        L6d:
            java.lang.String r4 = r12.f2625
            float r4 = r3.measureText(r4)
            android.graphics.Paint$FontMetrics r5 = r3.getFontMetrics()
            float r6 = r5.descent
            float r5 = r5.ascent
            float r6 = r6 - r5
            r13.save()
            r5 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 + r5
            r5 = 1117782016(0x42a00000, float:80.0)
            float r6 = r6 + r5
            int r0 = r0 * r0
            int r5 = r1 * r1
            int r5 = r5 + r0
            double r7 = (double) r5
            double r7 = java.lang.Math.sqrt(r7)
            float r0 = (float) r7
            float r5 = r0 / r6
            int r5 = (int) r5
            r7 = 2
            int r5 = r5 + r7
            float r8 = r0 / r4
            int r8 = (int) r8
            int r8 = r8 + r7
            r9 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r9
            float r1 = (float) r1
            float r1 = r1 / r9
            r9 = -1041235968(0xffffffffc1f00000, float:-30.0)
            r13.rotate(r9, r2, r1)
            float r0 = -r0
            float r1 = (float) r7
            float r0 = r0 / r1
            r1 = 0
            r2 = r1
        La7:
            if (r2 >= r5) goto Lbd
            r7 = r1
        Laa:
            if (r7 >= r8) goto Lba
            float r9 = (float) r7
            float r9 = r9 * r4
            float r9 = r9 + r0
            float r10 = (float) r2
            float r10 = r10 * r6
            float r10 = r10 + r0
            java.lang.String r11 = r12.f2625
            r13.drawText(r11, r9, r10, r3)
            int r7 = r7 + 1
            goto Laa
        Lba:
            int r2 = r2 + 1
            goto La7
        Lbd:
            r13.restore()
        Lc0:
            return
    }

    public final void setWatermarkText(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.f2625 = r1
            r0.invalidate()
            return
    }
}
