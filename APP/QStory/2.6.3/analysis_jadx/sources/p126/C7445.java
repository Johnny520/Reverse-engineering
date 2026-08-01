package p126;

import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1250;
import androidx.compose.runtime.internal.C1251;
import java.util.Set;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7445 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7445 f20156 = new C7445(0, 1, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        C1389 c1389 = (C1389) c0920.m1823(0);
        Set set = (Set) c1251.f3632;
        if (set == null) {
            return;
        }
        C1250 c1250 = new C1250(set);
        C0236 c0236 = (C0236) c1251.f3636;
        if (c0236 == null) {
            long[] jArr = AbstractC0290.f1007;
            c0236 = new C0236();
            c1251.f3636 = c0236;
        }
        c0236.m755(c1389, c1250);
        ((C1224) c1251.f3629).m2047(new C1320(c1250, -1));
    }
}
