package androidx.appcompat.widget;

import android.widget.AbsListView;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0180 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0182 f706;

    public C0180(C0182 c0182) {
        this.f706 = c0182;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C0182 c0182 = this.f706;
        RunnableC0183 runnableC0183 = c0182.f723;
        C0134 c0134 = c0182.f709;
        if (i != 1 || c0134.getInputMethodMode() == 2 || c0134.getContentView() == null) {
            return;
        }
        c0182.f711.removeCallbacks(runnableC0183);
        runnableC0183.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
