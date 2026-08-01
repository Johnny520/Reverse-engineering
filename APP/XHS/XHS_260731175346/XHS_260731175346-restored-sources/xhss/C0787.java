package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛷᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0787 extends xhss.AbstractC0052 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0787 f2571 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.math.BigDecimal f2572;

    static {
            xhss.ᛸᛷᲈᛶ r0 = new xhss.ᛸᛷᲈᛶ
            r1 = 0
            r0.<init>(r1)
            xhss.C0787.f2571 = r0
            return
    }

    public C0787(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r1.f2572 = r0
            return
    }

    public C0787(java.math.BigDecimal r1) {
            r0 = this;
            r0.<init>()
            r0.f2572 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof xhss.C0787
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r4 instanceof xhss.C1192
            if (r1 != 0) goto Le
            return r2
        Le:
            xhss.ᛱᛶᛶᛱ r4 = (xhss.AbstractC0052) r4
            xhss.ᛸᛷᲈᛶ r4 = r4.mo169()
            xhss.ᛸᛷᲈᛶ r1 = xhss.C0787.f2571
            if (r4 != r1) goto L19
            return r2
        L19:
            java.math.BigDecimal r3 = r3.f2572
            java.math.BigDecimal r4 = r4.f2572
            int r3 = r3.compareTo(r4)
            if (r3 != 0) goto L24
            return r0
        L24:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.math.BigDecimal r0 = r0.f2572
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final xhss.C1192 mo166() {
            r2 = this;
            xhss.ᲈᲇᛱᛶ r0 = new xhss.ᲈᲇᛱᛶ
            java.math.BigDecimal r2 = r2.f2572
            java.lang.String r2 = r2.toString()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final java.lang.Class mo167(xhss.C1180 r1) {
            r0 = this;
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final xhss.C0787 mo169() {
            r0 = this;
            return r0
    }
}
