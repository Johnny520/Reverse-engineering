package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.C2948;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.C2561;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.p001ui.platform.AbstractC2744;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p180.C8494;
import p196.AbstractC8583;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final int f2114 = 15;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int f2115 = 5;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int f2118 = 6;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int f2119 = 10;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f2121 = 9;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1470 f2113 = new C1470(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1470 f2112 = new C1470(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1470 f2111 = new C1470(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1470 f2110 = new C1470(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1468 f2109 = new C1468();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1487 f2108 = new C1487();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1446 f2117 = new C1446();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1462 f2116 = new C1462(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1462 f2120 = new C1462(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static long m1981(int i, long j) {
        return AbstractC8726.m13884(0, C8727.m13896(j), (i & 4) != 0 ? C8727.m13899(j) : 0, C8727.m13897(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m1982(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return AbstractC8726.m13884(layoutOrientation == layoutOrientation2 ? C8727.m13900(j) : C8727.m13899(j), layoutOrientation == layoutOrientation2 ? C8727.m13896(j) : C8727.m13897(j), layoutOrientation == layoutOrientation2 ? C8727.m13899(j) : C8727.m13900(j), layoutOrientation == layoutOrientation2 ? C8727.m13897(j) : C8727.m13896(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1983(InterfaceC2208 interfaceC2208, InterfaceC2962 interfaceC2962) {
        C1480 c1480 = C1480.f2139;
        C2159 c2159 = (C2159) interfaceC2208;
        int iHashCode = Long.hashCode(c2159.f4182);
        InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(interfaceC2208, interfaceC2962);
        C2088 c2088M2941 = c2159.m2941();
        InterfaceC2619.f5567.getClass();
        InterfaceC7372 interfaceC7372 = C2600.f5530;
        C2159 c21592 = (C2159) interfaceC2208;
        c21592.m2956();
        if (c21592.f4183) {
            c21592.m2940(interfaceC7372);
        } else {
            c21592.m2950();
        }
        AbstractC2202.m3032(interfaceC2208, c1480, C2600.f5526);
        AbstractC2202.m3032(interfaceC2208, c2088M2941, C2600.f5527);
        AbstractC2202.m3041(interfaceC2208, C2600.f5532);
        AbstractC2202.m3032(interfaceC2208, interfaceC2962M4421, C2600.f5528);
        AbstractC2202.m3032(interfaceC2208, Integer.valueOf(iHashCode), C2600.f5533);
        c21592.m2937(true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C1507 m1984(float f, float f2, float f3, int i) {
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
        return new C1507(f4, f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m1985(final InterfaceC2962 interfaceC2962, final InterfaceC1486 interfaceC1486, final InterfaceC1491 interfaceC1491, C2948 c2948, int i, int i2, final C2077 c2077, InterfaceC2208 interfaceC2208, final int i3) {
        final C2948 c29482;
        final int i4;
        final int i5;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1303174015);
        int i6 = i3 | 224256;
        if (c2159.m2903(i6 & 1, (599187 & i6) != 599186)) {
            C2948 c29483 = C2952.f6607;
            m1986(interfaceC2962, interfaceC1486, interfaceC1491, C1429.f1994, c2077, c2159, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            c29482 = c29483;
        } else {
            c2159.m2899();
            c29482 = c2948;
            i4 = i;
            i5 = i2;
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(interfaceC1486, interfaceC1491, c29482, i4, i5, c2077, i3) { // from class: androidx.compose.foundation.layout.飘花落叶言子世苏兰哲楪

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
                public final /* synthetic */ int f2026;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C2948 f2027;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
                public final /* synthetic */ int f2028;

                /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
                public final /* synthetic */ C2077 f2029;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC1486 f2030;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC1491 f2031;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(1573303);
                    AbstractC1469.m1985(this.f2032, this.f2030, this.f2031, this.f2027, this.f2026, this.f2028, this.f2029, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1986(InterfaceC2962 interfaceC2962, InterfaceC1486 interfaceC1486, InterfaceC1491 interfaceC1491, C1429 c1429, C2077 c2077, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        int i3;
        C2948 c2948 = C2952.f6607;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1956591841);
        if ((i & 6) == 0) {
            i2 = (c2159.m2920(interfaceC2962) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(interfaceC1486) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2920(interfaceC1491) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c2159.m2920(c2948) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c2159.m2922(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c2159.m2922(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= c2159.m2920(c1429) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i) == 0) {
            i2 |= c2159.m2938(c2077) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if (c2159.m2903(i4 & 1, (i4 & 4793491) != 4793490)) {
            int i5 = i4 & 3670016;
            boolean z = i5 == 1048576;
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (z || objM2905 == c2188) {
                objM2905 = new C1431(c1429.f1995);
                c2159.m2946(objM2905);
            }
            C1431 c1431 = (C1431) objM2905;
            int i6 = i4 >> 3;
            boolean zM2920 = ((((i6 & 14) ^ 6) > 4 && c2159.m2920(interfaceC1486)) || (i6 & 6) == 4) | ((((i6 & 112) ^ 48) > 32 && c2159.m2920(interfaceC1491)) || (i6 & 48) == 32) | ((((i6 & 896) ^ 384) > 256 && c2159.m2920(c2948)) || (i6 & 384) == 256) | ((((i6 & 7168) ^ 3072) > 2048 && c2159.m2922(Integer.MAX_VALUE)) || (i6 & 3072) == 2048) | ((((57344 & i6) ^ 24576) > 16384 && c2159.m2922(Integer.MAX_VALUE)) || (i6 & 24576) == 16384) | c2159.m2920(c1431);
            Object objM29052 = c2159.m2905();
            if (zM2920 || objM29052 == c2188) {
                i3 = i5;
                C1426 c1426 = new C1426(interfaceC1486, interfaceC1491, interfaceC1486.mo2015(), new C1439(c2948), interfaceC1491.mo2015(), c1431);
                c2159.m2946(c1426);
                objM29052 = c1426;
            } else {
                i3 = i5;
            }
            C1426 c14262 = (C1426) objM29052;
            boolean z2 = (i3 == 1048576) | ((i4 & 29360128) == 8388608) | ((i4 & Opcodes.ASM7) == 131072);
            Object objM29053 = c2159.m2905();
            Object obj = objM29053;
            if (z2 || objM29053 == c2188) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C2077(-1192950673, true, new C1433(c2077, 0)));
                c1429.getClass();
                int i7 = AbstractC1435.f2016[c1429.f1995.ordinal()];
                c2159.m2946(arrayList);
                obj = arrayList;
            }
            C2077 c2077M3670 = AbstractC2505.m3670((List) obj);
            boolean zM29202 = c2159.m2920(c14262);
            Object objM29054 = c2159.m2905();
            if (zM29202 || objM29054 == c2188) {
                objM29054 = new C2561(c14262);
                c2159.m2946(objM29054);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM29054;
            int iHashCode = Long.hashCode(c2159.f4182);
            C2088 c2088M2941 = c2159.m2941();
            InterfaceC2962 interfaceC2962M4421 = AbstractC2953.m4421(c2159, interfaceC2962);
            InterfaceC2619.f5567.getClass();
            InterfaceC7372 interfaceC7372 = C2600.f5530;
            c2159.m2956();
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
            AbstractC2202.m3032(c2159, c2088M2941, C2600.f5527);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3041(c2159, C2600.f5532);
            AbstractC2202.m3032(c2159, interfaceC2962M4421, C2600.f5528);
            c2077M3670.invoke(c2159, 0);
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1432(interfaceC2962, interfaceC1486, interfaceC1491, c1429, c2077, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1512 m1987(C8494 c8494) {
        return new C1512(c8494.f21155, c8494.f21154, c8494.f21153, c8494.f21152);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final long m1988(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? AbstractC8726.m13884(C8727.m13900(j), C8727.m13896(j), C8727.m13899(j), C8727.m13897(j)) : AbstractC8726.m13884(C8727.m13899(j), C8727.m13897(j), C8727.m13900(j), C8727.m13896(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final InterfaceC2962 m1989(InterfaceC2962 interfaceC2962, C1494 c1494) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1510(c1494));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final InterfaceC2962 m1990(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        return interfaceC2962.mo4426(new C1459(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m1991(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(SignatureVisitor.EXTENDS);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final InterfaceC2962 m1992(InterfaceC2962 interfaceC2962, IntrinsicSize intrinsicSize) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1513(intrinsicSize));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC2962 m1993(InterfaceC2962 interfaceC2962, float f) {
        return interfaceC2962.mo4426(new C1508(f, f, f, f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m1994(InterfaceC2962 interfaceC2962, InterfaceC1505 interfaceC1505) {
        return interfaceC2962.mo4426(new C1504(interfaceC1505));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static InterfaceC2962 m1995(InterfaceC2962 interfaceC2962, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return interfaceC2962.mo4426(new C1508(f, f2, f3, 0.0f));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m1996(int i, int[] iArr, int[] iArr2, boolean z) {
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
    public static final InterfaceC2962 m1997(InterfaceC2962 interfaceC2962, float f, float f2) {
        return interfaceC2962.mo4426(new C1508(f, f2, f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static InterfaceC2962 m1998(InterfaceC2962 interfaceC2962, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m1997(interfaceC2962, f, f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final float m1999(C1503 c1503) {
        if (c1503 != null) {
            return c1503.f2189;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1503 m2000(InterfaceC2533 interfaceC2533) {
        Object objMo3616 = interfaceC2533.mo3616();
        if (objMo3616 instanceof C1503) {
            return (C1503) objMo3616;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC2962 m2001(InterfaceC7387 interfaceC7387) {
        return new C1493(interfaceC7387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2962 m2002(InterfaceC2962 interfaceC2962, InterfaceC7387 interfaceC7387) {
        int i = AbstractC2744.f5973;
        return interfaceC2962.mo4426(new C1441(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final InterfaceC2492 m2003(InterfaceC1502 interfaceC1502, int i, int i2, int i3, int i4, int i5, InterfaceC2488 interfaceC2488, List list, AbstractC2559[] abstractC2559Arr, int i6, int i7, int[] iArr, int i8) {
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
            InterfaceC2490 interfaceC2490 = (InterfaceC2490) list2.get(i14);
            float fM1999 = m1999(m2000(interfaceC2490));
            if (fM1999 > 0.0f) {
                f2 += fM1999;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                AbstractC2559 abstractC2559Mo3615 = abstractC2559Arr[i14];
                j = j2;
                if (abstractC2559Mo3615 == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    abstractC2559Mo3615 = interfaceC2490.mo3615(interfaceC1502.mo1922(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                AbstractC2559 abstractC2559 = abstractC2559Mo3615;
                int iMo1921 = interfaceC1502.mo1921(abstractC2559);
                int iMo1925 = interfaceC1502.mo1925(abstractC2559);
                iArr2[i10 - i6] = iMo1921;
                int i18 = i17 - iMo1921;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iMo1921 + iMin;
                iMax = Math.max(iMax, iMo1925);
                abstractC2559Arr[i10] = abstractC2559;
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
                jRound -= (long) Math.round(m1999(m2000((InterfaceC2490) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (abstractC2559Arr[i21] == null) {
                    InterfaceC2490 interfaceC24902 = (InterfaceC2490) list2.get(i21);
                    f = f3;
                    C1503 c1503M2000 = m2000(interfaceC24902);
                    float fM19992 = m1999(c1503M2000);
                    if (fM19992 <= 0.0f) {
                        AbstractC8583.m13669("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fM19992 * f) + iSignum);
                    AbstractC2559 abstractC2559Mo36152 = interfaceC24902.mo3615(interfaceC1502.mo1922((!(c1503M2000 != null ? c1503M2000.f2188 : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iMo19212 = interfaceC1502.mo1921(abstractC2559Mo36152);
                    int iMo19252 = interfaceC1502.mo1925(abstractC2559Mo36152);
                    iArr2[i21 - i6] = iMo19212;
                    i23 += iMo19212;
                    int iMax3 = Math.max(i22, iMo19252);
                    abstractC2559Arr[i21] = abstractC2559Mo36152;
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
        interfaceC1502.mo1923(iMax4, interfaceC2488, iArr2, iArr3);
        return interfaceC1502.mo1924(abstractC2559Arr, interfaceC2488, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m2004(InterfaceC2490 interfaceC2490, C1426 c1426, long j, InterfaceC7387 interfaceC7387) {
        if (m1999(m2000(interfaceC2490)) != 0.0f) {
            c1426.getClass();
            interfaceC2490.mo3614(interfaceC2490.mo3619(Integer.MAX_VALUE));
            return;
        }
        m2000(interfaceC2490);
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        interfaceC7387.invoke(abstractC2559Mo3615);
        c1426.getClass();
        abstractC2559Mo3615.mo3699();
        abstractC2559Mo3615.mo3698();
    }
}
