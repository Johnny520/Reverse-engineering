package androidx.compose.foundation;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.draw.C2271;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子楪兰世哲苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子楪兰世苏哲;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final /* data */ class C1894 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2406 f3481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2404 f3482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f3483;

    public C1894(float f, C2406 c2406, InterfaceC2404 interfaceC2404) {
        this.f3483 = f;
        this.f3481 = c2406;
        this.f3482 = interfaceC2404;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1894)) {
            return false;
        }
        C1894 c1894 = (C1894) obj;
        return C8722.m13877(this.f3483, c1894.f3483) && this.f3481.equals(c1894.f3481) && AbstractC5227.m9466(this.f3482, c1894.f3482);
    }

    public final int hashCode() {
        return this.f3482.hashCode() + ((this.f3481.hashCode() + (Float.hashCode(this.f3483) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) C8722.m13876(this.f3483)) + ", brush=" + this.f3481 + ", shape=" + this.f3482 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C1895 c1895 = (C1895) abstractC2961;
        float f = c1895.f3487;
        C2271 c2271 = c1895.f3484;
        float f2 = this.f3483;
        if (!C8722.m13877(f, f2)) {
            c1895.f3487 = f2;
            c2271.m3132();
        }
        C2406 c2406 = c1895.f3486;
        C2406 c24062 = this.f3481;
        if (!AbstractC5227.m9466(c2406, c24062)) {
            c1895.f3486 = c24062;
            c2271.m3132();
        }
        InterfaceC2404 interfaceC2404 = c1895.f3485;
        InterfaceC2404 interfaceC24042 = this.f3482;
        if (AbstractC5227.m9466(interfaceC2404, interfaceC24042)) {
            return;
        }
        c1895.f3485 = interfaceC24042;
        c2271.m3132();
        AbstractC2620.m3914(c1895);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1895(this.f3483, this.f3481, this.f3482);
    }
}
