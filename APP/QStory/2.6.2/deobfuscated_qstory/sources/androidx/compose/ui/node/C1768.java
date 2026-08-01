package androidx.compose.ui.node;

import androidx.collection.C0236;
import androidx.compose.animation.C0417;
import androidx.compose.foundation.lazy.C0751;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2124;
import androidx.compose.ui.draw.InterfaceC1437;
import androidx.compose.ui.focus.InterfaceC1456;
import androidx.compose.ui.focus.InterfaceC1462;
import androidx.compose.ui.focus.InterfaceC1469;
import androidx.compose.ui.focus.InterfaceC1473;
import androidx.compose.ui.focus.InterfaceC1476;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.input.pointer.C1640;
import androidx.compose.ui.input.pointer.C1652;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1668;
import androidx.compose.ui.layout.InterfaceC1695;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.modifier.C1735;
import androidx.compose.ui.modifier.InterfaceC1733;
import androidx.compose.ui.platform.C1911;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.C1940;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.semantics.InterfaceC1944;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.C5175;
import kotlin.InterfaceC5167;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p205.InterfaceC7895;
import p210.AbstractC7935;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1768 extends AbstractC2128 implements InterfaceC1773, InterfaceC1781, InterfaceC1761, InterfaceC1796, InterfaceC1733, InterfaceC1799, InterfaceC1776, InterfaceC1782, InterfaceC1462, InterfaceC1469, InterfaceC1473, InterfaceC1804, InterfaceC1437 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC2124 f5191;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public HashSet f5192;

    @Override // androidx.compose.ui.draw.InterfaceC1437
    public final LayoutDirection getLayoutDirection() {
        return AbstractC1785.m3336(this).f5099;
    }

    public final String toString() {
        return this.f5191.toString();
    }

    @Override // androidx.compose.ui.modifier.InterfaceC1733
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final C1735 mo3134() {
        return C1735.f5010;
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3306() {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        ((C1640) interfaceC2124).f4797.getClass();
    }

    @Override // androidx.compose.ui.focus.InterfaceC1469
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo2623(InterfaceC1476 interfaceC1476) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        AbstractC7935.m13395("applyFocusProperties called on wrong node");
        interfaceC2124.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo2561() {
        AbstractC1785.m3341(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1214() {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        ((C1640) interfaceC2124).f4797.m3010();
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1281(C1652 c1652, PointerEventPass pointerEventPass, long j) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        ((C1640) interfaceC2124).f4797.m3009(c1652, pointerEventPass);
    }

    @Override // androidx.compose.ui.node.InterfaceC1782
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo1628(AbstractC1794 abstractC1794) {
        this.f5191.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.node.InterfaceC1799
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final Object mo1366(Object obj) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return (C0417) interfaceC2124;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m3307(boolean z) {
        if (!this.f6278) {
            AbstractC7935.m13395("initializeModifier called on unattached node");
        }
        InterfaceC2124 interfaceC2124 = this.f5191;
        if ((this.f6290 & 4) != 0 && !z) {
            AbstractC1785.m3338(this, 2).m3372();
        }
        if ((this.f6290 & 2) != 0) {
            InterfaceC6557 interfaceC6557 = AbstractC1767.f5190;
            C1760 c1760 = AbstractC1785.m3336(this).f5093.f5283;
            c1760.getClass();
            if (c1760.f5177) {
                AbstractC1794 abstractC1794 = this.f6285;
                abstractC1794.getClass();
                ((C1753) abstractC1794).m3277(this);
                InterfaceC1806 interfaceC1806 = abstractC1794.f5259;
                if (interfaceC1806 != null) {
                    ((C1911) interfaceC1806).m3600();
                }
            }
            if (!z) {
                AbstractC1785.m3338(this, 2).m3372();
                AbstractC1785.m3336(this).m3236();
            }
        }
        if (interfaceC2124 instanceof C0751) {
            ((C0751) interfaceC2124).f2174.f2124 = AbstractC1785.m3336(this);
        }
        int i = this.f6290;
        if ((i & 16) != 0 && (interfaceC2124 instanceof C1640)) {
            ((C1640) interfaceC2124).f4797.f4796 = this.f6285;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).m3517();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3308() {
        if (this.f6278) {
            this.f5192.clear();
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).getSnapshotObserver();
            snapshotObserver.f5273.m2236(this, AbstractC1767.f5190, new InterfaceC6542() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3139invoke() {
                    this.this$0.f5191.getClass();
                    throw new ClassCastException();
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3139invoke();
                    return C5175.f14739;
                }
            });
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1761
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1284(InterfaceC1944 interfaceC1944) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        C1940 c1940 = (C1940) interfaceC2124;
        C1956 c1956 = new C1956();
        c1956.f5777 = c1940.f5704;
        c1940.f5703.invoke(c1956);
        interfaceC1944.getClass();
        C1956 c19562 = (C1956) interfaceC1944;
        C0236 c0236 = c19562.f5778;
        if (c1956.f5777) {
            c19562.f5777 = true;
        }
        if (c1956.f5775) {
            c19562.f5775 = true;
        }
        C0236 c02362 = c1956.f5778;
        Object[] objArr = c02362.f880;
        Object[] objArr2 = c02362.f879;
        long[] jArr = c02362.f881;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C1947 c1947 = (C1947) obj;
                        if (!c0236.m752(c1947)) {
                            c0236.m754(c1947, obj2);
                        } else if (obj2 instanceof C1941) {
                            Object objM756 = c0236.m756(c1947);
                            objM756.getClass();
                            C1941 c1941 = (C1941) objM756;
                            String str = c1941.f5706;
                            if (str == null) {
                                str = ((C1941) obj2).f5706;
                            }
                            InterfaceC5167 interfaceC5167 = c1941.f5705;
                            if (interfaceC5167 == null) {
                                interfaceC5167 = ((C1941) obj2).f5705;
                            }
                            c0236.m754(c1947, new C1941(str, interfaceC5167));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC1462
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo1638(InterfaceC1456 interfaceC1456) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        AbstractC7935.m13395("onFocusEvent called on wrong node");
        interfaceC2124.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1125() {
        if (!this.f6278) {
            AbstractC7935.m13395("unInitializeModifier called on unattached node");
        }
        if ((this.f6290 & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3337(this)).m3517();
        }
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        m3307(true);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1073(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return ((InterfaceC1668) interfaceC2124).m3085(abstractC1754, interfaceC1698, i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1074(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return ((InterfaceC1668) interfaceC2124).m3086(abstractC1754, interfaceC1698, i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1075(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return ((InterfaceC1668) interfaceC2124).m3087(abstractC1754, interfaceC1698, i);
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7895 mo2563() {
        return AbstractC1785.m3336(this).f5098;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1076(AbstractC1754 abstractC1754, InterfaceC1698 interfaceC1698, int i) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return ((InterfaceC1668) interfaceC2124).m3088(abstractC1754, interfaceC1698, i);
    }

    @Override // androidx.compose.ui.node.InterfaceC1804
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3245() {
        return this.f6278;
    }

    @Override // androidx.compose.ui.node.InterfaceC1787, androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1286() {
        if (this.f5191 instanceof C1640) {
            mo1214();
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        return ((InterfaceC1668) interfaceC2124).mo1862(interfaceC1653, interfaceC1655, j);
    }

    @Override // androidx.compose.ui.draw.InterfaceC1437
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final long mo2564() {
        return AbstractC8189.m13654(AbstractC1785.m3338(this, 128).f4997);
    }

    @Override // androidx.compose.ui.node.InterfaceC1796
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean mo3309() {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        ((C1640) interfaceC2124).f4797.getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        InterfaceC2124 interfaceC2124 = this.f5191;
        interfaceC2124.getClass();
        ((C1758) interfaceC1506).m3301();
    }

    @Override // androidx.compose.ui.node.InterfaceC1776, androidx.compose.ui.node.InterfaceC1740
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1311(long j) {
    }

    @Override // androidx.compose.ui.node.InterfaceC1776
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo1566(InterfaceC1695 interfaceC1695) {
    }
}
