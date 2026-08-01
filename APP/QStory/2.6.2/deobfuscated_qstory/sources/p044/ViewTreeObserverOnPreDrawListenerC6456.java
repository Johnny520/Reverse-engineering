package p044;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC6456 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6457 f17701;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C6455 f17702;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17703;

    public ViewTreeObserverOnPreDrawListenerC6456(C6455 c6455, int i, C6457 c6457) {
        this.f17702 = c6455;
        this.f17703 = i;
        this.f17701 = c6457;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C6455 c6455 = this.f17702;
        c6455.getViewTreeObserver().removeOnPreDrawListener(this);
        for (int i = 0; i < this.f17703; i++) {
            c6455.f17697.add(new C6457(this.f17701.f17712, c6455.f17698, c6455.f17699));
        }
        c6455.invalidate();
        return true;
    }
}
