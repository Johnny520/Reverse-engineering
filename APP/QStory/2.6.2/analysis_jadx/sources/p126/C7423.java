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
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7423 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7423 f20129 = new C7423(0, 1, 1);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        C1389 c1389 = (C1389) c0920.m1813(0);
        C0236 c0236 = (C0236) c1251.f3635;
        C1250 c1250 = c0236 != null ? (C1250) c0236.m756(c1389) : null;
        if (c1250 != null) {
            ArrayList arrayList = (ArrayList) c1251.f3636;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1251.f3636 = arrayList;
            }
            arrayList.add((C1224) c1251.f3628);
            c1251.f3628 = c1250.f3624;
        }
    }
}
