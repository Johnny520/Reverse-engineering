package p137;

import androidx.activity.AbstractC0900;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8216 extends AbstractC8218 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7387 f20375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f20377;

    public C8216(Object obj, String str, int i, InterfaceC7387 interfaceC7387) {
        super(obj);
        this.f20377 = str;
        this.f20376 = i;
        this.f20375 = interfaceC7387;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f20380);
        sb.append(", label=\"");
        sb.append(this.f20377);
        sb.append("\", leadingIcon=");
        return AbstractC0900.m716(sb, this.f20376, ')');
    }
}
