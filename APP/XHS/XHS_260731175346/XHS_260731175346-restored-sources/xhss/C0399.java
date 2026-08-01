package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛸᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0399 implements xhss.InterfaceC0080 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1184 f1412;

    public C0399(xhss.C1184 r1) {
            r0 = this;
            r0.<init>()
            r0.f1412 = r1
            return
    }

    @Override // xhss.InterfaceC0080, xhss.InterfaceC0900
    public final void cancel() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected cancel"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final xhss.C0190 mo238() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final xhss.C1184 mo239() {
            r0 = this;
            xhss.ᲈᲁᛲᲇ r0 = r0.f1412
            return r0
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.InterfaceC0080 mo240() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected retry"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.C0190 mo241() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "already connected"
            r1.<init>(r0)
            throw r1
    }

    @Override // xhss.InterfaceC0080
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final boolean mo242() {
            r0 = this;
            r0 = 1
            return r0
    }
}
