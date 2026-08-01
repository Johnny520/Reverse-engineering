package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.InterfaceC0610 f58;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.InterfaceC0712 f59;

    public DefaultLifecycleObserverAdapter(xhss.InterfaceC0610 r1, xhss.InterfaceC0712 r2) {
            r0 = this;
            r0.<init>()
            r0.f58 = r1
            r0.f59 = r2
            return
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r3, xhss.EnumC1174 r4) {
            r2 = this;
            int[] r0 = xhss.AbstractC0258.f951
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L15
            r1 = 7
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            java.lang.String r2 = "ON_ANY must not been send by anybody"
            xhss.C0532.m959(r2)
            return
        L15:
            xhss.ᛶᲇᲈᲈ r0 = r2.f58
            r0.mo21()
        L1a:
            xhss.ᛷᲁᲇᲀ r2 = r2.f59
            if (r2 == 0) goto L21
            r2.mo0(r3, r4)
        L21:
            return
    }
}
