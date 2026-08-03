package a;

/* JADX INFO: loaded from: classes.dex */
public final class Df extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.transition.e f61a;

    public Df(androidx.transition.e r1) {
            r0 = this;
            r0.f61a = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            androidx.transition.e r0 = r1.f61a
            r0.m()
            r2.removeListener(r1)
            return
    }
}
