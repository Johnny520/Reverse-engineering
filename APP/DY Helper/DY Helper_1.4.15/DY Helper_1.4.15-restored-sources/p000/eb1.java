package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eb1 {

    /* JADX INFO: renamed from: α */
    public final int f3471;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f3472;

    /* JADX INFO: renamed from: γ */
    public final org.json.JSONObject f3473;

    public eb1(int r1, java.lang.Integer r2, org.json.JSONObject r3) {
            r0 = this;
            r0.<init>()
            r0.f3471 = r1
            r0.f3472 = r2
            r0.f3473 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.eb1
            if (r0 != 0) goto L8
            goto L26
        L8:
            eb1 r3 = (p000.eb1) r3
            int r0 = r2.f3471
            int r1 = r3.f3471
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.Integer r0 = r2.f3472
            java.lang.Integer r1 = r3.f3472
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            org.json.JSONObject r2 = r2.f3473
            org.json.JSONObject r3 = r3.f3473
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f3471
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Integer r1 = r2.f3472
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            org.json.JSONObject r2 = r2.f3473
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Response(bridgeCode="
            r0.<init>(r1)
            int r1 = r2.f3471
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r2.f3472
            r0.append(r1)
            java.lang.String r1 = ", response="
            r0.append(r1)
            org.json.JSONObject r2 = r2.f3473
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Integer m1891() {
            r5 = this;
            java.lang.String r0 = "base_resp"
            org.json.JSONObject r5 = r5.f3473
            org.json.JSONObject r0 = r5.optJSONObject(r0)
            java.lang.String r1 = "status_code"
            boolean r2 = r5.has(r1)
            r3 = -1
            if (r2 == 0) goto L1a
            int r5 = r5.optInt(r1, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L1a:
            java.lang.String r2 = "StatusCode"
            boolean r4 = r5.has(r2)
            if (r4 == 0) goto L2b
            int r5 = r5.optInt(r2, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L2b:
            r5 = 1
            if (r0 == 0) goto L3d
            boolean r4 = r0.has(r1)
            if (r4 != r5) goto L3d
            int r5 = r0.optInt(r1, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L3d:
            if (r0 == 0) goto L4e
            boolean r1 = r0.has(r2)
            if (r1 != r5) goto L4e
            int r5 = r0.optInt(r2, r3)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L4e:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final boolean m1892() {
            r4 = this;
            int r0 = r4.f3471
            r1 = 1
            if (r0 != r1) goto L1d
            xm0 r0 = new xm0
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 299(0x12b, float:4.19E-43)
            r0.<init>(r2, r3, r1)
            java.lang.Integer r4 = r4.f3472
            if (r4 == 0) goto L1d
            int r4 = r4.intValue()
            boolean r4 = r0.m6684(r4)
            if (r4 == 0) goto L1d
            return r1
        L1d:
            r4 = 0
            return r4
    }
}
