package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲇᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0520 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f1889;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f1890;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f1891;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public boolean f1892;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1893;

    public C0520(int r1) {
            r0 = this;
            r0.<init>()
            r0.f1889 = r1
            return
    }

    public C0520(xhss.C0339 r2) {
            r1 = this;
            r0 = 2
            r1.f1891 = r0
            r1.f1893 = r2
            int r2 = r2.f1264
            r1.<init>(r2)
            return
    }

    public C0520(xhss.C1001 r1, int r2) {
            r0 = this;
            r0.f1891 = r2
            switch(r2) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0.f1893 = r1
            int r1 = r1.f1364
            r0.<init>(r1)
            return
        Ld:
            r0.f1893 = r1
            int r1 = r1.f1364
            r0.<init>(r1)
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f1890
            int r1 = r1.f1889
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            int r0 = r3.f1890
            int r1 = r3.f1891
            java.lang.Object r2 = r3.f1893
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L16;
                default: goto Lf;
            }
        Lf:
            xhss.ᛴᛲᛴᲇ r2 = (xhss.C0339) r2
            java.lang.Object[] r1 = r2.f1263
            r0 = r1[r0]
            goto L23
        L16:
            xhss.ᲇᛱᛱᛶ r2 = (xhss.C1001) r2
            java.lang.Object r0 = r2.m729(r0)
            goto L23
        L1d:
            xhss.ᲇᛱᛱᛶ r2 = (xhss.C1001) r2
            java.lang.Object r0 = r2.m727(r0)
        L23:
            int r1 = r3.f1890
            r2 = 1
            int r1 = r1 + r2
            r3.f1890 = r1
            r3.f1892 = r2
            return r0
        L2c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.f1892
            if (r0 == 0) goto L2c
            int r0 = r3.f1890
            int r0 = r0 + (-1)
            r3.f1890 = r0
            int r1 = r3.f1891
            java.lang.Object r2 = r3.f1893
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L17;
                default: goto L11;
            }
        L11:
            xhss.ᛴᛲᛴᲇ r2 = (xhss.C0339) r2
            r2.m708(r0)
            goto L22
        L17:
            xhss.ᲇᛱᛱᛶ r2 = (xhss.C1001) r2
            r2.m732(r0)
            goto L22
        L1d:
            xhss.ᲇᛱᛱᛶ r2 = (xhss.C1001) r2
            r2.m732(r0)
        L22:
            int r0 = r3.f1889
            int r0 = r0 + (-1)
            r3.f1889 = r0
            r0 = 0
            r3.f1892 = r0
            return
        L2c:
            java.lang.String r3 = "Call next() before removing an element."
            xhss.C0532.m950(r3)
            return
    }
}
