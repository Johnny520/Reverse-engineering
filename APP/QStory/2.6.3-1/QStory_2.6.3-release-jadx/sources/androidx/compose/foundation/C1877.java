package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子哲世兰楪苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子哲楪兰世苏;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class C1877 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1878 f3399;

    public C1877(C1878 c1878) {
        this.f3399 = c1878;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1877) {
            return AbstractC5227.m9466(this.f3399, ((C1877) obj).f3399);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0900.m701(this.f3399.hashCode() * 31, 31, false);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1884 c1884 = (C1884) abstractC2961;
        c1884.f3432 = this.f3399;
        c1884.f3433 = true;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1884 c1884 = new C1884();
        c1884.f3432 = this.f3399;
        c1884.f3433 = true;
        return c1884;
    }
}
