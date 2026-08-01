package p386;

import android.widget.TextView;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰世子哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextView f25454;

    public C9080(TextView textView) {
        this.f25454 = textView;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14657(int i) {
        TextView textView = this.f25454;
        if (i <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(i > 99 ? "99+" : String.valueOf(i));
        }
    }
}
