package androidx.compose.foundation.selection;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.semantics.C2789;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/selection/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/selection/飘花落叶言子楪世哲兰苏;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1620 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7387 f2597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C2789 f2598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1421 f2599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f2600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f2601;

    public C1620(boolean z, InterfaceC1421 interfaceC1421, boolean z2, C2789 c2789, InterfaceC7387 interfaceC7387) {
        this.f2601 = z;
        this.f2599 = interfaceC1421;
        this.f2600 = z2;
        this.f2598 = c2789;
        this.f2597 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1620.class != obj.getClass()) {
            return false;
        }
        C1620 c1620 = (C1620) obj;
        return this.f2601 == c1620.f2601 && AbstractC5227.m9466(this.f2599, c1620.f2599) && this.f2600 == c1620.f2600 && this.f2598.equals(c1620.f2598) && this.f2597 == c1620.f2597;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2601) * 31;
        InterfaceC1421 interfaceC1421 = this.f2599;
        return this.f2597.hashCode() + AbstractC0900.m704(this.f2598.f6118, AbstractC0900.m701(AbstractC0900.m701((iHashCode + (interfaceC1421 != null ? interfaceC1421.hashCode() : 0)) * 961, 31, false), 31, this.f2600), 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1617 c1617 = (C1617) abstractC2961;
        boolean z = c1617.f2593;
        boolean z2 = this.f2601;
        if (z != z2) {
            c1617.f2593 = z2;
            AbstractC2620.m3914(c1617);
        }
        c1617.f2592 = this.f2597;
        c1617.m2533(this.f2599, null, false, this.f2600, null, this.f2598, c1617.f2591);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1617(this.f2601, this.f2599, this.f2600, this.f2598, this.f2597);
    }
}
