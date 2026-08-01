package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0683 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.String f2305;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f2306;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean f2307;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2308;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String f2309;

    public C0683(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f2308 = r1
            r0.f2305 = r2
            r0.f2306 = r3
            r0.f2309 = r4
            r0.f2307 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L34
        L3:
            boolean r0 = r3 instanceof xhss.C0683
            if (r0 != 0) goto L8
            goto L36
        L8:
            xhss.ᛷᛸᛴᛳ r3 = (xhss.C0683) r3
            int r0 = r2.f2308
            int r1 = r3.f2308
            if (r0 != r1) goto L36
            boolean r0 = r2.f2307
            boolean r1 = r3.f2307
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.f2305
            java.lang.String r1 = r3.f2305
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.f2306
            java.lang.String r1 = r3.f2306
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.lang.String r2 = r2.f2309
            java.lang.String r3 = r3.f2309
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L36
        L34:
            r2 = 1
            return r2
        L36:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f2307
            if (r0 == 0) goto L7
            r0 = 64
            goto L8
        L7:
            r0 = 0
        L8:
            int r1 = r3.f2308
            int r1 = r1 + r0
            java.lang.String r0 = r3.f2305
            int r0 = r0.hashCode()
            java.lang.String r2 = r3.f2306
            int r2 = r2.hashCode()
            int r2 = r2 * r0
            java.lang.String r3 = r3.f2309
            int r3 = r3.hashCode()
            int r3 = r3 * r2
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.f2307
            if (r0 == 0) goto L7
            java.lang.String r0 = " itf"
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.f2305
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            java.lang.String r2 = r3.f2306
            r1.append(r2)
            java.lang.String r2 = r3.f2309
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            int r3 = r3.f2308
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }
}
