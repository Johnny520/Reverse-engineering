package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends x1.j implements x1.z1 {
    public final c1.c A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k.p f7058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f7059x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f1.t0 f7060y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public v.d f7061z;

    public s(float r1, f1.t0 r2, v.d r3) {
            r0 = this;
            r0.<init>()
            r0.f7059x = r1
            r0.f7060y = r2
            r0.f7061z = r3
            b0.d0 r1 = new b0.d0
            r2 = 23
            r1.<init>(r0, r2)
            c1.c r2 = new c1.c
            c1.d r3 = new c1.d
            r3.<init>()
            r2.<init>(r3, r1)
            r0.k1(r2)
            r0.A = r2
            return
    }

    @Override // x1.z1
    public final boolean A() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r2) {
            r1 = this;
            v.d r0 = r1.f7061z
            f2.w.d(r2, r0)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
