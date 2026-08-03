package bsh.org.objectweb.asm;

import okhttp3.internal.http2.Settings;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ByteVector {
    byte[] data;
    int length;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector() {
        this.data = new byte[64];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void enlarge(int i9) {
        byte[] bArr = this.data;
        int length = bArr.length * 2;
        int i10 = this.length;
        int i11 = i9 + i10;
        if (length <= i11) {
            length = i11;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        this.data = bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteVector encodeUTF8(String str, int i9, int i10) {
        int length = str.length();
        int i11 = i9;
        int i12 = i11;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            i12 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i12 + 2 : i12 + 3 : i12 + 1;
            i11++;
        }
        if (i12 > i10) {
            C2104o.m5289o();
            return null;
        }
        int i13 = this.length;
        int i14 = i13 - i9;
        int i15 = i14 - 2;
        if (i15 >= 0) {
            byte[] bArr = this.data;
            bArr[i15] = (byte) (i12 >>> 8);
            bArr[i14 - 1] = (byte) i12;
        }
        if ((i13 + i12) - i9 > this.data.length) {
            enlarge(i12 - i9);
        }
        int i16 = this.length;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                byte[] bArr2 = this.data;
                if (cCharAt2 <= 2047) {
                    int i17 = i16 + 1;
                    bArr2[i16] = (byte) (((cCharAt2 >> 6) & 31) | Opcodes.CHECKCAST);
                    i16 += 2;
                    bArr2[i17] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    bArr2[i16] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                    int i18 = i16 + 2;
                    bArr2[i16 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i16 += 3;
                    bArr2[i18] = (byte) ((cCharAt2 & '?') | 128);
                }
            } else {
                this.data[i16] = (byte) cCharAt2;
                i16++;
            }
            i9++;
        }
        this.length = i16;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteVector put11(int i9, int i10) {
        int i11 = this.length;
        if (i11 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) i9;
        bArr[i11 + 1] = (byte) i10;
        this.length = i11 + 2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteVector put112(int i9, int i10, int i11) {
        int i12 = this.length;
        if (i12 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i9;
        bArr[i12 + 1] = (byte) i10;
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
        this.length = i12 + 4;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteVector put12(int i9, int i10) {
        int i11 = this.length;
        if (i11 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) i9;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) i10;
        this.length = i11 + 3;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteVector put122(int i9, int i10, int i11) {
        int i12 = this.length;
        if (i12 + 5 > this.data.length) {
            enlarge(5);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i9;
        bArr[i12 + 1] = (byte) (i10 >>> 8);
        bArr[i12 + 2] = (byte) i10;
        bArr[i12 + 3] = (byte) (i11 >>> 8);
        bArr[i12 + 4] = (byte) i11;
        this.length = i12 + 5;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putByte(int i9) {
        int i10 = this.length;
        int i11 = i10 + 1;
        if (i11 > this.data.length) {
            enlarge(1);
        }
        this.data[i10] = (byte) i9;
        this.length = i11;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putByteArray(byte[] bArr, int i9, int i10) {
        if (this.length + i10 > this.data.length) {
            enlarge(i10);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i9, this.data, this.length, i10);
        }
        this.length += i10;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putInt(int i9) {
        int i10 = this.length;
        if (i10 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i10] = (byte) (i9 >>> 24);
        bArr[i10 + 1] = (byte) (i9 >>> 16);
        bArr[i10 + 2] = (byte) (i9 >>> 8);
        bArr[i10 + 3] = (byte) i9;
        this.length = i10 + 4;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putLong(long j3) {
        int i9 = this.length;
        if (i9 + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i10 = (int) (j3 >>> 32);
        bArr[i9] = (byte) (i10 >>> 24);
        bArr[i9 + 1] = (byte) (i10 >>> 16);
        bArr[i9 + 2] = (byte) (i10 >>> 8);
        bArr[i9 + 3] = (byte) i10;
        int i11 = (int) j3;
        bArr[i9 + 4] = (byte) (i11 >>> 24);
        bArr[i9 + 5] = (byte) (i11 >>> 16);
        bArr[i9 + 6] = (byte) (i11 >>> 8);
        bArr[i9 + 7] = (byte) i11;
        this.length = i9 + 8;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putShort(int i9) {
        int i10 = this.length;
        if (i10 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i10] = (byte) (i9 >>> 8);
        bArr[i10 + 1] = (byte) i9;
        this.length = i10 + 2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            C2104o.m5289o();
            return null;
        }
        int i9 = this.length;
        if (i9 + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int i10 = i9 + 1;
        bArr[i9] = (byte) (length >>> 8);
        int i11 = i9 + 2;
        bArr[i10] = (byte) length;
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 1 || cCharAt > 127) {
                this.length = i11;
                return encodeUTF8(str, i12, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            bArr[i11] = (byte) cCharAt;
            i12++;
            i11++;
        }
        this.length = i11;
        return this;
    }

    public ByteVector(int i9) {
        this.data = new byte[i9];
    }

    public ByteVector(byte[] bArr) {
        this.data = bArr;
        this.length = bArr.length;
    }
}
