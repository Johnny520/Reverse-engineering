package androidx.compose.foundation.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.semantics.C1954;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/selection/飘花落叶言子楪世哲兰苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C0780 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6558 f2252;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1954 f2253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC0580 f2254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f2255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f2256;

    public C0780(boolean z, InterfaceC0580 interfaceC0580, boolean z2, C1954 c1954, InterfaceC6558 interfaceC6558) {
        this.f2256 = z;
        this.f2254 = interfaceC0580;
        this.f2255 = z2;
        this.f2253 = c1954;
        this.f2252 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0780.class != obj.getClass()) {
            return false;
        }
        C0780 c0780 = (C0780) obj;
        return this.f2256 == c0780.f2256 && AbstractC4395.m8907(this.f2254, c0780.f2254) && this.f2255 == c0780.f2255 && this.f2253.equals(c0780.f2253) && this.f2252 == c0780.f2252;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f2256) * 31;
        InterfaceC0580 interfaceC0580 = this.f2254;
        return this.f2252.hashCode() + AbstractC0053.m144(this.f2253.f5773, AbstractC0053.m141(AbstractC0053.m141((iHashCode + (interfaceC0580 != null ? interfaceC0580.hashCode() : 0)) * 961, 31, false), 31, this.f2255), 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C0777 c0777 = (C0777) abstractC2128;
        boolean z = c0777.f2248;
        boolean z2 = this.f2256;
        if (z != z2) {
            c0777.f2248 = z2;
            AbstractC1785.m3354(c0777);
        }
        c0777.f2247 = this.f2252;
        c0777.m1973(this.f2254, null, false, this.f2255, null, this.f2253, c0777.f2246);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C0777(this.f2256, this.f2254, this.f2255, this.f2253, this.f2252);
    }
}
