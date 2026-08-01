package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lr implements android.view.View.OnTouchListener {
    public static final int r = 0;
    public final defpackage.x6 a;
    public final android.view.animation.AccelerateInterpolator b;
    public final defpackage.kh c;
    public defpackage.y6 d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final defpackage.kh q;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            defpackage.lr.r = r0
            return
    }

    public lr(defpackage.kh r12) {
            r11 = this;
            r11.<init>()
            x6 r0 = new x6
            r0.<init>()
            r1 = -9223372036854775808
            r0.e = r1
            r1 = -1
            r0.g = r1
            r1 = 0
            r0.f = r1
            r11.a = r0
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r11.b = r1
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0090: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.e = r2
            float[] r3 = new float[r1]
            r3 = {x0098: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f = r3
            float[] r4 = new float[r1]
            r4 = {x00a0: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.i = r4
            float[] r5 = new float[r1]
            r5 = {x00a8: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.j = r5
            float[] r1 = new float[r1]
            r1 = {x00b0: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.k = r1
            r11.c = r12
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
            r11.g = r10
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3[r9] = r1
            r3[r10] = r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2[r9] = r1
            r2[r10] = r1
            r1 = 981668463(0x3a83126f, float:0.001)
            r4[r9] = r1
            r4[r10] = r1
            int r1 = defpackage.lr.r
            r11.h = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r0.a = r1
            r0.b = r1
            r11.q = r12
            return
    }

    public static float b(float r1, float r2, float r3) {
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

    public final float a(float r4, float r5, float r6, int r7) {
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r7]
            float[] r1 = r3.f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.i
            r0 = r0[r7]
            float[] r1 = r3.j
            r1 = r1[r7]
            float[] r2 = r3.k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
    }

    public final float c(float r6, float r7) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L2c
        L6:
            r1 = 1
            int r2 = r5.g
            if (r2 == 0) goto L18
            if (r2 == r1) goto L18
            r1 = 2
            if (r2 == r1) goto L11
            goto L2c
        L11:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 >= 0) goto L2c
            float r7 = -r7
            float r6 = r6 / r7
            return r6
        L18:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2c
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 < 0) goto L25
            float r6 = r6 / r7
            float r4 = r4 - r6
            return r4
        L25:
            boolean r6 = r5.o
            if (r6 == 0) goto L2c
            if (r2 != r1) goto L2c
            return r4
        L2c:
            return r0
    }

    public final void d() {
            r6 = this;
            boolean r0 = r6.m
            r1 = 0
            if (r0 == 0) goto L8
            r6.o = r1
            return
        L8:
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            x6 r0 = r6.a
            long r4 = r0.e
            long r4 = r2 - r4
            int r4 = (int) r4
            int r5 = r0.b
            if (r4 <= r5) goto L19
            r1 = r5
            goto L1d
        L19:
            if (r4 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = r4
        L1d:
            r0.i = r1
            float r1 = r0.a(r2)
            r0.h = r1
            r0.g = r2
            return
    }

    public final boolean e() {
            r8 = this;
            x6 r0 = r8.a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L4a
            kh r2 = r8.q
            int r3 = r2.getCount()
            if (r3 != 0) goto L1b
            goto L4a
        L1b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L3a
            if (r6 < r3) goto L49
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4a
        L3a:
            if (r1 >= 0) goto L4a
            if (r5 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4a
        L49:
            return r7
        L4a:
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.d()
            return r1
        L1b:
            r7.n = r2
            r7.l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            kh r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            x6 r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            y6 r8 = r7.d
            if (r8 != 0) goto L60
            y6 r8 = new y6
            r8.<init>(r1, r7)
            r7.d = r8
        L60:
            r7.o = r2
            r7.m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            y6 r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.ja0.a
            defpackage.s90.n(r4, r9, r5)
            goto L7a
        L75:
            y6 r8 = r7.d
            r8.run()
        L7a:
            r7.l = r2
        L7c:
            return r1
    }
}
