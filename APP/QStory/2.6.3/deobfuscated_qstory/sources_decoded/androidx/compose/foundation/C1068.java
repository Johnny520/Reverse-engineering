package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1588;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪苏哲兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1068 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1569 f3179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC1598 f3180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f3181;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f3182;

    public C1068(long j, C1588 c1588, InterfaceC1569 interfaceC1569, int i) {
        j = (i & 1) != 0 ? C1599.f4697 : j;
        c1588 = (i & 2) != 0 ? null : c1588;
        this.f3182 = j;
        this.f3180 = c1588;
        this.f3181 = 1.0f;
        this.f3179 = interfaceC1569;
    }

    public final boolean equals(Object obj) {
        C1068 c1068 = obj instanceof C1068 ? (C1068) obj : null;
        return c1068 != null && C1599.m2949(this.f3182, c1068.f3182) && AbstractC4395.m8907(this.f3180, c1068.f3180) && this.f3181 == c1068.f3181 && AbstractC4395.m8907(this.f3179, c1068.f3179);
    }

    public final int hashCode() {
        int i = C1599.f4699;
        int iHashCode = Long.hashCode(this.f3182) * 31;
        AbstractC1598 abstractC1598 = this.f3180;
        return this.f3179.hashCode() + AbstractC0053.m145((iHashCode + (abstractC1598 != null ? abstractC1598.hashCode() : 0)) * 31, this.f3181, 31);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1073 c1073 = (C1073) abstractC2128;
        c1073.f3185 = this.f3182;
        c1073.f3191 = this.f3180;
        c1073.f3190 = this.f3181;
        InterfaceC1569 interfaceC1569 = c1073.f3189;
        InterfaceC1569 interfaceC15692 = this.f3179;
        if (!AbstractC4395.m8907(interfaceC1569, interfaceC15692)) {
            c1073.f3189 = interfaceC15692;
            AbstractC1785.m3354(c1073);
        }
        AbstractC1785.m3351(c1073);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C1073 c1073 = new C1073();
        c1073.f3185 = this.f3182;
        c1073.f3191 = this.f3180;
        c1073.f3190 = this.f3181;
        c1073.f3189 = this.f3179;
        c1073.f3188 = 9205357640488583168L;
        return c1073;
    }
}
