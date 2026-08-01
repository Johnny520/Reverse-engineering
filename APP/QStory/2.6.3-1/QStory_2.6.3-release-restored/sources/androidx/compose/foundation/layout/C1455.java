package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.window.area.AbstractC3400;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8727;
import p221.C8735;
import p221.C8737;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1455 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f2057;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC7383 f2058;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(final InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13884(this.f2057 != Direction.Vertical ? 0 : C8727.m13900(j), C8727.m13896(j), this.f2057 == Direction.Horizontal ? C8727.m13899(j) : 0, C8727.m13897(j)));
        final int iM5650 = AbstractC3400.m5650(abstractC2559Mo3615.f5344, C8727.m13900(j), C8727.m13896(j));
        final int iM56502 = AbstractC3400.m5650(abstractC2559Mo3615.f5342, C8727.m13899(j), C8727.m13897(j));
        return interfaceC2488.mo2055(iM5650, iM56502, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.foundation.layout.飘花落叶言子哲兰楪世苏
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                InterfaceC7383 interfaceC7383 = this.f2056.f2058;
                AbstractC2559 abstractC2559 = abstractC2559Mo3615;
                AbstractC2543.m3694((AbstractC2543) obj, abstractC2559, ((C8737) interfaceC7383.invoke(new C8735((((long) (iM5650 - abstractC2559.f5344)) << 32) | (((long) (iM56502 - abstractC2559.f5342)) & 4294967295L)), interfaceC2488.getLayoutDirection())).f22225);
                return C6008.f15084;
            }
        });
    }
}
