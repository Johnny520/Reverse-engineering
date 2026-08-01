package p137;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8220 extends AbstractC8218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextClassification f20383;

    public C8220(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f20383 = textClassification;
        this.f20382 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f20380);
        sb.append(", textClassification=");
        sb.append(this.f20383);
        sb.append(", index=");
        return AbstractC0900.m716(sb, this.f20382, ')');
    }
}
