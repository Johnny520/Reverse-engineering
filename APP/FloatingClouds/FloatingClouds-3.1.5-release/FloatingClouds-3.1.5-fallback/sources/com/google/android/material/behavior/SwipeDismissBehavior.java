package com.google.android.material.behavior;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0504zg f1044a;
    public boolean b;
    public boolean c;
    public int d;
    public final float e;
    public float f;
    public float g;
    public final com.google.android.material.behavior.SwipeDismissBehavior.a h;

    public class a extends a.C0504zg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1045a;
        public int b;
        public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior c;

        public a(com.google.android.material.behavior.SwipeDismissBehavior r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r1 = -1
                r0.b = r1
                return
        }

        @Override // a.C0504zg.c
        public final int a(android.view.View r4, int r5) {
                r3 = this;
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r0 = r4.getLayoutDirection()
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = r1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.c
                int r2 = r2.d
                if (r2 != 0) goto L26
                if (r0 == 0) goto L1e
                int r0 = r3.f1045a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f1045a
                goto L49
            L1e:
                int r0 = r3.f1045a
                int r4 = r4.getWidth()
            L24:
                int r4 = r4 + r0
                goto L49
            L26:
                if (r2 != r1) goto L3b
                if (r0 == 0) goto L31
                int r0 = r3.f1045a
                int r4 = r4.getWidth()
                goto L24
            L31:
                int r0 = r3.f1045a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f1045a
                goto L49
            L3b:
                int r0 = r3.f1045a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f1045a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L49:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
        }

        @Override // a.C0504zg.c
        public final int b(android.view.View r1, int r2) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // a.C0504zg.c
        public final int c(android.view.View r1) {
                r0 = this;
                int r1 = r1.getWidth()
                return r1
        }

        @Override // a.C0504zg.c
        public final void e(android.view.View r2, int r3) {
                r1 = this;
                r1.b = r3
                int r3 = r2.getLeft()
                r1.f1045a = r3
                android.view.ViewParent r2 = r2.getParent()
                if (r2 == 0) goto L19
                com.google.android.material.behavior.SwipeDismissBehavior r3 = r1.c
                r0 = 1
                r3.c = r0
                r2.requestDisallowInterceptTouchEvent(r0)
                r2 = 0
                r3.c = r2
            L19:
                return
        }

        @Override // a.C0504zg.c
        public final void f(int r1) {
                r0 = this;
                return
        }

        @Override // a.C0504zg.c
        public final void g(android.view.View r5, int r6, int r7) {
                r4 = this;
                int r7 = r5.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r4.c
                float r1 = r0.f
                float r7 = r7 * r1
                int r1 = r5.getWidth()
                float r1 = (float) r1
                float r0 = r0.g
                float r1 = r1 * r0
                int r0 = r4.f1045a
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                float r6 = (float) r6
                int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r0 > 0) goto L24
                r5.setAlpha(r2)
                return
            L24:
                int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r3 = 0
                if (r0 < 0) goto L2d
                r5.setAlpha(r3)
                return
            L2d:
                float r6 = r6 - r7
                float r1 = r1 - r7
                float r6 = r6 / r1
                float r6 = r2 - r6
                float r6 = java.lang.Math.max(r3, r6)
                float r6 = java.lang.Math.min(r6, r2)
                r5.setAlpha(r6)
                return
        }

        @Override // a.C0504zg.c
        public final void h(android.view.View r9, float r10, float r11) {
                r8 = this;
                r11 = -1
                r8.b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.c
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
                int r5 = r9.getLayoutDirection()
                if (r5 != r3) goto L1a
                r5 = r3
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r2.d
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L2a:
                if (r1 <= 0) goto L66
                goto L52
            L2d:
                if (r6 != r3) goto L66
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L66
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L66
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f1045a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r2.e
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L66
            L52:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L61
                int r10 = r9.getLeft()
                int r0 = r8.f1045a
                if (r10 >= r0) goto L5f
                goto L61
            L5f:
                int r0 = r0 + r11
                goto L69
            L61:
                int r10 = r8.f1045a
                int r0 = r10 - r11
                goto L69
            L66:
                int r0 = r8.f1045a
                r3 = r4
            L69:
                a.zg r10 = r2.f1044a
                int r11 = r9.getTop()
                boolean r10 = r10.o(r0, r11)
                if (r10 == 0) goto L7f
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r10.<init>(r2, r9, r3)
                java.util.WeakHashMap<android.view.View, a.Jg> r11 = a.C0414ug.f721a
                r9.postOnAnimation(r10)
            L7f:
                return
        }

        @Override // a.C0504zg.c
        public final boolean i(android.view.View r3, int r4) {
                r2 = this;
                int r0 = r2.b
                r1 = -1
                if (r0 == r1) goto L7
                if (r0 != r4) goto L11
            L7:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = r2.c
                boolean r3 = r4.s(r3)
                if (r3 == 0) goto L11
                r3 = 1
                return r3
            L11:
                r3 = 0
                return r3
        }
    }

    public class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f1046a;
        public final boolean b;
        public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior c;

        public b(com.google.android.material.behavior.SwipeDismissBehavior r1, android.view.View r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.f1046a = r2
                r0.b = r3
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.c
                a.zg r0 = r0.f1044a
                android.view.View r1 = r2.f1046a
                if (r0 == 0) goto L13
                boolean r0 = r0.f()
                if (r0 == 0) goto L13
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                r1.postOnAnimation(r2)
            L13:
                return
        }
    }

    public SwipeDismissBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.d = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.e = r0
            r1 = 0
            r2.f = r1
            r2.g = r0
            com.google.android.material.behavior.SwipeDismissBehavior$a r0 = new com.google.android.material.behavior.SwipeDismissBehavior$a
            r0.<init>(r2)
            r2.h = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
            r4 = this;
            boolean r0 = r4.b
            int r1 = r7.getActionMasked()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            if (r1 == r2) goto L10
            r6 = 3
            if (r1 == r6) goto L10
            goto L23
        L10:
            r4.b = r3
            goto L23
        L13:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r0 = r5.l(r6, r0, r1)
            r4.b = r0
        L23:
            if (r0 == 0) goto L43
            a.zg r6 = r4.f1044a
            if (r6 != 0) goto L36
            a.zg r6 = new a.zg
            android.content.Context r0 = r5.getContext()
            com.google.android.material.behavior.SwipeDismissBehavior$a r1 = r4.h
            r6.<init>(r0, r5, r1)
            r4.f1044a = r6
        L36:
            boolean r5 = r4.c
            if (r5 != 0) goto L43
            a.zg r5 = r4.f1044a
            boolean r5 = r5.p(r7)
            if (r5 == 0) goto L43
            return r2
        L43:
            return r3
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4) {
            r1 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            int r2 = r3.getImportantForAccessibility()
            r4 = 0
            if (r2 != 0) goto L25
            r2 = 1
            r3.setImportantForAccessibility(r2)
            r2 = 1048576(0x100000, float:1.469368E-39)
            a.C0414ug.g(r3, r2)
            a.C0414ug.e(r3, r4)
            boolean r2 = r1.s(r3)
            if (r2 == 0) goto L25
            a.I$a r2 = a.I.a.j
            a.Le r0 = new a.Le
            r0.<init>(r1)
            a.C0414ug.h(r3, r2, r0)
        L25:
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
            r0 = this;
            a.zg r1 = r0.f1044a
            if (r1 == 0) goto L16
            boolean r1 = r0.c
            if (r1 == 0) goto Lf
            int r1 = r3.getActionMasked()
            r2 = 3
            if (r1 == r2) goto L14
        Lf:
            a.zg r1 = r0.f1044a
            r1.j(r3)
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public boolean s(android.view.View r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
