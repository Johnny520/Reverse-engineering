package com.google.android.material.behavior;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<V> {
    public static final int i = 0;
    public static final int j = 0;
    public static final int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a> f1043a;
    public int b;
    public int c;
    public android.animation.TimeInterpolator d;
    public android.animation.TimeInterpolator e;
    public int f;
    public int g;
    public android.view.ViewPropertyAnimator h;

    public interface a {
        void a();
    }

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong2
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.i = r0
            int r0 = com.google.android.material.R.attr.motionDurationMedium4
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.j = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior.k = r0
            return
    }

    public HideBottomViewOnScrollBehavior() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.f1043a = r0
            r0 = 0
            r1.f = r0
            r0 = 2
            r1.g = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f1043a = r1
            r1 = 0
            r0.f = r1
            r1 = 2
            r0.g = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r4 = r3.getMeasuredHeight()
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            r1.f = r4
            android.content.Context r2 = r3.getContext()
            int r4 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.i
            r0 = 225(0xe1, float:3.15E-43)
            int r2 = a.C0445wb.c(r2, r4, r0)
            r1.b = r2
            android.content.Context r2 = r3.getContext()
            int r4 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.j
            r0 = 175(0xaf, float:2.45E-43)
            int r2 = a.C0445wb.c(r2, r4, r0)
            r1.c = r2
            android.content.Context r2 = r3.getContext()
            a.l6 r4 = a.C0434w0.d
            int r0 = com.google.android.material.behavior.HideBottomViewOnScrollBehavior.k
            android.animation.TimeInterpolator r2 = a.C0445wb.d(r2, r0, r4)
            r1.d = r2
            android.content.Context r2 = r3.getContext()
            a.l6 r3 = a.C0434w0.c
            android.animation.TimeInterpolator r2 = a.C0445wb.d(r2, r0, r3)
            r1.e = r2
            r2 = 0
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            java.util.LinkedHashSet<com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a> r1 = r0.f1043a
            if (r3 <= 0) goto L50
            int r3 = r0.g
            r4 = 1
            if (r3 != r4) goto Lb
            goto L9b
        Lb:
            android.view.ViewPropertyAnimator r3 = r0.h
            if (r3 == 0) goto L15
            r3.cancel()
            r2.clearAnimation()
        L15:
            r0.g = r4
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.next()
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a r3 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a) r3
            r3.a()
            goto L1b
        L2b:
            int r1 = r0.f
            int r3 = r0.c
            long r3 = (long) r3
            android.animation.TimeInterpolator r5 = r0.e
            android.view.ViewPropertyAnimator r2 = r2.animate()
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r1 = r2.translationY(r1)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            a.v0 r2 = new a.v0
            r3 = 2
            r2.<init>(r3, r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.h = r1
            return
        L50:
            if (r3 >= 0) goto L9b
            int r3 = r0.g
            r4 = 2
            if (r3 != r4) goto L58
            goto L9b
        L58:
            android.view.ViewPropertyAnimator r3 = r0.h
            if (r3 == 0) goto L62
            r3.cancel()
            r2.clearAnimation()
        L62:
            r0.g = r4
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L78
            java.lang.Object r3 = r1.next()
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a r3 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior.a) r3
            r3.a()
            goto L68
        L78:
            int r1 = r0.b
            long r3 = (long) r1
            android.animation.TimeInterpolator r1 = r0.d
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r5 = 0
            float r5 = (float) r5
            android.view.ViewPropertyAnimator r2 = r2.translationY(r5)
            android.view.ViewPropertyAnimator r1 = r2.setInterpolator(r1)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            a.v0 r2 = new a.v0
            r3 = 2
            r2.<init>(r3, r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.h = r1
        L9b:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 2
            if (r5 != r1) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }
}
