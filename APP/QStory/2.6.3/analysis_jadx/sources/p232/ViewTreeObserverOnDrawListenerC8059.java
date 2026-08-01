package p232;

import android.view.View;
import android.view.ViewTreeObserver;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import p222.AbstractC7989;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC8059 implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8058 f22238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ View f22239;

    public ViewTreeObserverOnDrawListenerC8059(C8058 c8058, View view) {
        this.f22238 = c8058;
        this.f22239 = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        AbstractC7989.m13478().post(new RunnableC3742(this, 16, this));
    }
}
