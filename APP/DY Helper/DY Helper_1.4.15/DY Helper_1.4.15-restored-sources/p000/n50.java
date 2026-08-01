package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n50 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7389;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7390;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7391;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f7392;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7393;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f7394;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f7395;

    public n50(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.f7389 = r1
            r2.getClass()
            r0.f7390 = r2
            r0.f7391 = r3
            r4.getClass()
            r0.f7392 = r4
            r0.f7393 = r5
            r0.f7394 = r6
            java.lang.String r4 = "-"
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4138(r1, r4, r2, r4, r3)
            r1.append(r4)
            r1.append(r5)
            r1.append(r4)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.f7395 = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.f7389
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f7390
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f7391
            r1.append(r2)
            java.lang.String r2 = ", mSystemFont: "
            r1.append(r2)
            java.lang.String r2 = r6.f7393
            r1.append(r2)
            java.lang.String r2 = ", mVariationSettings: "
            r1.append(r2)
            java.lang.String r2 = r6.f7394
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L47:
            java.util.List r3 = r6.f7392
            int r4 = r3.size()
            if (r2 >= r4) goto L83
            java.lang.String r4 = " ["
            r0.append(r4)
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L5b:
            int r5 = r3.size()
            if (r4 >= r5) goto L7b
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L5b
        L7b:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L47
        L83:
            java.lang.String r6 = "}mCertificatesArray: 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
