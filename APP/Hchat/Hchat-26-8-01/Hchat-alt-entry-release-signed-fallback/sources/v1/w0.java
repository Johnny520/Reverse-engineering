package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends y0.n implements x1.w0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public fg.l f14052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f14053v;

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // x1.w0
    public final void e(long r3) {
            r2 = this;
            long r0 = r2.f14053v
            boolean r0 = u2.l.a(r0, r3)
            if (r0 != 0) goto L14
            fg.l r0 = r2.f14052u
            u2.l r1 = new u2.l
            r1.<init>(r3)
            r0.invoke(r1)
            r2.f14053v = r3
        L14:
            return
    }
}
