package androidx.compose.p001ui.node;

import androidx.collection.C1083;
import androidx.compose.animation.C1263;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.C1592;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2957;
import androidx.compose.p001ui.draw.InterfaceC2272;
import androidx.compose.p001ui.focus.InterfaceC2291;
import androidx.compose.p001ui.focus.InterfaceC2297;
import androidx.compose.p001ui.focus.InterfaceC2304;
import androidx.compose.p001ui.focus.InterfaceC2308;
import androidx.compose.p001ui.focus.InterfaceC2311;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.input.pointer.C2475;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2503;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.modifier.C2570;
import androidx.compose.p001ui.modifier.InterfaceC2568;
import androidx.compose.p001ui.platform.C2746;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.C2775;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.HashSet;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.InterfaceC8725;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2603 extends AbstractC2961 implements InterfaceC2608, InterfaceC2616, InterfaceC2596, InterfaceC2631, InterfaceC2568, InterfaceC2634, InterfaceC2611, InterfaceC2617, InterfaceC2297, InterfaceC2304, InterfaceC2308, InterfaceC2639, InterfaceC2272 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC2957 f5537;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public HashSet f5538;

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    public final LayoutDirection getLayoutDirection() {
        return AbstractC2620.m3906(this).f5445;
    }

    public final String toString() {
        return this.f5537.toString();
    }

    @Override // androidx.compose.p001ui.modifier.InterfaceC2568
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final C2570 mo3704() {
        return C2570.f5356;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3876() {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        ((C2475) interfaceC2957).f5143.getClass();
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2304
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final void mo3193(InterfaceC2311 interfaceC2311) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        AbstractC8765.m13982("applyFocusProperties called on wrong node");
        interfaceC2957.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo3131() {
        AbstractC2620.m3911(this);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        ((C2475) interfaceC2957).f5143.m3580();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        ((C2475) interfaceC2957).f5143.m3579(c2487, pointerEventPass);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2617
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏 */
    public final void mo2198(AbstractC2629 abstractC2629) {
        this.f5537.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2634
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final Object mo1936(Object obj) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return (C1263) interfaceC2957;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final void m3877(boolean z) {
        if (!this.f6624) {
            AbstractC8765.m13982("initializeModifier called on unattached node");
        }
        InterfaceC2957 interfaceC2957 = this.f5537;
        if ((this.f6636 & 4) != 0 && !z) {
            AbstractC2620.m3908(this, 2).m3942();
        }
        if ((this.f6636 & 2) != 0) {
            InterfaceC7387 interfaceC7387 = AbstractC2602.f5536;
            C2595 c2595 = AbstractC2620.m3906(this).f5439.f5629;
            c2595.getClass();
            if (c2595.f5523) {
                AbstractC2629 abstractC2629 = this.f6631;
                abstractC2629.getClass();
                ((C2588) abstractC2629).m3847(this);
                InterfaceC2641 interfaceC2641 = abstractC2629.f5605;
                if (interfaceC2641 != null) {
                    ((C2746) interfaceC2641).m4170();
                }
            }
            if (!z) {
                AbstractC2620.m3908(this, 2).m3942();
                AbstractC2620.m3906(this).m3806();
            }
        }
        if (interfaceC2957 instanceof C1592) {
            ((C1592) interfaceC2957).f2520.f2470 = AbstractC2620.m3906(this);
        }
        int i = this.f6636;
        if ((i & 16) != 0 && (interfaceC2957 instanceof C2475)) {
            ((C2475) interfaceC2957).f5143.f5142 = this.f6631;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).m4087();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final void m3878() {
        if (this.f6624) {
            this.f5538.clear();
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).getSnapshotObserver();
            snapshotObserver.f5619.m2806(this, AbstractC2602.f5536, new InterfaceC7372() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3709invoke() {
                    this.this$0.f5537.getClass();
                    throw new ClassCastException();
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3709invoke();
                    return C6008.f15084;
                }
            });
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        C2775 c2775 = (C2775) interfaceC2957;
        C2791 c2791 = new C2791();
        c2791.f6123 = c2775.f6050;
        c2775.f6049.invoke(c2791);
        interfaceC2779.getClass();
        C2791 c27912 = (C2791) interfaceC2779;
        C1083 c1083 = c27912.f6124;
        if (c2791.f6123) {
            c27912.f6123 = true;
        }
        if (c2791.f6121) {
            c27912.f6121 = true;
        }
        C1083 c10832 = c2791.f6124;
        Object[] objArr = c10832.f1225;
        Object[] objArr2 = c10832.f1224;
        long[] jArr = c10832.f1226;
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
                        C2782 c2782 = (C2782) obj;
                        if (!c1083.m1313(c2782)) {
                            c1083.m1315(c2782, obj2);
                        } else if (obj2 instanceof C2776) {
                            Object objM1317 = c1083.m1317(c2782);
                            objM1317.getClass();
                            C2776 c2776 = (C2776) objM1317;
                            String str = c2776.f6052;
                            if (str == null) {
                                str = ((C2776) obj2).f6052;
                            }
                            InterfaceC6000 interfaceC6000 = c2776.f6051;
                            if (interfaceC6000 == null) {
                                interfaceC6000 = ((C2776) obj2).f6051;
                            }
                            c1083.m1315(c2782, new C2776(str, interfaceC6000));
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

    @Override // androidx.compose.p001ui.focus.InterfaceC2297
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo2208(InterfaceC2291 interfaceC2291) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        AbstractC8765.m13982("onFocusEvent called on wrong node");
        interfaceC2957.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        if (!this.f6624) {
            AbstractC8765.m13982("unInitializeModifier called on unattached node");
        }
        if ((this.f6636 & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(this)).m4087();
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        m3877(true);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return ((InterfaceC2503) interfaceC2957).m3655(abstractC2589, interfaceC2533, i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return ((InterfaceC2503) interfaceC2957).m3656(abstractC2589, interfaceC2533, i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return ((InterfaceC2503) interfaceC2957).m3657(abstractC2589, interfaceC2533, i);
    }

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC8725 mo3133() {
        return AbstractC2620.m3906(this).f5444;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return ((InterfaceC2503) interfaceC2957).m3658(abstractC2589, interfaceC2533, i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2639
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo3815() {
        return this.f6624;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2622, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1856() {
        if (this.f5537 instanceof C2475) {
            mo1784();
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        return ((InterfaceC2503) interfaceC2957).mo2432(interfaceC2488, interfaceC2490, j);
    }

    @Override // androidx.compose.p001ui.draw.InterfaceC2272
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final long mo3134() {
        return AbstractC1298.m1700(AbstractC2620.m3908(this, 128).f5343);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean mo3879() {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        ((C2475) interfaceC2957).f5143.getClass();
        return true;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        InterfaceC2957 interfaceC2957 = this.f5537;
        interfaceC2957.getClass();
        ((C2593) interfaceC2341).m3871();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611, androidx.compose.p001ui.node.InterfaceC2575
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1881(long j) {
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2611
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2136(InterfaceC2530 interfaceC2530) {
    }
}
