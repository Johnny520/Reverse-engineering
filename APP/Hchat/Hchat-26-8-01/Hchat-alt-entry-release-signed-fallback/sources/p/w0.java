package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f10030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f10031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f10033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10034y;

    @Override // x1.v
    public final v1.o0 j(v1.p0 r6, v1.m0 r7, long r8) {
            r5 = this;
            float r0 = r5.f10030u
            int r0 = r6.G0(r0)
            float r1 = r5.f10032w
            int r1 = r6.G0(r1)
            int r1 = r1 + r0
            float r0 = r5.f10031v
            int r0 = r6.G0(r0)
            float r2 = r5.f10033x
            int r2 = r6.G0(r2)
            int r2 = r2 + r0
            int r0 = -r1
            int r3 = -r2
            long r3 = u2.b.i(r0, r3, r8)
            v1.b1 r7 = r7.Q(r3)
            int r0 = r7.f13900g
            int r0 = r0 + r1
            int r0 = u2.b.g(r0, r8)
            int r1 = r7.f13901h
            int r1 = r1 + r2
            int r8 = u2.b.f(r1, r8)
            m.b r9 = new m.b
            r1 = 6
            r9.<init>(r5, r1, r7)
            tf.u r7 = tf.u.f13168g
            v1.o0 r6 = r6.z(r0, r8, r7, r9)
            return r6
    }
}
