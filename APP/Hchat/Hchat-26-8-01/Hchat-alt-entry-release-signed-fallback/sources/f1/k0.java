package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends f1.c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1.c f3073f;

    public k0(e1.c r1) {
            r0 = this;
            r0.<init>()
            r0.f3073f = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof f1.k0
            if (r0 != 0) goto L8
            goto L14
        L8:
            f1.k0 r2 = (f1.k0) r2
            e1.c r2 = r2.f3073f
            e1.c r0 = r1.f3073f
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
            e1.c r0 = r1.f3073f
            int r0 = r0.hashCode()
            return r0
    }

    @Override // f1.c0
    public final e1.c k() {
            r1 = this;
            e1.c r0 = r1.f3073f
            return r0
    }
}
