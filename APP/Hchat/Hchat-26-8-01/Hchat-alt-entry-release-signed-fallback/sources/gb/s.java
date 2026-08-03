package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4478c;

    public s(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f4476a = r1
            r0.f4477b = r2
            r0.f4478c = r3
            return
    }

    public final org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "userWxId"
            java.lang.String r2 = r3.f4476a
            r0.put(r1, r2)
            java.lang.String r1 = "userWeChatId"
            java.lang.String r2 = r3.f4477b
            r0.put(r1, r2)
            java.lang.String r1 = "userNickname"
            java.lang.String r2 = r3.f4478c
            r0.put(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof gb.s
            if (r0 != 0) goto L8
            goto L2a
        L8:
            gb.s r3 = (gb.s) r3
            java.lang.String r0 = r2.f4476a
            java.lang.String r1 = r3.f4476a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f4477b
            java.lang.String r1 = r3.f4477b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r0 = r2.f4478c
            java.lang.String r3 = r3.f4478c
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
            java.lang.String r0 = r3.f4476a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4477b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f4478c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", weChatId="
            java.lang.String r1 = ", nickname="
            java.lang.String r2 = "PluginMarketUserIdentity(wxId="
            java.lang.String r3 = r5.f4476a
            java.lang.String r4 = r5.f4477b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f4478c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
