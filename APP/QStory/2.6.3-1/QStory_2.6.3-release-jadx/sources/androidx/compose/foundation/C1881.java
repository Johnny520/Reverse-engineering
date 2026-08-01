package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.gestures.InterfaceC1354;
import androidx.compose.foundation.gestures.InterfaceC1401;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.C1414;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子哲世苏兰楪;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1881 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC1421 f3422;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1401 f3423;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f3424;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1922 f3425;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Orientation f3426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f3427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1354 f3428;

    public C1881(InterfaceC1354 interfaceC1354, Orientation orientation, boolean z, InterfaceC1401 interfaceC1401, C1414 c1414, boolean z2, InterfaceC1922 interfaceC1922) {
        this.f3428 = interfaceC1354;
        this.f3426 = orientation;
        this.f3427 = z;
        this.f3423 = interfaceC1401;
        this.f3422 = c1414;
        this.f3424 = z2;
        this.f3425 = interfaceC1922;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1881.class != obj.getClass()) {
            return false;
        }
        C1881 c1881 = (C1881) obj;
        return AbstractC5227.m9466(this.f3428, c1881.f3428) && this.f3426 == c1881.f3426 && this.f3427 == c1881.f3427 && AbstractC5227.m9466(this.f3423, c1881.f3423) && AbstractC5227.m9466(this.f3422, c1881.f3422) && this.f3424 == c1881.f3424 && AbstractC5227.m9466(this.f3425, c1881.f3425);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701(AbstractC0900.m701((this.f3426.hashCode() + (this.f3428.hashCode() * 31)) * 31, 31, this.f3427), 31, false);
        InterfaceC1401 interfaceC1401 = this.f3423;
        int iHashCode = (iM701 + (interfaceC1401 != null ? interfaceC1401.hashCode() : 0)) * 31;
        InterfaceC1421 interfaceC1421 = this.f3422;
        int iM7012 = AbstractC0900.m701((iHashCode + (interfaceC1421 != null ? interfaceC1421.hashCode() : 0)) * 961, 31, this.f3424);
        InterfaceC1922 interfaceC1922 = this.f3425;
        return iM7012 + (interfaceC1922 != null ? interfaceC1922.hashCode() : 0);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        ((C1880) abstractC2961).m2508(this.f3425, this.f3423, this.f3426, this.f3428, this.f3422, this.f3424, this.f3427);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        C1880 c1880 = new C1880();
        c1880.f3421 = this.f3428;
        c1880.f3420 = this.f3426;
        c1880.f3419 = this.f3427;
        c1880.f3418 = this.f3423;
        c1880.f3417 = this.f3422;
        c1880.f3414 = this.f3424;
        c1880.f3413 = this.f3425;
        return c1880;
    }
}
