package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛱᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0128 extends xhss.AbstractC0561 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.util.List f585;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ int f586;

    public /* synthetic */ C0128(int r1) {
            r0 = this;
            r0.f586 = r1
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0561
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ */
    public final int mo135(xhss.C0099 r7) {
            r6 = this;
            int r0 = r6.f586
            r1 = 1
            r2 = 2
            r3 = 3
            r4 = 0
            switch(r0) {
                case 0: goto L50;
                default: goto L9;
            }
        L9:
            java.util.List r6 = r6.f585
            if (r6 == 0) goto L3b
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = xhss.AbstractC0249.m554(r6)
            r0.<init>(r5)
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r6.next()
            xhss.ᛶᛴᛲᛴ r5 = (xhss.C0555) r5
            int r5 = r5.mo135(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L1a
        L32:
            int[] r6 = xhss.AbstractC0713.m1238(r0)
            int r6 = r7.m260(r6)
            goto L3c
        L3b:
            r6 = r4
        L3c:
            r7.m258(r3)
            r7.m253(r2, r4)
            r7.m253(r4, r6)
            r7.m251(r1, r4)
            int r6 = r7.m257()
            r7.m259(r6)
            return r6
        L50:
            java.util.List r6 = r6.f585
            if (r6 == 0) goto L82
            java.util.ArrayList r0 = new java.util.ArrayList
            int r5 = xhss.AbstractC0249.m554(r6)
            r0.<init>(r5)
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r6.next()
            xhss.ᛸᛸᲀᛷ r5 = (xhss.C0792) r5
            int r5 = r5.mo135(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L61
        L79:
            int[] r6 = xhss.AbstractC0713.m1238(r0)
            int r6 = r7.m260(r6)
            goto L83
        L82:
            r6 = r4
        L83:
            r7.m258(r3)
            r7.m253(r2, r4)
            r7.m253(r4, r6)
            r7.m251(r1, r4)
            int r6 = r7.m257()
            r7.m259(r6)
            return r6
    }
}
