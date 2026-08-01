package com.esotericsoftware.asm;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: loaded from: classes.dex */
public class ByteVector {

    /* JADX INFO: renamed from: a */
    byte[] f107a;

    /* JADX INFO: renamed from: b */
    int f108b;

    public ByteVector() {
        this.f107a = new byte[64];
    }

    /* JADX INFO: renamed from: a */
    public ByteVector m41a(int i, int i2) {
        int i3 = this.f108b;
        if (i3 + 2 > this.f107a.length) {
            m40a(2);
        }
        byte[] bArr = this.f107a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) i2;
        this.f108b = i3 + 2;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public ByteVector m42b(int i, int i2) {
        int i3 = this.f108b;
        if (i3 + 3 > this.f107a.length) {
            m40a(3);
        }
        byte[] bArr = this.f107a;
        bArr[i3] = (byte) i;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) i2;
        this.f108b = i3 + 3;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ByteVector m43c(String str, int i, int i2) {
        int length = str.length();
        int i3 = i;
        int i4 = i3;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            i4 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            i3++;
        }
        if (i4 > i2) {
            C6755.m11865();
            return null;
        }
        int i5 = this.f108b;
        int i6 = i5 - i;
        int i7 = i6 - 2;
        if (i7 >= 0) {
            byte[] bArr = this.f107a;
            bArr[i7] = (byte) (i4 >>> 8);
            bArr[i6 - 1] = (byte) i4;
        }
        if ((i5 + i4) - i > this.f107a.length) {
            m40a(i4 - i);
        }
        int i8 = this.f108b;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                byte[] bArr2 = this.f107a;
                int i9 = i8 + 1;
                if (cCharAt2 > 2047) {
                    bArr2[i8] = (byte) (((cCharAt2 >> '\f') & 15) | com.android.p002dx.p005io.Opcodes.SHL_INT_LIT8);
                    int i10 = i8 + 2;
                    bArr2[i9] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i8 += 3;
                    bArr2[i10] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    bArr2[i8] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                    i8 += 2;
                    bArr2[i9] = (byte) ((cCharAt2 & '?') | 128);
                }
            } else {
                this.f107a[i8] = (byte) cCharAt2;
                i8++;
            }
            i++;
        }
        this.f108b = i8;
        return this;
    }

    public ByteVector putByte(int i) {
        int i2 = this.f108b;
        int i3 = i2 + 1;
        if (i3 > this.f107a.length) {
            m40a(1);
        }
        this.f107a[i2] = (byte) i;
        this.f108b = i3;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i, int i2) {
        if (this.f108b + i2 > this.f107a.length) {
            m40a(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f107a, this.f108b, i2);
        }
        this.f108b += i2;
        return this;
    }

    public ByteVector putInt(int i) {
        int i2 = this.f108b;
        if (i2 + 4 > this.f107a.length) {
            m40a(4);
        }
        byte[] bArr = this.f107a;
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
        this.f108b = i2 + 4;
        return this;
    }

    public ByteVector putLong(long j) {
        int i = this.f108b;
        if (i + 8 > this.f107a.length) {
            m40a(8);
        }
        byte[] bArr = this.f107a;
        int i2 = (int) (j >>> 32);
        bArr[i] = (byte) (i2 >>> 24);
        bArr[i + 1] = (byte) (i2 >>> 16);
        bArr[i + 2] = (byte) (i2 >>> 8);
        bArr[i + 3] = (byte) i2;
        int i3 = (int) j;
        bArr[i + 4] = (byte) (i3 >>> 24);
        bArr[i + 5] = (byte) (i3 >>> 16);
        bArr[i + 6] = (byte) (i3 >>> 8);
        bArr[i + 7] = (byte) i3;
        this.f108b = i + 8;
        return this;
    }

    public ByteVector putShort(int i) {
        int i2 = this.f108b;
        if (i2 + 2 > this.f107a.length) {
            m40a(2);
        }
        byte[] bArr = this.f107a;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
        this.f108b = i2 + 2;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            C6755.m11865();
            return null;
        }
        int i = this.f108b;
        if (i + 2 + length > this.f107a.length) {
            m40a(length + 2);
        }
        byte[] bArr = this.f107a;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i + 2;
        bArr[i2] = (byte) length;
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                this.f108b = i3;
                return m43c(str, i4, com.android.p002dx.p005io.Opcodes.MAX_VALUE);
            }
            bArr[i3] = (byte) cCharAt;
            i4++;
            i3++;
        }
        this.f108b = i3;
        return this;
    }

    public ByteVector(int i) {
        this.f107a = new byte[i];
    }

    /* JADX INFO: renamed from: a */
    private void m40a(int i) {
        byte[] bArr = this.f107a;
        int length = bArr.length * 2;
        int i2 = this.f108b;
        int i3 = i + i2;
        if (length <= i3) {
            length = i3;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f107a = bArr2;
    }
}
