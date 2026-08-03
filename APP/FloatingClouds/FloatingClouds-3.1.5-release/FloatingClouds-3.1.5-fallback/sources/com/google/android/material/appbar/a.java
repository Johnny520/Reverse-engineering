package com.google.android.material.appbar;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f1042a;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout b;
    public final /* synthetic */ com.google.android.material.appbar.AppBarLayout.BaseBehavior c;

    public a(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout.BaseBehavior r2, com.google.android.material.appbar.AppBarLayout r3) {
            r0 = this;
            r0.<init>()
            r0.c = r2
            r0.f1042a = r1
            r0.b = r3
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r3.f1042a
            com.google.android.material.appbar.AppBarLayout r1 = r3.b
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r2 = r3.c
            r2.A(r0, r1, r4)
            return
    }
}
