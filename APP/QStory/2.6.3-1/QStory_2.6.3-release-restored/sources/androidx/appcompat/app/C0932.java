package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0932 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0931 f600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0953 f601;

    public C0932(C0931 c0931, C0953 c0953) {
        this.f600 = c0931;
        this.f601 = c0953;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0931 c0931 = this.f600;
        DialogInterface.OnClickListener onClickListener = c0931.f596;
        C0953 c0953 = this.f601;
        onClickListener.onClick(c0953.f640, i);
        if (c0931.f598) {
            return;
        }
        c0953.f640.dismiss();
    }
}
