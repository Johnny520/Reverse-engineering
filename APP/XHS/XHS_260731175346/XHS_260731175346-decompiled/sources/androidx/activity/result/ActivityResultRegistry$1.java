package androidx.activity.result;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements xhss.InterfaceC0712 {
    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r1, xhss.EnumC1174 r2) {
            r0 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_START
            boolean r0 = r0.equals(r2)
            r1 = 0
            if (r0 != 0) goto L1c
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_STOP
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_DESTROY
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1a
            return
        L1a:
            throw r1
        L1b:
            throw r1
        L1c:
            throw r1
    }
}
