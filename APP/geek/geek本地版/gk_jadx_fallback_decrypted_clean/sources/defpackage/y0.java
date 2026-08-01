package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ y0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationCancel(r2)
            return
        L9:
            java.lang.Object r2 = r1.b
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r0 = 0
            r2.w = r0
            r0 = 0
            r2.k = r0
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L3a;
                case 2: goto L2d;
                case 3: goto L25;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.b
            r70 r0 = (defpackage.r70) r0
            r0.l()
            r5.removeListener(r4)
            return
        L10:
            java.lang.String r0 = "ivyOJsx2GYKF\n"
            java.lang.String r1 = "65LnS60CcO0=\n"
            java.lang.String r0 = "animation"
            defpackage.ip.o(r0, r5)
            java.lang.Object r5 = r4.b
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0 = 0
            r1 = 0
            r5.setLayerType(r0, r1)
            return
        L25:
            java.lang.Object r5 = r4.b
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r5 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r5
            r0 = 0
            r5.h = r0
            return
        L2d:
            java.lang.Object r5 = r4.b
            ph r5 = (defpackage.ph) r5
            r5.p()
            android.animation.ValueAnimator r5 = r5.r
            r5.start()
            return
        L3a:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Object r0 = r4.b
            n2 r0 = (defpackage.n2) r0
            java.util.ArrayList r1 = r0.e
            r5.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        L4a:
            if (r2 >= r1) goto L5e
            java.lang.Object r3 = r5.get(r2)
            vt r3 = (defpackage.vt) r3
            xt r3 = r3.b
            android.content.res.ColorStateList r3 = r3.o
            if (r3 == 0) goto L5b
            defpackage.ch.h(r0, r3)
        L5b:
            int r2 = r2 + 1
            goto L4a
        L5e:
            return
        L5f:
            java.lang.Object r5 = r4.b
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r0 = 0
            r5.w = r0
            r0 = 0
            r5.k = r0
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r7) {
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r7)
            return
        L9:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.lang.Object r0 = r6.b
            n2 r0 = (defpackage.n2) r0
            java.util.ArrayList r1 = r0.e
            r7.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L19:
            if (r2 >= r1) goto L37
            java.lang.Object r3 = r7.get(r2)
            vt r3 = (defpackage.vt) r3
            xt r3 = r3.b
            android.content.res.ColorStateList r4 = r3.o
            if (r4 == 0) goto L34
            int[] r3 = r3.s
            int r5 = r4.getDefaultColor()
            int r3 = r4.getColorForState(r3, r5)
            defpackage.ch.g(r0, r3)
        L34:
            int r2 = r2 + 1
            goto L19
        L37:
            return
    }
}
