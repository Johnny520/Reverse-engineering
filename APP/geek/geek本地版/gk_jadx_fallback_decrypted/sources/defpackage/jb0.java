package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jb0 extends android.animation.AnimatorListenerAdapter implements defpackage.q70 {
    public final android.view.View a;
    public final int b;
    public final android.view.ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public jb0(android.view.View r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f = r0
            r1.a = r2
            r1.b = r3
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.c = r2
            r2 = 1
            r1.d = r2
            r1.f(r2)
            return
    }

    @Override // defpackage.q70
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.q70
    public final void b() {
            r0 = this;
            return
    }

    @Override // defpackage.q70
    public final void c() {
            r1 = this;
            r0 = 0
            r1.f(r0)
            return
    }

    @Override // defpackage.q70
    public final void d() {
            r1 = this;
            r0 = 1
            r1.f(r0)
            return
    }

    @Override // defpackage.q70
    public final void e(defpackage.r70 r4) {
            r3 = this;
            boolean r0 = r3.f
            if (r0 != 0) goto L14
            int r0 = r3.b
            db0 r1 = defpackage.bb0.a
            android.view.View r2 = r3.a
            r1.O(r2, r0)
            android.view.ViewGroup r0 = r3.c
            if (r0 == 0) goto L14
            r0.invalidate()
        L14:
            r0 = 0
            r3.f(r0)
            r4.u(r3)
            return
    }

    public final void f(boolean r2) {
            r1 = this;
            boolean r0 = r1.d
            if (r0 == 0) goto L11
            boolean r0 = r1.e
            if (r0 == r2) goto L11
            android.view.ViewGroup r0 = r1.c
            if (r0 == 0) goto L11
            r1.e = r2
            defpackage.zt.Q(r0, r2)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            boolean r3 = r2.f
            if (r3 != 0) goto L14
            int r3 = r2.b
            db0 r0 = defpackage.bb0.a
            android.view.View r1 = r2.a
            r0.O(r1, r3)
            android.view.ViewGroup r3 = r2.c
            if (r3 == 0) goto L14
            r3.invalidate()
        L14:
            r3 = 0
            r2.f(r3)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator r3) {
            r2 = this;
            boolean r3 = r2.f
            if (r3 != 0) goto Ld
            int r3 = r2.b
            db0 r0 = defpackage.bb0.a
            android.view.View r1 = r2.a
            r0.O(r1, r3)
        Ld:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator r3) {
            r2 = this;
            boolean r3 = r2.f
            if (r3 != 0) goto Lc
            r3 = 0
            db0 r0 = defpackage.bb0.a
            android.view.View r1 = r2.a
            r0.O(r1, r3)
        Lc:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            return
    }
}
