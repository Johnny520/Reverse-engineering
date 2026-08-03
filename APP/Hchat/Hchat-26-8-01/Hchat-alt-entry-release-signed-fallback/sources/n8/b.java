package n8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f9063c;

    public b(int r1, java.lang.String r2, org.json.JSONObject r3) {
            r0 = this;
            r0.<init>()
            r0.f9061a = r1
            r0.f9062b = r2
            r0.f9063c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof n8.b
            if (r0 != 0) goto L8
            goto L26
        L8:
            n8.b r3 = (n8.b) r3
            int r0 = r2.f9061a
            int r1 = r3.f9061a
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f9062b
            java.lang.String r1 = r3.f9062b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            org.json.JSONObject r0 = r2.f9063c
            org.json.JSONObject r3 = r3.f9063c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f9061a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9062b
            int r0 = eh.a.g(r0, r1, r2)
            org.json.JSONObject r1 = r3.f9063c
            if (r1 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            int r1 = r1.hashCode()
        L19:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QueryResult(errorCode="
            r0.<init>(r1)
            int r1 = r2.f9061a
            r0.append(r1)
            java.lang.String r1 = ", errorMessage="
            r0.append(r1)
            java.lang.String r1 = r2.f9062b
            r0.append(r1)
            java.lang.String r1 = ", response="
            r0.append(r1)
            org.json.JSONObject r1 = r2.f9063c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
