package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements m.i2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p4.t f7092j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.g1 f7093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.g1 f7094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.g1 f7095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n.k f7096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0.g1 f7097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m.r f7099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0.x f7100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.x f7101i;

    static {
            i2.y r0 = new i2.y
            r1 = 9
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 17
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r3 = 12
            r2.<init>(r0, r3, r1)
            k.w1.f7092j = r2
            return
    }

    public w1(int r2) {
            r1 = this;
            r1.<init>()
            i0.g1 r0 = new i0.g1
            r0.<init>(r2)
            r1.f7093a = r0
            i0.g1 r2 = new i0.g1
            r0 = 0
            r2.<init>(r0)
            r1.f7094b = r2
            i0.g1 r2 = new i0.g1
            r2.<init>(r0)
            r1.f7095c = r2
            n.k r2 = new n.k
            r2.<init>()
            r1.f7096d = r2
            i0.g1 r2 = new i0.g1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.<init>(r0)
            r1.f7097e = r2
            b0.d0 r2 = new b0.d0
            r0 = 24
            r2.<init>(r1, r0)
            m.r r0 = new m.r
            r0.<init>(r2)
            r1.f7099g = r0
            k.v1 r2 = new k.v1
            r0 = 0
            r2.<init>(r1, r0)
            i0.x r2 = i0.r.p(r2)
            r1.f7100h = r2
            k.v1 r2 = new k.v1
            r0 = 1
            r2.<init>(r1, r0)
            i0.x r2 = i0.r.p(r2)
            r1.f7101i = r2
            return
    }

    @Override // m.i2
    public final boolean a() {
            r1 = this;
            m.r r0 = r1.f7099g
            boolean r0 = r0.a()
            return r0
    }

    @Override // m.i2
    public final java.lang.Object b(k.d1 r2, fg.p r3, yf.c r4) {
            r1 = this;
            m.r r0 = r1.f7099g
            java.lang.Object r2 = r0.b(r2, r3, r4)
            xf.a r3 = xf.a.f21579g
            if (r2 != r3) goto Lb
            return r2
        Lb:
            sf.n r2 = sf.n.f12433a
            return r2
    }

    @Override // m.i2
    public final boolean c() {
            r1 = this;
            i0.x r0 = r1.f7101i
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // m.i2
    public final boolean d() {
            r1 = this;
            i0.x r0 = r1.f7100h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // m.i2
    public final float e(float r2) {
            r1 = this;
            m.r r0 = r1.f7099g
            float r2 = r0.e(r2)
            return r2
    }
}
