package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1121d;

    public c1(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f1118a = r2
            r0.f1119b = r3
            r0.f1120c = r4
            r0.f1121d = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof c9.c1
            if (r0 != 0) goto L8
            goto L31
        L8:
            c9.c1 r3 = (c9.c1) r3
            java.lang.String r0 = r2.f1118a
            java.lang.String r1 = r3.f1118a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f1119b
            java.lang.String r1 = r3.f1119b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            java.lang.String r0 = r2.f1120c
            java.lang.String r1 = r3.f1120c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            int r0 = r2.f1121d
            int r3 = r3.f1121d
            if (r0 == r3) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1118a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1119b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f1120c
            int r0 = eh.a.g(r0, r1, r2)
            int r1 = r3.f1121d
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", path="
            java.lang.String r2 = "GroupRow(id="
            java.lang.String r3 = r5.f1118a
            java.lang.String r4 = r5.f1119b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f1120c
            r0.append(r1)
            java.lang.String r1 = ", depth="
            r0.append(r1)
            int r1 = r5.f1121d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
