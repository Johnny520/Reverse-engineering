package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4339;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0892 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0892 f2534 = new C0892();

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724Mo3055 = ((InterfaceC1655) list.get(i)).mo3055(j);
            iMax = Math.max(iMax, abstractC1724Mo3055.f4999);
            iMax2 = Math.max(iMax2, abstractC1724Mo3055.f4997);
            arrayList.add(abstractC1724Mo3055);
        }
        return interfaceC1653.mo1495(iMax, iMax2, AbstractC4339.m8776(), new C0914(arrayList, 1));
    }
}
