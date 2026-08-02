package p000;

import android.view.MotionEvent;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0158e9 implements a22 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2351h;

    /* JADX INFO: renamed from: i */
    public int f2352i;

    /* JADX INFO: renamed from: j */
    public Object f2353j;

    /* JADX INFO: renamed from: k */
    public Object f2354k;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[LOOP:1: B:27:0x00bf->B:33:0x00e1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0158e9(c11 c11Var, s81 s81Var) {
        Object u50Var;
        this.f2351h = 5;
        C0158e9 c0158e9 = s81Var.f9976a;
        int i = c11Var.f25h;
        if (i < 0) {
            nz0.m3458c("negative nearestRange.first");
        }
        int iMin = Math.min(c11Var.f26i, c0158e9.f2352i - 1);
        if (iMin < i) {
            gk1 gk1Var = hs1.f4124a;
            gk1Var.getClass();
            this.f2353j = gk1Var;
            this.f2354k = new Object[0];
            this.f2352i = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f2354k = new Object[i2];
        this.f2352i = i;
        gk1 gk1Var2 = new gk1(i2);
        zk1 zk1Var = (zk1) c0158e9.f2353j;
        if (i < 0 || i >= c0158e9.f2352i) {
            StringBuilder sbM5695n = vi0.m5695n(i, "Index ", ", size ");
            sbM5695n.append(c0158e9.f2352i);
            nz0.m3460e(sbM5695n.toString());
        }
        if (iMin < 0 || iMin >= c0158e9.f2352i) {
            StringBuilder sbM5695n2 = vi0.m5695n(iMin, "Index ", ", size ");
            sbM5695n2.append(c0158e9.f2352i);
            nz0.m3460e(sbM5695n2.toString());
        }
        if (iMin < i) {
            nz0.m3456a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iM5084j = t11.m5084j(i, zk1Var);
        int i3 = ((l11) zk1Var.f13934h[iM5084j]).f5878a;
        while (i3 <= iMin) {
            l11 l11Var = (l11) zk1Var.f13934h[iM5084j];
            in0 in0Var = (in0) l11Var.f5880c.f562i;
            int i4 = l11Var.f5878a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (l11Var.f5879b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (in0Var == null) {
                        u50Var = new u50(iMax);
                        gk1Var2.m1936g(iMax, u50Var);
                        ((Object[]) this.f2354k)[iMax - this.f2352i] = u50Var;
                        iMax = iMax == iMin2 ? iMax + 1 : iMax;
                    } else {
                        u50Var = in0Var.mo5j(Integer.valueOf(iMax - i4));
                        if (u50Var == null) {
                        }
                        gk1Var2.m1936g(iMax, u50Var);
                        ((Object[]) this.f2354k)[iMax - this.f2352i] = u50Var;
                        if (iMax == iMin2) {
                            break;
                        }
                    }
                }
            }
            i3 += l11Var.f5879b;
            iM5084j++;
        }
        this.f2353j = gk1Var2;
    }

    /* JADX INFO: renamed from: l */
    public static int m1294l(String str) {
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

    @Override // p000.a22
    /* JADX INFO: renamed from: a */
    public boolean mo18a(Object obj) {
        boolean z;
        obj.getClass();
        synchronized (this.f2354k) {
            try {
                Object[] objArr = (Object[]) this.f2353j;
                int i = this.f2352i;
                z = false;
                for (int i2 = 0; i2 < i; i2++) {
                    if (objArr[i2] == obj) {
                        throw new IllegalStateException("Already in the pool!");
                    }
                }
                int i3 = this.f2352i;
                if (i3 < objArr.length) {
                    objArr[i3] = obj;
                    z = true;
                    this.f2352i = i3 + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void m1296b(int i, C0043b5 c0043b5) {
        if (i < 0) {
            nz0.m3456a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        l11 l11Var = new l11(this.f2352i, i, c0043b5);
        this.f2352i += i;
        ((zk1) this.f2353j).m6423b(l11Var);
    }

    @Override // p000.a22
    /* JADX INFO: renamed from: c */
    public Object mo19c() {
        Object obj;
        synchronized (this.f2354k) {
            Object[] objArr = (Object[]) this.f2353j;
            int i = this.f2352i;
            obj = null;
            if (i > 0) {
                int i2 = i - 1;
                Object obj2 = objArr[i2];
                obj2.getClass();
                objArr[i2] = null;
                this.f2352i--;
                obj = obj2;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m1297d(byte[] bArr, int i, int i2) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f2353j;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[256] : new char[2048];
                this.f2353j = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f2353j = cArr;
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

    /* JADX INFO: renamed from: e */
    public l11 m1298e(int i) {
        if (i < 0 || i >= this.f2352i) {
            StringBuilder sbM5695n = vi0.m5695n(i, "Index ", ", size ");
            sbM5695n.append(this.f2352i);
            nz0.m3460e(sbM5695n.toString());
        }
        l11 l11Var = (l11) this.f2354k;
        if (l11Var != null) {
            int i2 = l11Var.f5878a;
            if (i < l11Var.f5879b + i2 && i2 <= i) {
                return l11Var;
            }
        }
        zk1 zk1Var = (zk1) this.f2353j;
        l11 l11Var2 = (l11) zk1Var.f13934h[t11.m5084j(i, zk1Var)];
        this.f2354k = l11Var2;
        return l11Var2;
    }

    /* JADX INFO: renamed from: f */
    public long m1299f(int i, int i2) {
        long jM1302i = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM1302i ^= m1302i(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM1302i ^= (((long) ((byte[]) this.f2354k)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM1302i << i9) | (jM1302i >>> (64 - i9));
    }

    /* JADX INFO: renamed from: g */
    public int m1300g(Object obj) {
        gk1 gk1Var = (gk1) this.f2353j;
        int iM1933d = gk1Var.m1933d(obj);
        if (iM1933d >= 0) {
            return gk1Var.f3554c[iM1933d];
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public int m1301h() {
        byte[] bArr = (byte[]) this.f2354k;
        int i = this.f2352i;
        int i2 = i + 1;
        this.f2352i = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f2352i = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f2352i = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f2352i = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX INFO: renamed from: i */
    public long m1302i(int i) {
        byte[] bArr = (byte[]) this.f2354k;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: j */
    public short m1303j() {
        byte[] bArr = (byte[]) this.f2354k;
        int i = this.f2352i;
        int i2 = i + 1;
        this.f2352i = i2;
        int i3 = bArr[i] & 255;
        this.f2352i = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: k */
    public String m1304k(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        byte[] bArr = (byte[]) this.f2354k;
        String str = i > 2048 ? new String(bArr, this.f2352i, i, StandardCharsets.UTF_8) : m1297d(bArr, this.f2352i, i);
        this.f2352i += i;
        return str;
    }

    /* JADX INFO: renamed from: m */
    public void m1305m(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f2353j;
        int i8 = this.f2352i;
        int i9 = i8 + 3;
        this.f2352i = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f2353j = Arrays.copyOf(jArr, iMax);
            this.f2354k = Arrays.copyOf((long[]) this.f2354k, iMax);
        }
        long[] jArr2 = (long[]) this.f2353j;
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
                int i14 = p62.f7990b;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1306o(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f2354k, this.f2352i, length);
            this.f2352i += length;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1307p(int i) {
        byte[] bArr = (byte[]) this.f2354k;
        int i2 = this.f2352i;
        int i3 = i2 + 1;
        this.f2352i = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f2352i = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f2352i = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f2352i = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: q */
    public void m1308q(int i, int i2) {
        byte[] bArr = (byte[]) this.f2354k;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: r */
    public void m1309r(long j, int i) {
        byte[] bArr = (byte[]) this.f2354k;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: s */
    public void m1310s(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f2354k;
        int i = this.f2352i;
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
        this.f2352i = i;
    }

    /* JADX INFO: renamed from: t */
    public void m1311t(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f2353j;
        int i3 = this.f2352i;
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

    public String toString() {
        switch (this.f2351h) {
            case 9:
                StringBuilder sb = new StringBuilder();
                if (((c42) this.f2353j) == c42.f1137j) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f2352i);
                sb.append(' ');
                sb.append((String) this.f2354k);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1312u(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f2353j;
        long[] jArr2 = (long[]) this.f2354k;
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
            int i9 = i8 == 1023 ? this.f2352i : (i8 * 3) + i7;
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
                        int i12 = p62.f7990b;
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

    /* JADX INFO: renamed from: v */
    public void m1313v(int i, on0 on0Var) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f2353j;
        int i3 = this.f2352i;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                on0Var.mo171o(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0158e9(int i, int i2) {
        this(0, new byte[i]);
        this.f2351h = i2;
        switch (i2) {
            case AIChatConfig.DefaultContextRounds /* 6 */:
                if (i > 0) {
                    this.f2353j = new Object[i];
                    this.f2354k = new Object();
                    return;
                } else {
                    C0676s.m4651j("The max pool size must be > 0");
                    throw null;
                }
            default:
                return;
        }
    }

    public C0158e9(int i, byte[] bArr) {
        this.f2351h = 3;
        this.f2353j = null;
        this.f2354k = bArr;
        this.f2352i = i;
    }

    public C0158e9(c42 c42Var, int i, String str) {
        this.f2351h = 9;
        this.f2353j = c42Var;
        this.f2352i = i;
        this.f2354k = str;
    }

    public C0158e9(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f2351h = 0;
        this.f2353j = arrayList;
        this.f2352i = i;
        this.f2354k = motionEvent;
        if (arrayList.isEmpty()) {
            C0676s.m4651j("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ C0158e9(byte b, int i) {
        this.f2351h = i;
    }

    public C0158e9() {
        this.f2351h = 4;
        this.f2353j = new zk1(new l11[16]);
    }

    public C0158e9(za3 za3Var) {
        this.f2351h = 1;
        this.f2353j = za3Var;
    }

    public C0158e9(af0 af0Var) {
        this.f2351h = 2;
        this.f2354k = s11.m4711o0(150, new C0485n4(17, this));
        this.f2353j = af0Var;
    }
}
