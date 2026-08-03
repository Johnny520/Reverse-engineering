package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9619c;

    public b(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9617a = r1
            r0.f9618b = r2
            r0.f9619c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof o9.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o9.b r5 = (o9.b) r5
            java.lang.String r1 = r4.f9617a
            java.lang.String r3 = r5.f9617a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f9618b
            int r3 = r5.f9618b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.f9619c
            int r5 = r5.f9619c
            if (r1 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9617a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f9618b
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f9619c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", wxidStart="
            java.lang.String r1 = ", wxidEnd="
            int r2 = r5.f9618b
            java.lang.String r3 = "LeaveNotice(wxid="
            java.lang.String r4 = r5.f9617a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ")"
            int r2 = r5.f9619c
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
