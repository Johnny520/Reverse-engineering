package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fn implements on, nn, Cloneable, ByteChannel {
    public mm2 h;
    public long i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mm2 A(int i) {
        if (i < 1 || i > 8192) {
            s.j("unexpected capacity");
            return null;
        }
        mm2 mm2Var = this.h;
        if (mm2Var == null) {
            mm2 mm2VarB = pm2.b();
            this.h = mm2VarB;
            mm2VarB.g = mm2VarB;
            mm2VarB.f = mm2VarB;
            return mm2VarB;
        }
        mm2 mm2Var2 = mm2Var.g;
        mm2Var2.getClass();
        if (mm2Var2.c + i <= 8192 && mm2Var2.e) {
            return mm2Var2;
        }
        mm2 mm2VarB2 = pm2.b();
        mm2Var2.b(mm2VarB2);
        return mm2VarB2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(no noVar) {
        noVar.getClass();
        noVar.k(this, noVar.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final InputStream C() {
        return new dn(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(ht2 ht2Var) {
        while (ht2Var.n(this, 8192L) != -1) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(int i) {
        mm2 mm2VarA = A(1);
        byte[] bArr = mm2VarA.a;
        int i2 = mm2VarA.c;
        mm2VarA.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(long j) {
        boolean z;
        if (j == 0) {
            E(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                J("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = e.a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i = iNumberOfLeadingZeros + (j > e.b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i++;
        }
        mm2 mm2VarA = A(i);
        byte[] bArr2 = mm2VarA.a;
        int i2 = mm2VarA.c + i;
        while (j != 0) {
            i2--;
            bArr2[i2] = e.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i2 - 1] = 45;
        }
        mm2VarA.c += i;
        this.i += (long) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(long j) {
        if (j == 0) {
            E(48);
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
        mm2 mm2VarA = A(i);
        byte[] bArr = mm2VarA.a;
        int i2 = mm2VarA.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = e.a[(int) (15 & j)];
            j >>>= 4;
        }
        mm2VarA.c += i;
        this.i += (long) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(int i) {
        mm2 mm2VarA = A(4);
        byte[] bArr = mm2VarA.a;
        int i2 = mm2VarA.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        mm2VarA.c = i2 + 4;
        this.i += 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(int i) {
        mm2 mm2VarA = A(2);
        byte[] bArr = mm2VarA.a;
        int i2 = mm2VarA.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        mm2VarA.c = i2 + 2;
        this.i += 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(String str) {
        str.getClass();
        K(str, 0, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(String str, int i, int i2) {
        char cCharAt;
        str.getClass();
        if (i < 0) {
            s.c(vi0.g("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            s.c(vi0.h("endIndex < beginIndex: ", i2, " < ", i));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbN = vi0.n(i2, "endIndex > string.length: ", " > ");
            sbN.append(str.length());
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                mm2 mm2VarA = A(1);
                byte[] bArr = mm2VarA.a;
                int i3 = mm2VarA.c - i;
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
                int i5 = mm2VarA.c;
                int i6 = (i3 + i) - i5;
                mm2VarA.c = i5 + i6;
                this.i += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    mm2 mm2VarA2 = A(2);
                    byte[] bArr2 = mm2VarA2.a;
                    int i7 = mm2VarA2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    mm2VarA2.c = i7 + 2;
                    this.i += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    mm2 mm2VarA3 = A(3);
                    byte[] bArr3 = mm2VarA3.a;
                    int i8 = mm2VarA3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    mm2VarA3.c = i8 + 3;
                    this.i += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        E(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        mm2 mm2VarA4 = A(4);
                        byte[] bArr4 = mm2VarA4.a;
                        int i11 = mm2VarA4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        mm2VarA4.c = i11 + 4;
                        this.i += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(int i) {
        if (i < 128) {
            E(i);
            return;
        }
        if (i < 2048) {
            mm2 mm2VarA = A(2);
            byte[] bArr = mm2VarA.a;
            int i2 = mm2VarA.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            mm2VarA.c = i2 + 2;
            this.i += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            E(63);
            return;
        }
        if (i < 65536) {
            mm2 mm2VarA2 = A(3);
            byte[] bArr2 = mm2VarA2.a;
            int i3 = mm2VarA2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            mm2VarA2.c = i3 + 3;
            this.i += 3;
            return;
        }
        if (i > 1114111) {
            s.j("Unexpected code point: 0x".concat(qp0.U(i)));
            return;
        }
        mm2 mm2VarA3 = A(4);
        byte[] bArr3 = mm2VarA3.a;
        int i4 = mm2VarA3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        mm2VarA3.c = i4 + 4;
        this.i += 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final o23 a() {
        return o23.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object clone() {
        fn fnVar = new fn();
        if (this.i == 0) {
            return fnVar;
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        mm2 mm2VarC = mm2Var.c();
        fnVar.h = mm2VarC;
        mm2VarC.g = mm2VarC;
        mm2VarC.f = mm2VarC;
        for (mm2 mm2Var2 = mm2Var.f; mm2Var2 != mm2Var; mm2Var2 = mm2Var2.f) {
            mm2 mm2Var3 = mm2VarC.g;
            mm2Var3.getClass();
            mm2Var2.getClass();
            mm2Var3.b(mm2Var2.c());
        }
        fnVar.i = this.i;
        return fnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fr2
    public final void d(fn fnVar, long j) {
        mm2 mm2VarB;
        fnVar.getClass();
        if (fnVar == this) {
            s.j("source == this");
            return;
        }
        qp0.m(fnVar.i, 0L, j);
        while (j > 0) {
            mm2 mm2Var = fnVar.h;
            mm2Var.getClass();
            int i = mm2Var.c;
            mm2 mm2Var2 = fnVar.h;
            mm2Var2.getClass();
            long j2 = i - mm2Var2.b;
            int i2 = 0;
            if (j < j2) {
                mm2 mm2Var3 = this.h;
                mm2 mm2Var4 = mm2Var3 != null ? mm2Var3.g : null;
                if (mm2Var4 != null && mm2Var4.e) {
                    if ((((long) mm2Var4.c) + j) - ((long) (mm2Var4.d ? 0 : mm2Var4.b)) <= 8192) {
                        mm2 mm2Var5 = fnVar.h;
                        mm2Var5.getClass();
                        mm2Var5.d(mm2Var4, (int) j);
                        fnVar.i -= j;
                        this.i += j;
                        return;
                    }
                }
                mm2 mm2Var6 = fnVar.h;
                mm2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > mm2Var6.c - mm2Var6.b) {
                    s.j("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    mm2VarB = mm2Var6.c();
                } else {
                    mm2VarB = pm2.b();
                    byte[] bArr = mm2Var6.a;
                    byte[] bArr2 = mm2VarB.a;
                    int i4 = mm2Var6.b;
                    mg.d0(bArr, bArr2, 0, i4, i4 + i3, 2);
                }
                mm2VarB.c = mm2VarB.b + i3;
                mm2Var6.b += i3;
                mm2 mm2Var7 = mm2Var6.g;
                mm2Var7.getClass();
                mm2Var7.b(mm2VarB);
                fnVar.h = mm2VarB;
            }
            mm2 mm2Var8 = fnVar.h;
            mm2Var8.getClass();
            long j3 = mm2Var8.c - mm2Var8.b;
            fnVar.h = mm2Var8.a();
            mm2 mm2Var9 = this.h;
            if (mm2Var9 == null) {
                this.h = mm2Var8;
                mm2Var8.g = mm2Var8;
                mm2Var8.f = mm2Var8;
            } else {
                mm2 mm2Var10 = mm2Var9.g;
                mm2Var10.getClass();
                mm2Var10.b(mm2Var8);
                mm2 mm2Var11 = mm2Var8.g;
                if (mm2Var11 == mm2Var8) {
                    s.l("cannot compact");
                    return;
                }
                mm2Var11.getClass();
                if (mm2Var11.e) {
                    int i5 = mm2Var8.c - mm2Var8.b;
                    mm2 mm2Var12 = mm2Var8.g;
                    mm2Var12.getClass();
                    int i6 = 8192 - mm2Var12.c;
                    mm2 mm2Var13 = mm2Var8.g;
                    mm2Var13.getClass();
                    if (!mm2Var13.d) {
                        mm2 mm2Var14 = mm2Var8.g;
                        mm2Var14.getClass();
                        i2 = mm2Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        mm2 mm2Var15 = mm2Var8.g;
                        mm2Var15.getClass();
                        mm2Var8.d(mm2Var15, i5);
                        mm2Var8.a();
                        pm2.a(mm2Var8);
                    }
                }
            }
            fnVar.i -= j3;
            this.i += j3;
            j -= j3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        long j = this.i;
        fn fnVar = (fn) obj;
        if (j != fnVar.i) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        mm2 mm2Var2 = fnVar.h;
        mm2Var2.getClass();
        int i = mm2Var.b;
        int i2 = mm2Var2.b;
        long j2 = 0;
        while (j2 < this.i) {
            long jMin = Math.min(mm2Var.c - i, mm2Var2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (mm2Var.a[i] != mm2Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == mm2Var.c) {
                mm2Var = mm2Var.f;
                mm2Var.getClass();
                i = mm2Var.b;
            }
            if (i2 == mm2Var2.c) {
                mm2Var2 = mm2Var2.f;
                mm2Var2.getClass();
                i2 = mm2Var2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final no f(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            s.f("byteCount: ", j);
            return null;
        }
        if (this.i < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new no(q(j));
        }
        no noVarV = v((int) j);
        skip(j);
        return noVarV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() throws EOFException {
        skip(this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h() {
        long j = this.i;
        if (j == 0) {
            return 0L;
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        mm2 mm2Var2 = mm2Var.g;
        mm2Var2.getClass();
        int i = mm2Var2.c;
        return (i >= 8192 || !mm2Var2.e) ? j : j - ((long) (i - mm2Var2.b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        mm2 mm2Var = this.h;
        if (mm2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = mm2Var.c;
            for (int i3 = mm2Var.b; i3 < i2; i3++) {
                i = (i * 31) + mm2Var.a[i3];
            }
            mm2Var = mm2Var.f;
            mm2Var.getClass();
        } while (mm2Var != this.h);
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final long i(fn fnVar) {
        long j = this.i;
        if (j > 0) {
            fnVar.d(this, j);
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(fn fnVar, long j, long j2) {
        fnVar.getClass();
        long j3 = j;
        qp0.m(this.i, j3, j2);
        if (j2 == 0) {
            return;
        }
        fnVar.i += j2;
        mm2 mm2Var = this.h;
        while (true) {
            mm2Var.getClass();
            long j4 = mm2Var.c - mm2Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            mm2Var = mm2Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            mm2Var.getClass();
            mm2 mm2VarC = mm2Var.c();
            int i = mm2VarC.b + ((int) j3);
            mm2VarC.b = i;
            mm2VarC.c = Math.min(i + ((int) j5), mm2VarC.c);
            mm2 mm2Var2 = fnVar.h;
            if (mm2Var2 == null) {
                mm2VarC.g = mm2VarC;
                mm2VarC.f = mm2VarC;
                fnVar.h = mm2VarC;
            } else {
                mm2 mm2Var3 = mm2Var2.g;
                mm2Var3.getClass();
                mm2Var3.b(mm2VarC);
            }
            j5 -= (long) (mm2VarC.c - mm2VarC.b);
            mm2Var = mm2Var.f;
            j3 = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k() {
        return this.i == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final int m(nv1 nv1Var) throws EOFException {
        nv1Var.getClass();
        int iB = e.b(this, nv1Var, false);
        if (iB == -1) {
            return -1;
        }
        skip(nv1Var.h[iB].a());
        return iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ht2
    public final long n(fn fnVar, long j) {
        fnVar.getClass();
        if (j < 0) {
            s.f("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.i;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fnVar.d(this, j);
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte o(long j) {
        qp0.m(this.i, j, 1L);
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        long j2 = this.i;
        if (j2 - j < j) {
            while (j2 > j) {
                mm2Var = mm2Var.g;
                mm2Var.getClass();
                j2 -= (long) (mm2Var.c - mm2Var.b);
            }
            return mm2Var.a[(int) ((((long) mm2Var.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = mm2Var.c;
            int i2 = mm2Var.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return mm2Var.a[(int) ((((long) i2) + j) - j3)];
            }
            mm2Var = mm2Var.f;
            mm2Var.getClass();
            j3 = j4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long p(byte b, long j, long j2) {
        mm2 mm2Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.i + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.i;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (mm2Var = this.h) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                mm2Var = mm2Var.g;
                mm2Var.getClass();
                j4 -= (long) (mm2Var.c - mm2Var.b);
            }
            while (j4 < j2) {
                byte[] bArr = mm2Var.a;
                int iMin = (int) Math.min(mm2Var.c, (((long) mm2Var.b) + j2) - j4);
                for (int i = (int) ((((long) mm2Var.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - mm2Var.b)) + j4;
                    }
                }
                j4 += (long) (mm2Var.c - mm2Var.b);
                mm2Var = mm2Var.f;
                mm2Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (mm2Var.c - mm2Var.b)) + j3;
            if (j5 > j) {
                break;
            }
            mm2Var = mm2Var.f;
            mm2Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = mm2Var.a;
            int iMin2 = (int) Math.min(mm2Var.c, (((long) mm2Var.b) + j2) - j3);
            for (int i2 = (int) ((((long) mm2Var.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - mm2Var.b)) + j3;
                }
            }
            j3 += (long) (mm2Var.c - mm2Var.b);
            mm2Var = mm2Var.f;
            mm2Var.getClass();
            j = j3;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] q(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            s.f("byteCount: ", j);
            return null;
        }
        if (this.i < j) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r() throws EOFException {
        int i;
        if (this.i == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            mm2 mm2Var = this.h;
            mm2Var.getClass();
            byte[] bArr = mm2Var.a;
            int i3 = mm2Var.b;
            int i4 = mm2Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = p7.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.h = mm2Var.a();
                        pm2.a(mm2Var);
                    } else {
                        mm2Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    fn fnVar = new fn();
                    fnVar.G(j);
                    fnVar.E(b);
                    throw new NumberFormatException("Number too large: ".concat(fnVar.u()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.h != null);
        this.i -= (long) i2;
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int read(byte[] bArr, int i, int i2) {
        qp0.m(bArr.length, i, i2);
        mm2 mm2Var = this.h;
        if (mm2Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, mm2Var.c - mm2Var.b);
        byte[] bArr2 = mm2Var.a;
        int i3 = mm2Var.b;
        mg.Z(bArr2, bArr, i, i3, i3 + iMin);
        int i4 = mm2Var.b + iMin;
        mm2Var.b = i4;
        this.i -= (long) iMin;
        if (i4 == mm2Var.c) {
            this.h = mm2Var.a();
            pm2.a(mm2Var);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final byte readByte() {
        if (this.i == 0) {
            throw new EOFException();
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        int i = mm2Var.b;
        int i2 = mm2Var.c;
        int i3 = i + 1;
        byte b = mm2Var.a[i];
        this.i--;
        if (i3 != i2) {
            mm2Var.b = i3;
            return b;
        }
        this.h = mm2Var.a();
        pm2.a(mm2Var);
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final int readInt() throws EOFException {
        if (this.i < 4) {
            throw new EOFException();
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        int i = mm2Var.b;
        int i2 = mm2Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = mm2Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.i -= 4;
        if (i5 != i2) {
            mm2Var.b = i5;
            return i6;
        }
        this.h = mm2Var.a();
        pm2.a(mm2Var);
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final short readShort() throws EOFException {
        if (this.i < 2) {
            throw new EOFException();
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        int i = mm2Var.b;
        int i2 = mm2Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = mm2Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.i -= 2;
        if (i5 == i2) {
            this.h = mm2Var.a();
            pm2.a(mm2Var);
        } else {
            mm2Var.b = i5;
        }
        return (short) i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final String s(long j) throws EOFException {
        if (j < 0) {
            s.f("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jP = p((byte) 10, 0L, j2);
        if (jP != -1) {
            return e.a(this, jP);
        }
        if (j2 < this.i && o(j2 - 1) == 13 && o(j2) == 10) {
            return e.a(this, j2);
        }
        fn fnVar = new fn();
        j(fnVar, 0L, Math.min(32L, this.i));
        throw new EOFException("\\n not found: limit=" + Math.min(this.i, j) + " content=" + fnVar.f(fnVar.i).b() + (char) 8230);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            mm2 mm2Var = this.h;
            if (mm2Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, mm2Var.c - mm2Var.b);
            long j2 = iMin;
            this.i -= j2;
            j -= j2;
            int i = mm2Var.b + iMin;
            mm2Var.b = i;
            if (i == mm2Var.c) {
                this.h = mm2Var.a();
                pm2.a(mm2Var);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String t(long j, Charset charset) throws EOFException {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            s.f("byteCount: ", j);
            return null;
        }
        if (this.i < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        mm2 mm2Var = this.h;
        mm2Var.getClass();
        int i = mm2Var.b;
        if (((long) i) + j > mm2Var.c) {
            return new String(q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(mm2Var.a, i, i2, charset);
        int i3 = mm2Var.b + i2;
        mm2Var.b = i3;
        this.i -= j;
        if (i3 == mm2Var.c) {
            this.h = mm2Var.a();
            pm2.a(mm2Var);
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.i;
        if (j <= 2147483647L) {
            return v((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String u() {
        return t(this.i, wq.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final no v(int i) {
        if (i == 0) {
            return no.k;
        }
        qp0.m(this.i, 0L, i);
        mm2 mm2Var = this.h;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            mm2Var.getClass();
            int i5 = mm2Var.c;
            int i6 = mm2Var.b;
            if (i5 == i6) {
                s.i("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            mm2Var = mm2Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        mm2 mm2Var2 = this.h;
        int i7 = 0;
        while (i2 < i) {
            mm2Var2.getClass();
            bArr[i7] = mm2Var2.a;
            i2 += mm2Var2.c - mm2Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = mm2Var2.b;
            mm2Var2.d = true;
            i7++;
            mm2Var2 = mm2Var2.f;
        }
        return new qm2(bArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn w(int i, byte[] bArr) {
        write(bArr, 0, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        qp0.m(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            mm2 mm2VarA = A(1);
            int iMin = Math.min(i3 - i, 8192 - mm2VarA.c);
            int i4 = i + iMin;
            mg.Z(bArr, mm2VarA.a, mm2VarA.c, i, i4);
            mm2VarA.c += iMin;
            i = i4;
        }
        this.i += j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn writeByte(int i) {
        E(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn writeInt(int i) {
        H(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn writeShort(int i) {
        I(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on
    public final void x(long j) throws EOFException {
        if (this.i < j) {
            throw new EOFException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn y(String str) {
        J(str);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn
    public final /* bridge */ /* synthetic */ nn z(no noVar) {
        B(noVar);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.fr2
    public final void close() {
    }

    @Override // defpackage.nn, defpackage.fr2, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.nn
    public final fn l() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            mm2 mm2VarA = A(1);
            int iMin = Math.min(i, 8192 - mm2VarA.c);
            byteBuffer.get(mm2VarA.a, mm2VarA.c, iMin);
            i -= iMin;
            mm2VarA.c += iMin;
        }
        this.i += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        mm2 mm2Var = this.h;
        if (mm2Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mm2Var.c - mm2Var.b);
        byteBuffer.put(mm2Var.a, mm2Var.b, iMin);
        int i = mm2Var.b + iMin;
        mm2Var.b = i;
        this.i -= (long) iMin;
        if (i == mm2Var.c) {
            this.h = mm2Var.a();
            pm2.a(mm2Var);
        }
        return iMin;
    }

    @Override // defpackage.nn
    public final nn write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
        return this;
    }
}
