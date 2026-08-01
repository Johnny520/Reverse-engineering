package p142;

import androidx.compose.animation.core.C1164;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.internal.C2086;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8265 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8265 f20480 = new C8265(0, 2, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C2076 c2076 = (C2076) c1758.m2383(1);
        int i = c2076 != null ? c2076.f3942 : 0;
        C8270 c8270 = (C8270) c1758.m2383(0);
        if (i > 0) {
            C1164 c1164 = new C1164();
            c1164.f1416 = interfaceC2191;
            c1164.f1417 = i;
            interfaceC2191 = c1164;
        }
        c8270.m13218(interfaceC2191, c2070, c2086, interfaceC8259 != null ? new C5703(interfaceC8259, 14, c2070) : null);
    }
}
