package p044;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC6457 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6458 f17697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6456 f17698;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17699;

    public ViewTreeObserverOnPreDrawListenerC6457(C6456 c6456, int i, C6458 c6458) {
        this.f17698 = c6456;
        this.f17699 = i;
        this.f17697 = c6458;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C6456 c6456 = this.f17698;
        c6456.getViewTreeObserver().removeOnPreDrawListener(this);
        for (int i = 0; i < this.f17699; i++) {
            c6456.f17693.add(new C6458(this.f17697.f17708, c6456.f17694, c6456.f17695));
        }
        c6456.invalidate();
        return true;
    }
}
