package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3635f;

    public m0(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.f3630a = r1
            r0.f3631b = r2
            r0.f3632c = r3
            r0.f3633d = r4
            r0.f3634e = r6
            r0.f3635f = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L47
        L3:
            boolean r0 = r5 instanceof fb.m0
            if (r0 != 0) goto L8
            goto L45
        L8:
            fb.m0 r5 = (fb.m0) r5
            java.lang.String r0 = r4.f3630a
            java.lang.String r1 = r5.f3630a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L45
        L15:
            java.lang.String r0 = r4.f3631b
            java.lang.String r1 = r5.f3631b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L45
        L20:
            java.lang.String r0 = r4.f3632c
            java.lang.String r1 = r5.f3632c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L45
        L2b:
            long r0 = r4.f3633d
            long r2 = r5.f3633d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L45
        L34:
            long r0 = r4.f3634e
            long r2 = r5.f3634e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3d
            goto L45
        L3d:
            long r0 = r4.f3635f
            long r2 = r5.f3635f
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L47
        L45:
            r5 = 0
            return r5
        L47:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f3630a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f3631b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3632c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f3633d
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f3634e
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f3635f
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", apkPath="
            java.lang.String r1 = ", kind="
            java.lang.String r2 = "TargetSession(sessionId="
            java.lang.String r3 = r5.f3630a
            java.lang.String r4 = r5.f3631b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f3632c
            r0.append(r1)
            java.lang.String r1 = ", fileLength="
            r0.append(r1)
            long r1 = r5.f3633d
            r0.append(r1)
            java.lang.String r1 = ", lastModified="
            java.lang.String r2 = ", addedAt="
            long r3 = r5.f3634e
            j8.b.s(r0, r1, r3, r2)
            java.lang.String r1 = ")"
            long r2 = r5.f3635f
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
