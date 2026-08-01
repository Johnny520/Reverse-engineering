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
import kotlin.collections.AbstractC4339;
import p205.C7893;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1159 extends AbstractC2128 implements InterfaceC1783, InterfaceC1773 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public LinkedHashMap f3319;

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        float f = ((C7893) AbstractC1785.m3356(this, AbstractC1151.f3310)).f21859;
        if (f < 0.0f) {
            f = 0.0f;
        }
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        boolean z = this.f6279 && !Float.isNaN(f) && C7893.m13319(f, 0.0f) > 0;
        int iMo1343 = !Float.isNaN(f) ? interfaceC1653.mo1343(f) : 0;
        int iMax = abstractC1724Mo3055.f4999;
        if (z) {
            iMax = Math.max(iMax, iMo1343);
        }
        int iMax2 = abstractC1724Mo3055.f4997;
        if (z) {
            iMax2 = Math.max(iMax2, iMo1343);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f3319;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3319 = linkedHashMap;
            }
            C1679 c1679 = AbstractC1151.f3311;
            int iRound = Math.round((iMo1343 - abstractC1724Mo3055.f4999) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c1679, Integer.valueOf(iRound));
            C1697 c1697 = AbstractC1151.f3312;
            int iRound2 = Math.round((iMo1343 - abstractC1724Mo3055.f4997) / 2.0f);
            linkedHashMap.put(c1697, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapM8776 = this.f3319;
        if (mapM8776 == null) {
            mapM8776 = AbstractC4339.m8776();
        }
        return interfaceC1653.mo1495(iMax, iMax2, mapM8776, new C0673(iMax, abstractC1724Mo3055, iMax2));
    }
}
