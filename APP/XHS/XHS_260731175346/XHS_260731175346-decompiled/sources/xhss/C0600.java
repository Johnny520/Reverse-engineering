package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0600 extends xhss.AbstractC0495 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.io.Serializable f2076;

    public C0600(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f2076 = r1
            return
    }

    public C0600(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            r0.f2076 = r1
            return
    }

    public C0600(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f2076 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static boolean m1054(xhss.C0600 r1) {
            java.io.Serializable r1 = r1.f2076
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.lang.Number r1 = (java.lang.Number) r1
            boolean r0 = r1 instanceof java.math.BigInteger
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L1c
            boolean r1 = r1 instanceof java.lang.Byte
            if (r1 == 0) goto L1e
        L1c:
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            goto Lbd
        L4:
            if (r4 == 0) goto Lc4
            java.lang.Class<xhss.ᛶᲇᛴ> r0 = xhss.C0600.class
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L10
            goto Lc4
        L10:
            xhss.ᛶᲇᛴ r4 = (xhss.C0600) r4
            java.io.Serializable r0 = r4.f2076
            boolean r1 = m1054(r3)
            java.io.Serializable r2 = r3.f2076
            if (r1 == 0) goto L4e
            boolean r1 = m1054(r4)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof java.math.BigInteger
            if (r1 != 0) goto L41
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L2b
            goto L41
        L2b:
            java.lang.Number r3 = r3.m1055()
            long r0 = r3.longValue()
            java.lang.Number r3 = r4.m1055()
            long r3 = r3.longValue()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lc4
            goto Lbd
        L41:
            java.math.BigInteger r3 = r3.m1056()
            java.math.BigInteger r4 = r4.m1056()
            boolean r3 = r3.equals(r4)
            return r3
        L4e:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto Lbf
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lbf
            boolean r1 = r2 instanceof java.math.BigDecimal
            if (r1 == 0) goto L83
            boolean r1 = r0 instanceof java.math.BigDecimal
            if (r1 == 0) goto L83
            boolean r1 = r2 instanceof java.math.BigDecimal
            if (r1 == 0) goto L65
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            goto L6d
        L65:
            java.lang.String r3 = r3.mo901()
            java.math.BigDecimal r2 = xhss.AbstractC1178.m1867(r3)
        L6d:
            boolean r3 = r0 instanceof java.math.BigDecimal
            if (r3 == 0) goto L74
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            goto L7c
        L74:
            java.lang.String r3 = r4.mo901()
            java.math.BigDecimal r0 = xhss.AbstractC1178.m1867(r3)
        L7c:
            int r3 = r2.compareTo(r0)
            if (r3 != 0) goto Lc4
            goto Lbd
        L83:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L90
            java.lang.Number r3 = r3.m1055()
            double r1 = r3.doubleValue()
            goto L98
        L90:
            java.lang.String r3 = r3.mo901()
            double r1 = java.lang.Double.parseDouble(r3)
        L98:
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto La5
            java.lang.Number r3 = r4.m1055()
            double r3 = r3.doubleValue()
            goto Lad
        La5:
            java.lang.String r3 = r4.mo901()
            double r3 = java.lang.Double.parseDouble(r3)
        Lad:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto Lbd
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto Lc4
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto Lc4
        Lbd:
            r3 = 1
            return r3
        Lbf:
            boolean r3 = r2.equals(r0)
            return r3
        Lc4:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = m1054(r4)
            r1 = 32
            if (r0 == 0) goto L15
            java.lang.Number r4 = r4.m1055()
            long r2 = r4.longValue()
        L10:
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r4 = (int) r0
            return r4
        L15:
            java.io.Serializable r0 = r4.f2076
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L28
            java.lang.Number r4 = r4.m1055()
            double r2 = r4.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            goto L10
        L28:
            int r4 = r0.hashCode()
            return r4
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final long mo900() {
            r2 = this;
            java.io.Serializable r0 = r2.f2076
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = r2.m1055()
            long r0 = r2.longValue()
            return r0
        Lf:
            java.lang.String r2 = r2.mo901()
            long r0 = java.lang.Long.parseLong(r2)
            return r0
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.String mo901() {
            r3 = this;
            java.io.Serializable r0 = r3.f2076
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L9:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L16
            java.lang.Number r3 = r3.m1055()
            java.lang.String r3 = r3.toString()
            return r3
        L16:
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L21
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r3 = r0.toString()
            return r3
        L21:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected value type: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final java.lang.Number m1055() {
            r1 = this;
            java.io.Serializable r1 = r1.f2076
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L9
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        L9:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L15
            xhss.ᛴᛷᛴᲇ r0 = new xhss.ᛴᛷᛴᲇ
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Primitive is neither a number nor a string"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.AbstractC0495
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final int mo902() {
            r1 = this;
            java.io.Serializable r0 = r1.f2076
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = r1.m1055()
            int r1 = r1.intValue()
            return r1
        Lf:
            java.lang.String r1 = r1.mo901()
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.math.BigInteger m1056() {
            r2 = this;
            java.io.Serializable r0 = r2.f2076
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L9
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L9:
            boolean r0 = m1054(r2)
            if (r0 == 0) goto L1c
            java.lang.Number r2 = r2.m1055()
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
        L1c:
            java.lang.String r2 = r2.mo901()
            xhss.AbstractC1178.m1865(r2)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            return r0
    }
}
