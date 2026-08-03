package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f4241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g3.b0 f4242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b.e f4243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f4244j;

    public v(android.view.View r1, g3.b0 r2, b.e r3, android.animation.ValueAnimator r4) {
            r0 = this;
            r0.<init>()
            r0.f4241g = r1
            r0.f4242h = r2
            r0.f4243i = r3
            r0.f4244j = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            g3.b0 r0 = r3.f4242h
            b.e r1 = r3.f4243i
            android.view.View r2 = r3.f4241g
            g3.x.i(r2, r0, r1)
            android.animation.ValueAnimator r0 = r3.f4244j
            r0.start()
            return
    }
}
