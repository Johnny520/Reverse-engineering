package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子世楪兰哲苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class C1031 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f3024;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1095 f3025;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6542 f3026;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0580 f3027;

    public C1031(InterfaceC1095 interfaceC1095, InterfaceC0580 interfaceC0580, InterfaceC6542 interfaceC6542, InterfaceC6542 interfaceC65422) {
        this.f3027 = interfaceC0580;
        this.f3025 = interfaceC1095;
        this.f3026 = interfaceC6542;
        this.f3024 = interfaceC65422;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1031.class != obj.getClass()) {
            return false;
        }
        C1031 c1031 = (C1031) obj;
        return AbstractC4394.m8917(this.f3027, c1031.f3027) && AbstractC4394.m8917(this.f3025, c1031.f3025) && this.f3026 == c1031.f3026 && this.f3024 == c1031.f3024;
    }

    public final int hashCode() {
        InterfaceC0580 interfaceC0580 = this.f3027;
        int iHashCode = (interfaceC0580 != null ? interfaceC0580.hashCode() : 0) * 31;
        InterfaceC1095 interfaceC1095 = this.f3025;
        int iHashCode2 = (this.f3026.hashCode() + AbstractC0053.m140(AbstractC0053.m140((iHashCode + (interfaceC1095 != null ? interfaceC1095.hashCode() : 0)) * 31, 31, false), 29791, true)) * 961;
        InterfaceC6542 interfaceC6542 = this.f3024;
        return Boolean.hashCode(true) + ((iHashCode2 + (interfaceC6542 != null ? interfaceC6542.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        boolean z;
        C1027 c1027 = (C1027) abstractC2128;
        c1027.f3008 = true;
        boolean z2 = c1027.f3020 == null;
        InterfaceC6542 interfaceC6542 = this.f3024;
        if (z2 != (interfaceC6542 == null)) {
            c1027.m1962();
            AbstractC1785.m3344(c1027);
            z = true;
        } else {
            z = false;
        }
        c1027.f3020 = interfaceC6542;
        boolean z3 = !c1027.f3121 ? true : z;
        c1027.m1963(this.f3027, this.f3025, false, true, null, null, this.f3026);
        if (z3) {
            C1627 c1627 = c1027.f3118;
            if (c1627 != null) {
                c1627.m2996();
            }
            c1027.m1922(false);
            c1027.m1922(true);
        }
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C1027(this.f3025, this.f3027, this.f3026, this.f3024);
    }
}
