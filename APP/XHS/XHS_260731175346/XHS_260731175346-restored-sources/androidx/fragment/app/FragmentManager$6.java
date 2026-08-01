package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements xhss.InterfaceC0712 {
    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r1, xhss.EnumC1174 r2) {
            r0 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_START
            r1 = 0
            if (r2 == r0) goto Lb
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_DESTROY
            if (r2 == r0) goto La
            return
        La:
            throw r1
        Lb:
            throw r1
    }
}
