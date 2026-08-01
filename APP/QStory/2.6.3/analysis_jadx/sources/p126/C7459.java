package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.internal.C1251;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7459 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7459 f20174 = new C7459(0, 2, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        int i;
        C1241 c1241 = (C1241) c0920.m1823(0);
        int iM2116 = c1235.m2116((C1230) c0920.m1823(1));
        if (c1235.f3570 >= iM2116) {
            AbstractC1374.m2507("Check failed");
        }
        AbstractC5062.m10030(c1235, interfaceC1356, iM2116);
        int i2 = c1235.f3570;
        int iM2112 = c1235.f3575;
        while (iM2112 >= 0 && !c1235.m2106(iM2112)) {
            iM2112 = c1235.m2112(c1235.f3568, iM2112);
        }
        int iM2123 = iM2112 + 1;
        int iM2098 = 0;
        while (iM2123 < i2) {
            if (c1235.m2124(i2, iM2123)) {
                if (c1235.m2106(iM2123)) {
                    iM2098 = 0;
                }
                iM2123++;
            } else {
                iM2098 += c1235.m2106(iM2123) ? 1 : c1235.f3568[(c1235.m2128(iM2123) * 5) + 1] & 67108863;
                iM2123 += c1235.m2123(iM2123);
            }
        }
        while (true) {
            i = c1235.f3570;
            if (i >= iM2116) {
                break;
            }
            if (c1235.m2124(iM2116, i)) {
                int i3 = c1235.f3570;
                if (i3 < c1235.f3574 && (c1235.f3568[(c1235.m2128(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC1356.mo942(c1235.m2102(c1235.f3570));
                    iM2098 = 0;
                }
                c1235.m2097();
            } else {
                iM2098 += c1235.m2098();
            }
        }
        if (i != iM2116) {
            AbstractC1374.m2507("Check failed");
        }
        c1241.f3597 = iM2098;
    }
}
