package p000;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: fn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209fn implements InterfaceC0549on, InterfaceC0504nn, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: h */
    public mm2 f3067h;

    /* JADX INFO: renamed from: i */
    public long f3068i;

    /* JADX INFO: renamed from: A */
    public final mm2 m1666A(int i) {
        if (i < 1 || i > 8192) {
            C0676s.m4651j("unexpected capacity");
            return null;
        }
        mm2 mm2Var = this.f3067h;
        if (mm2Var == null) {
            mm2 mm2VarM3884b = pm2.m3884b();
            this.f3067h = mm2VarM3884b;
            mm2VarM3884b.f6727g = mm2VarM3884b;
            mm2VarM3884b.f6726f = mm2VarM3884b;
            return mm2VarM3884b;
        }
        mm2 mm2Var2 = mm2Var.f6727g;
        mm2Var2.getClass();
        if (mm2Var2.f6723c + i <= 8192 && mm2Var2.f6725e) {
            return mm2Var2;
        }
        mm2 mm2VarM3884b2 = pm2.m3884b();
        mm2Var2.m3134b(mm2VarM3884b2);
        return mm2VarM3884b2;
    }

    /* JADX INFO: renamed from: B */
    public final void m1667B(C0505no c0505no) {
        c0505no.getClass();
        c0505no.mo3332k(this, c0505no.mo3322a());
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: C */
    public final InputStream mo1668C() {
        return new C0136dn(this, 0);
    }

    /* JADX INFO: renamed from: D */
    public final void m1669D(ht2 ht2Var) {
        while (ht2Var.mo891n(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1670E(int i) {
        mm2 mm2VarM1666A = m1666A(1);
        byte[] bArr = mm2VarM1666A.f6721a;
        int i2 = mm2VarM1666A.f6723c;
        mm2VarM1666A.f6723c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f3068i++;
    }

    /* JADX INFO: renamed from: F */
    public final void m1671F(long j) {
        boolean z;
        if (j == 0) {
            m1670E(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m1675J("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = AbstractC0148e.f2273a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > AbstractC0148e.f2274b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        mm2 mm2VarM1666A = m1666A(i);
        byte[] bArr2 = mm2VarM1666A.f6721a;
        int i2 = mm2VarM1666A.f6723c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = AbstractC0148e.f2273a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        mm2VarM1666A.f6723c += i;
        this.f3068i += (long) i;
    }

    /* JADX INFO: renamed from: G */
    public final void m1672G(long j) {
        if (j == 0) {
            m1670E(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        mm2 mm2VarM1666A = m1666A(i);
        byte[] bArr = mm2VarM1666A.f6721a;
        int i2 = mm2VarM1666A.f6723c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0148e.f2273a[(int) (15 & j)];
            j >>>= 4;
        }
        mm2VarM1666A.f6723c += i;
        this.f3068i += (long) i;
    }

    /* JADX INFO: renamed from: H */
    public final void m1673H(int i) {
        mm2 mm2VarM1666A = m1666A(4);
        byte[] bArr = mm2VarM1666A.f6721a;
        int i2 = mm2VarM1666A.f6723c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        mm2VarM1666A.f6723c = i2 + 4;
        this.f3068i += 4;
    }

    /* JADX INFO: renamed from: I */
    public final void m1674I(int i) {
        mm2 mm2VarM1666A = m1666A(2);
        byte[] bArr = mm2VarM1666A.f6721a;
        int i2 = mm2VarM1666A.f6723c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        mm2VarM1666A.f6723c = i2 + 2;
        this.f3068i += 2;
    }

    /* JADX INFO: renamed from: J */
    public final void m1675J(String str) {
        str.getClass();
        m1676K(str, 0, str.length());
    }

    /* JADX INFO: renamed from: K */
    public final void m1676K(String str, int i, int i2) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            C0676s.m4645c(vi0.m5688g("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            C0676s.m4645c(vi0.m5689h("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbM5695n = vi0.m5695n(i2, "endIndex > string.length: ", " > ");
            sbM5695n.append(str.length());
            throw new IllegalArgumentException(sbM5695n.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                mm2 mm2VarM1666A = m1666A(1);
                byte[] bArr = mm2VarM1666A.f6721a;
                int i3 = mm2VarM1666A.f6723c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = mm2VarM1666A.f6723c;
                int i6 = (i3 + i) - i5;
                mm2VarM1666A.f6723c = i5 + i6;
                this.f3068i += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mm2 mm2VarM1666A2 = m1666A(2);
                    byte[] bArr2 = mm2VarM1666A2.f6721a;
                    int i7 = mm2VarM1666A2.f6723c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    mm2VarM1666A2.f6723c = i7 + 2;
                    this.f3068i += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mm2 mm2VarM1666A3 = m1666A(3);
                    byte[] bArr3 = mm2VarM1666A3.f6721a;
                    int i8 = mm2VarM1666A3.f6723c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    mm2VarM1666A3.f6723c = i8 + 3;
                    this.f3068i += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m1670E(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        mm2 mm2VarM1666A4 = m1666A(4);
                        byte[] bArr4 = mm2VarM1666A4.f6721a;
                        int i11 = mm2VarM1666A4.f6723c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        mm2VarM1666A4.f6723c = i11 + 4;
                        this.f3068i += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m1677L(int i) {
        if (i < 128) {
            m1670E(i);
            return;
        }
        if (i < 2048) {
            mm2 mm2VarM1666A = m1666A(2);
            byte[] bArr = mm2VarM1666A.f6721a;
            int i2 = mm2VarM1666A.f6723c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            mm2VarM1666A.f6723c = i2 + 2;
            this.f3068i += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m1670E(63);
            return;
        }
        if (i < 65536) {
            mm2 mm2VarM1666A2 = m1666A(3);
            byte[] bArr2 = mm2VarM1666A2.f6721a;
            int i3 = mm2VarM1666A2.f6723c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            mm2VarM1666A2.f6723c = i3 + 3;
            this.f3068i += 3;
            return;
        }
        if (i > 1114111) {
            C0676s.m4651j("Unexpected code point: 0x".concat(qp0.m4239U(i)));
            return;
        }
        mm2 mm2VarM1666A3 = m1666A(4);
        byte[] bArr3 = mm2VarM1666A3.f6721a;
        int i4 = mm2VarM1666A3.f6723c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        mm2VarM1666A3.f6723c = i4 + 4;
        this.f3068i += 4;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: a */
    public final o23 mo889a() {
        return o23.f7455d;
    }

    public final Object clone() {
        C0209fn c0209fn = new C0209fn();
        if (this.f3068i == 0) {
            return c0209fn;
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        mm2 mm2VarM3135c = mm2Var.m3135c();
        c0209fn.f3067h = mm2VarM3135c;
        mm2VarM3135c.f6727g = mm2VarM3135c;
        mm2VarM3135c.f6726f = mm2VarM3135c;
        for (mm2 mm2Var2 = mm2Var.f6726f; mm2Var2 != mm2Var; mm2Var2 = mm2Var2.f6726f) {
            mm2 mm2Var3 = mm2VarM3135c.f6727g;
            mm2Var3.getClass();
            mm2Var2.getClass();
            mm2Var3.m3134b(mm2Var2.m3135c());
        }
        c0209fn.f3068i = this.f3068i;
        return c0209fn;
    }

    @Override // p000.fr2
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0209fn c0209fn, long j) {
        mm2 mm2VarM3884b;
        c0209fn.getClass();
        if (c0209fn == this) {
            C0676s.m4651j("source == this");
            return;
        }
        qp0.m4258m(c0209fn.f3068i, 0L, j);
        while (j > 0) {
            mm2 mm2Var = c0209fn.f3067h;
            mm2Var.getClass();
            int i = mm2Var.f6723c;
            mm2 mm2Var2 = c0209fn.f3067h;
            mm2Var2.getClass();
            long j2 = i - mm2Var2.f6722b;
            int i2 = 0;
            if (j < j2) {
                mm2 mm2Var3 = this.f3067h;
                mm2 mm2Var4 = mm2Var3 != null ? mm2Var3.f6727g : null;
                if (mm2Var4 != null && mm2Var4.f6725e) {
                    if ((((long) mm2Var4.f6723c) + j) - ((long) (mm2Var4.f6724d ? 0 : mm2Var4.f6722b)) <= 8192) {
                        mm2 mm2Var5 = c0209fn.f3067h;
                        mm2Var5.getClass();
                        mm2Var5.m3136d(mm2Var4, (int) j);
                        c0209fn.f3068i -= j;
                        this.f3068i += j;
                        return;
                    }
                }
                mm2 mm2Var6 = c0209fn.f3067h;
                mm2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > mm2Var6.f6723c - mm2Var6.f6722b) {
                    C0676s.m4651j("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    mm2VarM3884b = mm2Var6.m3135c();
                } else {
                    mm2VarM3884b = pm2.m3884b();
                    byte[] bArr = mm2Var6.f6721a;
                    byte[] bArr2 = mm2VarM3884b.f6721a;
                    int i4 = mm2Var6.f6722b;
                    AbstractC0460mg.m3089d0(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                mm2VarM3884b.f6723c = mm2VarM3884b.f6722b + i3;
                mm2Var6.f6722b += i3;
                mm2 mm2Var7 = mm2Var6.f6727g;
                mm2Var7.getClass();
                mm2Var7.m3134b(mm2VarM3884b);
                c0209fn.f3067h = mm2VarM3884b;
            }
            mm2 mm2Var8 = c0209fn.f3067h;
            mm2Var8.getClass();
            long j3 = mm2Var8.f6723c - mm2Var8.f6722b;
            c0209fn.f3067h = mm2Var8.m3133a();
            mm2 mm2Var9 = this.f3067h;
            if (mm2Var9 == null) {
                this.f3067h = mm2Var8;
                mm2Var8.f6727g = mm2Var8;
                mm2Var8.f6726f = mm2Var8;
            } else {
                mm2 mm2Var10 = mm2Var9.f6727g;
                mm2Var10.getClass();
                mm2Var10.m3134b(mm2Var8);
                mm2 mm2Var11 = mm2Var8.f6727g;
                if (mm2Var11 == mm2Var8) {
                    C0676s.m4653l("cannot compact");
                    return;
                }
                mm2Var11.getClass();
                if (mm2Var11.f6725e) {
                    int i5 = mm2Var8.f6723c - mm2Var8.f6722b;
                    mm2 mm2Var12 = mm2Var8.f6727g;
                    mm2Var12.getClass();
                    int i6 = 8192 - mm2Var12.f6723c;
                    mm2 mm2Var13 = mm2Var8.f6727g;
                    mm2Var13.getClass();
                    if (!mm2Var13.f6724d) {
                        mm2 mm2Var14 = mm2Var8.f6727g;
                        mm2Var14.getClass();
                        i2 = mm2Var14.f6722b;
                    }
                    if (i5 <= i6 + i2) {
                        mm2 mm2Var15 = mm2Var8.f6727g;
                        mm2Var15.getClass();
                        mm2Var8.m3136d(mm2Var15, i5);
                        mm2Var8.m3133a();
                        pm2.m3883a(mm2Var8);
                    }
                }
            }
            c0209fn.f3068i -= j3;
            this.f3068i += j3;
            j -= j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0209fn)) {
            return false;
        }
        long j = this.f3068i;
        C0209fn c0209fn = (C0209fn) obj;
        if (j != c0209fn.f3068i) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        mm2 mm2Var2 = c0209fn.f3067h;
        mm2Var2.getClass();
        int i = mm2Var.f6722b;
        int i2 = mm2Var2.f6722b;
        long j2 = 0;
        while (j2 < this.f3068i) {
            long jMin = Math.min(mm2Var.f6723c - i, mm2Var2.f6723c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (mm2Var.f6721a[i] != mm2Var2.f6721a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == mm2Var.f6723c) {
                mm2Var = mm2Var.f6726f;
                mm2Var.getClass();
                i = mm2Var.f6722b;
            }
            if (i2 == mm2Var2.f6723c) {
                mm2Var2 = mm2Var2.f6726f;
                mm2Var2.getClass();
                i2 = mm2Var2.f6722b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: f */
    public final C0505no mo1678f(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0676s.m4647f("byteCount: ", j);
            return null;
        }
        if (this.f3068i < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C0505no(m1688q(j));
        }
        C0505no c0505noM1693v = m1693v((int) j);
        skip(j);
        return c0505noM1693v;
    }

    /* JADX INFO: renamed from: g */
    public final void m1679g() throws EOFException {
        skip(this.f3068i);
    }

    /* JADX INFO: renamed from: h */
    public final long m1680h() {
        long j = this.f3068i;
        if (j == 0) {
            return 0L;
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        mm2 mm2Var2 = mm2Var.f6727g;
        mm2Var2.getClass();
        int i = mm2Var2.f6723c;
        return (i >= 8192 || !mm2Var2.f6725e) ? j : j - ((long) (i - mm2Var2.f6722b));
    }

    public final int hashCode() {
        mm2 mm2Var = this.f3067h;
        if (mm2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = mm2Var.f6723c;
            for (int i3 = mm2Var.f6722b; i3 < i2; i3++) {
                i = (i * 31) + mm2Var.f6721a[i3];
            }
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
        } while (mm2Var != this.f3067h);
        return i;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: i */
    public final long mo1681i(C0209fn c0209fn) {
        long j = this.f3068i;
        if (j > 0) {
            c0209fn.mo1175d(this, j);
        }
        return j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m1682j(C0209fn c0209fn, long j, long j2) {
        c0209fn.getClass();
        long j3 = j;
        qp0.m4258m(this.f3068i, j3, j2);
        if (j2 == 0) {
            return;
        }
        c0209fn.f3068i += j2;
        mm2 mm2Var = this.f3067h;
        while (true) {
            mm2Var.getClass();
            long j4 = mm2Var.f6723c - mm2Var.f6722b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            mm2Var = mm2Var.f6726f;
        }
        long j5 = j2;
        while (j5 > 0) {
            mm2Var.getClass();
            mm2 mm2VarM3135c = mm2Var.m3135c();
            int i = mm2VarM3135c.f6722b + ((int) j3);
            mm2VarM3135c.f6722b = i;
            mm2VarM3135c.f6723c = Math.min(i + ((int) j5), mm2VarM3135c.f6723c);
            mm2 mm2Var2 = c0209fn.f3067h;
            if (mm2Var2 == null) {
                mm2VarM3135c.f6727g = mm2VarM3135c;
                mm2VarM3135c.f6726f = mm2VarM3135c;
                c0209fn.f3067h = mm2VarM3135c;
            } else {
                mm2 mm2Var3 = mm2Var2.f6727g;
                mm2Var3.getClass();
                mm2Var3.m3134b(mm2VarM3135c);
            }
            j5 -= (long) (mm2VarM3135c.f6723c - mm2VarM3135c.f6722b);
            mm2Var = mm2Var.f6726f;
            j3 = 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1683k() {
        return this.f3068i == 0;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: m */
    public final int mo1685m(nv1 nv1Var) throws EOFException {
        nv1Var.getClass();
        int iM1212b = AbstractC0148e.m1212b(this, nv1Var, false);
        if (iM1212b == -1) {
            return -1;
        }
        skip(nv1Var.f7344h[iM1212b].mo3322a());
        return iM1212b;
    }

    @Override // p000.ht2
    /* JADX INFO: renamed from: n */
    public final long mo891n(C0209fn c0209fn, long j) {
        c0209fn.getClass();
        if (j < 0) {
            C0676s.m4647f("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.f3068i;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0209fn.mo1175d(this, j);
        return j;
    }

    /* JADX INFO: renamed from: o */
    public final byte m1686o(long j) {
        qp0.m4258m(this.f3068i, j, 1L);
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        long j2 = this.f3068i;
        if (j2 - j < j) {
            while (j2 > j) {
                mm2Var = mm2Var.f6727g;
                mm2Var.getClass();
                j2 -= (long) (mm2Var.f6723c - mm2Var.f6722b);
            }
            return mm2Var.f6721a[(int) ((((long) mm2Var.f6722b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = mm2Var.f6723c;
            int i2 = mm2Var.f6722b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return mm2Var.f6721a[(int) ((((long) i2) + j) - j3)];
            }
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
            j3 = j4;
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m1687p(byte b, long j, long j2) {
        mm2 mm2Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f3068i + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f3068i;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (mm2Var = this.f3067h) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                mm2Var = mm2Var.f6727g;
                mm2Var.getClass();
                j4 -= (long) (mm2Var.f6723c - mm2Var.f6722b);
            }
            while (j4 < j2) {
                byte[] bArr = mm2Var.f6721a;
                int iMin = (int) Math.min(mm2Var.f6723c, (((long) mm2Var.f6722b) + j2) - j4);
                for (int i = (int) ((((long) mm2Var.f6722b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - mm2Var.f6722b)) + j4;
                    }
                }
                j4 += (long) (mm2Var.f6723c - mm2Var.f6722b);
                mm2Var = mm2Var.f6726f;
                mm2Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (mm2Var.f6723c - mm2Var.f6722b)) + j3;
            if (j5 > j) {
                break;
            }
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = mm2Var.f6721a;
            int iMin2 = (int) Math.min(mm2Var.f6723c, (((long) mm2Var.f6722b) + j2) - j3);
            for (int i2 = (int) ((((long) mm2Var.f6722b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - mm2Var.f6722b)) + j3;
                }
            }
            j3 += (long) (mm2Var.f6723c - mm2Var.f6722b);
            mm2Var = mm2Var.f6726f;
            mm2Var.getClass();
            j = j3;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: q */
    public final byte[] m1688q(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C0676s.m4647f("byteCount: ", j);
            return null;
        }
        if (this.f3068i < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m1689r() throws EOFException {
        int i;
        if (this.f3068i == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            mm2 mm2Var = this.f3067h;
            mm2Var.getClass();
            byte[] bArr = mm2Var.f6721a;
            int i3 = mm2Var.f6722b;
            int i4 = mm2Var.f6723c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = AbstractC0570p7.f7992a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f3067h = mm2Var.m3133a();
                        pm2.m3883a(mm2Var);
                    } else {
                        mm2Var.f6722b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C0209fn c0209fn = new C0209fn();
                    c0209fn.m1672G(j);
                    c0209fn.m1670E(b);
                    throw new NumberFormatException("Number too large: ".concat(c0209fn.m1692u()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f3067h != null);
        this.f3068i -= (long) i2;
        return j;
    }

    public final int read(byte[] bArr, int i, int i2) {
        qp0.m4258m(bArr.length, i, i2);
        mm2 mm2Var = this.f3067h;
        if (mm2Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, mm2Var.f6723c - mm2Var.f6722b);
        byte[] bArr2 = mm2Var.f6721a;
        int i3 = mm2Var.f6722b;
        AbstractC0460mg.m3085Z(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = mm2Var.f6722b + iMin;
        mm2Var.f6722b = i4;
        this.f3068i -= (long) iMin;
        if (i4 == mm2Var.f6723c) {
            this.f3067h = mm2Var.m3133a();
            pm2.m3883a(mm2Var);
        }
        return iMin;
    }

    @Override // p000.InterfaceC0549on
    public final byte readByte() {
        if (this.f3068i == 0) {
            throw new EOFException();
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        int i = mm2Var.f6722b;
        int i2 = mm2Var.f6723c;
        int i3 = i + 1;
        byte b = mm2Var.f6721a[i];
        this.f3068i--;
        if (i3 != i2) {
            mm2Var.f6722b = i3;
            return b;
        }
        this.f3067h = mm2Var.m3133a();
        pm2.m3883a(mm2Var);
        return b;
    }

    @Override // p000.InterfaceC0549on
    public final int readInt() throws EOFException {
        if (this.f3068i < 4) {
            throw new EOFException();
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        int i = mm2Var.f6722b;
        int i2 = mm2Var.f6723c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = mm2Var.f6721a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f3068i -= 4;
        if (i5 != i2) {
            mm2Var.f6722b = i5;
            return i6;
        }
        this.f3067h = mm2Var.m3133a();
        pm2.m3883a(mm2Var);
        return i6;
    }

    @Override // p000.InterfaceC0549on
    public final short readShort() throws EOFException {
        if (this.f3068i < 2) {
            throw new EOFException();
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        int i = mm2Var.f6722b;
        int i2 = mm2Var.f6723c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = mm2Var.f6721a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f3068i -= 2;
        if (i5 == i2) {
            this.f3067h = mm2Var.m3133a();
            pm2.m3883a(mm2Var);
        } else {
            mm2Var.f6722b = i5;
        }
        return (short) i6;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: s */
    public final String mo1690s(long j) throws EOFException {
        if (j < 0) {
            C0676s.m4647f("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM1687p = m1687p((byte) 10, 0L, j2);
        if (jM1687p != -1) {
            return AbstractC0148e.m1211a(this, jM1687p);
        }
        if (j2 < this.f3068i && m1686o(j2 - 1) == 13 && m1686o(j2) == 10) {
            return AbstractC0148e.m1211a(this, j2);
        }
        C0209fn c0209fn = new C0209fn();
        m1682j(c0209fn, 0L, Math.min(32L, this.f3068i));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f3068i, j) + " content=" + c0209fn.mo1678f(c0209fn.f3068i).mo3323b() + (char) 8230);
    }

    @Override // p000.InterfaceC0549on
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            mm2 mm2Var = this.f3067h;
            if (mm2Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, mm2Var.f6723c - mm2Var.f6722b);
            long j2 = iMin;
            this.f3068i -= j2;
            j -= j2;
            int i = mm2Var.f6722b + iMin;
            mm2Var.f6722b = i;
            if (i == mm2Var.f6723c) {
                this.f3067h = mm2Var.m3133a();
                pm2.m3883a(mm2Var);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final String m1691t(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            C0676s.m4647f("byteCount: ", j);
            return null;
        }
        if (this.f3068i < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        mm2 mm2Var = this.f3067h;
        mm2Var.getClass();
        int i = mm2Var.f6722b;
        if (((long) i) + j > mm2Var.f6723c) {
            return new String(m1688q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(mm2Var.f6721a, i, i2, charset);
        int i3 = mm2Var.f6722b + i2;
        mm2Var.f6722b = i3;
        this.f3068i -= j;
        if (i3 == mm2Var.f6723c) {
            this.f3067h = mm2Var.m3133a();
            pm2.m3883a(mm2Var);
        }
        return str;
    }

    public final String toString() {
        long j = this.f3068i;
        if (j <= 2147483647L) {
            return m1693v((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3068i).toString());
    }

    /* JADX INFO: renamed from: u */
    public final String m1692u() {
        return m1691t(this.f3068i, AbstractC0856wq.f12612a);
    }

    /* JADX INFO: renamed from: v */
    public final C0505no m1693v(int i) {
        if (i == 0) {
            return C0505no.f7266k;
        }
        qp0.m4258m(this.f3068i, 0L, i);
        mm2 mm2Var = this.f3067h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            mm2Var.getClass();
            int i5 = mm2Var.f6723c;
            int i6 = mm2Var.f6722b;
            if (i5 == i6) {
                C0676s.m4650i("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            mm2Var = mm2Var.f6726f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        mm2 mm2Var2 = this.f3067h;
        int i7 = 0;
        while (i2 < i) {
            mm2Var2.getClass();
            bArr[i7] = mm2Var2.f6721a;
            i2 += mm2Var2.f6723c - mm2Var2.f6722b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = mm2Var2.f6722b;
            mm2Var2.f6724d = true;
            i7++;
            mm2Var2 = mm2Var2.f6726f;
        }
        return new qm2(bArr, iArr);
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: w */
    public final /* bridge */ /* synthetic */ InterfaceC0504nn mo1694w(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        qp0.m4258m(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            mm2 mm2VarM1666A = m1666A(1);
            int iMin = Math.min(i3 - i, 8192 - mm2VarM1666A.f6723c);
            int i4 = i + iMin;
            AbstractC0460mg.m3085Z(bArr, mm2VarM1666A.f6721a, mm2VarM1666A.f6723c, i, i4);
            mm2VarM1666A.f6723c += iMin;
            i = i4;
        }
        this.f3068i += j;
    }

    @Override // p000.InterfaceC0504nn
    public final /* bridge */ /* synthetic */ InterfaceC0504nn writeByte(int i) {
        m1670E(i);
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final /* bridge */ /* synthetic */ InterfaceC0504nn writeInt(int i) {
        m1673H(i);
        return this;
    }

    @Override // p000.InterfaceC0504nn
    public final /* bridge */ /* synthetic */ InterfaceC0504nn writeShort(int i) {
        m1674I(i);
        return this;
    }

    @Override // p000.InterfaceC0549on
    /* JADX INFO: renamed from: x */
    public final void mo1695x(long j) throws EOFException {
        if (this.f3068i < j) {
            throw new EOFException();
        }
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: y */
    public final /* bridge */ /* synthetic */ InterfaceC0504nn mo1696y(String str) {
        m1675J(str);
        return this;
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: z */
    public final /* bridge */ /* synthetic */ InterfaceC0504nn mo1697z(C0505no c0505no) {
        m1667B(c0505no);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.fr2
    public final void close() {
    }

    @Override // p000.InterfaceC0504nn, p000.fr2, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.InterfaceC0504nn
    /* JADX INFO: renamed from: l */
    public final C0209fn mo1684l() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            mm2 mm2VarM1666A = m1666A(1);
            int iMin = Math.min(i, 8192 - mm2VarM1666A.f6723c);
            byteBuffer.get(mm2VarM1666A.f6721a, mm2VarM1666A.f6723c, iMin);
            i -= iMin;
            mm2VarM1666A.f6723c += iMin;
        }
        this.f3068i += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        mm2 mm2Var = this.f3067h;
        if (mm2Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mm2Var.f6723c - mm2Var.f6722b);
        byteBuffer.put(mm2Var.f6721a, mm2Var.f6722b, iMin);
        int i = mm2Var.f6722b + iMin;
        mm2Var.f6722b = i;
        this.f3068i -= (long) iMin;
        if (i == mm2Var.f6723c) {
            this.f3067h = mm2Var.m3133a();
            pm2.m3883a(mm2Var);
        }
        return iMin;
    }

    @Override // p000.InterfaceC0504nn
    public final InterfaceC0504nn write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}
