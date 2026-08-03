package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends qg.u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qg.y0 f11115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qg.x0 f11116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qg.k f11117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.Object f11118n;

    public w0(qg.y0 r1, qg.x0 r2, qg.k r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f11115k = r1
            r0.f11116l = r2
            r0.f11117m = r3
            r0.f11118n = r4
            return
    }

    @Override // qg.u0
    public final boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // qg.u0
    public final void l(java.lang.Throwable r7) {
            r6 = this;
            qg.k r7 = r6.f11117m
            qg.k r0 = qg.y0.Q(r7)
            qg.y0 r1 = r6.f11115k
            qg.x0 r2 = r6.f11116l
            java.lang.Object r3 = r6.f11118n
            if (r0 == 0) goto L15
            boolean r0 = r1.Z(r2, r0, r3)
            if (r0 == 0) goto L15
            goto L2c
        L15:
            qg.a1 r0 = r2.f11123g
            vg.h r4 = new vg.h
            r5 = 2
            r4.<init>(r5)
            r0.e(r4, r5)
            qg.k r7 = qg.y0.Q(r7)
            if (r7 == 0) goto L2d
            boolean r7 = r1.Z(r2, r7, r3)
            if (r7 == 0) goto L2d
        L2c:
            return
        L2d:
            java.lang.Object r7 = r1.E(r2, r3)
            r1.r(r7)
            return
    }
}
