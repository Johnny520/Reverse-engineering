package a;

/* JADX INFO: loaded from: classes.dex */
public final class M6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f173a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.util.List<java.util.List<byte[]>> d;
    public final java.lang.String e;

    public M6(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List<java.util.List<byte[]>> r4) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.f173a = r1
            r2.getClass()
            r0.b = r2
            r0.c = r3
            r4.getClass()
            r0.d = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r0.e = r1
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.f173a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.c
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L33:
            java.util.List<java.util.List<byte[]>> r3 = r6.d
            int r4 = r3.size()
            if (r2 >= r4) goto L6f
            java.lang.String r4 = " ["
            r0.append(r4)
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L47:
            int r5 = r3.size()
            if (r4 >= r5) goto L67
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L47
        L67:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L33
        L6f:
            java.lang.String r1 = "}mCertificatesArray: 0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
