package defpackage;

import android.view.MotionEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 implements a22 {
    public final /* synthetic */ int h;
    public int i;
    public Object j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[LOOP:1: B:27:0x00bf->B:33:0x00e1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e9(c11 c11Var, s81 s81Var) {
        Object u50Var;
        this.h = 5;
        e9 e9Var = s81Var.a;
        int i = c11Var.h;
        if (i < 0) {
            nz0.c("negative nearestRange.first");
        }
        int iMin = Math.min(c11Var.i, e9Var.i - 1);
        if (iMin < i) {
            gk1 gk1Var = hs1.a;
            gk1Var.getClass();
            this.j = gk1Var;
            this.k = new Object[0];
            this.i = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.k = new Object[i2];
        this.i = i;
        gk1 gk1Var2 = new gk1(i2);
        zk1 zk1Var = (zk1) e9Var.j;
        if (i < 0 || i >= e9Var.i) {
            StringBuilder sbN = vi0.n(i, "Index ", ", size ");
            sbN.append(e9Var.i);
            nz0.e(sbN.toString());
        }
        if (iMin < 0 || iMin >= e9Var.i) {
            StringBuilder sbN2 = vi0.n(iMin, "Index ", ", size ");
            sbN2.append(e9Var.i);
            nz0.e(sbN2.toString());
        }
        if (iMin < i) {
            nz0.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iJ = t11.j(i, zk1Var);
        int i3 = ((l11) zk1Var.h[iJ]).a;
        while (i3 <= iMin) {
            l11 l11Var = (l11) zk1Var.h[iJ];
            in0 in0Var = (in0) l11Var.c.i;
            int i4 = l11Var.a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (l11Var.b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (in0Var == null) {
                        u50Var = new u50(iMax);
                        gk1Var2.g(iMax, u50Var);
                        ((Object[]) this.k)[iMax - this.i] = u50Var;
                        iMax = iMax == iMin2 ? iMax + 1 : iMax;
                    } else {
                        u50Var = in0Var.j(Integer.valueOf(iMax - i4));
                        if (u50Var == null) {
                        }
                        gk1Var2.g(iMax, u50Var);
                        ((Object[]) this.k)[iMax - this.i] = u50Var;
                        if (iMax == iMin2) {
                            break;
                        }
                    }
                }
            }
            i3 += l11Var.b;
            iJ++;
        }
        this.j = gk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a22
    public boolean a(Object obj) {
        boolean z;
        obj.getClass();
        synchronized (this.k) {
            try {
                Object[] objArr = (Object[]) this.j;
                int i = this.i;
                z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    if (objArr[i2] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                }
                int i3 = this.i;
                if (i3 < objArr.length) {
                    objArr[i3] = obj;
                    z = true;
                    this.i = i3 + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i, b5 b5Var) {
        if (i < 0) {
            nz0.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        l11 l11Var = new l11(this.i, i, b5Var);
        this.i += i;
        ((zk1) this.j).b(l11Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a22
    public Object c() {
        Object obj;
        synchronized (this.k) {
            Object[] objArr = (Object[]) this.j;
            int i = this.i;
            obj = null;
            if (i > 0) {
                int i2 = i - 1;
                Object obj2 = objArr[i2];
                obj2.getClass();
                objArr[i2] = null;
                this.i--;
                obj = obj2;
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized String d(byte[] bArr, int i, int i2) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.j;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[256] : new char[2048];
                this.j = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.j = cArr;
            }
            int i5 = i2 + i;
            i3 = 0;
            while (i < i5) {
                int i6 = i + 1;
                byte b = bArr[i];
                if (b > 0) {
                    cArr[i3] = (char) b;
                    i3++;
                    i = i6;
                } else {
                    if (b < -32) {
                        i += 2;
                        byte b2 = bArr[i6];
                        if (b < -62 || b2 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) ((b2 & 63) | ((b & 31) << 6));
                    } else {
                        if (b >= -16) {
                            byte b3 = bArr[i6];
                            int i7 = i + 3;
                            byte b4 = bArr[i + 2];
                            i += 4;
                            byte b5 = bArr[i7];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0 && b4 <= -65 && b5 <= -65) {
                                    int i8 = ((b3 & 63) << 12) | ((b & 7) << 18) | ((b4 & 63) << 6) | (b5 & 63);
                                    int i9 = i3 + 1;
                                    cArr[i3] = (char) ((i8 >>> 10) + 55232);
                                    i3 += 2;
                                    cArr[i9] = (char) ((i8 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i6];
                        i += 3;
                        byte b7 = bArr[i10];
                        if ((b == -32 && b6 < -96) || ((b == -19 && b6 >= -96) || b6 > -65 || b7 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) (((b6 & 63) << 6) | ((b & 15) << 12) | (b7 & 63));
                    }
                    i3 = i4;
                }
            }
            if (i > i5) {
                throw new IllegalArgumentException("Invalid String");
            }
        } finally {
        }
        return new String(cArr, 0, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l11 e(int i) {
        if (i < 0 || i >= this.i) {
            StringBuilder sbN = vi0.n(i, "Index ", ", size ");
            sbN.append(this.i);
            nz0.e(sbN.toString());
        }
        l11 l11Var = (l11) this.k;
        if (l11Var != null) {
            int i2 = l11Var.a;
            if (i < l11Var.b + i2 && i2 <= i) {
                return l11Var;
            }
        }
        zk1 zk1Var = (zk1) this.j;
        l11 l11Var2 = (l11) zk1Var.h[t11.j(i, zk1Var)];
        this.k = l11Var2;
        return l11Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long f(int i, int i2) {
        long jI = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jI ^= i(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jI ^= (((long) ((byte[]) this.k)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jI << i9) | (jI >>> (64 - i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g(Object obj) {
        gk1 gk1Var = (gk1) this.j;
        int iD = gk1Var.d(obj);
        if (iD >= 0) {
            return gk1Var.c[iD];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int h() {
        byte[] bArr = (byte[]) this.k;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.i = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.i = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.i = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long i(int i) {
        byte[] bArr = (byte[]) this.k;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public short j() {
        byte[] bArr = (byte[]) this.k;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        int i3 = bArr[i] & 255;
        this.i = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String k(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        byte[] bArr = (byte[]) this.k;
        String str = i > 2048 ? new String(bArr, this.i, i, StandardCharsets.UTF_8) : d(bArr, this.i, i);
        this.i += i;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.j;
        int i8 = this.i;
        int i9 = i8 + 3;
        this.i = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.j = Arrays.copyOf(jArr, iMax);
            this.k = Arrays.copyOf((long[]) this.k, iMax);
        }
        long[] jArr2 = (long[]) this.j;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = p62.b;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.k, this.i, length);
            this.i += length;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p(int i) {
        byte[] bArr = (byte[]) this.k;
        int i2 = this.i;
        int i3 = i2 + 1;
        this.i = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.i = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.i = i5;
        bArr[i4] = (byte) (i >> 16);
        this.i = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(int i, int i2) {
        byte[] bArr = (byte[]) this.k;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(long j, int i) {
        byte[] bArr = (byte[]) this.k;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.k;
        int i = this.i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
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
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.j;
        int i3 = this.i;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.h) {
            case 9:
                StringBuilder sb = new StringBuilder();
                if (((c42) this.j) == c42.j) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.i);
                sb.append(' ');
                sb.append((String) this.k);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.j;
        long[] jArr2 = (long[]) this.k;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.i : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = p62.b;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(int i, on0 on0Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.j;
        int i3 = this.i;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                on0Var.o(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e9(int i, int i2) {
        this(0, new byte[i]);
        this.h = i2;
        switch (i2) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (i > 0) {
                    this.j = new Object[i];
                    this.k = new Object();
                    return;
                } else {
                    s.j("The max pool size must be > 0");
                    throw null;
                }
            default:
                return;
        }
    }

    public e9(int i, byte[] bArr) {
        this.h = 3;
        this.j = null;
        this.k = bArr;
        this.i = i;
    }

    public e9(c42 c42Var, int i, String str) {
        this.h = 9;
        this.j = c42Var;
        this.i = i;
        this.k = str;
    }

    public e9(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.h = 0;
        this.j = arrayList;
        this.i = i;
        this.k = motionEvent;
        if (arrayList.isEmpty()) {
            s.j("changes cannot be empty");
            throw null;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ds2.<clinit>():void] */
    public /* synthetic */ e9(byte b, int i) {
        this.h = i;
    }

    public e9() {
        this.h = 4;
        this.j = new zk1(new l11[16]);
    }

    public e9(za3 za3Var) {
        this.h = 1;
        this.j = za3Var;
    }

    public e9(af0 af0Var) {
        this.h = 2;
        this.k = s11.o0(150, new n4(17, this));
        this.j = af0Var;
    }
}
