package p142;

import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2085;
import androidx.compose.runtime.internal.C2086;
import java.util.Set;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8274 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8274 f20501 = new C8274(0, 1, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C2224 c2224 = (C2224) c1758.m2383(0);
        Set set = (Set) c2086.f3977;
        if (set == null) {
            return;
        }
        C2085 c2085 = new C2085(set);
        C1083 c1083 = (C1083) c2086.f3981;
        if (c1083 == null) {
            long[] jArr = AbstractC1137.f1352;
            c1083 = new C1083();
            c2086.f3981 = c1083;
        }
        c1083.m1315(c2224, c2085);
        ((C2059) c2086.f3974).m2607(new C2155(c2085, -1));
    }
}
