package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0154[] f57;

    public CompositeGeneratedAdaptersObserver(xhss.InterfaceC0154[] r1) {
            r0 = this;
            r0.<init>()
            r0.f57 = r1
            return
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r2, xhss.EnumC1174 r3) {
            r1 = this;
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            xhss.ᛲᛴᛷᛴ[] r1 = r1.f57
            int r2 = r1.length
            r3 = 0
            r0 = 0
            if (r2 > 0) goto L13
            int r2 = r1.length
            if (r2 > 0) goto L10
            return
        L10:
            r1 = r1[r0]
            throw r3
        L13:
            r1 = r1[r0]
            throw r3
    }
}
