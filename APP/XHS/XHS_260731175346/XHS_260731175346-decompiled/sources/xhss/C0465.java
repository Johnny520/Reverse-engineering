package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛴᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0465 implements java.util.Iterator, xhss.InterfaceC0057 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.util.Iterator f1680;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0845 f1681;

    public C0465(xhss.C0845 r1) {
            r0 = this;
            r0.<init>()
            r0.f1681 = r1
            java.lang.Object r1 = r1.f2747
            xhss.ᲁᛷᛴᲇ r1 = (xhss.InterfaceC0966) r1
            java.util.Iterator r1 = r1.iterator()
            r0.f1680 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            java.util.Iterator r0 = r0.f1680
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            xhss.ᲀᛲᲇᛲ r0 = r1.f1681
            xhss.ᲁᛳᲀᛴ r0 = r0.f2748
            xhss.ᛷᛴᛲᛲ r0 = (xhss.InterfaceC0645) r0
            java.util.Iterator r1 = r1.f1680
            java.lang.Object r1 = r1.next()
            java.lang.Object r1 = r0.mo112(r1)
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
