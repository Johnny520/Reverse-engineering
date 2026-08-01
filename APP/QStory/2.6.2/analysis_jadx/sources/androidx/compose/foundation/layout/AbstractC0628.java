package androidx.compose.foundation.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2115;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.C1726;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import androidx.compose.ui.platform.AbstractC1909;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p164.C7664;
import p180.AbstractC7753;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int f1768 = 15;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int f1769 = 5;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f1772 = 6;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f1773 = 10;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f1775 = 9;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0629 f1767 = new C0629(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0629 f1766 = new C0629(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0629 f1765 = new C0629(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0629 f1764 = new C0629(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0627 f1763 = new C0627();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0646 f1762 = new C0646();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0605 f1771 = new C0605();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0621 f1770 = new C0621(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0621 f1774 = new C0621(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static long m1411(int i, long j) {
        return AbstractC7896.m13297(0, C7897.m13309(j), (i & 4) != 0 ? C7897.m13312(j) : 0, C7897.m13310(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m1412(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return AbstractC7896.m13297(layoutOrientation == layoutOrientation2 ? C7897.m13313(j) : C7897.m13312(j), layoutOrientation == layoutOrientation2 ? C7897.m13309(j) : C7897.m13310(j), layoutOrientation == layoutOrientation2 ? C7897.m13312(j) : C7897.m13313(j), layoutOrientation == layoutOrientation2 ? C7897.m13310(j) : C7897.m13309(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1413(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        C0639 c0639 = C0639.f1793;
        C1324 c1324 = (C1324) interfaceC1373;
        int iHashCode = Long.hashCode(c1324.f3836);
        InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(interfaceC1373, interfaceC2129);
        C1253 c1253M2371 = c1324.m2371();
        InterfaceC1784.f5221.getClass();
        InterfaceC6542 interfaceC6542 = C1765.f5184;
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2386();
        if (c13242.f3837) {
            c13242.m2370(interfaceC6542);
        } else {
            c13242.m2380();
        }
        AbstractC1367.m2464(interfaceC1373, c0639, C1765.f5180);
        AbstractC1367.m2464(interfaceC1373, c1253M2371, C1765.f5181);
        AbstractC1367.m2472(interfaceC1373, C1765.f5186);
        AbstractC1367.m2464(interfaceC1373, interfaceC2129M3851, C1765.f5182);
        AbstractC1367.m2464(interfaceC1373, Integer.valueOf(iHashCode), C1765.f5187);
        c13242.m2367(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0666 m1414(float f, float f2, float f3, int i) {
        float f4 = (i & 1) != 0 ? 0.0f : 24.0f;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return new C0666(f4, f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1415(final InterfaceC2129 interfaceC2129, final InterfaceC0645 interfaceC0645, final InterfaceC0650 interfaceC0650, C2115 c2115, int i, int i2, final C1242 c1242, InterfaceC1373 interfaceC1373, final int i3) {
        final C2115 c21152;
        final int i4;
        final int i5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1303174015);
        int i6 = i3 | 224256;
        if (c1324.m2333(i6 & 1, (599187 & i6) != 599186)) {
            C2115 c21153 = C2119.f6261;
            m1416(interfaceC2129, interfaceC0645, interfaceC0650, C0588.f1648, c1242, c1324, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            c21152 = c21153;
        } else {
            c1324.m2329();
            c21152 = c2115;
            i4 = i;
            i5 = i2;
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553(interfaceC0645, interfaceC0650, c21152, i4, i5, c1242, i3) { // from class: androidx.compose.foundation.layout.飘花落叶言子世苏兰哲楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f1680;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C2115 f1681;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ int f1682;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
                public final /* synthetic */ C1242 f1683;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC0645 f1684;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC0650 f1685;

                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2460 = AbstractC1367.m2460(1573303);
                    AbstractC0628.m1415(this.f1686, this.f1684, this.f1685, this.f1681, this.f1680, this.f1682, this.f1683, (InterfaceC1373) obj, iM2460);
                    return C5175.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1416(InterfaceC2129 interfaceC2129, InterfaceC0645 interfaceC0645, InterfaceC0650 interfaceC0650, C0588 c0588, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        int i3;
        C2115 c2115 = C2119.f6261;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1956591841);
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2350(interfaceC0645) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2350(interfaceC0650) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2350(c2115) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2352(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c1324.m2352(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2350(c0588) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i) == 0) {
            i2 |= c1324.m2368(c1242) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (c1324.m2333(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (z || objM2335 == c1353) {
                objM2335 = new C0590(c0588.f1649);
                c1324.m2376(objM2335);
            }
            C0590 c0590 = (C0590) objM2335;
            int i6 = i4 >> 3;
            boolean zM2350 = ((((i6 & 14) ^ 6) > 4 && c1324.m2350(interfaceC0645)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && c1324.m2350(interfaceC0650)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && c1324.m2350(c2115)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && c1324.m2352(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && c1324.m2352(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | c1324.m2350(c0590);
            Object objM23352 = c1324.m2335();
            if (zM2350 || objM23352 == c1353) {
                i3 = i5;
                C0585 c0585 = new C0585(interfaceC0645, interfaceC0650, interfaceC0645.mo1445(), new C0598(c2115), interfaceC0650.mo1445(), c0590);
                c1324.m2376(c0585);
                objM23352 = c0585;
            } else {
                i3 = i5;
            }
            C0585 c05852 = (C0585) objM23352;
            boolean z2 = (i3 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & Opcodes.ASM7) == 131072);
            Object objM23353 = c1324.m2335();
            Object obj = objM23353;
            if (z2 || objM23353 == c1353) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1242(-1192950673, true, new C0592(c1242, 0)));
                c0588.getClass();
                int i7 = AbstractC0594.f1670[c0588.f1649.ordinal()];
                c1324.m2376(arrayList);
                obj = arrayList;
            }
            C1242 c1242M3100 = AbstractC1670.m3100((List) obj);
            boolean zM23502 = c1324.m2350(c05852);
            Object objM23354 = c1324.m2335();
            if (zM23502 || objM23354 == c1353) {
                objM23354 = new C1726(c05852);
                c1324.m2376(objM23354);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM23354;
            int iHashCode = Long.hashCode(c1324.f3836);
            C1253 c1253M2371 = c1324.m2371();
            InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, interfaceC2129);
            InterfaceC1784.f5221.getClass();
            InterfaceC6542 interfaceC6542 = C1765.f5184;
            c1324.m2386();
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            AbstractC1367.m2464(c1324, interfaceC1658, C1765.f5180);
            AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            AbstractC1367.m2472(c1324, C1765.f5186);
            AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
            c1242M3100.invoke(c1324, 0);
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0591(interfaceC2129, interfaceC0645, interfaceC0650, c0588, c1242, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C0671 m1417(C7664 c7664) {
        return new C0671(c7664.f20815, c7664.f20814, c7664.f20813, c7664.f20812);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long m1418(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? AbstractC7896.m13297(C7897.m13313(j), C7897.m13309(j), C7897.m13312(j), C7897.m13310(j)) : AbstractC7896.m13297(C7897.m13312(j), C7897.m13310(j), C7897.m13313(j), C7897.m13309(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1419(InterfaceC2129 interfaceC2129, C0653 c0653) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C0669(c0653));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC2129 m1420(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        return interfaceC2129.mo3856(new C0618(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m1421(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(SignatureVisitor.EXTENDS);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1422(InterfaceC2129 interfaceC2129, IntrinsicSize intrinsicSize) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C0672(intrinsicSize));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1423(InterfaceC2129 interfaceC2129, float f) {
        return interfaceC2129.mo3856(new C0667(f, f, f, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1424(InterfaceC2129 interfaceC2129, InterfaceC0664 interfaceC0664) {
        return interfaceC2129.mo3856(new C0663(interfaceC0664));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC2129 m1425(InterfaceC2129 interfaceC2129, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return interfaceC2129.mo3856(new C0667(f, f2, f3, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m1426(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1427(InterfaceC2129 interfaceC2129, float f, float f2) {
        return interfaceC2129.mo3856(new C0667(f, f2, f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static InterfaceC2129 m1428(InterfaceC2129 interfaceC2129, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m1427(interfaceC2129, f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m1429(C0662 c0662) {
        if (c0662 != null) {
            return c0662.f1843;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0662 m1430(InterfaceC1698 interfaceC1698) {
        Object objMo3046 = interfaceC1698.mo3046();
        if (objMo3046 instanceof C0662) {
            return (C0662) objMo3046;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1431(InterfaceC6557 interfaceC6557) {
        return new C0652(interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1432(InterfaceC2129 interfaceC2129, InterfaceC6557 interfaceC6557) {
        int i = AbstractC1909.f5627;
        return interfaceC2129.mo3856(new C0600(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC1657 m1433(InterfaceC0661 interfaceC0661, int i, int i2, int i3, int i4, int i5, InterfaceC1653 interfaceC1653, List list, AbstractC1724[] abstractC1724Arr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            InterfaceC1655 interfaceC1655 = (InterfaceC1655) list2.get(i14);
            float fM1429 = m1429(m1430(interfaceC1655));
            if (fM1429 > 0.0f) {
                f2 += fM1429;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                AbstractC1724 abstractC1724Mo3045 = abstractC1724Arr[i14];
                j = j2;
                if (abstractC1724Mo3045 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    abstractC1724Mo3045 = interfaceC1655.mo3045(interfaceC0661.mo1352(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                AbstractC1724 abstractC1724 = abstractC1724Mo3045;
                int iMo1351 = interfaceC0661.mo1351(abstractC1724);
                int iMo1355 = interfaceC0661.mo1355(abstractC1724);
                iArr2[i10 - i6] = iMo1351;
                int i18 = i17 - iMo1351;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iMo1351 + iMin;
                iMax = Math.max(iMax, iMo1355);
                abstractC1724Arr[i10] = abstractC1724;
                i15 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i19 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(m1429(m1430((InterfaceC1655) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (abstractC1724Arr[i21] == null) {
                    InterfaceC1655 interfaceC16552 = (InterfaceC1655) list2.get(i21);
                    f = f3;
                    C0662 c0662M1430 = m1430(interfaceC16552);
                    float fM14292 = m1429(c0662M1430);
                    if (fM14292 <= 0.0f) {
                        AbstractC7753.m13082("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fM14292 * f) + iSignum);
                    AbstractC1724 abstractC1724Mo30452 = interfaceC16552.mo3045(interfaceC0661.mo1352((!(c0662M1430 != null ? c0662M1430.f1842 : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo13512 = interfaceC0661.mo1351(abstractC1724Mo30452);
                    int iMo13552 = interfaceC0661.mo1355(abstractC1724Mo30452);
                    iArr2[i21 - i6] = iMo13512;
                    i23 += iMo13512;
                    int iMax3 = Math.max(i22, iMo13552);
                    abstractC1724Arr[i21] = abstractC1724Mo30452;
                    i22 = iMax3;
                    jRound = j5;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j4);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        interfaceC0661.mo1353(iMax4, interfaceC1653, iArr2, iArr3);
        return interfaceC0661.mo1354(abstractC1724Arr, interfaceC1653, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m1434(InterfaceC1655 interfaceC1655, C0585 c0585, long j, InterfaceC6557 interfaceC6557) {
        if (m1429(m1430(interfaceC1655)) != 0.0f) {
            c0585.getClass();
            interfaceC1655.mo3044(interfaceC1655.mo3049(Integer.MAX_VALUE));
            return;
        }
        m1430(interfaceC1655);
        AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        interfaceC6557.invoke(abstractC1724Mo3045);
        c0585.getClass();
        abstractC1724Mo3045.mo3129();
        abstractC1724Mo3045.mo3128();
    }
}
