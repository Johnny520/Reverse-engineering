package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0445 implements java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0445 f1583;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0445 f1584;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0445 f1585;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public java.lang.Object f1586;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final boolean f1587;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f1588;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.Object f1589;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0445 f1590;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0445 f1591;

    public C0445(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1589 = r0
            r1.f1587 = r2
            r1.f1591 = r1
            r1.f1585 = r1
            return
    }

    public C0445(boolean r1, xhss.C0445 r2, java.lang.Object r3, xhss.C0445 r4, xhss.C0445 r5) {
            r0 = this;
            r0.<init>()
            r0.f1583 = r2
            r0.f1589 = r3
            r0.f1587 = r1
            r1 = 1
            r0.f1588 = r1
            r0.f1585 = r4
            r0.f1591 = r5
            r5.f1585 = r0
            r4.f1591 = r0
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f1589
            if (r0 != 0) goto L12
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L33
            goto L1c
        L12:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L33
        L1c:
            java.lang.Object r3 = r3.f1586
            if (r3 != 0) goto L27
            java.lang.Object r3 = r4.getValue()
            if (r3 != 0) goto L33
            goto L31
        L27:
            java.lang.Object r4 = r4.getValue()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            return r3
        L33:
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.f1589
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f1586
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f1589
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            java.lang.Object r2 = r2.f1586
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r0 = r2.hashCode()
        L14:
            r2 = r1 ^ r0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Le
            boolean r0 = r1.f1587
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.lang.String r1 = "value == null"
            xhss.C0532.m953(r1)
            r1 = 0
            return r1
        Le:
            java.lang.Object r0 = r1.f1586
            r1.f1586 = r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f1589
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.f1586
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
