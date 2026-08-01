package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import kotlin.Metadata;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰世苏哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Ltop/yukonga/miuix/kmp/utils/飘花落叶言子楪兰苏哲世;", "miuix"}, k = 1, mv = {2, 3, 0}, xi = 48)
final /* data */ class C6060 extends AbstractC1736 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6060);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "OverscrollElement(isVertical=true, nestedScrollToParent=true)";
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1095(AbstractC2128 abstractC2128) {
        C6064 c6064 = (C6064) abstractC2128;
        c6064.getClass();
        boolean z = !c6064.f16594;
        c6064.f16594 = true;
        c6064.f16593 = true;
        if (z && c6064.f6278) {
            c6064.m11364();
        }
        C1748 c1748M3336 = AbstractC1785.m3336(c6064);
        C1751 c1751 = C1748.f5088;
        c1748M3336.m3215(false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1096() {
        return new C6064();
    }
}
