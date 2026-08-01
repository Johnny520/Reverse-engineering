package androidx.compose.foundation;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子哲世兰楪苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子哲楪兰世苏;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1039 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1040 f3054;

    public C1039(C1040 c1040) {
        this.f3054 = c1040;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1039) {
            return AbstractC4395.m8907(this.f3054, ((C1039) obj).f3054);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0053.m141(this.f3054.hashCode() * 31, 31, false);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1046 c1046 = (C1046) abstractC2128;
        c1046.f3087 = this.f3054;
        c1046.f3088 = true;
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        C1046 c1046 = new C1046();
        c1046.f3087 = this.f3054;
        c1046.f3088 = true;
        return c1046;
    }
}
