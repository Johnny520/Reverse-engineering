package e0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends x1.j implements x1.w1, d1.g, d1.x {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg.a f2286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s1.l0 f2288y;

    public d(fg.a r3) {
            r2 = this;
            r2.<init>()
            r2.f2286w = r3
            c0.g r3 = new c0.g
            r0 = 2
            r3.<init>(r2, r0)
            s1.k r0 = s1.h0.f12244a
            s1.l0 r0 = new s1.l0
            r1 = 0
            r0.<init>(r1, r1, r1, r3)
            r2.k1(r0)
            r2.f2288y = r0
            return
    }

    @Override // d1.g
    public final void E(d1.z r1) {
            r0 = this;
            boolean r1 = r1.a()
            r0.f2287x = r1
            return
    }

    @Override // x1.w1
    public final long H() {
            r5 = this;
            x1.l r0 = e0.b.f2279a
            x1.f0 r1 = x1.k.w(r5)
            u2.c r1 = r1.E
            r0.getClass()
            int r2 = x1.c2.f20854b
            float r2 = r0.f20977a
            int r2 = r1.G0(r2)
            float r3 = r0.f20978b
            int r3 = r1.G0(r3)
            float r4 = r0.f20979c
            int r4 = r1.G0(r4)
            float r0 = r0.f20980d
            int r0 = r1.G0(r0)
            long r0 = x1.d1.h(r2, r3, r4, r0)
            return r0
    }

    @Override // x1.w1
    public final void P(s1.k r2, s1.l r3, long r4) {
            r1 = this;
            s1.l0 r0 = r1.f2288y
            r0.P(r2, r3, r4)
            return
    }

    @Override // x1.w1
    public final void b0() {
            r1 = this;
            s1.l0 r0 = r1.f2288y
            r0.b0()
            return
    }
}
