package kotlin.sequences;

import java.util.Iterator;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5114 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f14644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5126 f14646;

    public C5114(InterfaceC5126 interfaceC5126, boolean z, InterfaceC6557 interfaceC6557) {
        interfaceC6557.getClass();
        this.f14646 = interfaceC5126;
        this.f14645 = z;
        this.f14644 = interfaceC6557;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        return new C5115(this);
    }
}
