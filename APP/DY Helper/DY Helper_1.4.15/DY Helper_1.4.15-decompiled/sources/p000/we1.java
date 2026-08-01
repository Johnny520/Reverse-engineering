package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class we1 {

    /* JADX INFO: renamed from: α */
    public final int f11691;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f11692;

    /* JADX INFO: renamed from: γ */
    public final int f11693;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f11694;

    /* JADX INFO: renamed from: ε */
    public final int f11695;

    /* JADX INFO: renamed from: ζ */
    public final int f11696;

    /* JADX INFO: renamed from: η */
    public final java.lang.Long f11697;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Long f11698;

    /* JADX INFO: renamed from: ι */
    public final org.json.JSONObject f11699;

    public we1(int r1, java.lang.Integer r2, int r3, java.lang.String r4, int r5, int r6, java.lang.Long r7, java.lang.Long r8, org.json.JSONObject r9) {
            r0 = this;
            r0.<init>()
            r0.f11691 = r1
            r0.f11692 = r2
            r0.f11693 = r3
            r0.f11694 = r4
            r0.f11695 = r5
            r0.f11696 = r6
            r0.f11697 = r7
            r0.f11698 = r8
            r0.f11699 = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.we1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            we1 r5 = (p000.we1) r5
            int r1 = r4.f11691
            int r3 = r5.f11691
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.f11692
            java.lang.Integer r3 = r5.f11692
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.f11693
            int r3 = r5.f11693
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f11694
            java.lang.String r3 = r5.f11694
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            int r1 = r4.f11695
            int r3 = r5.f11695
            if (r1 == r3) goto L37
            return r2
        L37:
            int r1 = r4.f11696
            int r3 = r5.f11696
            if (r1 == r3) goto L3e
            return r2
        L3e:
            java.lang.Long r1 = r4.f11697
            java.lang.Long r3 = r5.f11697
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L49
            return r2
        L49:
            java.lang.Long r1 = r4.f11698
            java.lang.Long r3 = r5.f11698
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L54
            return r2
        L54:
            org.json.JSONObject r4 = r4.f11699
            org.json.JSONObject r5 = r5.f11699
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L5f
            return r2
        L5f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f11691
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.f11692
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f11693
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f11694
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f11695
            int r0 = p000.a12.m14(r3, r0, r1)
            int r3 = r4.f11696
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.Long r3 = r4.f11697
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f11698
            if (r3 != 0) goto L46
            r3 = r2
            goto L4a
        L46:
            int r3 = r3.hashCode()
        L4a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            org.json.JSONObject r4 = r4.f11699
            if (r4 != 0) goto L51
            goto L55
        L51:
            int r2 = r4.hashCode()
        L55:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeedResult(bridgeCode="
            r0.<init>(r1)
            int r1 = r5.f11691
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r5.f11692
            r0.append(r1)
            java.lang.String r1 = ", statusCode="
            r0.append(r1)
            java.lang.String r1 = ", statusMessage="
            java.lang.String r2 = ", foodId="
            int r3 = r5.f11693
            java.lang.String r4 = r5.f11694
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", foodPrice="
            java.lang.String r2 = ", balanceSpark="
            int r3 = r5.f11695
            int r4 = r5.f11696
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.Long r1 = r5.f11697
            r0.append(r1)
            java.lang.String r1 = ", gainedCloseness="
            r0.append(r1)
            java.lang.Long r1 = r5.f11698
            r0.append(r1)
            java.lang.String r1 = ", feedInfo="
            r0.append(r1)
            org.json.JSONObject r5 = r5.f11699
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6376() {
            r4 = this;
            int r0 = r4.f11691
            r1 = 1
            if (r0 != r1) goto L25
            xm0 r0 = new xm0
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 299(0x12b, float:4.19E-43)
            r0.<init>(r2, r3, r1)
            java.lang.Integer r2 = r4.f11692
            if (r2 == 0) goto L25
            int r2 = r2.intValue()
            boolean r0 = r0.m6684(r2)
            if (r0 == 0) goto L25
            int r0 = r4.f11693
            if (r0 != 0) goto L25
            org.json.JSONObject r4 = r4.f11699
            if (r4 == 0) goto L25
            return r1
        L25:
            r4 = 0
            return r4
    }
}
