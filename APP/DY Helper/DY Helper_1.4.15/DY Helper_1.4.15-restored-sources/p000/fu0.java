package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 implements android.widget.AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ androidx.appcompat.widget.C0035 f4136;

    public fu0(androidx.appcompat.widget.C0035 r1) {
            r0 = this;
            r0.<init>()
            r0.f4136 = r1
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView r3, int r4) {
            r2 = this;
            androidx.appcompat.widget.θ r2 = r2.f4136
            d1 r3 = r2.f848
            m5 r0 = r2.f831
            r1 = 1
            if (r4 != r1) goto L1f
            int r4 = r0.getInputMethodMode()
            r1 = 2
            if (r4 != r1) goto L11
            return
        L11:
            android.view.View r4 = r0.getContentView()
            if (r4 == 0) goto L1f
            android.os.Handler r2 = r2.f827
            r2.removeCallbacks(r3)
            r3.run()
        L1f:
            return
    }
}
