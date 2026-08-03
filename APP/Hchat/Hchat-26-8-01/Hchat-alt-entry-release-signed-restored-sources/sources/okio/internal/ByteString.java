package okio.internal;

import com.alibaba.fastjson2.JSONB;
import java.util.Arrays;
import okio.Base64;
import okio.Buffer;
import okio.SegmentedByteString;
import okio._JvmPlatformKt;
import p136j8.C2104o;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x010a, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x009d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int codePointIndexToCharIndex(byte[] bArr, int i9) {
        byte b10;
        int i10;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                break;
            }
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                int i14 = i13 + 1;
                if (i13 != i9) {
                    if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                        break;
                    }
                    i12 += b11 < 65536 ? 1 : 2;
                    i11++;
                    while (true) {
                        i13 = i14;
                        if (i11 < length && (b10 = bArr[i11]) >= 0) {
                            i11++;
                            i14 = i13 + 1;
                            if (i13 != i9) {
                                if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                                    break loop0;
                                }
                                i12 += b10 < 65536 ? 1 : 2;
                            } else {
                                return i12;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            } else if ((b11 >> 5) == -2) {
                int i15 = i11 + 1;
                if (length <= i15) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b12 = bArr[i15];
                if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                int i16 = (b11 << 6) ^ (b12 ^ 3968);
                if (i16 >= 128) {
                    int i17 = i13 + 1;
                    if (i13 != i9) {
                        if ((i16 != 10 && i16 != 13 && ((i16 >= 0 && i16 < 32) || (127 <= i16 && i16 < 160))) || i16 == 65533) {
                            break;
                        }
                        i12 += i16 < 65536 ? 1 : 2;
                        i11 += 2;
                        i13 = i17;
                    } else {
                        break;
                    }
                } else {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
            } else if ((b11 >> 4) == -2) {
                int i18 = i11 + 2;
                if (length <= i18) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b13 = bArr[i11 + 1];
                if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b14 = bArr[i18];
                if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                int i19 = (b11 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                if (i19 < 2048) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i19 && i19 < 57344) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                i10 = i13 + 1;
                if (i13 != i9) {
                    if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                        break;
                    }
                    i12 += i19 < 65536 ? 1 : 2;
                    i11 += 3;
                    i13 = i10;
                } else {
                    break;
                }
            } else {
                if ((b11 >> 3) != -2) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                int i20 = i11 + 3;
                if (length <= i20) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b15 = bArr[i11 + 1];
                if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b16 = bArr[i11 + 2];
                if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                byte b17 = bArr[i20];
                if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                int i21 = (b11 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                if (i21 > 1114111) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                if (55296 <= i21 && i21 < 57344) {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
                if (i21 >= 65536) {
                    i10 = i13 + 1;
                    if (i13 != i9) {
                        if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                            break;
                        }
                        i12 += i21 < 65536 ? 1 : 2;
                        i11 += 4;
                        i13 = i10;
                    } else {
                        break;
                    }
                } else {
                    if (i13 == i9) {
                        break;
                    }
                    return -1;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonBase64(okio.ByteString byteString) {
        byteString.getClass();
        return Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonBase64Url(okio.ByteString byteString) {
        byteString.getClass();
        return Base64.encodeBase64(byteString.getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonCompareTo(okio.ByteString byteString, okio.ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        int size = byteString.size();
        int size2 = byteString2.size();
        int iMin = Math.min(size, size2);
        for (int i9 = 0; i9 < iMin; i9++) {
            int i10 = byteString.getByte(i9) & 255;
            int i11 = byteString2.getByte(i9) & 255;
            if (i10 != i11) {
                return i10 < i11 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonCopyInto(okio.ByteString byteString, int i9, byte[] bArr, int i10, int i11) {
        byteString.getClass();
        bArr.getClass();
        AbstractC4165l.m8380o0(byteString.getData$okio(), i10, i9, bArr, i11 + i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonDecodeBase64(String str) {
        str.getClass();
        byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (bArrDecodeBase64ToArray != null) {
            return new okio.ByteString(bArrDecodeBase64ToArray);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonDecodeHex(String str) {
        str.getClass();
        if (str.length() % 2 != 0) {
            C2104o.m5291q("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) (decodeHexDigit(str.charAt(i10 + 1)) + (decodeHexDigit(str.charAt(i10)) << 4));
        }
        return new okio.ByteString(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonEncodeUtf8(String str) {
        str.getClass();
        okio.ByteString byteString = new okio.ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonEndsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonEquals(okio.ByteString byteString, Object obj) {
        byteString.getClass();
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString2 = (okio.ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte commonGetByte(okio.ByteString byteString, int i9) {
        byteString.getClass();
        return byteString.getData$okio()[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonGetSize(okio.ByteString byteString) {
        byteString.getClass();
        return byteString.getData$okio().length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonHashCode(okio.ByteString byteString) {
        byteString.getClass();
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(iHashCode);
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonHex(okio.ByteString byteString) {
        byteString.getClass();
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i9 = 0;
        for (byte b10 : byteString.getData$okio()) {
            int i10 = i9 + 1;
            cArr[i9] = getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i9 += 2;
            cArr[i10] = getHEX_DIGIT_CHARS()[b10 & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonIndexOf(okio.ByteString byteString, byte[] bArr, int i9) {
        byteString.getClass();
        bArr.getClass();
        int length = byteString.getData$okio().length - bArr.length;
        int iMax = Math.max(i9, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonInternalArray(okio.ByteString byteString) {
        byteString.getClass();
        return byteString.getData$okio();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int commonLastIndexOf(okio.ByteString byteString, byte[] bArr, int i9) {
        byteString.getClass();
        bArr.getClass();
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(byteString, i9), byteString.getData$okio().length - bArr.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonOf(byte[] bArr) {
        bArr.getClass();
        return new okio.ByteString(Arrays.copyOf(bArr, bArr.length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonRangeEquals(okio.ByteString byteString, int i9, byte[] bArr, int i10, int i11) {
        byteString.getClass();
        bArr.getClass();
        return i9 >= 0 && i9 <= byteString.getData$okio().length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i9, bArr, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean commonStartsWith(okio.ByteString byteString, okio.ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonSubstring(okio.ByteString byteString, int i9, int i10) {
        byteString.getClass();
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, i10);
        if (i9 < 0) {
            C2104o.m5294t("beginIndex < 0");
            return null;
        }
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            C2104o.m5291q(AbstractC3199a.m6841n(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')'));
            return null;
        }
        if (iResolveDefaultParameter - i9 >= 0) {
            return (i9 == 0 && iResolveDefaultParameter == byteString.getData$okio().length) ? byteString : new okio.ByteString(AbstractC4165l.m8385t0(byteString.getData$okio(), i9, iResolveDefaultParameter));
        }
        C2104o.m5294t("endIndex < beginIndex");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString byteString) {
        byteString.getClass();
        for (int i9 = 0; i9 < byteString.getData$okio().length; i9++) {
            byte b10 = byteString.getData$okio()[i9];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                bArrCopyOf[i9] = (byte) (b10 + 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i10] = (byte) (b11 + 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString byteString) {
        byteString.getClass();
        for (int i9 = 0; i9 < byteString.getData$okio().length; i9++) {
            byte b10 = byteString.getData$okio()[i9];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                bArrCopyOf[i9] = (byte) (b10 - 32);
                for (int i10 = i9 + 1; i10 < bArrCopyOf.length; i10++) {
                    byte b11 = bArrCopyOf[i10];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i10] = (byte) (b11 - 32);
                    }
                }
                return new okio.ByteString(bArrCopyOf);
            }
        }
        return byteString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte[] commonToByteArray(okio.ByteString byteString) {
        byteString.getClass();
        byte[] data$okio = byteString.getData$okio();
        return Arrays.copyOf(data$okio, data$okio.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final okio.ByteString commonToByteString(byte[] bArr, int i9, int i10) {
        bArr.getClass();
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i10);
        SegmentedByteString.checkOffsetAndCount(bArr.length, i9, iResolveDefaultParameter);
        return new okio.ByteString(AbstractC4165l.m8385t0(bArr, i9, iResolveDefaultParameter + i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonToString(okio.ByteString byteString) {
        byteString.getClass();
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = byteString.utf8();
            String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(strUtf8.substring(0, iCodePointIndexToCharIndex), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strM6737a0 + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + strM6737a0 + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(byteString.getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(byteString, 64);
        if (iResolveDefaultParameter > byteString.getData$okio().length) {
            C2104o.m5291q(AbstractC3199a.m6841n(new StringBuilder("endIndex > length("), byteString.getData$okio().length, ')'));
            return null;
        }
        if (iResolveDefaultParameter < 0) {
            C2104o.m5294t("endIndex < beginIndex");
            return null;
        }
        if (iResolveDefaultParameter != byteString.getData$okio().length) {
            byteString = new okio.ByteString(AbstractC4165l.m8385t0(byteString.getData$okio(), 0, iResolveDefaultParameter));
        }
        sb2.append(byteString.hex());
        sb2.append("…]");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String commonUtf8(okio.ByteString byteString) {
        byteString.getClass();
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void commonWrite(okio.ByteString byteString, Buffer buffer, int i9, int i10) {
        byteString.getClass();
        buffer.getClass();
        buffer.write(byteString.getData$okio(), i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final int decodeHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static final boolean commonStartsWith(okio.ByteString byteString, byte[] bArr) {
        byteString.getClass();
        bArr.getClass();
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final boolean commonEndsWith(okio.ByteString byteString, byte[] bArr) {
        byteString.getClass();
        bArr.getClass();
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonRangeEquals(okio.ByteString byteString, int i9, okio.ByteString byteString2, int i10, int i11) {
        byteString.getClass();
        byteString2.getClass();
        return byteString2.rangeEquals(i10, byteString.getData$okio(), i9, i11);
    }

    public static final int commonLastIndexOf(okio.ByteString byteString, okio.ByteString byteString2, int i9) {
        byteString.getClass();
        byteString2.getClass();
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i9);
    }
}
