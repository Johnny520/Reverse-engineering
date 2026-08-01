package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p000.AbstractC6087;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;
import p205.C7905;
import p205.C7907;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f1711;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC6553 f1712;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(final InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13297(this.f1711 != Direction.Vertical ? 0 : C7897.m13313(j), C7897.m13309(j), this.f1711 == Direction.Horizontal ? C7897.m13312(j) : 0, C7897.m13310(j)));
        final int iM11420 = AbstractC6087.m11420(abstractC1724Mo3045.f4998, C7897.m13313(j), C7897.m13309(j));
        final int iM114202 = AbstractC6087.m11420(abstractC1724Mo3045.f4996, C7897.m13312(j), C7897.m13310(j));
        return interfaceC1653.mo1485(iM11420, iM114202, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.foundation.layout.飘花落叶言子哲兰楪世苏
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                InterfaceC6553 interfaceC6553 = this.f1710.f1712;
                AbstractC1724 abstractC1724 = abstractC1724Mo3045;
                AbstractC1708.m3124((AbstractC1708) obj, abstractC1724, ((C7907) interfaceC6553.invoke(new C7905((((long) (iM11420 - abstractC1724.f4998)) << 32) | (((long) (iM114202 - abstractC1724.f4996)) & 4294967295L)), interfaceC1653.getLayoutDirection())).f21883);
                return C5175.f14739;
            }
        });
    }
}
