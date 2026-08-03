package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22260c;

    public u(boolean r1, y2.d0 r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f22258a = r1
            r0.f22259b = r3
            r0.f22260c = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof y2.u
            if (r0 != 0) goto L8
            goto L1e
        L8:
            y2.u r3 = (y2.u) r3
            boolean r0 = r3.f22258a
            boolean r1 = r2.f22258a
            if (r1 == r0) goto L11
            goto L1e
        L11:
            boolean r0 = r2.f22259b
            boolean r1 = r3.f22259b
            if (r0 == r1) goto L18
            goto L1e
        L18:
            boolean r0 = r2.f22260c
            boolean r3 = r3.f22260c
            if (r0 == r3) goto L20
        L1e:
            r3 = 0
            return r3
        L20:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f22258a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 1
            int r0 = eh.a.h(r0, r1, r2)
            y2.d0 r2 = y2.d0.f22212g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f22259b
            int r0 = eh.a.h(r2, r1, r0)
            boolean r2 = r3.f22260c
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r2 = r2 + 2
            int r2 = r2 * r1
            return r2
    }
}
