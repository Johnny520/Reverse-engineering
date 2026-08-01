package defpackage;

/* JADX INFO: renamed from: ᛷᛲᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1222 extends java.lang.Number {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f5478;

    public C1222(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f5478 = r1
            return
    }

    @Override // java.lang.Number
    public final double doubleValue() {
            r2 = this;
            java.lang.String r2 = r2.f5478
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.C1222
            if (r0 == 0) goto L13
            ᛷᛲᛳᛷ r2 = (defpackage.C1222) r2
            java.lang.String r1 = r1.f5478
            java.lang.String r2 = r2.f5478
            boolean r1 = r1.equals(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // java.lang.Number
    public final float floatValue() {
            r0 = this;
            java.lang.String r0 = r0.f5478
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f5478
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public final int intValue() {
            r2 = this;
            java.lang.String r2 = r2.f5478
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r2
        L7:
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Ld
            int r2 = (int) r0
            return r2
        Ld:
            java.math.BigDecimal r2 = defpackage.AbstractC2279.m3696(r2)
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.lang.Number
    public final long longValue() {
            r2 = this;
            java.lang.String r2 = r2.f5478
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r2 = defpackage.AbstractC2279.m3696(r2)
            long r0 = r2.longValue()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f5478
            return r0
    }
}
