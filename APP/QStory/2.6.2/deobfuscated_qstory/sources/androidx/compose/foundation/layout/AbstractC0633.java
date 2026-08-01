package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2116;
import androidx.compose.ui.C2119;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0638 f1783 = new C0638(AbstractC0628.f1763, C2119.f6258);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0638 m1439(InterfaceC0650 interfaceC0650, C2116 c2116, InterfaceC1373 interfaceC1373, int i) {
        if (interfaceC0650.equals(AbstractC0628.f1763) && c2116.equals(C2119.f6258)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2382(-1446604504);
            c1324.m2367(false);
            return f1783;
        }
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2382(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13242.m2350(interfaceC0650)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13242.m2350(c2116)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2335 = c13242.m2335();
        if (z3 || objM2335 == C1369.f3973) {
            objM2335 = new C0638(interfaceC0650, c2116);
            c13242.m2376(objM2335);
        }
        C0638 c0638 = (C0638) objM2335;
        c13242.m2367(false);
        return c0638;
    }
}
