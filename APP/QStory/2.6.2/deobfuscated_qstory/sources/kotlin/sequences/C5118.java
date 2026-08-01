package kotlin.sequences;

import io.ktor.util.C4210;
import java.util.Iterator;
import kotlin.collections.C4337;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5118 implements InterfaceC5126, InterfaceC5117 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5126 f14654;

    public C5118(InterfaceC5126 interfaceC5126, int i) {
        interfaceC5126.getClass();
        this.f14654 = interfaceC5126;
        this.f14653 = i;
        if (i >= 0) {
            return;
        }
        C4210.m8611(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        return new C4337(this);
    }

    @Override // kotlin.sequences.InterfaceC5117
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5126 mo10103(int i) {
        int i2 = this.f14653 + i;
        return i2 < 0 ? new C5118(this, i) : new C5118(this.f14654, i2);
    }
}
