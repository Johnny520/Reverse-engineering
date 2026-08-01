package kotlin.sequences;

import androidx.core.view.C2207;
import java.util.Iterator;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5121 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f14656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5127 f14657;

    public C5121(InterfaceC5127 interfaceC5127, InterfaceC6558 interfaceC6558) {
        interfaceC5127.getClass();
        interfaceC6558.getClass();
        this.f14657 = interfaceC5127;
        this.f14656 = interfaceC6558;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        return new C2207(this);
    }
}
