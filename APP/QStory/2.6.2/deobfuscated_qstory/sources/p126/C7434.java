package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7434 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7434 f20139 = new C7434(1, 0, 2);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        int iM1814 = c0920.m1814(0);
        int i = c1235.f3574;
        int iM2090 = c1235.m2090(c1235.f3567, c1235.m2118(i));
        int iM2122 = c1235.m2122(c1235.f3567, c1235.m2118(i + 1));
        for (int iMax = Math.max(iM2090, iM2122 - iM1814); iMax < iM2122; iMax++) {
            Object obj = c1235.f3566[c1235.m2121(iMax)];
            if (obj instanceof C1320) {
                c1251.m2168((C1320) obj);
            } else if (obj instanceof C1389) {
                ((C1389) obj).m2518();
            }
        }
        if (iM1814 <= 0) {
            AbstractC1374.m2497("Check failed");
        }
        int i2 = c1235.f3574;
        int iM20902 = c1235.m2090(c1235.f3567, c1235.m2118(i2));
        int iM21222 = c1235.m2122(c1235.f3567, c1235.m2118(i2 + 1)) - iM1814;
        if (iM21222 < iM20902) {
            AbstractC1374.m2497("Check failed");
        }
        c1235.m2097(iM21222, iM1814, i2);
        int i3 = c1235.f3585;
        if (i3 >= iM20902) {
            c1235.f3585 = i3 - iM1814;
        }
    }
}
