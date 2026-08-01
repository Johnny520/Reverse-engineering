package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子世楪兰哲苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1031 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f3025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1095 f3026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6543 f3027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0580 f3028;

    public C1031(InterfaceC1095 interfaceC1095, InterfaceC0580 interfaceC0580, InterfaceC6543 interfaceC6543, InterfaceC6543 interfaceC65432) {
        this.f3028 = interfaceC0580;
        this.f3026 = interfaceC1095;
        this.f3027 = interfaceC6543;
        this.f3025 = interfaceC65432;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1031.class != obj.getClass()) {
            return false;
        }
        C1031 c1031 = (C1031) obj;
        return AbstractC4395.m8907(this.f3028, c1031.f3028) && AbstractC4395.m8907(this.f3026, c1031.f3026) && this.f3027 == c1031.f3027 && this.f3025 == c1031.f3025;
    }

    public final int hashCode() {
        InterfaceC0580 interfaceC0580 = this.f3028;
        int iHashCode = (interfaceC0580 != null ? interfaceC0580.hashCode() : 0) * 31;
        InterfaceC1095 interfaceC1095 = this.f3026;
        int iHashCode2 = (this.f3027.hashCode() + AbstractC0053.m141(AbstractC0053.m141((iHashCode + (interfaceC1095 != null ? interfaceC1095.hashCode() : 0)) * 31, 31, false), 29791, true)) * 961;
        InterfaceC6543 interfaceC6543 = this.f3025;
        return Boolean.hashCode(true) + ((iHashCode2 + (interfaceC6543 != null ? interfaceC6543.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        boolean z;
        C1027 c1027 = (C1027) abstractC2128;
        c1027.f3009 = true;
        boolean z2 = c1027.f3021 == null;
        InterfaceC6543 interfaceC6543 = this.f3025;
        if (z2 != (interfaceC6543 == null)) {
            c1027.m1972();
            AbstractC1785.m3354(c1027);
            z = true;
        } else {
            z = false;
        }
        c1027.f3021 = interfaceC6543;
        boolean z3 = !c1027.f3122 ? true : z;
        c1027.m1973(this.f3028, this.f3026, false, true, null, null, this.f3027);
        if (z3) {
            C1627 c1627 = c1027.f3119;
            if (c1627 != null) {
                c1627.m3006();
            }
            c1027.m1932(false);
            c1027.m1932(true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1027(this.f3026, this.f3028, this.f3027, this.f3025);
    }
}
