package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class ReflectiveGenericLifecycleObserver implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f60;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0835 f61;

    public ReflectiveGenericLifecycleObserver(java.lang.Object r3) {
            r2 = this;
            r2.<init>()
            r2.f60 = r3
            xhss.ᛷᲈᛱᲇ r0 = xhss.C0716.f2388
            java.lang.Class r3 = r3.getClass()
            java.util.HashMap r1 = r0.f2390
            java.lang.Object r1 = r1.get(r3)
            xhss.ᲀᛱᲁᛳ r1 = (xhss.C0835) r1
            if (r1 == 0) goto L16
            goto L1b
        L16:
            r1 = 0
            xhss.ᲀᛱᲁᛳ r1 = r0.m1249(r3, r1)
        L1b:
            r2.f61 = r1
            return
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r3, xhss.EnumC1174 r4) {
            r2 = this;
            xhss.ᲀᛱᲁᛳ r0 = r2.f61
            java.util.HashMap r0 = r0.f2716
            java.lang.Object r1 = r0.get(r4)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r2.f60
            xhss.C0835.m1419(r1, r3, r4, r2)
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_ANY
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            xhss.C0835.m1419(r0, r3, r4, r2)
            return
    }
}
