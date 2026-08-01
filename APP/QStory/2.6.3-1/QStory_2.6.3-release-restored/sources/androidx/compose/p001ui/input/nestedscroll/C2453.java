package androidx.compose.p001ui.input.nestedscroll;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/input/nestedscroll/飘花落叶言子楪世兰苏哲;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class C2453 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2454 f5078;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2455 f5079;

    public C2453(InterfaceC2455 interfaceC2455, C2454 c2454) {
        this.f5079 = interfaceC2455;
        this.f5078 = c2454;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2453)) {
            return false;
        }
        C2453 c2453 = (C2453) obj;
        return c2453.f5079.equals(this.f5079) && AbstractC5227.m9466(c2453.f5078, this.f5078);
    }

    public final int hashCode() {
        int iHashCode = this.f5079.hashCode() * 31;
        C2454 c2454 = this.f5078;
        return iHashCode + (c2454 != null ? c2454.hashCode() : 0);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        C2451 c2451 = (C2451) abstractC2961;
        c2451.f5074 = this.f5079;
        C2454 c2454 = c2451.f5077;
        if (c2454.f5083 == c2451) {
            c2454.f5083 = null;
        }
        C2454 c24542 = this.f5078;
        if (c24542 == null) {
            c2451.f5077 = new C2454();
        } else if (c24542 != c2454) {
            c2451.f5077 = c24542;
        }
        if (c2451.f6624) {
            C2454 c24543 = c2451.f5077;
            c24543.f5083 = c2451;
            c24543.f5082 = null;
            c2451.f5076 = null;
            c24543.f5081 = new NestedScrollNode$updateDispatcherFields$1(c2451);
            c2451.f5077.f5080 = c2451.m4427();
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        return new C2451(this.f5079, this.f5078);
    }
}
