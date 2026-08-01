package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONB;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberUtils {
    static final long INFI;
    static final long INFINITY;
    static final int MOD_DOUBLE_EXP = 2047;
    static final long MOD_DOUBLE_MANTISSA = 4503599627370495L;
    static final int MOD_FLOAT_EXP = 255;
    static final int MOD_FLOAT_MANTISSA = 8388607;
    static final LongBiFunction MULTIPLY_HIGH;
    static final double[] NEGATIVE_DECIMAL_POWER;
    static final char[][] NEGATIVE_DECIMAL_POWER_CHARS;
    static final long NITY;
    static final double[] POSITIVE_DECIMAL_POWER;
    static final char[][] POSITIVE_DECIMAL_POWER_CHARS;
    static final long[] POW10_LONG_VALUES;
    static final BigInteger[] POW5_BI_VALUES;
    static final long[] POW5_LONG_VALUES;
    static final short[] TWO_DIGITS_16_BITS;
    static final int[] TWO_DIGITS_32_BITS;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @FunctionalInterface
    public interface LongBiFunction {
        long multiplyHigh(long j10, long j11);
    }

    static {
        LongBiFunction longBiFunctionInvokeExact;
        long j10;
        int i10;
        int i11;
        if (JDKUtils.JVM_VERSION <= 8 || JDKUtils.ANDROID) {
            longBiFunctionInvokeExact = null;
        } else {
            try {
                MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(NumberUtils.class);
                Class cls = Long.TYPE;
                MethodType methodType = MethodType.methodType(cls, cls, cls);
                longBiFunctionInvokeExact = (LongBiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "multiplyHigh", MethodType.methodType(LongBiFunction.class), methodType, lookupTrustedLookup.findStatic(Math.class, "multiplyHigh", methodType), methodType).getTarget().invokeExact();
            } catch (Throwable unused) {
                longBiFunctionInvokeExact = null;
            }
        }
        if (longBiFunctionInvokeExact == null) {
            longBiFunctionInvokeExact = new LongBiFunction() { // from class: com.alibaba.fastjson2.util.y
                @Override // com.alibaba.fastjson2.util.NumberUtils.LongBiFunction
                public final long multiplyHigh(long j11, long j12) {
                    return NumberUtils.multiplyHigh(j11, j12);
                }
            };
        }
        MULTIPLY_HIGH = longBiFunctionInvokeExact;
        INFINITY = IOUtils.getLongUnaligned("Infinity".getBytes(StandardCharsets.ISO_8859_1), 0);
        char[] charArray = "Infinity".toCharArray();
        INFI = IOUtils.getLongUnaligned(charArray, 0);
        NITY = IOUtils.getLongUnaligned(charArray, 4);
        double[] dArr = new double[325];
        POSITIVE_DECIMAL_POWER = dArr;
        NEGATIVE_DECIMAL_POWER = new double[325];
        POW10_LONG_VALUES = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L, Long.MAX_VALUE};
        POW5_LONG_VALUES = new long[27];
        POW5_BI_VALUES = new BigInteger[343];
        int length = dArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            POSITIVE_DECIMAL_POWER[i12] = Double.valueOf("1.0E" + i12).doubleValue();
            NEGATIVE_DECIMAL_POWER[i12] = Double.valueOf("1.0E-" + i12).doubleValue();
        }
        double[] dArr2 = NEGATIVE_DECIMAL_POWER;
        dArr2[dArr2.length - 1] = Double.MIN_VALUE;
        int i13 = 0;
        long j11 = 1;
        while (true) {
            long[] jArr = POW5_LONG_VALUES;
            if (i13 >= jArr.length) {
                break;
            }
            jArr[i13] = j11;
            j11 *= 5;
            i13++;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
        POW5_BI_VALUES[0] = BigInteger.ONE;
        int i14 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = POW5_BI_VALUES;
            if (i14 >= bigIntegerArr.length) {
                break;
            }
            bigIntegerArr[i14] = bigIntegerValueOf.pow(i14);
            i14++;
        }
        char[][] cArr = new char[325][];
        POSITIVE_DECIMAL_POWER_CHARS = cArr;
        NEGATIVE_DECIMAL_POWER_CHARS = new char[325][];
        int length2 = cArr.length;
        for (int i15 = 0; i15 < length2; i15++) {
            POSITIVE_DECIMAL_POWER_CHARS[i15] = ("1.0E" + i15).toCharArray();
            NEGATIVE_DECIMAL_POWER_CHARS[i15] = ("1.0E-" + i15).toCharArray();
        }
        char[][] cArr2 = NEGATIVE_DECIMAL_POWER_CHARS;
        cArr2[cArr2.length - 1] = "4.9E-324".toCharArray();
        TWO_DIGITS_32_BITS = new int[100];
        TWO_DIGITS_16_BITS = new short[100];
        for (long j12 = 0; j12 < 10; j12++) {
            for (long j13 = 0; j13 < 10; j13++) {
                if (JDKUtils.BIG_ENDIAN) {
                    j10 = ((j12 + 48) << 16) | (48 + j13);
                    i10 = (((int) j12) + 48) << 8;
                    i11 = (int) j13;
                } else {
                    j10 = ((j13 + 48) << 16) | (48 + j12);
                    i10 = (((int) j13) + 48) << 8;
                    i11 = (int) j12;
                }
                int i16 = i10 | (i11 + 48);
                int i17 = (int) ((j12 * 10) + j13);
                TWO_DIGITS_32_BITS[i17] = (int) j10;
                TWO_DIGITS_16_BITS[i17] = (short) i16;
            }
        }
    }

    private NumberUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.util.Scientific doubleToScientific(double r28) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.NumberUtils.doubleToScientific(double):com.alibaba.fastjson2.util.Scientific");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.util.Scientific floatToScientific(float r24) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.NumberUtils.floatToScientific(float):com.alibaba.fastjson2.util.Scientific");
    }

    public static long multiplyHigh(long j10, long j11) {
        long j12 = j10 >> 32;
        long j13 = j10 & 4294967295L;
        long j14 = j11 >> 32;
        long j15 = j11 & 4294967295L;
        long j16 = (j15 * j12) + ((j13 * j15) >>> 32);
        return (j12 * j14) + (j16 >> 32) + (((4294967295L & j16) + (j13 * j14)) >> 32);
    }

    public static long multiplyHighAndShift(long j10, long j11, long j12, int i10) {
        int i11 = i10 - 64;
        LongBiFunction longBiFunction = MULTIPLY_HIGH;
        long jMultiplyHigh = longBiFunction.multiplyHigh(j10, j11);
        long j13 = j11 * j10;
        long jMultiplyHigh2 = (longBiFunction.multiplyHigh(j10, j12) << 32) + ((j10 * j12) >>> 32);
        long j14 = j13 + jMultiplyHigh2;
        if ((j13 | jMultiplyHigh2) < 0 && ((j13 & jMultiplyHigh2) < 0 || j14 >= 0)) {
            jMultiplyHigh++;
        }
        if (i11 >= 0) {
            return jMultiplyHigh >>> i11;
        }
        return (j14 >>> i10) | (jMultiplyHigh << (-i11));
    }

    private static int writeDecimal(long j10, int i10, int i11, char[] cArr, int i12) {
        long j11;
        int i13;
        int iWriteInt64;
        int i14 = i11;
        if ((j10 & 1) == 0 && j10 % 5 == 0) {
            j11 = j10;
            int i15 = i10;
            while (j11 % 100 == 0) {
                i15 -= 2;
                j11 /= 100;
                if (i15 == 1) {
                    break;
                }
            }
            if ((1 & j11) == 0 && j11 % 5 == 0 && j11 > 0) {
                i13 = i15 - 1;
                j11 /= 10;
            } else {
                i13 = i15;
            }
        } else {
            j11 = j10;
            i13 = i10;
        }
        if (i14 < -3 || i14 >= 7) {
            if (i13 == 1) {
                cArr[i12] = (char) (j11 + 48);
                IOUtils.putIntUnaligned(cArr, i12 + 1, IOUtils.DOT_ZERO_32);
                iWriteInt64 = i12 + 3;
            } else {
                int i16 = i13 - 2;
                long j12 = POW10_LONG_VALUES[i16];
                int i17 = (int) (j11 / j12);
                cArr[i12] = (char) (i17 + 48);
                cArr[i12 + 1] = '.';
                int i18 = i12 + 2;
                long j13 = j11 - (((long) i17) * j12);
                while (true) {
                    i16--;
                    if (i16 <= -1 || j13 >= POW10_LONG_VALUES[i16]) {
                        break;
                    }
                    cArr[i18] = '0';
                    i18++;
                }
                iWriteInt64 = IOUtils.writeInt64(cArr, i18, j13);
            }
            int i19 = iWriteInt64 + 1;
            cArr[iWriteInt64] = 'E';
            if (i14 < 0) {
                cArr[i19] = '-';
                i14 = -i14;
                i19 = iWriteInt64 + 2;
            }
            if (i14 > 99) {
                int i20 = (int) ((((long) i14) * 1374389535) >> 37);
                cArr[i19] = (char) (i20 + 48);
                IOUtils.putIntUnaligned(cArr, i19 + 1, TWO_DIGITS_32_BITS[i14 - (i20 * 100)]);
                return i19 + 3;
            }
            if (i14 > 9) {
                IOUtils.putIntUnaligned(cArr, i19, TWO_DIGITS_32_BITS[i14]);
                return i19 + 2;
            }
            int i21 = i19 + 1;
            cArr[i19] = (char) (i14 + 48);
            return i21;
        }
        if (i14 < 0) {
            IOUtils.putIntUnaligned(cArr, i12, IOUtils.ZERO_DOT_32);
            int i22 = i12 + 2;
            if (i14 == -2) {
                cArr[i22] = '0';
                i22 = i12 + 3;
            } else if (i14 == -3) {
                IOUtils.putIntUnaligned(cArr, i22, 3145776);
                i22 = i12 + 4;
            }
            return IOUtils.writeInt64(cArr, i22, j11);
        }
        int i23 = (i13 - 1) - i14;
        if (i23 <= 0) {
            int iWriteInt642 = IOUtils.writeInt64(cArr, i12, j11);
            int i24 = -i23;
            if (i24 > 0) {
                int i25 = 0;
                while (i25 < i24) {
                    cArr[iWriteInt642] = '0';
                    i25++;
                    iWriteInt642++;
                }
            }
            IOUtils.putIntUnaligned(cArr, iWriteInt642, IOUtils.DOT_ZERO_32);
            return iWriteInt642 + 2;
        }
        int i26 = i23 - 1;
        long j14 = POW10_LONG_VALUES[i26];
        long j15 = (int) (j11 / j14);
        int iWriteInt643 = IOUtils.writeInt64(cArr, i12, j15);
        int i27 = iWriteInt643 + 1;
        cArr[iWriteInt643] = '.';
        long j16 = j11 - (j15 * j14);
        while (true) {
            i26--;
            if (i26 <= -1 || j16 >= POW10_LONG_VALUES[i26]) {
                break;
            }
            cArr[i27] = '0';
            i27++;
        }
        return IOUtils.writeInt64(cArr, i27, j16);
    }

    public static int writeDouble(byte[] bArr, int i10, double d10, boolean z10, boolean z11) {
        int i11;
        if (Double.isNaN(d10) || d10 == Double.POSITIVE_INFINITY || d10 == Double.NEGATIVE_INFINITY) {
            return writeSpecial(bArr, i10, (float) d10, z10, z11);
        }
        if (d10 == 0.0d) {
            if (Double.doubleToLongBits(d10) == Long.MIN_VALUE) {
                bArr[i10] = 45;
                i10++;
            }
            bArr[i10] = JSONB.Constants.BC_INT32_BYTE_MIN;
            IOUtils.putShortUnaligned(bArr, i10 + 1, IOUtils.DOT_ZERO_16);
            return i10 + 3;
        }
        if (d10 < 0.0d) {
            bArr[i10] = 45;
            d10 = -d10;
            i11 = i10 + 1;
        } else {
            i11 = i10;
        }
        long j10 = (long) d10;
        if (d10 == j10) {
            int iStringSize = IOUtils.stringSize(j10);
            return writeDecimal(j10, iStringSize, iStringSize - 1, bArr, i11);
        }
        Scientific scientificDoubleToScientific = doubleToScientific(d10);
        int i12 = scientificDoubleToScientific.e10;
        if (!scientificDoubleToScientific.f4755b) {
            return writeDecimal(scientificDoubleToScientific.output, scientificDoubleToScientific.count, i12, bArr, i11);
        }
        int i13 = 0;
        if (i12 >= 0) {
            char[] cArr = POSITIVE_DECIMAL_POWER_CHARS[i12];
            int length = cArr.length;
            while (i13 < length) {
                bArr[i11] = (byte) cArr[i13];
                i13++;
                i11++;
            }
            return i11;
        }
        char[] cArr2 = NEGATIVE_DECIMAL_POWER_CHARS[-i12];
        int length2 = cArr2.length;
        while (i13 < length2) {
            bArr[i11] = (byte) cArr2[i13];
            i13++;
            i11++;
        }
        return i11;
    }

    public static int writeFloat(byte[] bArr, int i10, float f10, boolean z10, boolean z11) {
        int i11;
        if (Float.isNaN(f10) || f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
            return writeSpecial(bArr, i10, f10, z10, z11);
        }
        if (f10 == 0.0f) {
            if (Float.floatToIntBits(f10) == Integer.MIN_VALUE) {
                bArr[i10] = 45;
                i10++;
            }
            bArr[i10] = JSONB.Constants.BC_INT32_BYTE_MIN;
            IOUtils.putShortUnaligned(bArr, i10 + 1, IOUtils.DOT_ZERO_16);
            return i10 + 3;
        }
        if (f10 < 0.0f) {
            bArr[i10] = 45;
            f10 = -f10;
            i11 = i10 + 1;
        } else {
            i11 = i10;
        }
        Scientific scientificFloatToScientific = floatToScientific(f10);
        return writeDecimal(scientificFloatToScientific.output, scientificFloatToScientific.count, scientificFloatToScientific.e10, bArr, i11);
    }

    private static int writeSpecial(char[] cArr, int i10, float f10, boolean z10, boolean z11) {
        int i11;
        if (z10 && !z11) {
            IOUtils.putLongUnaligned(cArr, i10, IOUtils.NULL_64);
            return i10 + 4;
        }
        if (z11) {
            cArr[i10] = '\"';
            i10++;
        }
        if (Float.isNaN(f10)) {
            cArr[i10] = 'N';
            cArr[i10 + 1] = 'a';
            cArr[i10 + 2] = 'N';
            i11 = i10 + 3;
        } else {
            if (f10 < 0.0f) {
                cArr[i10] = '-';
                i10++;
            }
            IOUtils.putLongUnaligned(cArr, i10, INFI);
            IOUtils.putLongUnaligned(cArr, i10 + 4, NITY);
            i11 = i10 + 8;
        }
        if (!z11) {
            return i11;
        }
        int i12 = i11 + 1;
        cArr[i11] = '\"';
        return i12;
    }

    public static long multiplyHighAndShift(long j10, long j11, int i10) {
        long jMultiplyHigh = MULTIPLY_HIGH.multiplyHigh(j10, j11);
        if (i10 >= 64) {
            return jMultiplyHigh >>> (i10 - 64);
        }
        return ((j10 * j11) >>> i10) | (jMultiplyHigh << (64 - i10));
    }

    private static int writeSpecial(byte[] bArr, int i10, float f10, boolean z10, boolean z11) {
        int i11;
        if (z10 && !z11) {
            IOUtils.putIntUnaligned(bArr, i10, IOUtils.NULL_32);
            return i10 + 4;
        }
        if (z11) {
            bArr[i10] = 34;
            i10++;
        }
        if (Float.isNaN(f10)) {
            bArr[i10] = JSONB.Constants.BC_STR_ASCII_FIX_5;
            bArr[i10 + 1] = 97;
            bArr[i10 + 2] = JSONB.Constants.BC_STR_ASCII_FIX_5;
            i11 = i10 + 3;
        } else {
            if (f10 < 0.0f) {
                bArr[i10] = 45;
                i10++;
            }
            IOUtils.putLongUnaligned(bArr, i10, INFINITY);
            i11 = i10 + 8;
        }
        if (!z11) {
            return i11;
        }
        int i12 = i11 + 1;
        bArr[i11] = 34;
        return i12;
    }

    public static int writeFloat(char[] cArr, int i10, float f10, boolean z10, boolean z11) {
        int i11;
        if (Float.isNaN(f10) || f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
            return writeSpecial(cArr, i10, f10, z10, z11);
        }
        if (f10 == 0.0f) {
            if (Float.floatToIntBits(f10) == Integer.MIN_VALUE) {
                cArr[i10] = '-';
                i10++;
            }
            cArr[i10] = '0';
            IOUtils.putIntUnaligned(cArr, i10 + 1, IOUtils.DOT_ZERO_32);
            return i10 + 3;
        }
        if (f10 < 0.0f) {
            cArr[i10] = '-';
            f10 = -f10;
            i11 = i10 + 1;
        } else {
            i11 = i10;
        }
        Scientific scientificFloatToScientific = floatToScientific(f10);
        return writeDecimal(scientificFloatToScientific.output, scientificFloatToScientific.count, scientificFloatToScientific.e10, cArr, i11);
    }

    public static int writeDouble(char[] cArr, int i10, double d10, boolean z10, boolean z11) {
        int i11;
        int length;
        if (Double.isNaN(d10) || d10 == Double.POSITIVE_INFINITY || d10 == Double.NEGATIVE_INFINITY) {
            return writeSpecial(cArr, i10, (float) d10, z10, z11);
        }
        if (d10 == 0.0d) {
            if (Double.doubleToLongBits(d10) == Long.MIN_VALUE) {
                cArr[i10] = '-';
                i10++;
            }
            cArr[i10] = '0';
            IOUtils.putIntUnaligned(cArr, i10 + 1, IOUtils.DOT_ZERO_32);
            return i10 + 3;
        }
        if (d10 < 0.0d) {
            cArr[i10] = '-';
            d10 = -d10;
            i11 = i10 + 1;
        } else {
            i11 = i10;
        }
        long j10 = (long) d10;
        if (d10 == j10) {
            int iStringSize = IOUtils.stringSize(j10);
            return writeDecimal(j10, iStringSize, iStringSize - 1, cArr, i11);
        }
        Scientific scientificDoubleToScientific = doubleToScientific(d10);
        int i12 = scientificDoubleToScientific.e10;
        if (!scientificDoubleToScientific.f4755b) {
            return writeDecimal(scientificDoubleToScientific.output, scientificDoubleToScientific.count, i12, cArr, i11);
        }
        if (i12 >= 0) {
            char[] cArr2 = POSITIVE_DECIMAL_POWER_CHARS[i12];
            System.arraycopy(cArr2, 0, cArr, i11, cArr2.length);
            length = cArr2.length;
        } else {
            char[] cArr3 = NEGATIVE_DECIMAL_POWER_CHARS[-i12];
            System.arraycopy(cArr3, 0, cArr, i11, cArr3.length);
            length = cArr3.length;
        }
        return i11 + length;
    }

    private static int writeDecimal(long j10, int i10, int i11, byte[] bArr, int i12) {
        long j11;
        int i13;
        int iWriteInt64;
        int i14 = i11;
        if ((j10 & 1) == 0 && j10 % 5 == 0) {
            j11 = j10;
            int i15 = i10;
            while (j11 % 100 == 0) {
                i15 -= 2;
                j11 /= 100;
                if (i15 == 1) {
                    break;
                }
            }
            if ((1 & j11) == 0 && j11 % 5 == 0 && j11 > 0) {
                i13 = i15 - 1;
                j11 /= 10;
            } else {
                i13 = i15;
            }
        } else {
            j11 = j10;
            i13 = i10;
        }
        if (i14 < -3 || i14 >= 7) {
            if (i13 == 1) {
                bArr[i12] = (byte) (j11 + 48);
                IOUtils.putShortUnaligned(bArr, i12 + 1, IOUtils.DOT_ZERO_16);
                iWriteInt64 = i12 + 3;
            } else {
                int i16 = i13 - 2;
                long j12 = POW10_LONG_VALUES[i16];
                int i17 = (int) (j11 / j12);
                bArr[i12] = (byte) (i17 + 48);
                bArr[i12 + 1] = 46;
                int i18 = i12 + 2;
                long j13 = j11 - (((long) i17) * j12);
                while (true) {
                    i16--;
                    if (i16 <= -1 || j13 >= POW10_LONG_VALUES[i16]) {
                        break;
                    }
                    bArr[i18] = JSONB.Constants.BC_INT32_BYTE_MIN;
                    i18++;
                }
                iWriteInt64 = IOUtils.writeInt64(bArr, i18, j13);
            }
            int i19 = iWriteInt64 + 1;
            bArr[iWriteInt64] = 69;
            if (i14 < 0) {
                bArr[i19] = 45;
                i14 = -i14;
                i19 = iWriteInt64 + 2;
            }
            if (i14 > 99) {
                int i20 = (int) ((((long) i14) * 1374389535) >> 37);
                bArr[i19] = (byte) (i20 + 48);
                IOUtils.putShortUnaligned(bArr, i19 + 1, TWO_DIGITS_16_BITS[i14 - (i20 * 100)]);
                return i19 + 3;
            }
            if (i14 > 9) {
                IOUtils.putShortUnaligned(bArr, i19, TWO_DIGITS_16_BITS[i14]);
                return i19 + 2;
            }
            int i21 = i19 + 1;
            bArr[i19] = (byte) (i14 + 48);
            return i21;
        }
        if (i14 < 0) {
            IOUtils.putShortUnaligned(bArr, i12, IOUtils.ZERO_DOT_16);
            int i22 = i12 + 2;
            if (i14 == -2) {
                bArr[i22] = JSONB.Constants.BC_INT32_BYTE_MIN;
                i22 = i12 + 3;
            } else if (i14 == -3) {
                IOUtils.putShortUnaligned(bArr, i22, (short) 12336);
                i22 = i12 + 4;
            }
            return IOUtils.writeInt64(bArr, i22, j11);
        }
        int i23 = (i13 - 1) - i14;
        if (i23 > 0) {
            int i24 = i23 - 1;
            long j14 = POW10_LONG_VALUES[i24];
            long j15 = (int) (j11 / j14);
            int iWriteInt32 = IOUtils.writeInt32(bArr, i12, j15);
            int i25 = iWriteInt32 + 1;
            bArr[iWriteInt32] = 46;
            long j16 = j11 - (j15 * j14);
            while (true) {
                i24--;
                if (i24 <= -1 || j16 >= POW10_LONG_VALUES[i24]) {
                    break;
                }
                bArr[i25] = JSONB.Constants.BC_INT32_BYTE_MIN;
                i25++;
            }
            return IOUtils.writeInt64(bArr, i25, j16);
        }
        int iWriteInt642 = IOUtils.writeInt64(bArr, i12, j11);
        int i26 = -i23;
        if (i26 > 0) {
            int i27 = 0;
            while (i27 < i26) {
                bArr[iWriteInt642] = JSONB.Constants.BC_INT32_BYTE_MIN;
                i27++;
                iWriteInt642++;
            }
        }
        IOUtils.putShortUnaligned(bArr, iWriteInt642, IOUtils.DOT_ZERO_16);
        return iWriteInt642 + 2;
    }
}
