package p126;

import androidx.compose.animation.core.C0318;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.internal.C1251;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7436 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7436 f20135 = new C7436(0, 2, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        C1241 c1241 = (C1241) c0920.m1823(1);
        int i = c1241 != null ? c1241.f3597 : 0;
        C7441 c7441 = (C7441) c0920.m1823(0);
        if (i > 0) {
            C0318 c0318 = new C0318();
            c0318.f1071 = interfaceC1356;
            c0318.f1072 = i;
            interfaceC1356 = c0318;
        }
        c7441.m12659(interfaceC1356, c1235, c1251, interfaceC7430 != null ? new C4871(interfaceC7430, 14, c1235) : null);
    }
}
