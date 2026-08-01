package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲁᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0593 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.Serializable f2052;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0093 f2053;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f2054;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0591 f2055;

    public native C0593(java.lang.String r1, java.io.Serializable r2, xhss.C0093 r3, xhss.C0591 r4);

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0593
            r2 = 0
            if (r1 != 0) goto La
            goto L21
        La:
            xhss.ᛶᲁᛱᛴ r5 = (xhss.C0593) r5
            java.lang.String r1 = r4.f2054
            java.lang.String r3 = r5.f2054
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L21
        L17:
            java.io.Serializable r1 = r4.f2052
            java.io.Serializable r3 = r5.f2052
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L22
        L21:
            return r2
        L22:
            xhss.ᛱᲀᲇᛸ r1 = r4.f2053
            xhss.ᛱᲀᲇᛸ r3 = r5.f2053
            if (r1 == r3) goto L29
            return r2
        L29:
            xhss.ᛶᲀᲀᛵ r4 = r4.f2055
            xhss.ᛶᲀᲀᛵ r5 = r5.f2055
            if (r4 == r5) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f2054
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.io.Serializable r1 = r2.f2052
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xhss.ᛱᲀᲇᛸ r0 = r2.f2053
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            xhss.ᛶᲀᲀᛵ r2 = r2.f2055
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -247485067266117(0xffff1ee9e47a77bb, double:NaN)
            java.lang.String r1 = "ConfigEntry(key="
            r0.<init>(r1)
            java.lang.String r1 = r3.f2054
            r0.append(r1)
            r1 = -247558081710149(0xffff1ed8e47a77bb, double:NaN)
            java.lang.String r1 = ", defaultValue="
            r0.append(r1)
            java.io.Serializable r1 = r3.f2052
            r0.append(r1)
            r1 = -247626801186885(0xffff1ec8e47a77bb, double:NaN)
            java.lang.String r1 = ", getValue="
            r0.append(r1)
            xhss.ᛱᲀᲇᛸ r1 = r3.f2053
            r0.append(r1)
            r1 = -247678340794437(0xffff1ebce47a77bb, double:NaN)
            java.lang.String r1 = ", setValue="
            r0.append(r1)
            xhss.ᛶᲀᲀᛵ r3 = r3.f2055
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
