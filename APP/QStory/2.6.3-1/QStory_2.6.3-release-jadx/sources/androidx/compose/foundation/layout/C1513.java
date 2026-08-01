package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰哲世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世楪哲兰;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1513 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final IntrinsicSize f2214;

    public C1513(IntrinsicSize intrinsicSize) {
        this.f2214 = intrinsicSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1513 c1513 = obj instanceof C1513 ? (C1513) obj : null;
        return c1513 != null && this.f2214 == c1513.f2214;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f2214.hashCode() * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1497 c1497 = (C1497) abstractC2961;
        c1497.f2177 = this.f2214;
        c1497.f2178 = true;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1497 c1497 = new C1497();
        c1497.f2177 = this.f2214;
        c1497.f2178 = true;
        return c1497;
    }
}
