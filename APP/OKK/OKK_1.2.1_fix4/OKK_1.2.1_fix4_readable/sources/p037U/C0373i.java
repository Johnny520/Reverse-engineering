package p037U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: U.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0373i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f796a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0374j f797b;

    public C0373i(C0374j c0374j) {
        this.f797b = c0374j;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f796a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f796a) {
            this.f796a = false;
            return;
        }
        C0374j c0374j = this.f797b;
        if (((Float) c0374j.f820u.getAnimatedValue()).floatValue() == 0.0f) {
            c0374j.f821v = 0;
            c0374j.m955f(0);
        } else {
            c0374j.f821v = 2;
            c0374j.f813n.invalidate();
        }
    }
}
