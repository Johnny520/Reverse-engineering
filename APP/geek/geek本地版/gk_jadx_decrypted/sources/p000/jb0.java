package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends AnimatorListenerAdapter implements q70 {

    /* JADX INFO: renamed from: a */
    public final View f2607a;

    /* JADX INFO: renamed from: b */
    public final int f2608b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f2609c;

    /* JADX INFO: renamed from: e */
    public boolean f2611e;

    /* JADX INFO: renamed from: f */
    public boolean f2612f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f2610d = true;

    public jb0(View view, int i) {
        this.f2607a = view;
        this.f2608b = i;
        this.f2609c = (ViewGroup) view.getParent();
        m1583f(true);
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: c */
    public final void mo1429c() {
        m1583f(false);
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: d */
    public final void mo1430d() {
        m1583f(true);
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: e */
    public final void mo1431e(r70 r70Var) {
        if (!this.f2612f) {
            bb0.f804a.mo933O(this.f2607a, this.f2608b);
            ViewGroup viewGroup = this.f2609c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1583f(false);
        r70Var.m2273u(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m1583f(boolean z) {
        ViewGroup viewGroup;
        if (!this.f2610d || this.f2611e == z || (viewGroup = this.f2609c) == null) {
            return;
        }
        this.f2611e = z;
        AbstractC0979zt.m2821Q(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2612f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f2612f) {
            bb0.f804a.mo933O(this.f2607a, this.f2608b);
            ViewGroup viewGroup = this.f2609c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1583f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f2612f) {
            return;
        }
        bb0.f804a.mo933O(this.f2607a, this.f2608b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f2612f) {
            return;
        }
        bb0.f804a.mo933O(this.f2607a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: a */
    public final void mo1581a() {
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: b */
    public final void mo1582b() {
    }
}
