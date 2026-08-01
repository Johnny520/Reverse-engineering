package p126;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.AbstractC1374;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1233;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7442 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7442 f20153 = new C7442(0, 3, 1);

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        C4871 c4871;
        C1233 c1233 = (C1233) c0920.m1823(1);
        C1230 c1230 = (C1230) c0920.m1823(0);
        C7439 c7439 = (C7439) c0920.m1823(2);
        C1235 c1235M2063 = c1233.m2063();
        if (interfaceC7430 != null) {
            try {
                c4871 = new C4871(interfaceC7430, 14, c1235);
            } catch (Throwable th) {
                c1235M2063.m2114(false);
                throw th;
            }
        } else {
            c4871 = null;
        }
        if (!c7439.f20138.m12653()) {
            AbstractC1374.m2507("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c7439.f20139.m12650(interfaceC1356, c1235M2063, c1251, c4871);
        c1235M2063.m2114(true);
        c1235.m2115();
        c1230.getClass();
        c1235.m2105(c1233, c1233.m2065(c1230));
        c1235.m2133();
    }
}
