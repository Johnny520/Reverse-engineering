package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7435 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7435 f20134 = new C7435(1, 0, 2);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        int iM1824 = c0920.m1824(0);
        int i = c1235.f3575;
        int iM2100 = c1235.m2100(c1235.f3568, c1235.m2128(i));
        int iM2132 = c1235.m2132(c1235.f3568, c1235.m2128(i + 1));
        for (int iMax = Math.max(iM2100, iM2132 - iM1824); iMax < iM2132; iMax++) {
            Object obj = c1235.f3567[c1235.m2131(iMax)];
            if (obj instanceof C1320) {
                c1251.m2178((C1320) obj);
            } else if (obj instanceof C1389) {
                ((C1389) obj).m2528();
            }
        }
        if (iM1824 <= 0) {
            AbstractC1374.m2507("Check failed");
        }
        int i2 = c1235.f3575;
        int iM21002 = c1235.m2100(c1235.f3568, c1235.m2128(i2));
        int iM21322 = c1235.m2132(c1235.f3568, c1235.m2128(i2 + 1)) - iM1824;
        if (iM21322 < iM21002) {
            AbstractC1374.m2507("Check failed");
        }
        c1235.m2107(iM21322, iM1824, i2);
        int i3 = c1235.f3586;
        if (i3 >= iM21002) {
            c1235.f3586 = i3 - iM1824;
        }
    }
}
