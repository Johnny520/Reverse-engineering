package androidx.compose.foundation;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.draw.C1436;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.node.AbstractC1736;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/飘花落叶言子楪兰世哲苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪兰世苏哲;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class C1056 extends AbstractC1736 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1571 f3136;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1569 f3137;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f3138;

    public C1056(float f, C1571 c1571, InterfaceC1569 interfaceC1569) {
        this.f3138 = f;
        this.f3136 = c1571;
        this.f3137 = interfaceC1569;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1056)) {
            return false;
        }
        C1056 c1056 = (C1056) obj;
        return C7893.m13318(this.f3138, c1056.f3138) && this.f3136.equals(c1056.f3136) && AbstractC4395.m8907(this.f3137, c1056.f3137);
    }

    public final int hashCode() {
        return this.f3137.hashCode() + ((this.f3136.hashCode() + (Float.hashCode(this.f3138) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C7893.m13317(this.f3138)) + ", brush=" + this.f3136 + ", shape=" + this.f3137 + ')';
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1096(AbstractC2128 abstractC2128) {
        C1057 c1057 = (C1057) abstractC2128;
        float f = c1057.f3142;
        C1436 c1436 = c1057.f3139;
        float f2 = this.f3138;
        if (!C7893.m13318(f, f2)) {
            c1057.f3142 = f2;
            c1436.m2572();
        }
        C1571 c1571 = c1057.f3141;
        C1571 c15712 = this.f3136;
        if (!AbstractC4395.m8907(c1571, c15712)) {
            c1057.f3141 = c15712;
            c1436.m2572();
        }
        InterfaceC1569 interfaceC1569 = c1057.f3140;
        InterfaceC1569 interfaceC15692 = this.f3137;
        if (AbstractC4395.m8907(interfaceC1569, interfaceC15692)) {
            return;
        }
        c1057.f3140 = interfaceC15692;
        c1436.m2572();
        AbstractC1785.m3354(c1057);
    }

    @Override // androidx.compose.ui.node.AbstractC1736
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2128 mo1097() {
        return new C1057(this.f3138, this.f3136, this.f3137);
    }
}
