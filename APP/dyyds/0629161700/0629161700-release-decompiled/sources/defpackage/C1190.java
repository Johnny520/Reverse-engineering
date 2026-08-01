package defpackage;

/* JADX INFO: renamed from: ᛶᲈᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1190 implements android.widget.AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC1503 f5389;

    public C1190(defpackage.AbstractC1503 r1) {
            r0 = this;
            r0.<init>()
            r0.f5389 = r1
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
            ᛸᛶᛳᛷ r2 = r2.f5389
            ᛸᛸᲀᛸ r3 = r2.f6620
            ᛳᲇᲇᛲ r0 = r2.f6630
            r1 = 1
            if (r4 != r1) goto L1f
            int r4 = r0.getInputMethodMode()
            r1 = 2
            if (r4 != r1) goto L11
            return
        L11:
            android.view.View r4 = r0.getContentView()
            if (r4 == 0) goto L1f
            android.os.Handler r2 = r2.f6628
            r2.removeCallbacks(r3)
            r3.run()
        L1f:
            return
    }
}
