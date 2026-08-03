package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends p.e0 implements x1.v {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p.r1 f9918w;

    public i0(p.r1 r1) {
            r0 = this;
            r0.<init>()
            r0.f9918w = r1
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r7, v1.m0 r8, long r9) {
            r6 = this;
            p.r1 r0 = r6.f9889v
            u2.m r1 = r7.getLayoutDirection()
            int r0 = r0.c(r7, r1)
            p.r1 r1 = r6.f9888u
            u2.m r2 = r7.getLayoutDirection()
            int r1 = r1.c(r7, r2)
            int r0 = r0 - r1
            p.r1 r1 = r6.f9889v
            int r1 = r1.d(r7)
            p.r1 r2 = r6.f9888u
            int r2 = r2.d(r7)
            int r1 = r1 - r2
            p.r1 r2 = r6.f9889v
            u2.m r3 = r7.getLayoutDirection()
            int r2 = r2.a(r7, r3)
            p.r1 r3 = r6.f9888u
            u2.m r4 = r7.getLayoutDirection()
            int r3 = r3.a(r7, r4)
            int r2 = r2 - r3
            p.r1 r3 = r6.f9889v
            int r3 = r3.b(r7)
            p.r1 r4 = r6.f9888u
            int r4 = r4.b(r7)
            int r3 = r3 - r4
            int r2 = r2 + r0
            int r3 = r3 + r1
            int r4 = -r2
            int r5 = -r3
            long r4 = u2.b.i(r4, r5, r9)
            v1.b1 r8 = r8.Q(r4)
            int r4 = r8.f13900g
            int r4 = r4 + r2
            int r2 = u2.b.g(r4, r9)
            int r4 = r8.f13901h
            int r4 = r4 + r3
            int r9 = u2.b.f(r4, r9)
            p.h0 r10 = new p.h0
            r3 = 0
            r10.<init>(r8, r0, r1, r3)
            tf.u r8 = tf.u.f13168g
            v1.o0 r7 = r7.z(r2, r9, r8, r10)
            return r7
    }

    @Override // p.e0
    public final p.r1 k1(p.r1 r3) {
            r2 = this;
            p.r1 r0 = r2.f9918w
            p.l1 r1 = new p.l1
            r1.<init>(r3, r0)
            return r1
    }

    @Override // p.e0
    public final void l1() {
            r0 = this;
            super.l1()
            x1.k.m(r0)
            return
    }
}
