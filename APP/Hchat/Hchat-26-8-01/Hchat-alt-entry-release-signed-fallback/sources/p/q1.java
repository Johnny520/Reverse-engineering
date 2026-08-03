package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends y0.n implements x1.u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0.f f9979u;

    @Override // x1.u1
    public final java.lang.Object R(u2.c r2, java.lang.Object r3) {
            r1 = this;
            boolean r2 = r3 instanceof p.c1
            if (r2 == 0) goto L7
            p.c1 r3 = (p.c1) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lf
            p.c1 r3 = new p.c1
            r3.<init>()
        Lf:
            y0.f r2 = r1.f9979u
            p.x r0 = new p.x
            r0.<init>(r2)
            r3.f9871c = r0
            return r3
    }
}
