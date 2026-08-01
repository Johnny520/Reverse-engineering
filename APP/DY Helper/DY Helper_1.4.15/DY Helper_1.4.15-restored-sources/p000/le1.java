package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class le1 {

    /* JADX INFO: renamed from: α */
    public final int f6589;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f6590;

    /* JADX INFO: renamed from: γ */
    public final org.json.JSONObject f6591;

    public le1(int r1, java.lang.Integer r2, org.json.JSONObject r3) {
            r0 = this;
            r0.<init>()
            r0.f6589 = r1
            r0.f6590 = r2
            r0.f6591 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.le1
            if (r0 != 0) goto L8
            goto L26
        L8:
            le1 r3 = (p000.le1) r3
            int r0 = r2.f6589
            int r1 = r3.f6589
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.Integer r0 = r2.f6590
            java.lang.Integer r1 = r3.f6590
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            org.json.JSONObject r2 = r2.f6591
            org.json.JSONObject r3 = r3.f6591
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
            int r0 = r2.f6589
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Integer r1 = r2.f6590
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            org.json.JSONObject r2 = r2.f6591
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BridgeResponse(bridgeCode="
            r0.<init>(r1)
            int r1 = r2.f6589
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r2.f6590
            r0.append(r1)
            java.lang.String r1 = ", response="
            r0.append(r1)
            org.json.JSONObject r2 = r2.f6591
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
