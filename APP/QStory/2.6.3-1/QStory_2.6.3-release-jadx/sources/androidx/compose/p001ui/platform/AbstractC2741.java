package androidx.compose.p001ui.platform;

import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import kotlin.C6008;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2077 f5965 = new C2077(-1759434350, false, new InterfaceC7383() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1
        public final void invoke(InterfaceC2208 interfaceC2208, int i) {
            C2159 c2159 = (C2159) interfaceC2208;
            if (c2159.m2903(i & 1, (i & 3) != 2)) {
                return;
            }
            c2159.m2899();
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
            return C6008.f15084;
        }
    });
}
