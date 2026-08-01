package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0660 f1839 = new C0660(AbstractC0628.f1766, C2119.f6262);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0660 m1460(InterfaceC0645 interfaceC0645, C2115 c2115, InterfaceC1373 interfaceC1373, int i) {
        if (interfaceC0645.equals(AbstractC0628.f1766) && AbstractC4395.m8907(c2115, C2119.f6262)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2392(-1073830487);
            c1324.m2377(false);
            return f1839;
        }
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2392(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13242.m2360(interfaceC0645)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13242.m2360(c2115)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2345 = c13242.m2345();
        if (z3 || objM2345 == C1369.f3974) {
            objM2345 = new C0660(interfaceC0645, c2115);
            c13242.m2386(objM2345);
        }
        C0660 c0660 = (C0660) objM2345;
        c13242.m2377(false);
        return c0660;
    }
}
