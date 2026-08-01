package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1944 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final long f8459;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Long f8460;

    public C1944(long r1, java.lang.Long r3) {
            r0 = this;
            r0.<init>()
            r0.f8459 = r1
            r0.f8460 = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.C1944
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᲁᲇᛵᛵ r8 = (defpackage.C1944) r8
            long r3 = r7.f8459
            long r5 = r8.f8459
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.Long r7 = r7.f8460
            java.lang.Long r8 = r8.f8460
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r8)
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f8459
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Long r2 = r2.f8460
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            int r2 = r2.hashCode()
        L12:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -337932606414382(0xfffecca6ef0961d2, double:NaN)
            java.lang.String r1 = "FansCountMockTextState(originalValue="
            r0.<init>(r1)
            long r1 = r3.f8459
            r0.append(r1)
            r1 = -338095815171630(0xfffecc80ef0961d2, double:NaN)
            java.lang.String r1 = ", mockValue="
            r0.append(r1)
            java.lang.Long r3 = r3.f8460
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
