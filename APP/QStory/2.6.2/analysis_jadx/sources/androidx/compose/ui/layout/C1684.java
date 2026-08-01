package androidx.compose.ui.layout;

import androidx.collection.C0242;
import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1753;
import androidx.compose.ui.node.C1771;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4210;
import java.util.Map;
import p052.InterfaceC6557;
import p210.AbstractC7935;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1684 implements InterfaceC1686, InterfaceC1653, InterfaceC1659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1753 f4942;

    public C1684(C1753 c1753, InterfaceC1687 interfaceC1687) {
        this.f4942 = c1753;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4942.f5258.f5099;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1322(float f) {
        return f / this.f4942.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1323(int i) {
        return this.f4942.mo1323(i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1324(float f) {
        return this.f4942.mo1324(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1325(long j) {
        return this.f4942.mo1325(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC1695 mo1120(AbstractC1708 abstractC1708) {
        C1771 c1771;
        C1748 c1748 = this.f4942.f5258.f5119;
        if (c1748 == null) {
            AbstractC7935.m13396("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            C4210.m8612();
            return null;
        }
        if (!c1748.f5118) {
            return c1748.f5093.f5284;
        }
        C1748 c1748M3246 = c1748.m3246();
        return (c1748M3246 == null || (c1771 = c1748M3246.f5093.f5285) == null) ? ((C1748) ((C0242) c1748.m3247()).get(0)).f5093.f5284 : c1771;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1695 mo1121(InterfaceC1695 interfaceC1695) {
        C1663 c1663;
        if (interfaceC1695 instanceof C1663) {
            return interfaceC1695;
        }
        if (interfaceC1695 instanceof AbstractC1794) {
            AbstractC1745 abstractC1745Mo3275 = ((AbstractC1794) interfaceC1695).mo3275();
            return (abstractC1745Mo3275 == null || (c1663 = abstractC1745Mo3275.f5059) == null) ? interfaceC1695 : c1663;
        }
        AbstractC7935.m13396("Unsupported LayoutCoordinates");
        C4210.m8612();
        return null;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4942.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1329(long j) {
        return this.f4942.mo1329(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return this.f4942.mo1330(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        return this.f4942.mo1331(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1332(long j) {
        return this.f4942.mo1332(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC1657 mo1485(int i, int i2, Map map, InterfaceC6557 interfaceC6557) {
        return this.f4942.mo1486(i, i2, map, null, interfaceC6557);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1333(float f) {
        return this.f4942.mo1333(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1486(int i, int i2, Map map, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC7935.m13395("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1685(i, i2, map, interfaceC6557, interfaceC65572, this, 0);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4942.mo1247();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1487() {
        return false;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1334(float f) {
        return this.f4942.mo1246() * f;
    }
}
