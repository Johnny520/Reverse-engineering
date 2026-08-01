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
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0236 f1809 = m1442(true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0236 f1808 = m1442(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0639 f1807 = C0639.f1794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC1658 m1441(C2131 c2131, boolean z) {
        InterfaceC1658 interfaceC1658 = (InterfaceC1658) (z ? f1809 : f1808).m756(c2131);
        return interfaceC1658 == null ? new C0642(c2131, z) : interfaceC1658;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0236 m1442(boolean z) {
        C0236 c0236 = new C0236(9);
        C2131 c2131 = C2119.f6271;
        c0236.m754(c2131, new C0642(c2131, z));
        C2131 c21312 = C2119.f6269;
        c0236.m754(c21312, new C0642(c21312, z));
        C2131 c21313 = C2119.f6270;
        c0236.m754(c21313, new C0642(c21313, z));
        C2131 c21314 = C2119.f6264;
        c0236.m754(c21314, new C0642(c21314, z));
        C2131 c21315 = C2119.f6263;
        c0236.m754(c21315, new C0642(c21315, z));
        C2131 c21316 = C2119.f6267;
        c0236.m754(c21316, new C0642(c21316, z));
        C2131 c21317 = C2119.f6268;
        c0236.m754(c21317, new C0642(c21317, z));
        C2131 c21318 = C2119.f6265;
        c0236.m754(c21318, new C0642(c21318, z));
        C2131 c21319 = C2119.f6266;
        c0236.m754(c21319, new C0642(c21319, z));
        return c0236;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1443(AbstractC1708 abstractC1708, AbstractC1724 abstractC1724, InterfaceC1655 interfaceC1655, LayoutDirection layoutDirection, int i, int i2, C2131 c2131) {
        C2131 c21312;
        Object objMo3046 = interfaceC1655.mo3046();
        C0648 c0648 = objMo3046 instanceof C0648 ? (C0648) objMo3046 : null;
        AbstractC1708.m3124(abstractC1708, abstractC1724, ((c0648 == null || (c21312 = c0648.f1818) == null) ? c2131 : c21312).mo3849((((long) abstractC1724.f4998) << 32) | (((long) abstractC1724.f4996) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), layoutDirection));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1444(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-211209833);
        int i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c1324.f3836);
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, f1807, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0640(interfaceC2129, i, 0);
        }
    }
}
