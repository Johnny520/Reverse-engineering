package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0147 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f619;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f620;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean f621;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final byte[] f622;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0147 f623;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f624;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public xhss.C0147 f625;

    public C0147() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.f622 = r0
            r0 = 1
            r1.f621 = r0
            r0 = 0
            r1.f624 = r0
            return
    }

    public C0147(byte[] r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f622 = r1
            r0.f619 = r2
            r0.f620 = r3
            r0.f624 = r4
            r1 = 0
            r0.f621 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m389(xhss.C0147 r2) {
            r1 = this;
            r2.f623 = r1
            xhss.ᛲᛳᲁᛳ r0 = r1.f625
            r2.f625 = r0
            xhss.ᛲᛳᲁᛳ r0 = r1.f625
            r0.f623 = r2
            r1.f625 = r2
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0147 m390() {
            r4 = this;
            r0 = 1
            r4.f624 = r0
            xhss.ᛲᛳᲁᛳ r1 = new xhss.ᛲᛳᲁᛳ
            int r2 = r4.f619
            int r3 = r4.f620
            byte[] r4 = r4.f622
            r1.<init>(r4, r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0147 m391() {
            r4 = this;
            xhss.ᛲᛳᲁᛳ r0 = r4.f625
            r1 = 0
            if (r0 == r4) goto L7
            r2 = r0
            goto L8
        L7:
            r2 = r1
        L8:
            xhss.ᛲᛳᲁᛳ r3 = r4.f623
            r3.f625 = r0
            xhss.ᛲᛳᲁᛳ r0 = r4.f625
            r0.f623 = r3
            r4.f625 = r1
            r4.f623 = r1
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m392(xhss.C0147 r6, int r7) {
            r5 = this;
            byte[] r0 = r6.f622
            boolean r1 = r6.f621
            if (r1 == 0) goto L46
            int r1 = r6.f620
            int r2 = r1 + r7
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L31
            boolean r4 = r6.f624
            if (r4 != 0) goto L2b
            int r4 = r6.f619
            int r2 = r2 - r4
            if (r2 > r3) goto L25
            xhss.AbstractC0193.m452(r0, r0, r4, r1)
            int r1 = r6.f620
            int r2 = r6.f619
            int r1 = r1 - r2
            r6.f620 = r1
            r2 = 0
            r6.f619 = r2
            goto L31
        L25:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L2b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L31:
            int r2 = r5.f619
            int r3 = r2 + r7
            int r3 = r3 - r2
            byte[] r4 = r5.f622
            java.lang.System.arraycopy(r4, r2, r0, r1, r3)
            int r0 = r6.f620
            int r0 = r0 + r7
            r6.f620 = r0
            int r6 = r5.f619
            int r6 = r6 + r7
            r5.f619 = r6
            return
        L46:
            java.lang.String r5 = "only owner can write"
            xhss.C0532.m950(r5)
            return
    }
}
