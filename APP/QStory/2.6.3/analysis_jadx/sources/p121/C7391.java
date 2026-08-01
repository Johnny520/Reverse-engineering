package p121;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7391 extends AbstractC7389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextClassification f20038;

    public C7391(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f20038 = textClassification;
        this.f20037 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f20035);
        sb.append(", textClassification=");
        sb.append(this.f20038);
        sb.append(", index=");
        return AbstractC0053.m156(sb, this.f20037, ')');
    }
}
