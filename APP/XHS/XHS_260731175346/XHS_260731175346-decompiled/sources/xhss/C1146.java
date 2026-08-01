package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛶᛵᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1146 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f3709;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0683 f3710;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f3711;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object[] f3712;

    public C1146(java.lang.String r1, java.lang.String r2, xhss.C0683 r3, java.lang.Object... r4) {
            r0 = this;
            r0.<init>()
            r0.f3711 = r1
            r0.f3709 = r2
            r0.f3710 = r3
            r0.f3712 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof xhss.C1146
            if (r0 != 0) goto L8
            goto L34
        L8:
            xhss.ᲈᛶᛵᛴ r3 = (xhss.C1146) r3
            java.lang.String r0 = r2.f3711
            java.lang.String r1 = r3.f3711
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.f3709
            java.lang.String r1 = r3.f3709
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            xhss.ᛷᛸᛴᛳ r0 = r2.f3710
            xhss.ᛷᛸᛴᛳ r1 = r3.f3710
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            java.lang.Object[] r2 = r2.f3712
            java.lang.Object[] r3 = r3.f3712
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L34
        L32:
            r2 = 1
            return r2
        L34:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3711
            int r0 = r0.hashCode()
            java.lang.String r1 = r3.f3709
            int r1 = r1.hashCode()
            r2 = 8
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            xhss.ᛷᛸᛴᛳ r1 = r3.f3710
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            java.lang.Object[] r3 = r3.f3712
            int r3 = java.util.Arrays.hashCode(r3)
            r1 = 24
            int r3 = java.lang.Integer.rotateLeft(r3, r1)
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object[] r0 = r3.f3712
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f3711
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            java.lang.String r2 = r3.f3709
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            xhss.ᛷᛸᛴᛳ r3 = r3.f3710
            r1.append(r3)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
