package p038;

import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLongClickListenerC6408 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6403 f17566;

    public ViewOnLongClickListenerC6408(C6403 c6403) {
        this.f17566 = c6403;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        new Thread(new RunnableC6399(this.f17566)).start();
        return true;
    }
}
