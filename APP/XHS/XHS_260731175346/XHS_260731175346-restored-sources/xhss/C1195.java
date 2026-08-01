package xhss;

/* JADX INFO: renamed from: xhss.ᲈᲇᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1195 extends xhss.AbstractC1202 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ java.io.InputStream f3852;

    public C1195(java.io.InputStream r1, xhss.InterfaceC0038 r2) {
            r0 = this;
            r0.f3852 = r1
            r0.<init>(r2)
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            xhss.ᛲᛸᲁᲇ r1 = (xhss.InterfaceC0197) r1
            xhss.ᛱᛴᛶᛴ r2 = (xhss.InterfaceC0038) r2
            xhss.ᛱᛴᛶᛴ r0 = r0.mo117(r1, r2)
            xhss.ᲈᲇᛶᲈ r0 = (xhss.C1195) r0
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            r0.mo116(r1)
            return r1
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.Object mo116(java.lang.Object r1) {
            r0 = this;
            xhss.C0614.m1058(r1)
            java.io.InputStream r0 = r0.f3852
            r0.close()
            xhss.ᛵᛷᲈᛶ r0 = xhss.C0500.f1817
            return r0
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0038 mo117(java.lang.Object r1, xhss.InterfaceC0038 r2) {
            r0 = this;
            xhss.ᲈᲇᛶᲈ r1 = new xhss.ᲈᲇᛶᲈ
            java.io.InputStream r0 = r0.f3852
            r1.<init>(r0, r2)
            return r1
    }
}
