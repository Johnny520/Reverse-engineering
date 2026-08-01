package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1618 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1619 f4733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1620 f4734;

    public C1618(InterfaceC1620 interfaceC1620, C1619 c1619) {
        this.f4734 = interfaceC1620;
        this.f4733 = c1619;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1618)) {
            return false;
        }
        C1618 c1618 = (C1618) obj;
        return c1618.f4734.equals(this.f4734) && AbstractC4395.m8907(c1618.f4733, this.f4733);
    }

    public final int hashCode() {
        int iHashCode = this.f4734.hashCode() * 31;
        C1619 c1619 = this.f4733;
        return iHashCode + (c1619 != null ? c1619.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1616 c1616 = (C1616) abstractC2128;
        c1616.f4729 = this.f4734;
        C1619 c1619 = c1616.f4732;
        if (c1619.f4738 == c1616) {
            c1619.f4738 = null;
        }
        C1619 c16192 = this.f4733;
        if (c16192 == null) {
            c1616.f4732 = new C1619();
        } else if (c16192 != c1619) {
            c1616.f4732 = c16192;
        }
        if (c1616.f6279) {
            C1619 c16193 = c1616.f4732;
            c16193.f4738 = c1616;
            c16193.f4737 = null;
            c1616.f4731 = null;
            c16193.f4736 = new NestedScrollNode$updateDispatcherFields$1(c1616);
            c1616.f4732.f4735 = c1616.m3867();
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1616(this.f4734, this.f4733);
    }
}
