package defpackage;

/* JADX INFO: renamed from: ᲇᛵᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2047 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final long f8816;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final long f8817;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f8818;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8819;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long f8820;

    public C2047(java.lang.String r3, long r4, long r6, long r8, long r10) {
            r2 = this;
            r0 = -1155226228137518(0xfffbe553ef0961d2, double:NaN)
            r2.<init>()
            r2.f8819 = r3
            r2.f8820 = r4
            r2.f8818 = r6
            r2.f8817 = r8
            r2.f8816 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3a
        L3:
            boolean r0 = r5 instanceof defpackage.C2047
            if (r0 != 0) goto L8
            goto L38
        L8:
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5
            java.lang.String r0 = r4.f8819
            java.lang.String r1 = r5.f8819
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            long r0 = r4.f8820
            long r2 = r5.f8820
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L38
        L1e:
            long r0 = r4.f8818
            long r2 = r5.f8818
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L38
        L27:
            long r0 = r4.f8817
            long r2 = r5.f8817
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            goto L38
        L30:
            long r0 = r4.f8816
            long r4 = r5.f8816
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 == 0) goto L3a
        L38:
            r4 = 0
            return r4
        L3a:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f8819
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r4.f8820
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f8818
            int r0 = java.lang.Long.hashCode(r2)
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r4.f8817
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f8816
            int r4 = java.lang.Long.hashCode(r2)
            int r4 = r4 + r1
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -1155269177810478(0xfffbe549ef0961d2, double:NaN)
            java.lang.String r1 = "Box(type="
            r0.<init>(r1)
            java.lang.String r1 = r4.f8819
            r2 = -1155312127483438(0xfffbe53fef0961d2, double:NaN)
            r0.append(r1); r0.append(", start=")
            long r1 = r4.f8820
            r0.append(r1)
            r1 = -1155350782189102(0xfffbe536ef0961d2, double:NaN)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r4.f8818
            r0.append(r1)
            r1 = -1155385141927470(0xfffbe52eef0961d2, double:NaN)
            java.lang.String r1 = ", dataStart="
            r0.append(r1)
            long r1 = r4.f8817
            r0.append(r1)
            r1 = -1155440976502318(0xfffbe521ef0961d2, double:NaN)
            java.lang.String r1 = ", end="
            r0.append(r1)
            long r1 = r4.f8816
            r0.append(r1)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
