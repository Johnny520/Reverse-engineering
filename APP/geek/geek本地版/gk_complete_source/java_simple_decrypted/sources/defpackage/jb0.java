package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends AnimatorListenerAdapter implements q70 {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public jb0(View r2, int r3) {
        this.f = false;
        this.a = r2;
        this.b = r3;
        this.c = (ViewGroup) r2.getParent();
        this.d = true;
        f(true);
    }

    @Override // defpackage.q70
    public final void c() {
        f(false);
    }

    @Override // defpackage.q70
    public final void d() {
        f(true);
    }

    @Override // defpackage.q70
    public final void e(r70 r4) {
        if (this.f == true) goto L7;
        int r0 = this.b;
        bb0.a.O(this.a, r0);
        ViewGroup r02 = this.c;
        if (r02 == null) goto L7;
        r02.invalidate();
    L7:
        f(false);
        r4.u(this);
    }

    public final void f(boolean r2) {
        if (this.d == true) goto L5;
        return;
    L5:
        if (this.e == r2) goto L11;
        ViewGroup r0 = this.c;
        if (r0 == null) goto L12;
        this.e = r2;
        zt.Q(r0, r2);
        return;
    L12:
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator r1) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r3) {
        if (this.f == true) goto L7;
        int r32 = this.b;
        bb0.a.O(this.a, r32);
        ViewGroup r33 = this.c;
        if (r33 == null) goto L7;
        r33.invalidate();
    L7:
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator r3) {
        if (this.f == true) goto L6;
        int r32 = this.b;
        bb0.a.O(this.a, r32);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator r3) {
        if (this.f == true) goto L6;
        bb0.a.O(this.a, 0);
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator r1) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r1) {
    }

    @Override // defpackage.q70
    public final void a() {
    }

    @Override // defpackage.q70
    public final void b() {
    }
}
