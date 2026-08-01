package androidx.compose.ui.platform;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1736;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子楪哲兰世苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/platform/飘花落叶言子楪哲世苏兰;", "Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C1891 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1884 f5555;

    public C1891(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5555 = viewTreeObserverOnGlobalLayoutListenerC1884;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f5555.hashCode();
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ void mo1096(AbstractC2128 abstractC2128) {
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1890(this.f5555);
    }
}
