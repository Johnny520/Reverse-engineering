package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0802 extends xhss.AbstractC0602 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2617;

    public /* synthetic */ C0802(java.lang.Class r1, int r2) {
            r0 = this;
            r0.f2617 = r2
            r0.<init>(r1)
            return
    }

    @Override // xhss.AbstractC0602
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final java.util.Date mo1057(java.util.Date r3) {
            r2 = this;
            int r2 = r2.f2617
            switch(r2) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.sql.Timestamp r2 = new java.sql.Timestamp
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
        Lf:
            java.sql.Date r2 = new java.sql.Date
            long r0 = r3.getTime()
            r2.<init>(r0)
            return r2
    }
}
