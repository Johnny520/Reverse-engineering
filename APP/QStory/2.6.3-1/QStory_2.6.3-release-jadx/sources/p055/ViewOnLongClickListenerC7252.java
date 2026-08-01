package p055;

import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLongClickListenerC7252 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7256 f17955;

    public ViewOnLongClickListenerC7252(C7256 c7256) {
        this.f17955 = c7256;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        new Thread(new RunnableC7255(this.f17955)).start();
        return true;
    }
}
