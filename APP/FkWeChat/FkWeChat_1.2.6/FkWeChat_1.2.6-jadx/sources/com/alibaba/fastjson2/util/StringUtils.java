package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONWriter;
import java.nio.charset.StandardCharsets;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class StringUtils {
    protected static final long MASK_ESCAPE_NONE_ASCII = JSONWriter.Feature.EscapeNoneAscii.mask;
    protected static final long MASK_BROWSER_SECURE = JSONWriter.Feature.BrowserSecure.mask;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class LATIN1 {
        private static final short[] ESCAPED_CHARS;

        /* JADX INFO: renamed from: U2 */
        private static final short f4756U2;

        /* JADX INFO: renamed from: U4 */
        private static final int f4757U4;

        static {
            byte[] bytes = "\\u00".getBytes(StandardCharsets.UTF_8);
            Unsafe unsafe = JDKUtils.UNSAFE;
            long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
            f4756U2 = unsafe.getShort(bytes, j10);
            f4757U4 = unsafe.getInt(bytes, j10);
            short[] sArr = new short[128];
            sArr[92] = (short) 23644;
            sArr[10] = (short) 28252;
            sArr[13] = (short) 29276;
            sArr[12] = (short) 26204;
            sArr[8] = (short) 25180;
            sArr[9] = (short) 29788;
            ESCAPED_CHARS = sArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class UTF16 {
        private static final int[] ESCAPED_CHARS;

        /* JADX INFO: renamed from: U2 */
        private static final int f4758U2;

        /* JADX INFO: renamed from: U4 */
        private static final long f4759U4;

        static {
            char[] charArray = "\\u00".toCharArray();
            Unsafe unsafe = JDKUtils.UNSAFE;
            long j10 = JDKUtils.ARRAY_BYTE_BASE_OFFSET;
            f4758U2 = unsafe.getInt(charArray, j10);
            f4759U4 = unsafe.getLong(charArray, j10);
            char[] cArr = {'\\', '\\', '\n', 'n', '\r', 'r', '\f', 'f', '\b', 'b', '\t', 't'};
            char[] cArr2 = {'\\', 0};
            int[] iArr = new int[128];
            for (int i10 = 0; i10 < 12; i10 += 2) {
                cArr2[1] = cArr[i10 + 1];
                iArr[cArr[i10]] = IOUtils.getIntUnaligned(cArr2, 0);
            }
            ESCAPED_CHARS = iArr;
        }
    }

    public static boolean escaped(byte[] bArr, byte b10, long j10) {
        int length = bArr.length & (-8);
        int i10 = 0;
        while (i10 < length) {
            if (!noneEscaped(IOUtils.getLongUnaligned(bArr, i10), j10)) {
                return true;
            }
            i10 += 8;
        }
        while (i10 < bArr.length) {
            byte b11 = bArr[i10];
            if (b11 == b10 || b11 == 92 || b11 < 32) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public static boolean noneEscaped(long j10, long j11) {
        return ((6944656592455360608L + j10) & (-9187201950435737472L)) == -9187201950435737472L && (((j11 ^ j10) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L && (((j10 ^ (-6655295901103053917L)) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L;
    }

    public static void writeEscapedChar(byte[] bArr, int i10, int i11) {
        IOUtils.putShortLE(bArr, i10, LATIN1.ESCAPED_CHARS[i11 & 127]);
    }

    public static int writeLatin1(byte[] bArr, int i10, byte[] bArr2, byte b10) {
        int length = bArr2.length;
        bArr[i10] = b10;
        System.arraycopy(bArr2, 0, bArr, i10 + 1, length);
        int i11 = i10 + length;
        bArr[i11 + 1] = b10;
        return i11 + 2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int writeLatin1Escaped(byte[] r3, int r4, byte[] r5, byte r6, long r7) {
        /*
            long r0 = com.alibaba.fastjson2.util.StringUtils.MASK_BROWSER_SECURE
            long r7 = r7 & r0
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 0
            r0 = 1
            if (r7 == 0) goto Ld
            r7 = r0
            goto Le
        Ld:
            r7 = r8
        Le:
            int r1 = r4 + 1
            r3[r4] = r6
        L12:
            int r4 = r5.length
            if (r8 >= r4) goto L6c
            r4 = r5[r8]
            r2 = 40
            if (r4 == r2) goto L5e
            r2 = 41
            if (r4 == r2) goto L5e
            r2 = 60
            if (r4 == r2) goto L5e
            r2 = 62
            if (r4 == r2) goto L5e
            r2 = 92
            if (r4 == r2) goto L5a
            switch(r4) {
                case 0: goto L54;
                case 1: goto L54;
                case 2: goto L54;
                case 3: goto L54;
                case 4: goto L54;
                case 5: goto L54;
                case 6: goto L54;
                case 7: goto L54;
                case 8: goto L5a;
                case 9: goto L5a;
                case 10: goto L5a;
                case 11: goto L54;
                case 12: goto L5a;
                case 13: goto L5a;
                case 14: goto L54;
                case 15: goto L54;
                case 16: goto L54;
                case 17: goto L54;
                case 18: goto L54;
                case 19: goto L54;
                case 20: goto L54;
                case 21: goto L54;
                case 22: goto L54;
                case 23: goto L54;
                case 24: goto L54;
                case 25: goto L54;
                case 26: goto L54;
                case 27: goto L54;
                case 28: goto L54;
                case 29: goto L54;
                case 30: goto L54;
                case 31: goto L54;
                default: goto L2e;
            }
        L2e:
            if (r4 != r6) goto L39
            r3[r1] = r2
            int r4 = r1 + 1
            r3[r4] = r6
        L36:
            int r1 = r1 + 2
            goto L69
        L39:
            if (r4 >= 0) goto L4e
            r2 = r4 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 6
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            r3[r1] = r2
            int r2 = r1 + 1
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r3[r2] = r4
            goto L36
        L4e:
            int r2 = r1 + 1
            r3[r1] = r4
        L52:
            r1 = r2
            goto L69
        L54:
            writeU4Hex2(r3, r1, r4)
        L57:
            int r1 = r1 + 6
            goto L69
        L5a:
            writeEscapedChar(r3, r1, r4)
            goto L36
        L5e:
            if (r7 == 0) goto L64
            writeU4HexU(r3, r1, r4)
            goto L57
        L64:
            int r2 = r1 + 1
            r3[r1] = r4
            goto L52
        L69:
            int r8 = r8 + 1
            goto L12
        L6c:
            r3[r1] = r6
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.StringUtils.writeLatin1Escaped(byte[], int, byte[], byte, long):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int writeLatin1EscapedRest(char[] r7, int r8, byte[] r9, int r10, char r11, long r12) {
        /*
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r0 = r0.mask
            long r0 = r0 & r12
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r5 = r5.mask
            long r12 = r12 & r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L1a
            r1 = r4
        L1a:
            int r12 = r9.length
            if (r10 >= r12) goto L6e
            r12 = r9[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            char r12 = (char) r12
            r13 = 34
            r2 = 92
            if (r12 == r13) goto L5f
            r13 = 60
            if (r12 == r13) goto L54
            r13 = 62
            if (r12 == r13) goto L54
            if (r12 == r2) goto L4e
            switch(r12) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4e;
                case 9: goto L4e;
                case 10: goto L4e;
                case 11: goto L4a;
                case 12: goto L4e;
                case 13: goto L4e;
                case 14: goto L4a;
                case 15: goto L4a;
                case 16: goto L4a;
                case 17: goto L4a;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                default: goto L35;
            }
        L35:
            switch(r12) {
                case 39: goto L5f;
                case 40: goto L54;
                case 41: goto L54;
                default: goto L38;
            }
        L38:
            if (r0 == 0) goto L44
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L44
            writeU4HexU(r7, r8, r12)
        L41:
            int r8 = r8 + 6
            goto L6b
        L44:
            int r13 = r8 + 1
            r7[r8] = r12
        L48:
            r8 = r13
            goto L6b
        L4a:
            writeU4Hex2(r7, r8, r12)
            goto L41
        L4e:
            writeEscapedChar(r7, r8, r12)
            int r8 = r8 + 2
            goto L6b
        L54:
            if (r1 == 0) goto L5a
            writeU4HexU(r7, r8, r12)
            goto L41
        L5a:
            int r13 = r8 + 1
            r7[r8] = r12
            goto L48
        L5f:
            if (r12 != r11) goto L66
            int r13 = r8 + 1
            r7[r8] = r2
            r8 = r13
        L66:
            int r13 = r8 + 1
            r7[r8] = r12
            goto L48
        L6b:
            int r10 = r10 + 1
            goto L1a
        L6e:
            r7[r8] = r11
            int r8 = r8 + r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.StringUtils.writeLatin1EscapedRest(char[], int, byte[], int, char, long):int");
    }

    public static void writeU4Hex2(byte[] bArr, int i10, int i11) {
        IOUtils.putIntUnaligned(bArr, i10, LATIN1.f4757U4);
        IOUtils.putShortLE(bArr, i10 + 4, IOUtils.hex2(i11));
    }

    public static void writeU4HexU(char[] cArr, int i10, int i11) {
        IOUtils.putIntUnaligned(cArr, i10, UTF16.f4758U2);
        IOUtils.putLongLE(cArr, i10 + 2, IOUtils.utf16Hex4U(i11));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0046. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int writeUTF16(byte[] r17, int r18, byte[] r19, byte r20, long r21) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.StringUtils.writeUTF16(byte[], int, byte[], byte, long):int");
    }

    public static void writeEscapedChar(char[] cArr, int i10, int i11) {
        IOUtils.putIntUnaligned(cArr, i10, UTF16.ESCAPED_CHARS[i11 & 127]);
    }

    public static void writeU4Hex2(char[] cArr, int i10, int i11) {
        IOUtils.putLongUnaligned(cArr, i10, UTF16.f4759U4);
        IOUtils.putIntLE(cArr, i10 + 4, IOUtils.utf16Hex2(i11));
    }

    public static void writeU4HexU(byte[] bArr, int i10, int i11) {
        IOUtils.putShortUnaligned(bArr, i10, LATIN1.f4756U2);
        IOUtils.putIntLE(bArr, i10 + 2, IOUtils.hex4U(i11));
    }
}
