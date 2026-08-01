package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛸᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0583 extends xhss.AbstractC0121 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final xhss.C0909 f2032 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0121 f2033;

    static {
            xhss.ᲀᲇᛱᛴ r0 = new xhss.ᲀᲇᛱᛴ
            r0.<init>()
            xhss.C0583.f2032 = r0
            return
    }

    public C0583(xhss.AbstractC0121 r1) {
            r0 = this;
            r0.<init>()
            r0.f2033 = r1
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r3) {
            r2 = this;
            xhss.ᛲᛱᛶᛴ r2 = r2.f2033
            java.lang.Object r2 = r2.mo119(r3)
            java.util.Date r2 = (java.util.Date) r2
            if (r2 == 0) goto L14
            java.sql.Timestamp r3 = new java.sql.Timestamp
            long r0 = r2.getTime()
            r3.<init>(r0)
            return r3
        L14:
            r2 = 0
            return r2
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.sql.Timestamp r2 = (java.sql.Timestamp) r2
            xhss.ᛲᛱᛶᛴ r0 = r0.f2033
            r0.mo120(r1, r2)
            return
    }
}
