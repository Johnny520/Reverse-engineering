package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends m7.o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.HashSet f8772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f8773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m7.m f8774s;

    public u(m7.m r3) {
            r2 = this;
            r0 = 5
            r1 = 0
            r2.<init>(r0, r1)
            r2.f8774s = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f8772q = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f8773r = r3
            return
    }

    @Override // k7.c
    public final void M() {
            r2 = this;
            r7.f r0 = r2.f8734o
            int r0 = r0.f11560n
            m7.m r1 = r2.f8774s
            r1.a0(r0)
            r7.f r0 = r2.f8735p
            int r0 = r0.f11560n
            r1.b0(r0)
            return
    }

    @Override // l7.a
    public final void R() {
            r0 = this;
            r0.Y()
            return
    }

    @Override // m7.b
    public final void Z() {
            r1 = this;
            java.util.HashSet r0 = r1.f8772q
            r0.clear()
            java.util.HashSet r0 = r1.f8773r
            r0.clear()
            super.Z()
            return
    }

    @Override // m7.b
    public final void a0(int r2) {
            r1 = this;
            super.a0(r2)
            m7.m r0 = r1.f8774s
            r0.a0(r2)
            return
    }

    @Override // m7.b
    public final void b0(int r2) {
            r1 = this;
            super.b0(r2)
            m7.m r0 = r1.f8774s
            r0.b0(r2)
            return
    }
}
