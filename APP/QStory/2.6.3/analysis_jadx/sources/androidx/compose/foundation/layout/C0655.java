package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/飘花落叶言子苏世楪兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/layout/飘花落叶言子苏世哲楪兰;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C0655 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f1830;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f1831;

    public C0655(float f, boolean z) {
        this.f1831 = f;
        this.f1830 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0655 c0655 = obj instanceof C0655 ? (C0655) obj : null;
        return c0655 != null && this.f1831 == c0655.f1831 && this.f1830 == c0655.f1830;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1830) + (Float.hashCode(this.f1831) * 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0654 c0654 = (C0654) abstractC2128;
        c0654.f1828 = this.f1831;
        c0654.f1829 = this.f1830;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0654 c0654 = new C0654();
        c0654.f1828 = this.f1831;
        c0654.f1829 = this.f1830;
        return c0654;
    }
}
