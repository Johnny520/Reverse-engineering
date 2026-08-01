package defpackage;

/* JADX INFO: renamed from: ᛱᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0207 extends android.view.View {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public float f1280;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public float f1281;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public float f1282;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public float f1283;

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public float f1284;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public float f1285;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public float f1286;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public int f1287;

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public java.lang.Runnable f1288;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1289;

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public defpackage.RunnableC1240 f1290;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.graphics.Paint f1291;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f1292;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public float f1293;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f1294;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public float f1295;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean f1296;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public int f1297;

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public boolean f1298;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public int f1299;

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public android.view.animation.Interpolator f1300;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public float f1301;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public android.graphics.RectF f1302;

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public float f1303;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0804 f1304;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public float f1305;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public android.animation.ValueAnimator f1306;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0804 f1307;

    public int getColor() {
            r0 = this;
            int r0 = r0.f1289
            return r0
    }

    public int getStatus() {
            r0 = this;
            int r0 = r0.f1294
            return r0
    }

    public int getStrokeWidth() {
            r0 = this;
            int r0 = r0.f1292
            return r0
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            ᛵ r0 = r2.f1304
            r1 = 0
            if (r0 == 0) goto L7
            r0.f3717 = r1
        L7:
            ᛵ r0 = r2.f1307
            if (r0 == 0) goto Ld
            r0.f3717 = r1
        Ld:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r11) {
            r10 = this;
            android.graphics.Paint r5 = r10.f1291
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L14
            android.graphics.RectF r1 = r10.f1302
            r3 = 1136033792(0x43b68000, float:365.0)
            r4 = 0
            r2 = 0
            r0 = r11
            r0.drawArc(r1, r2, r3, r4, r5)
            return
        L14:
            r0 = r11
            boolean r11 = r10.f1298
            r6 = 2
            if (r11 == 0) goto L2c
            android.graphics.RectF r1 = r10.f1302
            r3 = 1136033792(0x43b68000, float:365.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            r10.f1287 = r6
            int r11 = r10.f1294
            r10.m758(r11, r0)
            return
        L2c:
            int r11 = r10.f1294
            r7 = 1135869952(0x43b40000, float:360.0)
            if (r11 == 0) goto Lb3
            r8 = 0
            r9 = 1
            if (r11 == r9) goto L75
            if (r11 == r6) goto L75
            r1 = 3
            if (r11 == r1) goto L75
            r1 = 4
            if (r11 == r1) goto L40
            goto Lb2
        L40:
            int r11 = r10.f1287
            if (r11 == 0) goto L56
            if (r11 == r9) goto L47
            goto Lb2
        L47:
            android.graphics.RectF r1 = r10.f1302
            r3 = 1135869952(0x43b40000, float:360.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            int r11 = r10.f1294
            r10.m758(r11, r0)
            return
        L56:
            android.graphics.RectF r1 = r10.f1302
            float r3 = r10.f1280
            r4 = 0
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r0.drawArc(r1, r2, r3, r4, r5)
            float r11 = r10.f1280
            r0 = 1136033792(0x43b68000, float:365.0)
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 != 0) goto Lb2
            r10.f1287 = r9
            java.lang.Runnable r11 = r10.f1288
            if (r11 == 0) goto Lb2
            r11.run()
            r10.f1288 = r8
            return
        L75:
            int r11 = r10.f1287
            if (r11 == 0) goto L8b
            if (r11 == r9) goto L7c
            goto Lb2
        L7c:
            android.graphics.RectF r1 = r10.f1302
            r3 = 1135869952(0x43b40000, float:360.0)
            r4 = 0
            r2 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            int r11 = r10.f1294
            r10.m758(r11, r0)
            return
        L8b:
            float r11 = r10.f1284
            r1 = 1084227584(0x40a00000, float:5.0)
            float r3 = r11 + r1
            r10.f1284 = r3
            android.graphics.RectF r1 = r10.f1302
            float r2 = r10.f1285
            r4 = 0
            r0.drawArc(r1, r2, r3, r4, r5)
            float r11 = r10.f1284
            float r0 = r10.f1293
            float r7 = r7 - r0
            float r11 = r11 - r7
            float r0 = r10.f1285
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 < 0) goto Lb2
            r10.f1287 = r9
            java.lang.Runnable r11 = r10.f1288
            if (r11 == 0) goto Lb2
            r11.run()
            r10.f1288 = r8
        Lb2:
            return
        Lb3:
            float r11 = r10.f1282
            double r1 = (double) r11
            float r11 = r10.f1283
            double r3 = (double) r11
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.sin(r3)
            double r3 = r3 * r1
            float r11 = (float) r3
            float r1 = r10.f1282
            float r11 = r11 + r1
            float r1 = r10.f1281
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 + r11
            float r2 = r10.f1280
            float r11 = r2 - r1
            r10.f1285 = r11
            r3 = 0
            int r4 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r4 >= 0) goto Lda
            float r11 = r11 + r7
            r10.f1285 = r11
        Lda:
            r10.f1284 = r1
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto Le2
            float r7 = r7 - r1
            goto Le3
        Le2:
            r7 = r1
        Le3:
            r10.f1293 = r7
            android.graphics.RectF r10 = r10.f1302
            float r3 = -r1
            r4 = 0
            r1 = r10
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r6
            r2.f1286 = r3
            float r3 = (float) r4
            float r3 = r3 * r5
            float r3 = r3 / r6
            r2.f1305 = r3
            int r3 = r2.getWidth()
            int r4 = r2.getHeight()
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 / 2
            int r4 = r2.f1292
            int r4 = r4 / 2
            int r3 = r3 - r4
            float r3 = (float) r3
            r2.f1301 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = r2.f1286
            float r5 = r2.f1301
            float r6 = r4 - r5
            float r0 = r2.f1305
            float r1 = r0 - r5
            float r4 = r4 + r5
            float r0 = r0 + r5
            r3.<init>(r6, r1, r4, r0)
            r2.f1302 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m756(float r5) {
            r4 = this;
            ᛵ r0 = r4.f1304
            r1 = 0
            if (r0 == 0) goto L7
            r0.f3717 = r1
        L7:
            ᛵ r0 = r4.f1307
            if (r0 == 0) goto Ld
            r0.f3717 = r1
        Ld:
            int r0 = r4.f1294
            r2 = 4
            if (r0 == r2) goto L15
            r0 = 0
            r4.f1280 = r0
        L15:
            r4.f1298 = r1
            r4.f1294 = r2
            float r0 = r4.f1280
            r2 = 1136033792(0x43b68000, float:365.0)
            float r5 = r5 * r2
            ᛵ r5 = defpackage.C0804.m1744(r0, r5)
            r4.f1304 = r5
            r2 = 1000(0x3e8, double:4.94E-321)
            r5.f3721 = r2
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r2 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r2)
            r5.f3722 = r0
            ᛵ r5 = r4.f1304
            r5.f3715 = r1
            ᛵᛴᲁᛲ r0 = new ᛵᛴᲁᛲ
            r0.<init>(r4, r1)
            r5.f3716 = r0
            r5.m1745()
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m757(int r3, android.view.animation.Interpolator r4) {
            r2 = this;
            r2.f1300 = r4
            r2.f1294 = r3
            int r3 = r2.f1287
            if (r3 != 0) goto L11
            ᛱᛸᛵᛸ r3 = new ᛱᛸᛵᛸ
            r4 = 5
            r3.<init>(r2, r4)
            r2.f1288 = r3
            return
        L11:
            android.animation.ValueAnimator r3 = r2.f1306
            if (r3 == 0) goto L1b
            r3.cancel()
            r3 = 0
            r2.f1306 = r3
        L1b:
            r3 = 0
            r2.f1303 = r3
            r3 = 2
            float[] r4 = new float[r3]
            r4 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            r2.f1306 = r4
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            android.animation.ValueAnimator r4 = r2.f1306
            ᛳᛵᛳᛵ r0 = new ᛳᛵᛳᛵ
            r0.<init>(r3, r2)
            r4.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r2.f1306
            r2.start()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m758(int r10, android.graphics.Canvas r11) {
            r9 = this;
            android.graphics.Paint r5 = r9.f1291
            ᛵ r0 = r9.f1304
            android.view.animation.Interpolator r1 = r0.f3722
            android.view.animation.Interpolator r2 = r9.f1300
            if (r1 == r2) goto Lc
            r0.f3722 = r2
        Lc:
            ᛷᛳᛶᛷ r0 = r9.f1290
            r1 = 2
            r6 = 1
            r2 = 3
            if (r0 == 0) goto L53
            r0.run()
            r0 = 0
            r9.f1290 = r0
            boolean r0 = defpackage.AbstractC0042.f557
            if (r0 == 0) goto L53
            if (r10 == r6) goto L50
            if (r10 == r1) goto L3b
            if (r10 == r2) goto L24
            goto L53
        L24:
            r9.performHapticFeedback(r2)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            ᛱᛸᛵᛸ r3 = new ᛱᛸᛵᛸ
            r3.<init>(r9, r6)
            r7 = 150(0x96, double:7.4E-322)
            r0.postDelayed(r3, r7)
            goto L53
        L3b:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            ᛱᛸᛵᛸ r3 = new ᛱᛸᛵᛸ
            r4 = 0
            r3.<init>(r9, r4)
            r7 = 240(0xf0, double:1.186E-321)
            r0.postDelayed(r3, r7)
            goto L53
        L50:
            r9.performHapticFeedback(r2)
        L53:
            r0 = 1092616192(0x41200000, float:10.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r6) goto Lf3
            if (r10 == r1) goto Lb0
            if (r10 == r2) goto L5e
            return
        L5e:
            float r10 = r9.f1305
            float r1 = r9.f1301
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r2
            float r1 = r1 / r0
            float r10 = r10 - r1
            int r10 = (int) r10
            float r0 = r9.f1286
            float r1 = r1 + r0
            int r0 = (int) r1
            float r1 = r9.f1303
            r6 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L88
            r2 = r1
            float r1 = (float) r10
            float r2 = r2 * r7
            int r0 = r0 - r10
            float r10 = (float) r0
            float r2 = r2 * r10
            float r2 = r2 + r1
            int r10 = (int) r2
            r9.f1297 = r10
            r9.f1299 = r10
            float r3 = (float) r10
            r2 = r1
            r4 = r3
            r0 = r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        L88:
            r2 = r0
            r0 = r11
            r11 = r2
            r2 = r1
            float r1 = (float) r10
            float r2 = r2 * r7
            int r10 = r11 - r10
            float r10 = (float) r10
            float r2 = r2 * r10
            float r2 = r2 + r1
            int r2 = (int) r2
            r9.f1297 = r2
            r9.f1299 = r2
            float r3 = (float) r11
            r2 = r1
            r4 = r3
            r0.drawLine(r1, r2, r3, r4, r5)
            float r9 = r9.f1303
            float r9 = r9 - r6
            float r9 = r9 * r7
            float r9 = r9 * r10
            float r10 = r3 - r9
            int r10 = (int) r10
            float r9 = r9 + r1
            int r9 = (int) r9
            float r10 = (float) r10
            float r4 = (float) r9
            r1 = r3
            r3 = r10
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Lb0:
            r0 = r11
            float r10 = r9.f1286
            int r10 = (int) r10
            float r11 = r9.f1305
            float r1 = r9.f1301
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r1
            float r3 = r2 / r7
            float r3 = r11 - r3
            int r3 = (int) r3
            r4 = 1090519040(0x41000000, float:8.0)
            float r2 = r2 / r4
            float r2 = r2 + r11
            int r2 = (int) r2
            r4 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r4
            r4 = 1088421888(0x40e00000, float:7.0)
            float r1 = r1 / r4
            float r1 = r1 + r11
            int r11 = (int) r1
            float r9 = r9.f1303
            r1 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 >= 0) goto Le4
            float r1 = (float) r10
            r4 = r2
            float r2 = (float) r3
            int r10 = r4 - r3
            float r10 = (float) r10
            float r10 = r10 * r9
            float r4 = r10 + r2
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Le4:
            r4 = r2
            float r1 = (float) r10
            float r2 = (float) r3
            float r4 = (float) r4
            r3 = r1
            r0.drawLine(r1, r2, r3, r4, r5)
            float r2 = (float) r11
            int r11 = r11 + r6
            float r4 = (float) r11
            r0.drawLine(r1, r2, r3, r4, r5)
            return
        Lf3:
            r10 = r11
            float r11 = r9.f1301
            r1 = 1101004800(0x41a00000, float:20.0)
            float r1 = r11 / r1
            int r1 = (int) r1
            float r2 = r9.f1286
            float r0 = r11 / r0
            float r0 = r2 - r0
            float r1 = (float) r1
            float r0 = r0 - r1
            int r0 = (int) r0
            float r11 = r11 / r7
            float r3 = r2 - r11
            int r3 = (int) r3
            float r4 = r9.f1305
            float r4 = r4 + r1
            int r1 = (int) r4
            float r11 = r11 + r2
            int r11 = (int) r11
            float r2 = (float) r3
            int r11 = r11 - r3
            float r11 = (float) r11
            float r4 = r9.f1303
            float r11 = r11 * r4
            float r11 = r11 + r2
            int r11 = (int) r11
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            float r6 = (float) r1
            r4.moveTo(r2, r6)
            if (r11 >= r0) goto L12e
            r9.f1297 = r11
            int r0 = r11 - r3
            int r0 = r0 + r1
            r9.f1299 = r0
            float r9 = (float) r11
            float r11 = (float) r0
            r4.lineTo(r9, r11)
            goto L146
        L12e:
            r9.f1297 = r0
            int r2 = r0 - r3
            int r2 = r2 + r1
            r9.f1299 = r2
            float r0 = (float) r0
            float r1 = (float) r2
            r4.lineTo(r0, r1)
            int r0 = r9.f1299
            int r9 = r9.f1297
            int r9 = r11 - r9
            int r0 = r0 - r9
            float r9 = (float) r11
            float r11 = (float) r0
            r4.lineTo(r9, r11)
        L146:
            r10.drawPath(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m759() {
            r8 = this;
            java.lang.Class<ᛱᲇᲁᲈ> r0 = defpackage.C0207.class
            monitor-enter(r0)
            boolean r1 = r8.f1296     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r8 = move-exception
            goto Lb5
        Lc:
            r1 = 1
            r8.f1296 = r1     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1291     // Catch: java.lang.Throwable -> L9
            r2.setAntiAlias(r1)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1291     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE     // Catch: java.lang.Throwable -> L9
            r2.setStyle(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1291     // Catch: java.lang.Throwable -> L9
            int r3 = r8.f1292     // Catch: java.lang.Throwable -> L9
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L9
            r2.setStrokeWidth(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1291     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch: java.lang.Throwable -> L9
            r2.setStrokeCap(r3)     // Catch: java.lang.Throwable -> L9
            android.graphics.Paint r2 = r8.f1291     // Catch: java.lang.Throwable -> L9
            int r3 = r8.f1289     // Catch: java.lang.Throwable -> L9
            r2.setColor(r3)     // Catch: java.lang.Throwable -> L9
            boolean r2 = r8.isInEditMode()     // Catch: java.lang.Throwable -> L9
            if (r2 != 0) goto Lb3
            android.content.Context r2 = r8.getContext()     // Catch: java.lang.Throwable -> L9
            java.lang.Class<android.view.WindowManager> r3 = android.view.WindowManager.class
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L9
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch: java.lang.Throwable -> L9
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch: java.lang.Throwable -> L9
            android.view.Display$Mode r2 = r2.getMode()     // Catch: java.lang.Throwable -> L9
            float r2 = r2.getRefreshRate()     // Catch: java.lang.Throwable -> L9
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L5d
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = (double) r2     // Catch: java.lang.Throwable -> L9
            double r4 = r4 / r6
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9
            goto L5f
        L5d:
            r4 = 16
        L5f:
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L9
            float r4 = r8.f1295     // Catch: java.lang.Throwable -> L9
            float r5 = r8.f1281     // Catch: java.lang.Throwable -> L9
            float r4 = r4 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            r8.f1282 = r4     // Catch: java.lang.Throwable -> L9
            r4 = 1136033792(0x43b68000, float:365.0)
            ᛵ r5 = defpackage.C0804.m1744(r3, r4)     // Catch: java.lang.Throwable -> L9
            r8.f1304 = r5     // Catch: java.lang.Throwable -> L9
            r6 = 1000(0x3e8, double:4.94E-321)
            r5.f3721 = r6     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r6 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r6.<init>()     // Catch: java.lang.Throwable -> L9
            r5.f3722 = r6     // Catch: java.lang.Throwable -> L9
            ᛵ r5 = r8.f1304     // Catch: java.lang.Throwable -> L9
            r6 = -1
            r5.f3715 = r6     // Catch: java.lang.Throwable -> L9
            r5.f3714 = r2     // Catch: java.lang.Throwable -> L9
            ᛵᛴᲁᛲ r7 = new ᛵᛴᲁᛲ     // Catch: java.lang.Throwable -> L9
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L9
            r5.f3716 = r7     // Catch: java.lang.Throwable -> L9
            ᛵ r1 = defpackage.C0804.m1744(r3, r4)     // Catch: java.lang.Throwable -> L9
            r8.f1307 = r1     // Catch: java.lang.Throwable -> L9
            r3 = 1500(0x5dc, double:7.41E-321)
            r1.f3721 = r3     // Catch: java.lang.Throwable -> L9
            r1.f3714 = r2     // Catch: java.lang.Throwable -> L9
            android.view.animation.LinearInterpolator r2 = new android.view.animation.LinearInterpolator     // Catch: java.lang.Throwable -> L9
            r2.<init>()     // Catch: java.lang.Throwable -> L9
            r1.f3722 = r2     // Catch: java.lang.Throwable -> L9
            ᛵ r1 = r8.f1307     // Catch: java.lang.Throwable -> L9
            r1.f3715 = r6     // Catch: java.lang.Throwable -> L9
            ᛵᛴᲁᛲ r2 = new ᛵᛴᲁᛲ     // Catch: java.lang.Throwable -> L9
            r3 = 2
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L9
            r1.f3716 = r2     // Catch: java.lang.Throwable -> L9
            r1.m1745()     // Catch: java.lang.Throwable -> L9
            ᛵ r8 = r8.f1304     // Catch: java.lang.Throwable -> L9
            r8.m1745()     // Catch: java.lang.Throwable -> L9
        Lb3:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        Lb5:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r8
    }
}
