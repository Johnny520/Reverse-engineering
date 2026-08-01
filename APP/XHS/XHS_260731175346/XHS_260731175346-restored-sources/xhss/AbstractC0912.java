package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲇᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0912 implements xhss.InterfaceC0281 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC1091 f2944;

    public AbstractC0912(xhss.InterfaceC1091 r1) {
            r0 = this;
            r0.<init>()
            r0.f2944 = r1
            return
    }

    @Override // xhss.InterfaceC0281
    public final xhss.InterfaceC1091 getKey() {
            r0 = this;
            xhss.ᲇᲁᛵᲈ r0 = r0.f2944
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo598(java.lang.Object r1, xhss.InterfaceC0517 r2) {
            r0 = this;
            java.lang.Object r0 = r2.mo115(r1, r0)
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public xhss.InterfaceC0362 mo440(xhss.InterfaceC1091 r2) {
            r1 = this;
            xhss.ᲇᲁᛵᲈ r0 = r1.getKey()
            boolean r2 = xhss.AbstractC0007.m97(r0, r2)
            if (r2 == 0) goto Lc
            xhss.ᲇᛷᲁᛷ r1 = xhss.C1059.f3421
        Lc:
            return r1
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0362 mo599(xhss.InterfaceC0362 r1) {
            r0 = this;
            xhss.ᛴᛵᛳᛵ r0 = xhss.AbstractC0060.m188(r0, r1)
            return r0
    }

    @Override // xhss.InterfaceC0362
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public xhss.InterfaceC0281 mo442(xhss.InterfaceC1091 r2) {
            r1 = this;
            xhss.ᲇᲁᛵᲈ r0 = r1.getKey()
            boolean r2 = xhss.AbstractC0007.m97(r0, r2)
            if (r2 == 0) goto Lb
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
