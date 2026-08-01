package androidx.compose.p001ui.draw;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2951;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.painter.AbstractC2363;
import androidx.compose.p001ui.layout.C2565;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8155;

/* JADX INFO: renamed from: androidx.compose.ui.draw.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/draw/飘花落叶言子楪哲世兰苏;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/draw/飘花落叶言子楪哲苏世兰;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C2275 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2442 f4466;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final float f4467;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2951 f4468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2565 f4469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2363 f4470;

    public C2275(AbstractC2363 abstractC2363, InterfaceC2951 interfaceC2951, C2565 c2565, float f, C2442 c2442) {
        this.f4470 = abstractC2363;
        this.f4468 = interfaceC2951;
        this.f4469 = c2565;
        this.f4467 = f;
        this.f4466 = c2442;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2275)) {
            return false;
        }
        C2275 c2275 = (C2275) obj;
        return AbstractC5227.m9466(this.f4470, c2275.f4470) && AbstractC5227.m9466(this.f4468, c2275.f4468) && AbstractC5227.m9466(this.f4469, c2275.f4469) && Float.compare(this.f4467, c2275.f4467) == 0 && AbstractC5227.m9466(this.f4466, c2275.f4466);
    }

    public final int hashCode() {
        int iM705 = AbstractC0900.m705((this.f4469.hashCode() + ((this.f4468.hashCode() + AbstractC0900.m701(this.f4470.hashCode() * 31, 31, true)) * 31)) * 31, this.f4467, 31);
        C2442 c2442 = this.f4466;
        return iM705 + (c2442 == null ? 0 : c2442.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f4470 + ", sizeToIntrinsics=true, alignment=" + this.f4468 + ", contentScale=" + this.f4469 + ", alpha=" + this.f4467 + ", colorFilter=" + this.f4466 + ')';
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2278 c2278 = (C2278) abstractC2961;
        boolean z = c2278.f4483;
        AbstractC2363 abstractC2363 = this.f4470;
        boolean z2 = (z && C8155.m13074(c2278.f4478.mo3368(), abstractC2363.mo3368())) ? false : true;
        c2278.f4478 = abstractC2363;
        c2278.f4483 = true;
        c2278.f4482 = this.f4468;
        c2278.f4481 = this.f4469;
        c2278.f4480 = this.f4467;
        c2278.f4479 = this.f4466;
        if (z2) {
            AbstractC2620.m3910(c2278);
        }
        AbstractC2620.m3911(c2278);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C2278 c2278 = new C2278();
        c2278.f4478 = this.f4470;
        c2278.f4483 = true;
        c2278.f4482 = this.f4468;
        c2278.f4481 = this.f4469;
        c2278.f4480 = this.f4467;
        c2278.f4479 = this.f4466;
        return c2278;
    }
}
