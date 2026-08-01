package androidx.compose.foundation.layout;

import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.InterfaceC1773;
import kotlin.collections.AbstractC4339;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0606 extends AbstractC2128 implements InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f1698;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f1699;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        int iM13341;
        int iM13337;
        int iM13338;
        int i;
        if (!C7898.m13333(j) || this.f1698 == Direction.Vertical) {
            iM13341 = C7898.m13341(j);
            iM13337 = C7898.m13337(j);
        } else {
            int iRound = Math.round(C7898.m13337(j) * this.f1699);
            int iM133412 = C7898.m13341(j);
            iM13341 = C7898.m13337(j);
            if (iRound < iM133412) {
                iRound = iM133412;
            }
            if (iRound <= iM13341) {
                iM13341 = iRound;
            }
            iM13337 = iM13341;
        }
        if (!C7898.m13334(j) || this.f1698 == Direction.Horizontal) {
            int iM13340 = C7898.m13340(j);
            int iM133382 = C7898.m13338(j);
            iM13338 = iM13340;
            i = iM133382;
        } else {
            int iRound2 = Math.round(C7898.m13338(j) * this.f1699);
            int iM133402 = C7898.m13340(j);
            iM13338 = C7898.m13338(j);
            if (iRound2 < iM133402) {
                iRound2 = iM133402;
            }
            if (iRound2 <= iM13338) {
                iM13338 = iRound2;
            }
            i = iM13338;
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(AbstractC7897.m13325(iM13341, iM13337, iM13338, i));
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new C0595(abstractC1724Mo3055, 0));
    }
}
