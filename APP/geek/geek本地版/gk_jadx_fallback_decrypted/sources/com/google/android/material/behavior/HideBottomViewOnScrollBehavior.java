package com.google.android.material.behavior;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends android.view.View> extends defpackage.wd {
    public final java.util.LinkedHashSet a;
    public int b;
    public int c;
    public android.animation.TimeInterpolator d;
    public android.animation.TimeInterpolator e;
    public int f;
    public int g;
    public android.view.ViewPropertyAnimator h;

    public HideBottomViewOnScrollBehavior() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.f = r0
            r0 = 2
            r1.g = r0
            return
    }

    public HideBottomViewOnScrollBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.f = r1
            r1 = 2
            r0.g = r1
            return
    }

    @Override // defpackage.wd
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r4 = r3.getMeasuredHeight()
            int r2 = r2.bottomMargin
            int r4 = r4 + r2
            r1.f = r4
            android.content.Context r2 = r3.getContext()
            r4 = 2130969335(0x7f0402f7, float:1.7547349E38)
            r0 = 225(0xe1, float:3.15E-43)
            int r2 = defpackage.ct.v(r2, r4, r0)
            r1.b = r2
            android.content.Context r2 = r3.getContext()
            r4 = 2130969341(0x7f0402fd, float:1.7547361E38)
            r0 = 175(0xaf, float:2.45E-43)
            int r2 = defpackage.ct.v(r2, r4, r0)
            r1.c = r2
            android.content.Context r2 = r3.getContext()
            tj r4 = defpackage.q2.d
            r0 = 2130969351(0x7f040307, float:1.7547381E38)
            android.animation.TimeInterpolator r2 = defpackage.ct.w(r2, r0, r4)
            r1.d = r2
            android.content.Context r2 = r3.getContext()
            tj r3 = defpackage.q2.c
            android.animation.TimeInterpolator r2 = defpackage.ct.w(r2, r0, r3)
            r1.e = r2
            r2 = 0
            return r2
    }

    @Override // defpackage.wd
    public final void k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            java.util.LinkedHashSet r1 = r0.a
            if (r3 <= 0) goto L4b
            int r3 = r0.g
            r4 = 1
            if (r3 != r4) goto Lb
            goto L92
        Lb:
            android.view.ViewPropertyAnimator r3 = r0.h
            if (r3 == 0) goto L15
            r3.cancel()
            r2.clearAnimation()
        L15:
            r0.g = r4
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L46
            int r1 = r0.f
            int r3 = r0.c
            long r3 = (long) r3
            android.animation.TimeInterpolator r5 = r0.e
            android.view.ViewPropertyAnimator r2 = r2.animate()
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r1 = r2.translationY(r1)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r5)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            y0 r2 = new y0
            r3 = 3
            r2.<init>(r3, r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.h = r1
            return
        L46:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L4b:
            if (r3 >= 0) goto L92
            int r3 = r0.g
            r4 = 2
            if (r3 != r4) goto L53
            goto L92
        L53:
            android.view.ViewPropertyAnimator r3 = r0.h
            if (r3 == 0) goto L5d
            r3.cancel()
            r2.clearAnimation()
        L5d:
            r0.g = r4
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L8d
            int r1 = r0.b
            long r3 = (long) r1
            android.animation.TimeInterpolator r1 = r0.d
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r5 = 0
            float r5 = (float) r5
            android.view.ViewPropertyAnimator r2 = r2.translationY(r5)
            android.view.ViewPropertyAnimator r1 = r2.setInterpolator(r1)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            y0 r2 = new y0
            r3 = 3
            r2.<init>(r3, r0)
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.h = r1
            return
        L8d:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L92:
            return
    }

    @Override // defpackage.wd
    public boolean o(android.view.View r1, int r2, int r3) {
            r0 = this;
            r1 = 2
            if (r2 != r1) goto L5
            r1 = 1
            return r1
        L5:
            r1 = 0
            return r1
    }
}
