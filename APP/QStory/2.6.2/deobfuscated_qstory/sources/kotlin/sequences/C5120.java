package kotlin.sequences;

import androidx.core.view.C2207;
import java.util.Iterator;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5120 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f14656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5126 f14657;

    public C5120(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557) {
        interfaceC5126.getClass();
        interfaceC6557.getClass();
        this.f14657 = interfaceC5126;
        this.f14656 = interfaceC6557;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        return new C2207(this);
    }
}
