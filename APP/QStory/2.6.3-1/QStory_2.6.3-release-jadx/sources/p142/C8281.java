package p142;

import androidx.collection.C1083;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2085;
import androidx.compose.runtime.internal.C2086;
import java.util.ArrayList;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8281 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8281 f20512 = new C8281(0, 1, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C2059 c2059;
        C2224 c2224 = (C2224) c1758.m2383(0);
        C1083 c1083 = (C1083) c2086.f3981;
        if (c1083 == null || ((C2085) c1083.m1317(c2224)) == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c2086.f3982;
        if (arrayList != null && (c2059 = (C2059) arrayList.remove(arrayList.size() - 1)) != null) {
            c2086.f3974 = c2059;
        }
        c1083.m1318(c2224);
    }
}
