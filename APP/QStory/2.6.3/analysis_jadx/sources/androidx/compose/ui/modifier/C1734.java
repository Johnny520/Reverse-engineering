package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1768;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.modifier.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f5010 = new C1224(0, new C1768[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1224 f5009 = new C1224(0, new C1732[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1224 f5008 = new C1224(0, new C1748[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1224 f5007 = new C1224(0, new C1732[16]);

    public C1734(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m3145(AbstractC2128 abstractC2128, C1732 c1732) {
        if (!abstractC2128.f6292.f6279) {
            AbstractC7936.m13423("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC21282 = abstractC2128.f6292;
        AbstractC2128 abstractC21283 = abstractC21282.f6288;
        if (abstractC21283 == null) {
            AbstractC1785.m3342(c1224, abstractC21282);
        } else {
            c1224.m2047(abstractC21283);
        }
        while (true) {
            int i = c1224.f3520;
            if (i == 0) {
                return;
            }
            AbstractC2128 abstractC21284 = (AbstractC2128) c1224.m2053(i - 1);
            if ((abstractC21284.f6285 & 32) != 0) {
                for (AbstractC2128 abstractC21285 = abstractC21284; abstractC21285 != null && abstractC21285.f6279; abstractC21285 = abstractC21285.f6288) {
                    if ((abstractC21285.f6291 & 32) != 0) {
                        ?? M3339 = abstractC21285;
                        ?? c12242 = 0;
                        while (M3339 != 0) {
                            if (M3339 instanceof InterfaceC1733) {
                                if (((InterfaceC1733) M3339).mo3144().m3146(c1732)) {
                                    break;
                                }
                            } else if ((M3339.f6291 & 32) != 0 && (M3339 instanceof AbstractC1788)) {
                                AbstractC2128 abstractC21286 = ((AbstractC1788) M3339).f5226;
                                int i2 = 0;
                                M3339 = M3339;
                                c12242 = c12242;
                                while (abstractC21286 != null) {
                                    if ((abstractC21286.f6291 & 32) != 0) {
                                        i2++;
                                        c12242 = c12242;
                                        if (i2 == 1) {
                                            M3339 = abstractC21286;
                                        } else {
                                            if (c12242 == 0) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (M3339 != 0) {
                                                c12242.m2047(M3339);
                                                M3339 = 0;
                                            }
                                            c12242.m2047(abstractC21286);
                                        }
                                    }
                                    abstractC21286 = abstractC21286.f6288;
                                    M3339 = M3339;
                                    c12242 = c12242;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3339 = AbstractC1785.m3339(c12242);
                        }
                    }
                }
            }
            AbstractC1785.m3342(c1224, abstractC21284);
        }
    }
}
