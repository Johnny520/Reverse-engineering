package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪哲兰苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/lazy/layout/飘花落叶言子楪兰世苏哲;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class C0717 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0712 f2019;

    public C0717(C0712 c0712) {
        this.f2019 = c0712;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0717) && this.f2019 == ((C0717) obj).f2019;
    }

    public final int hashCode() {
        return this.f2019.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f2019 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0709 c0709 = (C0709) abstractC2128;
        C0712 c0712 = c0709.f1998;
        C0712 c07122 = this.f2019;
        if (AbstractC4395.m8907(c0712, c07122) || !c0709.f6292.f6279) {
            return;
        }
        C0712 c07123 = c0709.f1998;
        c07123.m1510();
        c07123.f2011 = null;
        c0709.f1998 = c07122;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C0709 c0709 = new C0709();
        c0709.f1998 = this.f2019;
        return c0709;
    }
}
