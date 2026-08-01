package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1027 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1029 f1051;

    public C1027(C1029 c1029) {
        this.f1051 = c1029;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C1029 c1029 = this.f1051;
        RunnableC1030 runnableC1030 = c1029.f1068;
        C0981 c0981 = c1029.f1054;
        if (i != 1 || c0981.getInputMethodMode() == 2 || c0981.getContentView() == null) {
            return;
        }
        c1029.f1056.removeCallbacks(runnableC1030);
        runnableC1030.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
