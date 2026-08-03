package okio;

import okio.Buffer;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentedByteString {
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long and(byte b10, long j3) {
        return ((long) b10) & j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean arrayRangeEquals(byte[] bArr, int i9, byte[] bArr2, int i10, int i11) {
        bArr.getClass();
        bArr2.getClass();
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i9] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void checkOffsetAndCount(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            StringBuilder sbM6842o = AbstractC3199a.m6842o(j3, "size=", " offset=");
            sbM6842o.append(j4);
            sbM6842o.append(" byteCount=");
            sbM6842o.append(j5);
            throw new ArrayIndexOutOfBoundsException(sbM6842o.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int leftRotate(int i9, int i10) {
        return (i9 >>> (32 - i10)) | (i9 << i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long minOf(long j3, int i9) {
        return Math.min(j3, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Buffer.UnsafeCursor resolveDefaultParameter(Buffer.UnsafeCursor unsafeCursor) {
        unsafeCursor.getClass();
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long reverseBytes(long j3) {
        return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long rightRotate(long j3, int i9) {
        return (j3 << (64 - i9)) | (j3 >>> i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int shl(byte b10, int i9) {
        return b10 << i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int shr(byte b10, int i9) {
        return b10 >> i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String toHexString(long j3) {
        if (j3 == 0) {
            return "0";
        }
        int i9 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j3 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j3 & 15)]};
        while (i9 < 16 && cArr[i9] == '0') {
            i9++;
        }
        return AbstractC3156t.m6732V(cArr, i9, 16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final int and(byte b10, int i9) {
        return b10 & i9;
    }

    public static final long and(int i9, long j3) {
        return ((long) i9) & j3;
    }

    public static final long minOf(int i9, long j3) {
        return Math.min(i9, j3);
    }

    public static final int resolveDefaultParameter(ByteString byteString, int i9) {
        byteString.getClass();
        return i9 == DEFAULT__ByteString_size ? byteString.size() : i9;
    }

    public static final int resolveDefaultParameter(byte[] bArr, int i9) {
        bArr.getClass();
        return i9 == DEFAULT__ByteString_size ? bArr.length : i9;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int reverseBytes(int i9) {
        return ((i9 & 255) << 24) | (((-16777216) & i9) >>> 24) | ((16711680 & i9) >>> 8) | ((65280 & i9) << 8);
    }

    public static final short reverseBytes(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String toHexString(int i9) {
        if (i9 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i9 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i9 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return AbstractC3156t.m6732V(cArr, i10, 8);
    }

    public static final String toHexString(byte b10) {
        return new String(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }
}
