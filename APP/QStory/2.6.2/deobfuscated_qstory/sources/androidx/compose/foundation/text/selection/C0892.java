package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4338;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0892 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0892 f2533 = new C0892();

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724Mo3045 = ((InterfaceC1655) list.get(i)).mo3045(j);
            iMax = Math.max(iMax, abstractC1724Mo3045.f4998);
            iMax2 = Math.max(iMax2, abstractC1724Mo3045.f4996);
            arrayList.add(abstractC1724Mo3045);
        }
        return interfaceC1653.mo1485(iMax, iMax2, AbstractC4338.m8781(), new C0914(arrayList, 1));
    }
}
