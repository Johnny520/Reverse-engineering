package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p4.t f12571d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.f1 f12573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.f1 f12574c;

    static {
            i2.y r0 = new i2.y
            r1 = 22
            r0.<init>(r1)
            r9.p r1 = new r9.p
            r2 = 7
            r1.<init>(r2)
            p4.t r0 = v0.k.b(r0, r1)
            sh.e2.f12571d = r0
            return
    }

    public e2(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f12572a = r1
            i0.f1 r1 = new i0.f1
            r1.<init>(r3)
            r0.f12573b = r1
            i0.f1 r1 = new i0.f1
            r1.<init>(r2)
            r0.f12574c = r1
            return
    }

    public final float a() {
            r2 = this;
            float r0 = r2.f12572a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L8
            return r1
        L8:
            i0.f1 r0 = r2.f12574c
            float r0 = r0.g()
            float r1 = r2.f12572a
            float r0 = r0 / r1
            return r0
    }

    public final void b(float r3) {
            r2 = this;
            float r0 = r2.f12572a
            r1 = 0
            float r3 = r9.e0.q(r3, r0, r1)
            i0.f1 r0 = r2.f12574c
            r0.h(r3)
            return
    }
}
