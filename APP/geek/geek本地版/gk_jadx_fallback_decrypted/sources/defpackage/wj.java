package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj extends defpackage.kz {
    public static final int[] C = null;
    public static final int[] D = null;
    public int A;
    public final defpackage.y6 B;
    public final int a;
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

    static {
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            defpackage.wj.C = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.wj.D = r0
            return
    }

    public wj(androidx.recyclerview.widget.RecyclerView r7, android.graphics.drawable.StateListDrawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.StateListDrawable r10, android.graphics.drawable.Drawable r11, int r12, int r13, int r14) {
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
            y6 r3 = new y6
            r4 = 6
            r3.<init>(r4, r6)
            r6.B = r3
            vj r4 = new vj
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
            r6.a = r13
            r6.b = r14
            r10 = 255(0xff, float:3.57E-43)
            r8.setAlpha(r10)
            r9.setAlpha(r10)
            oj r8 = new oj
            r8.<init>(r6)
            r2.addListener(r8)
            q7 r8 = new q7
            r9 = 1
            r8.<init>(r9, r6)
            r2.addUpdateListener(r8)
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            if (r8 != r7) goto L85
            return
        L85:
            if (r8 == 0) goto Lc7
            java.util.ArrayList r10 = r8.m
            nz r11 = r8.l
            if (r11 == 0) goto L92
            java.lang.String r12 = "Cannot remove item decoration during a scroll  or layout"
            r11.c(r12)
        L92:
            r10.remove(r6)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto La5
            int r10 = r8.getOverScrollMode()
            if (r10 != r1) goto La2
            r0 = r9
        La2:
            r8.setWillNotDraw(r0)
        La5:
            r8.N()
            r8.requestLayout()
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList r9 = r8.n
            r9.remove(r6)
            wj r9 = r8.o
            if (r9 != r6) goto Lb9
            r9 = 0
            r8.o = r9
        Lb9:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            java.util.ArrayList r8 = r8.e0
            if (r8 == 0) goto Lc2
            r8.remove(r4)
        Lc2:
            androidx.recyclerview.widget.RecyclerView r8 = r6.s
            r8.removeCallbacks(r3)
        Lc7:
            r6.s = r7
            r7.g(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r6.s
            java.util.ArrayList r7 = r7.n
            r7.add(r6)
            androidx.recyclerview.widget.RecyclerView r7 = r6.s
            r7.h(r4)
            return
    }

    public static int e(float r2, float r3, int[] r4, int r5, int r6, int r7) {
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

    @Override // defpackage.kz
    public final void b(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11) {
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
            int r5 = r9.f
            int r7 = r9.r
            android.graphics.drawable.Drawable r8 = r9.d
            r8.setBounds(r2, r2, r5, r7)
            java.util.WeakHashMap r5 = defpackage.ja0.a
            int r0 = defpackage.t90.d(r0)
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
            r10.scale(r0, r0)
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
            r9.f(r2)
            return
    }

    public final boolean c(float r3, float r4) {
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

    public final boolean d(float r4, float r5) {
            r3 = this;
            java.util.WeakHashMap r0 = defpackage.ja0.a
            androidx.recyclerview.widget.RecyclerView r0 = r3.s
            int r0 = defpackage.t90.d(r0)
            int r1 = r3.e
            r2 = 1
            if (r0 != r2) goto L15
            int r1 = r1 / 2
            float r0 = (float) r1
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L31
            goto L1d
        L15:
            int r0 = r3.q
            int r0 = r0 - r1
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L31
        L1d:
            int r4 = r3.l
            int r0 = r3.k
            int r0 = r0 / 2
            int r1 = r4 - r0
            float r1 = (float) r1
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L31
            int r0 = r0 + r4
            float r4 = (float) r0
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L31
            return r2
        L31:
            r4 = 0
            return r4
    }

    public final void f(int r5) {
            r4 = this;
            y6 r0 = r4.B
            android.graphics.drawable.StateListDrawable r1 = r4.c
            r2 = 2
            if (r5 != r2) goto L15
            int r3 = r4.v
            if (r3 == r2) goto L15
            int[] r3 = defpackage.wj.C
            r1.setState(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r4.s
            r3.removeCallbacks(r0)
        L15:
            if (r5 != 0) goto L1d
            androidx.recyclerview.widget.RecyclerView r3 = r4.s
            r3.invalidate()
            goto L20
        L1d:
            r4.g()
        L20:
            int r3 = r4.v
            if (r3 != r2) goto L39
            if (r5 == r2) goto L39
            int[] r2 = defpackage.wj.D
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

    public final void g() {
            r5 = this;
            int r0 = r5.A
            android.animation.ValueAnimator r1 = r5.z
            if (r0 == 0) goto Ld
            r2 = 3
            if (r0 == r2) goto La
            return
        La:
            r1.cancel()
        Ld:
            r0 = 1
            r5.A = r0
            java.lang.Object r2 = r1.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r3[r0] = r2
            r1.setFloatValues(r3)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.setDuration(r2)
            r2 = 0
            r1.setStartDelay(r2)
            r1.start()
            return
    }
}
