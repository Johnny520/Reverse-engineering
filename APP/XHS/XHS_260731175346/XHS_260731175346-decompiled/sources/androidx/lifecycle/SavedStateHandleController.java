package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements xhss.InterfaceC0712 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public boolean f63;

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r2, xhss.EnumC1174 r3) {
            r1 = this;
            xhss.ᲈᲀᛵᛸ r0 = xhss.EnumC1174.ON_DESTROY
            if (r3 != r0) goto Le
            r3 = 0
            r1.f63 = r3
            androidx.lifecycle.ᛷᛵᛵᲈ r2 = r2.mo63()
            r2.m29(r1)
        Le:
            return
    }
}
