package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rf extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.sf b;
    public final /* synthetic */ android.view.ViewPropertyAnimator c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ defpackage.uf e;

    public /* synthetic */ rf(defpackage.uf r1, defpackage.sf r2, android.view.ViewPropertyAnimator r3, android.view.View r4, int r5) {
            r0 = this;
            r0.a = r5
            r0.e = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.a
            switch(r3) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            android.view.ViewPropertyAnimator r3 = r2.c
            r0 = 0
            r3.setListener(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r0 = r2.d
            r0.setAlpha(r3)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            sf r3 = r2.b
            b00 r0 = r3.b
            uf r1 = r2.e
            r1.c(r0)
            java.util.ArrayList r0 = r1.r
            b00 r3 = r3.b
            r0.remove(r3)
            r1.i()
            return
        L2d:
            android.view.ViewPropertyAnimator r3 = r2.c
            r0 = 0
            r3.setListener(r0)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r0 = r2.d
            r0.setAlpha(r3)
            r3 = 0
            r0.setTranslationX(r3)
            r0.setTranslationY(r3)
            sf r3 = r2.b
            b00 r0 = r3.a
            uf r1 = r2.e
            r1.c(r0)
            java.util.ArrayList r0 = r1.r
            b00 r3 = r3.a
            r0.remove(r3)
            r1.i()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            sf r1 = r0.b
            b00 r1 = r1.b
            uf r1 = r0.e
            r1.getClass()
            return
        Lf:
            sf r1 = r0.b
            b00 r1 = r1.a
            uf r1 = r0.e
            r1.getClass()
            return
    }
}
