package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛴᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0655 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0023 f2250;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f2251;

    public C0655(java.lang.String r1, xhss.C0023 r2) {
            r0 = this;
            r0.<init>()
            r0.f2251 = r1
            r0.f2250 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof xhss.C0655
            if (r0 != 0) goto L8
            goto L1f
        L8:
            xhss.ᛷᛴᲇᲀ r3 = (xhss.C0655) r3
            java.lang.String r0 = r2.f2251
            java.lang.String r1 = r3.f2251
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            xhss.ᛱᛲᲇᲀ r2 = r2.f2250
            xhss.ᛱᛲᲇᲀ r3 = r3.f2250
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f2251
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xhss.ᛱᛲᲇᲀ r1 = r1.f2250
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MatchGroup(value="
            r0.<init>(r1)
            java.lang.String r1 = r2.f2251
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            xhss.ᛱᛲᲇᲀ r2 = r2.f2250
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
