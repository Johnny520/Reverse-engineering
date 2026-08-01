package defpackage;

/* JADX INFO: renamed from: ᛱᲇᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0208 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f1308;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.net.Uri f1309;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f1310;

    public C0208(android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r0 = -499526455959086(0xfffe39aeef0961d2, double:NaN)
            r0 = -499560815697454(0xfffe39a6ef0961d2, double:NaN)
            r0 = -499599470403118(0xfffe399def0961d2, double:NaN)
            r2.<init>()
            r2.f1309 = r3
            r2.f1310 = r4
            r2.f1308 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.C0208
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ᛱᲇᲈᛵ r3 = (defpackage.C0208) r3
            android.net.Uri r0 = r2.f1309
            android.net.Uri r1 = r3.f1309
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f1310
            java.lang.String r1 = r3.f1310
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.String r2 = r2.f1308
            java.lang.String r3 = r3.f1308
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.net.Uri r0 = r3.f1309
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1310
            int r0 = defpackage.AbstractC1124.m2153(r2, r0, r1)
            java.lang.String r3 = r3.f1308
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -499784153996846(0xfffe3972ef0961d2, double:NaN)
            java.lang.String r1 = "SavePathMapping(treeUri="
            r0.<init>(r1)
            android.net.Uri r1 = r4.f1309
            r0.append(r1)
            r1 = -499891528179246(0xfffe3959ef0961d2, double:NaN)
            java.lang.String r1 = ", rootPath="
            r0.append(r1)
            java.lang.String r1 = r4.f1310
            r2 = -499943067786798(0xfffe394def0961d2, double:NaN)
            r0.append(r1); r0.append(", relativePath=")
            java.lang.String r4 = r4.f1308
            r1 = 41
            java.lang.String r4 = defpackage.AbstractC0225.m823(r0, r4, r1)
            return r4
    }
}
