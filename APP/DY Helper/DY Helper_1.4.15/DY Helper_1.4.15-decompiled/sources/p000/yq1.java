package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yq1 implements p000.zq1 {

    /* JADX INFO: renamed from: ε */
    public final android.view.ScrollFeedbackProvider f12768;

    public yq1(androidx.core.widget.NestedScrollView r1) {
            r0 = this;
            r0.<init>()
            android.view.ScrollFeedbackProvider r1 = android.view.ScrollFeedbackProvider.createProvider(r1)
            r0.f12768 = r1
            return
    }

    @Override // p000.zq1
    public final void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f12768
            r0.onScrollLimit(r1, r2, r3, r4)
            return
    }

    @Override // p000.zq1
    public final void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.ScrollFeedbackProvider r0 = r0.f12768
            r0.onScrollProgress(r1, r2, r3, r4)
            return
    }
}
