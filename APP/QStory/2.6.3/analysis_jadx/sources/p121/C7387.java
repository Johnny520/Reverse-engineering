package p121;

import androidx.activity.AbstractC0053;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7387 extends AbstractC7389 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6558 f20030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f20032;

    public C7387(Object obj, String str, int i, InterfaceC6558 interfaceC6558) {
        super(obj);
        this.f20032 = str;
        this.f20031 = i;
        this.f20030 = interfaceC6558;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f20035);
        sb.append(", label=\"");
        sb.append(this.f20032);
        sb.append("\", leadingIcon=");
        return AbstractC0053.m156(sb, this.f20031, ')');
    }
}
