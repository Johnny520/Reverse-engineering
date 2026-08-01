package androidx.compose.foundation.layout;

import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2952;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1499 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1501 f2184 = new C1501(AbstractC1469.f2111, C2952.f6607);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1501 m2020(InterfaceC1486 interfaceC1486, C2948 c2948, InterfaceC2208 interfaceC2208, int i) {
        if (interfaceC1486.equals(AbstractC1469.f2111) && AbstractC5227.m9466(c2948, C2952.f6607)) {
            C2159 c2159 = (C2159) interfaceC2208;
            c2159.m2952(-1073830487);
            c2159.m2937(false);
            return f2184;
        }
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2952(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c21592.m2920(interfaceC1486)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c21592.m2920(c2948)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2905 = c21592.m2905();
        if (z3 || objM2905 == C2204.f4319) {
            objM2905 = new C1501(interfaceC1486, c2948);
            c21592.m2946(objM2905);
        }
        C1501 c1501 = (C1501) objM2905;
        c21592.m2937(false);
        return c1501;
    }
}
