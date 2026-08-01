package p183m6;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;
import p196n6.InterfaceC5496a;

/* JADX INFO: renamed from: m6.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5042l {

    /* JADX INFO: renamed from: a */
    public char[] f15317a;

    /* JADX INFO: renamed from: b */
    public byte[] f15318b;

    /* JADX INFO: renamed from: c */
    public int f15319c;

    public C5042l(byte[] bArr, int i10) {
        this.f15317a = null;
        this.f15318b = bArr;
        this.f15319c = i10;
    }

    /* JADX INFO: renamed from: s */
    public static int m20339s(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                i11++;
            } else if (cCharAt < 2048) {
                i11 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i11 += 3;
            } else {
                i10 += 2;
                i11 += 4;
            }
            i10 = i12;
        }
        return i11;
    }

    /* JADX INFO: renamed from: u */
    public static int m20340u(int i10) {
        if ((i10 >> 7) == 0) {
            return 1;
        }
        if ((i10 >> 14) == 0) {
            return 2;
        }
        if ((i10 >> 21) == 0) {
            return 3;
        }
        return (i10 >> 28) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: A */
    public void m20341A(long j10) {
        m20369z(this.f15319c, j10);
        this.f15319c += 8;
    }

    /* JADX INFO: renamed from: B */
    public void m20342B(short s10) {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        int i11 = i10 + 1;
        this.f15319c = i11;
        bArr[i10] = (byte) s10;
        this.f15319c = i10 + 2;
        bArr[i11] = (byte) (s10 >> 8);
    }

    /* JADX INFO: renamed from: C */
    public void m20343C(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        m20347b(str);
    }

    /* JADX INFO: renamed from: D */
    public int m20344D(int i10, int i11) {
        while (true) {
            int i12 = i11 & (-128);
            byte[] bArr = this.f15318b;
            if (i12 == 0) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) i11;
                return i13;
            }
            bArr[i10] = (byte) ((i11 & 127) | 128);
            i11 >>>= 7;
            i10++;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m20345E(int i10) {
        this.f15319c = m20344D(this.f15319c, i10);
    }

    /* JADX INFO: renamed from: a */
    public synchronized String m20346a(byte[] bArr, int i10, int i11) {
        char[] cArrM20351f;
        int i12;
        int i13;
        try {
            cArrM20351f = m20351f(i11);
            int i14 = i11 + i10;
            i12 = 0;
            while (i10 < i14) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 > 0) {
                    cArrM20351f[i12] = (char) b10;
                    i12++;
                    i10 = i15;
                } else {
                    if (b10 < -32) {
                        i10 += 2;
                        byte b11 = bArr[i15];
                        if (b10 < -62 || b11 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i13 = i12 + 1;
                        cArrM20351f[i12] = (char) ((b11 & JSONB.Constants.BC_INT32_BYTE_MAX) | ((b10 & 31) << 6));
                    } else if (b10 < -16) {
                        int i16 = i10 + 2;
                        byte b12 = bArr[i15];
                        i10 += 3;
                        byte b13 = bArr[i16];
                        if ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || b12 > -65 || b13 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i13 = i12 + 1;
                        cArrM20351f[i12] = (char) (((b12 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | ((b10 & 15) << 12) | (b13 & JSONB.Constants.BC_INT32_BYTE_MAX));
                    } else {
                        byte b14 = bArr[i15];
                        int i17 = i10 + 3;
                        byte b15 = bArr[i10 + 2];
                        i10 += 4;
                        byte b16 = bArr[i17];
                        if (b14 > -65 || (((b10 << 28) + (b14 + 112)) >> 30) != 0 || b15 > -65 || b16 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i18 = ((b14 & JSONB.Constants.BC_INT32_BYTE_MAX) << 12) | ((b10 & 7) << 18) | ((b15 & JSONB.Constants.BC_INT32_BYTE_MAX) << 6) | (b16 & JSONB.Constants.BC_INT32_BYTE_MAX);
                        int i19 = i12 + 1;
                        cArrM20351f[i12] = (char) ((i18 >>> 10) + 55232);
                        i12 += 2;
                        cArrM20351f[i19] = (char) ((i18 & 1023) + 56320);
                    }
                    i12 = i13;
                }
            }
            if (i10 > i14) {
                throw new IllegalArgumentException("Invalid String");
            }
        } finally {
        }
        return new String(cArrM20351f, 0, i12);
    }

    /* JADX INFO: renamed from: b */
    public final void m20347b(String str) {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                bArr[i10] = (byte) cCharAt;
                i10++;
            } else if (cCharAt < 2048) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) ((cCharAt >>> 6) | Opcodes.CHECKCAST);
                i10 += 2;
                bArr[i13] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i10] = (byte) ((cCharAt >>> '\f') | 224);
                int i14 = i10 + 2;
                bArr[i10 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i10 += 3;
                bArr[i14] = (byte) ((cCharAt & '?') | 128);
            } else {
                i11 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                bArr[i10] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i10 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i15 = i10 + 3;
                bArr[i10 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i10 += 4;
                bArr[i15] = (byte) ((iCharAt & 63) | 128);
            }
            i11 = i12;
        }
        this.f15319c = i10;
    }

    /* JADX INFO: renamed from: c */
    public byte m20348c() {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        this.f15319c = i10 + 1;
        return bArr[i10];
    }

    /* JADX INFO: renamed from: d */
    public byte[] m20349d(int i10) {
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f15318b, this.f15319c, bArr, 0, i10);
        this.f15319c += i10;
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public byte[] m20350e(InterfaceC5496a interfaceC5496a, int i10) {
        byte[] bArrM20349d = m20349d(i10);
        return interfaceC5496a != null ? interfaceC5496a.m22344a(bArrM20349d) : bArrM20349d;
    }

    /* JADX INFO: renamed from: f */
    public final char[] m20351f(int i10) {
        char[] cArr = this.f15317a;
        if (cArr == null) {
            char[] cArr2 = i10 <= 256 ? new char[256] : new char[2048];
            this.f15317a = cArr2;
            return cArr2;
        }
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] cArr3 = new char[2048];
        this.f15317a = cArr3;
        return cArr3;
    }

    /* JADX INFO: renamed from: g */
    public long m20352g(int i10, int i11) {
        long jM20359n = 0;
        if (i11 <= 0) {
            return 0L;
        }
        int i12 = i11 >> 3;
        int i13 = i11 & 7;
        int i14 = 0;
        int i15 = i10;
        for (int i16 = 0; i16 < i12; i16++) {
            jM20359n ^= m20359n(i15);
            i15 += 8;
        }
        int i17 = i13 << 3;
        while (i14 < i17) {
            jM20359n ^= (((long) this.f15318b[i15]) & 255) << i14;
            i14 += 8;
            i15++;
        }
        int i18 = (i10 & 7) << 3;
        return (jM20359n >>> (64 - i18)) | (jM20359n << i18);
    }

    /* JADX INFO: renamed from: h */
    public double m20353h(InterfaceC5496a interfaceC5496a) {
        return Double.longBitsToDouble(m20360o(interfaceC5496a));
    }

    /* JADX INFO: renamed from: i */
    public float m20354i(InterfaceC5496a interfaceC5496a) {
        return Float.intBitsToFloat(m20357l(interfaceC5496a));
    }

    /* JADX INFO: renamed from: j */
    public int m20355j() {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        int i11 = i10 + 1;
        this.f15319c = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f15319c = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f15319c = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f15319c = i10 + 4;
        return (bArr[i15] << 24) | i16;
    }

    /* JADX INFO: renamed from: k */
    public int m20356k(int i10) {
        byte[] bArr = this.f15318b;
        int i11 = ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
        return (bArr[i10 + 3] << 24) | i11 | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: l */
    public int m20357l(InterfaceC5496a interfaceC5496a) {
        int iM20355j = m20355j();
        return interfaceC5496a != null ? interfaceC5496a.m22345b(iM20355j) : iM20355j;
    }

    /* JADX INFO: renamed from: m */
    public long m20358m() {
        long jM20359n = m20359n(this.f15319c);
        this.f15319c += 8;
        return jM20359n;
    }

    /* JADX INFO: renamed from: n */
    public long m20359n(int i10) {
        byte[] bArr = this.f15318b;
        int i11 = i10 + 6;
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i11]) & 255) << 48) | (((long) bArr[i10 + 7]) << 56);
    }

    /* JADX INFO: renamed from: o */
    public long m20360o(InterfaceC5496a interfaceC5496a) {
        long jM20358m = m20358m();
        return interfaceC5496a != null ? interfaceC5496a.m22346c(jM20358m) : jM20358m;
    }

    /* JADX INFO: renamed from: p */
    public short m20361p() {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        int i11 = i10 + 1;
        this.f15319c = i11;
        int i12 = bArr[i10] & 255;
        this.f15319c = i10 + 2;
        return (short) ((bArr[i11] << 8) | i12);
    }

    /* JADX INFO: renamed from: q */
    public String m20362q(int i10) {
        if (i10 < 0) {
            return null;
        }
        if (i10 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        byte[] bArr = this.f15318b;
        String str = i10 > 2048 ? new String(bArr, this.f15319c, i10, StandardCharsets.UTF_8) : m20346a(bArr, this.f15319c, i10);
        this.f15319c += i10;
        return str;
    }

    /* JADX INFO: renamed from: r */
    public String m20363r(InterfaceC5496a interfaceC5496a, int i10) {
        if (interfaceC5496a == null || i10 <= 0) {
            return m20362q(i10);
        }
        byte[] bArr = this.f15318b;
        int i11 = this.f15319c;
        byte[] bArrM22344a = interfaceC5496a.m22344a(Arrays.copyOfRange(bArr, i11, i11 + i10));
        String str = bArrM22344a == null ? null : bArrM22344a.length > 2048 ? new String(bArrM22344a, StandardCharsets.UTF_8) : m20346a(bArrM22344a, 0, bArrM22344a.length);
        this.f15319c += i10;
        return str;
    }

    /* JADX INFO: renamed from: t */
    public int m20364t() {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        int i11 = i10 + 1;
        this.f15319c = i11;
        byte b10 = bArr[i10];
        if ((b10 >> 7) == 0) {
            return b10;
        }
        int i12 = b10 & JSONB.Constants.BC_SYMBOL;
        int i13 = i10 + 2;
        this.f15319c = i13;
        int i14 = (bArr[i11] << 7) | i12;
        if ((i14 >> 14) == 0) {
            return i14;
        }
        int i15 = i10 + 3;
        this.f15319c = i15;
        int i16 = (i14 & 16383) | (bArr[i13] << 14);
        if ((i16 >> 21) == 0) {
            return i16;
        }
        int i17 = i10 + 4;
        this.f15319c = i17;
        int i18 = (i16 & 2097151) | (bArr[i15] << 21);
        if ((i18 >> 28) == 0) {
            return i18;
        }
        this.f15319c = i10 + 5;
        return (bArr[i17] << 28) | (i18 & 268435455);
    }

    /* JADX INFO: renamed from: v */
    public final void m20365v(byte b10) {
        byte[] bArr = this.f15318b;
        int i10 = this.f15319c;
        this.f15319c = i10 + 1;
        bArr[i10] = b10;
    }

    /* JADX INFO: renamed from: w */
    public void m20366w(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f15318b, this.f15319c, length);
            this.f15319c += length;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m20367x(int i10) {
        byte[] bArr = this.f15318b;
        int i11 = this.f15319c;
        int i12 = i11 + 1;
        this.f15319c = i12;
        bArr[i11] = (byte) i10;
        int i13 = i11 + 2;
        this.f15319c = i13;
        bArr[i12] = (byte) (i10 >> 8);
        int i14 = i11 + 3;
        this.f15319c = i14;
        bArr[i13] = (byte) (i10 >> 16);
        this.f15319c = i11 + 4;
        bArr[i14] = (byte) (i10 >> 24);
    }

    /* JADX INFO: renamed from: y */
    public void m20368y(int i10, int i11) {
        byte[] bArr = this.f15318b;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
    }

    /* JADX INFO: renamed from: z */
    public void m20369z(int i10, long j10) {
        byte[] bArr = this.f15318b;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
    }

    public C5042l(byte[] bArr) {
        this(bArr, 0);
    }

    public C5042l(int i10) {
        this(new byte[i10], 0);
    }
}
