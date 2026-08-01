package androidx.compose.ui.layout;

import androidx.collection.C0242;
import androidx.compose.ui.node.AbstractC1745;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1753;
import androidx.compose.ui.node.C1771;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4211;
import java.util.Map;
import p052.InterfaceC6558;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1684 implements InterfaceC1686, InterfaceC1653, InterfaceC1659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1753 f4943;

    public C1684(C1753 c1753, InterfaceC1687 interfaceC1687) {
        this.f4943 = c1753;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    public final LayoutDirection getLayoutDirection() {
        return this.f4943.f5259.f5100;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1332(float f) {
        return f / this.f4943.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1333(int i) {
        return this.f4943.mo1333(i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1334(float f) {
        return this.f4943.mo1334(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1335(long j) {
        return this.f4943.mo1335(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC1695 mo1121(AbstractC1708 abstractC1708) {
        C1771 c1771;
        C1748 c1748 = this.f4943.f5259.f5120;
        if (c1748 == null) {
            AbstractC7936.m13424("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            C4211.m8602();
            return null;
        }
        if (!c1748.f5119) {
            return c1748.f5094.f5285;
        }
        C1748 c1748M3256 = c1748.m3256();
        return (c1748M3256 == null || (c1771 = c1748M3256.f5094.f5286) == null) ? ((C1748) ((C0242) c1748.m3257()).get(0)).f5094.f5285 : c1771;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1695 mo1122(InterfaceC1695 interfaceC1695) {
        C1663 c1663;
        if (interfaceC1695 instanceof C1663) {
            return interfaceC1695;
        }
        if (interfaceC1695 instanceof AbstractC1794) {
            AbstractC1745 abstractC1745Mo3285 = ((AbstractC1794) interfaceC1695).mo3285();
            return (abstractC1745Mo3285 == null || (c1663 = abstractC1745Mo3285.f5060) == null) ? interfaceC1695 : c1663;
        }
        AbstractC7936.m13424("Unsupported LayoutCoordinates");
        C4211.m8602();
        return null;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4943.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1339(long j) {
        return this.f4943.mo1339(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return this.f4943.mo1340(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        return this.f4943.mo1341(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1342(long j) {
        return this.f4943.mo1342(j);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final InterfaceC1657 mo1495(int i, int i2, Map map, InterfaceC6558 interfaceC6558) {
        return this.f4943.mo1496(i, i2, map, null, interfaceC6558);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1343(float f) {
        return this.f4943.mo1343(f);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1653
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final InterfaceC1657 mo1496(int i, int i2, Map map, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            AbstractC7936.m13423("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C1685(i, i2, map, interfaceC6558, interfaceC65582, this, 0);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4943.mo1257();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1699
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final boolean mo1497() {
        return false;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1344(float f) {
        return this.f4943.mo1256() * f;
    }
}
