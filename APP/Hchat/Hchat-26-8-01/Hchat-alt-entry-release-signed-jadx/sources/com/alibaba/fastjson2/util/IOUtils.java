package com.alibaba.fastjson2.util;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import java.io.Closeable;
import java.time.LocalTime;
import java.util.Arrays;
import okhttp3.internal.http2.Http2Connection;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    public static final short[] PACKED_DIGITS;
    public static final int[] PACKED_DIGITS_UTF16;
    static final int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    public static final int[] DIGITS_K = new int[1000];
    private static final byte[] MIN_INT_BYTES = "-2147483648".getBytes();
    private static final char[] MIN_INT_CHARS = "-2147483648".toCharArray();
    private static final byte[] MIN_LONG = "-9223372036854775808".getBytes();

    /* JADX INFO: renamed from: CA */
    static final char[] f1980CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();

    /* JADX INFO: renamed from: IA */
    static final int[] f1981IA = new int[Opcodes.ACC_NATIVE];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        short[] sArr = new short[100];
        sArr[0] = 12336;
        sArr[1] = 12592;
        sArr[2] = 12848;
        sArr[3] = 13104;
        sArr[4] = 13360;
        sArr[5] = 13616;
        sArr[6] = 13872;
        sArr[7] = 14128;
        sArr[8] = 14384;
        sArr[9] = 14640;
        sArr[10] = 12337;
        sArr[11] = 12593;
        sArr[12] = 12849;
        sArr[13] = 13105;
        sArr[14] = 13361;
        sArr[15] = 13617;
        sArr[16] = 13873;
        sArr[17] = 14129;
        sArr[18] = 14385;
        sArr[19] = 14641;
        sArr[20] = 12338;
        sArr[21] = 12594;
        sArr[22] = 12850;
        sArr[23] = 13106;
        sArr[24] = 13362;
        sArr[25] = 13618;
        sArr[26] = 13874;
        sArr[27] = 14130;
        sArr[28] = 14386;
        sArr[29] = 14642;
        sArr[30] = 12339;
        sArr[31] = 12595;
        sArr[32] = 12851;
        sArr[33] = 13107;
        sArr[34] = 13363;
        sArr[35] = 13619;
        sArr[36] = 13875;
        sArr[37] = 14131;
        sArr[38] = 14387;
        sArr[39] = 14643;
        sArr[40] = 12340;
        sArr[41] = 12596;
        sArr[42] = 12852;
        sArr[43] = 13108;
        sArr[44] = 13364;
        sArr[45] = 13620;
        sArr[46] = 13876;
        sArr[47] = 14132;
        sArr[48] = 14388;
        sArr[49] = 14644;
        sArr[50] = 12341;
        sArr[51] = 12597;
        sArr[52] = 12853;
        sArr[53] = 13109;
        sArr[54] = 13365;
        sArr[55] = 13621;
        sArr[56] = 13877;
        sArr[57] = 14133;
        sArr[58] = 14389;
        sArr[59] = 14645;
        sArr[60] = 12342;
        sArr[61] = 12598;
        sArr[62] = 12854;
        sArr[63] = 13110;
        sArr[64] = 13366;
        sArr[65] = 13622;
        sArr[66] = 13878;
        sArr[67] = 14134;
        sArr[68] = 14390;
        sArr[69] = 14646;
        sArr[70] = 12343;
        sArr[71] = 12599;
        sArr[72] = 12855;
        sArr[73] = 13111;
        sArr[74] = 13367;
        sArr[75] = 13623;
        sArr[76] = 13879;
        sArr[77] = 14135;
        sArr[78] = 14391;
        sArr[79] = 14647;
        sArr[80] = 12344;
        sArr[81] = 12600;
        sArr[82] = 12856;
        sArr[83] = 13112;
        sArr[84] = 13368;
        sArr[85] = 13624;
        sArr[86] = 13880;
        sArr[87] = 14136;
        sArr[88] = 14392;
        sArr[89] = 14648;
        sArr[90] = 12345;
        sArr[91] = 12601;
        sArr[92] = 12857;
        sArr[93] = 13113;
        sArr[94] = 13369;
        sArr[95] = 13625;
        sArr[96] = 13881;
        sArr[97] = 14137;
        sArr[98] = 14393;
        sArr[99] = 14649;
        int[] iArr = new int[100];
        iArr[0] = 3145776;
        iArr[1] = 3211312;
        iArr[2] = 3276848;
        iArr[3] = 3342384;
        iArr[4] = 3407920;
        iArr[5] = 3473456;
        iArr[6] = 3538992;
        iArr[7] = 3604528;
        iArr[8] = 3670064;
        iArr[9] = 3735600;
        iArr[10] = 3145777;
        iArr[11] = 3211313;
        iArr[12] = 3276849;
        iArr[13] = 3342385;
        iArr[14] = 3407921;
        iArr[15] = 3473457;
        iArr[16] = 3538993;
        iArr[17] = 3604529;
        iArr[18] = 3670065;
        iArr[19] = 3735601;
        iArr[20] = 3145778;
        iArr[21] = 3211314;
        iArr[22] = 3276850;
        iArr[23] = 3342386;
        iArr[24] = 3407922;
        iArr[25] = 3473458;
        iArr[26] = 3538994;
        iArr[27] = 3604530;
        iArr[28] = 3670066;
        iArr[29] = 3735602;
        iArr[30] = 3145779;
        iArr[31] = 3211315;
        iArr[32] = 3276851;
        iArr[33] = 3342387;
        iArr[34] = 3407923;
        iArr[35] = 3473459;
        iArr[36] = 3538995;
        iArr[37] = 3604531;
        iArr[38] = 3670067;
        iArr[39] = 3735603;
        iArr[40] = 3145780;
        iArr[41] = 3211316;
        iArr[42] = 3276852;
        iArr[43] = 3342388;
        iArr[44] = 3407924;
        iArr[45] = 3473460;
        iArr[46] = 3538996;
        iArr[47] = 3604532;
        iArr[48] = 3670068;
        iArr[49] = 3735604;
        iArr[50] = 3145781;
        iArr[51] = 3211317;
        iArr[52] = 3276853;
        iArr[53] = 3342389;
        iArr[54] = 3407925;
        iArr[55] = 3473461;
        iArr[56] = 3538997;
        iArr[57] = 3604533;
        iArr[58] = 3670069;
        iArr[59] = 3735605;
        iArr[60] = 3145782;
        iArr[61] = 3211318;
        iArr[62] = 3276854;
        iArr[63] = 3342390;
        iArr[64] = 3407926;
        iArr[65] = 3473462;
        iArr[66] = 3538998;
        iArr[67] = 3604534;
        iArr[68] = 3670070;
        iArr[69] = 3735606;
        iArr[70] = 3145783;
        iArr[71] = 3211319;
        iArr[72] = 3276855;
        iArr[73] = 3342391;
        iArr[74] = 3407927;
        iArr[75] = 3473463;
        iArr[76] = 3538999;
        iArr[77] = 3604535;
        iArr[78] = 3670071;
        iArr[79] = 3735607;
        iArr[80] = 3145784;
        iArr[81] = 3211320;
        iArr[82] = 3276856;
        iArr[83] = 3342392;
        iArr[84] = 3407928;
        iArr[85] = 3473464;
        iArr[86] = 3539000;
        iArr[87] = 3604536;
        iArr[88] = 3670072;
        iArr[89] = 3735608;
        iArr[90] = 3145785;
        iArr[91] = 3211321;
        iArr[92] = 3276857;
        iArr[93] = 3342393;
        iArr[94] = 3407929;
        iArr[95] = 3473465;
        iArr[96] = 3539001;
        iArr[97] = 3604537;
        iArr[98] = 3670073;
        iArr[99] = 3735609;
        if (JDKUtils.BIG_ENDIAN) {
            for (int i9 = 0; i9 < 100; i9++) {
                sArr[i9] = Short.reverseBytes(sArr[i9]);
            }
            for (int i10 = 0; i10 < 100; i10++) {
                iArr[i10] = Integer.reverseBytes(iArr[i10] << 8);
            }
        }
        PACKED_DIGITS = sArr;
        PACKED_DIGITS_UTF16 = iArr;
        Arrays.fill(f1981IA, -1);
        int length = f1980CA.length;
        for (int i11 = 0; i11 < length; i11++) {
            f1981IA[f1980CA[i11]] = i11;
        }
        f1981IA[61] = 0;
        int i12 = 0;
        while (true) {
            int[] iArr2 = DIGITS_K;
            if (i12 >= iArr2.length) {
                return;
            }
            iArr2[i12] = (i12 % 10) + (i12 < 10 ? 33554432 : i12 < 100 ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0) + (((i12 / 100) + 48) << 16) + ((((i12 / 10) % 10) + 48) << 8) + 48;
            i12++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] decodeBase64(String str) {
        int i9;
        int length = str.length();
        int i10 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i11 = length - 1;
        int i12 = 0;
        while (i12 < i11 && f1981IA[str.charAt(i12) & 255] < 0) {
            i12++;
        }
        while (i11 > 0 && f1981IA[str.charAt(i11) & 255] < 0) {
            i11--;
        }
        int i13 = str.charAt(i11) == '=' ? str.charAt(i11 + (-1)) == '=' ? 2 : 1 : 0;
        int i14 = (i11 - i12) + 1;
        if (length > 76) {
            i9 = (str.charAt(76) == '\r' ? i14 / 78 : 0) << 1;
        } else {
            i9 = 0;
        }
        int i15 = (((i14 - i9) * 6) >> 3) - i13;
        byte[] bArr = new byte[i15];
        int i16 = (i15 / 3) * 3;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i16) {
            int[] iArr = f1981IA;
            int i19 = iArr[str.charAt(i12 + 3)] | (iArr[str.charAt(i12)] << 18) | (iArr[str.charAt(i12 + 1)] << 12) | (iArr[str.charAt(i12 + 2)] << 6);
            int i20 = i12 + 4;
            bArr[i17] = (byte) (i19 >> 16);
            bArr[i17 + 1] = (byte) (i19 >> 8);
            bArr[i17 + 2] = (byte) i19;
            i17 += 3;
            if (i9 <= 0 || (i18 = i18 + 1) != 19) {
                i12 = i20;
            } else {
                i12 += 6;
                i18 = 0;
            }
        }
        if (i17 < i15) {
            int i21 = 0;
            while (i12 <= i11 - i13) {
                i10 |= f1981IA[str.charAt(i12)] << (18 - (i21 * 6));
                i21++;
                i12++;
            }
            int i22 = 16;
            while (i17 < i15) {
                bArr[i17] = (byte) (i10 >> i22);
                i22 -= 8;
                i17++;
            }
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int digit2(char[] cArr, int i9) {
        int i10 = (cArr[i9 + 1] << 16) | cArr[i9];
        int i11 = 983055 & i10;
        if (((((-983056) & i10) - 3145776) | ((393222 + i11) & 15728880)) != 0) {
            return -1;
        }
        return ((i10 & 15) * 10) + (i11 >> 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int digit4(char[] cArr, int i9) {
        long jReverseBytes = JDKUtils.UNSAFE.getLong(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + (((long) i9) << 1));
        if (JDKUtils.BIG_ENDIAN) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        long j3 = 4222189076152335L & jReverseBytes;
        if (((((-4222189076152336L) & jReverseBytes) - 13511005043687472L) | ((1688875630460934L + j3) & 67555025218437360L)) != 0) {
            return -1;
        }
        return (int) (((((((jReverseBytes & 15) * 10) + ((j3 >> 16) & 15)) * 10) + (15 & (j3 >> 32))) * 10) + (j3 >> 48));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int encodeUTF8(char[] cArr, int i9, int i10, byte[] bArr, int i11) {
        int i12;
        int i13;
        char c10;
        int i14 = i9 + i10;
        int iMin = Math.min(i10, bArr.length) + i11;
        while (i11 < iMin && (c10 = cArr[i9]) < 128) {
            i9++;
            bArr[i11] = (byte) c10;
            i11++;
        }
        while (i9 < i14) {
            int i15 = i9 + 1;
            char c11 = cArr[i9];
            if (c11 < 128) {
                i12 = i11 + 1;
                bArr[i11] = (byte) c11;
            } else {
                if (c11 < 2048) {
                    bArr[i11] = (byte) ((c11 >> 6) | Opcodes.CHECKCAST);
                    bArr[i11 + 1] = (byte) ((c11 & '?') | 128);
                    i11 += 2;
                } else if (c11 < 55296 || c11 >= 57344) {
                    bArr[i11] = (byte) ((c11 >> '\f') | 224);
                    bArr[i11 + 1] = (byte) (((c11 >> 6) & 63) | 128);
                    bArr[i11 + 2] = (byte) ((c11 & '?') | 128);
                    i11 += 3;
                } else if (c11 < 56320) {
                    if (i14 - i9 < 2) {
                        i13 = -1;
                    } else {
                        char c12 = cArr[i9 + 1];
                        if (c12 < 56320 || c12 >= 57344) {
                            i12 = i11 + 1;
                            bArr[i11] = 63;
                        } else {
                            i13 = ((c11 << '\n') + c12) - 56613888;
                        }
                    }
                    if (i13 < 0) {
                        i12 = i11 + 1;
                        bArr[i11] = 63;
                    } else {
                        bArr[i11] = (byte) ((i13 >> 18) | 240);
                        bArr[i11 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr[i11 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr[i11 + 3] = (byte) ((i13 & 63) | 128);
                        i15 = i9 + 2;
                        i12 = i11 + 4;
                    }
                } else {
                    i12 = i11 + 1;
                    bArr[i11] = 63;
                }
                i9 = i15;
            }
            i11 = i12;
            i9 = i15;
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void getChars(long j3, int i9, char[] cArr) {
        int i10;
        boolean z9 = j3 < 0;
        if (!z9) {
            j3 = -j3;
        }
        while (j3 <= -2147483648L) {
            long j4 = j3 / 100;
            i9 -= 2;
            JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1)), PACKED_DIGITS_UTF16[(int) ((100 * j4) - j3)]);
            j3 = j4;
        }
        int i11 = (int) j3;
        while (i11 <= -100) {
            int i12 = i11 / 100;
            i9 -= 2;
            JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i9 << 1)), PACKED_DIGITS_UTF16[(i12 * 100) - i11]);
            i11 = i12;
        }
        if (i11 < -9) {
            i10 = i9 - 2;
            JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i10 << 1)), PACKED_DIGITS_UTF16[-i11]);
        } else {
            i10 = i9 - 1;
            cArr[i10] = (char) (48 - i11);
        }
        if (z9) {
            cArr[i10 - 1] = '-';
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getInt(byte[] bArr, int i9) {
        int i10 = JDKUtils.UNSAFE.getInt(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9));
        return JDKUtils.BIG_ENDIAN ? i10 : Integer.reverseBytes(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int indexOfChar(byte[] bArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (bArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isNumber(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i9 != 0 || length == 1) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int stringSize(long j3) {
        long j4 = 10;
        for (int i9 = 1; i9 < 19; i9++) {
            if (j3 < j4) {
                return i9;
            }
            j4 *= 10;
        }
        return 19;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int writeDecimal(byte[] bArr, int i9, long j3, int i10) {
        if (j3 < 0) {
            bArr[i9] = 45;
            j3 = -j3;
            i9++;
        }
        if (i10 == 0) {
            return writeInt64(bArr, i9, j3);
        }
        int iStringSize = stringSize(j3) - i10;
        if (iStringSize == 0) {
            bArr[i9] = JSONB.Constants.BC_INT32_BYTE_MIN;
            bArr[i9 + 1] = 46;
            i9 += 2;
        } else if (iStringSize < 0) {
            bArr[i9] = JSONB.Constants.BC_INT32_BYTE_MIN;
            bArr[i9 + 1] = 46;
            i9 += 2;
            int i11 = 0;
            while (i11 < (-iStringSize)) {
                bArr[i9] = JSONB.Constants.BC_INT32_BYTE_MIN;
                i11++;
                i9++;
            }
        }
        int iWriteInt64 = writeInt64(bArr, i9, j3);
        if (iStringSize <= 0) {
            return iWriteInt64;
        }
        int i12 = iWriteInt64 - i10;
        System.arraycopy(bArr, i12, bArr, i12 + 1, i10);
        bArr[i12] = 46;
        return iWriteInt64 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int writeInt32(char[] cArr, int i9, int i10) {
        int i11;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                char[] cArr2 = MIN_INT_CHARS;
                System.arraycopy(cArr2, 0, cArr, i9, cArr2.length);
                return i9 + cArr2.length;
            }
            i10 = -i10;
            cArr[i9] = '-';
            i9++;
        }
        if (i10 < 1000) {
            int i12 = DIGITS_K[i10];
            int i13 = i12 >> 24;
            if (i13 == 0) {
                cArr[i9] = (char) ((byte) (i12 >> 16));
                cArr[i9 + 1] = (char) ((byte) (i12 >> 8));
                i9 += 2;
            } else if (i13 == 1) {
                cArr[i9] = (char) ((byte) (i12 >> 8));
                i9++;
            }
            int i14 = i9 + 1;
            cArr[i9] = (char) ((byte) i12);
            return i14;
        }
        int i15 = i10 / 1000;
        int[] iArr = DIGITS_K;
        int i16 = iArr[i10 - (i15 * 1000)];
        if (i10 < 1000000) {
            int i17 = iArr[i15];
            int i18 = i17 >> 24;
            if (i18 == 0) {
                cArr[i9] = (char) ((byte) (i17 >> 16));
                cArr[i9 + 1] = (char) ((byte) (i17 >> 8));
                i9 += 2;
            } else if (i18 == 1) {
                cArr[i9] = (char) ((byte) (i17 >> 8));
                i9++;
            }
            cArr[i9] = (char) ((byte) i17);
            cArr[i9 + 1] = (char) ((byte) (i16 >> 16));
            cArr[i9 + 2] = (char) ((byte) (i16 >> 8));
            cArr[i9 + 3] = (char) ((byte) i16);
            return i9 + 4;
        }
        int i19 = i15 / 1000;
        int i20 = i19 / 1000;
        int i21 = iArr[i15 - (i19 * 1000)];
        if (i20 == 0) {
            int i22 = iArr[i19];
            int i23 = i22 >> 24;
            if (i23 == 0) {
                cArr[i9] = (char) ((byte) (i22 >> 16));
                cArr[i9 + 1] = (char) ((byte) (i22 >> 8));
                i9 += 2;
            } else if (i23 == 1) {
                cArr[i9] = (char) ((byte) (i22 >> 8));
                i9++;
            }
            i11 = i9 + 1;
            cArr[i9] = (char) ((byte) i22);
        } else {
            cArr[i9] = (char) ((byte) (i20 + 48));
            int i24 = iArr[i19 - (i20 * 1000)];
            cArr[i9 + 1] = (char) ((byte) (i24 >> 16));
            cArr[i9 + 2] = (char) ((byte) (i24 >> 8));
            cArr[i9 + 3] = (char) ((byte) i24);
            i11 = i9 + 4;
        }
        cArr[i11] = (char) ((byte) (i21 >> 16));
        cArr[i11 + 1] = (char) ((byte) (i21 >> 8));
        cArr[i11 + 2] = (char) ((byte) i21);
        cArr[i11 + 3] = (char) ((byte) (i16 >> 16));
        cArr[i11 + 4] = (char) ((byte) (i16 >> 8));
        cArr[i11 + 5] = (char) ((byte) i16);
        return i11 + 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int writeInt64(char[] cArr, int i9, long j3) {
        int i10;
        int i11;
        long j4 = j3;
        if (j4 >= 0) {
            i10 = i9;
        } else if (j4 == Long.MIN_VALUE) {
            int i12 = 0;
            while (true) {
                byte[] bArr = MIN_LONG;
                if (i12 >= bArr.length) {
                    return i9 + bArr.length;
                }
                cArr[i9 + i12] = (char) bArr[i12];
                i12++;
            }
        } else {
            j4 = -j4;
            i10 = i9 + 1;
            cArr[i9] = '-';
        }
        if (j4 < 1000) {
            int i13 = DIGITS_K[(int) j4];
            int i14 = i13 >> 24;
            if (i14 == 0) {
                cArr[i10] = (char) ((byte) (i13 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i13 >> 8));
                i10 += 2;
            } else if (i14 == 1) {
                cArr[i10] = (char) ((byte) (i13 >> 8));
                i10++;
            }
            int i15 = i10 + 1;
            cArr[i10] = (char) ((byte) i13);
            return i15;
        }
        long j5 = j4 / 1000;
        int[] iArr = DIGITS_K;
        int i16 = iArr[(int) (j4 - (j5 * 1000))];
        if (j4 < 1000000) {
            int i17 = iArr[(int) j5];
            int i18 = i17 >> 24;
            if (i18 == 0) {
                cArr[i10] = (char) ((byte) (i17 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i17 >> 8));
                i10 += 2;
            } else if (i18 == 1) {
                cArr[i10] = (char) ((byte) (i17 >> 8));
                i10++;
            }
            cArr[i10] = (char) ((byte) i17);
            cArr[i10 + 1] = (char) ((byte) (i16 >> 16));
            cArr[i10 + 2] = (char) ((byte) (i16 >> 8));
            cArr[i10 + 3] = (char) ((byte) i16);
            return i10 + 4;
        }
        long j10 = j5 / 1000;
        int i19 = iArr[(int) (j5 - (j10 * 1000))];
        if (j4 < 1000000000) {
            int i20 = iArr[(int) j10];
            int i21 = i20 >> 24;
            if (i21 == 0) {
                cArr[i10] = (char) ((byte) (i20 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i20 >> 8));
                i10 += 2;
            } else if (i21 == 1) {
                cArr[i10] = (char) ((byte) (i20 >> 8));
                i10++;
            }
            cArr[i10] = (char) ((byte) i20);
            cArr[i10 + 1] = (char) ((byte) (i19 >> 16));
            cArr[i10 + 2] = (char) ((byte) (i19 >> 8));
            cArr[i10 + 3] = (char) ((byte) i19);
            cArr[i10 + 4] = (char) ((byte) (i16 >> 16));
            cArr[i10 + 5] = (char) ((byte) (i16 >> 8));
            cArr[i10 + 6] = (char) ((byte) i16);
            return i10 + 7;
        }
        long j11 = j10 / 1000;
        int i22 = iArr[(int) (j10 - (j11 * 1000))];
        if (j4 < 1000000000000L) {
            int i23 = iArr[(int) j11];
            int i24 = i23 >> 24;
            if (i24 == 0) {
                cArr[i10] = (char) ((byte) (i23 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i23 >> 8));
                i10 += 2;
            } else if (i24 == 1) {
                cArr[i10] = (char) ((byte) (i23 >> 8));
                i10++;
            }
            cArr[i10] = (char) ((byte) i23);
            cArr[i10 + 1] = (char) ((byte) (i22 >> 16));
            cArr[i10 + 2] = (char) ((byte) (i22 >> 8));
            cArr[i10 + 3] = (char) ((byte) i22);
            cArr[i10 + 4] = (char) ((byte) (i19 >> 16));
            cArr[i10 + 5] = (char) ((byte) (i19 >> 8));
            cArr[i10 + 6] = (char) ((byte) i19);
            cArr[i10 + 7] = (char) ((byte) (i16 >> 16));
            cArr[i10 + 8] = (char) ((byte) (i16 >> 8));
            cArr[i10 + 9] = (char) ((byte) i16);
            return i10 + 10;
        }
        int i25 = (int) (j11 / 1000);
        int i26 = iArr[(int) (j11 - ((long) (i25 * 1000)))];
        if (j4 < 1000000000000000L) {
            int i27 = iArr[i25];
            int i28 = i27 >> 24;
            if (i28 == 0) {
                cArr[i10] = (char) ((byte) (i27 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i27 >> 8));
                i10 += 2;
            } else if (i28 == 1) {
                cArr[i10] = (char) ((byte) (i27 >> 8));
                i10++;
            }
            cArr[i10] = (char) ((byte) i27);
            cArr[i10 + 1] = (char) ((byte) (i26 >> 16));
            cArr[i10 + 2] = (char) ((byte) (i26 >> 8));
            cArr[i10 + 3] = (char) ((byte) i26);
            cArr[i10 + 4] = (char) ((byte) (i22 >> 16));
            cArr[i10 + 5] = (char) ((byte) (i22 >> 8));
            cArr[i10 + 6] = (char) ((byte) i22);
            cArr[i10 + 7] = (char) ((byte) (i19 >> 16));
            cArr[i10 + 8] = (char) ((byte) (i19 >> 8));
            cArr[i10 + 9] = (char) ((byte) i19);
            cArr[i10 + 10] = (char) ((byte) (i16 >> 16));
            cArr[i10 + 11] = (char) ((byte) (i16 >> 8));
            cArr[i10 + 12] = (char) ((byte) i16);
            return i10 + 13;
        }
        int i29 = i25 / 1000;
        int i30 = i29 / 1000;
        int i31 = iArr[i25 - (i29 * 1000)];
        if (i30 == 0) {
            int i32 = iArr[i29];
            int i33 = i32 >> 24;
            if (i33 == 0) {
                cArr[i10] = (char) ((byte) (i32 >> 16));
                cArr[i10 + 1] = (char) ((byte) (i32 >> 8));
                i10 += 2;
            } else if (i33 == 1) {
                cArr[i10] = (char) ((byte) (i32 >> 8));
                i10++;
            }
            i11 = i10 + 1;
            cArr[i10] = (char) ((byte) i32);
        } else {
            cArr[i10] = (char) ((byte) (i30 + 48));
            int i34 = iArr[i29 - (i30 * 1000)];
            cArr[i10 + 1] = (char) ((byte) (i34 >> 16));
            cArr[i10 + 2] = (char) ((byte) (i34 >> 8));
            cArr[i10 + 3] = (char) ((byte) i34);
            i11 = i10 + 4;
        }
        cArr[i11] = (char) ((byte) (i31 >> 16));
        cArr[i11 + 1] = (char) ((byte) (i31 >> 8));
        cArr[i11 + 2] = (char) ((byte) i31);
        cArr[i11 + 3] = (char) ((byte) (i26 >> 16));
        cArr[i11 + 4] = (char) ((byte) (i26 >> 8));
        cArr[i11 + 5] = (char) ((byte) i26);
        cArr[i11 + 6] = (char) ((byte) (i22 >> 16));
        cArr[i11 + 7] = (char) ((byte) (i22 >> 8));
        cArr[i11 + 8] = (char) ((byte) i22);
        cArr[i11 + 9] = (char) ((byte) (i19 >> 16));
        cArr[i11 + 10] = (char) ((byte) (i19 >> 8));
        cArr[i11 + 11] = (char) ((byte) i19);
        cArr[i11 + 12] = (char) ((byte) (i16 >> 16));
        cArr[i11 + 13] = (char) ((byte) (i16 >> 8));
        cArr[i11 + 14] = (char) ((byte) i16);
        return i11 + 15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int writeLocalDate(char[] cArr, int i9, int i10, int i11, int i12) {
        int i13;
        int iWriteInt32;
        if (i10 >= 0) {
            if (i10 > 9999) {
                i13 = i9 + 1;
                cArr[i9] = '+';
            }
            if (i10 >= 10000) {
                int i14 = i10 / 100;
                Unsafe unsafe = JDKUtils.UNSAFE;
                long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
                int[] iArr = PACKED_DIGITS_UTF16;
                unsafe.putInt(cArr, ((long) (i9 << 1)) + j3, iArr[i14]);
                unsafe.putInt(cArr, j3 + ((long) ((i9 + 2) << 1)), iArr[i10 - (i14 * 100)]);
                iWriteInt32 = i9 + 4;
            } else {
                iWriteInt32 = writeInt32(cArr, i9, i10);
            }
            cArr[iWriteInt32] = '-';
            Unsafe unsafe2 = JDKUtils.UNSAFE;
            long j4 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
            int[] iArr2 = PACKED_DIGITS_UTF16;
            unsafe2.putInt(cArr, ((long) ((iWriteInt32 + 1) << 1)) + j4, iArr2[i11]);
            cArr[iWriteInt32 + 3] = '-';
            unsafe2.putInt(cArr, j4 + ((long) ((iWriteInt32 + 4) << 1)), iArr2[i12]);
            return iWriteInt32 + 6;
        }
        i13 = i9 + 1;
        cArr[i9] = '-';
        i10 = -i10;
        i9 = i13;
        if (i10 >= 10000) {
        }
        cArr[iWriteInt32] = '-';
        Unsafe unsafe22 = JDKUtils.UNSAFE;
        long j42 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        int[] iArr22 = PACKED_DIGITS_UTF16;
        unsafe22.putInt(cArr, ((long) ((iWriteInt32 + 1) << 1)) + j42, iArr22[i11]);
        cArr[iWriteInt32 + 3] = '-';
        unsafe22.putInt(cArr, j42 + ((long) ((iWriteInt32 + 4) << 1)), iArr22[i12]);
        return iWriteInt32 + 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int writeLocalTime(char[] cArr, int i9, LocalTime localTime) {
        int i10;
        int[] iArr = DIGITS_K;
        int i11 = iArr[localTime.getHour()];
        cArr[i9] = (char) ((byte) (i11 >> 8));
        cArr[i9 + 1] = (char) ((byte) i11);
        cArr[i9 + 2] = ':';
        int i12 = iArr[localTime.getMinute()];
        cArr[i9 + 3] = (char) ((byte) (i12 >> 8));
        cArr[i9 + 4] = (char) ((byte) i12);
        cArr[i9 + 5] = ':';
        int i13 = iArr[localTime.getSecond()];
        cArr[i9 + 6] = (char) ((byte) (i13 >> 8));
        cArr[i9 + 7] = (char) ((byte) i13);
        int i14 = i9 + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i14;
        }
        int i15 = nano / 1000;
        int i16 = i15 / 1000;
        int i17 = nano - (i15 * 1000);
        cArr[i14] = '.';
        int i18 = iArr[i16];
        cArr[i9 + 9] = (char) ((byte) (i18 >> 16));
        cArr[i9 + 10] = (char) ((byte) (i18 >> 8));
        cArr[i9 + 11] = (char) ((byte) i18);
        int i19 = i9 + 12;
        if (i17 == 0) {
            int i20 = i15 - (i16 * 1000);
            if (i20 == 0) {
                return i19;
            }
            i10 = iArr[i20];
        } else {
            i10 = iArr[i15 - (i16 * 1000)];
        }
        cArr[i19] = (char) ((byte) (i10 >> 16));
        cArr[i9 + 13] = (char) ((byte) (i10 >> 8));
        cArr[i9 + 14] = (char) ((byte) i10);
        int i21 = i9 + 15;
        if (i17 == 0) {
            return i21;
        }
        int i22 = iArr[i17];
        cArr[i21] = (char) ((byte) (i22 >> 16));
        cArr[i9 + 16] = (char) ((byte) (i22 >> 8));
        cArr[i9 + 17] = (char) ((byte) i22);
        return i9 + 18;
    }

    public static int indexOfChar(char[] cArr, int i9, int i10, int i11) {
        while (i10 < i11) {
            if (cArr[i10] == i9) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int stringSize(int i9) {
        int i10 = 0;
        while (i9 > sizeTable[i10]) {
            i10++;
        }
        return i10 + 1;
    }

    public static int digit2(byte[] bArr, int i9) {
        int i10 = (bArr[i9 + 1] << 8) | bArr[i9];
        int i11 = i10 & 3855;
        if (((61680 & (i11 + 1542)) | ((i10 & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((i10 & 15) * 10) + (i11 >> 8);
    }

    public static boolean isNumber(char[] cArr, int i9, int i10) {
        if (i10 <= 0) {
            return false;
        }
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            char c10 = cArr[i12];
            if (c10 == '+' || c10 == '-') {
                if (i12 != i9 || i10 == 1) {
                    return false;
                }
            } else if (c10 < '0' || c10 > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumber(byte[] bArr, int i9, int i10) {
        if (i10 <= 0) {
            return false;
        }
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            char c10 = (char) bArr[i12];
            if (c10 == '+' || c10 == '-') {
                if (i12 != i9 || i10 == 1) {
                    return false;
                }
            } else if (c10 < '0' || c10 > '9') {
                return false;
            }
        }
        return true;
    }

    public static int writeDecimal(char[] cArr, int i9, long j3, int i10) {
        if (j3 < 0) {
            cArr[i9] = '-';
            j3 = -j3;
            i9++;
        }
        if (i10 == 0) {
            return writeInt64(cArr, i9, j3);
        }
        int iStringSize = stringSize(j3) - i10;
        if (iStringSize == 0) {
            cArr[i9] = '0';
            cArr[i9 + 1] = '.';
            i9 += 2;
        } else if (iStringSize < 0) {
            cArr[i9] = '0';
            cArr[i9 + 1] = '.';
            i9 += 2;
            int i11 = 0;
            while (i11 < (-iStringSize)) {
                cArr[i9] = '0';
                i11++;
                i9++;
            }
        }
        int iWriteInt64 = writeInt64(cArr, i9, j3);
        if (iStringSize <= 0) {
            return iWriteInt64;
        }
        int i12 = iWriteInt64 - i10;
        System.arraycopy(cArr, i12, cArr, i12 + 1, i10);
        cArr[i12] = '.';
        return iWriteInt64 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int writeLocalDate(byte[] bArr, int i9, int i10, int i11, int i12) {
        int i13;
        int iWriteInt32;
        if (i10 < 0) {
            i13 = i9 + 1;
            bArr[i9] = 45;
            i10 = -i10;
        } else {
            if (i10 > 9999) {
                i13 = i9 + 1;
                bArr[i9] = 43;
            }
            if (i10 >= 10000) {
                int i14 = i10 / 100;
                Unsafe unsafe = JDKUtils.UNSAFE;
                long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
                long j4 = i9;
                short[] sArr = PACKED_DIGITS;
                unsafe.putShort(bArr, j3 + j4, sArr[i14]);
                unsafe.putShort(bArr, j3 + j4 + 2, sArr[i10 - (i14 * 100)]);
                iWriteInt32 = i9 + 4;
            } else {
                iWriteInt32 = writeInt32(bArr, i9, i10);
            }
            bArr[iWriteInt32] = 45;
            Unsafe unsafe2 = JDKUtils.UNSAFE;
            long j5 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
            long j10 = iWriteInt32;
            short[] sArr2 = PACKED_DIGITS;
            unsafe2.putShort(bArr, j5 + j10 + 1, sArr2[i11]);
            bArr[iWriteInt32 + 3] = 45;
            unsafe2.putShort(bArr, j5 + j10 + 4, sArr2[i12]);
            return iWriteInt32 + 6;
        }
        i9 = i13;
        if (i10 >= 10000) {
        }
        bArr[iWriteInt32] = 45;
        Unsafe unsafe22 = JDKUtils.UNSAFE;
        long j52 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j102 = iWriteInt32;
        short[] sArr22 = PACKED_DIGITS;
        unsafe22.putShort(bArr, j52 + j102 + 1, sArr22[i11]);
        bArr[iWriteInt32 + 3] = 45;
        unsafe22.putShort(bArr, j52 + j102 + 4, sArr22[i12]);
        return iWriteInt32 + 6;
    }

    public static void getChars(int i9, int i10, char[] cArr) {
        int i11;
        boolean z9 = i9 < 0;
        if (!z9) {
            i9 = -i9;
        }
        while (i9 <= -100) {
            int i12 = i9 / 100;
            i10 -= 2;
            JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i10 << 1)), PACKED_DIGITS_UTF16[(i12 * 100) - i9]);
            i9 = i12;
        }
        if (i9 < -9) {
            i11 = i10 - 2;
            JDKUtils.UNSAFE.putInt(cArr, JDKUtils.ARRAY_CHAR_BASE_OFFSET + ((long) (i11 << 1)), PACKED_DIGITS_UTF16[-i9]);
        } else {
            i11 = i10 - 1;
            cArr[i11] = (char) (48 - i9);
        }
        if (z9) {
            cArr[i11 - 1] = '-';
        }
    }

    public static void getChars(long j3, int i9, byte[] bArr) {
        int i10;
        boolean z9 = j3 < 0;
        if (!z9) {
            j3 = -j3;
        }
        while (j3 <= -2147483648L) {
            long j4 = j3 / 100;
            i9 -= 2;
            JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9), PACKED_DIGITS[(int) ((100 * j4) - j3)]);
            j3 = j4;
        }
        int i11 = (int) j3;
        while (i11 <= -100) {
            int i12 = i11 / 100;
            i9 -= 2;
            JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i9), PACKED_DIGITS[(i12 * 100) - i11]);
            i11 = i12;
        }
        if (i11 < -9) {
            i10 = i9 - 2;
            JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), PACKED_DIGITS[-i11]);
        } else {
            i10 = i9 - 1;
            bArr[i10] = (byte) (48 - i11);
        }
        if (z9) {
            bArr[i10 - 1] = 45;
        }
    }

    public static void getChars(int i9, int i10, byte[] bArr) {
        int i11;
        boolean z9 = i9 < 0;
        if (!z9) {
            i9 = -i9;
        }
        while (i9 <= -100) {
            int i12 = i9 / 100;
            i10 -= 2;
            JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i10), PACKED_DIGITS[(i12 * 100) - i9]);
            i9 = i12;
        }
        if (i9 < -9) {
            i11 = i10 - 2;
            JDKUtils.UNSAFE.putShort(bArr, JDKUtils.ARRAY_BYTE_BASE_OFFSET + ((long) i11), PACKED_DIGITS[-i9]);
        } else {
            i11 = i10 - 1;
            bArr[i11] = (byte) (48 - i9);
        }
        if (z9) {
            bArr[i11 - 1] = 45;
        }
    }

    public static int writeLocalTime(byte[] bArr, int i9, LocalTime localTime) {
        int i10;
        int[] iArr = DIGITS_K;
        int i11 = iArr[localTime.getHour()];
        bArr[i9] = (byte) (i11 >> 8);
        bArr[i9 + 1] = (byte) i11;
        bArr[i9 + 2] = 58;
        int i12 = iArr[localTime.getMinute()];
        bArr[i9 + 3] = (byte) (i12 >> 8);
        bArr[i9 + 4] = (byte) i12;
        bArr[i9 + 5] = 58;
        int i13 = iArr[localTime.getSecond()];
        bArr[i9 + 6] = (byte) (i13 >> 8);
        bArr[i9 + 7] = (byte) i13;
        int i14 = i9 + 8;
        int nano = localTime.getNano();
        if (nano == 0) {
            return i14;
        }
        int i15 = nano / 1000;
        int i16 = i15 / 1000;
        int i17 = nano - (i15 * 1000);
        bArr[i14] = 46;
        int i18 = iArr[i16];
        bArr[i9 + 9] = (byte) (i18 >> 16);
        bArr[i9 + 10] = (byte) (i18 >> 8);
        bArr[i9 + 11] = (byte) i18;
        int i19 = i9 + 12;
        if (i17 == 0) {
            int i20 = i15 - (i16 * 1000);
            if (i20 == 0) {
                return i19;
            }
            i10 = iArr[i20];
        } else {
            i10 = iArr[i15 - (i16 * 1000)];
        }
        bArr[i19] = (byte) (i10 >> 16);
        bArr[i9 + 13] = (byte) (i10 >> 8);
        bArr[i9 + 14] = (byte) i10;
        int i21 = i9 + 15;
        if (i17 == 0) {
            return i21;
        }
        int i22 = iArr[i17];
        bArr[i21] = (byte) (i22 >> 16);
        bArr[i9 + 16] = (byte) (i22 >> 8);
        bArr[i9 + 17] = (byte) i22;
        return i9 + 18;
    }

    public static int encodeUTF8(byte[] bArr, int i9, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13 = i10 + i9;
        while (i9 < i13) {
            byte b10 = bArr[i9];
            byte b11 = bArr[i9 + 1];
            int i14 = i9 + 2;
            if (b11 != 0 || b10 < 0) {
                char c10 = (char) ((b10 & 255) | ((b11 & 255) << 8));
                if (c10 < 2048) {
                    bArr2[i11] = (byte) ((c10 >> 6) | Opcodes.CHECKCAST);
                    bArr2[i11 + 1] = (byte) ((c10 & '?') | 128);
                    i11 += 2;
                } else {
                    if (c10 >= 55296 && c10 < 57344) {
                        int i15 = i9 + 1;
                        int i16 = -1;
                        if (c10 < 56320) {
                            if (i13 - i15 >= 2) {
                                char c11 = (char) ((bArr[i9 + 2] & 255) | ((bArr[i9 + 3] & 255) << 8));
                                if (c11 >= 56320 && c11 < 57344) {
                                    i16 = ((c10 << '\n') + c11) - 56613888;
                                    i14 = i9 + 4;
                                }
                            }
                            if (i16 < 0) {
                                i12 = i11 + 1;
                                bArr2[i11] = 63;
                            } else {
                                bArr2[i11] = (byte) ((i16 >> 18) | 240);
                                bArr2[i11 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                                bArr2[i11 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                                bArr2[i11 + 3] = (byte) ((i16 & 63) | 128);
                                i12 = i11 + 4;
                            }
                        }
                        return -1;
                    }
                    bArr2[i11] = (byte) ((c10 >> '\f') | 224);
                    bArr2[i11 + 1] = (byte) (((c10 >> 6) & 63) | 128);
                    bArr2[i11 + 2] = (byte) ((c10 & '?') | 128);
                    i11 += 3;
                }
                i9 = i14;
            } else {
                i12 = i11 + 1;
                bArr2[i11] = b10;
            }
            i11 = i12;
            i9 = i14;
        }
        return i11;
    }

    public static void writeLocalTime(byte[] bArr, int i9, int i10, int i11, int i12) {
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
        long j4 = i9;
        short[] sArr = PACKED_DIGITS;
        unsafe.putShort(bArr, j3 + j4, sArr[i10]);
        bArr[i9 + 2] = 58;
        unsafe.putShort(bArr, j3 + j4 + 3, sArr[i11]);
        bArr[i9 + 5] = 58;
        unsafe.putShort(bArr, j3 + j4 + 6, sArr[i12]);
    }

    public static void writeLocalTime(char[] cArr, int i9, int i10, int i11, int i12) {
        Unsafe unsafe = JDKUtils.UNSAFE;
        long j3 = JDKUtils.ARRAY_CHAR_BASE_OFFSET;
        int[] iArr = PACKED_DIGITS_UTF16;
        unsafe.putInt(cArr, ((long) (i9 << 1)) + j3, iArr[i10]);
        cArr[i9 + 2] = ':';
        unsafe.putInt(cArr, ((long) ((i9 + 3) << 1)) + j3, iArr[i11]);
        cArr[i9 + 5] = ':';
        unsafe.putInt(cArr, j3 + ((long) ((i9 + 6) << 1)), iArr[i12]);
    }

    public static int writeInt32(byte[] bArr, int i9, int i10) {
        int i11;
        if (i10 < 0) {
            if (i10 == Integer.MIN_VALUE) {
                byte[] bArr2 = MIN_INT_BYTES;
                System.arraycopy(bArr2, 0, bArr, i9, bArr2.length);
                return i9 + bArr2.length;
            }
            i10 = -i10;
            bArr[i9] = 45;
            i9++;
        }
        if (i10 < 1000) {
            int i12 = DIGITS_K[i10];
            int i13 = i12 >> 24;
            if (i13 == 0) {
                bArr[i9] = (byte) (i12 >> 16);
                bArr[i9 + 1] = (byte) (i12 >> 8);
                i9 += 2;
            } else if (i13 == 1) {
                bArr[i9] = (byte) (i12 >> 8);
                i9++;
            }
            int i14 = i9 + 1;
            bArr[i9] = (byte) i12;
            return i14;
        }
        int i15 = i10 / 1000;
        int[] iArr = DIGITS_K;
        int i16 = iArr[i10 - (i15 * 1000)];
        if (i10 < 1000000) {
            int i17 = iArr[i15];
            int i18 = i17 >> 24;
            if (i18 == 0) {
                bArr[i9] = (byte) (i17 >> 16);
                bArr[i9 + 1] = (byte) (i17 >> 8);
                i9 += 2;
            } else if (i18 == 1) {
                bArr[i9] = (byte) (i17 >> 8);
                i9++;
            }
            bArr[i9] = (byte) i17;
            bArr[i9 + 1] = (byte) (i16 >> 16);
            bArr[i9 + 2] = (byte) (i16 >> 8);
            bArr[i9 + 3] = (byte) i16;
            return i9 + 4;
        }
        int i19 = i15 / 1000;
        int i20 = i19 / 1000;
        int i21 = iArr[i15 - (i19 * 1000)];
        if (i20 == 0) {
            int i22 = iArr[i19];
            int i23 = i22 >> 24;
            if (i23 == 0) {
                bArr[i9] = (byte) (i22 >> 16);
                bArr[i9 + 1] = (byte) (i22 >> 8);
                i9 += 2;
            } else if (i23 == 1) {
                bArr[i9] = (byte) (i22 >> 8);
                i9++;
            }
            i11 = i9 + 1;
            bArr[i9] = (byte) i22;
        } else {
            bArr[i9] = (byte) (i20 + 48);
            int i24 = iArr[i19 - (i20 * 1000)];
            bArr[i9 + 1] = (byte) (i24 >> 16);
            bArr[i9 + 2] = (byte) (i24 >> 8);
            bArr[i9 + 3] = (byte) i24;
            i11 = i9 + 4;
        }
        bArr[i11] = (byte) (i21 >> 16);
        bArr[i11 + 1] = (byte) (i21 >> 8);
        bArr[i11 + 2] = (byte) i21;
        bArr[i11 + 3] = (byte) (i16 >> 16);
        bArr[i11 + 4] = (byte) (i16 >> 8);
        bArr[i11 + 5] = (byte) i16;
        return i11 + 6;
    }

    public static int writeInt64(byte[] bArr, int i9, long j3) {
        int i10;
        int i11 = i9;
        long j4 = j3;
        if (j4 < 0) {
            if (j4 == Long.MIN_VALUE) {
                byte[] bArr2 = MIN_LONG;
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                return bArr2.length + i11;
            }
            j4 = -j4;
            bArr[i11] = 45;
            i11++;
        }
        if (j4 < 1000) {
            int i12 = DIGITS_K[(int) j4];
            int i13 = i12 >> 24;
            if (i13 == 0) {
                bArr[i11] = (byte) (i12 >> 16);
                bArr[i11 + 1] = (byte) (i12 >> 8);
                i11 += 2;
            } else if (i13 == 1) {
                bArr[i11] = (byte) (i12 >> 8);
                i11++;
            }
            int i14 = i11 + 1;
            bArr[i11] = (byte) i12;
            return i14;
        }
        long j5 = j4 / 1000;
        int[] iArr = DIGITS_K;
        int i15 = iArr[(int) (j4 - (j5 * 1000))];
        if (j4 < 1000000) {
            int i16 = iArr[(int) j5];
            int i17 = i16 >> 24;
            if (i17 == 0) {
                bArr[i11] = (byte) (i16 >> 16);
                bArr[i11 + 1] = (byte) (i16 >> 8);
                i11 += 2;
            } else if (i17 == 1) {
                bArr[i11] = (byte) (i16 >> 8);
                i11++;
            }
            bArr[i11] = (byte) i16;
            bArr[i11 + 1] = (byte) (i15 >> 16);
            bArr[i11 + 2] = (byte) (i15 >> 8);
            bArr[i11 + 3] = (byte) i15;
            return i11 + 4;
        }
        long j10 = j5 / 1000;
        int i18 = iArr[(int) (j5 - (j10 * 1000))];
        if (j4 < 1000000000) {
            int i19 = iArr[(int) j10];
            int i20 = i19 >> 24;
            if (i20 == 0) {
                bArr[i11] = (byte) (i19 >> 16);
                bArr[i11 + 1] = (byte) (i19 >> 8);
                i11 += 2;
            } else if (i20 == 1) {
                bArr[i11] = (byte) (i19 >> 8);
                i11++;
            }
            bArr[i11] = (byte) i19;
            bArr[i11 + 1] = (byte) (i18 >> 16);
            bArr[i11 + 2] = (byte) (i18 >> 8);
            bArr[i11 + 3] = (byte) i18;
            bArr[i11 + 4] = (byte) (i15 >> 16);
            bArr[i11 + 5] = (byte) (i15 >> 8);
            bArr[i11 + 6] = (byte) i15;
            return i11 + 7;
        }
        long j11 = j10 / 1000;
        int i21 = iArr[(int) (j10 - (j11 * 1000))];
        if (j4 < 1000000000000L) {
            int i22 = iArr[(int) j11];
            int i23 = i22 >> 24;
            if (i23 == 0) {
                bArr[i11] = (byte) (i22 >> 16);
                bArr[i11 + 1] = (byte) (i22 >> 8);
                i11 += 2;
            } else if (i23 == 1) {
                bArr[i11] = (byte) (i22 >> 8);
                i11++;
            }
            bArr[i11] = (byte) i22;
            bArr[i11 + 1] = (byte) (i21 >> 16);
            bArr[i11 + 2] = (byte) (i21 >> 8);
            bArr[i11 + 3] = (byte) i21;
            bArr[i11 + 4] = (byte) (i18 >> 16);
            bArr[i11 + 5] = (byte) (i18 >> 8);
            bArr[i11 + 6] = (byte) i18;
            bArr[i11 + 7] = (byte) (i15 >> 16);
            bArr[i11 + 8] = (byte) (i15 >> 8);
            bArr[i11 + 9] = (byte) i15;
            return i11 + 10;
        }
        int i24 = (int) (j11 / 1000);
        int i25 = iArr[(int) (j11 - ((long) (i24 * 1000)))];
        if (j4 < 1000000000000000L) {
            int i26 = iArr[i24];
            int i27 = i26 >> 24;
            if (i27 == 0) {
                bArr[i11] = (byte) (i26 >> 16);
                bArr[i11 + 1] = (byte) (i26 >> 8);
                i11 += 2;
            } else if (i27 == 1) {
                bArr[i11] = (byte) (i26 >> 8);
                i11++;
            }
            bArr[i11] = (byte) i26;
            bArr[i11 + 1] = (byte) (i25 >> 16);
            bArr[i11 + 2] = (byte) (i25 >> 8);
            bArr[i11 + 3] = (byte) i25;
            bArr[i11 + 4] = (byte) (i21 >> 16);
            bArr[i11 + 5] = (byte) (i21 >> 8);
            bArr[i11 + 6] = (byte) i21;
            bArr[i11 + 7] = (byte) (i18 >> 16);
            bArr[i11 + 8] = (byte) (i18 >> 8);
            bArr[i11 + 9] = (byte) i18;
            bArr[i11 + 10] = (byte) (i15 >> 16);
            bArr[i11 + 11] = (byte) (i15 >> 8);
            bArr[i11 + 12] = (byte) i15;
            return i11 + 13;
        }
        int i28 = i24 / 1000;
        int i29 = i28 / 1000;
        int i30 = iArr[i24 - (i28 * 1000)];
        if (i29 == 0) {
            int i31 = iArr[i28];
            int i32 = i31 >> 24;
            if (i32 == 0) {
                bArr[i11] = (byte) (i31 >> 16);
                bArr[i11 + 1] = (byte) (i31 >> 8);
                i11 += 2;
            } else if (i32 == 1) {
                bArr[i11] = (byte) (i31 >> 8);
                i11++;
            }
            i10 = i11 + 1;
            bArr[i11] = (byte) i31;
        } else {
            bArr[i11] = (byte) (i29 + 48);
            int i33 = iArr[i28 - (i29 * 1000)];
            bArr[i11 + 1] = (byte) (i33 >> 16);
            bArr[i11 + 2] = (byte) (i33 >> 8);
            bArr[i11 + 3] = (byte) i33;
            i10 = i11 + 4;
        }
        bArr[i10] = (byte) (i30 >> 16);
        bArr[i10 + 1] = (byte) (i30 >> 8);
        bArr[i10 + 2] = (byte) i30;
        bArr[i10 + 3] = (byte) (i25 >> 16);
        bArr[i10 + 4] = (byte) (i25 >> 8);
        bArr[i10 + 5] = (byte) i25;
        bArr[i10 + 6] = (byte) (i21 >> 16);
        bArr[i10 + 7] = (byte) (i21 >> 8);
        bArr[i10 + 8] = (byte) i21;
        bArr[i10 + 9] = (byte) (i18 >> 16);
        bArr[i10 + 10] = (byte) (i18 >> 8);
        bArr[i10 + 11] = (byte) i18;
        bArr[i10 + 12] = (byte) (i15 >> 16);
        bArr[i10 + 13] = (byte) (i15 >> 8);
        bArr[i10 + 14] = (byte) i15;
        return i10 + 15;
    }
}
