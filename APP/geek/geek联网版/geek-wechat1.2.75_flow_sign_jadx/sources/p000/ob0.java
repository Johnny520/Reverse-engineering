package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ob0 extends AnimatorListenerAdapter implements w70 {

    /* JADX INFO: renamed from: a */
    public final View f3432a;

    /* JADX INFO: renamed from: b */
    public final int f3433b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3434c;

    /* JADX INFO: renamed from: e */
    public boolean f3436e;

    /* JADX INFO: renamed from: f */
    public boolean f3437f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f3435d = true;

    public ob0(View view, int i) {
        this.f3432a = view;
        this.f3433b = i;
        this.f3434c = (ViewGroup) view.getParent();
        m2015f(true);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: c */
    public final void mo1668c() {
        m2015f(false);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: d */
    public final void mo1669d() {
        m2015f(true);
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: e */
    public final void mo1670e(x70 x70Var) {
        if (!this.f3437f) {
            gb0.f1949a.mo1325J(this.f3432a, this.f3433b);
            ViewGroup viewGroup = this.f3434c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2015f(false);
        x70Var.m2651u(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m2015f(boolean z) {
        ViewGroup viewGroup;
        if (!this.f3435d || this.f3436e == z || (viewGroup = this.f3434c) == null) {
            return;
        }
        this.f3436e = z;
        AbstractC0274gu.m1306L(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3437f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3437f) {
            gb0.f1949a.mo1325J(this.f3432a, this.f3433b);
            ViewGroup viewGroup = this.f3434c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2015f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f3437f) {
            return;
        }
        gb0.f1949a.mo1325J(this.f3432a, this.f3433b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f3437f) {
            return;
        }
        gb0.f1949a.mo1325J(this.f3432a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: a */
    public final void mo1667a() {
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: b */
    public final void mo2014b() {
    }
}
