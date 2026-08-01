package defpackage;

/* JADX INFO: renamed from: ᲁᲇᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1951 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f8485;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.net.Uri f8486;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f8487;

    public C1951(android.net.Uri r3, int r4, int r5) {
            r2 = this;
            r0 = -506686166441518(0xfffe332bef0961d2, double:NaN)
            r2.<init>()
            r2.f8486 = r3
            r2.f8487 = r4
            r2.f8485 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C1951
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲁᲇᲁᲀ r5 = (defpackage.C1951) r5
            android.net.Uri r1 = r4.f8486
            android.net.Uri r3 = r5.f8486
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f8487
            int r3 = r5.f8487
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r4 = r4.f8485
            int r5 = r5.f8485
            if (r4 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            android.net.Uri r0 = r3.f8486
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f8487
            int r0 = defpackage.AbstractC0225.m820(r2, r0, r1)
            int r3 = r3.f8485
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -506720526179886(0xfffe3323ef0961d2, double:NaN)
            java.lang.String r1 = "ExportResult(uri="
            r0.<init>(r1)
            android.net.Uri r1 = r4.f8486
            r0.append(r1)
            r1 = -506797835591214(0xfffe3311ef0961d2, double:NaN)
            java.lang.String r1 = ", itemCount="
            r0.append(r1)
            int r1 = r4.f8487
            r2 = -506853670166062(0xfffe3304ef0961d2, double:NaN)
            r0.append(r1); r0.append(", categoryCount=")
            int r4 = r4.f8485
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
