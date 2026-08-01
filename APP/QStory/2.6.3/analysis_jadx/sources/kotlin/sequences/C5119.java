package kotlin.sequences;

import io.ktor.util.C4211;
import java.util.Iterator;
import kotlin.collections.C4338;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5119 implements InterfaceC5127, InterfaceC5118 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5127 f14654;

    public C5119(InterfaceC5127 interfaceC5127, int i) {
        interfaceC5127.getClass();
        this.f14654 = interfaceC5127;
        this.f14653 = i;
        if (i >= 0) {
            return;
        }
        C4211.m8601(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        return new C4338(this);
    }

    @Override // kotlin.sequences.InterfaceC5118
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5127 mo10107(int i) {
        int i2 = this.f14653 + i;
        return i2 < 0 ? new C5119(this, i) : new C5119(this.f14654, i2);
    }
}
