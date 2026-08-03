package p000;

import android.widget.AbsListView;

/* JADX INFO: renamed from: Eo */
/* JADX INFO: loaded from: classes.dex */
public final class C0203Eo implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0289Go f610a;

    public C0203Eo(C0289Go c0289Go) {
        this.f610a = c0289Go;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0289Go c0289Go = this.f610a;
        RunnableC0117Co runnableC0117Co = c0289Go.f954r;
        C0606O3 c0606o3 = c0289Go.f962z;
        if (i != 1 || c0606o3.getInputMethodMode() == 2 || c0606o3.getContentView() == null) {
            return;
        }
        c0289Go.f958v.removeCallbacks(runnableC0117Co);
        runnableC0117Co.run();
    }
}
