package androidx.compose.p001ui.layout;

import androidx.collection.C1089;
import androidx.compose.p001ui.node.AbstractC2580;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2588;
import androidx.compose.p001ui.node.C2606;
import androidx.compose.p001ui.unit.LayoutDirection;
import io.ktor.util.C5043;
import java.util.Map;
import p068.InterfaceC7387;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2519 implements InterfaceC2521, InterfaceC2488, InterfaceC2494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2588 f5288;

    public C2519(C2588 c2588, InterfaceC2522 interfaceC2522) {
        this.f5288 = c2588;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    public final LayoutDirection getLayoutDirection() {
        return this.f5288.f5604.f5445;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return f / this.f5288.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f5288.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f5288.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f5288.mo1895(j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC2530 mo1681(AbstractC2543 abstractC2543) {
        C2606 c2606;
        C2583 c2583 = this.f5288.f5604.f5465;
        if (c2583 == null) {
            AbstractC8765.m13983("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            C5043.m9161();
            return null;
        }
        if (!c2583.f5464) {
            return c2583.f5439.f5630;
        }
        C2583 c2583M3816 = c2583.m3816();
        return (c2583M3816 == null || (c2606 = c2583M3816.f5439.f5631) == null) ? ((C2583) ((C1089) c2583.m3817()).get(0)).f5439.f5630 : c2606;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC2530 mo1682(InterfaceC2530 interfaceC2530) {
        C2498 c2498;
        if (interfaceC2530 instanceof C2498) {
            return interfaceC2530;
        }
        if (interfaceC2530 instanceof AbstractC2629) {
            AbstractC2580 abstractC2580Mo3845 = ((AbstractC2629) interfaceC2530).mo3845();
            return (abstractC2580Mo3845 == null || (c2498 = abstractC2580Mo3845.f5405) == null) ? interfaceC2530 : c2498;
        }
        AbstractC8765.m13983("Unsupported LayoutCoordinates");
        C5043.m9161();
        return null;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5288.mo1816();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f5288.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f5288.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f5288.mo1901(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f5288.mo1902(j);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC2492 mo2055(int i, int i2, Map map, InterfaceC7387 interfaceC7387) {
        return this.f5288.mo2056(i, i2, map, null, interfaceC7387);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f5288.mo1903(f);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2488
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC2492 mo2056(int i, int i2, Map map, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC8765.m13982("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2520(i, i2, map, interfaceC7387, interfaceC73872, this, 0);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5288.mo1817();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2534
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo2057() {
        return false;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f5288.mo1816() * f;
    }
}
