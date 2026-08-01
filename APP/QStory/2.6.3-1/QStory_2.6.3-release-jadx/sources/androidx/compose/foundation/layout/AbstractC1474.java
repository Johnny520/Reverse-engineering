package androidx.compose.foundation.layout;

import androidx.compose.p001ui.C2949;
import androidx.compose.p001ui.C2952;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1479 f2129 = new C1479(AbstractC1469.f2109, C2952.f6604);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1479 m2009(InterfaceC1491 interfaceC1491, C2949 c2949, InterfaceC2208 interfaceC2208, int i) {
        if (interfaceC1491.equals(AbstractC1469.f2109) && c2949.equals(C2952.f6604)) {
            C2159 c2159 = (C2159) interfaceC2208;
            c2159.m2952(-1446604504);
            c2159.m2937(false);
            return f2129;
        }
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2952(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c21592.m2920(interfaceC1491)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c21592.m2920(c2949)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2905 = c21592.m2905();
        if (z3 || objM2905 == C2204.f4319) {
            objM2905 = new C1479(interfaceC1491, c2949);
            c21592.m2946(objM2905);
        }
        C1479 c1479 = (C1479) objM2905;
        c21592.m2937(false);
        return c1479;
    }
}
