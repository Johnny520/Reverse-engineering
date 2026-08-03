package lf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f8036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8039g;

    public b(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f8033a = r1
            r0.f8034b = r2
            r0.f8035c = r3
            r0.f8036d = r4
            return
    }

    public b(ac.k r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r3 = r1.v(r3)
            java.lang.String r4 = r1.y(r4)
            java.lang.String r1 = r1.v(r5)
            r0.<init>(r2, r3, r4, r1)
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.f8038f
            r1 = -1
            java.lang.String r2 = "0x%04x"
            if (r0 != r1) goto La
            java.lang.String r0 = "-1 "
            goto L16
        La:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = java.lang.String.format(r2, r0)
        L16:
            boolean r1 = r6.f8037e
            if (r1 == 0) goto L29
            int r1 = r6.f8039g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r1)
            goto L2b
        L29:
            java.lang.String r1 = "      "
        L2b:
            java.lang.String r2 = r6.f8036d
            if (r2 == 0) goto L36
            java.lang.String r3 = ", signature: "
            java.lang.String r2 = r3.concat(r2)
            goto L38
        L36:
            java.lang.String r2 = ""
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "-"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ": r"
            r3.append(r0)
            int r0 = r6.f8033a
            r3.append(r0)
            java.lang.String r0 = " '"
            java.lang.String r1 = "' "
            java.lang.String r4 = r6.f8034b
            java.lang.String r5 = r6.f8035c
            j8.b.t(r3, r0, r4, r1, r5)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
