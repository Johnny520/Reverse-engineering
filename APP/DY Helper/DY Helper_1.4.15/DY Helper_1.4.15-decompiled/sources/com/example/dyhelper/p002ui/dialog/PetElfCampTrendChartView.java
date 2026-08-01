package com.example.dyhelper.p002ui.dialog;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class PetElfCampTrendChartView extends android.view.View {

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ int f2626 = 0;

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Paint f2627;

    /* JADX INFO: renamed from: ζ */
    public final android.graphics.Paint f2628;

    /* JADX INFO: renamed from: η */
    public final android.graphics.Paint f2629;

    /* JADX INFO: renamed from: θ */
    public final android.graphics.Paint f2630;

    /* JADX INFO: renamed from: ι */
    public final android.graphics.Path f2631;

    /* JADX INFO: renamed from: κ */
    public java.util.List f2632;

    /* JADX INFO: renamed from: λ */
    public java.lang.Object f2633;

    public PetElfCampTrendChartView(android.app.Activity r4, int r5, int r6) {
            r3 = this;
            r4.getClass()
            r3.<init>(r4)
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = 1
            r4.<init>(r0)
            r4.setColor(r6)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r3.m1579(r6)
            r4.setStrokeWidth(r6)
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r6)
            r3.f2627 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r4.setColor(r5)
            android.content.res.Resources r5 = r3.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r1 = 2
            r2 = 1091567616(0x41100000, float:9.0)
            float r5 = android.util.TypedValue.applyDimension(r1, r2, r5)
            r4.setTextSize(r5)
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            r3.f2628 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r3.m1579(r1)
            r4.setStrokeWidth(r1)
            android.graphics.Paint$Cap r1 = android.graphics.Paint.Cap.ROUND
            r4.setStrokeCap(r1)
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            r4.setStrokeJoin(r1)
            r4.setStyle(r6)
            r3.f2629 = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>(r0)
            r4.setStyle(r5)
            r3.f2630 = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r3.f2631 = r4
            jz r4 = p000.C0450jz.f5672
            r3.f2632 = r4
            r3.f2633 = r4
            r3.setImportantForAccessibility(r0)
            r4 = 1131413504(0x43700000, float:240.0)
            float r4 = r3.m1579(r4)
            int r4 = (int) r4
            r3.setMinimumWidth(r4)
            r4 = 1128136704(0x433e0000, float:190.0)
            float r4 = r3.m1579(r4)
            int r4 = (int) r4
            r3.setMinimumHeight(r4)
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r30) {
            r29 = this;
            r0 = r29
            r30.getClass()
            super.onDraw(r30)
            java.util.List r1 = r0.f2632
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L264
        L12:
            int r1 = r0.getPaddingLeft()
            float r1 = (float) r1
            r2 = 1110966272(0x42380000, float:46.0)
            float r2 = r0.m1579(r2)
            float r2 = r2 + r1
            int r1 = r0.getPaddingTop()
            float r1 = (float) r1
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = r0.m1579(r3)
            float r7 = r3 + r1
            int r1 = r0.getWidth()
            int r3 = r0.getPaddingRight()
            int r1 = r1 - r3
            float r1 = (float) r1
            r3 = 1090519040(0x41000000, float:8.0)
            float r3 = r0.m1579(r3)
            float r4 = r1 - r3
            int r1 = r0.getHeight()
            int r3 = r0.getPaddingBottom()
            int r1 = r1 - r3
            float r1 = (float) r1
            r3 = 1105199104(0x41e00000, float:28.0)
            float r3 = r0.m1579(r3)
            float r8 = r1 - r3
            float r9 = r4 - r2
            float r10 = r8 - r7
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto L264
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L5e
            goto L264
        L5e:
            java.lang.Object r1 = r0.f2633
            f7 r1 = p000.AbstractC0984xh.m6661(r1)
            f71 r3 = new f71
            r5 = 22
            r3.<init>(r5)
            c40 r5 = new c40
            vs1 r6 = p000.vs1.f11382
            r5.<init>(r1, r3, r6)
            java.lang.Comparable r1 = p000.us1.m5944(r5)
            java.lang.Long r1 = (java.lang.Long) r1
            r5 = 1
            if (r1 == 0) goto L86
            long r11 = r1.longValue()
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 >= 0) goto L85
            goto L86
        L85:
            r5 = r11
        L86:
            r11 = r5
            android.graphics.Paint$Align r1 = android.graphics.Paint.Align.RIGHT
            android.graphics.Paint r13 = r0.f2628
            r13.setTextAlign(r1)
            r15 = 0
        L8f:
            float r1 = (float) r15
            r3 = 4
            float r5 = (float) r3
            float r1 = r1 / r5
            float r1 = r1 * r10
            float r1 = r1 + r7
            android.graphics.Paint r6 = r0.f2627
            r5 = r1
            r14 = r3
            r3 = r1
            r1 = r30
            r1.drawLine(r2, r3, r4, r5, r6)
            double r5 = (double) r11
            int r14 = 4 - r15
            r17 = r2
            r18 = r3
            double r2 = (double) r14
            double r2 = r2 * r5
            r19 = r2
            r14 = 4
            double r2 = (double) r14
            double r2 = r19 / r2
            long r2 = (long) r2
            r19 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r14 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            r19 = r4
            r4 = 1
            if (r14 < 0) goto Ld8
            java.util.Locale r14 = java.util.Locale.getDefault()
            double r2 = (double) r2
            r20 = 4726483295884279808(0x4197d78400000000, double:1.0E8)
            double r2 = r2 / r20
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r3 = "%.1f亿"
            java.lang.String r2 = java.lang.String.format(r14, r3, r2)
            goto L101
        Ld8:
            r20 = 10000(0x2710, double:4.9407E-320)
            int r14 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r14 < 0) goto Lfd
            java.util.Locale r14 = java.util.Locale.getDefault()
            double r2 = (double) r2
            r20 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r2 = r2 / r20
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r4)
            java.lang.String r3 = "%.1f万"
            java.lang.String r2 = java.lang.String.format(r14, r3, r2)
            goto L101
        Lfd:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L101:
            r3 = 1088421888(0x40e00000, float:7.0)
            float r3 = r0.m1579(r3)
            float r3 = r17 - r3
            r14 = 1077936128(0x40400000, float:3.0)
            float r14 = r0.m1579(r14)
            float r14 = r14 + r18
            r1.drawText(r2, r3, r14, r13)
            r14 = 4
            if (r15 == r14) goto L11f
            int r15 = r15 + 1
            r2 = r17
            r4 = r19
            goto L8f
        L11f:
            android.graphics.Paint$Align r2 = android.graphics.Paint.Align.CENTER
            r13.setTextAlign(r2)
            java.util.List r2 = r0.f2632
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L12b:
            boolean r7 = r2.hasNext()
            r11 = 0
            r12 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L167
            java.lang.Object r7 = r2.next()
            int r14 = r3 + 1
            if (r3 < 0) goto L163
            java.lang.String r7 = (java.lang.String) r7
            java.util.List r11 = r0.f2632
            int r11 = r11.size()
            if (r11 != r4) goto L14b
            float r3 = r9 / r12
        L148:
            float r3 = r3 + r17
            goto L157
        L14b:
            float r3 = (float) r3
            float r3 = r3 * r9
            java.util.List r11 = r0.f2632
            int r11 = r11.size()
            int r11 = r11 - r4
            float r11 = (float) r11
            float r3 = r3 / r11
            goto L148
        L157:
            r11 = 1099956224(0x41900000, float:18.0)
            float r11 = r0.m1579(r11)
            float r11 = r11 + r8
            r1.drawText(r7, r3, r11, r13)
            r3 = r14
            goto L12b
        L163:
            p000.AbstractC1021yh.m6917()
            throw r11
        L167:
            java.lang.Object r2 = r0.f2633
            java.util.Iterator r2 = r2.iterator()
        L16d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L264
            java.lang.Object r3 = r2.next()
            ce1 r3 = (p000.ce1) r3
            java.util.List r7 = r3.f2090
            int r3 = r3.f2089
            boolean r13 = r7.isEmpty()
            if (r13 != 0) goto L254
            android.graphics.Path r13 = r0.f2631
            r13.reset()
            java.util.Iterator r14 = r7.iterator()
            r15 = 0
        L18d:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L1eb
            java.lang.Object r16 = r14.next()
            int r18 = r15 + 1
            if (r15 < 0) goto L1e5
            java.lang.Number r16 = (java.lang.Number) r16
            r19 = r11
            r20 = r12
            long r11 = r16.longValue()
            r16 = r2
            int r2 = r7.size()
            if (r2 != r4) goto L1b4
            float r2 = r9 / r20
            float r2 = r2 + r17
            r22 = r4
            goto L1c2
        L1b4:
            float r2 = (float) r15
            float r2 = r2 * r9
            int r21 = r7.size()
            r22 = r4
            int r4 = r21 + (-1)
            float r4 = (float) r4
            float r2 = r2 / r4
            float r2 = r2 + r17
        L1c2:
            double r11 = (double) r11
            double r23 = r11 / r5
            r25 = 0
            r27 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = p000.j81.m2904(r23, r25, r27)
            float r4 = (float) r11
            float r4 = r4 * r10
            float r4 = r8 - r4
            if (r15 != 0) goto L1d7
            r13.moveTo(r2, r4)
            goto L1da
        L1d7:
            r13.lineTo(r2, r4)
        L1da:
            r2 = r16
            r15 = r18
            r11 = r19
            r12 = r20
            r4 = r22
            goto L18d
        L1e5:
            r19 = r11
            p000.AbstractC1021yh.m6917()
            throw r19
        L1eb:
            r16 = r2
            r22 = r4
            r19 = r11
            r20 = r12
            android.graphics.Paint r2 = r0.f2629
            r2.setColor(r3)
            r1.drawPath(r13, r2)
            android.graphics.Paint r2 = r0.f2630
            r2.setColor(r3)
            java.util.Iterator r3 = r7.iterator()
            r4 = 0
        L205:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L251
            java.lang.Object r11 = r3.next()
            int r12 = r4 + 1
            if (r4 < 0) goto L24d
            java.lang.Number r11 = (java.lang.Number) r11
            long r13 = r11.longValue()
            int r11 = r7.size()
            r15 = r22
            if (r11 != r15) goto L226
            float r4 = r9 / r20
        L223:
            float r4 = r4 + r17
            goto L230
        L226:
            float r4 = (float) r4
            float r4 = r4 * r9
            int r11 = r7.size()
            int r11 = r11 - r15
            float r11 = (float) r11
            float r4 = r4 / r11
            goto L223
        L230:
            double r13 = (double) r13
            double r21 = r13 / r5
            r23 = 0
            r25 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = p000.j81.m2904(r21, r23, r25)
            float r11 = (float) r13
            float r11 = r11 * r10
            float r11 = r8 - r11
            r13 = 1077097267(0x40333333, float:2.8)
            float r13 = r0.m1579(r13)
            r1.drawCircle(r4, r11, r13, r2)
            r4 = r12
            r22 = r15
            goto L205
        L24d:
            p000.AbstractC1021yh.m6917()
            throw r19
        L251:
            r15 = r22
            goto L25b
        L254:
            r16 = r2
            r15 = r4
            r19 = r11
            r20 = r12
        L25b:
            r4 = r15
            r2 = r16
            r11 = r19
            r12 = r20
            goto L16d
        L264:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = r3.getSuggestedMinimumWidth()
            r1 = 1131413504(0x43700000, float:240.0)
            float r1 = r3.m1579(r1)
            int r1 = (int) r1
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.getSuggestedMinimumHeight()
            r2 = 1128136704(0x433e0000, float:190.0)
            float r2 = r3.m1579(r2)
            int r2 = (int) r2
            int r1 = java.lang.Math.max(r1, r2)
            int r4 = android.view.View.resolveSize(r0, r4)
            int r5 = android.view.View.resolveSize(r1, r5)
            r3.setMeasuredDimension(r4, r5)
            return
    }

    /* JADX INFO: renamed from: α */
    public final float m1579(float r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m1580(java.util.ArrayList r10, java.util.List r11, java.lang.String r12) {
            r9 = this;
            java.util.List r10 = p000.AbstractC0984xh.m6666(r10)
            r9.f2632 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r10 = 10
            int r10 = p000.AbstractC1021yh.m6889(r11, r10)
            r0.<init>(r10)
            java.util.Iterator r10 = r11.iterator()
        L15:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L5c
            java.lang.Object r11 = r10.next()
            ce1 r11 = (p000.ce1) r11
            java.util.List r1 = r9.f2632
            int r1 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 0
        L2d:
            if (r3 >= r1) goto L4f
            java.util.List r4 = r11.f2090
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r3, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            r5 = 0
            if (r4 == 0) goto L45
            long r7 = r4.longValue()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L44
            goto L45
        L44:
            r5 = r7
        L45:
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r2.add(r4)
            int r3 = r3 + 1
            goto L2d
        L4f:
            java.lang.String r1 = r11.f2088
            int r11 = r11.f2089
            ce1 r3 = new ce1
            r3.<init>(r11, r1, r2)
            r0.add(r3)
            goto L15
        L5c:
            r9.f2633 = r0
            wa r5 = new wa
            r10 = 27
            r5.<init>(r9, r10, r12)
            r6 = 30
            java.lang.String r1 = "；"
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            r9.setContentDescription(r10)
            r9.invalidate()
            return
    }
}
