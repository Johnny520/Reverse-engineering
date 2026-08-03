package e3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f2347d;

    public c(java.lang.String r1, java.util.List r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.f2344a = r1
            r3.getClass()
            r0.f2345b = r3
            r0.f2346c = r4
            r2.getClass()
            r0.f2347d = r2
            java.lang.String r2 = "-"
            bc.e.v(r1, r2, r3, r2, r4)
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.f2344a
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f2345b
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f2346c
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L33:
            java.util.List r3 = r6.f2347d
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
