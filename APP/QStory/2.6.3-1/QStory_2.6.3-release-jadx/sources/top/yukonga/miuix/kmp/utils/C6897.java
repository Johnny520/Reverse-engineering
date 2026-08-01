package top.yukonga.miuix.kmp.utils;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.InterfaceC1933;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2622;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰哲苏世;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Ltop/yukonga/miuix/kmp/utils/飘花落叶言子世楪哲苏兰;", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final /* data */ class C6897 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1933 f16933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1421 f16934;

    public C6897(InterfaceC1421 interfaceC1421, InterfaceC1933 interfaceC1933) {
        this.f16934 = interfaceC1421;
        this.f16933 = interfaceC1933;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6897)) {
            return false;
        }
        C6897 c6897 = (C6897) obj;
        return AbstractC5227.m9466(this.f16934, c6897.f16934) && AbstractC5227.m9466(this.f16933, c6897.f16933);
    }

    public final int hashCode() {
        InterfaceC1421 interfaceC1421 = this.f16934;
        int iHashCode = (interfaceC1421 == null ? 0 : interfaceC1421.hashCode()) * 31;
        InterfaceC1933 interfaceC1933 = this.f16933;
        return AbstractC0900.m701((iHashCode + (interfaceC1933 != null ? interfaceC1933.hashCode() : 0)) * 31, 961, true);
    }

    public final String toString() {
        return "PressableElement(interactionSource=" + this.f16934 + ", indicationNodeFactory=" + this.f16933 + ", enabled=true, role=null, delay=null)";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1656(AbstractC2961 abstractC2961) {
        boolean z;
        C6881 c6881 = (C6881) abstractC2961;
        c6881.getClass();
        InterfaceC1421 interfaceC1421 = c6881.f16918;
        InterfaceC1421 interfaceC14212 = this.f16934;
        boolean z2 = true;
        boolean z3 = false;
        if (AbstractC5227.m9466(interfaceC1421, interfaceC14212)) {
            z = false;
        } else {
            c6881.m11976();
            c6881.f16918 = interfaceC14212;
            c6881.f16926 = interfaceC14212;
            z = true;
        }
        InterfaceC1933 interfaceC1933 = c6881.f16925;
        InterfaceC1933 interfaceC19332 = this.f16933;
        if (!AbstractC5227.m9466(interfaceC1933, interfaceC19332)) {
            c6881.f16925 = interfaceC19332;
            z = true;
        }
        if (!c6881.f16924) {
            AbstractC2620.m3914(c6881);
            c6881.f16924 = true;
        }
        boolean z4 = c6881.f16921;
        InterfaceC1421 interfaceC14213 = c6881.f16918;
        if (z4 == (interfaceC14213 == null && c6881.f16925 != null)) {
            z2 = z;
        } else {
            if (interfaceC14213 == null && c6881.f16925 != null) {
                z3 = true;
            }
            c6881.f16921 = z3;
            if (z3 || c6881.f16922 != null) {
            }
        }
        if (z2) {
            InterfaceC2622 interfaceC2622 = c6881.f16922;
            if (interfaceC2622 == null && c6881.f16921) {
                return;
            }
            if (interfaceC2622 != null) {
                c6881.m3928(interfaceC2622);
            }
            c6881.f16922 = null;
            c6881.m11977();
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C6881(this.f16934, this.f16933);
    }
}
