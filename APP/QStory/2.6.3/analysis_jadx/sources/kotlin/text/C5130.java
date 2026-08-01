package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.InterfaceC5127;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5130 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6554 f14674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f14676;

    public C5130(CharSequence charSequence, int i, InterfaceC6554 interfaceC6554) {
        charSequence.getClass();
        this.f14676 = charSequence;
        this.f14675 = i;
        this.f14674 = interfaceC6554;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        return new C5131(this);
    }
}
