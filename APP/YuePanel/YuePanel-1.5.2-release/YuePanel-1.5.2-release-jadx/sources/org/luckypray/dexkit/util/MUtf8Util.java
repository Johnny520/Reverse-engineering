package org.luckypray.dexkit.util;

import Yue.C4750;
import Yue.C8149;
import Yue.C8417;
import com.android.p001dx.p004io.Opcodes;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MUtf8Util {
    private MUtf8Util() {
    }

    private static long countBytes(String str, boolean z) throws UTFDataFormatException {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            j += (cCharAt == 0 || cCharAt > 127) ? cCharAt <= 2047 ? 2L : 3L : 1L;
            if (z && j > C8417.f25173) {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        return j;
    }

    public static String decode(ByteBuffer byteBuffer) throws UTFDataFormatException {
        char c;
        StringBuilder sb = new StringBuilder();
        while (byteBuffer.hasRemaining() && (c = (char) (byteBuffer.get() & 255)) != 0) {
            if (c < 128) {
                sb.append(c);
            } else if ((c & 224) == 192) {
                byte b = byteBuffer.get();
                if ((b & C4750.f10617) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                sb.append((char) (((c & 31) << 6) | (b & C8149.f3255)));
            } else {
                if ((c & 240) != 224) {
                    throw new UTFDataFormatException("bad byte");
                }
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                if ((b2 & C4750.f10617) != 128 || (b3 & C4750.f10617) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                sb.append((char) (((c & 15) << 12) | ((b2 & C8149.f3255) << 6) | (b3 & C8149.f3255)));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void encode(byte[] bArr, int i, String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != 0 && cCharAt <= 127) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt <= 2047) {
                int i3 = i + 1;
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                i += 2;
                bArr[i3] = (byte) ((cCharAt & '?') | 128);
            } else {
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i4 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i += 3;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            }
        }
    }

    public static byte[] encode(String str) throws UTFDataFormatException {
        byte[] bArr = new byte[(int) countBytes(str, true)];
        encode(bArr, 0, str);
        return bArr;
    }
}
