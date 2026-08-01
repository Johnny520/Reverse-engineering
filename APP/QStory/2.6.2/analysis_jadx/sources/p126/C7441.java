package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1233;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7441 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7441 f20158 = new C7441(0, 3, 1);

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        C4870 c4870;
        C1233 c1233 = (C1233) c0920.m1813(1);
        C1230 c1230 = (C1230) c0920.m1813(0);
        C7438 c7438 = (C7438) c0920.m1813(2);
        C1235 c1235M2053 = c1233.m2053();
        if (interfaceC7429 != null) {
            try {
                c4870 = new C4870(interfaceC7429, 14, c1235);
            } catch (Throwable th) {
                c1235M2053.m2104(false);
                throw th;
            }
        } else {
            c4870 = null;
        }
        if (!c7438.f20143.m12625()) {
            AbstractC1374.m2497("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c7438.f20144.m12624(interfaceC1356, c1235M2053, c1251, c4870);
        c1235M2053.m2104(true);
        c1235.m2105();
        c1230.getClass();
        c1235.m2095(c1233, c1233.m2055(c1230));
        c1235.m2123();
    }
}
