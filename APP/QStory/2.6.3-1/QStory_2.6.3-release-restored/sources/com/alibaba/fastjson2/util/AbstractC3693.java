package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.google.protobuf.DescriptorProtos$Edition;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.sql.Struct;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.InterfaceC5942;
import p294.C9194;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3693 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static volatile Method f9310;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static volatile Method f9311;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static volatile Constructor f9312;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static volatile boolean f9313;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static volatile boolean f9314;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static volatile Class f9315;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static volatile boolean f9316;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static volatile Method f9317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class f9318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Class f9319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Class f9320;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static BiFunction f9324;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static volatile boolean f9325;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static Class f9326;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static volatile boolean f9327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Class f9328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static volatile boolean f9329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Supplier f9330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Function f9331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Supplier f9332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Method f9333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Function f9334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Function f9335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Supplier f9336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Class f9337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Supplier f9338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Function f9339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BiFunction f9340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Function f9341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f9323 = new String[1024];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f9322 = new String[1024];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[][] f9321 = {new int[]{1}, new int[]{10}, new int[]{100}, new int[]{DescriptorProtos$Edition.EDITION_2023_VALUE}, new int[]{10000}, new int[]{100000}, new int[]{1000000}, new int[]{10000000}, new int[]{100000000}, new int[]{1000000000}, new int[]{2, 1410065408}, new int[]{23, 1215752192}, new int[]{232, -727379968}, new int[]{2328, 1316134912}, new int[]{23283, 276447232}, new int[]{232830, -1530494976}, new int[]{2328306, 1874919424}, new int[]{23283064, 1569325056}, new int[]{232830643, -1486618624}, new int[]{-1966660860, -1981284352}, new int[]{5, 1808227885, 1661992960}, new int[]{54, 902409669, -559939584}, new int[]{542, 434162106, -1304428544}, new int[]{5421, 46653770, -159383552}, new int[]{54210, 466537709, -1593835520}, new int[]{542101, 370409800, 1241513984}, new int[]{5421010, -590869294, -469762048}, new int[]{54210108, -1613725636, -402653184}, new int[]{542101086, 1042612833, 268435456}, new int[]{1, 1126043566, 1836193738, -1610612736}, new int[]{12, -1624466224, 1182068202, 1073741824}, new int[]{126, 935206946, -1064219866, Integer.MIN_VALUE}, new int[]{1262, 762134875, -2052264063, 0}, new int[]{12621, -968585837, 952195850, 0}, new int[]{126217, -1095923776, 932023908, 0}, new int[]{1262177, 1925664130, 730304488, 0}, new int[]{12621774, 2076772117, -1286889712, 0}, new int[]{126217744, -707115303, 16004768, 0}, new int[]{1262177448, 1518781562, 160047680, 0}, new int[]{2, -263127405, -1992053564, 1600476800, 0}, new int[]{29, 1663693251, 1554300843, -1175101184, 0}, new int[]{293, -542936671, -1636860747, 1133890048, 0}, new int[]{2938, -1134399408, 811261716, -1546001408, 0}, new int[]{29387, 1540907809, -477317426, 1719855104, 0}, new int[]{293873, -1770791086, -478206960, 18681856, 0}, new int[]{2938735, -528041668, -487102304, 186818560, 0}, new int[]{29387358, -985449376, -576055744, 1868185600, 0}, new int[]{293873587, -1264559160, -1465590140, 1501986816, 0}, new int[]{-1356231419, 239310294, -1770999509, 2134966272, 0}, new int[]{6, -677412302, -1901864351, -530125902, -125173760, 0}, new int[]{68, 1815811577, -1838774318, -1006291715, -1251737600, 0}, new int[]{684, 978246591, -1207873989, -1472982551, 367525888, 0}, new int[]{6842, 1192531325, 806162004, -1844923622, -619708416, 0}, new int[]{68422, -959588637, -528314547, -1269367028, -1902116864, 0}, new int[]{684227, -1005951770, -988178167, 191231613, -1841299456, 0}, new int[]{6842277, -1469583101, -1291847078, 1912316135, -1233125376, 0}, new int[]{68422776, -1810929116, -33568888, 1943292173, 553648128, 0}, new int[]{684227765, -929421967, -335688876, -2041914749, 1241513984, 0}, new int[]{1, -1747656935, -704285069, 938078541, 1055688992, -469762048, 0}, new int[]{15, -296700158, 1547083904, 790850820, 1966955336, -402653184, 0}, new int[]{159, 1327965719, -1709030143, -681426388, -1805283111, 268435456, 0}, new int[]{1593, 394755308, 89567762, 1775670717, -872961926, -1610612736, 0}, new int[]{15930, -347414216, 895677624, 576837993, -139684662, 1073741824, 0}, new int[]{159309, 820825138, 366841649, 1473412643, -1396846618, Integer.MIN_VALUE, 0}};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m6332(Class cls) {
        if (f9328 == null && !f9329) {
            try {
                f9328 = Struct.class;
            } catch (Throwable unused) {
                f9329 = true;
            }
        }
        Class cls2 = f9328;
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static long m6333(String str) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < str.length()) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 255 || (i == 0 && cCharAt == 0)) {
                    break;
                }
                if (cCharAt == '-' || cCharAt == '_' || cCharAt == ' ') {
                    i2++;
                }
                i++;
            } else if (str.length() - i2 <= 8) {
                int i3 = 0;
                long j = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 != '-' && cCharAt2 != '_' && cCharAt2 != ' ') {
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                            cCharAt2 = (char) (cCharAt2 + ' ');
                        }
                        j = i3 == 0 ? (byte) cCharAt2 : (j << 8) + ((long) cCharAt2);
                        i3++;
                    }
                }
                if (j != 0) {
                    return j;
                }
            }
        }
        long j2 = -3750763034362895579L;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt3 = str.charAt(i4);
            if (cCharAt3 != '-' && cCharAt3 != '_' && cCharAt3 != ' ') {
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                }
                j2 = (j2 ^ ((long) cCharAt3)) * 1099511628211L;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static long m6334(String str) {
        if (str.length() <= 8) {
            int i = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt > 255 || (i == 0 && cCharAt == 0)) {
                        break;
                    }
                    i++;
                } else {
                    int length = str.length() - 1;
                    long jCharAt = 0;
                    while (length >= 0) {
                        jCharAt = length == str.length() + (-1) ? (byte) r7 : (jCharAt << 8) + ((long) str.charAt(length));
                        length--;
                    }
                    if (jCharAt != 0) {
                        return jCharAt;
                    }
                }
            }
        }
        long jCharAt2 = -3750763034362895579L;
        for (int i2 = 0; i2 < str.length(); i2++) {
            jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
        }
        return jCharAt2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m6335(int[] iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int length = iArr.length - 1;
        while (length > 0 && iArr[length] == 0) {
            length--;
        }
        int i = iArr[length];
        if (i == 0) {
            return -1;
        }
        return Integer.numberOfTrailingZeros(i) + (((iArr.length - 1) - length) << 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6336(Class cls, C9194 c9194) {
        String[] strArr = c9194.f23453;
        List list = null;
        int i = 0;
        Constructor constructor = null;
        for (Constructor constructor2 : AbstractC3698.m6381(cls)) {
            int parameterCount = constructor2.getParameterCount();
            if (strArr == null || parameterCount == strArr.length) {
                if (parameterCount > 2) {
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes[parameterCount - 2] == Integer.TYPE && parameterTypes[parameterCount - 1] == AbstractC5217.class) {
                        c9194.f23455 = constructor2;
                    } else if (constructor == null || i < parameterCount) {
                        constructor = constructor2;
                        i = parameterCount;
                    }
                }
            }
        }
        if (i != 0) {
            try {
                Iterator it = AbstractC5228.f13320.mo9476(cls).mo9442().iterator();
                while (it.hasNext()) {
                    List parameters = ((InterfaceC5942) it.next()).getParameters();
                    if (list == null || i == parameters.size()) {
                        list = parameters;
                    }
                }
                if (list != null) {
                    int size = list.size();
                    String[] strArr2 = new String[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        strArr2[i2] = ((InterfaceC5940) list.get(i2)).getName();
                    }
                    c9194.f23453 = strArr2;
                }
            } catch (Throwable unused) {
            }
        }
        c9194.f23454 = constructor;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m6337(int i, int i2, long j) {
        int[] iArr;
        int[] iArr2;
        int i3;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int iDivideUnsigned;
        int iRemainderUnsigned;
        int i4;
        int i5;
        long j2;
        int i6;
        int[] iArr6;
        int iRemainderUnsigned2;
        int i7;
        int i8;
        int[] iArr7;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr8 = f9321[i2];
        char c = ' ';
        int i13 = (int) (j >>> 32);
        int i14 = (int) j;
        int i15 = 0;
        int i16 = 1;
        if (i <= 0) {
            int i17 = -i;
            int i18 = i17 >>> 5;
            int i19 = i17 & 31;
            if (i19 == 0) {
                iArr3 = new int[i18 + 2];
                iArr3[0] = i13;
                iArr3[1] = i14;
                long j3 = 0;
                if (iArr3.length >= iArr8.length) {
                    return 0L;
                }
                int i20 = Integer.MIN_VALUE;
                if (iArr3.length == iArr8.length) {
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < iArr3.length) {
                        if (iArr3[i21] - Integer.MIN_VALUE == iArr8[i22] - Integer.MIN_VALUE) {
                            i21++;
                            i22++;
                        }
                    }
                    return 1L;
                }
                long j4 = 4294967295L;
                if (iArr8.length == 1) {
                    long j5 = ((long) iArr8[0]) & 4294967295L;
                    int length = iArr3.length;
                    if (iArr3.length == 1) {
                        return Integer.divideUnsigned(iArr3[0], r1);
                    }
                    int[] iArr9 = new int[length];
                    int i23 = length;
                    long jRemainderUnsigned = 0;
                    while (i23 > 0) {
                        int i24 = length - i23;
                        char c2 = c;
                        long j6 = j3;
                        long j7 = (((long) iArr3[i24]) & 4294967295L) | (jRemainderUnsigned << c);
                        int iDivideUnsigned2 = (int) Long.divideUnsigned(j7, j5);
                        jRemainderUnsigned = Long.remainderUnsigned(j7, j5);
                        iArr9[i24] = iDivideUnsigned2;
                        i23--;
                        c = c2;
                        j3 = j6;
                    }
                    char c3 = c;
                    long j8 = j3;
                    if (length != 0) {
                        while (i15 < length && iArr9[i15] == 0) {
                            i15++;
                        }
                        if (length != i15) {
                            return ((((long) iArr9[length - 2]) & 4294967295L) << c3) + (((long) iArr9[length - 1]) & 4294967295L);
                        }
                    }
                    return j8;
                }
                if (iArr3.length >= 6 && Math.min(m6335(iArr3), m6335(iArr8)) >= 96) {
                    C1123.m1410("assert error");
                    return 0L;
                }
                int length2 = iArr3.length;
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iArr8[0]);
                int length3 = iArr8.length;
                if (iNumberOfLeadingZeros > 0) {
                    iArr4 = new int[length3];
                    m6339(iNumberOfLeadingZeros, 0, iArr8, iArr4);
                    if (Integer.numberOfLeadingZeros(iArr3[0]) >= iNumberOfLeadingZeros) {
                        iArr5 = new int[length2 + 1];
                        m6339(iNumberOfLeadingZeros, 1, iArr3, iArr5);
                    } else {
                        iArr5 = new int[length2 + 2];
                        length2++;
                        int i25 = 32 - iNumberOfLeadingZeros;
                        int i26 = 0;
                        int i27 = 0;
                        int i28 = 1;
                        while (i28 < length2) {
                            int i29 = iArr3[i27];
                            iArr5[i28] = (i26 << iNumberOfLeadingZeros) | (i29 >>> i25);
                            i28++;
                            i27++;
                            i26 = i29;
                        }
                        iArr5[length2] = i26 << iNumberOfLeadingZeros;
                    }
                } else {
                    iArr4 = (int[]) iArr8.clone();
                    iArr5 = new int[length2 + 1];
                    System.arraycopy(iArr3, 0, iArr5, 1, length2);
                }
                int i30 = length2 - length3;
                int i31 = i30 + 1;
                int[] iArr10 = new int[i31];
                iArr5[0] = 0;
                int i32 = iArr4[0];
                long j9 = ((long) i32) & 4294967295L;
                int i33 = iArr4[1];
                int i34 = 0;
                while (i34 < i30) {
                    int i35 = i20;
                    int i36 = iArr5[i34];
                    int i37 = i15;
                    int i38 = i36 + i35;
                    int i39 = i34 + 1;
                    int i40 = i16;
                    int i41 = iArr5[i39];
                    if (i36 == i32) {
                        int i42 = i36 + i41;
                        i8 = i42 + i35 < i38 ? i40 : i37;
                        i6 = i30;
                        iRemainderUnsigned2 = i42;
                        iArr6 = iArr10;
                        j2 = j4;
                        i7 = -1;
                    } else {
                        j2 = j4;
                        long j10 = ((long) i36) << 32;
                        i6 = i30;
                        iArr6 = iArr10;
                        long j11 = (((long) i41) & j2) | j10;
                        int iDivideUnsigned3 = (int) Long.divideUnsigned(j11, j9);
                        iRemainderUnsigned2 = (int) Long.remainderUnsigned(j11, j9);
                        i7 = iDivideUnsigned3;
                        i8 = i37;
                    }
                    if (i7 == 0) {
                        iArr7 = iArr5;
                        i9 = length3;
                        i10 = i6;
                    } else {
                        if (i8 == 0) {
                            long j12 = ((long) iArr5[i34 + 2]) & j2;
                            iArr7 = iArr5;
                            i9 = length3;
                            long j13 = ((long) iRemainderUnsigned2) & j2;
                            long j14 = (j13 << 32) | j12;
                            long j15 = ((long) i33) & j2;
                            long j16 = (((long) i7) & j2) * j15;
                            if (m6338(j16, j14)) {
                                long j17 = ((long) ((int) (j13 + j9))) & j2;
                                i7 = (j17 < j9 || !m6338(j16 - j15, (j17 << 32) | j12)) ? i7 - 1 : i7 - 2;
                            }
                        } else {
                            iArr7 = iArr5;
                            i9 = length3;
                        }
                        iArr7[i34] = i37;
                        long j18 = ((long) i7) & j2;
                        int i43 = i9 - 1;
                        int i44 = i34 + i9;
                        int i45 = i7;
                        long j19 = 0;
                        while (i43 >= 0) {
                            long j20 = j18;
                            long j21 = ((((long) iArr4[i43]) & j2) * j20) + j19;
                            long j22 = ((long) iArr7[i44]) - j21;
                            int i46 = i44 - 1;
                            int i47 = i6;
                            iArr7[i44] = (int) j22;
                            j19 = (j21 >>> 32) + ((long) ((j22 & j2) > (((long) (~((int) j21))) & j2) ? i40 : i37));
                            i43--;
                            j18 = j20;
                            i44 = i46;
                            i6 = i47;
                        }
                        i10 = i6;
                        if (((int) j19) + i35 > i38) {
                            long j23 = 0;
                            for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                                int i48 = length4 + i39;
                                long j24 = (((long) iArr4[length4]) & j2) + (((long) iArr7[i48]) & j2) + j23;
                                iArr7[i48] = (int) j24;
                                j23 = j24 >>> 32;
                            }
                            i11 = i45 - 1;
                        } else {
                            i11 = i45;
                        }
                        iArr6[i34] = i11;
                    }
                    i20 = i35;
                    length3 = i9;
                    i15 = i37;
                    i34 = i39;
                    i16 = i40;
                    j4 = j2;
                    iArr10 = iArr6;
                    iArr5 = iArr7;
                    i30 = i10;
                }
                int i49 = i30;
                int[] iArr11 = iArr10;
                int[] iArr12 = iArr5;
                int i50 = i20;
                int i51 = i15;
                int i52 = i16;
                long j25 = j4;
                int i53 = length3;
                int i54 = iArr12[i49];
                int i55 = i54 + i50;
                int i56 = iArr12[i31];
                if (i54 == i32) {
                    iRemainderUnsigned = i54 + i56;
                    i4 = iRemainderUnsigned + i50 < i55 ? i52 : i51;
                    iDivideUnsigned = -1;
                } else {
                    long j26 = (((long) i56) & j25) | (((long) i54) << 32);
                    iDivideUnsigned = (int) Long.divideUnsigned(j26, j9);
                    iRemainderUnsigned = (int) Long.remainderUnsigned(j26, j9);
                    i4 = i51;
                }
                if (iDivideUnsigned != 0) {
                    if (i4 == 0) {
                        long j27 = ((long) iArr12[i49 + 2]) & j25;
                        long j28 = ((long) iRemainderUnsigned) & j25;
                        long j29 = ((long) i33) & j25;
                        i5 = i53;
                        long j30 = (((long) iDivideUnsigned) & j25) * j29;
                        if (m6338(j30, (j28 << 32) | j27)) {
                            long j31 = ((long) ((int) (j28 + j9))) & j25;
                            iDivideUnsigned = (j31 < j9 || !m6338(j30 - j29, (j31 << 32) | j27)) ? iDivideUnsigned - 1 : iDivideUnsigned - 2;
                        }
                    } else {
                        i5 = i53;
                    }
                    iArr12[i49] = i51;
                    int i57 = i49 + i5;
                    long j32 = ((long) iDivideUnsigned) & j25;
                    int i58 = i5 - 1;
                    long j33 = 0;
                    while (i58 >= 0) {
                        long j34 = ((((long) iArr4[i58]) & j25) * j32) + j33;
                        int i59 = i57 - 1;
                        j33 = ((long) (((((long) iArr12[i57]) - j34) & j25) > (((long) (~((int) j34))) & j25) ? i52 : i51)) + (j34 >>> 32);
                        i58--;
                        i57 = i59;
                    }
                    if (((int) j33) + i50 > i55) {
                        iDivideUnsigned--;
                    }
                    iArr11[i49] = iDivideUnsigned;
                }
                int i60 = i51;
                while (i60 < i31 && iArr11[i60] == 0) {
                    i60++;
                }
                if (i31 == i60) {
                    return 0L;
                }
                return ((((long) iArr11[i49 - 1]) & j25) << 32) + (((long) iArr11[i49]) & j25);
            }
            int i61 = 32 - i19;
            int i62 = i13 >>> i61;
            if (i62 != 0) {
                iArr = new int[i18 + 3];
                iArr[0] = i62;
                i12 = 1;
            } else {
                iArr = new int[i18 + 2];
                i12 = 0;
            }
            iArr[i12] = (i13 << i19) | (i14 >>> i61);
            iArr[i12 + 1] = i14 << i19;
        } else {
            iArr = new int[]{i13, i14};
            int i63 = i >>> 5;
            int i64 = i & 31;
            int length5 = iArr8.length;
            if (i64 == 0) {
                int[] iArr13 = new int[i63 + length5];
                System.arraycopy(iArr8, 0, iArr13, 0, length5);
                iArr8 = iArr13;
            } else {
                int i65 = 32 - i64;
                int i66 = iArr8[0] >>> i65;
                if (i66 != 0) {
                    iArr2 = new int[i63 + length5 + 1];
                    iArr2[0] = i66;
                    i3 = 1;
                } else {
                    iArr2 = new int[i63 + length5];
                    i3 = 0;
                }
                int i67 = 0;
                while (i67 < length5 - 1) {
                    int i68 = i67 + 1;
                    iArr2[i3] = (iArr8[i67] << i64) | (iArr8[i68] >>> i65);
                    i3++;
                    i67 = i68;
                }
                iArr2[i3] = iArr8[i67] << i64;
                iArr8 = iArr2;
            }
        }
        iArr3 = iArr;
        long j35 = 0;
        if (iArr3.length >= iArr8.length) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean m6338(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m6339(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = 32 - i;
        int length = iArr.length - 1;
        int i4 = 0;
        int i5 = iArr[0];
        while (i4 < length) {
            int i6 = i4 + 1;
            int i7 = iArr[i6];
            iArr2[i4 + i2] = (i5 << i) | (i7 >>> i3);
            i4 = i6;
            i5 = i7;
        }
        iArr2[i2 + length] = i5 << i;
    }
}
