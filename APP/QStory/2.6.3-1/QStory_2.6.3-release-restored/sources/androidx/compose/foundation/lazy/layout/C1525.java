package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1584;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子世哲兰楪苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1525 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f2256;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1584 f2257;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f2258;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7372 f2259;

    public C1525(InterfaceC7372 interfaceC7372, C1584 c1584, Orientation orientation, boolean z) {
        this.f2259 = interfaceC7372;
        this.f2257 = c1584;
        this.f2258 = orientation;
        this.f2256 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1525)) {
            return false;
        }
        C1525 c1525 = (C1525) obj;
        return this.f2259 == c1525.f2259 && AbstractC5227.m9466(this.f2257, c1525.f2257) && this.f2258 == c1525.f2258 && this.f2256 == c1525.f2256;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0900.m701((this.f2258.hashCode() + ((this.f2257.hashCode() + (this.f2259.hashCode() * 31)) * 31)) * 31, 31, this.f2256);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1521 c1521 = (C1521) abstractC2961;
        c1521.f2243 = this.f2259;
        c1521.f2249 = this.f2257;
        Orientation orientation = c1521.f2248;
        Orientation orientation2 = this.f2258;
        if (orientation != orientation2) {
            c1521.f2248 = orientation2;
            AbstractC2620.m3914(c1521);
        }
        boolean z = c1521.f2247;
        boolean z2 = this.f2256;
        if (z == z2) {
            return;
        }
        c1521.f2247 = z2;
        c1521.m2040();
        AbstractC2620.m3914(c1521);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1521(this.f2259, this.f2257, this.f2258, this.f2256);
    }
}
