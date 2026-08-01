package p232;

import android.view.View;
import android.view.ViewTreeObserver;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import p222.AbstractC7988;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC8058 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8057 f22240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f22241;

    public ViewTreeObserverOnDrawListenerC8058(C8057 c8057, View view) {
        this.f22240 = c8057;
        this.f22241 = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC7988.m13450().post(new RunnableC3741(this, 16, this));
    }
}
