package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛶᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1152 implements xhss.InterfaceC0146 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.view.ScrollFeedbackProvider f3750;

    public C1152(androidx.core.widget.NestedScrollView r1) {
            r0 = this;
            r0.<init>()
            android.view.ScrollFeedbackProvider r1 = android.view.ScrollFeedbackProvider.createProvider(r1)
            r0.f3750 = r1
            return
    }

    @Override // xhss.InterfaceC0146
    public final void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f3750
            r0.onScrollLimit(r1, r2, r3, r4)
            return
    }

    @Override // xhss.InterfaceC0146
    public final void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f3750
            r0.onScrollProgress(r1, r2, r3, r4)
            return
    }
}
