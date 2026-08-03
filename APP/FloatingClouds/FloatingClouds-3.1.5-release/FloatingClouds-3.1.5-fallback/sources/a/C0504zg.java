package a;

/* JADX INFO: renamed from: a.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504zg {
    public static final a.C0504zg.a v = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f781a;
    public final int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public android.view.VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final android.widget.OverScroller p;
    public final a.C0504zg.c q;
    public android.view.View r;
    public boolean s;
    public final androidx.coordinatorlayout.widget.CoordinatorLayout t;
    public final a.C0504zg.b u;

    /* JADX INFO: renamed from: a.zg$a */
    public class a implements android.view.animation.Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float r3) {
                r2 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r0
                float r1 = r3 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: renamed from: a.zg$b */
    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0504zg f782a;

        public b(a.C0504zg r1) {
                r0 = this;
                r0.<init>()
                r0.f782a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.zg r0 = r2.f782a
                r1 = 0
                r0.n(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.zg$c */
    public static abstract class c {
        public abstract int a(android.view.View r1, int r2);

        public abstract int b(android.view.View r1, int r2);

        public int c(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int d() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void e(android.view.View r1, int r2) {
                r0 = this;
                return
        }

        public abstract void f(int r1);

        public abstract void g(android.view.View r1, int r2, int r3);

        public abstract void h(android.view.View r1, float r2, float r3);

        public abstract boolean i(android.view.View r1, int r2);
    }

    static {
            a.zg$a r0 = new a.zg$a
            r0.<init>()
            a.C0504zg.v = r0
            return
    }

    public C0504zg(android.content.Context r2, androidx.coordinatorlayout.widget.CoordinatorLayout r3, a.C0504zg.c r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.c = r0
            a.zg$b r0 = new a.zg$b
            r0.<init>(r1)
            r1.u = r0
            if (r3 == 0) goto L52
            if (r4 == 0) goto L4a
            r1.t = r3
            r1.q = r4
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r2)
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            r1.o = r4
            int r4 = r3.getScaledTouchSlop()
            r1.b = r4
            int r4 = r3.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r1.m = r4
            int r3 = r3.getScaledMinimumFlingVelocity()
            float r3 = (float) r3
            r1.n = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            a.zg$a r4 = a.C0504zg.v
            r3.<init>(r2, r4)
            r1.p = r3
            return
        L4a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Callback may not be null"
            r2.<init>(r3)
            throw r2
        L52:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parent view may not be null"
            r2.<init>(r3)
            throw r2
    }

    public final void a() {
            r2 = this;
            r0 = -1
            r2.c = r0
            float[] r0 = r2.d
            if (r0 != 0) goto L8
            goto L2d
        L8:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.e
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.f
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.g
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.h
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.i
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.j
            java.util.Arrays.fill(r0, r1)
            r2.k = r1
        L2d:
            android.view.VelocityTracker r0 = r2.l
            if (r0 == 0) goto L37
            r0.recycle()
            r0 = 0
            r2.l = r0
        L37:
            return
    }

    public final void b(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r2.t
            if (r0 != r1) goto L16
            r2.r = r3
            r2.c = r4
            a.zg$c r0 = r2.q
            r0.e(r3, r4)
            r3 = 1
            r2.n(r3)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public final boolean c(android.view.View r4, float r5, float r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            a.zg$c r1 = r3.q
            int r4 = r1.c(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.d()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
    }

    public final void d(int r5) {
            r4 = this;
            float[] r0 = r4.d
            if (r0 == 0) goto L2c
            int r1 = r4.k
            r2 = 1
            int r2 = r2 << r5
            r3 = r1 & r2
            if (r3 == 0) goto L2c
            r3 = 0
            r0[r5] = r3
            float[] r0 = r4.e
            r0[r5] = r3
            float[] r0 = r4.f
            r0[r5] = r3
            float[] r0 = r4.g
            r0[r5] = r3
            int[] r0 = r4.h
            r3 = 0
            r0[r5] = r3
            int[] r0 = r4.i
            r0[r5] = r3
            int[] r0 = r4.j
            r0[r5] = r3
            int r5 = ~r2
            r5 = r5 & r1
            r4.k = r5
        L2c:
            return
    }

    public final int e(int r5, int r6, int r7) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r4.t
            int r0 = r0.getWidth()
            int r1 = r0 / 2
            int r2 = java.lang.Math.abs(r5)
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r0, r2)
            float r1 = (float) r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 - r3
            r3 = 1055999547(0x3ef1463b, float:0.47123894)
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sin(r2)
            float r2 = (float) r2
            float r2 = r2 * r1
            float r2 = r2 + r1
            int r6 = java.lang.Math.abs(r6)
            if (r6 <= 0) goto L3f
            float r5 = (float) r6
            float r2 = r2 / r5
            float r5 = java.lang.Math.abs(r2)
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r5 = r5 * 4
            goto L4b
        L3f:
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            float r6 = (float) r7
            float r5 = r5 / r6
            float r5 = r5 + r0
            r6 = 1132462080(0x43800000, float:256.0)
            float r5 = r5 * r6
            int r5 = (int) r5
        L4b:
            r6 = 600(0x258, float:8.41E-43)
            int r5 = java.lang.Math.min(r5, r6)
            return r5
    }

    public final boolean f() {
            r10 = this;
            int r0 = r10.f781a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L5c
            android.widget.OverScroller r0 = r10.p
            boolean r3 = r0.computeScrollOffset()
            int r4 = r0.getCurrX()
            int r5 = r0.getCurrY()
            android.view.View r6 = r10.r
            int r6 = r6.getLeft()
            int r6 = r4 - r6
            android.view.View r7 = r10.r
            int r7 = r7.getTop()
            int r7 = r5 - r7
            if (r6 == 0) goto L2d
            android.view.View r8 = r10.r
            java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
            r8.offsetLeftAndRight(r6)
        L2d:
            if (r7 == 0) goto L36
            android.view.View r8 = r10.r
            java.util.WeakHashMap<android.view.View, a.Jg> r9 = a.C0414ug.f721a
            r8.offsetTopAndBottom(r7)
        L36:
            if (r6 != 0) goto L3a
            if (r7 == 0) goto L41
        L3a:
            a.zg$c r6 = r10.q
            android.view.View r7 = r10.r
            r6.g(r7, r4, r5)
        L41:
            if (r3 == 0) goto L53
            int r6 = r0.getFinalX()
            if (r4 != r6) goto L53
            int r4 = r0.getFinalY()
            if (r5 != r4) goto L53
            r0.abortAnimation()
            r3 = r1
        L53:
            if (r3 != 0) goto L5c
            a.zg$b r0 = r10.u
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = r10.t
            r3.post(r0)
        L5c:
            int r0 = r10.f781a
            if (r0 != r2) goto L62
            r0 = 1
            return r0
        L62:
            return r1
    }

    public final android.view.View g(int r5, int r6) {
            r4 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r4.t
            int r1 = r0.getChildCount()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L2f
            a.zg$c r2 = r4.q
            r2.getClass()
            android.view.View r2 = r0.getChildAt(r1)
            int r3 = r2.getLeft()
            if (r5 < r3) goto L2c
            int r3 = r2.getRight()
            if (r5 >= r3) goto L2c
            int r3 = r2.getTop()
            if (r6 < r3) goto L2c
            int r3 = r2.getBottom()
            if (r6 >= r3) goto L2c
            return r2
        L2c:
            int r1 = r1 + (-1)
            goto L8
        L2f:
            r5 = 0
            return r5
    }

    public final boolean h(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.r
            int r2 = r0.getLeft()
            android.view.View r0 = r10.r
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.p
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.n(r11)
            return r11
        L1e:
            android.view.View r12 = r10.r
            float r0 = r10.n
            int r0 = (int) r0
            float r6 = r10.m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L3d
            r14 = r11
            goto L44
        L3d:
            if (r7 <= r6) goto L44
            if (r14 <= 0) goto L43
            r14 = r6
            goto L44
        L43:
            int r14 = -r6
        L44:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L5e
            float r11 = (float) r6
            float r6 = (float) r8
        L5c:
            float r11 = r11 / r6
            goto L61
        L5e:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L5c
        L61:
            if (r14 == 0) goto L67
            float r0 = (float) r7
            float r6 = (float) r8
        L65:
            float r0 = r0 / r6
            goto L6a
        L67:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L65
        L6a:
            a.zg$c r6 = r10.q
            int r12 = r6.c(r12)
            int r12 = r10.e(r4, r13, r12)
            int r13 = r6.d()
            int r13 = r10.e(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.n(r11)
            r11 = 1
            return r11
    }

    public final boolean i(int r4) {
            r3 = this;
            int r0 = r3.k
            r1 = 1
            int r2 = r1 << r4
            r0 = r0 & r2
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring pointerId="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ViewDragHelper"
            android.util.Log.e(r0, r4)
            r4 = 0
            return r4
    }

    public final void j(android.view.MotionEvent r10) {
            r9 = this;
            r0 = 1
            int r1 = r10.getActionMasked()
            int r2 = r10.getActionIndex()
            if (r1 != 0) goto Le
            r9.a()
        Le:
            android.view.VelocityTracker r3 = r9.l
            if (r3 != 0) goto L18
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.l = r3
        L18:
            android.view.VelocityTracker r3 = r9.l
            r3.addMovement(r10)
            r3 = 0
            if (r1 == 0) goto L1c0
            if (r1 == r0) goto L1b5
            r4 = 2
            a.zg$c r5 = r9.q
            if (r1 == r4) goto Ld8
            r4 = 3
            if (r1 == r4) goto Lbf
            r4 = 5
            if (r1 == r4) goto L75
            r4 = 6
            if (r1 == r4) goto L32
            goto Le4
        L32:
            int r1 = r10.getPointerId(r2)
            int r2 = r9.f781a
            if (r2 != r0) goto L71
            int r2 = r9.c
            if (r1 != r2) goto L71
            int r2 = r10.getPointerCount()
        L42:
            r4 = -1
            if (r3 >= r2) goto L6b
            int r5 = r10.getPointerId(r3)
            int r6 = r9.c
            if (r5 != r6) goto L4e
            goto L69
        L4e:
            float r6 = r10.getX(r3)
            float r7 = r10.getY(r3)
            int r6 = (int) r6
            int r7 = (int) r7
            android.view.View r6 = r9.g(r6, r7)
            android.view.View r7 = r9.r
            if (r6 != r7) goto L69
            boolean r5 = r9.q(r7, r5)
            if (r5 == 0) goto L69
            int r10 = r9.c
            goto L6c
        L69:
            int r3 = r3 + r0
            goto L42
        L6b:
            r10 = r4
        L6c:
            if (r10 != r4) goto L71
            r9.k()
        L71:
            r9.d(r1)
            return
        L75:
            int r1 = r10.getPointerId(r2)
            float r4 = r10.getX(r2)
            float r10 = r10.getY(r2)
            r9.l(r4, r10, r1)
            int r2 = r9.f781a
            if (r2 != 0) goto L96
            int r0 = (int) r4
            int r10 = (int) r10
            android.view.View r10 = r9.g(r0, r10)
            r9.q(r10, r1)
            int[] r10 = r9.h
            r10 = r10[r1]
            return
        L96:
            int r2 = (int) r4
            int r10 = (int) r10
            android.view.View r4 = r9.r
            if (r4 != 0) goto L9d
            goto Lb6
        L9d:
            int r5 = r4.getLeft()
            if (r2 < r5) goto Lb6
            int r5 = r4.getRight()
            if (r2 >= r5) goto Lb6
            int r2 = r4.getTop()
            if (r10 < r2) goto Lb6
            int r2 = r4.getBottom()
            if (r10 >= r2) goto Lb6
            goto Lb7
        Lb6:
            r0 = r3
        Lb7:
            if (r0 == 0) goto Le4
            android.view.View r10 = r9.r
            r9.q(r10, r1)
            return
        Lbf:
            int r10 = r9.f781a
            if (r10 != r0) goto Ld4
            r9.s = r0
            android.view.View r10 = r9.r
            r1 = 0
            r5.h(r10, r1, r1)
            r9.s = r3
            int r10 = r9.f781a
            if (r10 != r0) goto Ld4
            r9.n(r3)
        Ld4:
            r9.a()
            return
        Ld8:
            int r1 = r9.f781a
            if (r1 != r0) goto L14a
            int r0 = r9.c
            boolean r0 = r9.i(r0)
            if (r0 != 0) goto Le5
        Le4:
            return
        Le5:
            int r0 = r9.c
            int r0 = r10.findPointerIndex(r0)
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.f
            int r3 = r9.c
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.g
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.r
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.r
            int r3 = r3.getTop()
            int r3 = r3 + r0
            android.view.View r4 = r9.r
            int r4 = r4.getLeft()
            android.view.View r6 = r9.r
            int r6 = r6.getTop()
            if (r1 == 0) goto L12c
            android.view.View r7 = r9.r
            int r2 = r5.a(r7, r2)
            android.view.View r7 = r9.r
            int r4 = r2 - r4
            java.util.WeakHashMap<android.view.View, a.Jg> r8 = a.C0414ug.f721a
            r7.offsetLeftAndRight(r4)
        L12c:
            if (r0 == 0) goto L13d
            android.view.View r4 = r9.r
            int r3 = r5.b(r4, r3)
            android.view.View r4 = r9.r
            int r6 = r3 - r6
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            r4.offsetTopAndBottom(r6)
        L13d:
            if (r1 != 0) goto L141
            if (r0 == 0) goto L146
        L141:
            android.view.View r0 = r9.r
            r5.g(r0, r2, r3)
        L146:
            r9.m(r10)
            return
        L14a:
            int r1 = r10.getPointerCount()
        L14e:
            if (r3 >= r1) goto L1b1
            int r2 = r10.getPointerId(r3)
            boolean r4 = r9.i(r2)
            if (r4 != 0) goto L15b
            goto L1af
        L15b:
            float r4 = r10.getX(r3)
            float r5 = r10.getY(r3)
            float[] r6 = r9.d
            r6 = r6[r2]
            float r6 = r4 - r6
            float[] r7 = r9.e
            r7 = r7[r2]
            float r7 = r5 - r7
            java.lang.Math.abs(r6)
            java.lang.Math.abs(r7)
            int[] r8 = r9.h
            r8 = r8[r2]
            java.lang.Math.abs(r7)
            java.lang.Math.abs(r6)
            int[] r8 = r9.h
            r8 = r8[r2]
            java.lang.Math.abs(r6)
            java.lang.Math.abs(r7)
            int[] r8 = r9.h
            r8 = r8[r2]
            java.lang.Math.abs(r7)
            java.lang.Math.abs(r6)
            int[] r8 = r9.h
            r8 = r8[r2]
            int r8 = r9.f781a
            if (r8 != r0) goto L19c
            goto L1b1
        L19c:
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.g(r4, r5)
            boolean r5 = r9.c(r4, r6, r7)
            if (r5 == 0) goto L1af
            boolean r2 = r9.q(r4, r2)
            if (r2 == 0) goto L1af
            goto L1b1
        L1af:
            int r3 = r3 + r0
            goto L14e
        L1b1:
            r9.m(r10)
            return
        L1b5:
            int r10 = r9.f781a
            if (r10 != r0) goto L1bc
            r9.k()
        L1bc:
            r9.a()
            return
        L1c0:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r3)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.g(r2, r3)
            r9.l(r0, r1, r10)
            r9.q(r2, r10)
            int[] r0 = r9.h
            r10 = r0[r10]
            return
    }

    public final void k() {
            r6 = this;
            android.view.VelocityTracker r0 = r6.l
            float r1 = r6.m
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            android.view.VelocityTracker r0 = r6.l
            int r2 = r6.c
            float r0 = r0.getXVelocity(r2)
            float r2 = r6.n
            float r3 = java.lang.Math.abs(r0)
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L1e
            r0 = r5
            goto L29
        L1e:
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L29
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L28
            r0 = r1
            goto L29
        L28:
            float r0 = -r1
        L29:
            android.view.VelocityTracker r3 = r6.l
            int r4 = r6.c
            float r3 = r3.getYVelocity(r4)
            float r4 = java.lang.Math.abs(r3)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3b
            r1 = r5
            goto L47
        L3b:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L46
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L44
            goto L47
        L44:
            float r1 = -r1
            goto L47
        L46:
            r1 = r3
        L47:
            r2 = 1
            r6.s = r2
            a.zg$c r3 = r6.q
            android.view.View r4 = r6.r
            r3.h(r4, r0, r1)
            r0 = 0
            r6.s = r0
            int r1 = r6.f781a
            if (r1 != r2) goto L5b
            r6.n(r0)
        L5b:
            return
    }

    public final void l(float r11, float r12, int r13) {
            r10 = this;
            float[] r0 = r10.d
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r13) goto L50
        L8:
            int r2 = r13 + 1
            float[] r3 = new float[r2]
            float[] r4 = new float[r2]
            float[] r5 = new float[r2]
            float[] r6 = new float[r2]
            int[] r7 = new int[r2]
            int[] r8 = new int[r2]
            int[] r2 = new int[r2]
            if (r0 == 0) goto L42
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r3, r1, r9)
            float[] r0 = r10.e
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r4, r1, r9)
            float[] r0 = r10.f
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r5, r1, r9)
            float[] r0 = r10.g
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r6, r1, r9)
            int[] r0 = r10.h
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r7, r1, r9)
            int[] r0 = r10.i
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r8, r1, r9)
            int[] r0 = r10.j
            int r9 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r9)
        L42:
            r10.d = r3
            r10.e = r4
            r10.f = r5
            r10.g = r6
            r10.h = r7
            r10.i = r8
            r10.j = r2
        L50:
            float[] r0 = r10.d
            float[] r2 = r10.f
            r2[r13] = r11
            r0[r13] = r11
            float[] r0 = r10.e
            float[] r2 = r10.g
            r2[r13] = r12
            r0[r13] = r12
            int[] r0 = r10.h
            int r11 = (int) r11
            int r12 = (int) r12
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = r10.t
            int r3 = r2.getLeft()
            int r4 = r10.o
            int r3 = r3 + r4
            r5 = 1
            if (r11 >= r3) goto L71
            r1 = r5
        L71:
            int r3 = r2.getTop()
            int r3 = r3 + r4
            if (r12 >= r3) goto L7a
            r1 = r1 | 4
        L7a:
            int r3 = r2.getRight()
            int r3 = r3 - r4
            if (r11 <= r3) goto L83
            r1 = r1 | 2
        L83:
            int r11 = r2.getBottom()
            int r11 = r11 - r4
            if (r12 <= r11) goto L8c
            r1 = r1 | 8
        L8c:
            r0[r13] = r1
            int r11 = r10.k
            int r12 = r5 << r13
            r11 = r11 | r12
            r10.k = r11
            return
    }

    public final void m(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.i(r2)
            if (r3 != 0) goto L12
            goto L22
        L12:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.f
            r5[r2] = r3
            float[] r3 = r6.g
            r3[r2] = r4
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            return
    }

    public final void n(int r3) {
            r2 = this;
            a.zg$b r0 = r2.u
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r2.t
            r1.removeCallbacks(r0)
            int r0 = r2.f781a
            if (r0 == r3) goto L19
            r2.f781a = r3
            a.zg$c r0 = r2.q
            r0.f(r3)
            int r3 = r2.f781a
            if (r3 != 0) goto L19
            r3 = 0
            r2.r = r3
        L19:
            return
    }

    public final boolean o(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.s
            if (r0 == 0) goto L1b
            android.view.VelocityTracker r0 = r3.l
            int r1 = r3.c
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r3.l
            int r2 = r3.c
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            boolean r4 = r3.h(r4, r5, r0, r1)
            return r4
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r4.<init>(r5)
            throw r4
    }

    public final boolean p(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            int r3 = r1.getActionIndex()
            if (r2 != 0) goto L11
            r0.a()
        L11:
            android.view.VelocityTracker r4 = r0.l
            if (r4 != 0) goto L1b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.l = r4
        L1b:
            android.view.VelocityTracker r4 = r0.l
            r4.addMovement(r1)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L118
            if (r2 == r4) goto L114
            if (r2 == r5) goto L67
            r7 = 3
            if (r2 == r7) goto L114
            r7 = 5
            if (r2 == r7) goto L3d
            r5 = 6
            if (r2 == r5) goto L34
            goto L13c
        L34:
            int r1 = r1.getPointerId(r3)
            r0.d(r1)
            goto L13c
        L3d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.l(r7, r1, r2)
            int r3 = r0.f781a
            if (r3 != 0) goto L56
            int[] r1 = r0.h
            r1 = r1[r2]
            goto L13c
        L56:
            if (r3 != r5) goto L13c
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.g(r3, r1)
            android.view.View r3 = r0.r
            if (r1 != r3) goto L13c
            r0.q(r1, r2)
            goto L13c
        L67:
            float[] r2 = r0.d
            if (r2 == 0) goto L13c
            float[] r2 = r0.e
            if (r2 != 0) goto L71
            goto L13c
        L71:
            int r2 = r1.getPointerCount()
            r3 = r6
        L76:
            if (r3 >= r2) goto L110
            int r5 = r1.getPointerId(r3)
            boolean r7 = r0.i(r5)
            if (r7 != 0) goto L84
            goto L10c
        L84:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.d
            r9 = r9[r5]
            float r9 = r7 - r9
            float[] r10 = r0.e
            r10 = r10[r5]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.g(r7, r8)
            if (r7 == 0) goto La8
            boolean r8 = r0.c(r7, r9, r10)
            if (r8 == 0) goto La8
            r8 = r4
            goto La9
        La8:
            r8 = r6
        La9:
            if (r8 == 0) goto Ld6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r12 = r12 + r11
            a.zg$c r13 = r0.q
            int r12 = r13.a(r7, r12)
            int r14 = r7.getTop()
            int r15 = (int) r10
            int r15 = r15 + r14
            int r15 = r13.b(r7, r15)
            int r16 = r13.c(r7)
            int r13 = r13.d()
            if (r16 == 0) goto Lcf
            if (r16 <= 0) goto Ld6
            if (r12 != r11) goto Ld6
        Lcf:
            if (r13 == 0) goto L110
            if (r13 <= 0) goto Ld6
            if (r15 != r14) goto Ld6
            goto L110
        Ld6:
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r9)
            java.lang.Math.abs(r10)
            int[] r11 = r0.h
            r11 = r11[r5]
            java.lang.Math.abs(r10)
            java.lang.Math.abs(r9)
            int[] r9 = r0.h
            r9 = r9[r5]
            int r9 = r0.f781a
            if (r9 != r4) goto L103
            goto L110
        L103:
            if (r8 == 0) goto L10c
            boolean r5 = r0.q(r7, r5)
            if (r5 == 0) goto L10c
            goto L110
        L10c:
            int r3 = r3 + 1
            goto L76
        L110:
            r17.m(r18)
            goto L13c
        L114:
            r0.a()
            goto L13c
        L118:
            float r2 = r1.getX()
            float r3 = r1.getY()
            int r1 = r1.getPointerId(r6)
            r0.l(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.g(r2, r3)
            android.view.View r3 = r0.r
            if (r2 != r3) goto L138
            int r3 = r0.f781a
            if (r3 != r5) goto L138
            r0.q(r2, r1)
        L138:
            int[] r2 = r0.h
            r1 = r2[r1]
        L13c:
            int r1 = r0.f781a
            if (r1 != r4) goto L141
            return r4
        L141:
            return r6
    }

    public final boolean q(android.view.View r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.r
            r1 = 1
            if (r3 != r0) goto La
            int r0 = r2.c
            if (r0 != r4) goto La
            return r1
        La:
            if (r3 == 0) goto L1a
            a.zg$c r0 = r2.q
            boolean r0 = r0.i(r3, r4)
            if (r0 == 0) goto L1a
            r2.c = r4
            r2.b(r3, r4)
            return r1
        L1a:
            r3 = 0
            return r3
    }
}
