package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements xhss.InterfaceC0712, xhss.InterfaceC0672 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0050 f1;

    @Override // xhss.InterfaceC0672
    public final void cancel() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // xhss.InterfaceC0712
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final void mo0(xhss.InterfaceC0386 r1, xhss.EnumC1174 r2) {
            r0 = this;
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_START
            if (r2 == r1) goto L18
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_STOP
            if (r2 != r1) goto L10
            xhss.ᛱᛶᛴᛴ r0 = r0.f1
            if (r0 == 0) goto L17
            r0.cancel()
            return
        L10:
            xhss.ᲈᲀᛵᛸ r1 = xhss.EnumC1174.ON_DESTROY
            if (r2 != r1) goto L17
            r0.cancel()
        L17:
            return
        L18:
            r0 = 0
            throw r0
    }
}
