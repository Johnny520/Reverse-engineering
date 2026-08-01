package kotlin.text;

import java.util.Iterator;
import kotlin.sequences.InterfaceC5126;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5129 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6553 f14674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final CharSequence f14676;

    public C5129(CharSequence charSequence, int i, InterfaceC6553 interfaceC6553) {
        charSequence.getClass();
        this.f14676 = charSequence;
        this.f14675 = i;
        this.f14674 = interfaceC6553;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        return new C5130(this);
    }
}
