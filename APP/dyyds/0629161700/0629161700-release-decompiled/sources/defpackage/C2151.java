package defpackage;

/* JADX INFO: renamed from: ᲇᲇᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2151 extends defpackage.AbstractC0638 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.Serializable f9138;

    public C2151(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f9138 = r1
            return
    }

    public C2151(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            r0.f9138 = r1
            return
    }

    public C2151(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f9138 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static boolean m3563(defpackage.C2151 r1) {
            java.io.Serializable r1 = r1.f9138
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
            java.lang.Class<ᲇᲇᛸᛸ> r0 = defpackage.C2151.class
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L10
            goto Lc4
        L10:
            ᲇᲇᛸᛸ r4 = (defpackage.C2151) r4
            java.io.Serializable r0 = r4.f9138
            boolean r1 = m3563(r3)
            java.io.Serializable r2 = r3.f9138
            if (r1 == 0) goto L4e
            boolean r1 = m3563(r4)
            if (r1 == 0) goto L4e
            boolean r1 = r2 instanceof java.math.BigInteger
            if (r1 != 0) goto L41
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L2b
            goto L41
        L2b:
            java.lang.Number r3 = r3.m3564()
            long r0 = r3.longValue()
            java.lang.Number r3 = r4.m3564()
            long r3 = r3.longValue()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lc4
            goto Lbd
        L41:
            java.math.BigInteger r3 = r3.m3565()
            java.math.BigInteger r4 = r4.m3565()
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
            java.lang.String r3 = r3.mo1474()
            java.math.BigDecimal r2 = defpackage.AbstractC2279.m3696(r3)
        L6d:
            boolean r3 = r0 instanceof java.math.BigDecimal
            if (r3 == 0) goto L74
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            goto L7c
        L74:
            java.lang.String r3 = r4.mo1474()
            java.math.BigDecimal r0 = defpackage.AbstractC2279.m3696(r3)
        L7c:
            int r3 = r2.compareTo(r0)
            if (r3 != 0) goto Lc4
            goto Lbd
        L83:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L90
            java.lang.Number r3 = r3.m3564()
            double r1 = r3.doubleValue()
            goto L98
        L90:
            java.lang.String r3 = r3.mo1474()
            double r1 = java.lang.Double.parseDouble(r3)
        L98:
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto La5
            java.lang.Number r3 = r4.m3564()
            double r3 = r3.doubleValue()
            goto Lad
        La5:
            java.lang.String r3 = r4.mo1474()
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
            boolean r0 = m3563(r4)
            r1 = 32
            if (r0 == 0) goto L15
            java.lang.Number r4 = r4.m3564()
            long r2 = r4.longValue()
        L10:
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r4 = (int) r0
            return r4
        L15:
            java.io.Serializable r0 = r4.f9138
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L28
            java.lang.Number r4 = r4.m3564()
            double r2 = r4.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            goto L10
        L28:
            int r4 = r0.hashCode()
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Number m3564() {
            r1 = this;
            java.io.Serializable r1 = r1.f9138
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L9
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        L9:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L15
            ᛷᛲᛳᛷ r0 = new ᛷᛲᛳᛷ
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Primitive is neither a number nor a string"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.AbstractC0638
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.String mo1474() {
            r3 = this;
            java.io.Serializable r0 = r3.f9138
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L9:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L16
            java.lang.Number r3 = r3.m3564()
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.math.BigInteger m3565() {
            r2 = this;
            java.io.Serializable r0 = r2.f9138
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L9
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L9:
            boolean r0 = m3563(r2)
            if (r0 == 0) goto L1c
            java.lang.Number r2 = r2.m3564()
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
        L1c:
            java.lang.String r2 = r2.mo1474()
            defpackage.AbstractC2279.m3700(r2)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            return r0
    }
}
