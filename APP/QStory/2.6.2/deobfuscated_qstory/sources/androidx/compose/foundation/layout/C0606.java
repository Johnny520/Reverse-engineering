package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4338;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0606 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f1697;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f1698;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iM13313;
        int iM13309;
        int iM13310;
        int i;
        if (!C7897.m13305(j) || this.f1697 == Direction.Vertical) {
            iM13313 = C7897.m13313(j);
            iM13309 = C7897.m13309(j);
        } else {
            int iRound = Math.round(C7897.m13309(j) * this.f1698);
            int iM133132 = C7897.m13313(j);
            iM13313 = C7897.m13309(j);
            if (iRound < iM133132) {
                iRound = iM133132;
            }
            if (iRound <= iM13313) {
                iM13313 = iRound;
            }
            iM13309 = iM13313;
        }
        if (!C7897.m13306(j) || this.f1697 == Direction.Horizontal) {
            int iM13312 = C7897.m13312(j);
            int iM133102 = C7897.m13310(j);
            iM13310 = iM13312;
            i = iM133102;
        } else {
            int iRound2 = Math.round(C7897.m13310(j) * this.f1698);
            int iM133122 = C7897.m13312(j);
            iM13310 = C7897.m13310(j);
            if (iRound2 < iM133122) {
                iRound2 = iM133122;
            }
            if (iRound2 <= iM13310) {
                iM13310 = iRound2;
            }
            i = iM13310;
        }
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(AbstractC7896.m13297(iM13313, iM13309, iM13310, i));
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new C0595(abstractC1724Mo3045, 0));
    }
}
