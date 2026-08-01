package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0754 extends xhss.AbstractC0171 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0467 f2531;

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public final void m1293(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᛵᛴᛳᛶ r0 = new xhss.ᛵᛴᛳᛶ
            r0.<init>()
            r2.mo112(r0)
            r1.f2531 = r0
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r3) {
            r2 = this;
            xhss.ᛵᛴᛳᛶ r2 = r2.f2531
            r0 = 0
            if (r2 == 0) goto La
            int r2 = r2.mo135(r3)
            goto Lb
        La:
            r2 = r0
        Lb:
            r1 = 6
            r3.m258(r1)
            r1 = 5
            r3.m253(r1, r2)
            r2 = 3
            r3.m253(r2, r0)
            r2 = 1
            r3.m253(r2, r0)
            r3.m253(r0, r0)
            int r2 = r3.m257()
            r3.m259(r2)
            return r2
    }
}
