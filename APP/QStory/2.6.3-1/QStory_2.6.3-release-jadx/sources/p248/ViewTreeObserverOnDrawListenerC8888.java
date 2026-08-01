package p248;

import android.view.View;
import android.view.ViewTreeObserver;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import p238.AbstractC8818;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC8888 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8887 f22583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f22584;

    public ViewTreeObserverOnDrawListenerC8888(C8887 c8887, View view) {
        this.f22583 = c8887;
        this.f22584 = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC8818.m14037().post(new RunnableC4574(this, 16, this));
    }
}
