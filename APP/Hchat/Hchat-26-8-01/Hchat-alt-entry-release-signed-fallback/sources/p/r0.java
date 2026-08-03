package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends y0.n implements x1.u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f9981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9982v;

    @Override // x1.u1
    public final java.lang.Object R(u2.c r1, java.lang.Object r2) {
            r0 = this;
            boolean r1 = r2 instanceof p.c1
            if (r1 == 0) goto L7
            p.c1 r2 = (p.c1) r2
            goto L8
        L7:
            r2 = 0
        L8:
            if (r2 != 0) goto Lf
            p.c1 r2 = new p.c1
            r2.<init>()
        Lf:
            float r1 = r0.f9981u
            r2.f9869a = r1
            boolean r1 = r0.f9982v
            r2.f9870b = r1
            return r2
    }
}
