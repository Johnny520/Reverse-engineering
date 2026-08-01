package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.internal.C2086;
import java.util.List;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8284 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8284 f20515 = new C8284(0, 2, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        int i = ((C2076) c1758.m2383(0)).f3942;
        List list = (List) c1758.m2383(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC2191.mo1503(i3, obj);
            interfaceC2191.mo1510(i3, obj);
        }
    }
}
