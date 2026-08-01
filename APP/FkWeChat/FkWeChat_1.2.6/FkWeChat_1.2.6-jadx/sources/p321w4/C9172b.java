package p321w4;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: w4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9172b {

    /* JADX INFO: renamed from: a */
    public byte[] f31255a;

    /* JADX INFO: renamed from: b */
    public int f31256b;

    public C9172b() {
        this.f31255a = new byte[64];
    }

    /* JADX INFO: renamed from: a */
    public final C9172b m35619a(String str, int i10, int i11) {
        int length = str.length();
        int i12 = i10;
        int i13 = i12;
        while (i12 < length) {
            char cCharAt = str.charAt(i12);
            i13 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i13 + 2 : i13 + 3 : i13 + 1;
            i12++;
        }
        if (i13 > i11) {
            throw new IllegalArgumentException();
        }
        int i14 = this.f31256b;
        int i15 = i14 - i10;
        int i16 = i15 - 2;
        if (i16 >= 0) {
            byte[] bArr = this.f31255a;
            bArr[i16] = (byte) (i13 >>> 8);
            bArr[i15 - 1] = (byte) i13;
        }
        if ((i14 + i13) - i10 > this.f31255a.length) {
            m35620b(i13 - i10);
        }
        int i17 = this.f31256b;
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 1 || cCharAt2 > 127) {
                byte[] bArr2 = this.f31255a;
                if (cCharAt2 <= 2047) {
                    int i18 = i17 + 1;
                    bArr2[i17] = (byte) (((cCharAt2 >> 6) & 31) | Opcodes.CHECKCAST);
                    i17 += 2;
                    bArr2[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    bArr2[i17] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                    int i19 = i17 + 2;
                    bArr2[i17 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                    i17 += 3;
                    bArr2[i19] = (byte) ((cCharAt2 & '?') | 128);
                }
            } else {
                this.f31255a[i17] = (byte) cCharAt2;
                i17++;
            }
            i10++;
        }
        this.f31256b = i17;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m35620b(int i10) {
        byte[] bArr = this.f31255a;
        int length = bArr.length * 2;
        int i11 = this.f31256b;
        int i12 = i10 + i11;
        if (length <= i12) {
            length = i12;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        this.f31255a = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public final C9172b m35621c(int i10, int i11) {
        int i12 = this.f31256b;
        if (i12 + 2 > this.f31255a.length) {
            m35620b(2);
        }
        byte[] bArr = this.f31255a;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) i11;
        this.f31256b = i12 + 2;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C9172b m35622d(int i10, int i11) {
        int i12 = this.f31256b;
        if (i12 + 3 > this.f31255a.length) {
            m35620b(3);
        }
        byte[] bArr = this.f31255a;
        bArr[i12] = (byte) i10;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
        this.f31256b = i12 + 3;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C9172b m35623e(int i10, int i11, int i12) {
        int i13 = this.f31256b;
        if (i13 + 5 > this.f31255a.length) {
            m35620b(5);
        }
        byte[] bArr = this.f31255a;
        bArr[i13] = (byte) i10;
        bArr[i13 + 1] = (byte) (i11 >>> 8);
        bArr[i13 + 2] = (byte) i11;
        bArr[i13 + 3] = (byte) (i12 >>> 8);
        bArr[i13 + 4] = (byte) i12;
        this.f31256b = i13 + 5;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C9172b m35624f(int i10) {
        int i11 = this.f31256b;
        int i12 = i11 + 1;
        if (i12 > this.f31255a.length) {
            m35620b(1);
        }
        this.f31255a[i11] = (byte) i10;
        this.f31256b = i12;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C9172b m35625g(byte[] bArr, int i10, int i11) {
        if (this.f31256b + i11 > this.f31255a.length) {
            m35620b(i11);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i10, this.f31255a, this.f31256b, i11);
        }
        this.f31256b += i11;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C9172b m35626h(int i10) {
        int i11 = this.f31256b;
        if (i11 + 4 > this.f31255a.length) {
            m35620b(4);
        }
        byte[] bArr = this.f31255a;
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
        this.f31256b = i11 + 4;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C9172b m35627i(long j10) {
        int i10 = this.f31256b;
        if (i10 + 8 > this.f31255a.length) {
            m35620b(8);
        }
        byte[] bArr = this.f31255a;
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
        this.f31256b = i10 + 8;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C9172b m35628j(int i10) {
        int i11 = this.f31256b;
        if (i11 + 2 > this.f31255a.length) {
            m35620b(2);
        }
        byte[] bArr = this.f31255a;
        bArr[i11] = (byte) (i10 >>> 8);
        bArr[i11 + 1] = (byte) i10;
        this.f31256b = i11 + 2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public C9172b m35629k(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f31256b;
        if (i10 + 2 + length > this.f31255a.length) {
            m35620b(length + 2);
        }
        byte[] bArr = this.f31255a;
        int i11 = i10 + 1;
        bArr[i10] = (byte) (length >>> 8);
        int i12 = i10 + 2;
        bArr[i11] = (byte) length;
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < 1 || cCharAt > 127) {
                this.f31256b = i12;
                return m35619a(str, i13, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
            i12++;
        }
        this.f31256b = i12;
        return this;
    }

    public C9172b(int i10) {
        this.f31255a = new byte[i10];
    }
}
