package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/layout/飘花落叶言子楪兰哲世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/layout/飘花落叶言子世楪哲兰苏;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C2527 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7380 f5305;

    public C2527(InterfaceC7380 interfaceC7380) {
        this.f5305 = interfaceC7380;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2527) {
            return this.f5305 == ((C2527) obj).f5305;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5305.hashCode();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C2502) abstractC2961).f5236 = this.f5305;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2502 c2502 = new C2502();
        c2502.f5236 = this.f5305;
        return c2502;
    }
}
