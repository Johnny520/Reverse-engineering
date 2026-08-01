package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: qf */
/* JADX INFO: loaded from: classes.dex */
public final class C0631qf extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3901a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i00 f3902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f3903c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3904d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0816vf f3905e;

    public C0631qf(C0816vf c0816vf, i00 i00Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3905e = c0816vf;
        this.f3902b = i00Var;
        this.f3904d = viewPropertyAnimator;
        this.f3903c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3901a) {
            case Base64.NO_PADDING /* 1 */:
                this.f3903c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3901a) {
            case Base64.DEFAULT /* 0 */:
                this.f3904d.setListener(null);
                this.f3903c.setAlpha(1.0f);
                C0816vf c0816vf = this.f3905e;
                i00 i00Var = this.f3902b;
                c0816vf.m2191c(i00Var);
                c0816vf.f4952q.remove(i00Var);
                c0816vf.m2566i();
                break;
            default:
                this.f3904d.setListener(null);
                C0816vf c0816vf2 = this.f3905e;
                i00 i00Var2 = this.f3902b;
                c0816vf2.m2191c(i00Var2);
                c0816vf2.f4950o.remove(i00Var2);
                c0816vf2.m2566i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3901a) {
            case Base64.DEFAULT /* 0 */:
                this.f3905e.getClass();
                break;
            default:
                this.f3905e.getClass();
                break;
        }
    }

    public C0631qf(C0816vf c0816vf, i00 i00Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3905e = c0816vf;
        this.f3902b = i00Var;
        this.f3903c = view;
        this.f3904d = viewPropertyAnimator;
    }
}
