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
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7436 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7436 f20141 = new C7436(0, 2, 1);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        C1230 c1230 = (C1230) c0920.m1813(0);
        Object objM1813 = c0920.m1813(1);
        if (objM1813 instanceof C1320) {
            C1320 c1320 = (C1320) objM1813;
            ((C1224) c1251.f3628).m2037(c1320);
            ((C0235) c1251.f3633).m740(c1320);
        }
        if (c1235.f3575 != 0) {
            AbstractC1374.m2497("Can only append a slot if not current inserting");
        }
        int i = c1235.f3585;
        int i2 = c1235.f3586;
        int iM2106 = c1235.m2106(c1230);
        int iM2122 = c1235.m2122(c1235.f3567, c1235.m2118(iM2106 + 1));
        c1235.f3585 = iM2122;
        c1235.f3586 = iM2122;
        c1235.m2112(1, iM2106);
        if (i >= iM2122) {
            i++;
            i2++;
        }
        c1235.f3566[iM2122] = objM1813;
        c1235.f3585 = i;
        c1235.f3586 = i2;
    }
}
