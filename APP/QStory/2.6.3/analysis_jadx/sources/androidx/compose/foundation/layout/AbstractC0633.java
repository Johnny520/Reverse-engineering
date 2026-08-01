package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2116;
import androidx.compose.ui.C2119;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0638 f1784 = new C0638(AbstractC0628.f1764, C2119.f6259);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0638 m1449(InterfaceC0650 interfaceC0650, C2116 c2116, InterfaceC1373 interfaceC1373, int i) {
        if (interfaceC0650.equals(AbstractC0628.f1764) && c2116.equals(C2119.f6259)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2392(-1446604504);
            c1324.m2377(false);
            return f1784;
        }
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2392(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13242.m2360(interfaceC0650)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13242.m2360(c2116)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2345 = c13242.m2345();
        if (z3 || objM2345 == C1369.f3974) {
            objM2345 = new C0638(interfaceC0650, c2116);
            c13242.m2386(objM2345);
        }
        C0638 c0638 = (C0638) objM2345;
        c13242.m2377(false);
        return c0638;
    }
}
