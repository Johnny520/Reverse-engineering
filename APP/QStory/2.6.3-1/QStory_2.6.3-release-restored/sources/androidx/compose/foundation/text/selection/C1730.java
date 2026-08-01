package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5171;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1730 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1730 f2879 = new C1730();

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2559 abstractC2559Mo3615 = ((InterfaceC2490) list.get(i)).mo3615(j);
            iMax = Math.max(iMax, abstractC2559Mo3615.f5344);
            iMax2 = Math.max(iMax2, abstractC2559Mo3615.f5342);
            arrayList.add(abstractC2559Mo3615);
        }
        return interfaceC2488.mo2055(iMax, iMax2, AbstractC5171.m9335(), new C1752(arrayList, 1));
    }
}
