package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子哲楪兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0508 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Orientation f1506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f1507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0513 f1508;

    public C0508(InterfaceC0513 interfaceC0513, Orientation orientation, boolean z, boolean z2) {
        this.f1508 = interfaceC0513;
        this.f1506 = orientation;
        this.f1507 = z;
        this.f1505 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0508)) {
            return false;
        }
        C0508 c0508 = (C0508) obj;
        return AbstractC4394.m8917(this.f1508, c0508.f1508) && this.f1506 == c0508.f1506 && this.f1507 == c0508.f1507 && this.f1505 == c0508.f1505;
    }

    public final int hashCode() {
        return AbstractC0053.m140(AbstractC0053.m140((this.f1506.hashCode() + (this.f1508.hashCode() * 31)) * 961, 31, this.f1507), 29791, this.f1505);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        ((C0517) abstractC2128).m1282(null, null, this.f1506, this.f1508, null, this.f1507, this.f1505);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C0517(null, null, this.f1506, this.f1508, null, this.f1507, this.f1505);
    }
}
