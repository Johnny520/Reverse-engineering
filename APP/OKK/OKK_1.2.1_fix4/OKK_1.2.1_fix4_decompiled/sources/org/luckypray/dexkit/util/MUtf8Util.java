package org.luckypray.dexkit.util;

import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MUtf8Util {
    private MUtf8Util() {
    }

    private static long countBytes(String str, boolean z2) throws UTFDataFormatException {
        int length = str.length();
        long j2 = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            j2 += (cCharAt == 0 || cCharAt > 127) ? cCharAt <= 2047 ? 2L : 3L : 1L;
            if (z2 && j2 > 65535) {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        return j2;
    }

    public static String decode(ByteBuffer byteBuffer) throws UTFDataFormatException {
        char c;
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) (byteBuffer.get() & 255)) != 0) {
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b2 = byteBuffer.get();
                if ((b2 & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b2 & 63)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                if ((b3 & 192) != 128 || (b4 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63)));
            }
        }
        return sb.toString();
    }

    public static void encode(byte[] bArr, int i2, String str) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 0 && cCharAt <= 127) {
                bArr[i2] = (byte) cCharAt;
                i2++;
            } else if (cCharAt <= 2047) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) (((cCharAt >> 6) & 31) | 192);
                i2 += 2;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else {
                bArr[i2] = (byte) (((cCharAt >> '\f') & 15) | 224);
                int i5 = i2 + 2;
                bArr[i2 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i2 += 3;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            }
        }
    }

    public static byte[] encode(String str) throws UTFDataFormatException {
        byte[] bArr = new byte[(int) countBytes(str, true)];
        encode(bArr, 0, str);
        return bArr;
    }
}
