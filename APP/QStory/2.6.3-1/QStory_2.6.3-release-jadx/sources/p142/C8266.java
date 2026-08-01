package p142;

import androidx.collection.C1082;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8266 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8266 f20481 = new C8266(0, 2, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C2065 c2065 = (C2065) c1758.m2383(0);
        Object objM2383 = c1758.m2383(1);
        if (objM2383 instanceof C2155) {
            C2155 c2155 = (C2155) objM2383;
            ((C2059) c2086.f3974).m2607(c2155);
            ((C1082) c2086.f3979).m1301(c2155);
        }
        if (c2070.f3921 != 0) {
            AbstractC2209.m3067("Can only append a slot if not current inserting");
        }
        int i = c2070.f3931;
        int i2 = c2070.f3932;
        int iM2676 = c2070.m2676(c2065);
        int iM2692 = c2070.m2692(c2070.f3913, c2070.m2688(iM2676 + 1));
        c2070.f3931 = iM2692;
        c2070.f3932 = iM2692;
        c2070.m2682(1, iM2676);
        if (i >= iM2692) {
            i++;
            i2++;
        }
        c2070.f3912[iM2692] = objM2383;
        c2070.f3931 = i;
        c2070.f3932 = i2;
    }
}
