package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᛷᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0190 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0080 f745;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Throwable f746;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC0080 f747;

    public /* synthetic */ C0190(xhss.InterfaceC0080 r2, java.lang.Throwable r3, int r4) {
            r1 = this;
            r4 = r4 & 4
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.<init>(r2, r0, r3)
            return
    }

    public C0190(xhss.InterfaceC0080 r1, xhss.C0280 r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.f747 = r1
            r0.f745 = r2
            r0.f746 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof xhss.C0190
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xhss.ᛲᛷᛷᛵ r5 = (xhss.C0190) r5
            xhss.ᛱᛸᲁᛶ r1 = r4.f747
            xhss.ᛱᛸᲁᛶ r3 = r5.f747
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            xhss.ᛱᛸᲁᛶ r1 = r4.f745
            xhss.ᛱᛸᲁᛶ r3 = r5.f745
            boolean r1 = xhss.AbstractC0007.m97(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Throwable r4 = r4.f746
            java.lang.Throwable r5 = r5.f746
            boolean r4 = xhss.AbstractC0007.m97(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            xhss.ᛱᛸᲁᛶ r0 = r3.f747
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            xhss.ᛱᛸᲁᛶ r2 = r3.f745
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r3 = r3.f746
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectResult(plan="
            r0.<init>(r1)
            xhss.ᛱᛸᲁᛶ r1 = r2.f747
            r0.append(r1)
            java.lang.String r1 = ", nextPlan="
            r0.append(r1)
            xhss.ᛱᛸᲁᛶ r1 = r2.f745
            r0.append(r1)
            java.lang.String r1 = ", throwable="
            r0.append(r1)
            java.lang.Throwable r2 = r2.f746
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
