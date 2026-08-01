package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: qf */
/* JADX INFO: loaded from: classes.dex */
public final class C0632qf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b00 f4079a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4080b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f4081c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4082d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f4083e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0780uf f4084f;

    public C0632qf(C0780uf c0780uf, b00 b00Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4084f = c0780uf;
        this.f4079a = b00Var;
        this.f4080b = i;
        this.f4081c = view;
        this.f4082d = i2;
        this.f4083e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4080b;
        View view = this.f4081c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4082d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4083e.setListener(null);
        C0780uf c0780uf = this.f4084f;
        b00 b00Var = this.f4079a;
        c0780uf.m1612c(b00Var);
        c0780uf.f4726p.remove(b00Var);
        c0780uf.m2450i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4084f.getClass();
    }
}
