package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛴᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1139 extends xhss.AbstractC0479 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3667;

    public C1139(xhss.C0686 r1, int r2) {
            r0 = this;
            r0.f3667 = r2
            r0.<init>()
            r0.f1739 = r1
            r2 = -1
            r0.f1738 = r2
            int r1 = r1.f2324
            r0.f1740 = r1
            r0.m879()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f3667
            switch(r0) {
                case 0: goto L47;
                case 1: goto L26;
                default: goto L5;
            }
        L5:
            r3.m878()
            int r0 = r3.f1737
            java.lang.Object r1 = r3.f1739
            xhss.ᛷᛸᛵᛶ r1 = (xhss.C0686) r1
            int r2 = r1.f2328
            if (r0 >= r2) goto L20
            int r2 = r0 + 1
            r3.f1737 = r2
            r3.f1738 = r0
            java.lang.Object[] r1 = r1.f2321
            r0 = r1[r0]
            r3.m879()
            return r0
        L20:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L26:
            r3.m878()
            int r0 = r3.f1737
            java.lang.Object r1 = r3.f1739
            xhss.ᛷᛸᛵᛶ r1 = (xhss.C0686) r1
            int r2 = r1.f2328
            if (r0 >= r2) goto L41
            int r2 = r0 + 1
            r3.f1737 = r2
            r3.f1738 = r0
            java.lang.Object[] r1 = r1.f2320
            r0 = r1[r0]
            r3.m879()
            return r0
        L41:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L47:
            r3.m878()
            int r0 = r3.f1737
            java.lang.Object r1 = r3.f1739
            xhss.ᛷᛸᛵᛶ r1 = (xhss.C0686) r1
            int r2 = r1.f2328
            if (r0 >= r2) goto L63
            int r2 = r0 + 1
            r3.f1737 = r2
            r3.f1738 = r0
            xhss.ᲀᛵᲁᛱ r2 = new xhss.ᲀᛵᲁᛱ
            r2.<init>(r1, r0)
            r3.m879()
            return r2
        L63:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }
}
