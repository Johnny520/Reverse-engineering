package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends y0.n implements d1.g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.l f1912u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d1.z f1913v;

    @Override // d1.g
    public final void E(d1.z r2) {
            r1 = this;
            d1.z r0 = r1.f1913v
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto Lf
            r1.f1913v = r2
            fg.l r0 = r1.f1912u
            r0.invoke(r2)
        Lf:
            return
    }
}
