package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1349 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Orientation f1852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f1853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1354 f1854;

    public C1349(InterfaceC1354 interfaceC1354, Orientation orientation, boolean z, boolean z2) {
        this.f1854 = interfaceC1354;
        this.f1852 = orientation;
        this.f1853 = z;
        this.f1851 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1349)) {
            return false;
        }
        C1349 c1349 = (C1349) obj;
        return AbstractC5227.m9466(this.f1854, c1349.f1854) && this.f1852 == c1349.f1852 && this.f1853 == c1349.f1853 && this.f1851 == c1349.f1851;
    }

    public final int hashCode() {
        return AbstractC0900.m701(AbstractC0900.m701((this.f1852.hashCode() + (this.f1854.hashCode() * 31)) * 961, 31, this.f1853), 29791, this.f1851);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C1358) abstractC2961).m1852(null, null, this.f1852, this.f1854, null, this.f1853, this.f1851);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1358(null, null, this.f1852, this.f1854, null, this.f1853, this.f1851);
    }
}
