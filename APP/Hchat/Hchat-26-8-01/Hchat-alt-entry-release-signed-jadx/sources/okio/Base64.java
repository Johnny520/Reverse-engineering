package okio;

import java.util.Arrays;
import okio.ByteString;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Base64 {
    private static final byte[] BASE64;
    private static final byte[] BASE64_URL_SAFE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ByteString.Companion companion = ByteString.Companion;
        BASE64 = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$okio();
        BASE64_URL_SAFE = companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$okio();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] decodeBase64ToArray(String str) {
        int i9;
        char cCharAt;
        str.getClass();
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i10 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = str.charAt(i14);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i9 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i9 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i9 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i9 = 62;
            } else if (cCharAt2 == '/' || cCharAt2 == '_') {
                i9 = 63;
            } else {
                if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i12 = (i12 << 6) | i9;
            i11++;
            if (i11 % 4 == 0) {
                bArr[i13] = (byte) (i12 >> 16);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (i12 >> 8);
                i13 += 3;
                bArr[i15] = (byte) i12;
            }
        }
        int i16 = i11 % 4;
        if (i16 == 1) {
            return null;
        }
        if (i16 == 2) {
            bArr[i13] = (byte) ((i12 << 12) >> 16);
            i13++;
        } else if (i16 == 3) {
            int i17 = i12 << 6;
            int i18 = i13 + 1;
            bArr[i13] = (byte) (i17 >> 16);
            i13 += 2;
            bArr[i18] = (byte) (i17 >> 8);
        }
        return i13 == i10 ? bArr : Arrays.copyOf(bArr, i13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String encodeBase64(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b10 = bArr[i9];
            int i11 = i9 + 2;
            byte b11 = bArr[i9 + 1];
            i9 += 3;
            byte b12 = bArr[i11];
            bArr3[i10] = bArr2[(b10 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr3[i10 + 2] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr3[i12] = bArr2[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i9];
            bArr3[i10] = bArr2[(b13 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[(b13 & 3) << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (length2 == 2) {
            int i13 = i9 + 1;
            byte b14 = bArr[i9];
            byte b15 = bArr[i13];
            bArr3[i10] = bArr2[(b14 & 255) >> 2];
            bArr3[i10 + 1] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i10 + 2] = bArr2[(b15 & 15) << 2];
            bArr3[i10 + 3] = 61;
        }
        return _JvmPlatformKt.toUtf8String(bArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] getBASE64() {
        return BASE64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static /* synthetic */ void getBASE64$annotations() {
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
    }
}
