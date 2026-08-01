package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛲᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0737 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2469;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2470;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f2471;

    public /* synthetic */ C0737(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2469 = r1
            r0.f2471 = r2
            r0.<init>()
            return
    }

    public C0737(xhss.C0688 r2) {
            r1 = this;
            r0 = 2
            r1.f2469 = r0
            r1.<init>()
            xhss.ᲁᛷᛴᲇ r0 = r2.f2339
            java.util.Iterator r0 = r0.iterator()
            r1.f2471 = r0
            int r2 = r2.f2338
            r1.f2470 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f2469
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r4.f2471
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L24;
                default: goto L9;
            }
        L9:
            java.util.Iterator r3 = (java.util.Iterator) r3
        Lb:
            int r0 = r4.f2470
            if (r0 <= 0) goto L1f
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1f
            r3.next()
            int r0 = r4.f2470
            int r0 = r0 + (-1)
            r4.f2470 = r0
            goto Lb
        L1f:
            boolean r4 = r3.hasNext()
            return r4
        L24:
            int r4 = r4.f2470
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r0 = r3.length
            if (r4 >= r0) goto L2c
            r1 = r2
        L2c:
            return r1
        L2d:
            int r4 = r4.f2470
            xhss.ᛷᲁᲁ r3 = (xhss.AbstractC0709) r3
            int r0 = r3.mo426()
            if (r4 >= r0) goto L38
            r1 = r2
        L38:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f2469
            java.lang.Object r1 = r3.f2471
            switch(r0) {
                case 0: goto L3e;
                case 1: goto L22;
                default: goto L7;
            }
        L7:
            java.util.Iterator r1 = (java.util.Iterator) r1
        L9:
            int r0 = r3.f2470
            if (r0 <= 0) goto L1d
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            r1.next()
            int r0 = r3.f2470
            int r0 = r0 + (-1)
            r3.f2470 = r0
            goto L9
        L1d:
            java.lang.Object r3 = r1.next()
            return r3
        L22:
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            int r0 = r3.f2470     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            int r2 = r0 + 1
            r3.f2470 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            r3 = r1[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2d
            return r3
        L2d:
            r0 = move-exception
            int r1 = r3.f2470
            int r1 = r1 + (-1)
            r3.f2470 = r1
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r0)
            throw r3
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            xhss.ᛷᲁᲁ r1 = (xhss.AbstractC0709) r1
            int r0 = r3.f2470
            int r2 = r0 + 1
            r3.f2470 = r2
            java.lang.Object r3 = r1.get(r0)
            return r3
        L51:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f2469
            switch(r1) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
