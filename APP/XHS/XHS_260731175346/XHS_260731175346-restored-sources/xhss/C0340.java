package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛲᛷᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.String f1265;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.util.List f1266;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.lang.String f1267;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0340
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛴᛲᛷᛸ r5 = (xhss.C0340) r5
            java.lang.String r1 = r4.f1267
            java.lang.String r3 = r5.f1267
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f1265
            java.lang.String r3 = r5.f1265
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.util.List r4 = r4.f1266
            java.util.List r5 = r5.f1266
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f1267
            java.lang.String r1 = r2.f1265
            java.util.List r2 = r2.f1266
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = java.util.Objects.hash(r2)
            return r2
    }
}
