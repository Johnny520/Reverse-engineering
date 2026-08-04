package yyds;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0372 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f1897;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f1898;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public int f1899;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f1900;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f1901;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1902;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int[] f1903;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int[] f1904;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final byte[] f1905;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int[] f1906;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f1907;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f1908;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f1909;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f1910;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f1911;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int[] f1912;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f1913;

    public C0372(int i, byte[] bArr) {
        this.f1902 = i;
        int i2 = 0;
        switch (i) {
            case 1:
                AbstractC2328.m4341(-1726061029786478L);
                int length = bArr.length;
                int[] iArr = new int[length];
                while (i2 < length) {
                    iArr[i2] = bArr[i2] & 255;
                    i2++;
                }
                this.f1904 = iArr;
                this.f1910 = Math.max(2, 8);
                this.f1912 = new int[5003];
                this.f1906 = new int[5003];
                this.f1903 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
                this.f1905 = new byte[256];
                break;
            default:
                AbstractC2328.m4341(-1721400990270318L);
                int length2 = bArr.length;
                int[] iArr2 = new int[length2];
                while (i2 < length2) {
                    iArr2[i2] = bArr[i2] & 255;
                    i2++;
                }
                this.f1904 = iArr2;
                this.f1910 = Math.max(2, 8);
                this.f1912 = new int[5003];
                this.f1906 = new int[5003];
                this.f1903 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
                this.f1905 = new byte[256];
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1071(int i, BufferedOutputStream bufferedOutputStream) throws IOException {
        int i2 = this.f1902;
        int[] iArr = this.f1903;
        byte[] bArr = this.f1905;
        switch (i2) {
            case 0:
                int i3 = this.f1899;
                int i4 = this.f1897;
                int i5 = i3 & iArr[i4];
                this.f1899 = i5;
                this.f1899 = i4 > 0 ? i5 | (i << i4) : i;
                this.f1897 = i4 + this.f1913;
                while (this.f1897 >= 8) {
                    byte b = (byte) (this.f1899 & 255);
                    int i6 = this.f1911;
                    int i7 = i6 + 1;
                    this.f1911 = i7;
                    bArr[i6] = b;
                    if (i7 >= 254 && i7 > 0) {
                        bufferedOutputStream.write(i7);
                        bufferedOutputStream.write(bArr, 0, this.f1911);
                        this.f1911 = 0;
                    }
                    this.f1899 >>= 8;
                    this.f1897 -= 8;
                }
                if (this.f1898 > this.f1901 || this.f1900) {
                    if (this.f1900) {
                        int i8 = this.f1909;
                        this.f1913 = i8;
                        this.f1901 = (1 << i8) - 1;
                        this.f1900 = false;
                    } else {
                        int i9 = this.f1913 + 1;
                        this.f1913 = i9;
                        this.f1901 = i9 != 12 ? (1 << i9) - 1 : 4096;
                    }
                }
                if (i == this.f1908) {
                    while (this.f1897 > 0) {
                        byte b2 = (byte) (this.f1899 & 255);
                        int i10 = this.f1911;
                        int i11 = i10 + 1;
                        this.f1911 = i11;
                        bArr[i10] = b2;
                        if (i11 >= 254 && i11 > 0) {
                            bufferedOutputStream.write(i11);
                            bufferedOutputStream.write(bArr, 0, this.f1911);
                            this.f1911 = 0;
                        }
                        this.f1899 >>= 8;
                        this.f1897 -= 8;
                    }
                    int i12 = this.f1911;
                    if (i12 > 0) {
                        bufferedOutputStream.write(i12);
                        bufferedOutputStream.write(bArr, 0, this.f1911);
                        this.f1911 = 0;
                    }
                }
                break;
            default:
                int i13 = this.f1899;
                int i14 = this.f1897;
                int i15 = i13 & iArr[i14];
                this.f1899 = i15;
                this.f1899 = i14 > 0 ? i15 | (i << i14) : i;
                this.f1897 = i14 + this.f1913;
                while (this.f1897 >= 8) {
                    byte b3 = (byte) (this.f1899 & 255);
                    int i16 = this.f1911;
                    int i17 = i16 + 1;
                    this.f1911 = i17;
                    bArr[i16] = b3;
                    if (i17 >= 254 && i17 > 0) {
                        bufferedOutputStream.write(i17);
                        bufferedOutputStream.write(bArr, 0, this.f1911);
                        this.f1911 = 0;
                    }
                    this.f1899 >>= 8;
                    this.f1897 -= 8;
                }
                if (this.f1898 > this.f1901 || this.f1900) {
                    if (this.f1900) {
                        int i18 = this.f1909;
                        this.f1913 = i18;
                        this.f1901 = (1 << i18) - 1;
                        this.f1900 = false;
                    } else {
                        int i19 = this.f1913 + 1;
                        this.f1913 = i19;
                        this.f1901 = i19 != 12 ? (1 << i19) - 1 : 4096;
                    }
                }
                if (i == this.f1908) {
                    while (this.f1897 > 0) {
                        byte b4 = (byte) (this.f1899 & 255);
                        int i20 = this.f1911;
                        int i21 = i20 + 1;
                        this.f1911 = i21;
                        bArr[i20] = b4;
                        if (i21 >= 254 && i21 > 0) {
                            bufferedOutputStream.write(i21);
                            bufferedOutputStream.write(bArr, 0, this.f1911);
                            this.f1911 = 0;
                        }
                        this.f1899 >>= 8;
                        this.f1897 -= 8;
                    }
                    int i22 = this.f1911;
                    if (i22 > 0) {
                        bufferedOutputStream.write(i22);
                        bufferedOutputStream.write(bArr, 0, this.f1911);
                        this.f1911 = 0;
                    }
                }
                break;
        }
    }
}
