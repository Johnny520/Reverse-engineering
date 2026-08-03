package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends f1.c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1.d f3074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.j f3075g;

    public l0(e1.d r2) {
            r1 = this;
            r1.<init>()
            r1.f3074f = r2
            boolean r0 = be.h.D(r2)
            if (r0 != 0) goto L13
            f1.j r0 = f1.l.a()
            f1.j.c(r0, r2)
            goto L14
        L13:
            r0 = 0
        L14:
            r1.f3075g = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof f1.l0
            if (r0 != 0) goto L8
            goto L14
        L8:
            f1.l0 r2 = (f1.l0) r2
            e1.d r2 = r2.f3074f
            e1.d r0 = r1.f3074f
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            e1.d r0 = r1.f3074f
            int r0 = r0.hashCode()
            return r0
    }

    @Override // f1.c0
    public final e1.c k() {
            r5 = this;
            e1.c r0 = new e1.c
            e1.d r1 = r5.f3074f
            float r2 = r1.f2300a
            float r3 = r1.f2301b
            float r4 = r1.f2302c
            float r1 = r1.f2303d
            r0.<init>(r2, r3, r4, r1)
            return r0
    }
}
