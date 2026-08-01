package androidx.compose.ui.window;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import kotlin.C5175;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f6233 = new C1242(-1131826196, false, new InterfaceC6553() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda$-1131826196$1
        public final void invoke(InterfaceC1373 interfaceC1373, int i) {
            C1324 c1324 = (C1324) interfaceC1373;
            if (c1324.m2333(i & 1, (i & 3) != 2)) {
                return;
            }
            c1324.m2329();
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
            return C5175.f14739;
        }
    });
}
