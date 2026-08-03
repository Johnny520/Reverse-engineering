package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends d7.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d7.b f8775n;

    public v(d7.b r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1)
            r2.f8775n = r3
            return
    }

    @Override // d7.b, o7.b
    public final void W(k7.a r2) {
            r1 = this;
            m7.u r2 = (m7.u) r2
            r2.Z()
            d7.b r0 = r1.f8775n
            m7.m r2 = r2.f8774s
            r0.a0(r2)
            return
    }

    @Override // o7.b
    public final void X() {
            r2 = this;
            r2.U()
            ce.n r0 = new ce.n
            r1 = 18
            r0.<init>(r1)
            r2.removeIf(r0)
            return
    }

    @Override // d7.b
    public final void j0(m7.b r2) {
            r1 = this;
            m7.u r2 = (m7.u) r2
            r2.Z()
            d7.b r0 = r1.f8775n
            m7.m r2 = r2.f8774s
            r0.a0(r2)
            return
    }
}
