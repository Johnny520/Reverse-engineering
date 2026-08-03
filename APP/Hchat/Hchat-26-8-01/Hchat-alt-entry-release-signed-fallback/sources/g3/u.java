package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g3.b0 f4239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4240b;

    public u(android.view.View r1, g3.b0 r2) {
            r0 = this;
            r0.f4239a = r2
            r0.f4240b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            r3 = 1065353216(0x3f800000, float:1.0)
            g3.b0 r0 = r2.f4239a
            g3.a0 r1 = r0.f4187a
            r1.e(r3)
            android.view.View r3 = r2.f4240b
            g3.x.f(r3, r0)
            return
    }
}
