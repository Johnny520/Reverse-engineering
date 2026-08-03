package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: XE */
/* JADX INFO: loaded from: classes.dex */
public final class C1003XE extends AnimatorListenerAdapter implements InterfaceC0313HB {

    /* JADX INFO: renamed from: a */
    public final View f3201a;

    /* JADX INFO: renamed from: b */
    public final int f3202b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f3203c;

    /* JADX INFO: renamed from: e */
    public boolean f3205e;

    /* JADX INFO: renamed from: f */
    public boolean f3206f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f3204d = true;

    public C1003XE(View view, int i) {
        this.f3201a = view;
        this.f3202b = i;
        this.f3203c = (ViewGroup) view.getParent();
        m1901g(true);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB abstractC0356IB) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
        m1901g(false);
        if (this.f3206f) {
            return;
        }
        AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
        m1901g(true);
        if (this.f3206f) {
            return;
        }
        AbstractC0574NE.m1117b(this.f3201a, 0);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB abstractC0356IB) {
        abstractC0356IB.mo786x(this);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB abstractC0356IB) {
    }

    /* JADX INFO: renamed from: g */
    public final void m1901g(boolean z) {
        ViewGroup viewGroup;
        if (!this.f3204d || this.f3205e == z || (viewGroup = this.f3203c) == null) {
            return;
        }
        this.f3205e = z;
        AbstractC0828TB.m1630H(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3206f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3206f) {
            AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
            ViewGroup viewGroup = this.f3203c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1901g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            AbstractC0574NE.m1117b(this.f3201a, 0);
            ViewGroup viewGroup = this.f3203c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f3206f) {
            AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
            ViewGroup viewGroup = this.f3203c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1901g(false);
    }
}
