package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛱᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0622 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2141;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f2142;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.String f2143;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f2144;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.String f2145;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.List f2146;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final java.lang.String f2147;

    public C0622(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.f2144 = r1
            r2.getClass()
            r0.f2141 = r2
            r0.f2142 = r3
            r4.getClass()
            r0.f2146 = r4
            r0.f2143 = r5
            r0.f2147 = r6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            r4.append(r1)
            r4.append(r5)
            if (r6 == 0) goto L50
            int r1 = r6.length()
            r2 = 0
        L38:
            if (r2 >= r1) goto L50
            int r3 = r6.codePointAt(r2)
            boolean r5 = java.lang.Character.isWhitespace(r3)
            if (r5 != 0) goto L4a
            java.lang.String r1 = "-VF"
            r4.append(r1)
            goto L50
        L4a:
            int r3 = java.lang.Character.charCount(r3)
            int r2 = r2 + r3
            goto L38
        L50:
            java.lang.String r1 = r4.toString()
            r0.f2145 = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.f2144
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f2141
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f2142
            r1.append(r2)
            java.lang.String r2 = ", mSystemFont: "
            r1.append(r2)
            java.lang.String r2 = r6.f2143
            r1.append(r2)
            java.lang.String r2 = ", mVariationSettings: "
            r1.append(r2)
            java.lang.String r2 = r6.f2147
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L44:
            java.util.List r3 = r6.f2146
            int r4 = r3.size()
            if (r2 >= r4) goto L80
            java.lang.String r4 = " ["
            r0.append(r4)
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L58:
            int r5 = r3.size()
            if (r4 >= r5) goto L78
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L58
        L78:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L44
        L80:
            java.lang.String r6 = "}mCertificatesArray: 0"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
