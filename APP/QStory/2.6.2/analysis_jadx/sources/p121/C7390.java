package p121;

import android.view.textclassifier.TextClassification;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7390 extends AbstractC7388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextClassification f20043;

    public C7390(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.f20043 = textClassification;
        this.f20042 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f20040);
        sb.append(", textClassification=");
        sb.append(this.f20043);
        sb.append(", index=");
        return AbstractC0053.m154(sb, this.f20042, ')');
    }
}
