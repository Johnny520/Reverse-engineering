package top.yukonga.miuix.kmp.utils;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import kotlin.Metadata;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final /* data */ class C6895 extends AbstractC2571 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6895);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "OverscrollElement(isVertical=true, nestedScrollToParent=true)";
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C6899 c6899 = (C6899) abstractC2961;
        c6899.getClass();
        boolean z = !c6899.f16948;
        c6899.f16948 = true;
        c6899.f16947 = true;
        if (z && c6899.f6624) {
            c6899.m11983();
        }
        C2583 c2583M3906 = AbstractC2620.m3906(c6899);
        C2586 c2586 = C2583.f5434;
        c2583M3906.m3785(false);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C6899();
    }
}
