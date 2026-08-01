package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.gestures.C1382;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1583;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪苏哲兰世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲苏兰世;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1566 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1382 f2381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Orientation f2382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1583 f2383;

    public C1566(C1583 c1583, C1382 c1382, Orientation orientation) {
        this.f2383 = c1583;
        this.f2381 = c1382;
        this.f2382 = orientation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1566)) {
            return false;
        }
        C1566 c1566 = (C1566) obj;
        return AbstractC5227.m9466(this.f2383, c1566.f2383) && AbstractC5227.m9466(this.f2381, c1566.f2381) && this.f2382 == c1566.f2382;
    }

    public final int hashCode() {
        return this.f2382.hashCode() + AbstractC0900.m701((this.f2381.hashCode() + (this.f2383.hashCode() * 31)) * 31, 31, false);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1560 c1560 = (C1560) abstractC2961;
        c1560.f2369 = this.f2383;
        c1560.f2371 = this.f2381;
        c1560.f2370 = this.f2382;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1560 c1560 = new C1560();
        c1560.f2369 = this.f2383;
        c1560.f2371 = this.f2381;
        c1560.f2370 = this.f2382;
        return c1560;
    }
}
