package com.alibaba.fastjson2.internal.asm;

import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ByteVector {
    byte[] data;
    int length;

    public ByteVector(int i10) {
        this.data = new byte[i10];
    }

    private void enlarge(int i10) {
        byte[] bArr = new byte[Math.max(this.data.length * 2, this.length + i10)];
        System.arraycopy(this.data, 0, bArr, 0, this.length);
        this.data = bArr;
    }

    public final void encodeUtf8(String str, int i10) {
        int length = str.length();
        int i11 = i10;
        int i12 = i11;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            i12 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i12 + 2 : i12 + 3 : i12 + 1;
            i11++;
        }
        if (i12 > 65535) {
            C9987e.m38645a("UTF8 string too large");
            return;
        }
        int i13 = this.length;
        int i14 = i13 - i10;
        int i15 = i14 - 2;
        if (i15 >= 0) {
            byte[] bArr = this.data;
            bArr[i15] = (byte) (i12 >>> 8);
            bArr[i14 - 1] = (byte) i12;
        }
        if ((i13 + i12) - i10 > this.data.length) {
            enlarge(i12 - i10);
        }
        int i16 = this.length;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
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
            i10++;
        }
        this.length = i16;
    }

    public final void put11(int i10, int i11) {
        int i12 = this.length;
        if (i12 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) i11;
        this.length = i12 + 2;
    }

    public final ByteVector put12(int i10, int i11) {
        int i12 = this.length;
        if (i12 + 3 > this.data.length) {
            enlarge(3);
        }
        byte[] bArr = this.data;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
        this.length = i12 + 3;
        return this;
    }

    public final void put122(int i10, int i11, int i12) {
        int i13 = this.length;
        if (i13 + 5 > this.data.length) {
            enlarge(5);
        }
        byte[] bArr = this.data;
        bArr[i13] = (byte) i10;
        bArr[i13 + 1] = (byte) (i11 >>> 8);
        bArr[i13 + 2] = (byte) i11;
        bArr[i13 + 3] = (byte) (i12 >>> 8);
        bArr[i13 + 4] = (byte) i12;
        this.length = i13 + 5;
    }

    public ByteVector putByte(int i10) {
        int i11 = this.length;
        int i12 = i11 + 1;
        if (i12 > this.data.length) {
            enlarge(1);
        }
        this.data[i11] = (byte) i10;
        this.length = i12;
        return this;
    }

    public void putByteArray(byte[] bArr, int i10, int i11) {
        if (this.length + i11 > this.data.length) {
            enlarge(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.data, this.length, i11);
        }
        this.length += i11;
    }

    public ByteVector putInt(int i10) {
        int i11 = this.length;
        if (i11 + 4 > this.data.length) {
            enlarge(4);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.length = i11 + 4;
        return this;
    }

    public void putLong(long j10) {
        int i10 = this.length;
        if (i10 + 8 > this.data.length) {
            enlarge(8);
        }
        byte[] bArr = this.data;
        int i11 = (int) (j10 >>> 32);
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
        int i12 = (int) j10;
        bArr[i10 + 4] = (byte) (i12 >>> 24);
        bArr[i10 + 5] = (byte) (i12 >>> 16);
        bArr[i10 + 6] = (byte) (i12 >>> 8);
        bArr[i10 + 7] = (byte) i12;
        this.length = i10 + 8;
    }

    public ByteVector putShort(int i10) {
        int i11 = this.length;
        if (i11 + 2 > this.data.length) {
            enlarge(2);
        }
        byte[] bArr = this.data;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        this.length = i11 + 2;
        return this;
    }

    public void putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            C9987e.m38645a("UTF8 string too large");
            return;
        }
        int i10 = this.length;
        if (i10 + 2 + length > this.data.length) {
            enlarge(length + 2);
        }
        byte[] bArr = this.data;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (length >>> 8);
        int i12 = i10 + 2;
        bArr[i11] = (byte) length;
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < 1 || cCharAt > 127) {
                this.length = i12;
                encodeUtf8(str, i13);
                return;
            } else {
                bArr[i12] = (byte) cCharAt;
                i13++;
                i12++;
            }
        }
        this.length = i12;
    }
}
