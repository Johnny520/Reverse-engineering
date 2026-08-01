package kotlin.sequences;

import java.util.Iterator;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5124 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f14662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f14663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5127 f14664;

    public C5124(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        interfaceC5127.getClass();
        interfaceC6558.getClass();
        interfaceC65582.getClass();
        this.f14664 = interfaceC5127;
        this.f14663 = interfaceC6558;
        this.f14662 = interfaceC65582;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        return new C5116(this);
    }
}
