package kotlin.sequences;

import java.util.Iterator;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5123 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f14662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f14663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5126 f14664;

    public C5123(InterfaceC5126 interfaceC5126, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        interfaceC5126.getClass();
        interfaceC6557.getClass();
        interfaceC65572.getClass();
        this.f14664 = interfaceC5126;
        this.f14663 = interfaceC6557;
        this.f14662 = interfaceC65572;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        return new C5115(this);
    }
}
