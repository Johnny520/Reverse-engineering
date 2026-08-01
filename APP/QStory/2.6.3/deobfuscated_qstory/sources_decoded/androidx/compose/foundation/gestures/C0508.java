package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0508 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Orientation f1507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f1508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0513 f1509;

    public C0508(InterfaceC0513 interfaceC0513, Orientation orientation, boolean z, boolean z2) {
        this.f1509 = interfaceC0513;
        this.f1507 = orientation;
        this.f1508 = z;
        this.f1506 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0508)) {
            return false;
        }
        C0508 c0508 = (C0508) obj;
        return AbstractC4395.m8907(this.f1509, c0508.f1509) && this.f1507 == c0508.f1507 && this.f1508 == c0508.f1508 && this.f1506 == c0508.f1506;
    }

    public final int hashCode() {
        return AbstractC0053.m141(AbstractC0053.m141((this.f1507.hashCode() + (this.f1509.hashCode() * 31)) * 961, 31, this.f1508), 29791, this.f1506);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        ((C0517) abstractC2128).m1292(null, null, this.f1507, this.f1509, null, this.f1508, this.f1506);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0517(null, null, this.f1507, this.f1509, null, this.f1508, this.f1506);
    }
}
