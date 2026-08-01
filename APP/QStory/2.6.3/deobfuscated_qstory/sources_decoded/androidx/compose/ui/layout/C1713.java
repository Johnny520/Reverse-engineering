package androidx.compose.ui.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子苏世楪哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/layout/飘花落叶言子苏世楪兰哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1713 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f4984;

    public C1713(InterfaceC6558 interfaceC6558) {
        this.f4984 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1713) {
            return this.f4984 == ((C1713) obj).f4984;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4984.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1712 c1712 = (C1712) abstractC2128;
        c1712.f4982 = this.f4984;
        c1712.f4983 = -9223372034707292160L;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C1712 c1712 = new C1712();
        c1712.f4982 = this.f4984;
        c1712.f4983 = -9223372034707292160L;
        return c1712;
    }
}
