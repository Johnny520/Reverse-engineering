package androidx.compose.p001ui.modifier;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2603;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.modifier.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f5355 = new C2059(0, new C2603[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2059 f5354 = new C2059(0, new C2567[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2059 f5353 = new C2059(0, new C2583[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2059 f5352 = new C2059(0, new C2567[16]);

    public C2569(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
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
    public static void m3705(AbstractC2961 abstractC2961, C2567 c2567) {
        if (!abstractC2961.f6637.f6624) {
            AbstractC8765.m13982("visitSubtreeIf called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC29612 = abstractC2961.f6637;
        AbstractC2961 abstractC29613 = abstractC29612.f6633;
        if (abstractC29613 == null) {
            AbstractC2620.m3902(c2059, abstractC29612);
        } else {
            c2059.m2607(abstractC29613);
        }
        while (true) {
            int i = c2059.f3865;
            if (i == 0) {
                return;
            }
            AbstractC2961 abstractC29614 = (AbstractC2961) c2059.m2613(i - 1);
            if ((abstractC29614.f6630 & 32) != 0) {
                for (AbstractC2961 abstractC29615 = abstractC29614; abstractC29615 != null && abstractC29615.f6624; abstractC29615 = abstractC29615.f6633) {
                    if ((abstractC29615.f6636 & 32) != 0) {
                        ?? M3899 = abstractC29615;
                        ?? c20592 = 0;
                        while (M3899 != 0) {
                            if (M3899 instanceof InterfaceC2568) {
                                if (((InterfaceC2568) M3899).mo3704().m3706(c2567)) {
                                    break;
                                }
                            } else if ((M3899.f6636 & 32) != 0 && (M3899 instanceof AbstractC2623)) {
                                AbstractC2961 abstractC29616 = ((AbstractC2623) M3899).f5571;
                                int i2 = 0;
                                M3899 = M3899;
                                c20592 = c20592;
                                while (abstractC29616 != null) {
                                    if ((abstractC29616.f6636 & 32) != 0) {
                                        i2++;
                                        c20592 = c20592;
                                        if (i2 == 1) {
                                            M3899 = abstractC29616;
                                        } else {
                                            if (c20592 == 0) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (M3899 != 0) {
                                                c20592.m2607(M3899);
                                                M3899 = 0;
                                            }
                                            c20592.m2607(abstractC29616);
                                        }
                                    }
                                    abstractC29616 = abstractC29616.f6633;
                                    M3899 = M3899;
                                    c20592 = c20592;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3899 = AbstractC2620.m3899(c20592);
                        }
                    }
                }
            }
            AbstractC2620.m3902(c2059, abstractC29614);
        }
    }
}
