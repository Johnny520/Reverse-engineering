package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xe1 {

    /* JADX INFO: renamed from: α */
    public final int f12145;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f12146;

    /* JADX INFO: renamed from: γ */
    public final int f12147;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f12148;

    /* JADX INFO: renamed from: ε */
    public final int f12149;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f12150;

    /* JADX INFO: renamed from: η */
    public final org.json.JSONObject f12151;

    public xe1(int r1, java.lang.Integer r2, int r3, java.lang.String r4, int r5, java.util.List r6, org.json.JSONObject r7) {
            r0 = this;
            r0.<init>()
            r0.f12145 = r1
            r0.f12146 = r2
            r0.f12147 = r3
            r0.f12148 = r4
            r0.f12149 = r5
            r0.f12150 = r6
            r0.f12151 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4c
        L3:
            boolean r0 = r3 instanceof p000.xe1
            if (r0 != 0) goto L8
            goto L4a
        L8:
            xe1 r3 = (p000.xe1) r3
            int r0 = r2.f12145
            int r1 = r3.f12145
            if (r0 == r1) goto L11
            goto L4a
        L11:
            java.lang.Integer r0 = r2.f12146
            java.lang.Integer r1 = r3.f12146
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L4a
        L1c:
            int r0 = r2.f12147
            int r1 = r3.f12147
            if (r0 == r1) goto L23
            goto L4a
        L23:
            java.lang.String r0 = r2.f12148
            java.lang.String r1 = r3.f12148
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2e
            goto L4a
        L2e:
            int r0 = r2.f12149
            int r1 = r3.f12149
            if (r0 == r1) goto L35
            goto L4a
        L35:
            java.util.List r0 = r2.f12150
            java.util.List r1 = r3.f12150
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            goto L4a
        L40:
            org.json.JSONObject r2 = r2.f12151
            org.json.JSONObject r3 = r3.f12151
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4c
        L4a:
            r2 = 0
            return r2
        L4c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f12145
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.f12146
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f12147
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f12148
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f12149
            int r0 = p000.a12.m14(r3, r0, r1)
            java.util.List r3 = r4.f12150
            int r0 = p000.a12.m16(r3, r0, r1)
            org.json.JSONObject r4 = r4.f12151
            if (r4 != 0) goto L39
            goto L3d
        L39:
            int r2 = r4.hashCode()
        L3d:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FoodCatalogResult(bridgeCode="
            r0.<init>(r1)
            int r1 = r5.f12145
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r5.f12146
            r0.append(r1)
            java.lang.String r1 = ", statusCode="
            r0.append(r1)
            java.lang.String r1 = ", statusMessage="
            java.lang.String r2 = ", rawFoodCount="
            int r3 = r5.f12147
            java.lang.String r4 = r5.f12148
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            int r1 = r5.f12149
            r0.append(r1)
            java.lang.String r1 = ", foods="
            r0.append(r1)
            java.util.List r1 = r5.f12150
            r0.append(r1)
            java.lang.String r1 = ", feedInfo="
            r0.append(r1)
            org.json.JSONObject r5 = r5.f12151
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6629() {
            r4 = this;
            int r0 = r4.f12145
            r1 = 1
            if (r0 != r1) goto L21
            xm0 r0 = new xm0
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 299(0x12b, float:4.19E-43)
            r0.<init>(r2, r3, r1)
            java.lang.Integer r2 = r4.f12146
            if (r2 == 0) goto L21
            int r2 = r2.intValue()
            boolean r0 = r0.m6684(r2)
            if (r0 == 0) goto L21
            int r4 = r4.f12147
            if (r4 != 0) goto L21
            return r1
        L21:
            r4 = 0
            return r4
    }
}
