package defpackage;

/* JADX INFO: renamed from: ᲈᲈᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2377 implements defpackage.InterfaceC1401 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.ScrollFeedbackProvider f10297;

    public C2377(androidx.core.widget.NestedScrollView r1) {
            r0 = this;
            r0.<init>()
            android.view.ScrollFeedbackProvider r1 = android.view.ScrollFeedbackProvider.createProvider(r1)
            r0.f10297 = r1
            return
    }

    @Override // defpackage.InterfaceC1401
    public final void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f10297
            r0.onScrollLimit(r1, r2, r3, r4)
            return
    }

    @Override // defpackage.InterfaceC1401
    public final void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f10297
            r0.onScrollProgress(r1, r2, r3, r4)
            return
    }
}
