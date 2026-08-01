package androidx.compose.foundation.layout;

import androidx.collection.C0236;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2131;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0236 f1810 = m1452(true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0236 f1809 = m1452(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0639 f1808 = C0639.f1795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC1658 m1451(C2131 c2131, boolean z) {
        InterfaceC1658 interfaceC1658 = (InterfaceC1658) (z ? f1810 : f1809).m757(c2131);
        return interfaceC1658 == null ? new C0642(c2131, z) : interfaceC1658;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0236 m1452(boolean z) {
        C0236 c0236 = new C0236(9);
        C2131 c2131 = C2119.f6272;
        c0236.m755(c2131, new C0642(c2131, z));
        C2131 c21312 = C2119.f6270;
        c0236.m755(c21312, new C0642(c21312, z));
        C2131 c21313 = C2119.f6271;
        c0236.m755(c21313, new C0642(c21313, z));
        C2131 c21314 = C2119.f6265;
        c0236.m755(c21314, new C0642(c21314, z));
        C2131 c21315 = C2119.f6264;
        c0236.m755(c21315, new C0642(c21315, z));
        C2131 c21316 = C2119.f6268;
        c0236.m755(c21316, new C0642(c21316, z));
        C2131 c21317 = C2119.f6269;
        c0236.m755(c21317, new C0642(c21317, z));
        C2131 c21318 = C2119.f6266;
        c0236.m755(c21318, new C0642(c21318, z));
        C2131 c21319 = C2119.f6267;
        c0236.m755(c21319, new C0642(c21319, z));
        return c0236;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1453(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, InterfaceC1655 interfaceC1655, LayoutDirection layoutDirection, int i, int i2, C2131 c2131) {
        C2131 c21312;
        Object objMo3056 = interfaceC1655.mo3056();
        C0648 c0648 = objMo3056 instanceof C0648 ? (C0648) objMo3056 : null;
        AbstractC1708.m3134(abstractC1708, abstractC1724, ((c0648 == null || (c21312 = c0648.f1819) == null) ? c2131 : c21312).mo3859((((long) abstractC1724.f4999) << 32) | (((long) abstractC1724.f4997) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), layoutDirection));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1454(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-211209833);
        int i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c1324.f3837);
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, f1808, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0640(interfaceC2129, i, 0);
        }
    }
}
