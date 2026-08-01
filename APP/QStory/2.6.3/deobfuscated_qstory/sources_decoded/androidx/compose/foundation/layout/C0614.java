package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.window.area.AbstractC2567;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.AbstractC7897;
import p205.C7898;
import p205.C7906;
import p205.C7908;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f1712;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC6554 f1713;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(final InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13325(this.f1712 != Direction.Vertical ? 0 : C7898.m13341(j), C7898.m13337(j), this.f1712 == Direction.Horizontal ? C7898.m13340(j) : 0, C7898.m13338(j)));
        final int iM5090 = AbstractC2567.m5090(abstractC1724Mo3055.f4999, C7898.m13341(j), C7898.m13337(j));
        final int iM50902 = AbstractC2567.m5090(abstractC1724Mo3055.f4997, C7898.m13340(j), C7898.m13338(j));
        return interfaceC1653.mo1495(iM5090, iM50902, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.foundation.layout.飘花落叶言子哲兰楪世苏
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                InterfaceC6554 interfaceC6554 = this.f1711.f1713;
                AbstractC1724 abstractC1724 = abstractC1724Mo3055;
                AbstractC1708.m3134((AbstractC1708) obj, abstractC1724, ((C7908) interfaceC6554.invoke(new C7906((((long) (iM5090 - abstractC1724.f4999)) << 32) | (((long) (iM50902 - abstractC1724.f4997)) & 4294967295L)), interfaceC1653.getLayoutDirection())).f21880);
                return C5176.f14739;
            }
        });
    }
}
