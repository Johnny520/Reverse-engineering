package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4779u;

    public /* synthetic */ x0(int r1) {
            r0 = this;
            r0.f4779u = r1
            r0.<init>()
            return
    }

    @Override // x1.v
    public int G(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r1 = r0.f4779u
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.G(r3)
            return r1
        La:
            int r1 = r2.G(r3)
            return r1
    }

    @Override // x1.v
    public int K0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r1 = r0.f4779u
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.p0(r3)
            return r1
        La:
            int r1 = r2.p0(r3)
            return r1
    }

    @Override // x1.v
    public int Q(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r1 = r0.f4779u
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.M(r3)
            return r1
        La:
            int r1 = r2.M(r3)
            return r1
    }

    @Override // x1.v
    public int R0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r1 = r0.f4779u
            switch(r1) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.j(r3)
            return r1
        La:
            int r1 = r2.j(r3)
            return r1
    }

    public v1.o0 j(v1.p0 r4, v1.m0 r5, long r6) {
            r3 = this;
            long r0 = r3.k1(r5, r6)
            boolean r2 = r3.l1()
            if (r2 == 0) goto Le
            long r0 = u2.b.e(r6, r0)
        Le:
            v1.b1 r5 = r5.Q(r0)
            int r6 = r5.f13900g
            int r7 = r5.f13901h
            g0.g r0 = new g0.g
            r1 = 3
            r0.<init>(r5, r1)
            tf.u r5 = tf.u.f13168g
            v1.o0 r4 = r4.z(r6, r7, r5, r0)
            return r4
    }

    public abstract long k1(v1.m0 r1, long r2);

    public abstract boolean l1();
}
