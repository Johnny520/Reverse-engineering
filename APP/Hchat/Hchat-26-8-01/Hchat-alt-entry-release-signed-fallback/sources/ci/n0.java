package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n.k f1760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i.r0 f1761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i.c f1762w;

    public n0(n.k r1, i.r0 r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f1760u = r1
            r0.f1761v = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1008981770(0x3c23d70a, float:0.01)
            i.c r1 = i.d.a(r1, r2)
            r0.f1762w = r1
            return
    }

    public static final void k1(ci.n0 r3, float r4) {
            qg.t r0 = r3.Y0()
            ci.m0 r1 = new ci.m0
            r2 = 0
            r1.<init>(r3, r4, r2)
            r3 = 3
            qg.v.q(r0, r2, r1, r3)
            return
    }

    @Override // y0.n
    public final void c1() {
            r4 = this;
            qg.t r0 = r4.Y0()
            ci.c r1 = new ci.c
            r2 = 2
            r3 = 0
            r1.<init>(r4, r3, r2)
            r2 = 3
            qg.v.q(r0, r3, r1, r2)
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            r4.getClass()
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            c9.i r0 = new c9.i
            r1 = 10
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }
}
