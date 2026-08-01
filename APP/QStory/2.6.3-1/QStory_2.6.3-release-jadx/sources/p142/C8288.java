package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.internal.C2086;
import kotlin.reflect.jvm.internal.AbstractC5894;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8288 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8288 f20519 = new C8288(0, 2, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        int i;
        C2076 c2076 = (C2076) c1758.m2383(0);
        int iM2676 = c2070.m2676((C2065) c1758.m2383(1));
        if (c2070.f3915 >= iM2676) {
            AbstractC2209.m3067("Check failed");
        }
        AbstractC5894.m10589(c2070, interfaceC2191, iM2676);
        int i2 = c2070.f3915;
        int iM2672 = c2070.f3920;
        while (iM2672 >= 0 && !c2070.m2666(iM2672)) {
            iM2672 = c2070.m2672(c2070.f3913, iM2672);
        }
        int iM2683 = iM2672 + 1;
        int iM2658 = 0;
        while (iM2683 < i2) {
            if (c2070.m2684(i2, iM2683)) {
                if (c2070.m2666(iM2683)) {
                    iM2658 = 0;
                }
                iM2683++;
            } else {
                iM2658 += c2070.m2666(iM2683) ? 1 : c2070.f3913[(c2070.m2688(iM2683) * 5) + 1] & 67108863;
                iM2683 += c2070.m2683(iM2683);
            }
        }
        while (true) {
            i = c2070.f3915;
            if (i >= iM2676) {
                break;
            }
            if (c2070.m2684(iM2676, i)) {
                int i3 = c2070.f3915;
                if (i3 < c2070.f3919 && (c2070.f3913[(c2070.m2688(i3) * 5) + 1] & 1073741824) != 0) {
                    interfaceC2191.mo1502(c2070.m2662(c2070.f3915));
                    iM2658 = 0;
                }
                c2070.m2657();
            } else {
                iM2658 += c2070.m2658();
            }
        }
        if (i != iM2676) {
            AbstractC2209.m3067("Check failed");
        }
        c2076.f3942 = iM2658;
    }
}
