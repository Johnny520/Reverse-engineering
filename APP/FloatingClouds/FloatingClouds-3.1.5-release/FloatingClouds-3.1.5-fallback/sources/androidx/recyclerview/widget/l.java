package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class l extends androidx.recyclerview.widget.RecyclerView.k implements androidx.recyclerview.widget.RecyclerView.o {
    public static final int[] C = null;
    public static final int[] D = null;
    public int A;
    public final androidx.recyclerview.widget.l.a B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1004a;
    public final int b;
    public final android.graphics.drawable.StateListDrawable c;
    public final android.graphics.drawable.Drawable d;
    public final int e;
    public final int f;
    public final android.graphics.drawable.StateListDrawable g;
    public final android.graphics.drawable.Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public final androidx.recyclerview.widget.RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final android.animation.ValueAnimator z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.l f1005a;

        public a(androidx.recyclerview.widget.l r1) {
                r0 = this;
                r0.<init>()
                r0.f1005a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                r0 = 2
                r1 = 1
                androidx.recyclerview.widget.l r2 = r5.f1005a
                int r3 = r2.A
                android.animation.ValueAnimator r4 = r2.z
                if (r3 == r1) goto Ld
                if (r3 == r0) goto L10
                return
            Ld:
                r4.cancel()
            L10:
                r3 = 3
                r2.A = r3
                java.lang.Object r2 = r4.getAnimatedValue()
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                float[] r0 = new float[r0]
                r3 = 0
                r0[r3] = r2
                r2 = 0
                r0[r1] = r2
                r4.setFloatValues(r0)
                r0 = 500(0x1f4, float:7.0E-43)
                long r0 = (long) r0
                r4.setDuration(r0)
                r4.start()
                return
        }
    }

    public class b extends androidx.recyclerview.widget.RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.l f1006a;

        public b(androidx.recyclerview.widget.l r1) {
                r0 = this;
                r0.f1006a = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public final void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
                r8 = this;
                int r10 = r9.computeHorizontalScrollOffset()
                int r9 = r9.computeVerticalScrollOffset()
                androidx.recyclerview.widget.l r11 = r8.f1006a
                androidx.recyclerview.widget.RecyclerView r0 = r11.s
                int r0 = r0.computeVerticalScrollRange()
                int r1 = r11.r
                int r2 = r0 - r1
                int r3 = r11.f1004a
                r4 = 0
                r5 = 1
                if (r2 <= 0) goto L1e
                if (r1 < r3) goto L1e
                r2 = r5
                goto L1f
            L1e:
                r2 = r4
            L1f:
                r11.t = r2
                androidx.recyclerview.widget.RecyclerView r2 = r11.s
                int r2 = r2.computeHorizontalScrollRange()
                int r6 = r11.q
                int r7 = r2 - r6
                if (r7 <= 0) goto L31
                if (r6 < r3) goto L31
                r3 = r5
                goto L32
            L31:
                r3 = r4
            L32:
                r11.u = r3
                boolean r7 = r11.t
                if (r7 != 0) goto L42
                if (r3 != 0) goto L42
                int r9 = r11.v
                if (r9 == 0) goto L79
                r11.h(r4)
                return
            L42:
                r3 = 1073741824(0x40000000, float:2.0)
                if (r7 == 0) goto L5a
                float r9 = (float) r9
                float r4 = (float) r1
                float r7 = r4 / r3
                float r7 = r7 + r9
                float r7 = r7 * r4
                float r9 = (float) r0
                float r7 = r7 / r9
                int r9 = (int) r7
                r11.l = r9
                int r9 = r1 * r1
                int r9 = r9 / r0
                int r9 = java.lang.Math.min(r1, r9)
                r11.k = r9
            L5a:
                boolean r9 = r11.u
                if (r9 == 0) goto L72
                float r9 = (float) r10
                float r10 = (float) r6
                float r0 = r10 / r3
                float r0 = r0 + r9
                float r0 = r0 * r10
                float r9 = (float) r2
                float r0 = r0 / r9
                int r9 = (int) r0
                r11.o = r9
                int r9 = r6 * r6
                int r9 = r9 / r2
                int r9 = java.lang.Math.min(r6, r9)
                r11.n = r9
            L72:
                int r9 = r11.v
                if (r9 == 0) goto L7a
                if (r9 != r5) goto L79
                goto L7a
            L79:
                return
            L7a:
                r11.h(r5)
                return
        }
    }

    public class c extends android.animation.AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1007a;
        public final /* synthetic */ androidx.recyclerview.widget.l b;

        public c(androidx.recyclerview.widget.l r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r1 = 0
                r0.f1007a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f1007a = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(android.animation.Animator r4) {
                r3 = this;
                boolean r4 = r3.f1007a
                r0 = 0
                if (r4 == 0) goto L8
                r3.f1007a = r0
                return
            L8:
                androidx.recyclerview.widget.l r4 = r3.b
                android.animation.ValueAnimator r1 = r4.z
                java.lang.Object r1 = r1.getAnimatedValue()
                java.lang.Float r1 = (java.lang.Float) r1
                float r1 = r1.floatValue()
                r2 = 0
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 != 0) goto L21
                r4.A = r0
                r4.h(r0)
                return
            L21:
                r0 = 2
                r4.A = r0
                androidx.recyclerview.widget.RecyclerView r4 = r4.s
                r4.invalidate()
                return
        }
    }

    public class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.recyclerview.widget.l f1008a;

        public d(androidx.recyclerview.widget.l r1) {
                r0 = this;
                r0.<init>()
                r0.f1008a = r1
                return
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(android.animation.ValueAnimator r3) {
                r2 = this;
                java.lang.Object r3 = r3.getAnimatedValue()
                java.lang.Float r3 = (java.lang.Float) r3
                float r3 = r3.floatValue()
                r0 = 1132396544(0x437f0000, float:255.0)
                float r3 = r3 * r0
                int r3 = (int) r3
                androidx.recyclerview.widget.l r0 = r2.f1008a
                android.graphics.drawable.StateListDrawable r1 = r0.c
                r1.setAlpha(r3)
                android.graphics.drawable.Drawable r1 = r0.d
                r1.setAlpha(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r0.s
                r3.invalidate()
                return
        }
    }

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.l.C = r0
            r0 = 0
            int[] r0 = new int[r0]
            androidx.recyclerview.widget.l.D = r0
            return
    }

    public l(androidx.recyclerview.widget.RecyclerView r7, android.graphics.drawable.StateListDrawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.StateListDrawable r10, android.graphics.drawable.Drawable r11, int r12, int r13, int r14) {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.q = r0
            r6.r = r0
            r6.t = r0
            r6.u = r0
            r6.v = r0
            r6.w = r0
            r1 = 2
            int[] r2 = new int[r1]
            r6.x = r2
            int[] r2 = new int[r1]
            r6.y = r2
            float[] r2 = new float[r1]
            r2 = {x00da: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r6.z = r2
            r6.A = r0
            androidx.recyclerview.widget.l$a r3 = new androidx.recyclerview.widget.l$a
            r3.<init>(r6)
            r6.B = r3
            androidx.recyclerview.widget.l$b r4 = new androidx.recyclerview.widget.l$b
            r4.<init>(r6)
            r6.c = r8
            r6.d = r9
            r6.g = r10
            r6.h = r11
            int r5 = r8.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r12, r5)
            r6.e = r5
            int r5 = r9.getIntrinsicWidth()
            int r5 = java.lang.Math.max(r12, r5)
            r6.f = r5
            int r10 = r10.getIntrinsicWidth()
            int r10 = java.lang.Math.max(r12, r10)
            r6.i = r10
            int r10 = r11.getIntrinsicWidth()
            int r10 = java.lang.Math.max(r12, r10)
            r6.j = r10
            r6.f1004a = r13
            r6.b = r14
            r10 = 255(0xff, float:3.57E-43)
            r8.setAlpha(r10)
            r9.setAlpha(r10)
            androidx.recyclerview.widget.l$c r8 = new androidx.recyclerview.widget.l$c
            r8.<init>(r6)
            r2.addListener(r8)
            androidx.recyclerview.widget.l$d r8 = new androidx.recyclerview.widget.l$d
            r8.<init>(r6)
            r2.addUpdateListener(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            if (r8 != r7) goto L83
            goto Ld8
        L83:
            if (r8 == 0) goto Lc5
            androidx.recyclerview.widget.RecyclerView$l r9 = r8.m
            if (r9 == 0) goto L8e
            java.lang.String r10 = "Cannot remove item decoration during a scroll  or layout"
            r9.c(r10)
        L8e:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r9 = r8.p
            r9.remove(r6)
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto La3
            int r9 = r8.getOverScrollMode()
            if (r9 != r1) goto La0
            r0 = 1
        La0:
            r8.setWillNotDraw(r0)
        La3:
            r8.Q()
            r8.requestLayout()
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r9 = r8.q
            r9.remove(r6)
            androidx.recyclerview.widget.RecyclerView$o r9 = r8.r
            if (r9 != r6) goto Lb7
            r9 = 0
            r8.r = r9
        Lb7:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList r8 = r8.h0
            if (r8 == 0) goto Lc0
            r8.remove(r4)
        Lc0:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            r8.removeCallbacks(r3)
        Lc5:
            r6.s = r7
            if (r7 == 0) goto Ld8
            r7.i(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r6.s
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$o> r7 = r7.q
            r7.add(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r6.s
            r7.j(r4)
        Ld8:
            return
    }

    public static int g(float r2, float r3, int[] r4, int r5, int r6, int r7) {
            r0 = 1
            r0 = r4[r0]
            r1 = 0
            r4 = r4[r1]
            int r0 = r0 - r4
            if (r0 != 0) goto La
            goto L17
        La:
            float r3 = r3 - r2
            float r2 = (float) r0
            float r3 = r3 / r2
            int r5 = r5 - r7
            float r2 = (float) r5
            float r3 = r3 * r2
            int r2 = (int) r3
            int r6 = r6 + r2
            if (r6 >= r5) goto L17
            if (r6 < 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean a(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r5.v
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L45
            float r0 = r6.getX()
            float r3 = r6.getY()
            boolean r0 = r5.f(r0, r3)
            float r3 = r6.getX()
            float r4 = r6.getY()
            boolean r3 = r5.e(r3, r4)
            int r4 = r6.getAction()
            if (r4 != 0) goto L48
            if (r0 != 0) goto L28
            if (r3 == 0) goto L48
        L28:
            if (r3 == 0) goto L35
            r5.w = r2
            float r6 = r6.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.p = r6
            goto L41
        L35:
            if (r0 == 0) goto L41
            r5.w = r1
            float r6 = r6.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L41:
            r5.h(r1)
            return r2
        L45:
            if (r0 != r1) goto L48
            return r2
        L48:
            r6 = 0
            return r6
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r12.v
            if (r0 != 0) goto L6
            goto Lf8
        L6:
            int r0 = r13.getAction()
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L47
            float r0 = r13.getX()
            float r3 = r13.getY()
            boolean r0 = r12.f(r0, r3)
            float r3 = r13.getX()
            float r4 = r13.getY()
            boolean r3 = r12.e(r3, r4)
            if (r0 != 0) goto L2a
            if (r3 == 0) goto Lf8
        L2a:
            if (r3 == 0) goto L37
            r12.w = r2
            float r13 = r13.getX()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.p = r13
            goto L43
        L37:
            if (r0 == 0) goto L43
            r12.w = r1
            float r13 = r13.getY()
            int r13 = (int) r13
            float r13 = (float) r13
            r12.m = r13
        L43:
            r12.h(r1)
            return
        L47:
            int r0 = r13.getAction()
            r3 = 0
            if (r0 != r2) goto L5d
            int r0 = r12.v
            if (r0 != r1) goto L5d
            r13 = 0
            r12.m = r13
            r12.p = r13
            r12.h(r2)
            r12.w = r3
            return
        L5d:
            int r0 = r13.getAction()
            if (r0 != r1) goto Lf8
            int r0 = r12.v
            if (r0 != r1) goto Lf8
            r12.i()
            int r0 = r12.w
            r4 = 1073741824(0x40000000, float:2.0)
            int r5 = r12.b
            if (r0 != r2) goto Lb3
            float r0 = r13.getX()
            int[] r8 = r12.y
            r8[r3] = r5
            int r6 = r12.q
            int r6 = r6 - r5
            r8[r2] = r6
            float r7 = (float) r5
            float r6 = (float) r6
            float r0 = java.lang.Math.min(r6, r0)
            float r7 = java.lang.Math.max(r7, r0)
            int r0 = r12.o
            float r0 = (float) r0
            float r0 = r0 - r7
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L96
            goto Lb3
        L96:
            float r6 = r12.p
            androidx.recyclerview.widget.RecyclerView r0 = r12.s
            int r9 = r0.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r0 = r12.s
            int r10 = r0.computeHorizontalScrollOffset()
            int r11 = r12.q
            int r0 = g(r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView r6 = r12.s
            r6.scrollBy(r0, r3)
        Lb1:
            r12.p = r7
        Lb3:
            int r0 = r12.w
            if (r0 != r1) goto Lf8
            float r13 = r13.getY()
            int[] r8 = r12.x
            r8[r3] = r5
            int r0 = r12.r
            int r0 = r0 - r5
            r8[r2] = r0
            float r1 = (float) r5
            float r0 = (float) r0
            float r13 = java.lang.Math.min(r0, r13)
            float r7 = java.lang.Math.max(r1, r13)
            int r13 = r12.l
            float r13 = (float) r13
            float r13 = r13 - r7
            float r13 = java.lang.Math.abs(r13)
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 >= 0) goto Ldb
            goto Lf8
        Ldb:
            float r6 = r12.m
            androidx.recyclerview.widget.RecyclerView r13 = r12.s
            int r9 = r13.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r13 = r12.s
            int r10 = r13.computeVerticalScrollOffset()
            int r11 = r12.r
            int r13 = g(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Lf6
            androidx.recyclerview.widget.RecyclerView r0 = r12.s
            r0.scrollBy(r3, r13)
        Lf6:
            r12.m = r7
        Lf8:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void d(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11) {
            r9 = this;
            int r11 = r9.q
            androidx.recyclerview.widget.RecyclerView r0 = r9.s
            int r1 = r0.getWidth()
            r2 = 0
            if (r11 != r1) goto La7
            int r11 = r9.r
            int r1 = r0.getHeight()
            if (r11 == r1) goto L15
            goto La7
        L15:
            int r11 = r9.A
            if (r11 == 0) goto La6
            boolean r11 = r9.t
            r1 = 0
            if (r11 == 0) goto L73
            int r11 = r9.q
            int r3 = r9.e
            int r11 = r11 - r3
            int r4 = r9.l
            int r5 = r9.k
            int r6 = r5 / 2
            int r4 = r4 - r6
            android.graphics.drawable.StateListDrawable r6 = r9.c
            r6.setBounds(r2, r2, r3, r5)
            int r5 = r9.r
            int r7 = r9.f
            android.graphics.drawable.Drawable r8 = r9.d
            r8.setBounds(r2, r2, r7, r5)
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            int r0 = r0.getLayoutDirection()
            r5 = 1
            if (r0 != r5) goto L5e
            r8.draw(r10)
            float r11 = (float) r3
            float r0 = (float) r4
            r10.translate(r11, r0)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.scale(r11, r0)
            r6.draw(r10)
            r10.scale(r11, r0)
            int r11 = -r3
            float r11 = (float) r11
            int r0 = -r4
            float r0 = (float) r0
            r10.translate(r11, r0)
            goto L73
        L5e:
            float r0 = (float) r11
            r10.translate(r0, r1)
            r8.draw(r10)
            float r0 = (float) r4
            r10.translate(r1, r0)
            r6.draw(r10)
            int r11 = -r11
            float r11 = (float) r11
            int r0 = -r4
            float r0 = (float) r0
            r10.translate(r11, r0)
        L73:
            boolean r11 = r9.u
            if (r11 == 0) goto La6
            int r11 = r9.r
            int r0 = r9.i
            int r11 = r11 - r0
            int r3 = r9.o
            int r4 = r9.n
            int r5 = r4 / 2
            int r3 = r3 - r5
            android.graphics.drawable.StateListDrawable r5 = r9.g
            r5.setBounds(r2, r2, r4, r0)
            int r0 = r9.q
            int r4 = r9.j
            android.graphics.drawable.Drawable r6 = r9.h
            r6.setBounds(r2, r2, r0, r4)
            float r0 = (float) r11
            r10.translate(r1, r0)
            r6.draw(r10)
            float r0 = (float) r3
            r10.translate(r0, r1)
            r5.draw(r10)
            int r0 = -r3
            float r0 = (float) r0
            int r11 = -r11
            float r11 = (float) r11
            r10.translate(r0, r11)
        La6:
            return
        La7:
            int r10 = r0.getWidth()
            r9.q = r10
            int r10 = r0.getHeight()
            r9.r = r10
            r9.h(r2)
            return
    }

    public final boolean e(float r3, float r4) {
            r2 = this;
            int r0 = r2.r
            int r1 = r2.i
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L21
            int r4 = r2.o
            int r0 = r2.n
            int r1 = r0 / 2
            int r1 = r4 - r1
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L21
            int r0 = r0 / 2
            int r0 = r0 + r4
            float r4 = (float) r0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    public final boolean f(float r5, float r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.s
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r0 = r0.getLayoutDirection()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            int r3 = r4.e
            if (r0 == 0) goto L19
            float r0 = (float) r3
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L35
            goto L21
        L19:
            int r0 = r4.q
            int r0 = r0 - r3
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L35
        L21:
            int r5 = r4.l
            int r0 = r4.k
            int r0 = r0 / 2
            int r3 = r5 - r0
            float r3 = (float) r3
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 < 0) goto L35
            int r0 = r0 + r5
            float r5 = (float) r0
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L35
            return r2
        L35:
            return r1
    }

    public final void h(int r5) {
            r4 = this;
            androidx.recyclerview.widget.l$a r0 = r4.B
            android.graphics.drawable.StateListDrawable r1 = r4.c
            r2 = 2
            if (r5 != r2) goto L15
            int r3 = r4.v
            if (r3 == r2) goto L15
            int[] r3 = androidx.recyclerview.widget.l.C
            r1.setState(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r4.s
            r3.removeCallbacks(r0)
        L15:
            if (r5 != 0) goto L1d
            androidx.recyclerview.widget.RecyclerView r3 = r4.s
            r3.invalidate()
            goto L20
        L1d:
            r4.i()
        L20:
            int r3 = r4.v
            if (r3 != r2) goto L39
            if (r5 == r2) goto L39
            int[] r2 = androidx.recyclerview.widget.l.D
            r1.setState(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r4.s
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.s
            r2 = 1200(0x4b0, float:1.682E-42)
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
            goto L49
        L39:
            r1 = 1
            if (r5 != r1) goto L49
            androidx.recyclerview.widget.RecyclerView r1 = r4.s
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.s
            r2 = 1500(0x5dc, float:2.102E-42)
            long r2 = (long) r2
            r1.postDelayed(r0, r2)
        L49:
            r4.v = r5
            return
    }

    public final void i() {
            r5 = this;
            r0 = 1
            int r1 = r5.A
            android.animation.ValueAnimator r2 = r5.z
            if (r1 == 0) goto Le
            r3 = 3
            if (r1 == r3) goto Lb
            return
        Lb:
            r2.cancel()
        Le:
            r5.A = r0
            java.lang.Object r1 = r2.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r3[r0] = r1
            r2.setFloatValues(r3)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r0 = 0
            r2.setStartDelay(r0)
            r2.start()
            return
    }
}
