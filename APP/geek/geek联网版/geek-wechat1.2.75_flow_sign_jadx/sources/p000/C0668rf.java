package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: rf */
/* JADX INFO: loaded from: classes.dex */
public final class C0668rf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i00 f4123a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4124b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f4125c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4126d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f4127e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0816vf f4128f;

    public C0668rf(C0816vf c0816vf, i00 i00Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4128f = c0816vf;
        this.f4123a = i00Var;
        this.f4124b = i;
        this.f4125c = view;
        this.f4126d = i2;
        this.f4127e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4124b;
        View view = this.f4125c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4126d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4127e.setListener(null);
        C0816vf c0816vf = this.f4128f;
        i00 i00Var = this.f4123a;
        c0816vf.m2191c(i00Var);
        c0816vf.f4951p.remove(i00Var);
        c0816vf.m2566i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4128f.getClass();
    }
}
