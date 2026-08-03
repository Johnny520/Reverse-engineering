package a;

/* JADX INFO: loaded from: classes.dex */
public final class Cf extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.J1 f50a;
    public final /* synthetic */ androidx.transition.e b;

    public Cf(androidx.transition.e r1, a.J1 r2) {
            r0 = this;
            r0.b = r1
            r0.f50a = r2
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            a.J1 r0 = r1.f50a
            r0.remove(r2)
            androidx.transition.e r0 = r1.b
            java.util.ArrayList<android.animation.Animator> r0 = r0.n
            r0.remove(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            androidx.transition.e r0 = r1.b
            java.util.ArrayList<android.animation.Animator> r0 = r0.n
            r0.add(r2)
            return
    }
}
