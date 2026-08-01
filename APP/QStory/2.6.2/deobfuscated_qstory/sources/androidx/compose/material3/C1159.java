package androidx.compose.material3;

import androidx.compose.foundation.layout.C0673;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1679;
import androidx.compose.ui.layout.C1697;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1783;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import p205.C7892;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public LinkedHashMap f3318;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float f = ((C7892) AbstractC1785.m3346(this, AbstractC1151.f3309)).f21862;
        if (f < 0.0f) {
            f = 0.0f;
        }
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        boolean z = this.f6278 && !Float.isNaN(f) && C7892.m13291(f, 0.0f) > 0;
        int iMo1333 = !Float.isNaN(f) ? interfaceC1653.mo1333(f) : 0;
        int iMax = abstractC1724Mo3045.f4998;
        if (z) {
            iMax = Math.max(iMax, iMo1333);
        }
        int iMax2 = abstractC1724Mo3045.f4996;
        if (z) {
            iMax2 = Math.max(iMax2, iMo1333);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f3318;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3318 = linkedHashMap;
            }
            C1679 c1679 = AbstractC1151.f3310;
            int iRound = Math.round((iMo1333 - abstractC1724Mo3045.f4998) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c1679, Integer.valueOf(iRound));
            C1697 c1697 = AbstractC1151.f3311;
            int iRound2 = Math.round((iMo1333 - abstractC1724Mo3045.f4996) / 2.0f);
            linkedHashMap.put(c1697, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapM8781 = this.f3318;
        if (mapM8781 == null) {
            mapM8781 = AbstractC4338.m8781();
        }
        return interfaceC1653.mo1485(iMax, iMax2, mapM8781, new C0673(iMax, abstractC1724Mo3045, iMax2));
    }
}
