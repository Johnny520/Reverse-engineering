package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1447 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public Direction f2043;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public float f2044;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        int iM13900;
        int iM13896;
        int iM13897;
        int i;
        if (!C8727.m13892(j) || this.f2043 == Direction.Vertical) {
            iM13900 = C8727.m13900(j);
            iM13896 = C8727.m13896(j);
        } else {
            int iRound = Math.round(C8727.m13896(j) * this.f2044);
            int iM139002 = C8727.m13900(j);
            iM13900 = C8727.m13896(j);
            if (iRound < iM139002) {
                iRound = iM139002;
            }
            if (iRound <= iM13900) {
                iM13900 = iRound;
            }
            iM13896 = iM13900;
        }
        if (!C8727.m13893(j) || this.f2043 == Direction.Horizontal) {
            int iM13899 = C8727.m13899(j);
            int iM138972 = C8727.m13897(j);
            iM13897 = iM13899;
            i = iM138972;
        } else {
            int iRound2 = Math.round(C8727.m13897(j) * this.f2044);
            int iM138992 = C8727.m13899(j);
            iM13897 = C8727.m13897(j);
            if (iRound2 < iM138992) {
                iRound2 = iM138992;
            }
            if (iRound2 <= iM13897) {
                iM13897 = iRound2;
            }
            i = iM13897;
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13884(iM13900, iM13896, iM13897, i));
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new C1436(abstractC2559Mo3615, 0));
    }
}
