package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8264 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8264 f20479 = new C8264(1, 0, 2);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        int iM2384 = c1758.m2384(0);
        int i = c2070.f3920;
        int iM2660 = c2070.m2660(c2070.f3913, c2070.m2688(i));
        int iM2692 = c2070.m2692(c2070.f3913, c2070.m2688(i + 1));
        for (int iMax = Math.max(iM2660, iM2692 - iM2384); iMax < iM2692; iMax++) {
            Object obj = c2070.f3912[c2070.m2691(iMax)];
            if (obj instanceof C2155) {
                c2086.m2738((C2155) obj);
            } else if (obj instanceof C2224) {
                ((C2224) obj).m3088();
            }
        }
        if (iM2384 <= 0) {
            AbstractC2209.m3067("Check failed");
        }
        int i2 = c2070.f3920;
        int iM26602 = c2070.m2660(c2070.f3913, c2070.m2688(i2));
        int iM26922 = c2070.m2692(c2070.f3913, c2070.m2688(i2 + 1)) - iM2384;
        if (iM26922 < iM26602) {
            AbstractC2209.m3067("Check failed");
        }
        c2070.m2667(iM26922, iM2384, i2);
        int i3 = c2070.f3931;
        if (i3 >= iM26602) {
            c2070.f3931 = i3 - iM2384;
        }
    }
}
