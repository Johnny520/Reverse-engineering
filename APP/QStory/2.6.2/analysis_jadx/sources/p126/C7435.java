package p126;

import androidx.compose.animation.core.C0318;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.internal.C1251;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7435 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7435 f20140 = new C7435(0, 2, 1);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        C1241 c1241 = (C1241) c0920.m1813(1);
        int i = c1241 != null ? c1241.f3596 : 0;
        C7440 c7440 = (C7440) c0920.m1813(0);
        if (i > 0) {
            C0318 c0318 = new C0318();
            c0318.f1071 = interfaceC1356;
            c0318.f1072 = i;
            interfaceC1356 = c0318;
        }
        c7440.m12632(interfaceC1356, c1235, c1251, interfaceC7429 != null ? new C4870(interfaceC7429, 14, c1235) : null);
    }
}
