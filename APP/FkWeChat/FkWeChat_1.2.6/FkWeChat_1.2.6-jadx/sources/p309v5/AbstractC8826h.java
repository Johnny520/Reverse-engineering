package p309v5;

import okhttp3.internal.url._UrlKt;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8826h {
    /* JADX INFO: renamed from: a */
    public static String m33892a(byte[] bArr, int i10, int i11, int i12, int i13, int i14) {
        int i15 = i10 + i11;
        if ((i10 | i11 | i15) < 0 || i15 > bArr.length) {
            C8825g.m33891a("arr.length ", bArr.length, "; ", i10, "..!", i15);
            return null;
        }
        if (i12 < 0) {
            C9987e.m38645a("outOffset < 0");
            return null;
        }
        if (i11 == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 4) + 6);
        int i16 = 0;
        while (i11 > 0) {
            if (i16 == 0) {
                sb2.append(i14 != 2 ? i14 != 4 ? i14 != 6 ? m33901j(i12) : m33900i(i12) : m33898g(i12) : m33897f(i12));
                sb2.append(": ");
            } else if ((i16 & 1) == 0) {
                sb2.append(' ');
            }
            sb2.append(m33897f(bArr[i10]));
            i12++;
            i10++;
            i16++;
            if (i16 == i13) {
                sb2.append('\n');
                i16 = 0;
            }
            i11--;
        }
        if (i16 != 0) {
            sb2.append('\n');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m33893b(int i10) {
        char[] cArr = new char[3];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 2; i11++) {
            cArr[2 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    public static String m33894c(int i10) {
        char[] cArr = new char[5];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[4 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: d */
    public static String m33895d(int i10) {
        char[] cArr = new char[9];
        if (i10 < 0) {
            cArr[0] = '-';
            i10 = -i10;
        } else {
            cArr[0] = '+';
        }
        for (int i11 = 0; i11 < 8; i11++) {
            cArr[8 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: e */
    public static String m33896e(long j10) {
        char[] cArr = new char[17];
        if (j10 < 0) {
            cArr[0] = '-';
            j10 = -j10;
        } else {
            cArr[0] = '+';
        }
        for (int i10 = 0; i10 < 16; i10++) {
            cArr[16 - i10] = Character.forDigit(((int) j10) & 15, 16);
            j10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: f */
    public static String m33897f(int i10) {
        char[] cArr = new char[2];
        for (int i11 = 0; i11 < 2; i11++) {
            cArr[1 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: g */
    public static String m33898g(int i10) {
        char[] cArr = new char[4];
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[3 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: h */
    public static String m33899h(int i10) {
        return i10 == ((char) i10) ? m33898g(i10) : m33901j(i10);
    }

    /* JADX INFO: renamed from: i */
    public static String m33900i(int i10) {
        char[] cArr = new char[6];
        for (int i11 = 0; i11 < 6; i11++) {
            cArr[5 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: j */
    public static String m33901j(int i10) {
        char[] cArr = new char[8];
        for (int i11 = 0; i11 < 8; i11++) {
            cArr[7 - i11] = Character.forDigit(i10 & 15, 16);
            i10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: k */
    public static String m33902k(long j10) {
        char[] cArr = new char[16];
        for (int i10 = 0; i10 < 16; i10++) {
            cArr[15 - i10] = Character.forDigit(((int) j10) & 15, 16);
            j10 >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: l */
    public static String m33903l(int i10) {
        return new String(new char[]{Character.forDigit(i10 & 15, 16)});
    }
}
