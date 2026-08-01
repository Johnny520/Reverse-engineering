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

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8253 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8253 f20469 = new C8253(0, 1, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C2224 c2224 = (C2224) c1758.m2383(0);
        C1083 c1083 = (C1083) c2086.f3981;
        C2085 c2085 = c1083 != null ? (C2085) c1083.m1317(c2224) : null;
        if (c2085 != null) {
            ArrayList arrayList = (ArrayList) c2086.f3982;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c2086.f3982 = arrayList;
            }
            arrayList.add((C2059) c2086.f3974);
            c2086.f3974 = c2085.f3970;
        }
    }
}
