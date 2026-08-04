package yyds;

import android.widget.AbsListView;

/* JADX INFO: renamed from: yyds.ᛲᲁᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0457 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2352 f2300;

    public C0457(AbstractC2352 abstractC2352) {
        this.f2300 = abstractC2352;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AbstractC2352 abstractC2352 = this.f2300;
        RunnableC1073 runnableC1073 = abstractC2352.f11557;
        C1000 c1000 = abstractC2352.f11541;
        if (i != 1 || c1000.getInputMethodMode() == 2 || c1000.getContentView() == null) {
            return;
        }
        abstractC2352.f11549.removeCallbacks(runnableC1073);
        runnableC1073.run();
    }
}
