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

    /* JADX INFO: renamed from: e */
    public boolean f956e;

    /* JADX INFO: renamed from: f */
    public boolean f957f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f955d = true;

    public C0439E(View view, int i2) {
        this.f952a = view;
        this.f953b = i2;
        this.f954c = (ViewGroup) view.getParent();
        m1045g(true);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: a */
    public final void mo1040a() {
        m1045g(false);
        if (this.f957f) {
            return;
        }
        AbstractC0465x.m1096b(this.f952a, this.f953b);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: b */
    public final void mo1041b(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: c */
    public final void mo1042c(AbstractC0454m abstractC0454m) {
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: d */
    public final void mo1043d(AbstractC0454m abstractC0454m) {
        abstractC0454m.mo1062x(this);
    }

    @Override // p043Y.InterfaceC0452k
    /* JADX INFO: renamed from: e */
    public final void mo1044e() {
        m1045g(true);
        if (this.f957f) {
            return;
        }
        AbstractC0465x.m1096b(this.f952a, 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m1045g(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f955d || this.f956e == z2 || (viewGroup = this.f954c) == null) {
            return;
        }
        this.f956e = z2;
        AbstractC0358S.m911t0(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f957f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f957f) {
            AbstractC0465x.m1096b(this.f952a, this.f953b);
            ViewGroup viewGroup = this.f954c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1045g(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            AbstractC0465x.m1096b(this.f952a, 0);
            ViewGroup viewGroup = this.f954c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        if (!this.f957f) {
            AbstractC0465x.m1096b(this.f952a, this.f953b);
            ViewGroup viewGroup = this.f954c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m1045g(false);
    }
}
