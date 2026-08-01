package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qf extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ defpackage.b00 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ android.view.ViewPropertyAnimator e;
    public final /* synthetic */ defpackage.uf f;

    public qf(defpackage.uf r1, defpackage.b00 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
            r0 = this;
            r0.f = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.b
            r0 = 0
            android.view.View r1 = r2.c
            if (r3 == 0) goto La
            r1.setTranslationX(r0)
        La:
            int r3 = r2.d
            if (r3 == 0) goto L11
            r1.setTranslationY(r0)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            android.view.ViewPropertyAnimator r3 = r2.e
            r0 = 0
            r3.setListener(r0)
            uf r3 = r2.f
            b00 r0 = r2.a
            r3.c(r0)
            java.util.ArrayList r1 = r3.p
            r1.remove(r0)
            r3.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            uf r1 = r0.f
            r1.getClass()
            return
    }
}
