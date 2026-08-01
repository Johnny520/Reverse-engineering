package androidx.compose.ui.platform;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5176;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f5620 = new C1242(-1759434350, false, new InterfaceC6554() { // from class: androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt$lambda$-1759434350$1
        public final void invoke(InterfaceC1373 interfaceC1373, int i) {
            C1324 c1324 = (C1324) interfaceC1373;
            if (c1324.m2343(i & 1, (i & 3) != 2)) {
                return;
            }
            c1324.m2339();
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
            return C5176.f14739;
        }
    });
}
