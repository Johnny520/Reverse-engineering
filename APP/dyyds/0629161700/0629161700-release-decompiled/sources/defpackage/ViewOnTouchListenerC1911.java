package defpackage;

/* JADX INFO: renamed from: ᲁᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1911 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public static final int f8309 = 0;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final float[] f8310;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final float[] f8311;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final float[] f8312;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int f8313;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f8314;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0398 f8315;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f8316;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.view.animation.AccelerateInterpolator f8317;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1544 f8318;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final float[] f8319;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public boolean f8320;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f8321;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final defpackage.C0398 f8322;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.RunnableC0439 f8323;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public boolean f8324;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final float[] f8325;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            defpackage.ViewOnTouchListenerC1911.f8309 = r0
            return
    }

    public ViewOnTouchListenerC1911(defpackage.C0398 r12) {
            r11 = this;
            r11.<init>()
            ᛸᛸᛷᲇ r0 = new ᛸᛸᛷᲇ
            r0.<init>()
            r1 = -9223372036854775808
            r0.f6854 = r1
            r1 = -1
            r0.f6860 = r1
            r1 = 0
            r0.f6859 = r1
            r11.f8318 = r0
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r11.f8317 = r1
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x008e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f8325 = r2
            float[] r3 = new float[r1]
            r3 = {x0096: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f8310 = r3
            float[] r4 = new float[r1]
            r4 = {x009e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f8319 = r4
            float[] r5 = new float[r1]
            r5 = {x00a6: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f8311 = r5
            float[] r1 = new float[r1]
            r1 = {x00ae: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f8312 = r1
            r11.f8315 = r12
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1153753088(0x44c4e000, float:1575.0)
            float r7 = r7 * r6
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            r9 = 1134395392(0x439d8000, float:315.0)
            float r6 = r6 * r9
            float r6 = r6 + r8
            int r6 = (int) r6
            float r7 = (float) r7
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r9 = 0
            r1[r9] = r7
            r10 = 1
            r1[r10] = r7
            float r1 = (float) r6
            float r1 = r1 / r8
            r5[r9] = r1
            r5[r10] = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3[r9] = r1
            r3[r10] = r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2[r9] = r1
            r2[r10] = r1
            r1 = 981668463(0x3a83126f, float:0.001)
            r4[r9] = r1
            r4[r10] = r1
            int r1 = defpackage.ViewOnTouchListenerC1911.f8309
            r11.f8313 = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r0.f6857 = r1
            r0.f6858 = r1
            r11.f8322 = r12
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static float m3344(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            r8 = this;
            boolean r0 = r8.f8321
            r1 = 0
            if (r0 != 0) goto L7
            goto L78
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L78
        L17:
            r8.m3346()
            return r1
        L1b:
            r8.f8314 = r3
            r8.f8316 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            ᛲᲈᲁᛸ r5 = r8.f8315
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m3348(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m3348(r3, r10, r9, r4)
            ᛸᛸᛷᲇ r10 = r8.f8318
            r10.f6856 = r0
            r10.f6855 = r9
            boolean r9 = r8.f8324
            if (r9 != 0) goto L78
            boolean r9 = r8.m3345()
            if (r9 == 0) goto L78
            ᛳᛳᛵᛲ r9 = r8.f8323
            if (r9 != 0) goto L60
            ᛳᛳᛵᛲ r9 = new ᛳᛳᛵᛲ
            r9.<init>(r2, r8)
            r8.f8323 = r9
        L60:
            r8.f8324 = r3
            r8.f8320 = r3
            boolean r10 = r8.f8316
            if (r10 != 0) goto L73
            int r10 = r8.f8313
            if (r10 <= 0) goto L73
            long r6 = (long) r10
            java.util.WeakHashMap r10 = defpackage.AbstractC0858.f3911
            r5.postOnAnimationDelayed(r9, r6)
            goto L76
        L73:
            r9.run()
        L76:
            r8.f8316 = r3
        L78:
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m3345() {
            r7 = this;
            ᛸᛸᛷᲇ r0 = r7.f8318
            float r1 = r0.f6855
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f6856
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L4a
            ᛲᲈᲁᛸ r7 = r7.f8322
            int r2 = r7.getCount()
            if (r2 != 0) goto L1b
            goto L4a
        L1b:
            int r3 = r7.getChildCount()
            int r4 = r7.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r1 <= 0) goto L3a
            if (r5 < r2) goto L49
            int r3 = r3 - r6
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L49
            goto L4a
        L3a:
            if (r1 >= 0) goto L4a
            if (r4 > 0) goto L49
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L49
            goto L4a
        L49:
            return r6
        L4a:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m3346() {
            r6 = this;
            boolean r0 = r6.f8320
            r1 = 0
            if (r0 == 0) goto L8
            r6.f8324 = r1
            return
        L8:
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            ᛸᛸᛷᲇ r6 = r6.f8318
            long r4 = r6.f6854
            long r4 = r2 - r4
            int r0 = (int) r4
            int r4 = r6.f6858
            if (r0 <= r4) goto L19
            r1 = r4
            goto L1d
        L19:
            if (r0 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            r6.f6853 = r1
            float r0 = r6.m2822(r2)
            r6.f6852 = r0
            r6.f6860 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final float m3347(float r4, float r5) {
            r3 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L18
        L6:
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 >= 0) goto L18
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L13
            float r4 = r4 / r5
            float r2 = r2 - r4
            return r2
        L13:
            boolean r3 = r3.f8324
            if (r3 == 0) goto L18
            return r2
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final float m3348(int r4, float r5, float r6, float r7) {
            r3 = this;
            float[] r0 = r3.f8325
            r0 = r0[r4]
            float[] r1 = r3.f8310
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m3344(r0, r2, r1)
            float r1 = r3.m3347(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m3347(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f8317
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m3344(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f8319
            r0 = r0[r4]
            float[] r1 = r3.f8311
            r1 = r1[r4]
            float[] r3 = r3.f8312
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r3 = m3344(r5, r1, r3)
            return r3
        L51:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = m3344(r4, r1, r3)
            float r3 = -r3
            return r3
    }
}
