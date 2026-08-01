package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class yq {
    public int a;
    public androidx.recyclerview.widget.RecyclerView b;
    public defpackage.nz c;
    public boolean d;
    public boolean e;
    public android.view.View f;
    public final defpackage.wz g;
    public boolean h;
    public final android.view.animation.LinearInterpolator i;
    public final android.view.animation.DecelerateInterpolator j;
    public android.graphics.PointF k;
    public final android.util.DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public yq(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.a = r0
            wz r1 = new wz
            r1.<init>()
            r1.d = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            r1.a = r0
            r1.b = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.c = r2
            r2 = 0
            r1.e = r2
            r3.g = r1
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r3.i = r1
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.j = r1
            r3.m = r0
            r3.o = r0
            r3.p = r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r3.l = r4
            return
    }

    public static int a(int r1, int r2, int r3, int r4, int r5) {
            r0 = -1
            if (r5 == r0) goto L1c
            if (r5 == 0) goto L12
            r1 = 1
            if (r5 != r1) goto La
            int r4 = r4 - r2
            return r4
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            r1.<init>(r2)
            throw r1
        L12:
            int r3 = r3 - r1
            if (r3 <= 0) goto L16
            return r3
        L16:
            int r4 = r4 - r2
            if (r4 >= 0) goto L1a
            return r4
        L1a:
            r1 = 0
            return r1
        L1c:
            int r3 = r3 - r1
            return r3
    }

    public int b(android.view.View r5, int r6) {
            r4 = this;
            nz r0 = r4.c
            if (r0 == 0) goto L45
            boolean r1 = r0.d()
            if (r1 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            int r2 = r5.getLeft()
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.left
            int r2 = r2 - r3
            int r3 = r1.leftMargin
            int r2 = r2 - r3
            int r3 = r5.getRight()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            oz r5 = (defpackage.oz) r5
            android.graphics.Rect r5 = r5.b
            int r5 = r5.right
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r5 = r0.C()
            int r1 = r0.n
            int r0 = r0.D()
            int r1 = r1 - r0
            int r5 = a(r2, r3, r5, r1, r6)
            return r5
        L45:
            r5 = 0
            return r5
    }

    public int c(android.view.View r5, int r6) {
            r4 = this;
            nz r0 = r4.c
            if (r0 == 0) goto L45
            boolean r1 = r0.e()
            if (r1 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            oz r1 = (defpackage.oz) r1
            int r2 = r5.getTop()
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            oz r3 = (defpackage.oz) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.top
            int r2 = r2 - r3
            int r3 = r1.topMargin
            int r2 = r2 - r3
            int r3 = r5.getBottom()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            oz r5 = (defpackage.oz) r5
            android.graphics.Rect r5 = r5.b
            int r5 = r5.bottom
            int r3 = r3 + r5
            int r5 = r1.bottomMargin
            int r3 = r3 + r5
            int r5 = r0.E()
            int r1 = r0.o
            int r0 = r0.B()
            int r1 = r1 - r0
            int r5 = a(r2, r3, r5, r1, r6)
            return r5
        L45:
            r5 = 0
            return r5
    }

    public float d(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 / r2
            return r0
    }

    public int e(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            boolean r0 = r2.m
            if (r0 != 0) goto L14
            android.util.DisplayMetrics r0 = r2.l
            float r0 = r2.d(r0)
            r2.n = r0
            r0 = 1
            r2.m = r0
        L14:
            float r0 = r2.n
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }

    public android.graphics.PointF f(int r3) {
            r2 = this;
            nz r0 = r2.c
            boolean r1 = r0 instanceof defpackage.xz
            if (r1 == 0) goto Ld
            xz r0 = (defpackage.xz) r0
            android.graphics.PointF r3 = r0.a(r3)
            return r3
        Ld:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
            r3.<init>(r0)
            java.lang.Class<xz> r0 = defpackage.xz.class
            java.lang.String r0 = r0.getCanonicalName()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.w(r0, r3)
            r3 = 0
            return r3
    }

    public final void g(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            int r1 = r8.a
            r2 = -1
            if (r1 == r2) goto L9
            if (r0 != 0) goto Lc
        L9:
            r8.i()
        Lc:
            boolean r1 = r8.d
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L3d
            android.view.View r1 = r8.f
            if (r1 != 0) goto L3d
            nz r1 = r8.c
            if (r1 == 0) goto L3d
            int r1 = r8.a
            android.graphics.PointF r1 = r8.f(r1)
            if (r1 == 0) goto L3d
            float r5 = r1.x
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L2e
            float r6 = r1.y
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L3d
        L2e:
            float r5 = java.lang.Math.signum(r5)
            int r5 = (int) r5
            float r1 = r1.y
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r0.X(r5, r1, r3)
        L3d:
            r1 = 0
            r8.d = r1
            android.view.View r5 = r8.f
            wz r6 = r8.g
            if (r5 == 0) goto L70
            androidx.recyclerview.widget.RecyclerView r7 = r8.b
            r7.getClass()
            b00 r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r5 == 0) goto L55
            int r2 = r5.b()
        L55:
            int r5 = r8.a
            if (r2 != r5) goto L67
            android.view.View r2 = r8.f
            yz r3 = r0.c0
            r8.h(r2, r6)
            r6.a(r0)
            r8.i()
            goto L70
        L67:
            java.lang.String r2 = "RecyclerView"
            java.lang.String r5 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r2, r5)
            r8.f = r3
        L70:
            boolean r2 = r8.e
            if (r2 == 0) goto L114
            yz r2 = r0.c0
            androidx.recyclerview.widget.RecyclerView r2 = r8.b
            nz r2 = r2.l
            int r2 = r2.v()
            r3 = 1
            if (r2 != 0) goto L86
            r8.i()
            goto Lff
        L86:
            int r2 = r8.o
            int r9 = r2 - r9
            int r2 = r2 * r9
            if (r2 > 0) goto L8e
            r9 = r1
        L8e:
            r8.o = r9
            int r2 = r8.p
            int r10 = r2 - r10
            int r2 = r2 * r10
            if (r2 > 0) goto L98
            r10 = r1
        L98:
            r8.p = r10
            if (r9 != 0) goto Lff
            if (r10 != 0) goto Lff
            int r9 = r8.a
            android.graphics.PointF r9 = r8.f(r9)
            if (r9 == 0) goto Lf8
            float r10 = r9.x
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            float r2 = r9.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            goto Lf8
        Lb3:
            float r10 = r10 * r10
            float r2 = r9.y
            float r2 = r2 * r2
            float r2 = r2 + r10
            double r4 = (double) r2
            double r4 = java.lang.Math.sqrt(r4)
            float r10 = (float) r4
            float r2 = r9.x
            float r2 = r2 / r10
            r9.x = r2
            float r4 = r9.y
            float r4 = r4 / r10
            r9.y = r4
            r8.k = r9
            r9 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r9
            int r10 = (int) r2
            r8.o = r10
            float r4 = r4 * r9
            int r9 = (int) r4
            r8.p = r9
            r9 = 10000(0x2710, float:1.4013E-41)
            int r9 = r8.e(r9)
            int r10 = r8.o
            float r10 = (float) r10
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r10 = r10 * r2
            int r10 = (int) r10
            int r4 = r8.p
            float r4 = (float) r4
            float r4 = r4 * r2
            int r4 = (int) r4
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = (int) r9
            r6.a = r10
            r6.b = r4
            r6.c = r9
            android.view.animation.LinearInterpolator r9 = r8.i
            r6.e = r9
            r6.f = r3
            goto Lff
        Lf8:
            int r9 = r8.a
            r6.d = r9
            r8.i()
        Lff:
            int r9 = r6.d
            if (r9 < 0) goto L104
            r1 = r3
        L104:
            r6.a(r0)
            if (r1 == 0) goto L114
            boolean r9 = r8.e
            if (r9 == 0) goto L114
            r8.d = r3
            a00 r9 = r0.W
            r9.a()
        L114:
            return
    }

    public void h(android.view.View r7, defpackage.wz r8) {
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.a = r0
            r8.b = r7
            r8.c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.j
            r8.e = r7
            r8.f = r3
        L59:
            return
    }

    public final void i() {
            r4 = this;
            boolean r0 = r4.e
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.e = r0
            r4.p = r0
            r4.o = r0
            r1 = 0
            r4.k = r1
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            yz r2 = r2.c0
            r3 = -1
            r2.a = r3
            r4.f = r1
            r4.a = r3
            r4.d = r0
            nz r0 = r4.c
            yq r2 = r0.e
            if (r2 != r4) goto L24
            r0.e = r1
        L24:
            r4.c = r1
            r4.b = r1
            return
    }
}
