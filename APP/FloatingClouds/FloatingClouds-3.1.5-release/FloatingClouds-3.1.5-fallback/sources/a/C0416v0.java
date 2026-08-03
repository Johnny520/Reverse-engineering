package a;

/* JADX INFO: renamed from: a.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0416v0 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f727a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ C0416v0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f727a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public C0416v0(a.Lg r1, android.view.View r2) {
            r0 = this;
            r2 = 3
            r0.f727a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f727a
            switch(r0) {
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationCancel(r2)
            return
        L9:
            java.lang.Object r2 = r1.b
            a.Lg r2 = (a.Lg) r2
            r2.b()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            int r5 = r4.f727a
            switch(r5) {
                case 0: goto L22;
                case 1: goto L15;
                case 2: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r5 = r4.b
            a.Lg r5 = (a.Lg) r5
            r5.a()
            return
        Ld:
            java.lang.Object r5 = r4.b
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior r5 = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) r5
            r0 = 0
            r5.h = r0
            return
        L15:
            java.lang.Object r5 = r4.b
            a.F5 r5 = (a.F5) r5
            r5.q()
            android.animation.ValueAnimator r5 = r5.r
            r5.start()
            return
        L22:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Object r0 = r4.b
            a.u0 r0 = (a.C0398u0) r0
            java.util.ArrayList<a.t0> r1 = r0.e
            r5.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        L32:
            if (r2 >= r1) goto L40
            java.lang.Object r3 = r5.get(r2)
            a.t0 r3 = (a.AbstractC0380t0) r3
            r3.a(r0)
            int r2 = r2 + 1
            goto L32
        L40:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r5) {
            r4 = this;
            int r0 = r4.f727a
            switch(r0) {
                case 0: goto L11;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r5)
            return
        L9:
            java.lang.Object r5 = r4.b
            a.Lg r5 = (a.Lg) r5
            r5.c()
            return
        L11:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Object r0 = r4.b
            a.u0 r0 = (a.C0398u0) r0
            java.util.ArrayList<a.t0> r1 = r0.e
            r5.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        L21:
            if (r2 >= r1) goto L2f
            java.lang.Object r3 = r5.get(r2)
            a.t0 r3 = (a.AbstractC0380t0) r3
            r3.b(r0)
            int r2 = r2 + 1
            goto L21
        L2f:
            return
    }
}
