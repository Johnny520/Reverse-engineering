package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: pf */
/* JADX INFO: loaded from: classes.dex */
public final class C0595pf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3885a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b00 f3886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3887c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3888d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0780uf f3889e;

    public C0595pf(C0780uf c0780uf, b00 b00Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3889e = c0780uf;
        this.f3886b = b00Var;
        this.f3888d = viewPropertyAnimator;
        this.f3887c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3885a) {
            case Base64.NO_PADDING /* 1 */:
                this.f3887c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3885a) {
            case Base64.DEFAULT /* 0 */:
                this.f3888d.setListener(null);
                this.f3887c.setAlpha(1.0f);
                C0780uf c0780uf = this.f3889e;
                b00 b00Var = this.f3886b;
                c0780uf.m1612c(b00Var);
                c0780uf.f4727q.remove(b00Var);
                c0780uf.m2450i();
                break;
            default:
                this.f3888d.setListener(null);
                C0780uf c0780uf2 = this.f3889e;
                b00 b00Var2 = this.f3886b;
                c0780uf2.m1612c(b00Var2);
                c0780uf2.f4725o.remove(b00Var2);
                c0780uf2.m2450i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3885a) {
            case Base64.DEFAULT /* 0 */:
                this.f3889e.getClass();
                break;
            default:
                this.f3889e.getClass();
                break;
        }
    }

    public C0595pf(C0780uf c0780uf, b00 b00Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3889e = c0780uf;
        this.f3886b = b00Var;
        this.f3887c = view;
        this.f3888d = viewPropertyAnimator;
    }
}
