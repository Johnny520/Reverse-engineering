package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pf extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.b00 b;
    public final /* synthetic */ android.view.View c;
    public final /* synthetic */ android.view.ViewPropertyAnimator d;
    public final /* synthetic */ defpackage.uf e;

    public pf(defpackage.uf r2, defpackage.b00 r3, android.view.View r4, android.view.ViewPropertyAnimator r5) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.e = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.<init>()
            return
    }

    public pf(defpackage.uf r2, defpackage.b00 r3, android.view.ViewPropertyAnimator r4, android.view.View r5) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.e = r2
            r1.b = r3
            r1.d = r4
            r1.c = r5
            r1.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationCancel(r2)
            return
        L9:
            android.view.View r2 = r1.c
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.a
            switch(r3) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            android.view.ViewPropertyAnimator r3 = r2.d
            r0 = 0
            r3.setListener(r0)
            uf r3 = r2.e
            b00 r0 = r2.b
            r3.c(r0)
            java.util.ArrayList r1 = r3.o
            r1.remove(r0)
            r3.i()
            return
        L1b:
            android.view.ViewPropertyAnimator r3 = r2.d
            r0 = 0
            r3.setListener(r0)
            android.view.View r3 = r2.c
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r0)
            uf r3 = r2.e
            b00 r0 = r2.b
            r3.c(r0)
            java.util.ArrayList r1 = r3.q
            r1.remove(r0)
            r3.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            uf r1 = r0.e
            r1.getClass()
            return
        Lb:
            uf r1 = r0.e
            r1.getClass()
            return
    }
}
