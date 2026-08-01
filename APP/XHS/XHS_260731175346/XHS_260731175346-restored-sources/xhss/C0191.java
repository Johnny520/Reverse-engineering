package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛷᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0191 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.C0191 f748 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.AbstractC0485 f749;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.Set f750;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            xhss.ᛲᛷᲀᲇ r1 = new xhss.ᛲᛷᲀᲇ
            java.util.Set r0 = xhss.AbstractC0713.m1245(r0)
            r2 = 0
            r1.<init>(r0, r2)
            xhss.C0191.f748 = r1
            return
    }

    public C0191(java.util.Set r1, xhss.AbstractC0485 r2) {
            r0 = this;
            r0.<init>()
            r0.f750 = r1
            r0.f749 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof xhss.C0191
            if (r0 == 0) goto L1c
            xhss.ᛲᛷᲀᲇ r3 = (xhss.C0191) r3
            java.util.Set r0 = r3.f750
            java.util.Set r1 = r2.f750
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            xhss.ᛵᛶᲀᲇ r3 = r3.f749
            xhss.ᛵᛶᲀᲇ r2 = r2.f749
            boolean r2 = xhss.AbstractC0007.m97(r3, r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.f750
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            xhss.ᛵᛶᲀᲇ r1 = r1.f749
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }
}
