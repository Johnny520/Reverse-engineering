package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements m.i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m.i2 f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.x f14495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.x f14496c;

    public i1(m.i2 r2, w.j1 r3) {
            r1 = this;
            r1.<init>()
            r1.f14494a = r2
            w.h1 r2 = new w.h1
            r0 = 0
            r2.<init>(r3, r0)
            i0.x r2 = i0.r.p(r2)
            r1.f14495b = r2
            w.h1 r2 = new w.h1
            r0 = 1
            r2.<init>(r3, r0)
            i0.x r2 = i0.r.p(r2)
            r1.f14496c = r2
            return
    }

    @Override // m.i2
    public final boolean a() {
            r1 = this;
            m.i2 r0 = r1.f14494a
            boolean r0 = r0.a()
            return r0
    }

    @Override // m.i2
    public final java.lang.Object b(k.d1 r2, fg.p r3, yf.c r4) {
            r1 = this;
            m.i2 r0 = r1.f14494a
            java.lang.Object r2 = r0.b(r2, r3, r4)
            return r2
    }

    @Override // m.i2
    public final boolean c() {
            r1 = this;
            i0.x r0 = r1.f14496c
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // m.i2
    public final boolean d() {
            r1 = this;
            i0.x r0 = r1.f14495b
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // m.i2
    public final float e(float r2) {
            r1 = this;
            m.i2 r0 = r1.f14494a
            float r2 = r0.e(r2)
            return r2
    }
}
