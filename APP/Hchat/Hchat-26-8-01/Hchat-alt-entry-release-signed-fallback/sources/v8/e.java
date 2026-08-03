package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f14229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14231e;

    public e(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.f14227a = r1
            r0.f14228b = r2
            r0.f14229c = r3
            r0.f14230d = r4
            r0.f14231e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3c
        L3:
            boolean r0 = r5 instanceof v8.e
            if (r0 != 0) goto L8
            goto L3a
        L8:
            v8.e r5 = (v8.e) r5
            java.lang.String r0 = r4.f14227a
            java.lang.String r1 = r5.f14227a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3a
        L15:
            java.lang.String r0 = r4.f14228b
            java.lang.String r1 = r5.f14228b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3a
        L20:
            java.lang.String r0 = r4.f14229c
            java.lang.String r1 = r5.f14229c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3a
        L2b:
            int r0 = r4.f14230d
            int r1 = r5.f14230d
            if (r0 == r1) goto L32
            goto L3a
        L32:
            long r0 = r4.f14231e
            long r2 = r5.f14231e
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
            java.lang.String r0 = r3.f14227a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f14228b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f14229c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f14230d
            int r0 = eh.a.e(r2, r0, r1)
            long r1 = r3.f14231e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", url="
            java.lang.String r1 = ", aesKey="
            java.lang.String r2 = "CdnDownloadSpec(md5="
            java.lang.String r3 = r5.f14227a
            java.lang.String r4 = r5.f14228b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f14229c
            r0.append(r1)
            java.lang.String r1 = ", fileType="
            r0.append(r1)
            int r1 = r5.f14230d
            r0.append(r1)
            java.lang.String r1 = ", expectedLength="
            r0.append(r1)
            java.lang.String r1 = ")"
            long r2 = r5.f14231e
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
