package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛳᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1130 implements java.util.ListIterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3647;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f3648;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3649;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3650;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.AbstractC0779 f3651;

    public C1130(xhss.C0710 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f3647 = r0
            r1.<init>()
            r1.f3651 = r2
            r1.f3648 = r3
            r3 = -1
            r1.f3650 = r3
            int r2 = xhss.C0710.m1227(r2)
            r1.f3649 = r2
            return
    }

    public C1130(xhss.C1150 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f3647 = r0
            r1.<init>()
            r1.f3651 = r2
            r1.f3648 = r3
            r3 = -1
            r1.f3650 = r3
            int r2 = xhss.C1150.m1845(r2)
            r1.f3649 = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f3647
            r1 = -1
            xhss.ᛸᛶᲈᛶ r2 = r4.f3651
            switch(r0) {
                case 0: goto L1f;
                default: goto L8;
            }
        L8:
            r4.m1822()
            xhss.ᲈᛶᲀᲈ r2 = (xhss.C1150) r2
            int r0 = r4.f3648
            int r3 = r0 + 1
            r4.f3648 = r3
            r2.add(r0, r5)
            r4.f3650 = r1
            int r5 = xhss.C1150.m1845(r2)
            r4.f3649 = r5
            return
        L1f:
            r4.m1823()
            xhss.ᛷᲁᲇᛳ r2 = (xhss.C0710) r2
            int r0 = r4.f3648
            int r3 = r0 + 1
            r4.f3648 = r3
            r2.add(r0, r5)
            r4.f3650 = r1
            int r5 = xhss.C0710.m1227(r2)
            r4.f3649 = r5
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f3647
            r1 = 0
            r2 = 1
            xhss.ᛸᛶᲈᛶ r3 = r4.f3651
            switch(r0) {
                case 0: goto L13;
                default: goto L9;
            }
        L9:
            int r4 = r4.f3648
            xhss.ᲈᛶᲀᲈ r3 = (xhss.C1150) r3
            int r0 = r3.f3746
            if (r4 >= r0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            int r4 = r4.f3648
            xhss.ᛷᲁᲇᛳ r3 = (xhss.C0710) r3
            int r0 = r3.f2382
            if (r4 >= r0) goto L1c
            r1 = r2
        L1c:
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f3647
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            int r1 = r1.f3648
            if (r1 <= 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            int r1 = r1.f3648
            if (r1 <= 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f3647
            xhss.ᛸᛶᲈᛶ r1 = r3.f3651
            switch(r0) {
                case 0: goto L23;
                default: goto L7;
            }
        L7:
            r3.m1822()
            int r0 = r3.f3648
            xhss.ᲈᛶᲀᲈ r1 = (xhss.C1150) r1
            int r2 = r1.f3746
            if (r0 >= r2) goto L1d
            int r2 = r0 + 1
            r3.f3648 = r2
            r3.f3650 = r0
            java.lang.Object[] r3 = r1.f3745
            r3 = r3[r0]
            return r3
        L1d:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L23:
            r3.m1823()
            int r0 = r3.f3648
            xhss.ᛷᲁᲇᛳ r1 = (xhss.C0710) r1
            int r2 = r1.f2382
            if (r0 >= r2) goto L3c
            int r2 = r0 + 1
            r3.f3648 = r2
            r3.f3650 = r0
            java.lang.Object[] r3 = r1.f2379
            int r1 = r1.f2380
            int r1 = r1 + r0
            r3 = r3[r1]
            return r3
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f3647
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.f3648
            return r1
        L8:
            int r1 = r1.f3648
            return r1
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f3647
            xhss.ᛸᛶᲈᛶ r1 = r2.f3651
            switch(r0) {
                case 0: goto L21;
                default: goto L7;
            }
        L7:
            r2.m1822()
            int r0 = r2.f3648
            if (r0 <= 0) goto L1b
            int r0 = r0 + (-1)
            r2.f3648 = r0
            r2.f3650 = r0
            xhss.ᲈᛶᲀᲈ r1 = (xhss.C1150) r1
            java.lang.Object[] r2 = r1.f3745
            r2 = r2[r0]
            return r2
        L1b:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L21:
            r2.m1823()
            int r0 = r2.f3648
            if (r0 <= 0) goto L38
            int r0 = r0 + (-1)
            r2.f3648 = r0
            r2.f3650 = r0
            xhss.ᛷᲁᲇᛳ r1 = (xhss.C0710) r1
            java.lang.Object[] r2 = r1.f2379
            int r1 = r1.f2380
            int r1 = r1 + r0
            r2 = r2[r1]
            return r2
        L38:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f3647
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.f3648
        L7:
            int r1 = r1 + (-1)
            return r1
        La:
            int r1 = r1.f3648
            goto L7
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            int r0 = r4.f3647
            java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
            r2 = -1
            xhss.ᛸᛶᲈᛶ r3 = r4.f3651
            switch(r0) {
                case 0: goto L27;
                default: goto La;
            }
        La:
            xhss.ᲈᛶᲀᲈ r3 = (xhss.C1150) r3
            r4.m1822()
            int r0 = r4.f3650
            if (r0 == r2) goto L23
            r3.mo1228(r0)
            int r0 = r4.f3650
            r4.f3648 = r0
            r4.f3650 = r2
            int r0 = xhss.C1150.m1845(r3)
            r4.f3649 = r0
            goto L26
        L23:
            xhss.C0532.m950(r1)
        L26:
            return
        L27:
            xhss.ᛷᲁᲇᛳ r3 = (xhss.C0710) r3
            r4.m1823()
            int r0 = r4.f3650
            if (r0 == r2) goto L40
            r3.mo1228(r0)
            int r0 = r4.f3650
            r4.f3648 = r0
            r4.f3650 = r2
            int r0 = xhss.C0710.m1227(r3)
            r4.f3649 = r0
            goto L43
        L40:
            xhss.C0532.m950(r1)
        L43:
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f3647
            java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
            xhss.ᛸᛶᲈᛶ r2 = r4.f3651
            r3 = -1
            switch(r0) {
                case 0: goto L1b;
                default: goto La;
            }
        La:
            r4.m1822()
            int r4 = r4.f3650
            if (r4 == r3) goto L17
            xhss.ᲈᛶᲀᲈ r2 = (xhss.C1150) r2
            r2.set(r4, r5)
            goto L1a
        L17:
            xhss.C0532.m950(r1)
        L1a:
            return
        L1b:
            r4.m1823()
            int r4 = r4.f3650
            if (r4 == r3) goto L28
            xhss.ᛷᲁᲇᛳ r2 = (xhss.C0710) r2
            r2.set(r4, r5)
            goto L2b
        L28:
            xhss.C0532.m950(r1)
        L2b:
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public void m1822() {
            r1 = this;
            xhss.ᛸᛶᲈᛶ r0 = r1.f3651
            xhss.ᲈᛶᲀᲈ r0 = (xhss.C1150) r0
            int r0 = xhss.C1150.m1845(r0)
            int r1 = r1.f3649
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public void m1823() {
            r1 = this;
            xhss.ᛸᛶᲈᛶ r0 = r1.f3651
            xhss.ᛷᲁᲇᛳ r0 = (xhss.C0710) r0
            xhss.ᲈᛶᲀᲈ r0 = r0.f2383
            int r0 = xhss.C1150.m1845(r0)
            int r1 = r1.f3649
            if (r0 != r1) goto Lf
            return
        Lf:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }
}
