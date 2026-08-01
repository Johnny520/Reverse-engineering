package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.internal.C1251;
import com.bumptech.glide.AbstractC3055;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7458 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7458 f20179 = new C7458(0, 2, 1);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        int i;
        C1241 c1241 = (C1241) c0920.m1813(0);
        int iM2106 = c1235.m2106((C1230) c0920.m1813(1));
        if (c1235.f3569 >= iM2106) {
            AbstractC1374.m2497("Check failed");
        }
        AbstractC3055.m6624(c1235, interfaceC1356, iM2106);
        int i2 = c1235.f3569;
        int iM2102 = c1235.f3574;
        while (iM2102 >= 0 && !c1235.m2096(iM2102)) {
            iM2102 = c1235.m2102(c1235.f3567, iM2102);
        }
        int iM2113 = iM2102 + 1;
        int iM2088 = 0;
        while (iM2113 < i2) {
            if (c1235.m2114(i2, iM2113)) {
                if (c1235.m2096(iM2113)) {
                    iM2088 = 0;
                }
                iM2113++;
            } else {
                iM2088 += c1235.m2096(iM2113) ? 1 : c1235.f3567[(c1235.m2118(iM2113) * 5) + 1] & 67108863;
                iM2113 += c1235.m2113(iM2113);
            }
        }
        while (true) {
            i = c1235.f3569;
            if (i >= iM2106) {
                break;
            }
            if (c1235.m2114(iM2106, i)) {
                int i3 = c1235.f3569;
                if (i3 < c1235.f3573 && (c1235.f3567[(c1235.m2118(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC1356.mo941(c1235.m2092(c1235.f3569));
                    iM2088 = 0;
                }
                c1235.m2087();
            } else {
                iM2088 += c1235.m2088();
            }
        }
        if (i != iM2106) {
            AbstractC1374.m2497("Check failed");
        }
        c1241.f3596 = iM2088;
    }
}
