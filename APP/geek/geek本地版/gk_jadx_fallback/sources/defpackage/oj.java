package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oj extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final java.lang.Object c;

    public oj(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r0
            r1.c = r2
            return
    }

    public oj(defpackage.wj r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.c = r2
            r1.<init>()
            r2 = 0
            r1.b = r2
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
            r2 = 1
            r1.b = r2
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r4) {
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.c
            wj r4 = (defpackage.wj) r4
            boolean r0 = r3.b
            r1 = 0
            if (r0 == 0) goto L11
            r3.b = r1
            goto L30
        L11:
            android.animation.ValueAnimator r0 = r4.z
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            r4.A = r1
            r4.f(r1)
            goto L30
        L28:
            r0 = 2
            r4.A = r0
            androidx.recyclerview.widget.RecyclerView r4 = r4.s
            r4.invalidate()
        L30:
            return
        L31:
            java.lang.Object r4 = r3.c
            android.view.View r4 = (android.view.View) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            db0 r1 = defpackage.bb0.a
            r1.N(r4, r0)
            boolean r0 = r3.b
            if (r0 == 0) goto L45
            r0 = 0
            r1 = 0
            r4.setLayerType(r0, r1)
        L45:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r3)
            return
        L9:
            java.lang.Object r3 = r2.c
            android.view.View r3 = (android.view.View) r3
            java.util.WeakHashMap r0 = defpackage.ja0.a
            boolean r0 = defpackage.s90.h(r3)
            if (r0 == 0) goto L23
            int r0 = r3.getLayerType()
            if (r0 != 0) goto L23
            r0 = 1
            r2.b = r0
            r0 = 2
            r1 = 0
            r3.setLayerType(r0, r1)
        L23:
            return
    }
}
