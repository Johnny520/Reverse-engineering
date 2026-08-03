package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class O1 implements android.view.View.OnTouchListener {
    public static final int q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.O1.a f194a;
    public final android.view.animation.AccelerateInterpolator b;
    public final android.widget.ListView c;
    public a.O1.b d;
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

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195a;
        public int b;
        public float c;
        public float d;
        public long e;
        public long f;
        public long g;
        public float h;
        public int i;

        public final float a(long r9) {
                r8 = this;
                long r0 = r8.e
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r3 = 0
                if (r2 >= 0) goto L8
                return r3
            L8:
                long r4 = r8.g
                r6 = 0
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r2 < 0) goto L28
                int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r2 >= 0) goto L17
                goto L28
            L17:
                long r9 = r9 - r4
                float r0 = r8.h
                float r1 = r6 - r0
                float r9 = (float) r9
                int r10 = r8.i
                float r10 = (float) r10
                float r9 = r9 / r10
                float r9 = a.O1.b(r9, r3, r6)
                float r9 = r9 * r0
                float r9 = r9 + r1
                return r9
            L28:
                long r9 = r9 - r0
                float r9 = (float) r9
                int r10 = r8.f195a
                float r10 = (float) r10
                float r9 = r9 / r10
                float r9 = a.O1.b(r9, r3, r6)
                r10 = 1056964608(0x3f000000, float:0.5)
                float r9 = r9 * r10
                return r9
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.O1 f196a;

        public b(a.O1 r1) {
                r0 = this;
                r0.<init>()
                r0.f196a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r17 = this;
                r0 = r17
                a.O1 r1 = r0.f196a
                boolean r2 = r1.o
                if (r2 != 0) goto L9
                return
            L9:
                boolean r2 = r1.m
                a.O1$a r3 = r1.f194a
                r4 = 0
                if (r2 == 0) goto L22
                r1.m = r4
                long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r3.e = r5
                r7 = -1
                r3.g = r7
                r3.f = r5
                r2 = 1056964608(0x3f000000, float:0.5)
                r3.h = r2
            L22:
                long r5 = r3.g
                r7 = 0
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 <= 0) goto L39
                long r5 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r9 = r3.g
                int r2 = r3.i
                long r11 = (long) r2
                long r9 = r9 + r11
                int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r2 <= 0) goto L39
                goto L3f
            L39:
                boolean r2 = r1.e()
                if (r2 != 0) goto L42
            L3f:
                r1.o = r4
                return
            L42:
                boolean r2 = r1.n
                android.widget.ListView r5 = r1.c
                if (r2 == 0) goto L5e
                r1.n = r4
                long r9 = android.os.SystemClock.uptimeMillis()
                r15 = 0
                r16 = 0
                r13 = 3
                r14 = 0
                r11 = r9
                android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
                r5.onTouchEvent(r2)
                r2.recycle()
            L5e:
                long r9 = r3.f
                int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r2 == 0) goto L8d
                long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r2 = r3.a(r6)
                r4 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r4 = r4 * r2
                float r4 = r4 * r2
                r8 = 1082130432(0x40800000, float:4.0)
                float r2 = r2 * r8
                float r2 = r2 + r4
                long r8 = r3.f
                long r8 = r6 - r8
                r3.f = r6
                float r4 = (float) r8
                float r4 = r4 * r2
                float r2 = r3.d
                float r4 = r4 * r2
                int r2 = (int) r4
                a.G9 r1 = (a.G9) r1
                a.A5 r1 = r1.r
                r1.scrollListBy(r2)
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r5.postOnAnimation(r0)
                return
            L8d:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Cannot compute scroll delta before calling start()"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            a.O1.q = r0
            return
    }

    public O1(android.widget.ListView r12) {
            r11 = this;
            r0 = 2
            r11.<init>()
            a.O1$a r1 = new a.O1$a
            r1.<init>()
            r2 = -9223372036854775808
            r1.e = r2
            r2 = -1
            r1.g = r2
            r2 = 0
            r1.f = r2
            r11.f194a = r1
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            r11.b = r2
            float[] r2 = new float[r0]
            r2 = {x008e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.e = r2
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float[] r4 = new float[r0]
            r4 = {x0096: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f = r4
            float[] r5 = new float[r0]
            r5 = {x009e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.i = r5
            float[] r6 = new float[r0]
            r6 = {x00a6: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.j = r6
            float[] r0 = new float[r0]
            r0 = {x00ae: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.k = r0
            r11.c = r12
            android.content.res.Resources r12 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            r7 = 1153753088(0x44c4e000, float:1575.0)
            float r7 = r7 * r12
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            r9 = 1134395392(0x439d8000, float:315.0)
            float r12 = r12 * r9
            float r12 = r12 + r8
            int r12 = (int) r12
            float r7 = (float) r7
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r9 = 0
            r0[r9] = r7
            r10 = 1
            r0[r10] = r7
            float r12 = (float) r12
            float r12 = r12 / r8
            r6[r9] = r12
            r6[r10] = r12
            r11.g = r10
            r4[r9] = r3
            r4[r10] = r3
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            r2[r9] = r12
            r2[r10] = r12
            r12 = 981668463(0x3a83126f, float:0.001)
            r5[r9] = r12
            r5[r10] = r12
            int r12 = a.O1.q
            r11.h = r12
            r12 = 500(0x1f4, float:7.0E-43)
            r1.f195a = r12
            r1.b = r12
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
            int r1 = r5.g
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto L18
            r2 = 2
            if (r1 == r2) goto L11
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
            if (r1 != r2) goto L2c
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
            a.O1$a r0 = r6.f194a
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
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
            a.O1$a r0 = r8.f194a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L4d
            r2 = r8
            a.G9 r2 = (a.G9) r2
            a.A5 r2 = r2.r
            int r3 = r2.getCount()
            if (r3 != 0) goto L1e
            goto L4d
        L1e:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L3d
            if (r6 < r3) goto L4c
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L4c
            goto L4d
        L3d:
            if (r1 >= 0) goto L4d
            if (r5 > 0) goto L4c
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L4c
            goto L4d
        L4c:
            return r7
        L4d:
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
            android.widget.ListView r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            a.O1$a r9 = r7.f194a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.o
            if (r8 != 0) goto L7c
            boolean r8 = r7.e()
            if (r8 == 0) goto L7c
            a.O1$b r8 = r7.d
            if (r8 != 0) goto L60
            a.O1$b r8 = new a.O1$b
            r8.<init>(r7)
            r7.d = r8
        L60:
            r7.o = r2
            r7.m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            a.O1$b r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap<android.view.View, a.Jg> r8 = a.C0414ug.f721a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            a.O1$b r8 = r7.d
            r8.run()
        L7a:
            r7.l = r2
        L7c:
            return r1
    }
}
