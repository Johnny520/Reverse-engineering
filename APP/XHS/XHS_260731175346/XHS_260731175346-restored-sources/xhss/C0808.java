package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲁᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0808 extends xhss.AbstractC0007 {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0007 f2626;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.util.concurrent.ThreadPoolExecutor f2627;

    public C0808(xhss.AbstractC0007 r1, java.util.concurrent.ThreadPoolExecutor r2) {
            r0 = this;
            r0.<init>()
            r0.f2626 = r1
            r0.f2627 = r2
            return
    }

    @Override // xhss.AbstractC0007
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final void mo105(xhss.C1068 r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f2627
            xhss.ᛱᛱᛷᛸ r1 = r1.f2626     // Catch: java.lang.Throwable -> Lb
            r1.mo105(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }

    @Override // xhss.AbstractC0007
    /* JADX INFO: renamed from: ᛸᛴᛶᛳ */
    public final void mo106(java.lang.Throwable r2) {
            r1 = this;
            java.util.concurrent.ThreadPoolExecutor r0 = r1.f2627
            xhss.ᛱᛱᛷᛸ r1 = r1.f2626     // Catch: java.lang.Throwable -> Lb
            r1.mo106(r2)     // Catch: java.lang.Throwable -> Lb
            r0.shutdown()
            return
        Lb:
            r1 = move-exception
            r0.shutdown()
            throw r1
    }
}
