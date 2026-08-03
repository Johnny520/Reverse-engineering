package com.abc.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: d0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0756q extends AnimatorListenerAdapter {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        AbstractC0307g.m703e(r2, "animation");
        AbstractC0358S.f739s = false;
    }
}
