package xhss;

/* JADX INFO: renamed from: xhss.ᲁᛳᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0933 extends xhss.AbstractC0052 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Boolean f3020;

    public C0933(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.toString()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f3020 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof xhss.C0933
            if (r0 != 0) goto L8
            goto L14
        L8:
            xhss.ᲁᛳᛲᛸ r2 = (xhss.C0933) r2
            java.lang.Boolean r1 = r1.f3020
            java.lang.Boolean r2 = r2.f3020
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Boolean r0 = r0.f3020
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.C0933 mo164() {
            r0 = this;
            return r0
    }

    @Override // xhss.AbstractC0052
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ */
    public final java.lang.Class mo167(xhss.C1180 r1) {
            r0 = this;
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            return r0
    }
}
