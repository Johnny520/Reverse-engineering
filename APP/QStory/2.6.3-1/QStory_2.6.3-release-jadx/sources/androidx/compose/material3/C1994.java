package androidx.compose.material3;

import androidx.compose.foundation.layout.C1514;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2514;
import androidx.compose.p001ui.layout.C2532;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2618;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1994 extends AbstractC2961 implements InterfaceC2618, InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public LinkedHashMap f3664;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        float f = ((C8722) AbstractC2620.m3916(this, AbstractC1986.f3655)).f22204;
        if (f < 0.0f) {
            f = 0.0f;
        }
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        boolean z = this.f6624 && !Float.isNaN(f) && C8722.m13878(f, 0.0f) > 0;
        int iMo1903 = !Float.isNaN(f) ? interfaceC2488.mo1903(f) : 0;
        int iMax = abstractC2559Mo3615.f5344;
        if (z) {
            iMax = Math.max(iMax, iMo1903);
        }
        int iMax2 = abstractC2559Mo3615.f5342;
        if (z) {
            iMax2 = Math.max(iMax2, iMo1903);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f3664;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f3664 = linkedHashMap;
            }
            C2514 c2514 = AbstractC1986.f3656;
            int iRound = Math.round((iMo1903 - abstractC2559Mo3615.f5344) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(c2514, Integer.valueOf(iRound));
            C2532 c2532 = AbstractC1986.f3657;
            int iRound2 = Math.round((iMo1903 - abstractC2559Mo3615.f5342) / 2.0f);
            linkedHashMap.put(c2532, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapM9335 = this.f3664;
        if (mapM9335 == null) {
            mapM9335 = AbstractC5171.m9335();
        }
        return interfaceC2488.mo2055(iMax, iMax2, mapM9335, new C1514(iMax, abstractC2559Mo3615, iMax2));
    }
}
