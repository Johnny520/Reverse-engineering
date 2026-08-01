package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0697 implements java.io.Serializable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f2352;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f2353;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f2354;

    public C0697(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f2352 = r1
            r0.f2353 = r3
            r0.f2354 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof xhss.C0697
            if (r0 != 0) goto L8
            goto L2a
        L8:
            xhss.ᛷᛸᲈᛸ r3 = (xhss.C0697) r3
            java.lang.Object r0 = r2.f2352
            java.lang.Object r1 = r3.f2352
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.Object r0 = r2.f2353
            java.lang.Object r1 = r3.f2353
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.lang.Object r2 = r2.f2354
            java.lang.Object r3 = r3.f2354
            boolean r2 = xhss.AbstractC0007.m97(r2, r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f2352
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.Object r2 = r3.f2353
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r3 = r3.f2354
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r3.f2352
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r2 = r3.f2353
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.f2354
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
