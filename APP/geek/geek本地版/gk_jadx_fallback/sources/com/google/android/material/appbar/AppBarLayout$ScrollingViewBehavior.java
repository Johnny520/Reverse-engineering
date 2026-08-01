package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends defpackage.ta0 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return
    }

    public AppBarLayout$ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            int[] r0 = defpackage.wy.u
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r3 = 0
            int r3 = r2.getDimensionPixelSize(r3, r3)
            r1.b = r3
            r2.recycle()
            return
    }

    public static void s(java.util.ArrayList r3) {
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10
            java.lang.Object r2 = r3.get(r1)
            android.view.View r2 = (android.view.View) r2
            int r1 = r1 + 1
            goto L5
        L10:
            return
    }

    @Override // defpackage.wd
    public final void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // defpackage.wd
    public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            zd r4 = (defpackage.zd) r4
            wd r4 = r4.a
            boolean r4 = r4 instanceof com.google.android.material.appbar.AppBarLayout$BaseBehavior
            r0 = 0
            if (r4 == 0) goto L2a
            int r4 = r6.getBottom()
            int r6 = r5.getTop()
            int r4 = r4 - r6
            int r6 = r3.b
            if (r6 != 0) goto L1c
            r6 = r0
            goto L24
        L1c:
            r1 = 0
            float r2 = (float) r6
            float r1 = r1 * r2
            int r1 = (int) r1
            int r6 = defpackage.ct.d(r1, r0, r6)
        L24:
            int r4 = r4 - r6
            java.util.WeakHashMap r6 = defpackage.ja0.a
            r5.offsetTopAndBottom(r4)
        L2a:
            return r0
    }

    @Override // defpackage.wd
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            int r3 = r3.height
            r4 = -1
            if (r3 == r4) goto Lc
            r4 = -2
            if (r3 != r4) goto L13
        Lc:
            java.util.ArrayList r1 = r1.j(r2)
            s(r1)
        L13:
            r1 = 0
            return r1
    }

    @Override // defpackage.wd
    public final void l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
            r0 = this;
            java.util.ArrayList r1 = r1.j(r2)
            s(r1)
            return
    }

    @Override // defpackage.ta0
    public final void r(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, int r4) {
            r1 = this;
            java.util.ArrayList r0 = r2.j(r3)
            s(r0)
            r2.q(r3, r4)
            return
    }
}
