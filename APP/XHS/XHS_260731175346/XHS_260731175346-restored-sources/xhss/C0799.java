package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲀᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0799 implements xhss.InterfaceC0966 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.util.concurrent.atomic.AtomicReference f2610;

    public C0799(xhss.C1111 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r2)
            r1.f2610 = r0
            return
    }

    @Override // xhss.InterfaceC0966
    public final java.util.Iterator iterator() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r1.f2610
            r0 = 0
            java.lang.Object r1 = r1.getAndSet(r0)
            xhss.ᲁᛷᛴᲇ r1 = (xhss.InterfaceC0966) r1
            if (r1 == 0) goto L10
            java.util.Iterator r1 = r1.iterator()
            return r1
        L10:
            java.lang.String r1 = "This sequence can be consumed only once."
            xhss.C0532.m950(r1)
            return r0
    }
}
