package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0660 f1838 = new C0660(AbstractC0628.f1765, C2119.f6261);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0660 m1450(InterfaceC0645 interfaceC0645, C2115 c2115, InterfaceC1373 interfaceC1373, int i) {
        if (interfaceC0645.equals(AbstractC0628.f1765) && AbstractC4394.m8917(c2115, C2119.f6261)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2382(-1073830487);
            c1324.m2367(false);
            return f1838;
        }
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2382(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && c13242.m2350(interfaceC0645)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c13242.m2350(c2115)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM2335 = c13242.m2335();
        if (z3 || objM2335 == C1369.f3973) {
            objM2335 = new C0660(interfaceC0645, c2115);
            c13242.m2376(objM2335);
        }
        C0660 c0660 = (C0660) objM2335;
        c13242.m2367(false);
        return c0660;
    }
}
