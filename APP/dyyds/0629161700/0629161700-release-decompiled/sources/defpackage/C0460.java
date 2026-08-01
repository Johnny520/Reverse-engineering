package defpackage;

/* JADX INFO: renamed from: ᛳᛴᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0460 extends defpackage.AbstractC0020 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2304;

    public /* synthetic */ C0460(java.lang.Class r1, int r2) {
            r0 = this;
            r0.f2304 = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.AbstractC0020
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.Date mo319(java.util.Date r3) {
            r2 = this;
            int r2 = r2.f2304
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
