package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛷᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0382 extends java.lang.Number {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f1376;

    public C0382(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f1376 = r1
            return
    }

    @Override // java.lang.Number
    public final double doubleValue() {
            r2 = this;
            java.lang.String r2 = r2.f1376
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof xhss.C0382
            if (r0 == 0) goto L13
            xhss.ᛴᛷᛴᲇ r2 = (xhss.C0382) r2
            java.lang.String r1 = r1.f1376
            java.lang.String r2 = r2.f1376
            boolean r1 = r1.equals(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // java.lang.Number
    public final float floatValue() {
            r0 = this;
            java.lang.String r0 = r0.f1376
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f1376
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public final int intValue() {
            r2 = this;
            java.lang.String r2 = r2.f1376
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r2
        L7:
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Ld
            int r2 = (int) r0
            return r2
        Ld:
            java.math.BigDecimal r2 = xhss.AbstractC1178.m1867(r2)
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.lang.Number
    public final long longValue() {
            r2 = this;
            java.lang.String r2 = r2.f1376
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r2 = xhss.AbstractC1178.m1867(r2)
            long r0 = r2.longValue()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f1376
            return r0
    }
}
