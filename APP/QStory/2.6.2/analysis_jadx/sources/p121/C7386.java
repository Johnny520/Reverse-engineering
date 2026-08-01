package p121;

import androidx.activity.AbstractC0053;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7386 extends AbstractC7388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6557 f20035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f20037;

    public C7386(Object obj, String str, int i, InterfaceC6557 interfaceC6557) {
        super(obj);
        this.f20037 = str;
        this.f20036 = i;
        this.f20035 = interfaceC6557;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f20040);
        sb.append(", label=\"");
        sb.append(this.f20037);
        sb.append("\", leadingIcon=");
        return AbstractC0053.m154(sb, this.f20036, ')');
    }
}
