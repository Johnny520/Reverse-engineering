package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f22073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.y1 f22074h;

    public s2(android.view.View r1, i0.y1 r2) {
            r0 = this;
            r0.<init>()
            r0.f22073g = r1
            r0.f22074h = r2
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.f22073g
            r1.removeOnAttachStateChangeListener(r0)
            i0.y1 r1 = r0.f22074h
            r1.x()
            return
    }
}
