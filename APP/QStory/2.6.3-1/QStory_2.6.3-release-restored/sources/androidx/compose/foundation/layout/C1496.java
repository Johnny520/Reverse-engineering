package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏世楪兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世哲楪兰;", "foundation-layout"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C1496 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f2175;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f2176;

    public C1496(float f, boolean z) {
        this.f2176 = f;
        this.f2175 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1496 c1496 = obj instanceof C1496 ? (C1496) obj : null;
        return c1496 != null && this.f2176 == c1496.f2176 && this.f2175 == c1496.f2175;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2175) + (Float.hashCode(this.f2176) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1495 c1495 = (C1495) abstractC2961;
        c1495.f2173 = this.f2176;
        c1495.f2174 = this.f2175;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1495 c1495 = new C1495();
        c1495.f2173 = this.f2176;
        c1495.f2174 = this.f2175;
        return c1495;
    }
}
