package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲈᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0824 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.util.List f2687;

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public final void m1392(xhss.InterfaceC0645 r2) {
            r1 = this;
            xhss.ᛵᛴᛳᛶ r0 = new xhss.ᛵᛴᛳᛶ
            r0.<init>()
            r2.mo112(r0)
            java.util.List r2 = r1.f2687
            if (r2 != 0) goto L11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L11:
            r1.f2687 = r2
            r2.add(r0)
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r4) {
            r3 = this;
            java.util.List r3 = r3.f2687
            r0 = 0
            if (r3 == 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = xhss.AbstractC0249.m554(r3)
            r1.<init>(r2)
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r3.next()
            xhss.ᛵᛴᛳᛶ r2 = (xhss.C0467) r2
            int r2 = r2.mo135(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            goto L12
        L2a:
            int[] r3 = xhss.AbstractC0713.m1238(r1)
            int r3 = r4.m260(r3)
            goto L34
        L33:
            r3 = r0
        L34:
            r1 = 3
            r4.m258(r1)
            r1 = 2
            r4.m253(r1, r0)
            r4.m253(r0, r3)
            r3 = 1
            r4.m251(r3, r0)
            int r3 = r4.m257()
            r4.m259(r3)
            return r3
    }
}
