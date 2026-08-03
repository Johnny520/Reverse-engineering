package p043Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: Y.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0439E extends AnimatorListenerAdapter implements InterfaceC0452k {

    /* JADX INFO: renamed from: a */
    public final View f952a;

    /* JADX INFO: renamed from: b */
    public final int f953b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f954c;

    /* JADX INFO: renamed from: d */
    public final boolean f955d;

    /* JADX INFO: renamed from: e */
    public boolean f956e;

    /* JADX INFO: renamed from: f */
    public boolean f957f;

    public C0439E(View r2, int r3) {
        this.f957f = false;
        this.f952a = r2;
        this.f953b = r3;
        this.f954c = (ViewGroup) r2.getParent();
        this.f955d = true;
        m1045g(true);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
        m1045g(false);
        if (this.f957f == true) goto L6;
        AbstractC0465x.m1096b(this.f952a, this.f953b);
        return;
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m r1) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m r1) {
        r1.mo1062x(this);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
        m1045g(true);
        if (this.f957f == true) goto L6;
        AbstractC0465x.m1096b(this.f952a, 0);
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m1045g(boolean r2) {
        if (this.f955d == true) goto L5;
        return;
    L5:
        if (this.f956e == r2) goto L11;
        ViewGroup r02 = this.f954c;
        if (r02 == null) goto L12;
        this.f956e = r2;
        AbstractC0358S.m911t0(r02, r2);
        return;
    L12:
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f957f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r2) {
        if (this.f957f == true) goto L7;
        AbstractC0465x.m1096b(this.f952a, this.f953b);
        ViewGroup r22 = this.f954c;
        if (r22 == null) goto L7;
        r22.invalidate();
    L7:
        m1045g(false);
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
        AbstractC0465x.m1096b(this.f952a, 0);
        ViewGroup r12 = this.f954c;
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
        if (this.f957f == true) goto L8;
        AbstractC0465x.m1096b(this.f952a, this.f953b);
        ViewGroup r12 = this.f954c;
        if (r12 == null) goto L8;
        r12.invalidate();
    L8:
        m1045g(false);
    }
}
