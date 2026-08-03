package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4439c;

    public j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f4437a = r1
            r0.f4438b = r2
            r0.f4439c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof gb.j
            if (r0 != 0) goto L8
            goto L2a
        L8:
            gb.j r3 = (gb.j) r3
            java.lang.String r0 = r2.f4437a
            java.lang.String r1 = r3.f4437a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f4438b
            java.lang.String r1 = r3.f4438b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r0 = r2.f4439c
            java.lang.String r3 = r3.f4439c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4437a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4438b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f4439c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", weChatId="
            java.lang.String r1 = ", nickname="
            java.lang.String r2 = "UploaderIdentity(wxId="
            java.lang.String r3 = r5.f4437a
            java.lang.String r4 = r5.f4438b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f4439c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
