package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2564e;

    public j(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, long r5) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f2560a = r1
            r0.f2561b = r2
            r0.f2562c = r3
            r0.f2563d = r4
            r0.f2564e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3c
        L3:
            boolean r0 = r5 instanceof eb.j
            if (r0 != 0) goto L8
            goto L3a
        L8:
            eb.j r5 = (eb.j) r5
            java.lang.String r0 = r4.f2560a
            java.lang.String r1 = r5.f2560a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3a
        L15:
            java.lang.String r0 = r4.f2561b
            java.lang.String r1 = r5.f2561b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3a
        L20:
            java.lang.String r0 = r4.f2562c
            java.lang.String r1 = r5.f2562c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L3a
        L2b:
            int r0 = r4.f2563d
            int r1 = r5.f2563d
            if (r0 == r1) goto L32
            goto L3a
        L32:
            long r0 = r4.f2564e
            long r2 = r5.f2564e
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L3c
        L3a:
            r5 = 0
            return r5
        L3c:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2560a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2561b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2562c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f2563d
            int r0 = eh.a.e(r2, r0, r1)
            long r1 = r3.f2564e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", verifyUsername="
            java.lang.String r1 = ", ticket="
            java.lang.String r2 = "VerifyAlias(contactWxid="
            java.lang.String r3 = r5.f2560a
            java.lang.String r4 = r5.f2561b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f2562c
            r0.append(r1)
            java.lang.String r1 = ", scene="
            r0.append(r1)
            int r1 = r5.f2563d
            r0.append(r1)
            java.lang.String r1 = ", time="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r5.f2564e
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
