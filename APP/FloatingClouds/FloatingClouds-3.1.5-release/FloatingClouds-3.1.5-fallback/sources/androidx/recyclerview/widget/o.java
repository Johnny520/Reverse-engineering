package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class o extends androidx.recyclerview.widget.RecyclerView.v {
    public final android.view.animation.LinearInterpolator i;
    public final android.view.animation.DecelerateInterpolator j;

    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.graphics.PointF k;
    public final android.util.DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    @android.annotation.SuppressLint({"UnknownNullness"})
    public o(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.i = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.j = r0
            r0 = 0
            r1.m = r0
            r1.o = r0
            r1.p = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r1.l = r2
            return
    }

    public static int e(int r1, int r2, int r3, int r4, int r5) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.v
    @android.annotation.SuppressLint({"UnknownNullness"})
    public void c(android.view.View r7, androidx.recyclerview.widget.RecyclerView.v.a r8) {
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.f(r7, r0)
            android.graphics.PointF r5 = r6.k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.g(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.i(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.j
            r8.f981a = r0
            r8.b = r7
            r8.c = r2
            r8.e = r3
            r8.f = r1
        L59:
            return
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public int f(android.view.View r5, int r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r4.c
            if (r0 == 0) goto L45
            boolean r1 = r0.d()
            if (r1 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            int r2 = r5.getLeft()
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.left
            int r2 = r2 - r3
            int r3 = r1.leftMargin
            int r2 = r2 - r3
            int r3 = r5.getRight()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r5 = (androidx.recyclerview.widget.RecyclerView.m) r5
            android.graphics.Rect r5 = r5.b
            int r5 = r5.right
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r5 = r0.E()
            int r1 = r0.n
            int r0 = r0.F()
            int r1 = r1 - r0
            int r5 = e(r2, r3, r5, r1, r6)
            return r5
        L45:
            r5 = 0
            return r5
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public int g(android.view.View r5, int r6) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r4.c
            if (r0 == 0) goto L45
            boolean r1 = r0.e()
            if (r1 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r1 = (androidx.recyclerview.widget.RecyclerView.m) r1
            int r2 = r5.getTop()
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
            android.graphics.Rect r3 = r3.b
            int r3 = r3.top
            int r2 = r2 - r3
            int r3 = r1.topMargin
            int r2 = r2 - r3
            int r3 = r5.getBottom()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r5 = (androidx.recyclerview.widget.RecyclerView.m) r5
            android.graphics.Rect r5 = r5.b
            int r5 = r5.bottom
            int r3 = r3 + r5
            int r5 = r1.bottomMargin
            int r3 = r3 + r5
            int r5 = r0.G()
            int r1 = r0.o
            int r0 = r0.D()
            int r1 = r1 - r0
            int r5 = e(r2, r3, r5, r1, r6)
            return r5
        L45:
            r5 = 0
            return r5
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public float h(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 / r2
            return r0
    }

    public int i(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            boolean r0 = r2.m
            if (r0 != 0) goto L14
            android.util.DisplayMetrics r0 = r2.l
            float r0 = r2.h(r0)
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
}
