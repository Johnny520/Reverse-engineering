package p126;

import androidx.collection.C0236;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1250;
import androidx.compose.runtime.internal.C1251;
import java.util.ArrayList;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7424 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7424 f20124 = new C7424(0, 1, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        C1389 c1389 = (C1389) c0920.m1823(0);
        C0236 c0236 = (C0236) c1251.f3636;
        C1250 c1250 = c0236 != null ? (C1250) c0236.m757(c1389) : null;
        if (c1250 != null) {
            ArrayList arrayList = (ArrayList) c1251.f3637;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1251.f3637 = arrayList;
            }
            arrayList.add((C1224) c1251.f3629);
            c1251.f3629 = c1250.f3625;
        }
    }
}
