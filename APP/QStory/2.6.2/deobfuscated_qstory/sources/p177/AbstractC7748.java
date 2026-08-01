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
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p116.AbstractC7346;
import p181.AbstractC7754;
import p181.C7755;
import p205.C7892;
import top.suzhelan.qstory.ui.components.C5971;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7745 f21029;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        C1358 c1358 = AbstractC2091.f6197;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = C1599.f4693;
        long j2 = C1599.f4695;
        f21029 = new C7745(j, j2, j2, C1599.m2940(0.38f, j2), C1599.m2940(0.38f, j2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13078(final String str, final boolean z, final C7745 c7745, final InterfaceC2129 interfaceC2129, final InterfaceC6550 interfaceC6550, final InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324;
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2381(-2001167027);
        if ((i & 6) == 0) {
            i2 = (c13242.m2350(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13242.m2369(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13242.m2350(c7745) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c13242.m2350(interfaceC2129) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c13242.m2368(interfaceC6550) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c13242.m2368(interfaceC6542) ? 131072 : 65536;
        }
        int i3 = i2;
        if (c13242.m2333(i3 & 1, (74899 & i3) != 74898)) {
            C2115 c2115 = AbstractC7742.f21011;
            float f = AbstractC7742.f21009;
            C0649 c0649 = new C0649(f, new C0630());
            boolean z2 = ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objM2335 = c13242.m2335();
            if (z2 || objM2335 == C1369.f3973) {
                objM2335 = new C0778(interfaceC6542, 2, z);
                c13242.m2376(objM2335);
            }
            InterfaceC2129 interfaceC2129M1428 = AbstractC0628.m1428(AbstractC0619.m1375(AbstractC0619.m1374(AbstractC1072.m1978(interfaceC2129, z, str, null, (InterfaceC6542) objM2335, 12), 1.0f)), f, 0.0f, 2);
            C0660 c0660M1450 = AbstractC0658.m1450(c0649, c2115, c13242, 54);
            int iHashCode = Long.hashCode(c13242.f3836);
            C1253 c1253M2371 = c13242.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c13242, interfaceC2129M1428);
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC65422 = C1765.f5184;
            c13242.m2386();
            if (c13242.f3837) {
                c13242.m2370(interfaceC65422);
            } else {
                c13242.m2380();
            }
            InterfaceC6553 interfaceC6553 = C1765.f5180;
            AbstractC1367.m2464(c13242, c0660M1450, interfaceC6553);
            InterfaceC6553 interfaceC65532 = C1765.f5181;
            AbstractC1367.m2464(c13242, c1253M2371, interfaceC65532);
            Integer numValueOf = Integer.valueOf(iHashCode);
            InterfaceC6553 interfaceC65533 = C1765.f5187;
            AbstractC1367.m2464(c13242, numValueOf, interfaceC65533);
            InterfaceC6557 interfaceC6557 = C1765.f5186;
            AbstractC1367.m2472(c13242, interfaceC6557);
            InterfaceC6553 interfaceC65534 = C1765.f5182;
            AbstractC1367.m2464(c13242, interfaceC2129M3851, interfaceC65534);
            if (interfaceC6550 == null) {
                c13242.m2382(-1597947094);
                c13242.m2367(false);
            } else {
                c13242.m2382(-1597947093);
                float f2 = AbstractC7742.f21007;
                InterfaceC2129 interfaceC2129M1370 = AbstractC0619.m1370(C2125.f6275, f2, 0.0f, f2, f2, 2);
                InterfaceC1658 interfaceC1658M1441 = AbstractC0643.m1441(C2119.f6271, false);
                int iHashCode2 = Long.hashCode(c13242.f3836);
                C1253 c1253M23712 = c13242.m2371();
                InterfaceC2129 interfaceC2129M38512 = AbstractC2120.m3851(c13242, interfaceC2129M1370);
                c13242.m2386();
                if (c13242.f3837) {
                    c13242.m2370(interfaceC65422);
                } else {
                    c13242.m2380();
                }
                AbstractC1367.m2464(c13242, interfaceC1658M1441, interfaceC6553);
                AbstractC1367.m2464(c13242, c1253M23712, interfaceC65532);
                AbstractC1367.m2464(c13242, Integer.valueOf(iHashCode2), interfaceC65533);
                AbstractC1367.m2472(c13242, interfaceC6557);
                AbstractC1367.m2464(c13242, interfaceC2129M38512, interfaceC65534);
                interfaceC6550.invoke(new C1599(z ? c7745.f21024 : c7745.f21022), c13242, 0);
                c13242.m2367(true);
                c13242.m2367(false);
            }
            long j = z ? c7745.f21025 : c7745.f21023;
            AbstractC0983.m1884(str, new C0655(1.0f, true), new C2031(j, AbstractC7742.f21012, AbstractC7742.f21015, AbstractC7742.f21014, 0L, AbstractC7742.f21010, AbstractC7742.f21016, 16613240), null, 0, false, 1, 0, c13242, (i3 & 14) | 1572864, 952);
            c1324 = c13242;
            c1324.m2367(true);
        } else {
            c1324 = c13242;
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪苏世哲兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC7748.m13078(str, z, c7745, interfaceC2129, interfaceC6550, interfaceC6542, (InterfaceC1373) obj, AbstractC1367.m2460(i | 1));
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m13079(InterfaceC2129 interfaceC2129, C7745 c7745, InterfaceC6557 interfaceC6557, InterfaceC1373 interfaceC1373, int i, int i2) {
        int i3;
        int i4;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (c1324.m2350(c7745) ? 32 : 16);
        }
        int i7 = i4 | (c1324.m2368(interfaceC6557) ? 256 : 128);
        if (c1324.m2333(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                interfaceC2129 = C2125.f6275;
            }
            if (i6 != 0) {
                c7745 = f21029;
            }
            m13080(c7745, interfaceC2129, AbstractC1254.m2179(-250345048, new C5971(interfaceC6557, c7745), c1324), c1324, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            c1324.m2329();
        }
        InterfaceC2129 interfaceC21292 = interfaceC2129;
        C7745 c77452 = c7745;
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(interfaceC21292, c77452, interfaceC6557, i, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13080(C7745 c7745, InterfaceC2129 interfaceC2129, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-527864079);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(c7745) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2350(interfaceC2129) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(c1242) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            C2115 c2115 = AbstractC7742.f21011;
            C7755 c7755M13084 = AbstractC7754.m13084(4.0f);
            boolean z = C7892.m13291(3.0f, 0.0f) > 0;
            long j = AbstractC1579.f4657;
            InterfaceC2129 interfaceC2129M1428 = AbstractC0628.m1428(AbstractC0628.m1422(AbstractC1072.m1970((C7892.m13291(3.0f, 0.0f) > 0 || z) ? interfaceC2129.mo3856(new C1442(c7755M13084, z, j, j)) : interfaceC2129, c7745.f21026, AbstractC1581.f4661), IntrinsicSize.Max), 0.0f, AbstractC7742.f21008, 1);
            Object[] objArr = new Object[0];
            boolean zM2352 = c1324.m2352(0);
            Object objM2335 = c1324.m2335();
            if (zM2352 || objM2335 == C1369.f3973) {
                objM2335 = new C1074(3);
                c1324.m2376(objM2335);
            }
            InterfaceC2129 interfaceC2129M1975 = AbstractC1072.m1975(interfaceC2129M1428, (C1040) AbstractC7346.m12511(objArr, C1040.f3054, (InterfaceC6542) objM2335, c1324, 0));
            int i3 = (i2 << 3) & 7168;
            C0638 c0638M1439 = AbstractC0633.m1439(AbstractC0628.f1763, C2119.f6258, c1324, 0);
            int iHashCode = Long.hashCode(c1324.f3836);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129M1975);
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, c0638M1439, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            c1242.invoke(C0636.f1785, c1324, Integer.valueOf(((i3 >> 6) & 112) | 6));
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(c7745, interfaceC2129, c1242, i, 9);
        }
    }
}
