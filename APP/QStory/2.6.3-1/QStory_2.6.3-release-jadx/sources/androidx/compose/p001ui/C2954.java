package androidx.compose.p001ui;

import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/飘花落叶言子楪兰世哲苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/飘花落叶言子楪兰苏世哲;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final /* data */ class C2954 extends AbstractC2571 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2954) && Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C2956) abstractC2961).f6620 = 1.0f;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2956 c2956 = new C2956();
        c2956.f6620 = 1.0f;
        return c2956;
    }
}
