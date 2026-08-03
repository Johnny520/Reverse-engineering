package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends y0.n implements x1.z1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg.l f3146w;

    public e(boolean r1, boolean r2, fg.l r3) {
            r0 = this;
            r0.<init>()
            r0.f3144u = r1
            r0.f3145v = r2
            r0.f3146w = r3
            return
    }

    @Override // x1.z1
    public final boolean S0() {
            r1 = this;
            boolean r0 = r1.f3144u
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r2) {
            r1 = this;
            fg.l r0 = r1.f3146w
            r0.invoke(r2)
            return
    }

    @Override // x1.z1
    public final boolean c0() {
            r1 = this;
            boolean r0 = r1.f3145v
            return r0
    }
}
