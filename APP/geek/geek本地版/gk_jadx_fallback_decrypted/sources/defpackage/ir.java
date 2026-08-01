package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ir implements android.widget.AbsListView.OnScrollListener {
    public final /* synthetic */ defpackage.kr a;

    public ir(defpackage.kr r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(android.widget.AbsListView r4, int r5) {
            r3 = this;
            kr r4 = r3.a
            hr r0 = r4.r
            c4 r1 = r4.z
            r2 = 1
            if (r5 != r2) goto L1f
            int r5 = r1.getInputMethodMode()
            r2 = 2
            if (r5 != r2) goto L11
            return
        L11:
            android.view.View r5 = r1.getContentView()
            if (r5 == 0) goto L1f
            android.os.Handler r4 = r4.v
            r4.removeCallbacks(r0)
            r0.run()
        L1f:
            return
    }
}
