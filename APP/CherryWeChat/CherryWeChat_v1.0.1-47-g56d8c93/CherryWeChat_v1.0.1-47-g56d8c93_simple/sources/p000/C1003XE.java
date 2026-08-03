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

    /* JADX INFO: renamed from: d */
    public final boolean f3204d;

    /* JADX INFO: renamed from: e */
    public boolean f3205e;

    /* JADX INFO: renamed from: f */
    public boolean f3206f;

    public C1003XE(View r2, int r3) {
        this.f3206f = false;
        this.f3201a = r2;
        this.f3202b = r3;
        this.f3203c = (ViewGroup) r2.getParent();
        this.f3204d = true;
        m1901g(true);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: a */
    public final void mo662a(AbstractC0356IB r1) {
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: b */
    public final void mo663b() {
        m1901g(false);
        if (this.f3206f == true) goto L6;
        AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
        return;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: c */
    public final void mo664c() {
        m1901g(true);
        if (this.f3206f == true) goto L6;
        AbstractC0574NE.m1117b(this.f3201a, 0);
        return;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB r1) {
        r1.mo786x(this);
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: f */
    public final void mo667f(AbstractC0356IB r1) {
    }

    /* JADX INFO: renamed from: g */
    public final void m1901g(boolean r2) {
        if (this.f3204d == true) goto L5;
        return;
    L5:
        if (this.f3205e == r2) goto L11;
        ViewGroup r0 = this.f3203c;
        if (r0 == null) goto L12;
        this.f3205e = r2;
        AbstractC0828TB.m1630H(r0, r2);
        return;
    L12:
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f3206f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        if (this.f3206f == true) goto L7;
        AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
        ViewGroup r22 = this.f3203c;
        if (r22 == null) goto L7;
        r22.invalidate();
    L7:
        m1901g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1, boolean r2) {
        if (r2 == false) goto L7;
        AbstractC0574NE.m1117b(this.f3201a, 0);
        ViewGroup r12 = this.f3203c;
        if (r12 == null) goto L8;
        r12.invalidate();
        return;
    L8:
        return;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r1, boolean r2) {
        if (r2 == false) goto L4;
        return;
    L4:
        if (this.f3206f == true) goto L8;
        AbstractC0574NE.m1117b(this.f3201a, this.f3202b);
        ViewGroup r12 = this.f3203c;
        if (r12 == null) goto L8;
        r12.invalidate();
    L8:
        m1901g(false);
    }
}
