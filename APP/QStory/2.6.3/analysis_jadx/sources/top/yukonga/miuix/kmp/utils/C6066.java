package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import kotlin.Metadata;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class C6066 extends AbstractC1736 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6066);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "OverscrollElement(isVertical=true, nestedScrollToParent=true)";
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C6070 c6070 = (C6070) abstractC2128;
        c6070.getClass();
        boolean z = !c6070.f16603;
        c6070.f16603 = true;
        c6070.f16602 = true;
        if (z && c6070.f6279) {
            c6070.m11424();
        }
        C1748 c1748M3346 = AbstractC1785.m3346(c6070);
        C1751 c1751 = C1748.f5089;
        c1748M3346.m3225(false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C6070();
    }
}
