package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: hh */
/* JADX INFO: loaded from: classes.dex */
public final class C1502hh extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f5289a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1545ih f5290b;

    public C1502hh(C1545ih c1545ih) {
        this.f5290b = c1545ih;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5289a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f5289a) {
            this.f5289a = false;
            return;
        }
        C1545ih c1545ih = this.f5290b;
        if (((Float) c1545ih.f5495z.getAnimatedValue()).floatValue() == 0.0f) {
            c1545ih.f5468A = 0;
            c1545ih.m2967g(0);
        } else {
            c1545ih.f5468A = 2;
            c1545ih.f5488s.invalidate();
        }
    }
}
