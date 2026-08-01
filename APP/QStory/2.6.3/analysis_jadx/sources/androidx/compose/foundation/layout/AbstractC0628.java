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
import kotlin.C5176;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p164.C7665;
import p180.AbstractC7754;
import p205.AbstractC7897;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int f1769 = 15;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int f1770 = 5;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f1773 = 6;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f1774 = 10;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f1776 = 9;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0629 f1768 = new C0629(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0629 f1767 = new C0629(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0629 f1766 = new C0629(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0629 f1765 = new C0629(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0627 f1764 = new C0627();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0646 f1763 = new C0646();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0605 f1772 = new C0605();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0621 f1771 = new C0621(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0621 f1775 = new C0621(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static long m1421(int i, long j) {
        return AbstractC7897.m13325(0, C7898.m13337(j), (i & 4) != 0 ? C7898.m13340(j) : 0, C7898.m13338(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m1422(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return AbstractC7897.m13325(layoutOrientation == layoutOrientation2 ? C7898.m13341(j) : C7898.m13340(j), layoutOrientation == layoutOrientation2 ? C7898.m13337(j) : C7898.m13338(j), layoutOrientation == layoutOrientation2 ? C7898.m13340(j) : C7898.m13341(j), layoutOrientation == layoutOrientation2 ? C7898.m13338(j) : C7898.m13337(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1423(InterfaceC1373 interfaceC1373, InterfaceC2129 interfaceC2129) {
        C0639 c0639 = C0639.f1794;
        C1324 c1324 = (C1324) interfaceC1373;
        int iHashCode = Long.hashCode(c1324.f3837);
        InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(interfaceC1373, interfaceC2129);
        C1253 c1253M2381 = c1324.m2381();
        InterfaceC1784.f5222.getClass();
        InterfaceC6543 interfaceC6543 = C1765.f5185;
        C1324 c13242 = (C1324) interfaceC1373;
        c13242.m2396();
        if (c13242.f3838) {
            c13242.m2380(interfaceC6543);
        } else {
            c13242.m2390();
        }
        AbstractC1367.m2472(interfaceC1373, c0639, C1765.f5181);
        AbstractC1367.m2472(interfaceC1373, c1253M2381, C1765.f5182);
        AbstractC1367.m2481(interfaceC1373, C1765.f5187);
        AbstractC1367.m2472(interfaceC1373, interfaceC2129M3861, C1765.f5183);
        AbstractC1367.m2472(interfaceC1373, Integer.valueOf(iHashCode), C1765.f5188);
        c13242.m2377(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0666 m1424(float f, float f2, float f3, int i) {
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
    public static final void m1425(final InterfaceC2129 interfaceC2129, final InterfaceC0645 interfaceC0645, final InterfaceC0650 interfaceC0650, C2115 c2115, int i, int i2, final C1242 c1242, InterfaceC1373 interfaceC1373, final int i3) {
        final C2115 c21152;
        final int i4;
        final int i5;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1303174015);
        int i6 = i3 | 224256;
        if (c1324.m2343(i6 & 1, (599187 & i6) != 599186)) {
            C2115 c21153 = C2119.f6262;
            m1426(interfaceC2129, interfaceC0645, interfaceC0650, C0588.f1649, c1242, c1324, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            c21152 = c21153;
        } else {
            c1324.m2339();
            c21152 = c2115;
            i4 = i;
            i5 = i2;
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554(interfaceC0645, interfaceC0650, c21152, i4, i5, c1242, i3) { // from class: androidx.compose.foundation.layout.飘花落叶言子世苏兰哲楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f1681;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C2115 f1682;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ int f1683;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
                public final /* synthetic */ C1242 f1684;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC0645 f1685;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC0650 f1686;

                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2471 = AbstractC1367.m2471(1573303);
                    AbstractC0628.m1425(this.f1687, this.f1685, this.f1686, this.f1682, this.f1681, this.f1683, this.f1684, (InterfaceC1373) obj, iM2471);
                    return C5176.f14739;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1426(InterfaceC2129 interfaceC2129, InterfaceC0645 interfaceC0645, InterfaceC0650 interfaceC0650, C0588 c0588, C1242 c1242, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        int i3;
        C2115 c2115 = C2119.f6262;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1956591841);
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC2129) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2360(interfaceC0645) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2360(interfaceC0650) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c1324.m2360(c2115) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c1324.m2362(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c1324.m2362(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c1324.m2360(c0588) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i) == 0) {
            i2 |= c1324.m2378(c1242) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (c1324.m2343(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (z || objM2345 == c1353) {
                objM2345 = new C0590(c0588.f1650);
                c1324.m2386(objM2345);
            }
            C0590 c0590 = (C0590) objM2345;
            int i6 = i4 >> 3;
            boolean zM2360 = ((((i6 & 14) ^ 6) > 4 && c1324.m2360(interfaceC0645)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && c1324.m2360(interfaceC0650)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && c1324.m2360(c2115)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && c1324.m2362(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && c1324.m2362(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | c1324.m2360(c0590);
            Object objM23452 = c1324.m2345();
            if (zM2360 || objM23452 == c1353) {
                i3 = i5;
                C0585 c0585 = new C0585(interfaceC0645, interfaceC0650, interfaceC0645.mo1455(), new C0598(c2115), interfaceC0650.mo1455(), c0590);
                c1324.m2386(c0585);
                objM23452 = c0585;
            } else {
                i3 = i5;
            }
            C0585 c05852 = (C0585) objM23452;
            boolean z2 = (i3 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & Opcodes.ASM7) == 131072);
            Object objM23453 = c1324.m2345();
            Object obj = objM23453;
            if (z2 || objM23453 == c1353) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1242(-1192950673, true, new C0592(c1242, 0)));
                c0588.getClass();
                int i7 = AbstractC0594.f1671[c0588.f1650.ordinal()];
                c1324.m2386(arrayList);
                obj = arrayList;
            }
            C1242 c1242M3110 = AbstractC1670.m3110((List) obj);
            boolean zM23602 = c1324.m2360(c05852);
            Object objM23454 = c1324.m2345();
            if (zM23602 || objM23454 == c1353) {
                objM23454 = new C1726(c05852);
                c1324.m2386(objM23454);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM23454;
            int iHashCode = Long.hashCode(c1324.f3837);
            C1253 c1253M2381 = c1324.m2381();
            InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, interfaceC2129);
            InterfaceC1784.f5222.getClass();
            InterfaceC6543 interfaceC6543 = C1765.f5185;
            c1324.m2396();
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            AbstractC1367.m2472(c1324, interfaceC1658, C1765.f5181);
            AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            AbstractC1367.m2481(c1324, C1765.f5187);
            AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
            c1242M3110.invoke(c1324, 0);
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0591(interfaceC2129, interfaceC0645, interfaceC0650, c0588, c1242, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C0671 m1427(C7665 c7665) {
        return new C0671(c7665.f20810, c7665.f20809, c7665.f20808, c7665.f20807);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long m1428(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? AbstractC7897.m13325(C7898.m13341(j), C7898.m13337(j), C7898.m13340(j), C7898.m13338(j)) : AbstractC7897.m13325(C7898.m13340(j), C7898.m13338(j), C7898.m13341(j), C7898.m13337(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1429(InterfaceC2129 interfaceC2129, C0653 c0653) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0669(c0653));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC2129 m1430(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        return interfaceC2129.mo3866(new C0618(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m1431(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(SignatureVisitor.EXTENDS);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1432(InterfaceC2129 interfaceC2129, IntrinsicSize intrinsicSize) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0672(intrinsicSize));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2129 m1433(InterfaceC2129 interfaceC2129, float f) {
        return interfaceC2129.mo3866(new C0667(f, f, f, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2129 m1434(InterfaceC2129 interfaceC2129, InterfaceC0664 interfaceC0664) {
        return interfaceC2129.mo3866(new C0663(interfaceC0664));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC2129 m1435(InterfaceC2129 interfaceC2129, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return interfaceC2129.mo3866(new C0667(f, f2, f3, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m1436(int i, int[] iArr, int[] iArr2, boolean z) {
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
    public static final InterfaceC2129 m1437(InterfaceC2129 interfaceC2129, float f, float f2) {
        return interfaceC2129.mo3866(new C0667(f, f2, f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static InterfaceC2129 m1438(InterfaceC2129 interfaceC2129, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m1437(interfaceC2129, f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m1439(C0662 c0662) {
        if (c0662 != null) {
            return c0662.f1844;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0662 m1440(InterfaceC1698 interfaceC1698) {
        Object objMo3056 = interfaceC1698.mo3056();
        if (objMo3056 instanceof C0662) {
            return (C0662) objMo3056;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC2129 m1441(InterfaceC6558 interfaceC6558) {
        return new C0652(interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2129 m1442(InterfaceC2129 interfaceC2129, InterfaceC6558 interfaceC6558) {
        int i = AbstractC1909.f5628;
        return interfaceC2129.mo3866(new C0600(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC1657 m1443(InterfaceC0661 interfaceC0661, int i, int i2, int i3, int i4, int i5, InterfaceC1653 interfaceC1653, List list, AbstractC1724[] abstractC1724Arr, int i6, int i7, int[] iArr, int i8) {
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
            float fM1439 = m1439(m1440(interfaceC1655));
            if (fM1439 > 0.0f) {
                f2 += fM1439;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                AbstractC1724 abstractC1724Mo3055 = abstractC1724Arr[i14];
                j = j2;
                if (abstractC1724Mo3055 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    abstractC1724Mo3055 = interfaceC1655.mo3055(interfaceC0661.mo1362(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                AbstractC1724 abstractC1724 = abstractC1724Mo3055;
                int iMo1361 = interfaceC0661.mo1361(abstractC1724);
                int iMo1365 = interfaceC0661.mo1365(abstractC1724);
                iArr2[i10 - i6] = iMo1361;
                int i18 = i17 - iMo1361;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iMo1361 + iMin;
                iMax = Math.max(iMax, iMo1365);
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
                jRound -= (long) Math.round(m1439(m1440((InterfaceC1655) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (abstractC1724Arr[i21] == null) {
                    InterfaceC1655 interfaceC16552 = (InterfaceC1655) list2.get(i21);
                    f = f3;
                    C0662 c0662M1440 = m1440(interfaceC16552);
                    float fM14392 = m1439(c0662M1440);
                    if (fM14392 <= 0.0f) {
                        AbstractC7754.m13110("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fM14392 * f) + iSignum);
                    AbstractC1724 abstractC1724Mo30552 = interfaceC16552.mo3055(interfaceC0661.mo1362((!(c0662M1440 != null ? c0662M1440.f1843 : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo13612 = interfaceC0661.mo1361(abstractC1724Mo30552);
                    int iMo13652 = interfaceC0661.mo1365(abstractC1724Mo30552);
                    iArr2[i21 - i6] = iMo13612;
                    i23 += iMo13612;
                    int iMax3 = Math.max(i22, iMo13652);
                    abstractC1724Arr[i21] = abstractC1724Mo30552;
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
        interfaceC0661.mo1363(iMax4, interfaceC1653, iArr2, iArr3);
        return interfaceC0661.mo1364(abstractC1724Arr, interfaceC1653, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m1444(InterfaceC1655 interfaceC1655, C0585 c0585, long j, InterfaceC6558 interfaceC6558) {
        if (m1439(m1440(interfaceC1655)) != 0.0f) {
            c0585.getClass();
            interfaceC1655.mo3054(interfaceC1655.mo3059(Integer.MAX_VALUE));
            return;
        }
        m1440(interfaceC1655);
        AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        interfaceC6558.invoke(abstractC1724Mo3055);
        c0585.getClass();
        abstractC1724Mo3055.mo3139();
        abstractC1724Mo3055.mo3138();
    }
}
