package ed;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.j f2706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qd.j[] f2708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.Map f2709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.List f2710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2711f;

    public b(int r2, int r3, qd.j r4) {
            r1 = this;
            r1.<init>()
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r1.f2709d = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f2710e = r0
            r1.f2706a = r4
            r1.f2707b = r2
            r1.f2711f = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<ed.b> r0 = ed.b.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            ed.b r3 = (ed.b) r3
            qd.j r0 = r2.f2706a
            qd.j r3 = r3.f2706a
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            qd.j r0 = r1.f2706a
            int r0 = r0.f10893a
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            qd.j r0 = r1.f2706a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
