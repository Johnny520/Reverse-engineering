package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o70 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ o70(java.lang.Object r1, android.view.View r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public o70(defpackage.r70 r2, defpackage.n6 r3) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.c = r2
            r1.b = r3
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
            java.lang.Object r2 = r1.b
            ya0 r2 = (defpackage.ya0) r2
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            r2.b(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L20;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.b
            gc0 r2 = (defpackage.gc0) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            fc0 r2 = r2.a
            r2.d(r0)
            java.lang.Object r2 = r1.c
            android.view.View r2 = (android.view.View) r2
            defpackage.cc0.e(r2)
            return
        L18:
            java.lang.Object r2 = r1.b
            ya0 r2 = (defpackage.ya0) r2
            r2.a()
            return
        L20:
            java.lang.Object r0 = r1.b
            n6 r0 = (defpackage.n6) r0
            r0.remove(r2)
            java.lang.Object r0 = r1.c
            r70 r0 = (defpackage.r70) r0
            java.util.ArrayList r0 = r0.m
            r0.remove(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L11;
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            java.lang.Object r2 = r1.b
            ya0 r2 = (defpackage.ya0) r2
            r2.c()
            return
        L11:
            java.lang.Object r0 = r1.c
            r70 r0 = (defpackage.r70) r0
            java.util.ArrayList r0 = r0.m
            r0.add(r2)
            return
    }
}
