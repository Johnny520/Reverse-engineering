package p060;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC7286 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7287 f18042;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C7285 f18043;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18044;

    public ViewTreeObserverOnPreDrawListenerC7286(C7285 c7285, int i, C7287 c7287) {
        this.f18043 = c7285;
        this.f18044 = i;
        this.f18042 = c7287;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C7285 c7285 = this.f18043;
        c7285.getViewTreeObserver().removeOnPreDrawListener(this);
        for (int i = 0; i < this.f18044; i++) {
            c7285.f18038.add(new C7287(this.f18042.f18053, c7285.f18039, c7285.f18040));
        }
        c7285.invalidate();
        return true;
    }
}
