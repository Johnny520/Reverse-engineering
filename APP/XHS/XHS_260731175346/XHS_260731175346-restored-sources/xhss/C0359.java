package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛴᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0359 implements java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1322;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f1323;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0359 f1324;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0359 f1325;

    public C0359(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f1322 = r1
            r0.f1323 = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof xhss.C0359
            if (r0 != 0) goto L8
            goto L20
        L8:
            xhss.ᛴᛴᲁᲈ r3 = (xhss.C0359) r3
            java.lang.Object r0 = r2.f1322
            java.lang.Object r1 = r3.f1322
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            java.lang.Object r2 = r2.f1323
            java.lang.Object r3 = r3.f1323
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.f1322
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f1323
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f1322
            int r0 = r0.hashCode()
            java.lang.Object r1 = r1.f1323
            int r1 = r1.hashCode()
            r1 = r1 ^ r0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "An entry modification is not supported"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f1322
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.f1323
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
