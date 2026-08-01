package androidx.core.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ int f1028 = 0;

    /* JADX INFO: renamed from: ε */
    public final p000.RunnableC0403ip f1029;

    /* JADX INFO: renamed from: ζ */
    public final p000.RunnableC0403ip f1030;

    public ContentLoadingProgressBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentLoadingProgressBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            ip r2 = new ip
            r3 = 0
            r2.<init>(r1, r3)
            r1.f1029 = r2
            ip r2 = new ip
            r3 = 1
            r2.<init>(r1, r3)
            r1.f1030 = r2
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            ip r0 = r1.f1029
            r1.removeCallbacks(r0)
            ip r0 = r1.f1030
            r1.removeCallbacks(r0)
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            ip r0 = r1.f1029
            r1.removeCallbacks(r0)
            ip r0 = r1.f1030
            r1.removeCallbacks(r0)
            return
    }
}
