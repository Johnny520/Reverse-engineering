package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class MutableBigInteger {
    private static final int[][] BIG_TEN_POWERS_MAGIC_TABLE = {new int[]{1}, new int[]{10}, new int[]{100}, new int[]{1000}, new int[]{10000}, new int[]{100000}, new int[]{1000000}, new int[]{10000000}, new int[]{100000000}, new int[]{Http2Connection.DEGRADED_PONG_TIMEOUT_NS}, new int[]{2, 1410065408}, new int[]{23, 1215752192}, new int[]{232, -727379968}, new int[]{2328, 1316134912}, new int[]{23283, 276447232}, new int[]{232830, -1530494976}, new int[]{2328306, 1874919424}, new int[]{23283064, 1569325056}, new int[]{232830643, -1486618624}, new int[]{-1966660860, -1981284352}, new int[]{5, 1808227885, 1661992960}, new int[]{54, 902409669, -559939584}, new int[]{542, 434162106, -1304428544}, new int[]{5421, 46653770, -159383552}, new int[]{54210, 466537709, -1593835520}, new int[]{542101, 370409800, 1241513984}, new int[]{5421010, -590869294, -469762048}, new int[]{54210108, -1613725636, -402653184}, new int[]{542101086, 1042612833, 268435456}, new int[]{1, 1126043566, 1836193738, -1610612736}, new int[]{12, -1624466224, 1182068202, 1073741824}, new int[]{126, 935206946, -1064219866, Integer.MIN_VALUE}, new int[]{1262, 762134875, -2052264063, 0}, new int[]{12621, -968585837, 952195850, 0}, new int[]{126217, -1095923776, 932023908, 0}, new int[]{1262177, 1925664130, 730304488, 0}, new int[]{12621774, 2076772117, -1286889712, 0}, new int[]{126217744, -707115303, 16004768, 0}, new int[]{1262177448, 1518781562, 160047680, 0}, new int[]{2, -263127405, -1992053564, 1600476800, 0}, new int[]{29, 1663693251, 1554300843, -1175101184, 0}, new int[]{293, -542936671, -1636860747, 1133890048, 0}, new int[]{2938, -1134399408, 811261716, -1546001408, 0}, new int[]{29387, 1540907809, -477317426, 1719855104, 0}, new int[]{293873, -1770791086, -478206960, 18681856, 0}, new int[]{2938735, -528041668, -487102304, 186818560, 0}, new int[]{29387358, -985449376, -576055744, 1868185600, 0}, new int[]{293873587, -1264559160, -1465590140, 1501986816, 0}, new int[]{-1356231419, 239310294, -1770999509, 2134966272, 0}, new int[]{6, -677412302, -1901864351, -530125902, -125173760, 0}, new int[]{68, 1815811577, -1838774318, -1006291715, -1251737600, 0}, new int[]{684, 978246591, -1207873989, -1472982551, 367525888, 0}, new int[]{6842, 1192531325, 806162004, -1844923622, -619708416, 0}, new int[]{68422, -959588637, -528314547, -1269367028, -1902116864, 0}, new int[]{684227, -1005951770, -988178167, 191231613, -1841299456, 0}, new int[]{6842277, -1469583101, -1291847078, 1912316135, -1233125376, 0}, new int[]{68422776, -1810929116, -33568888, 1943292173, 553648128, 0}, new int[]{684227765, -929421967, -335688876, -2041914749, 1241513984, 0}, new int[]{1, -1747656935, -704285069, 938078541, 1055688992, -469762048, 0}, new int[]{15, -296700158, 1547083904, 790850820, 1966955336, -402653184, 0}, new int[]{Opcodes.IF_ICMPEQ, 1327965719, -1709030143, -681426388, -1805283111, 268435456, 0}, new int[]{1593, 394755308, 89567762, 1775670717, -872961926, -1610612736, 0}, new int[]{15930, -347414216, 895677624, 576837993, -139684662, 1073741824, 0}, new int[]{159309, 820825138, 366841649, 1473412643, -1396846618, Integer.MIN_VALUE, 0}};
    static final int KNUTH_POW2_THRESH_LEN = 6;
    static final int KNUTH_POW2_THRESH_ZEROS = 3;
    static final long LONG_MASK = 4294967295L;

    private static int divadd(int[] iArr, int[] iArr2, int i10) {
        long j10 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i11 = length + i10;
            long j11 = (((long) iArr[length]) & LONG_MASK) + (LONG_MASK & ((long) iArr2[i11])) + j10;
            iArr2[i11] = (int) j11;
            j10 = j11 >>> 32;
        }
        return (int) j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long divideKnuthLong(long r32, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.MutableBigInteger.divideKnuthLong(long, int, int):long");
    }

    private static long divideOneWordLong(int[] iArr, int i10) {
        long j10 = ((long) i10) & LONG_MASK;
        int length = iArr.length;
        if (iArr.length == 1) {
            return Integer.divideUnsigned(iArr[0], i10);
        }
        int[] iArr2 = new int[length];
        long jRemainderUnsigned = 0;
        for (int i11 = length; i11 > 0; i11--) {
            int i12 = length - i11;
            long j11 = (jRemainderUnsigned << 32) | (((long) iArr[i12]) & LONG_MASK);
            int iDivideUnsigned = (int) Long.divideUnsigned(j11, j10);
            jRemainderUnsigned = Long.remainderUnsigned(j11, j10);
            iArr2[i12] = iDivideUnsigned;
        }
        return longValue(iArr2, length);
    }

    private static boolean equals(int[] iArr, int[] iArr2) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArr.length) {
            if (iArr[i10] - Integer.MIN_VALUE != iArr2[i11] - Integer.MIN_VALUE) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    private static int getLowestSetBit(int[] iArr) {
        if (iArr.length == 0) {
            return -1;
        }
        int length = iArr.length - 1;
        while (length > 0 && iArr[length] == 0) {
            length--;
        }
        int i10 = iArr[length];
        if (i10 == 0) {
            return -1;
        }
        return (((iArr.length - 1) - length) << 5) + Integer.numberOfTrailingZeros(i10);
    }

    private static long longValue(int[] iArr, int i10) {
        if (i10 == 0) {
            return 0L;
        }
        int i11 = 0;
        while (i11 < i10 && iArr[i11] == 0) {
            i11++;
        }
        if (i10 == i11) {
            return 0L;
        }
        return ((((long) iArr[i10 - 2]) & LONG_MASK) << 32) + (((long) iArr[i10 - 1]) & LONG_MASK);
    }

    private static void primitiveLeftShift(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = 32 - i10;
        int length = iArr.length - 1;
        int i13 = 0;
        int i14 = iArr[0];
        while (i13 < length) {
            int i15 = i13 + 1;
            int i16 = iArr[i15];
            iArr2[i13 + i11] = (i14 << i10) | (i16 >>> i12);
            i13 = i15;
            i14 = i16;
        }
        iArr2[i11 + length] = i14 << i10;
    }

    private static int[] shiftLeft(int[] iArr, int i10) {
        int[] iArr2;
        int i11;
        int i12 = i10 >>> 5;
        int i13 = i10 & 31;
        int length = iArr.length;
        int i14 = 0;
        if (i13 == 0) {
            int[] iArr3 = new int[i12 + length];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            return iArr3;
        }
        int i15 = 32 - i13;
        int i16 = iArr[0] >>> i15;
        if (i16 != 0) {
            iArr2 = new int[i12 + length + 1];
            iArr2[0] = i16;
            i11 = 1;
        } else {
            iArr2 = new int[i12 + length];
            i11 = 0;
        }
        while (i14 < length - 1) {
            int i17 = i14 + 1;
            iArr2[i11] = (iArr[i14] << i13) | (iArr[i17] >>> i15);
            i11++;
            i14 = i17;
        }
        iArr2[i11] = iArr[i14] << i13;
        return iArr2;
    }

    private static boolean unsignedLongCompare(long j10, long j11) {
        return j10 + Long.MIN_VALUE > j11 + Long.MIN_VALUE;
    }
}
