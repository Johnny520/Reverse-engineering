package p142;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.AbstractC2209;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2068;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8271 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8271 f20498 = new C8271(0, 3, 1);

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        C5703 c5703;
        C2068 c2068 = (C2068) c1758.m2383(1);
        C2065 c2065 = (C2065) c1758.m2383(0);
        C8268 c8268 = (C8268) c1758.m2383(2);
        C2070 c2070M2623 = c2068.m2623();
        if (interfaceC8259 != null) {
            try {
                c5703 = new C5703(interfaceC8259, 14, c2070);
            } catch (Throwable th) {
                c2070M2623.m2674(false);
                throw th;
            }
        } else {
            c5703 = null;
        }
        if (!c8268.f20483.m13212()) {
            AbstractC2209.m3067("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c8268.f20484.m13209(interfaceC2191, c2070M2623, c2086, c5703);
        c2070M2623.m2674(true);
        c2070.m2675();
        c2065.getClass();
        c2070.m2665(c2068, c2068.m2625(c2065));
        c2070.m2693();
    }
}
