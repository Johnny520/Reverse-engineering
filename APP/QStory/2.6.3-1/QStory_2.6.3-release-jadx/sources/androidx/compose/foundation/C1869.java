package androidx.compose.foundation;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/foundation/飘花落叶言子世楪兰哲苏;", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C1869 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f3370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1933 f3371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7372 f3372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1421 f3373;

    public C1869(InterfaceC1933 interfaceC1933, InterfaceC1421 interfaceC1421, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722) {
        this.f3373 = interfaceC1421;
        this.f3371 = interfaceC1933;
        this.f3372 = interfaceC7372;
        this.f3370 = interfaceC73722;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1869.class != obj.getClass()) {
            return false;
        }
        C1869 c1869 = (C1869) obj;
        return AbstractC5227.m9466(this.f3373, c1869.f3373) && AbstractC5227.m9466(this.f3371, c1869.f3371) && this.f3372 == c1869.f3372 && this.f3370 == c1869.f3370;
    }

    public final int hashCode() {
        InterfaceC1421 interfaceC1421 = this.f3373;
        int iHashCode = (interfaceC1421 != null ? interfaceC1421.hashCode() : 0) * 31;
        InterfaceC1933 interfaceC1933 = this.f3371;
        int iHashCode2 = (this.f3372.hashCode() + AbstractC0900.m701(AbstractC0900.m701((iHashCode + (interfaceC1933 != null ? interfaceC1933.hashCode() : 0)) * 31, 31, false), 29791, true)) * 961;
        InterfaceC7372 interfaceC7372 = this.f3370;
        return Boolean.hashCode(true) + ((iHashCode2 + (interfaceC7372 != null ? interfaceC7372.hashCode() : 0)) * 961);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        boolean z;
        C1865 c1865 = (C1865) abstractC2961;
        c1865.f3354 = true;
        boolean z2 = c1865.f3366 == null;
        InterfaceC7372 interfaceC7372 = this.f3370;
        if (z2 != (interfaceC7372 == null)) {
            c1865.m2532();
            AbstractC2620.m3914(c1865);
            z = true;
        } else {
            z = false;
        }
        c1865.f3366 = interfaceC7372;
        boolean z3 = !c1865.f3467 ? true : z;
        c1865.m2533(this.f3373, this.f3371, false, true, null, null, this.f3372);
        if (z3) {
            C2462 c2462 = c1865.f3464;
            if (c2462 != null) {
                c2462.m3566();
            }
            c1865.m2492(false);
            c1865.m2492(true);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C1865(this.f3371, this.f3373, this.f3372, this.f3370);
    }
}
