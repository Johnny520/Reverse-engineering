package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yf extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ android.view.ViewGroup a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ defpackage.g40 d;
    public final /* synthetic */ defpackage.ag e;

    public yf(android.view.ViewGroup r1, android.view.View r2, boolean r3, defpackage.g40 r4, defpackage.ag r5) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewGroup r2 = r1.a
            android.view.View r0 = r1.b
            r2.endViewTransition(r0)
            boolean r2 = r1.c
            if (r2 == 0) goto L12
            g40 r2 = r1.d
            int r2 = r2.a
            defpackage.z30.a(r0, r2)
        L12:
            ag r2 = r1.e
            r2.d()
            return
    }
}
