package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛳᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0138 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0410 f604;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static void m368(xhss.C0138 r3, java.lang.String r4) {
            xhss.ᛴᲁᛶᲁ r0 = r3.f604
            if (r0 != 0) goto L9
            xhss.ᛴᲁᛶᲁ r0 = new xhss.ᛴᲁᛶᲁ
            r0.<init>()
        L9:
            r3.f604 = r0
            xhss.ᛳᛲᛶᛶ r3 = new xhss.ᛳᛲᛶᛶ
            r1 = 5
            r2 = 0
            r3.<init>(r4, r1, r2)
            r0.f1457 = r3
            return
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public final void m369(java.lang.String r4) {
            r3 = this;
            xhss.ᛴᲁᛶᲁ r0 = r3.f604
            if (r0 != 0) goto L9
            xhss.ᛴᲁᛶᲁ r0 = new xhss.ᛴᲁᛶᲁ
            r0.<init>()
        L9:
            r3.f604 = r0
            xhss.ᛵᛴᛳᛶ r3 = new xhss.ᛵᛴᛳᛶ
            r3.<init>()
            r1 = 5
            r2 = 0
            r3.m847(r4, r1, r2)
            r0.f1454 = r3
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r3) {
            r2 = this;
            xhss.ᛴᲁᛶᲁ r2 = r2.f604
            r0 = 0
            if (r2 == 0) goto L1c
            int r2 = r2.mo135(r3)
            r1 = 2
            r3.m258(r1)
            r3.m253(r0, r2)
            r2 = 1
            r3.m251(r2, r0)
            int r2 = r3.m257()
            r3.m259(r2)
            return r2
        L1c:
            java.lang.String r2 = "UsingFieldMatcher matcher not set"
            xhss.C0532.m959(r2)
            return r0
    }
}
