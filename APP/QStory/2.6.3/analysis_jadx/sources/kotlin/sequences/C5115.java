package kotlin.sequences;

import java.util.Iterator;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5115 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f14644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5127 f14646;

    public C5115(InterfaceC5127 interfaceC5127, boolean z, InterfaceC6558 interfaceC6558) {
        interfaceC6558.getClass();
        this.f14646 = interfaceC5127;
        this.f14645 = z;
        this.f14644 = interfaceC6558;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        return new C5116(this);
    }
}
