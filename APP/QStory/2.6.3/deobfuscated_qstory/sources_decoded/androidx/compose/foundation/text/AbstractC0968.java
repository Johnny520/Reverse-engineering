package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.lazy.C0764;
import androidx.compose.foundation.text.selection.AbstractC0895;
import androidx.compose.foundation.text.selection.AbstractC0929;
import androidx.compose.foundation.text.selection.C0930;
import androidx.compose.foundation.text.selection.InterfaceC0918;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.AbstractC1445;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.semantics.AbstractC1948;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.C7903;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f2758 = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1884(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i, int i2) {
        int i3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (c1324.m2343(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            AbstractC0628.m1423(c1324, AbstractC1445.m2584(AbstractC0619.m1386(interfaceC2129, f2758, 25.0f), new C0969(((C0930) c1324.m2383(AbstractC0929.f2638)).f2640, i5)));
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0764(interfaceC2129, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1885(InterfaceC0918 interfaceC0918, InterfaceC2129 interfaceC2129, final long j, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1776202187);
        int i3 = (c1324.m2360(interfaceC0918) ? 4 : 2) | i | (c1324.m2360(interfaceC2129) ? 32 : 16) | 128;
        if (c1324.m2343(i3 & 1, (i3 & 147) != 146)) {
            c1324.m2341();
            if ((i & 1) == 0 || c1324.m2353()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                c1324.m2339();
                i2 = i3 & (-897);
            }
            c1324.m2374();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM2345 = c1324.m2345();
            if (z || objM2345 == C1369.f3974) {
                objM2345 = new C0972(interfaceC0918, 0);
                c1324.m2386(objM2345);
            }
            final InterfaceC2129 interfaceC2129M3649 = AbstractC1948.m3649(interfaceC2129, false, (InterfaceC6558) objM2345);
            AbstractC0895.m1806(interfaceC0918, C2119.f6270, AbstractC1254.m2189(-1653527038, new InterfaceC6554() { // from class: androidx.compose.foundation.text.飘花落叶言子楪世苏兰哲
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        InterfaceC2129 interfaceC21292 = interfaceC2129M3649;
                        if (j2 != 9205357640488583168L) {
                            c13242.m2392(-1244013944);
                            InterfaceC2129 interfaceC2129M1380 = AbstractC0619.m1380(interfaceC21292, C7903.m13353(j2), C7903.m13354(j2), 0.0f, 0.0f, 12);
                            InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6270, false);
                            int iHashCode = Long.hashCode(c13242.f3837);
                            C1253 c1253M2381 = c13242.m2381();
                            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13242, interfaceC2129M1380);
                            InterfaceC1784.f5222.getClass();
                            InterfaceC6543 interfaceC6543 = C1765.f5185;
                            c13242.m2396();
                            if (c13242.f3838) {
                                c13242.m2380(interfaceC6543);
                            } else {
                                c13242.m2390();
                            }
                            AbstractC1367.m2472(c13242, interfaceC1658M1451, C1765.f5181);
                            AbstractC1367.m2472(c13242, c1253M2381, C1765.f5182);
                            AbstractC1367.m2472(c13242, Integer.valueOf(iHashCode), C1765.f5188);
                            AbstractC1367.m2481(c13242, C1765.f5187);
                            AbstractC1367.m2472(c13242, interfaceC2129M3861, C1765.f5183);
                            AbstractC0968.m1884(null, c13242, 0, 1);
                            c13242.m2377(true);
                            c13242.m2377(false);
                        } else {
                            c13242.m2392(-1243644858);
                            AbstractC0968.m1884(interfaceC21292, c13242, 0, 0);
                            c13242.m2377(false);
                        }
                    } else {
                        c13242.m2339();
                    }
                    return C5176.f14739;
                }
            }, c1324), c1324, i4 | 432);
        } else {
            c1324.m2339();
        }
        long j2 = j;
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0970(interfaceC0918, interfaceC2129, j2, i, 0);
        }
    }
}
