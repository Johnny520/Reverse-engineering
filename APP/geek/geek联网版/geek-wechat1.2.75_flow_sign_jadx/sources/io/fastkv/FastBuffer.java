package io.fastkv;

import io.fastkv.interfaces.FastCipher;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class FastBuffer {
    private static final String INVALID_STRING = "Invalid String";
    private static final int MAX_CHAR_LEN = 2048;
    private char[] charBuf;

    /* JADX INFO: renamed from: hb */
    public byte[] f2561hb;
    public int position;

    public FastBuffer(int i) {
        this(new byte[i], 0);
    }

    private void encodeStr(String str) {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < MAX_CHAR_LEN) {
                int i4 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i] = (byte) ((cCharAt >>> '\f') | 224);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                i2 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i6 = i + 3;
                bArr[i + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i += 4;
                bArr[i6] = (byte) ((iCharAt & 63) | 128);
            }
            i2 = i3;
        }
        this.position = i;
    }

    private char[] getCharBuf(int i) {
        char[] cArr = this.charBuf;
        if (cArr == null) {
            char[] cArr2 = i <= 256 ? new char[256] : new char[MAX_CHAR_LEN];
            this.charBuf = cArr2;
            return cArr2;
        }
        if (cArr.length >= i) {
            return cArr;
        }
        char[] cArr3 = new char[MAX_CHAR_LEN];
        this.charBuf = cArr3;
        return cArr3;
    }

    public static int getStringSize(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < MAX_CHAR_LEN) {
                i2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i2 += 3;
            } else {
                i += 2;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    public static int getVarint32Size(int i) {
        if ((i >> 7) == 0) {
            return 1;
        }
        if ((i >> 14) == 0) {
            return 2;
        }
        if ((i >> 21) == 0) {
            return 3;
        }
        return (i >> 28) == 0 ? 4 : 5;
    }

    public synchronized String decodeStr(byte[] bArr, int i, int i2) {
        char[] charBuf;
        int i3;
        int i4;
        try {
            charBuf = getCharBuf(i2);
            int i5 = i2 + i;
            i3 = 0;
            while (i < i5) {
                int i6 = i + 1;
                byte b = bArr[i];
                if (b > 0) {
                    charBuf[i3] = (char) b;
                    i3++;
                    i = i6;
                } else {
                    if (b < -32) {
                        i += 2;
                        byte b2 = bArr[i6];
                        if (b < -62 || b2 > -65) {
                            throw new IllegalArgumentException(INVALID_STRING);
                        }
                        i4 = i3 + 1;
                        charBuf[i3] = (char) ((b2 & DataType.TYPE_MASK) | ((b & 31) << 6));
                    } else {
                        if (b >= -16) {
                            byte b3 = bArr[i6];
                            int i7 = i + 3;
                            byte b4 = bArr[i + 2];
                            i += 4;
                            byte b5 = bArr[i7];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0 && b4 <= -65 && b5 <= -65) {
                                    int i8 = ((b3 & DataType.TYPE_MASK) << 12) | ((b & 7) << 18) | ((b4 & DataType.TYPE_MASK) << 6) | (b5 & DataType.TYPE_MASK);
                                    int i9 = i3 + 1;
                                    charBuf[i3] = (char) ((i8 >>> 10) + 55232);
                                    i3 += 2;
                                    charBuf[i9] = (char) ((i8 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException(INVALID_STRING);
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i6];
                        i += 3;
                        byte b7 = bArr[i10];
                        if ((b == -32 && b6 < -96) || ((b == -19 && b6 >= -96) || b6 > -65 || b7 > -65)) {
                            throw new IllegalArgumentException(INVALID_STRING);
                        }
                        i4 = i3 + 1;
                        charBuf[i3] = (char) (((b6 & DataType.TYPE_MASK) << 6) | ((b & 15) << 12) | (b7 & DataType.TYPE_MASK));
                    }
                    i3 = i4;
                }
            }
            if (i > i5) {
                throw new IllegalArgumentException(INVALID_STRING);
            }
        } finally {
        }
        return new String(charBuf, 0, i3);
    }

    public byte get() {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        this.position = i + 1;
        return bArr[i];
    }

    public byte[] getBytes(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f2561hb, this.position, bArr, 0, i);
        this.position += i;
        return bArr;
    }

    public long getChecksum(int i, int i2) {
        long j = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            j ^= getLong(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            j ^= (((long) this.f2561hb[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (j >>> (64 - i9)) | (j << i9);
    }

    public double getDouble(FastCipher fastCipher) {
        return Double.longBitsToDouble(getLong(fastCipher));
    }

    public float getFloat(FastCipher fastCipher) {
        return Float.intBitsToFloat(getInt(fastCipher));
    }

    public int getInt(int i) {
        byte[] bArr = this.f2561hb;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & 255) << 16);
    }

    public long getLong(int i) {
        byte[] bArr = this.f2561hb;
        int i2 = i + 6;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i2]) & 255) << 48) | (((long) bArr[i + 7]) << 56);
    }

    public short getShort() {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        this.position = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    public String getString(FastCipher fastCipher, int i) {
        if (fastCipher == null || i <= 0) {
            return getString(i);
        }
        byte[] bArr = this.f2561hb;
        int i2 = this.position;
        byte[] bArrDecrypt = fastCipher.decrypt(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrDecrypt == null ? null : bArrDecrypt.length > MAX_CHAR_LEN ? new String(bArrDecrypt, StandardCharsets.UTF_8) : decodeStr(bArrDecrypt, 0, bArrDecrypt.length);
        this.position += i;
        return str;
    }

    public int getVarint32() {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        byte b = bArr[i];
        if ((b >> 7) == 0) {
            return b;
        }
        int i3 = i + 2;
        this.position = i3;
        int i4 = (bArr[i2] << 7) | (b & 127);
        if ((i4 >> 14) == 0) {
            return i4;
        }
        int i5 = i + 3;
        this.position = i5;
        int i6 = (i4 & 16383) | (bArr[i3] << 14);
        if ((i6 >> 21) == 0) {
            return i6;
        }
        int i7 = i + 4;
        this.position = i7;
        int i8 = (i6 & 2097151) | (bArr[i5] << 21);
        if ((i8 >> 28) == 0) {
            return i8;
        }
        this.position = i + 5;
        return (bArr[i7] << 28) | (i8 & 268435455);
    }

    public final void put(byte b) {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        this.position = i + 1;
        bArr[i] = b;
    }

    public void putBytes(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f2561hb, this.position, length);
            this.position += length;
        }
    }

    public void putInt(int i) {
        byte[] bArr = this.f2561hb;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.position = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.position = i5;
        bArr[i4] = (byte) (i >> 16);
        this.position = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    public void putLong(int i, long j) {
        byte[] bArr = this.f2561hb;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    public void putShort(short s) {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        bArr[i] = (byte) s;
        this.position = i + 2;
        bArr[i2] = (byte) (s >> 8);
    }

    public void putString(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        encodeStr(str);
    }

    public int putVarint32(int i, int i2) {
        while ((i2 & (-128)) != 0) {
            this.f2561hb[i] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i++;
        }
        int i3 = i + 1;
        this.f2561hb[i] = (byte) i2;
        return i3;
    }

    public FastBuffer(byte[] bArr) {
        this(bArr, 0);
    }

    public int getInt() {
        byte[] bArr = this.f2561hb;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.position = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.position = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.position = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    public long getLong() {
        long j = getLong(this.position);
        this.position += 8;
        return j;
    }

    public FastBuffer(byte[] bArr, int i) {
        this.charBuf = null;
        this.f2561hb = bArr;
        this.position = i;
    }

    public int getInt(FastCipher fastCipher) {
        int i = getInt();
        return fastCipher != null ? fastCipher.decrypt(i) : i;
    }

    public void putVarint32(int i) {
        this.position = putVarint32(this.position, i);
    }

    public byte[] getBytes(FastCipher fastCipher, int i) {
        byte[] bytes = getBytes(i);
        return fastCipher != null ? fastCipher.decrypt(bytes) : bytes;
    }

    public long getLong(FastCipher fastCipher) {
        long j = getLong();
        return fastCipher != null ? fastCipher.decrypt(j) : j;
    }

    public void putInt(int i, int i2) {
        byte[] bArr = this.f2561hb;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    public String getString(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        String str = i > MAX_CHAR_LEN ? new String(this.f2561hb, this.position, i, StandardCharsets.UTF_8) : decodeStr(this.f2561hb, this.position, i);
        this.position += i;
        return str;
    }

    public void putLong(long j) {
        putLong(this.position, j);
        this.position += 8;
    }
}
