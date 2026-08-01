package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2423;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪苏哲兰世;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1906 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2404 f3524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC2433 f3525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final float f3526;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f3527;

    public C1906(long j, C2423 c2423, InterfaceC2404 interfaceC2404, int i) {
        j = (i & 1) != 0 ? C2434.f5042 : j;
        c2423 = (i & 2) != 0 ? null : c2423;
        this.f3527 = j;
        this.f3525 = c2423;
        this.f3526 = 1.0f;
        this.f3524 = interfaceC2404;
    }

    public final boolean equals(Object obj) {
        C1906 c1906 = obj instanceof C1906 ? (C1906) obj : null;
        return c1906 != null && C2434.m3509(this.f3527, c1906.f3527) && AbstractC5227.m9466(this.f3525, c1906.f3525) && this.f3526 == c1906.f3526 && AbstractC5227.m9466(this.f3524, c1906.f3524);
    }

    public final int hashCode() {
        int i = C2434.f5044;
        int iHashCode = Long.hashCode(this.f3527) * 31;
        AbstractC2433 abstractC2433 = this.f3525;
        return this.f3524.hashCode() + AbstractC0900.m705((iHashCode + (abstractC2433 != null ? abstractC2433.hashCode() : 0)) * 31, this.f3526, 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1911 c1911 = (C1911) abstractC2961;
        c1911.f3530 = this.f3527;
        c1911.f3536 = this.f3525;
        c1911.f3535 = this.f3526;
        InterfaceC2404 interfaceC2404 = c1911.f3534;
        InterfaceC2404 interfaceC24042 = this.f3524;
        if (!AbstractC5227.m9466(interfaceC2404, interfaceC24042)) {
            c1911.f3534 = interfaceC24042;
            AbstractC2620.m3914(c1911);
        }
        AbstractC2620.m3911(c1911);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1911 c1911 = new C1911();
        c1911.f3530 = this.f3527;
        c1911.f3536 = this.f3525;
        c1911.f3535 = this.f3526;
        c1911.f3534 = this.f3524;
        c1911.f3533 = 9205357640488583168L;
        return c1911;
    }
}
