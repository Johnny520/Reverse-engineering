package p177;

import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.C1040;
import androidx.compose.foundation.C1074;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0633;
import androidx.compose.foundation.layout.AbstractC0643;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0630;
import androidx.compose.foundation.layout.C0636;
import androidx.compose.foundation.layout.C0638;
import androidx.compose.foundation.layout.C0649;
import androidx.compose.foundation.layout.C0655;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.foundation.selection.C0778;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.draw.C1442;
import androidx.compose.ui.graphics.AbstractC1579;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.window.AbstractC2091;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p116.AbstractC7347;
import p181.AbstractC7755;
import p181.C7756;
import p205.C7893;
import top.suzhelan.qstory.ui.components.C5977;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7746 f21026;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        C1358 c1358 = AbstractC2091.f6198;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = C1599.f4694;
        long j2 = C1599.f4696;
        f21026 = new C7746(j, j2, j2, C1599.m2950(0.38f, j2), C1599.m2950(0.38f, j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13106(final String str, final boolean z, final C7746 c7746, final InterfaceC2129 interfaceC2129, final InterfaceC6551 interfaceC6551, final InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324;
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2391(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c13242.m2360(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13242.m2379(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13242.m2360(c7746) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13242.m2360(interfaceC2129) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13242.m2378(interfaceC6551) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13242.m2378(interfaceC6543) ? 131072 : 65536;
        }
        int i3 = i2;
        if (c13242.m2343(i3 & 1, (74899 & i3) != 74898)) {
            C2115 c2115 = AbstractC7743.f21008;
            float f = AbstractC7743.f21006;
            C0649 c0649 = new C0649(f, new C0630());
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objM2345 = c13242.m2345();
            if (z2 || objM2345 == C1369.f3974) {
                objM2345 = new C0778(interfaceC6543, 2, z);
                c13242.m2386(objM2345);
            }
            InterfaceC2129 interfaceC2129M1438 = AbstractC0628.m1438(AbstractC0619.m1385(AbstractC0619.m1384(AbstractC1072.m1988(interfaceC2129, z, str, null, (InterfaceC6543) objM2345, 12), 1.0f)), f, 0.0f, 2);
            C0660 c0660M1460 = AbstractC0658.m1460(c0649, c2115, c13242, 54);
            int iHashCode = Long.hashCode(c13242.f3837);
            C1253 c1253M2381 = c13242.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c13242, interfaceC2129M1438);
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC65432 = C1765.f5185;
            c13242.m2396();
            if (c13242.f3838) {
                c13242.m2380(interfaceC65432);
            } else {
                c13242.m2390();
            }
            InterfaceC6554 interfaceC6554 = C1765.f5181;
            AbstractC1367.m2472(c13242, c0660M1460, interfaceC6554);
            InterfaceC6554 interfaceC65542 = C1765.f5182;
            AbstractC1367.m2472(c13242, c1253M2381, interfaceC65542);
            Integer numValueOf = Integer.valueOf(iHashCode);
            InterfaceC6554 interfaceC65543 = C1765.f5188;
            AbstractC1367.m2472(c13242, numValueOf, interfaceC65543);
            InterfaceC6558 interfaceC6558 = C1765.f5187;
            AbstractC1367.m2481(c13242, interfaceC6558);
            InterfaceC6554 interfaceC65544 = C1765.f5183;
            AbstractC1367.m2472(c13242, interfaceC2129M3861, interfaceC65544);
            if (interfaceC6551 == null) {
                c13242.m2392(-1597947094);
                c13242.m2377(false);
            } else {
                c13242.m2392(-1597947093);
                float f2 = AbstractC7743.f21004;
                InterfaceC2129 interfaceC2129M1380 = AbstractC0619.m1380(C2125.f6276, f2, 0.0f, f2, f2, 2);
                InterfaceC1658 interfaceC1658M1451 = AbstractC0643.m1451(C2119.f6272, false);
                int iHashCode2 = Long.hashCode(c13242.f3837);
                C1253 c1253M23812 = c13242.m2381();
                InterfaceC2129 interfaceC2129M38612 = AbstractC2120.m3861(c13242, interfaceC2129M1380);
                c13242.m2396();
                if (c13242.f3838) {
                    c13242.m2380(interfaceC65432);
                } else {
                    c13242.m2390();
                }
                AbstractC1367.m2472(c13242, interfaceC1658M1451, interfaceC6554);
                AbstractC1367.m2472(c13242, c1253M23812, interfaceC65542);
                AbstractC1367.m2472(c13242, Integer.valueOf(iHashCode2), interfaceC65543);
                AbstractC1367.m2481(c13242, interfaceC6558);
                AbstractC1367.m2472(c13242, interfaceC2129M38612, interfaceC65544);
                interfaceC6551.invoke(new C1599(z ? c7746.f21021 : c7746.f21019), c13242, 0);
                c13242.m2377(true);
                c13242.m2377(false);
            }
            long j = z ? c7746.f21022 : c7746.f21020;
            AbstractC0983.m1894(str, new C0655(1.0f, true), new C2031(j, AbstractC7743.f21009, AbstractC7743.f21012, AbstractC7743.f21011, 0L, AbstractC7743.f21007, AbstractC7743.f21013, 16613240), null, 0, false, 1, 0, c13242, (i3 & 14) | 1572864, 952);
            c1324 = c13242;
            c1324.m2377(true);
        } else {
            c1324 = c13242;
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世哲兰
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC7749.m13106(str, z, c7746, interfaceC2129, interfaceC6551, interfaceC6543, (InterfaceC1373) obj, AbstractC1367.m2471(i | 1));
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13107(InterfaceC2129 interfaceC2129, C7746 c7746, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373, int i, int i2) {
        int i3;
        int i4;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c1324.m2360(c7746) ? 32 : 16);
        }
        int i7 = i4 | (c1324.m2378(interfaceC6558) ? 256 : 128);
        if (c1324.m2343(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC2129 = C2125.f6276;
            }
            if (i6 != 0) {
                c7746 = f21026;
            }
            m13108(c7746, interfaceC2129, AbstractC1254.m2189(-250345048, new C5977(interfaceC6558, c7746), c1324), c1324, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c1324.m2339();
        }
        InterfaceC2129 interfaceC21292 = interfaceC2129;
        C7746 c77462 = c7746;
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(interfaceC21292, c77462, interfaceC6558, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13108(C7746 c7746, InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-527864079);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(c7746) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(interfaceC2129) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(c1242) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            C2115 c2115 = AbstractC7743.f21008;
            C7756 c7756M13112 = AbstractC7755.m13112(4.0f);
            boolean z = C7893.m13319(3.0f, 0.0f) > 0;
            long j = AbstractC1579.f4658;
            InterfaceC2129 interfaceC2129M1438 = AbstractC0628.m1438(AbstractC0628.m1432(AbstractC1072.m1980((C7893.m13319(3.0f, 0.0f) > 0 || z) ? interfaceC2129.mo3866(new C1442(c7756M13112, z, j, j)) : interfaceC2129, c7746.f21023, AbstractC1581.f4662), IntrinsicSize.Max), 0.0f, AbstractC7743.f21005, 1);
            Object[] objArr = new Object[0];
            boolean zM2362 = c1324.m2362(0);
            Object objM2345 = c1324.m2345();
            if (zM2362 || objM2345 == C1369.f3974) {
                objM2345 = new C1074(3);
                c1324.m2386(objM2345);
            }
            InterfaceC2129 interfaceC2129M1985 = AbstractC1072.m1985(interfaceC2129M1438, (C1040) AbstractC7347.m12538(objArr, C1040.f3055, (InterfaceC6543) objM2345, c1324, 0));
            int i3 = (i2 << 3) & 7168;
            C0638 c0638M1449 = AbstractC0633.m1449(AbstractC0628.f1764, C2119.f6259, c1324, 0);
            int iHashCode = Long.hashCode(c1324.f3837);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129M1985);
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, c0638M1449, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            c1242.invoke(C0636.f1786, c1324, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(c7746, interfaceC2129, c1242, i, 9);
        }
    }
}
