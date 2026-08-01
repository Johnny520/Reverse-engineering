package p126;

import androidx.collection.C0235;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7437 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7437 f20136 = new C7437(0, 2, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        C1230 c1230 = (C1230) c0920.m1823(0);
        Object objM1823 = c0920.m1823(1);
        if (objM1823 instanceof C1320) {
            C1320 c1320 = (C1320) objM1823;
            ((C1224) c1251.f3629).m2047(c1320);
            ((C0235) c1251.f3634).m741(c1320);
        }
        if (c1235.f3576 != 0) {
            AbstractC1374.m2507("Can only append a slot if not current inserting");
        }
        int i = c1235.f3586;
        int i2 = c1235.f3587;
        int iM2116 = c1235.m2116(c1230);
        int iM2132 = c1235.m2132(c1235.f3568, c1235.m2128(iM2116 + 1));
        c1235.f3586 = iM2132;
        c1235.f3587 = iM2132;
        c1235.m2122(1, iM2116);
        if (i >= iM2132) {
            i++;
            i2++;
        }
        c1235.f3567[iM2132] = objM1823;
        c1235.f3586 = i;
        c1235.f3587 = i2;
    }
}
