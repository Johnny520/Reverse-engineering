package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: hh */
/* JADX INFO: loaded from: classes.dex */
public final class C1502hh extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f5289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1545ih f5290b;

    public C1502hh(C1545ih r1) {
        this.f5290b = r1;
        this.f5289a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f5289a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        if (this.f5289a == false) goto L6;
        this.f5289a = false;
        return;
    L6:
        C1545ih r42 = this.f5290b;
        if (((Float) r42.f5495z.getAnimatedValue()).floatValue() != 0.0f) goto L10;
        r42.f5468A = 0;
        r42.m2967g(0);
        return;
    L10:
        r42.f5468A = 2;
        r42.f5488s.invalidate();
    }
}
