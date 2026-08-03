package a;

/* JADX INFO: loaded from: classes.dex */
public final class D6 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ com.google.android.material.floatingactionbutton.a c;

    public D6(com.google.android.material.floatingactionbutton.b r1, boolean r2, com.google.android.material.floatingactionbutton.a r3) {
            r0 = this;
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f56a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
