package androidx.compose.animation;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/animation/飘花落叶言子苏世兰哲楪;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/animation/飘花落叶言子苏哲楪世兰;", "animation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C1269 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1271 f1726;

    public C1269(C1271 c1271) {
        this.f1726 = c1271;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1269) && AbstractC5227.m9466(this.f1726, ((C1269) obj).f1726);
    }

    public final int hashCode() {
        return this.f1726.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.f1726 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1285 c1285 = (C1285) abstractC2961;
        C1271 c1271 = c1285.f1746;
        C1271 c12712 = this.f1726;
        if (!AbstractC5227.m9466(c12712, c1271)) {
            AbstractC2620.m3904(c1285, c12712.f1731);
        }
        c1285.f1746 = c12712;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1285 c1285 = new C1285();
        c1285.f1746 = this.f1726;
        return c1285;
    }
}
