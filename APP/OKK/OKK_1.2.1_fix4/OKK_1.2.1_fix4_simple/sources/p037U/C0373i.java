package p037U;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: U.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0373i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0374j f797b;

    public C0373i(C0374j r1) {
        this.f797b = r1;
        this.f796a = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f796a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        if (this.f796a == false) goto L6;
        this.f796a = false;
        return;
    L6:
        C0374j r42 = this.f797b;
        if (((Float) r42.f820u.getAnimatedValue()).floatValue() != 0.0f) goto L9;
        r42.f821v = 0;
        r42.m955f(0);
        return;
    L9:
        r42.f821v = 2;
        r42.f813n.invalidate();
    }
}
