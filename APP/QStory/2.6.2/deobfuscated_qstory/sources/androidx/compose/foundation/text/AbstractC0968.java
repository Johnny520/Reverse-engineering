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
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p205.C7902;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float f2757 = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1874(InterfaceC2129 interfaceC2129, InterfaceC1373 interfaceC1373, int i, int i2) {
        int i3;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (c1324.m2333(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            AbstractC0628.m1413(c1324, AbstractC1445.m2574(AbstractC0619.m1376(interfaceC2129, f2757, 25.0f), new C0969(((C0930) c1324.m2373(AbstractC0929.f2637)).f2639, i5)));
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0764(interfaceC2129, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1875(InterfaceC0918 interfaceC0918, InterfaceC2129 interfaceC2129, final long j, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1776202187);
        int i3 = (c1324.m2350(interfaceC0918) ? 4 : 2) | i | (c1324.m2350(interfaceC2129) ? 32 : 16) | 128;
        if (c1324.m2333(i3 & 1, (i3 & 147) != 146)) {
            c1324.m2331();
            if ((i & 1) == 0 || c1324.m2343()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                c1324.m2329();
                i2 = i3 & (-897);
            }
            c1324.m2364();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM2335 = c1324.m2335();
            if (z || objM2335 == C1369.f3973) {
                objM2335 = new C0972(interfaceC0918, 0);
                c1324.m2376(objM2335);
            }
            final InterfaceC2129 interfaceC2129M3639 = AbstractC1948.m3639(interfaceC2129, false, (InterfaceC6557) objM2335);
            AbstractC0895.m1796(interfaceC0918, C2119.f6269, AbstractC1254.m2179(-1653527038, new InterfaceC6553() { // from class: androidx.compose.foundation.text.飘花落叶言子楪世苏兰哲
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    InterfaceC1373 interfaceC13732 = (InterfaceC1373) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    C1324 c13242 = (C1324) interfaceC13732;
                    if (c13242.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = j;
                        InterfaceC2129 interfaceC21292 = interfaceC2129M3639;
                        if (j2 != 9205357640488583168L) {
                            c13242.m2382(-1244013944);
                            InterfaceC2129 interfaceC2129M1370 = AbstractC0619.m1370(interfaceC21292, C7902.m13325(j2), C7902.m13326(j2), 0.0f, 0.0f, 12);
                            InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6269, false);
                            int iHashCode = Long.hashCode(c13242.f3836);
                            C1253 c1253M2371 = c13242.m2371();
                            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13242, interfaceC2129M1370);
                            InterfaceC1784.f5221.getClass();
                            InterfaceC6542 interfaceC6542 = C1765.f5184;
                            c13242.m2386();
                            if (c13242.f3837) {
                                c13242.m2370(interfaceC6542);
                            } else {
                                c13242.m2380();
                            }
                            AbstractC1367.m2464(c13242, interfaceC1658M1441, C1765.f5180);
                            AbstractC1367.m2464(c13242, c1253M2371, C1765.f5181);
                            AbstractC1367.m2464(c13242, Integer.valueOf(iHashCode), C1765.f5187);
                            AbstractC1367.m2472(c13242, C1765.f5186);
                            AbstractC1367.m2464(c13242, interfaceC2129M3851, C1765.f5182);
                            AbstractC0968.m1874(null, c13242, 0, 1);
                            c13242.m2367(true);
                            c13242.m2367(false);
                        } else {
                            c13242.m2382(-1243644858);
                            AbstractC0968.m1874(interfaceC21292, c13242, 0, 0);
                            c13242.m2367(false);
                        }
                    } else {
                        c13242.m2329();
                    }
                    return C5175.f14739;
                }
            }, c1324), c1324, i4 | 432);
        } else {
            c1324.m2329();
        }
        long j2 = j;
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0970(interfaceC0918, interfaceC2129, j2, i, 0);
        }
    }
}
