package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1575f;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.NumberUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.time.LocalTime;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import okhttp3.internal.connection.RealConnection;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    static final int ALSE;
    static final long ALSE_64;
    public static final int[] DIGITS_K_32;
    public static final long[] DIGITS_K_64;
    public static final long DOT_X0;
    static final short DOT_ZERO_16;
    static final int DOT_ZERO_32;
    private static final byte[] MIN_LONG_BYTES;
    private static final char[] MIN_LONG_CHARS;
    static final int NULL_32;
    static final long NULL_64;
    public static final short[] PACKED_DIGITS;
    public static final int[] PACKED_DIGITS_UTF16;
    static final long[] POWER_TEN;
    static final int TRUE;
    static final long TRUE_64;
    static final short ZERO_DOT_16;
    static final int ZERO_DOT_32;
    private static final short ZERO_DOT_LATIN1;
    static final short ZERO_ZERO_16 = 12336;
    static final int ZERO_ZERO_32 = 3145776;
    static final int[] sizeTable;

    static {
        boolean z10 = JDKUtils.BIG_ENDIAN;
        DOT_ZERO_16 = z10 ? (short) 11824 : (short) 12334;
        DOT_ZERO_32 = z10 ? 3014704 : 3145774;
        ZERO_DOT_16 = z10 ? (short) 12334 : (short) 11824;
        ZERO_DOT_32 = z10 ? 3145774 : 3014704;
        NULL_32 = z10 ? 1853189228 : 1819047278;
        NULL_64 = z10 ? 30962749956423788L : 30399761348886638L;
        TRUE = z10 ? 1953658213 : 1702195828;
        TRUE_64 = z10 ? 32651586932375653L : 28429475166421108L;
        ALSE = z10 ? 1634497381 : 1702063201;
        ALSE_64 = z10 ? 27303536604938341L : 28429466576093281L;
        DOT_X0 = z10 ? 11776L : 46L;
        sizeTable = new int[]{9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
        DIGITS_K_32 = new int[1024];
        DIGITS_K_64 = new long[1024];
        MIN_LONG_BYTES = "-9223372036854775808".getBytes();
        MIN_LONG_CHARS = "-9223372036854775808".toCharArray();
        POWER_TEN = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
        short[] sArr = {ZERO_ZERO_16, 12592, 12848, 13104, 13360, 13616, 13872, 14128, 14384, 14640, 12337, 12593, 12849, 13105, 13361, 13617, 13873, 14129, 14385, 14641, 12338, 12594, 12850, 13106, 13362, 13618, 13874, 14130, 14386, 14642, 12339, 12595, 12851, 13107, 13363, 13619, 13875, 14131, 14387, 14643, 12340, 12596, 12852, 13108, 13364, 13620, 13876, 14132, 14388, 14644, 12341, 12597, 12853, 13109, 13365, 13621, 13877, 14133, 14389, 14645, 12342, 12598, 12854, 13110, 13366, 13622, 13878, 14134, 14390, 14646, 12343, 12599, 12855, 13111, 13367, 13623, 13879, 14135, 14391, 14647, 12344, 12600, 12856, 13112, 13368, 13624, 13880, 14136, 14392, 14648, 12345, 12601, 12857, 13113, 13369, 13625, 13881, 14137, 14393, 14649, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int[] iArr = {ZERO_ZERO_32, 3211312, 3276848, 3342384, 3407920, 3473456, 3538992, 3604528, 3670064, 3735600, 3145777, 3211313, 3276849, 3342385, 3407921, 3473457, 3538993, 3604529, 3670065, 3735601, 3145778, 3211314, 3276850, 3342386, 3407922, 3473458, 3538994, 3604530, 3670066, 3735602, 3145779, 3211315, 3276851, 3342387, 3407923, 3473459, 3538995, 3604531, 3670067, 3735603, 3145780, 3211316, 3276852, 3342388, 3407924, 3473460, 3538996, 3604532, 3670068, 3735604, 3145781, 3211317, 3276853, 3342389, 3407925, 3473461, 3538997, 3604533, 3670069, 3735605, 3145782, 3211318, 3276854, 3342390, 3407926, 3473462, 3538998, 3604534, 3670070, 3735606, 3145783, 3211319, 3276855, 3342391, 3407927, 3473463, 3538999, 3604535, 3670071, 3735607, 3145784, 3211320, 3276856, 3342392, 3407928, 3473464, 3539000, 3604536, 3670072, 3735608, 3145785, 3211321, 3276857, 3342393, 3407929, 3473465, 3539001, 3604537, 3670073, 3735609, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        PACKED_DIGITS = sArr;
        PACKED_DIGITS_UTF16 = iArr;
        int i10 = 0;
        while (true) {
            int i11 = 2;
            if (i10 >= 1000) {
                ZERO_DOT_LATIN1 = JDKUtils.UNSAFE.getShort(new byte[]{JSONB.Constants.BC_INT32_BYTE_MIN, 46}, JDKUtils.ARRAY_BYTE_BASE_OFFSET);
                return;
            }
            if (i10 >= 10) {
                i11 = i10 < 100 ? 1 : 0;
            }
            int i12 = (i10 / 100) + 48;
            int i13 = ((i10 / 10) % 10) + 48;
            int i14 = (i10 % 10) + 48;
            DIGITS_K_32[i10] = (i12 << 8) + i11 + (i13 << 16) + (i14 << 24);
            DIGITS_K_64[i10] = ((long) i11) + ((long) (i12 << 16)) + (((long) i13) << 32) + (((long) i14) << 48);
            i10++;
        }
    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    public static int convEndian(boolean z10, int i10) {
        return z10 == JDKUtils.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    public static int decodeUTF8(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12;
        int i13 = i11 + i10;
        int i14 = 0;
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                bArr2[i14] = b10;
                bArr2[i14 + 1] = 0;
                i14 += 2;
                i10 = i15;
            } else {
                if ((b10 >> 5) != -2 || (b10 & 30) == 0) {
                    if ((b10 >> 4) == -2) {
                        int i16 = i10 + 2;
                        if (i16 < i13) {
                            byte b11 = bArr[i15];
                            byte b12 = bArr[i16];
                            i10 += 3;
                            if ((b10 != -32 || (b11 & 224) != 128) && (b11 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                char c10 = (char) (((b11 << 6) ^ (b10 << 12)) ^ ((-123008) ^ b12));
                                if (c10 >= 55296 && c10 < 57344) {
                                    return -1;
                                }
                                bArr2[i14] = (byte) c10;
                                bArr2[i14 + 1] = (byte) (c10 >> '\b');
                            }
                        }
                        return -1;
                    }
                    if ((b10 >> 3) == -2 && (i12 = i10 + 3) < i13) {
                        byte b13 = bArr[i15];
                        byte b14 = bArr[i10 + 2];
                        byte b15 = bArr[i12];
                        i10 += 4;
                        int i17 = (((b10 << 18) ^ (b13 << 12)) ^ (b14 << 6)) ^ (3678080 ^ b15);
                        if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i17 >= 65536 && i17 < 1114112) {
                            char c11 = (char) ((i17 >>> 10) + 55232);
                            bArr2[i14] = (byte) c11;
                            bArr2[i14 + 1] = (byte) (c11 >> '\b');
                            char c12 = (char) ((i17 & 1023) + 56320);
                            bArr2[i14 + 2] = (byte) c12;
                            bArr2[i14 + 3] = (byte) (c12 >> '\b');
                            i14 += 4;
                        }
                    }
                    return -1;
                }
                if (i15 >= i13) {
                    bArr2[i14] = b10;
                    bArr2[i14 + 1] = 0;
                    return i14 + 2;
                }
                i10 += 2;
                byte b16 = bArr[i15];
                if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    return -1;
                }
                char c13 = (char) ((b16 ^ (b10 << 6)) ^ 3968);
                bArr2[i14] = (byte) c13;
                bArr2[i14 + 1] = (byte) (c13 >> '\b');
                i14 += 2;
            }
        }
        return i14;
    }

    public static int digit(int i10) {
        if (i10 < 0 || i10 > 9) {
            return -1;
        }
        return i10;
    }

    public static int digit1(char[] cArr, int i10) {
        int i11 = JDKUtils.UNSAFE.getChar(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1)) - '0';
        if (i11 < 0 || i11 > 9) {
            return -1;
        }
        return i11;
    }

    public static int digit2(char[] cArr, int i10) {
        int iReverseBytes = JDKUtils.UNSAFE.getInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
        if (JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        int i11 = 983055 & iReverseBytes;
        if (((((-983056) & iReverseBytes) - ZERO_ZERO_32) | ((393222 + i11) & 15728880)) != 0) {
            return -1;
        }
        return ((iReverseBytes & 15) * 10) + (i11 >> 16);
    }

    public static int digit3(char[] cArr, int i10) {
        long intLE = ((long) getIntLE(cArr, i10)) + (((long) getChar(cArr, i10 + 2)) << 32);
        long j10 = 64425492495L & intLE;
        if ((((281410551218160L & intLE) - 206161575984L) | ((25770196998L + j10) & 1030807879920L)) != 0) {
            return -1;
        }
        return (int) (((((intLE & 15) * 10) + (15 & (j10 >> 16))) * 10) + (j10 >> 32));
    }

    public static int digit4(char[] cArr, int i10) {
        long longLE = getLongLE(cArr, i10);
        long j10 = 4222189076152335L & longLE;
        if (((((-4222189076152336L) & longLE) - 13511005043687472L) | ((1688875630460934L + j10) & 67555025218437360L)) != 0) {
            return -1;
        }
        return (int) (((((((longLE & 15) * 10) + ((j10 >> 16) & 15)) * 10) + (15 & (j10 >> 32))) * 10) + (j10 >> 48));
    }

    private static short digitPair(int i10) {
        return PACKED_DIGITS[i10 & 127];
    }

    public static int encodeUTF8(char[] cArr, int i10, int i11, byte[] bArr, int i12) {
        char[] cArr2;
        byte[] bArr2;
        char c10;
        int i13 = i10 + i11;
        int iMin = Math.min(i11, bArr.length) + i12;
        while (i12 < iMin && (c10 = cArr[i10]) < 128) {
            i10++;
            bArr[i12] = (byte) c10;
            i12++;
        }
        int i14 = i12;
        while (i10 < i13) {
            int i15 = i10 + 1;
            char c11 = cArr[i10];
            if (c11 < 128) {
                bArr[i14] = (byte) c11;
                cArr2 = cArr;
                i14++;
            } else if (c11 < 2048) {
                bArr[i14] = (byte) ((c11 >> 6) | Opcodes.CHECKCAST);
                bArr[i14 + 1] = (byte) ((c11 & '?') | 128);
                i14 += 2;
                cArr2 = cArr;
            } else if (c11 < 55296 || c11 > 57343) {
                cArr2 = cArr;
                bArr2 = bArr;
                bArr2[i14] = (byte) ((c11 >> '\f') | 224);
                bArr2[i14 + 1] = (byte) (((c11 >> 6) & 63) | 128);
                bArr2[i14 + 2] = (byte) ((c11 & '?') | 128);
                i14 += 3;
                i10 = i15;
                cArr = cArr2;
                bArr = bArr2;
            } else {
                cArr2 = cArr;
                bArr2 = bArr;
                utf8_char2(cArr2, i15, i13, c11, bArr2, i14);
                i10 += 2;
                i14 += 4;
                cArr = cArr2;
                bArr = bArr2;
            }
            bArr2 = bArr;
            i10 = i15;
            cArr = cArr2;
            bArr = bArr2;
        }
        return i14;
    }

    public static byte getByte(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getByte(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
    }

    public static char getChar(char[] cArr, int i10) {
        return JDKUtils.UNSAFE.getChar(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
    }

    public static void getChars(long j10, int i10, byte[] bArr) {
        int i11;
        boolean z10 = j10 < 0;
        if (!z10) {
            j10 = -j10;
        }
        while (j10 <= -2147483648L) {
            long j11 = j10 / 100;
            i10 -= 2;
            writeDigitPair(bArr, i10, (int) ((100 * j11) - j10));
            j10 = j11;
        }
        int i12 = (int) j10;
        while (i12 <= -100) {
            int i13 = i12 / 100;
            i10 -= 2;
            writeDigitPair(bArr, i10, (i13 * 100) - i12);
            i12 = i13;
        }
        if (i12 < -9) {
            i11 = i10 - 2;
            writeDigitPair(bArr, i11, -i12);
        } else {
            i11 = i10 - 1;
            putByte(bArr, i11, (byte) (48 - i12));
        }
        if (z10) {
            putByte(bArr, i11 - 1, (byte) 45);
        }
    }

    public static int getIntBE(byte[] bArr, int i10) {
        int i11 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        return !JDKUtils.BIG_ENDIAN ? Integer.reverseBytes(i11) : i11;
    }

    public static int getIntLE(char[] cArr, int i10) {
        int i11 = JDKUtils.UNSAFE.getInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
        return JDKUtils.BIG_ENDIAN ? Integer.reverseBytes(i11) : i11;
    }

    public static int getIntUnaligned(char[] cArr, int i10) {
        return JDKUtils.UNSAFE.getInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
    }

    public static long getLongBE(byte[] bArr, int i10) {
        long j10 = JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        return !JDKUtils.BIG_ENDIAN ? Long.reverseBytes(j10) : j10;
    }

    public static long getLongLE(char[] cArr, int i10) {
        long j10 = JDKUtils.UNSAFE.getLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
        return JDKUtils.BIG_ENDIAN ? Long.reverseBytes(j10) : j10;
    }

    public static long getLongUnaligned(char[] cArr, int i10) {
        return JDKUtils.UNSAFE.getLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
    }

    public static short getShortBE(byte[] bArr, int i10) {
        return convEndian(true, JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)));
    }

    public static short getShortLE(byte[] bArr, int i10) {
        return convEndian(false, JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)));
    }

    public static short getShortUnaligned(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
    }

    public static short hex2(int i10) {
        int i11 = ((i10 & 15) << 8) | ((i10 & 240) >> 4);
        int i12 = (101058054 + i11) & 269488144;
        return (short) ((((i12 << 1) + (i12 >> 1)) - (i12 >> 4)) + 808464432 + i11);
    }

    public static short hex2U(int i10) {
        int i11 = ((i10 & 15) << 8) | ((i10 & 240) >> 4);
        int i12 = (101058054 + i11) & 269488144;
        return (short) (((i12 >> 1) - (i12 >> 4)) + 808464432 + i11);
    }

    public static int hex4U(int i10) {
        int iReverseBytesExpand = reverseBytesExpand(i10);
        return ((((101058054 + iReverseBytesExpand) & 269488144) * 7) >> 4) + 808464432 + iReverseBytesExpand;
    }

    public static int hexDigit4(char[] cArr, int i10) {
        long longLE = getLongLE(cArr, i10);
        long j10 = 4222189076152335L & longLE;
        long j11 = longLE & 18014673391583296L;
        long j12 = j10 + (((j11 << 1) | (j11 >> 2)) >>> 4);
        return (int) (((4222124650659840L & j12) >>> 48) + ((64424509440L & j12) >>> 28) + ((983040 & j12) >> 8) + ((j12 & 15) << 12));
    }

    public static int indexOfChar(byte[] bArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (bArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int indexOfDoubleQuote(byte[] bArr, int i10, int i11) {
        MethodHandle methodHandle = JDKUtils.INDEX_OF_CHAR_LATIN1;
        if (methodHandle == null) {
            return indexOfDoubleQuoteV(bArr, i10, i11);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, 34, i10, i11);
        } catch (Throwable th) {
            C1569c.m6258a(th.getMessage());
            return 0;
        }
    }

    public static int indexOfDoubleQuoteV(byte[] bArr, int i10, int i11) {
        int i12 = ((i11 - i10) & (-8)) + i10;
        for (long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10); i10 < i12 && notContains(JDKUtils.UNSAFE.getLong(bArr, j10), 2459565876494606882L); j10 += 8) {
            i10 += 8;
        }
        return indexOfChar(bArr, 34, i10, i11);
    }

    public static int indexOfLineSeparator(byte[] bArr, int i10, int i11) {
        MethodHandle methodHandle = JDKUtils.INDEX_OF_CHAR_LATIN1;
        if (methodHandle == null) {
            return indexOfLineSeparatorV(bArr, i10, i11);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, 10, i10, i11);
        } catch (Throwable th) {
            C1569c.m6258a(th.getMessage());
            return 0;
        }
    }

    public static int indexOfLineSeparatorV(byte[] bArr, int i10, int i11) {
        int i12 = ((i11 - i10) & (-8)) + i10;
        for (long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10); i10 < i12 && notContains(JDKUtils.UNSAFE.getLong(bArr, j10), 723401728380766730L); j10 += 8) {
            i10 += 8;
        }
        return indexOfChar(bArr, 10, i10, i11);
    }

    public static int indexOfQuote(byte[] bArr, int i10, int i11, int i12) {
        MethodHandle methodHandle = JDKUtils.INDEX_OF_CHAR_LATIN1;
        if (methodHandle == null) {
            return indexOfQuoteV(bArr, i10, i11, i12);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, i10, i11, i12);
        } catch (Throwable th) {
            C1569c.m6258a(th.getMessage());
            return 0;
        }
    }

    public static int indexOfQuoteV(byte[] bArr, int i10, int i11, int i12) {
        int i13 = ((i12 - i11) & (-8)) + i11;
        long j10 = i10 == 39 ? 2821266740684990247L : 2459565876494606882L;
        for (long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11); i11 < i13 && notContains(JDKUtils.UNSAFE.getLong(bArr, j11), j10); j11 += 8) {
            i11 += 8;
        }
        return indexOfChar(bArr, i10, i11, i12);
    }

    public static int indexOfSlash(byte[] bArr, int i10, int i11) {
        MethodHandle methodHandle = JDKUtils.INDEX_OF_CHAR_LATIN1;
        if (methodHandle == null) {
            return indexOfSlashV(bArr, i10, i11);
        }
        try {
            return (int) methodHandle.invokeExact(bArr, 92, i10, i11);
        } catch (Throwable th) {
            C1569c.m6258a(th.getMessage());
            return 0;
        }
    }

    public static int indexOfSlashV(byte[] bArr, int i10, int i11) {
        int i12 = ((i11 - i10) & (-8)) + i10;
        for (long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10); i10 < i12 && notContains(JDKUtils.UNSAFE.getLong(bArr, j10), 6655295901103053916L); j10 += 8) {
            i10 += 8;
        }
        return indexOfChar(bArr, 92, i10, i11);
    }

    public static boolean isALSE(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) == ALSE;
    }

    public static boolean isASCII(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = (i11 & (-8)) + i10;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10);
        while (i10 < i13 && (JDKUtils.UNSAFE.getLong(bArr, j10) & (-9187201950435737472L)) == 0) {
            j10 += 8;
            i10 += 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i10 >= i12) {
                return true;
            }
            long j11 = 1 + j10;
            if ((JDKUtils.UNSAFE.getByte(bArr, j10) & 128) != 0) {
                return false;
            }
            i10 = i14;
            j10 = j11;
        }
    }

    public static boolean isDigit(int i10) {
        return i10 >= 48 && i10 <= 57;
    }

    public static boolean isDigit2(char[] cArr, int i10) {
        int iReverseBytes = JDKUtils.UNSAFE.getShort(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1));
        if (JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        return ((((iReverseBytes & 983055) + 393222) & 15728880) | (((-983056) & iReverseBytes) - ZERO_ZERO_32)) == 0;
    }

    private static boolean isDigitLatin1(int i10) {
        return i10 >= 48 && i10 <= 57;
    }

    public static boolean isLatin1(char[] cArr, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = (i11 & (-8)) + i10;
        long j10 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        while (i10 < i13) {
            Unsafe unsafe = JDKUtils.UNSAFE;
            if ((convEndian(false, unsafe.getLong(cArr, j10) | unsafe.getLong(cArr, 8 + j10)) & (-71777214294589696L)) != 0) {
                break;
            }
            j10 += 16;
            i10 += 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i10 >= i12) {
                return true;
            }
            if ((convEndian(false, JDKUtils.UNSAFE.getShort(cArr, j10)) & 65280) != 0) {
                return false;
            }
            j10 += 2;
            i10 = i14;
        }
    }

    public static boolean isNULL(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) == NULL_32;
    }

    public static boolean isNonSlashASCII(byte[] bArr, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = (i11 & (-8)) + i10;
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10);
        while (i10 < i13) {
            long j11 = JDKUtils.UNSAFE.getLong(bArr, j10);
            long j12 = 6655295901103053916L ^ j11;
            if (((j11 | ((~j12) & (j12 - 72340172838076673L))) & (-9187201950435737472L)) != 0) {
                break;
            }
            j10 += 8;
            i10 += 8;
        }
        while (true) {
            int i14 = i10 + 1;
            if (i10 >= i12) {
                return true;
            }
            long j13 = 1 + j10;
            byte b10 = JDKUtils.UNSAFE.getByte(bArr, j10);
            if ((b10 & 128) != 0 || b10 == 92) {
                return false;
            }
            i10 = i14;
            j10 = j13;
        }
    }

    public static boolean isNumber(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i10 != 0 || length == 1) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isUTF8BOM(byte[] bArr, int i10) {
        return (getIntLE(bArr, i10) & 16777215) == 12565487;
    }

    public static long lines(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i10 = 0;
            int i11 = inputStream.read(bArr, 0, 8192);
            if (i11 == -1) {
                return j10;
            }
            int i12 = i11 & (-8);
            for (long j11 = JDKUtils.ARRAY_BYTE_BASE_OFFSET; i10 < i12 && notContains(JDKUtils.UNSAFE.getLong(bArr, j11), 723401728380766730L); j11 += 8) {
                i10 += 8;
            }
            while (i10 < i11) {
                if (bArr[i10] == 10) {
                    j10++;
                }
                i10++;
            }
        }
    }

    private static long mergeInt64(int i10, int i11) {
        int[] iArr = PACKED_DIGITS_UTF16;
        long j10 = (((long) iArr[i10 & 127]) << 32) | ((long) iArr[i11 & 127]);
        return JDKUtils.BIG_ENDIAN ? Long.reverseBytes(j10) : j10;
    }

    public static boolean notALSE(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) != ALSE;
    }

    private static boolean notContains(long j10, long j11) {
        long j12 = j10 ^ j11;
        return (((~j12) & (j12 - 72340172838076673L)) & (-9187201950435737472L)) == 0;
    }

    public static boolean notNULL(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) != NULL_32;
    }

    public static boolean notTRUE(char[] cArr, int i10) {
        return JDKUtils.UNSAFE.getLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1)) != TRUE_64;
    }

    public static JSONException outOfBoundsCheckFromToIndex(int i10, int i11) {
        return new JSONException("offset overflow, offset " + i10 + ", end " + i11);
    }

    public static int parseInt(byte[] bArr, int i10, int i11) {
        int i12;
        int iDigit2;
        byte b10 = bArr[i10];
        int i13 = isDigitLatin1(b10) ? 48 - b10 : (i11 == 1 || !(b10 == 45 || b10 == 43)) ? 1 : 0;
        int i14 = i10 + i11;
        int i15 = i10 + 1;
        while (true) {
            i12 = i15 + 1;
            if (i12 < i14 && (iDigit2 = digit2(bArr, i15)) != -1) {
                if (!(-21474836 <= i13) || !(i13 <= 0)) {
                    break;
                }
                i13 = (i13 * 100) - iDigit2;
                i15 += 2;
            } else {
                break;
            }
        }
        if (i15 < i14) {
            byte b11 = bArr[i15];
            if (isDigitLatin1(b11)) {
                if ((-214748364 <= i13) & (i13 <= 0)) {
                    i13 = ((i13 * 10) + 48) - b11;
                    i15 = i12;
                }
            }
        }
        if ((Integer.MIN_VALUE < i13 || b10 == 45) && ((i15 == i14) & (i13 <= 0))) {
            return b10 == 45 ? i13 : -i13;
        }
        throw new NumberFormatException(new String(bArr, i15, i11));
    }

    public static int putBoolean(char[] cArr, int i10, boolean z10) {
        long j10 = JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1);
        if (z10) {
            JDKUtils.UNSAFE.putLong(cArr, j10, TRUE_64);
            return i10 + 4;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putChar(cArr, j10, 'f');
        unsafe.putLong(cArr, 2 + j10, ALSE_64);
        return i10 + 5;
    }

    private static void putByte(byte[] bArr, int i10, byte b10) {
        JDKUtils.UNSAFE.putByte(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), b10);
    }

    private static void putChar(char[] cArr, int i10, char c10) {
        JDKUtils.UNSAFE.putChar(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), c10);
    }

    public static void putIntBE(byte[] bArr, int i10, int i11) {
        if (!JDKUtils.BIG_ENDIAN) {
            i11 = Integer.reverseBytes(i11);
        }
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), i11);
    }

    public static void putIntLE(char[] cArr, int i10, int i11) {
        if (JDKUtils.BIG_ENDIAN) {
            i11 = Integer.reverseBytes(i11);
        }
        JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), i11);
    }

    public static void putIntUnaligned(char[] cArr, int i10, int i11) {
        JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), i11);
    }

    public static void putLongBE(byte[] bArr, int i10, long j10) {
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), convEndian(true, j10));
    }

    public static void putLongLE(char[] cArr, int i10, long j10) {
        JDKUtils.UNSAFE.putLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), convEndian(false, j10));
    }

    public static void putLongUnaligned(char[] cArr, int i10, long j10) {
        JDKUtils.UNSAFE.putLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), j10);
    }

    public static void putNULL(char[] cArr, int i10) {
        JDKUtils.UNSAFE.putLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), NULL_64);
    }

    public static void putShortBE(byte[] bArr, int i10, short s10) {
        JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), convEndian(true, s10));
    }

    public static void putShortLE(byte[] bArr, int i10, short s10) {
        JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), convEndian(false, s10));
    }

    public static void putShortUnaligned(byte[] bArr, int i10, short s10) {
        JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), s10);
    }

    public static boolean regionMatches(byte[] bArr, int i10, String str) {
        int length = str.length();
        if (i10 + length >= bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (bArr[i10 + i11] != str.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    private static int reverseBytesExpand(int i10) {
        return ((i10 & 15) << 24) | ((61440 & i10) >> 12) | (i10 & 3840) | ((i10 & 240) << 12);
    }

    public static int stringSize(long j10) {
        long j11 = 10;
        for (int i10 = 1; i10 < 19; i10++) {
            if (j10 < j11) {
                return i10;
            }
            j11 *= 10;
        }
        return 19;
    }

    public static int utf16Hex2(int i10) {
        int i11 = ((i10 & 15) << 16) | ((i10 & 240) >> 4);
        int i12 = (393222 + i11) & 1048592;
        return (((i12 << 1) + (i12 >> 1)) - (i12 >> 4)) + ZERO_ZERO_32 + i11;
    }

    public static long utf16Hex4U(long j10) {
        long jUtf16ReverseBytesExpand = utf16ReverseBytesExpand(j10);
        long j11 = (1688875630460934L + jUtf16ReverseBytesExpand) & 4503668347895824L;
        return ((j11 >> 1) - (j11 >> 4)) + 13511005043687472L + jUtf16ReverseBytesExpand;
    }

    private static long utf16ReverseBytesExpand(long j10) {
        return ((j10 & 15) << 48) | ((61440 & j10) >> 12) | ((3840 & j10) << 8) | ((240 & j10) << 28);
    }

    private static void utf8_char2(byte[] bArr, int i10, int i11, char c10, byte[] bArr2, int i12) {
        char c11;
        if (c10 > 56319 || i11 - i10 < 1 || (c11 = JDKUtils.UNSAFE.getChar(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10))) < 56320 || c11 > 57343) {
            C1575f.m6263a("malformed input off : ", i10);
            return;
        }
        int i13 = ((c10 << '\n') + c11) - 56613888;
        bArr2[i12] = (byte) ((i13 >> 18) | 240);
        bArr2[i12 + 1] = (byte) (((i13 >> 12) & 63) | 128);
        bArr2[i12 + 2] = (byte) (((i13 >> 6) & 63) | 128);
        bArr2[i12 + 3] = (byte) ((i13 & 63) | 128);
    }

    public static int writeDecimal(char[] cArr, int i10, long j10, int i11) {
        if (j10 < 0) {
            putChar(cArr, i10, '-');
            j10 = -j10;
            i10++;
        }
        if (i11 != 0) {
            int iStringSize = stringSize(j10);
            int i12 = iStringSize - i11;
            if (i12 == 0) {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i10 += 2;
                cArr[i13] = '.';
            } else {
                int i14 = 0;
                if (i12 >= 0) {
                    long j11 = POWER_TEN[i11 - 1];
                    long j12 = j10 / j11;
                    long j13 = j10 - (j11 * j12);
                    int iWriteInt64 = writeInt64(cArr, i10, j12);
                    putChar(cArr, iWriteInt64, '.');
                    if (i11 == 1) {
                        putChar(cArr, iWriteInt64 + 1, (char) (j13 + 48));
                        return iWriteInt64 + 2;
                    }
                    if (i11 == 2) {
                        writeDigitPair(cArr, iWriteInt64 + 1, (int) j13);
                        return iWriteInt64 + 3;
                    }
                    int iStringSize2 = (iStringSize - stringSize(j13)) - i12;
                    while (i14 < iStringSize2) {
                        iWriteInt64++;
                        putChar(cArr, iWriteInt64, '0');
                        i14++;
                    }
                    return writeInt64(cArr, iWriteInt64 + 1, j13);
                }
                int i15 = i10 + 1;
                cArr[i10] = '0';
                i10 += 2;
                cArr[i15] = '.';
                while (i14 < (-i12)) {
                    putChar(cArr, i10, '0');
                    i14++;
                    i10++;
                }
            }
        }
        return writeInt64(cArr, i10, j10);
    }

    public static void writeDigitPair(byte[] bArr, int i10, int i11) {
        putShortLE(bArr, i10, PACKED_DIGITS[i11 & 127]);
    }

    public static int writeInt16(char[] cArr, int i10, short s10) {
        int i11 = s10;
        if (s10 < 0) {
            putChar(cArr, i10, '-');
            i10++;
            i11 = -s10;
        }
        if (i11 >= 1000) {
            int i12 = (int) ((((long) i11) * 274877907) >> 38);
            long[] jArr = DIGITS_K_64;
            long j10 = jArr[i12 & 1023];
            if (((byte) j10) == 1) {
                putChar(cArr, i10, (char) (j10 >> 32));
                i10++;
            }
            putLongLE(cArr, i10, (jArr[(i11 - (i12 * 1000)) & 1023] & (-65536)) | (j10 >> 48));
            return i10 + 4;
        }
        long j11 = DIGITS_K_64[i11 & 1023];
        byte b10 = (byte) j11;
        if (b10 == 0) {
            putIntLE(cArr, i10, (int) (j11 >> 16));
            i10 += 2;
        } else if (b10 == 1) {
            putChar(cArr, i10, (char) (j11 >> 32));
            i10++;
        }
        putChar(cArr, i10, (char) (j11 >> 48));
        return i10 + 1;
    }

    private static int writeInt3(char[] cArr, int i10, int i11) {
        long j10 = DIGITS_K_64[i11 & 1023];
        int i12 = (int) j10;
        JDKUtils.UNSAFE.putLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i10) << 1), j10 >> ((((short) i12) + 1) << 4));
        return (i10 + 3) - ((byte) i12);
    }

    public static int writeInt32(byte[] bArr, int i10, long j10) {
        if (j10 < 0) {
            j10 = -j10;
            putByte(bArr, i10, (byte) 45);
            i10++;
        }
        if (j10 < 10000) {
            int i11 = (int) j10;
            return i11 < 1000 ? writeInt3(bArr, i10, i11) : writeInt4(bArr, i10, i11);
        }
        long j11 = (int) ((j10 * 1759218605) >> 44);
        int i12 = (int) (j10 - (j11 * 10000));
        if (j11 < 10000) {
            int i13 = (int) j11;
            return i13 < 1000 ? writeInt4(bArr, writeInt3(bArr, i10, i13), i12) : writeInt8(bArr, i10, i13, i12);
        }
        long j12 = (int) ((1759218605 * j11) >> 44);
        return writeInt8(bArr, writeInt3(bArr, i10, (int) j12), (int) (j11 - (j12 * 10000)), i12);
    }

    private static int writeInt4(byte[] bArr, int i10, int i11) {
        int i12 = (int) ((((long) i11) * 1374389535) >> 37);
        int i13 = i11 - (i12 * 100);
        short[] sArr = PACKED_DIGITS;
        int iReverseBytes = (sArr[i13 & 127] << 16) | sArr[i12 & 127];
        if (JDKUtils.BIG_ENDIAN) {
            iReverseBytes = Integer.reverseBytes(iReverseBytes);
        }
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), iReverseBytes);
        return i10 + 4;
    }

    public static int writeInt64(byte[] bArr, int i10, long j10) {
        int iWriteInt4;
        int i11 = i10;
        long j11 = j10;
        if (j11 < 0) {
            if (j11 == Long.MIN_VALUE) {
                byte[] bArr2 = MIN_LONG_BYTES;
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                return bArr2.length + i11;
            }
            j11 = -j11;
            putByte(bArr, i11, (byte) 45);
            i11++;
        }
        if (j11 <= 2147483647L) {
            return writeInt32(bArr, i11, (int) j11);
        }
        NumberUtils.LongBiFunction longBiFunction = NumberUtils.MULTIPLY_HIGH;
        long jMultiplyHigh = longBiFunction.multiplyHigh(j11, 7555786372591432342L) >> 12;
        int i12 = (int) (j11 - (jMultiplyHigh * 10000));
        long jMultiplyHigh2 = longBiFunction.multiplyHigh(jMultiplyHigh, 1844674407370956L);
        int i13 = (int) (jMultiplyHigh - (jMultiplyHigh2 * 10000));
        if (jMultiplyHigh2 < 10000) {
            int i14 = (int) jMultiplyHigh2;
            return writeInt8(bArr, i14 < 1000 ? writeInt3(bArr, i11, i14) : writeInt4(bArr, i11, i14), i13, i12);
        }
        long jMultiplyHigh3 = longBiFunction.multiplyHigh(jMultiplyHigh2, 1844674407370956L);
        int i15 = (int) (jMultiplyHigh2 - (jMultiplyHigh3 * 10000));
        if (jMultiplyHigh3 >= 10000) {
            long jMultiplyHigh4 = longBiFunction.multiplyHigh(jMultiplyHigh3, 1844674407370956L);
            return writeInt8(bArr, writeInt8(bArr, writeInt3(bArr, i11, (int) jMultiplyHigh4), (int) (jMultiplyHigh3 - (10000 * jMultiplyHigh4)), i15), i13, i12);
        }
        int i16 = (int) jMultiplyHigh3;
        if (i16 < 1000) {
            iWriteInt4 = writeInt4(bArr, writeInt3(bArr, i11, i16), i15);
        } else {
            writeInt8(bArr, i11, i16, i15);
            iWriteInt4 = i11 + 8;
        }
        return writeInt8(bArr, iWriteInt4, i13, i12);
    }

    private static int writeInt8(char[] cArr, int i10, int i11, int i12) {
        int i13 = (int) ((((long) i11) * 1374389535) >> 37);
        int[] iArr = PACKED_DIGITS_UTF16;
        long jReverseBytes = ((long) iArr[i13 & 127]) | (((long) iArr[(i11 - (i13 * 100)) & 127]) << 32);
        int i14 = (int) ((((long) i12) * 1374389535) >> 37);
        long jReverseBytes2 = (((long) iArr[(i12 - (i14 * 100)) & 127]) << 32) | ((long) iArr[i14 & 127]);
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        long j10 = jReverseBytes2;
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j11 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        long j12 = ((long) i10) << 1;
        unsafe.putLong(cArr, j11 + j12, jReverseBytes);
        unsafe.putLong(cArr, j11 + j12 + 8, j10);
        return i10 + 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int writeLocalDate(char[] r6, int r7, int r8, int r9, int r10) {
        /*
            if (r8 >= 0) goto Lb
            int r0 = r7 + 1
            r1 = 45
            r6[r7] = r1
            int r8 = -r8
        L9:
            r7 = r0
            goto L16
        Lb:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r8 <= r0) goto L16
            int r0 = r7 + 1
            r1 = 43
            r6[r7] = r1
            goto L9
        L16:
            long r0 = (long) r8
            r2 = 1374389535(0x51eb851f, double:6.790386532E-315)
            long r0 = r0 * r2
            r2 = 37
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r1 = r0 * 100
            int r1 = r8 - r1
            if (r8 < 0) goto L2f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r8 >= r2) goto L2f
            writeDigitPair(r6, r7, r0)
            int r7 = r7 + 2
            goto L34
        L2f:
            long r2 = (long) r0
            int r7 = writeInt32(r6, r7, r2)
        L34:
            int[] r8 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r9 = r9 & 127(0x7f, float:1.78E-43)
            r9 = r8[r9]
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r9
            long r2 = (long) r0
            r0 = 48
            long r2 = r2 << r0
            r4 = 193273528320(0x2d00000000, double:9.54898105934E-313)
            long r2 = r2 | r4
            r0 = r1 & 127(0x7f, float:1.78E-43)
            r0 = r8[r0]
            long r0 = (long) r0
            long r0 = r0 | r2
            putLongLE(r6, r7, r0)
            int r0 = r7 + 4
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r1
            long r1 = (long) r9
            r9 = 16
            long r1 = r1 >> r9
            r3 = 2949120(0x2d0000, double:1.457059E-317)
            long r1 = r1 | r3
            r9 = r10 & 127(0x7f, float:1.78E-43)
            r8 = r8[r9]
            long r8 = (long) r8
            r10 = 32
            long r8 = r8 << r10
            long r8 = r8 | r1
            putLongLE(r6, r0, r8)
            int r7 = r7 + 8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.IOUtils.writeLocalDate(char[], int, int, int, int):int");
    }

    public static void writeLocalTime(byte[] bArr, int i10, int i11, int i12, int i13) {
        putLongLE(bArr, i10, (((long) digitPair(i12)) << 24) | ((long) digitPair(i11)) | 63771678212096L | (((long) digitPair(i13)) << 48));
    }

    public static int writeNano(char[] cArr, int i10, int i11) {
        long j10;
        int i12 = (int) ((((long) i11) * 274877907) >> 38);
        int i13 = (int) ((((long) i12) * 274877907) >> 38);
        int i14 = i11 - (i12 * 1000);
        long[] jArr = DIGITS_K_64;
        putLongLE(cArr, i10, (jArr[i13 & 1023] & (-65536)) | DOT_X0);
        int i15 = i10 + 4;
        if (i14 == 0) {
            int i16 = i12 - (i13 * 1000);
            if (i16 == 0) {
                return i15;
            }
            j10 = jArr[i16 & 1023];
        } else {
            j10 = jArr[(i12 - (i13 * 1000)) & 1023];
        }
        putIntLE(cArr, i15, (int) (j10 >> 16));
        int i17 = i10 + 6;
        if (i14 == 0) {
            putChar(cArr, i17, (char) (j10 >> 48));
            return i10 + 7;
        }
        putLongLE(cArr, i17, (j10 >> 48) | ((-65536) & jArr[i14 & 1023]));
        return i10 + 10;
    }

    public static long convEndian(boolean z10, long j10) {
        return z10 == JDKUtils.BIG_ENDIAN ? j10 : Long.reverseBytes(j10);
    }

    public static void writeDigitPair(char[] cArr, int i10, int i11) {
        putIntLE(cArr, i10, PACKED_DIGITS_UTF16[i11 & 127]);
    }

    public static short convEndian(boolean z10, short s10) {
        return z10 == JDKUtils.BIG_ENDIAN ? s10 : Short.reverseBytes(s10);
    }

    public static int indexOfChar(char[] cArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (cArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static void putIntUnaligned(byte[] bArr, int i10, int i11) {
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), i11);
    }

    public static char getChar(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getChar(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + (((long) i10) << 1));
    }

    public static int getIntUnaligned(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
    }

    public static long getLongUnaligned(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
    }

    public static void putLongUnaligned(byte[] bArr, int i10, long j10) {
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), j10);
    }

    public static void putNULL(byte[] bArr, int i10) {
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), NULL_32);
    }

    public static boolean isALSE(char[] cArr, int i10) {
        return getLongUnaligned(cArr, i10) == ALSE_64;
    }

    public static boolean isNULL(char[] cArr, int i10) {
        return getLongUnaligned(cArr, i10) == NULL_64;
    }

    public static boolean notALSE(char[] cArr, int i10) {
        return getLongUnaligned(cArr, i10) != ALSE_64;
    }

    public static boolean notNULL(char[] cArr, int i10) {
        return getLongUnaligned(cArr, i10) != NULL_64;
    }

    public static int stringSize(int i10) {
        int i11 = 0;
        while (i10 > sizeTable[i11]) {
            i11++;
        }
        return i11 + 1;
    }

    public static void putLongLE(byte[] bArr, int i10, long j10) {
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), convEndian(false, j10));
    }

    public static void putIntLE(byte[] bArr, int i10, int i11) {
        if (JDKUtils.BIG_ENDIAN) {
            i11 = Integer.reverseBytes(i11);
        }
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), i11);
    }

    public static int getIntLE(byte[] bArr, int i10) {
        int i11 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        return JDKUtils.BIG_ENDIAN ? Integer.reverseBytes(i11) : i11;
    }

    public static long getLongLE(byte[] bArr, int i10) {
        return convEndian(false, JDKUtils.UNSAFE.getLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)));
    }

    public static boolean notTRUE(byte[] bArr, int i10) {
        return JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) != TRUE;
    }

    public static int digit1(byte[] bArr, int i10) {
        int i11 = JDKUtils.UNSAFE.getByte(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10)) + JSONB.Constants.BC_INT64_BYTE_ZERO;
        if (i11 < 0 || i11 > 9) {
            return -1;
        }
        return i11;
    }

    private static int writeInt3(byte[] bArr, int i10, int i11) {
        int i12 = DIGITS_K_32[i11 & 1023];
        byte b10 = (byte) i12;
        JDKUtils.UNSAFE.putInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), i12 >> ((b10 + 1) << 3));
        return (i10 + 3) - b10;
    }

    public static int writeLocalTime(byte[] bArr, int i10, LocalTime localTime) {
        writeLocalTime(bArr, i10, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i11 = i10 + 8;
        int nano = localTime.getNano();
        return nano != 0 ? writeNano(bArr, i11, nano) : i11;
    }

    public static void writeLocalTime(char[] cArr, int i10, int i11, int i12, int i13) {
        writeDigitPair(cArr, i10, i11);
        putChar(cArr, i10 + 2, ':');
        writeDigitPair(cArr, i10 + 3, i12);
        putChar(cArr, i10 + 5, ':');
        writeDigitPair(cArr, i10 + 6, i13);
    }

    public static int putBoolean(byte[] bArr, int i10, boolean z10) {
        long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10);
        if (z10) {
            JDKUtils.UNSAFE.putInt(bArr, j10, TRUE);
            return i10 + 4;
        }
        Unsafe unsafe = JDKUtils.UNSAFE;
        unsafe.putByte(bArr, j10, (byte) 102);
        unsafe.putInt(bArr, j10 + 1, ALSE);
        return i10 + 5;
    }

    public static int writeLocalTime(char[] cArr, int i10, LocalTime localTime) {
        writeLocalTime(cArr, i10, localTime.getHour(), localTime.getMinute(), localTime.getSecond());
        int i11 = i10 + 8;
        int nano = localTime.getNano();
        return nano != 0 ? writeNano(cArr, i11, nano) : i11;
    }

    public static boolean isNumber(char[] cArr, int i10, int i11) {
        if (i11 <= 0) {
            return false;
        }
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 == '+' || c10 == '-') {
                if (i13 != i10 || i11 == 1) {
                    return false;
                }
            } else if (c10 < '0' || c10 > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return false;
        }
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            char c10 = (char) bArr[i13];
            if (c10 == '+' || c10 == '-') {
                if (i13 != i10 || i11 == 1) {
                    return false;
                }
            } else if (c10 < '0' || c10 > '9') {
                return false;
            }
        }
        return true;
    }

    private static int writeInt4(char[] cArr, int i10, int i11) {
        int i12 = (int) ((((long) i11) * 1374389535) >> 37);
        putLongUnaligned(cArr, i10, mergeInt64(i11 - (i12 * 100), i12));
        return i10 + 4;
    }

    public static int digit2(byte[] bArr, int i10) {
        short sReverseBytes = JDKUtils.UNSAFE.getShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
        if (JDKUtils.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i11 = sReverseBytes & 3855;
        if (((61680 & (i11 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((sReverseBytes & 15) * 10) + (i11 >> 8);
    }

    public static int hexDigit4(byte[] bArr, int i10) {
        int intLE = getIntLE(bArr, i10);
        int i11 = 252645135 & intLE;
        int i12 = intLE & 1077952576;
        int i13 = i11 + (((i12 << 1) | (i12 >> 2)) >>> 4);
        return ((251658240 & i13) >>> 24) + ((983040 & i13) >>> 12) + (i13 & 3840) + ((i13 & 15) << 12);
    }

    public static long lines(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long jLines = lines(fileInputStream);
            fileInputStream.close();
            return jLines;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int hexDigit4(char[] cArr, int i10, int i11) {
        if (i10 + 4 <= Math.min(i11, cArr.length)) {
            return hexDigit4(cArr, i10);
        }
        throw outOfBoundsCheckFromToIndex(i10, i11);
    }

    public static boolean isASCII(byte[] bArr) {
        return isASCII(bArr, 0, bArr.length);
    }

    public static boolean isASCII(String str) {
        ToIntFunction<String> toIntFunction;
        Function<String, byte[]> function = JDKUtils.STRING_VALUE;
        if (function != null && (toIntFunction = JDKUtils.STRING_CODER) != null) {
            return toIntFunction.applyAsInt(str) == 0 && isASCII(function.apply(str));
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) > 127) {
                return false;
            }
        }
        return true;
    }

    public static int hexDigit4(byte[] bArr, int i10, int i11) {
        if (i10 + 4 <= Math.min(i11, bArr.length)) {
            return hexDigit4(bArr, i10);
        }
        throw outOfBoundsCheckFromToIndex(i10, i11);
    }

    private static int digit4(int i10) {
        int i11 = 252645135 & i10;
        if ((((-252645136) & (101058054 + i11)) | ((i10 & (-252645136)) - 808464432)) != 0) {
            return -1;
        }
        return ((((((i10 & 15) * 10) + ((i11 >> 8) & 15)) * 10) + ((i11 >> 16) & 15)) * 10) + (i11 >> 24);
    }

    public static int digit4(byte[] bArr, int i10) {
        return digit4(getIntLE(bArr, i10));
    }

    private static int digit3(int i10) {
        int i11 = 986895 & i10;
        if (((15790320 & (394758 + i11)) | ((i10 & 15790320) - 3158064)) != 0) {
            return -1;
        }
        return ((((i10 & 15) * 10) + ((i11 >> 8) & 15)) * 10) + (i11 >> 16);
    }

    public static int digit3(byte[] bArr, int i10) {
        return digit3((getByte(bArr, i10 + 2) << JSONB.Constants.BC_INT32_NUM_16) | getShortLE(bArr, i10));
    }

    public static void getChars(int i10, int i11, char[] cArr) {
        int i12;
        boolean z10 = i10 < 0;
        if (!z10) {
            i10 = -i10;
        }
        while (i10 <= -100) {
            int i13 = i10 / 100;
            i11 -= 2;
            writeDigitPair(cArr, i11, (i13 * 100) - i10);
            i10 = i13;
        }
        if (i10 < -9) {
            i12 = i11 - 2;
            writeDigitPair(cArr, i12, -i10);
        } else {
            i12 = i11 - 1;
            putChar(cArr, i12, (char) (48 - i10));
        }
        if (z10) {
            putChar(cArr, i12 - 1, '-');
        }
    }

    private static void utf8_char2(char[] cArr, int i10, int i11, char c10, byte[] bArr, int i12) {
        char c11;
        if (c10 <= 56319 && i11 - i10 >= 1 && (c11 = cArr[i10]) >= 56320 && c11 <= 57343) {
            int i13 = ((c10 << '\n') + c11) - 56613888;
            bArr[i12] = (byte) ((i13 >> 18) | 240);
            bArr[i12 + 1] = (byte) (((i13 >> 12) & 63) | 128);
            bArr[i12 + 2] = (byte) (((i13 >> 6) & 63) | 128);
            bArr[i12 + 3] = (byte) ((i13 & 63) | 128);
            return;
        }
        C1575f.m6263a("malformed input off : ", i10);
    }

    public static void getChars(int i10, int i11, byte[] bArr) {
        int i12;
        boolean z10 = i10 < 0;
        if (!z10) {
            i10 = -i10;
        }
        while (i10 <= -100) {
            int i13 = i10 / 100;
            i11 -= 2;
            writeDigitPair(bArr, i11, (i13 * 100) - i10);
            i10 = i13;
        }
        if (i10 < -9) {
            i12 = i11 - 2;
            writeDigitPair(bArr, i12, -i10);
        } else {
            i12 = i11 - 1;
            putByte(bArr, i12, (byte) (48 - i10));
        }
        if (z10) {
            putByte(bArr, i12 - 1, (byte) 45);
        }
    }

    public static void getChars(long j10, int i10, char[] cArr) {
        int i11;
        boolean z10 = j10 < 0;
        if (!z10) {
            j10 = -j10;
        }
        while (j10 <= -2147483648L) {
            long j11 = j10 / 100;
            i10 -= 2;
            writeDigitPair(cArr, i10, (int) ((100 * j11) - j10));
            j10 = j11;
        }
        int i12 = (int) j10;
        while (i12 <= -100) {
            int i13 = i12 / 100;
            i10 -= 2;
            writeDigitPair(cArr, i10, (i13 * 100) - i12);
            i12 = i13;
        }
        if (i12 < -9) {
            i11 = i10 - 2;
            writeDigitPair(cArr, i11, -i12);
        } else {
            i11 = i10 - 1;
            putChar(cArr, i11, (char) (48 - i12));
        }
        if (z10) {
            putChar(cArr, i11 - 1, '-');
        }
    }

    public static int writeInt32(char[] cArr, int i10, long j10) {
        if (j10 < 0) {
            j10 = -j10;
            putChar(cArr, i10, '-');
            i10++;
        }
        if (j10 < 10000) {
            int i11 = (int) j10;
            if (i11 < 1000) {
                return writeInt3(cArr, i10, i11);
            }
            return writeInt4(cArr, i10, i11);
        }
        long j11 = (int) ((j10 * 1759218605) >> 44);
        int i12 = (int) (j10 - (j11 * 10000));
        if (j11 >= 10000) {
            long j12 = (int) ((1759218605 * j11) >> 44);
            return writeInt8(cArr, writeInt3(cArr, i10, (int) j12), (int) (j11 - (j12 * 10000)), i12);
        }
        int i13 = (int) j11;
        if (i13 < 1000) {
            return writeInt4(cArr, writeInt3(cArr, i10, i13), i12);
        }
        return writeInt8(cArr, i10, i13, i12);
    }

    public static int writeNano(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = (int) ((((long) i11) * 274877907) >> 38);
        int i14 = (int) ((((long) i13) * 274877907) >> 38);
        int i15 = i11 - (i13 * 1000);
        int[] iArr = DIGITS_K_32;
        putIntLE(bArr, i10, (iArr[i14 & 1023] & (-256)) | 46);
        int i16 = i10 + 4;
        if (i15 == 0) {
            int i17 = i13 - (i14 * 1000);
            if (i17 == 0) {
                return i16;
            }
            i12 = iArr[i17 & 1023];
        } else {
            i12 = iArr[(i13 - (i14 * 1000)) & 1023];
        }
        putShortLE(bArr, i16, (short) (i12 >> 8));
        int i18 = i10 + 6;
        if (i15 == 0) {
            putByte(bArr, i18, (byte) (i12 >> 24));
            return i10 + 7;
        }
        putIntLE(bArr, i18, (iArr[i15] & (-256)) | (i12 >> 24));
        return i10 + 10;
    }

    private static int writeInt8(byte[] bArr, int i10, int i11, int i12) {
        int i13 = (int) ((((long) i11) * 1374389535) >> 37);
        int i14 = (int) ((((long) i12) * 1374389535) >> 37);
        short[] sArr = PACKED_DIGITS;
        long jReverseBytes = (((long) sArr[(i12 - (i14 * 100)) & 127]) << 48) | ((long) ((sArr[(i11 - (i13 * 100)) & 127] << 16) | sArr[i13 & 127])) | (((long) sArr[i14 & 127]) << 32);
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        JDKUtils.UNSAFE.putLong(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), jReverseBytes);
        return i10 + 8;
    }

    public static int writeInt8(byte[] bArr, int i10, byte b10) {
        int i11 = b10;
        if (b10 < 0) {
            putByte(bArr, i10, (byte) 45);
            i10++;
            i11 = -b10;
        }
        int i12 = DIGITS_K_32[i11 & 1023];
        byte b11 = (byte) i12;
        if (b11 == 0) {
            putShortLE(bArr, i10, (short) (i12 >> 8));
            i10 += 2;
        } else if (b11 == 1) {
            putByte(bArr, i10, (byte) (i12 >> 16));
            i10++;
        }
        putByte(bArr, i10, (byte) (i12 >> 24));
        return i10 + 1;
    }

    public static int writeInt8(char[] cArr, int i10, byte b10) {
        int i11 = b10;
        if (b10 < 0) {
            putChar(cArr, i10, '-');
            i10++;
            i11 = -b10;
        }
        long j10 = DIGITS_K_64[i11 & 1023];
        byte b11 = (byte) j10;
        if (b11 == 0) {
            putIntLE(cArr, i10, (int) (j10 >> 16));
            i10 += 2;
        } else if (b11 == 1) {
            putChar(cArr, i10, (char) (j10 >> 32));
            i10++;
        }
        putChar(cArr, i10, (char) (j10 >> 48));
        return i10 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int writeLocalDate(byte[] r4, int r5, int r6, int r7, int r8) {
        /*
            if (r6 >= 0) goto Lb
            int r0 = r5 + 1
            r1 = 45
            r4[r5] = r1
            int r6 = -r6
        L9:
            r5 = r0
            goto L16
        Lb:
            r0 = 9999(0x270f, float:1.4012E-41)
            if (r6 <= r0) goto L16
            int r0 = r5 + 1
            r1 = 43
            r4[r5] = r1
            goto L9
        L16:
            long r0 = (long) r6
            r2 = 1374389535(0x51eb851f, double:6.790386532E-315)
            long r0 = r0 * r2
            r2 = 37
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r1 = r0 * 100
            int r1 = r6 - r1
            if (r6 < 0) goto L2f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r6 >= r2) goto L2f
            writeDigitPair(r4, r5, r0)
            int r5 = r5 + 2
            goto L34
        L2f:
            long r2 = (long) r0
            int r5 = writeInt32(r4, r5, r2)
        L34:
            short r6 = digitPair(r1)
            long r0 = (long) r6
            r2 = 49478026199040(0x2d00002d0000, double:2.4445392968979E-310)
            long r0 = r0 | r2
            short r6 = digitPair(r7)
            long r6 = (long) r6
            r2 = 24
            long r6 = r6 << r2
            long r6 = r6 | r0
            short r8 = digitPair(r8)
            long r0 = (long) r8
            r8 = 48
            long r0 = r0 << r8
            long r6 = r6 | r0
            putLongLE(r4, r5, r6)
            int r5 = r5 + 8
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.IOUtils.writeLocalDate(byte[], int, int, int, int):int");
    }

    public static int writeInt16(byte[] bArr, int i10, short s10) {
        int i11 = s10;
        if (s10 < 0) {
            putByte(bArr, i10, (byte) 45);
            i10++;
            i11 = -s10;
        }
        if (i11 < 1000) {
            int i12 = DIGITS_K_32[i11 & 1023];
            byte b10 = (byte) i12;
            if (b10 == 0) {
                putShortLE(bArr, i10, (short) (i12 >> 8));
                i10 += 2;
            } else if (b10 == 1) {
                putByte(bArr, i10, (byte) (i12 >> 16));
                i10++;
            }
            putByte(bArr, i10, (byte) (i12 >> 24));
            return i10 + 1;
        }
        int i13 = (int) ((((long) i11) * 274877907) >> 38);
        int[] iArr = DIGITS_K_32;
        int i14 = iArr[i13 & 1023];
        if (((byte) i14) == 1) {
            putByte(bArr, i10, (byte) (i14 >> 16));
            i10++;
        }
        putIntLE(bArr, i10, (iArr[(i11 - (i13 * 1000)) & 1023] & (-256)) | (i14 >> 24));
        return i10 + 4;
    }

    public static int encodeUTF8(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3;
        byte[] bArr4;
        int i13 = i10 + i11;
        int i14 = i12;
        while (i10 < i13) {
            char c10 = JDKUtils.UNSAFE.getChar(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10));
            int i15 = i10 + 2;
            if (c10 < 128) {
                bArr2[i14] = (byte) c10;
                bArr3 = bArr;
                i14++;
            } else if (c10 < 2048) {
                bArr2[i14] = (byte) ((c10 >> 6) | Opcodes.CHECKCAST);
                bArr2[i14 + 1] = (byte) (128 | (c10 & '?'));
                i14 += 2;
                bArr3 = bArr;
            } else if (c10 >= 55296 && c10 <= 57343) {
                bArr3 = bArr;
                bArr4 = bArr2;
                utf8_char2(bArr3, i15, i13, c10, bArr4, i14);
                i10 += 4;
                i14 += 4;
                bArr = bArr3;
                bArr2 = bArr4;
            } else {
                bArr3 = bArr;
                bArr4 = bArr2;
                bArr4[i14] = (byte) ((c10 >> '\f') | 224);
                bArr4[i14 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                bArr4[i14 + 2] = (byte) ((c10 & '?') | 128);
                i14 += 3;
                i10 = i15;
                bArr = bArr3;
                bArr2 = bArr4;
            }
            bArr4 = bArr2;
            i10 = i15;
            bArr = bArr3;
            bArr2 = bArr4;
        }
        return i14;
    }

    public static int writeDecimal(byte[] bArr, int i10, long j10, int i11) {
        if (j10 < 0) {
            putByte(bArr, i10, (byte) 45);
            j10 = -j10;
            i10++;
        }
        if (i11 != 0) {
            int iStringSize = stringSize(j10);
            int i12 = iStringSize - i11;
            if (i12 == 0) {
                putShortUnaligned(bArr, i10, ZERO_DOT_LATIN1);
                i10 += 2;
            } else {
                int i13 = 0;
                if (i12 < 0) {
                    putShortUnaligned(bArr, i10, ZERO_DOT_LATIN1);
                    i10 += 2;
                    while (i13 < (-i12)) {
                        putByte(bArr, i10, JSONB.Constants.BC_INT32_BYTE_MIN);
                        i13++;
                        i10++;
                    }
                } else {
                    long j11 = POWER_TEN[i11 - 1];
                    long j12 = j10 / j11;
                    long j13 = j10 - (j11 * j12);
                    int iWriteInt64 = writeInt64(bArr, i10, j12);
                    putByte(bArr, iWriteInt64, (byte) 46);
                    if (i11 == 1) {
                        putByte(bArr, iWriteInt64 + 1, (byte) (j13 + 48));
                        return iWriteInt64 + 2;
                    }
                    if (i11 == 2) {
                        writeDigitPair(bArr, iWriteInt64 + 1, (int) j13);
                        return iWriteInt64 + 3;
                    }
                    int iStringSize2 = (iStringSize - stringSize(j13)) - i12;
                    while (i13 < iStringSize2) {
                        iWriteInt64++;
                        putByte(bArr, iWriteInt64, JSONB.Constants.BC_INT32_BYTE_MIN);
                        i13++;
                    }
                    return writeInt64(bArr, iWriteInt64 + 1, j13);
                }
            }
        }
        return writeInt64(bArr, i10, j10);
    }

    public static int writeInt64(char[] cArr, int i10, long j10) {
        int iWriteInt4;
        int iWriteInt42;
        int i11 = i10;
        long j11 = j10;
        if (j11 < 0) {
            if (j11 == Long.MIN_VALUE) {
                char[] cArr2 = MIN_LONG_CHARS;
                System.arraycopy(cArr2, 0, cArr, i11, cArr2.length);
                return cArr2.length + i11;
            }
            j11 = -j11;
            putChar(cArr, i11, '-');
            i11++;
        }
        if (j11 <= 2147483647L) {
            return writeInt32(cArr, i11, (int) j11);
        }
        NumberUtils.LongBiFunction longBiFunction = NumberUtils.MULTIPLY_HIGH;
        long jMultiplyHigh = longBiFunction.multiplyHigh(j11, 7555786372591432342L) >> 12;
        int i12 = (int) (j11 - (jMultiplyHigh * 10000));
        long jMultiplyHigh2 = longBiFunction.multiplyHigh(jMultiplyHigh, 1844674407370956L);
        int i13 = (int) (jMultiplyHigh - (jMultiplyHigh2 * 10000));
        if (jMultiplyHigh2 < 10000) {
            int i14 = (int) jMultiplyHigh2;
            if (i14 < 1000) {
                iWriteInt42 = writeInt3(cArr, i11, i14);
            } else {
                iWriteInt42 = writeInt4(cArr, i11, i14);
            }
            return writeInt8(cArr, iWriteInt42, i13, i12);
        }
        long jMultiplyHigh3 = longBiFunction.multiplyHigh(jMultiplyHigh2, 1844674407370956L);
        int i15 = (int) (jMultiplyHigh2 - (jMultiplyHigh3 * 10000));
        if (jMultiplyHigh3 < 10000) {
            int i16 = (int) jMultiplyHigh3;
            if (i16 < 1000) {
                iWriteInt4 = writeInt4(cArr, writeInt3(cArr, i11, i16), i15);
            } else {
                writeInt8(cArr, i11, i16, i15);
                iWriteInt4 = i11 + 8;
            }
            return writeInt8(cArr, iWriteInt4, i13, i12);
        }
        long jMultiplyHigh4 = longBiFunction.multiplyHigh(jMultiplyHigh3, 1844674407370956L);
        return writeInt8(cArr, writeInt8(cArr, writeInt3(cArr, i11, (int) jMultiplyHigh4), (int) (jMultiplyHigh3 - (10000 * jMultiplyHigh4)), i15), i13, i12);
    }

    public static int decodeUTF8(byte[] bArr, int i10, int i11, char[] cArr) {
        int i12;
        int i13 = i10 + i11;
        int iMin = Math.min(i11, cArr.length);
        int i14 = 0;
        while (i14 < iMin) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i14] = (char) b10;
            i14++;
        }
        while (i10 < i13) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                cArr[i14] = (char) b11;
                i14++;
                i10 = i15;
            } else {
                if ((b11 >> 5) != -2 || (b11 & 30) == 0) {
                    if ((b11 >> 4) == -2) {
                        int i16 = i10 + 2;
                        if (i16 < i13) {
                            byte b12 = bArr[i15];
                            byte b13 = bArr[i16];
                            i10 += 3;
                            if ((b11 != -32 || (b12 & 224) != 128) && (b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                char c10 = (char) (((b12 << 6) ^ (b11 << 12)) ^ ((-123008) ^ b13));
                                if (c10 >= 55296 && c10 < 57344) {
                                    return -1;
                                }
                                cArr[i14] = c10;
                                i14++;
                            }
                        }
                        return -1;
                    }
                    if ((b11 >> 3) == -2 && (i12 = i10 + 3) < i13) {
                        byte b14 = bArr[i15];
                        byte b15 = bArr[i10 + 2];
                        byte b16 = bArr[i12];
                        i10 += 4;
                        int i17 = (((b11 << 18) ^ (b14 << 12)) ^ (b15 << 6)) ^ (3678080 ^ b16);
                        if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && (b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128 && i17 >= 65536 && i17 < 1114112) {
                            cArr[i14] = (char) ((i17 >>> 10) + 55232);
                            cArr[i14 + 1] = (char) ((i17 & 1023) + 56320);
                            i14 += 2;
                        }
                    }
                    return -1;
                }
                if (i15 >= i13) {
                    return -1;
                }
                i10 += 2;
                byte b17 = bArr[i15];
                if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    return -1;
                }
                cArr[i14] = (char) ((b17 ^ (b11 << 6)) ^ 3968);
                i14++;
            }
        }
        return i14;
    }
}
