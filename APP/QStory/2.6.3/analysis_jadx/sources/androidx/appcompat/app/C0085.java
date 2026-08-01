package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0085 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0084 f255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0106 f256;

    public C0085(C0084 c0084, C0106 c0106) {
        this.f255 = c0084;
        this.f256 = c0106;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0084 c0084 = this.f255;
        DialogInterface.OnClickListener onClickListener = c0084.f251;
        C0106 c0106 = this.f256;
        onClickListener.onClick(c0106.f295, i);
        if (c0084.f253) {
            return;
        }
        c0106.f295.dismiss();
    }
}
