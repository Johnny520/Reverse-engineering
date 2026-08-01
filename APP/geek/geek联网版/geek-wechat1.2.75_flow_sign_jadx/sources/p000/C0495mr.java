package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: mr */
/* JADX INFO: loaded from: classes.dex */
public final class C0495mr implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0569or f3189a;

    public C0495mr(C0569or c0569or) {
        this.f3189a = c0569or;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0569or c0569or = this.f3189a;
        RunnableC0458lr runnableC0458lr = c0569or.f3534r;
        C0091c4 c0091c4 = c0569or.f3542z;
        if (i != 1 || c0091c4.getInputMethodMode() == 2 || c0091c4.getContentView() == null) {
            return;
        }
        c0569or.f3538v.removeCallbacks(runnableC0458lr);
        runnableC0458lr.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
