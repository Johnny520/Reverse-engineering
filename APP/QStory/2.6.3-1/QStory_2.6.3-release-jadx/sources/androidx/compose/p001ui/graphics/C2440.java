package androidx.compose.p001ui.graphics;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2440 extends AbstractC2961 implements InterfaceC2608, InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f5050;

    public C2440(InterfaceC7387 interfaceC7387) {
        this.f5050 = interfaceC7387;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f5050 + ')';
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏 */
    public final boolean mo1853() {
        return false;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        InterfaceC2404 interfaceC2404;
        boolean z;
        AbstractC2629 abstractC2629M3908 = AbstractC2620.m3908(this, 2);
        if (abstractC2629M3908.f5607) {
            interfaceC2404 = abstractC2629M3908.f5587;
            z = abstractC2629M3908.f5588;
        } else {
            C2408 c2408 = AbstractC2416.f5008;
            if (c2408 == null) {
                AbstractC2416.f5008 = new C2408();
            } else {
                c2408.m3416();
            }
            C2408 c24082 = AbstractC2416.f5008;
            c24082.getClass();
            c24082.f4988 = abstractC2629M3908.f5604.f5444;
            c24082.f4989 = AbstractC1298.m1700(abstractC2629M3908.f5343);
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                this.f5050.invoke(c24082);
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                interfaceC2404 = c24082.f4979;
                z = c24082.f4978;
            } catch (Throwable th) {
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                throw th;
            }
        }
        if (z) {
            AbstractC2781.m4204(interfaceC2779, interfaceC2404);
        }
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.graphics.BlockGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2543.m3690(abstractC2543, abstractC2559Mo3615, 0, 0, this.f5050, 4);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo2534() {
        return false;
    }
}
