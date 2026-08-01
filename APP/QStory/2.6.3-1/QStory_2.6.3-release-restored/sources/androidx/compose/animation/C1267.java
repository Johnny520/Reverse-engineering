package androidx.compose.animation;

import androidx.compose.animation.core.C1200;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, m151d2 = {"Landroidx/compose/animation/飘花落叶言子楪苏哲世兰;", "S", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/animation/飘花落叶言子楪苏哲兰世;", "animation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1267<S> extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2230 f1719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1265 f1720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1200 f1721;

    public C1267(C1200 c1200, InterfaceC2230 interfaceC2230, C1265 c1265) {
        this.f1721 = c1200;
        this.f1719 = interfaceC2230;
        this.f1720 = c1265;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1267)) {
            return false;
        }
        C1267 c1267 = (C1267) obj;
        return AbstractC5227.m9466(c1267.f1721, this.f1721) && c1267.f1719.equals(this.f1719);
    }

    public final int hashCode() {
        int iHashCode = this.f1720.hashCode() * 31;
        C1200 c1200 = this.f1721;
        return this.f1719.hashCode() + ((iHashCode + (c1200 != null ? c1200.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1268 c1268 = (C1268) abstractC2961;
        c1268.f1722 = this.f1721;
        c1268.f1725 = this.f1719;
        c1268.f1724 = this.f1720;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1268 c1268 = new C1268();
        c1268.f1722 = this.f1721;
        c1268.f1725 = this.f1719;
        c1268.f1724 = this.f1720;
        c1268.f1723 = -9223372034707292160L;
        return c1268;
    }
}
