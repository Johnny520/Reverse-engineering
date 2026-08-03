package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f13610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f13614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13615f;

    public f(int r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f13610a = r4
            r0.f13611b = r5
            r0.f13612c = r1
            r0.f13613d = r2
            r0.f13614e = r6
            r0.f13615f = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L43
        L3:
            boolean r0 = r5 instanceof ua.f
            if (r0 != 0) goto L8
            goto L41
        L8:
            ua.f r5 = (ua.f) r5
            java.lang.String r0 = r4.f13610a
            java.lang.String r1 = r5.f13610a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L41
        L15:
            java.lang.String r0 = r4.f13611b
            java.lang.String r1 = r5.f13611b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L41
        L20:
            int r0 = r4.f13612c
            int r1 = r5.f13612c
            if (r0 == r1) goto L27
            goto L41
        L27:
            long r0 = r4.f13613d
            long r2 = r5.f13613d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L41
        L30:
            java.lang.String r0 = r4.f13614e
            java.lang.String r1 = r5.f13614e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L41
        L3b:
            boolean r0 = r4.f13615f
            boolean r5 = r5.f13615f
            if (r0 == r5) goto L43
        L41:
            r5 = 0
            return r5
        L43:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f13610a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f13611b
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f13612c
            int r0 = eh.a.e(r2, r0, r1)
            long r2 = r4.f13613d
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f13614e
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r4.f13615f
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", accountType="
            java.lang.String r2 = "TransferReceiveAccount(key="
            java.lang.String r3 = r5.f13610a
            java.lang.String r4 = r5.f13611b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            int r1 = r5.f13612c
            r0.append(r1)
            java.lang.String r1 = ", subChannelId="
            r0.append(r1)
            long r1 = r5.f13613d
            r0.append(r1)
            java.lang.String r1 = ", bindSerial="
            r0.append(r1)
            java.lang.String r1 = r5.f13614e
            r0.append(r1)
            java.lang.String r1 = ", available="
            r0.append(r1)
            boolean r1 = r5.f13615f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
