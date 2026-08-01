package xhss;

/* JADX INFO: renamed from: xhss.ᲀᲀᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0894 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.Iterator f2886;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int f2887;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0604 f2888;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f2889;

    public C0894(xhss.C0604 r1) {
            r0 = this;
            r0.<init>()
            r0.f2888 = r1
            xhss.ᲁᛷᛴᲇ r1 = r1.f2080
            java.util.Iterator r1 = r1.iterator()
            r0.f2886 = r1
            r1 = -1
            r0.f2887 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f2887
            r1 = -1
            if (r0 != r1) goto L8
            r2.m1457()
        L8:
            int r2 = r2.f2887
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f2887
            r1 = -1
            if (r0 != r1) goto L8
            r3.m1457()
        L8:
            int r0 = r3.f2887
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.f2889
            r2 = 0
            r3.f2889 = r2
            r3.f2887 = r1
            return r0
        L14:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1457() {
            r3 = this;
        L0:
            java.util.Iterator r0 = r3.f2886
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r0 = r0.next()
            xhss.ᛶᲇᲇᛲ r1 = r3.f2888
            xhss.ᛷᛴᛲᛲ r2 = r1.f2079
            java.lang.Object r2 = r2.mo112(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            boolean r1 = r1.f2078
            if (r2 != r1) goto L0
            r3.f2889 = r0
            r0 = 1
            r3.f2887 = r0
            return
        L24:
            r0 = 0
            r3.f2887 = r0
            return
    }
}
