package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: ja */
/* JADX INFO: loaded from: classes.dex */
public final class C2096ja extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final ByteArrayInputStream f7372c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7373d;

    /* JADX INFO: renamed from: e */
    public int f7374e;

    /* JADX INFO: renamed from: f */
    public int f7375f;

    /* JADX INFO: renamed from: g */
    public int f7376g;

    /* JADX INFO: renamed from: h */
    public int f7377h;

    /* JADX INFO: renamed from: i */
    public int f7378i;

    /* JADX INFO: renamed from: j */
    public int f7379j = Integer.MAX_VALUE;

    public C2096ja(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = AbstractC0501Ll.f1637a;
        this.f7372c = byteArrayInputStream;
        this.f7373d = new byte[4096];
        this.f7374e = 0;
        this.f7376g = 0;
        this.f7378i = 0;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: A */
    public final String mo2926A() throws IOException {
        int iM4286J = m4286J();
        int i = this.f7376g;
        int i2 = this.f7374e;
        int i3 = i2 - i;
        byte[] bArrM4281E = this.f7373d;
        if (iM4286J <= i3 && iM4286J > 0) {
            this.f7376g = i + iM4286J;
        } else {
            if (iM4286J == 0) {
                return "";
            }
            i = 0;
            if (iM4286J <= i2) {
                m4290N(iM4286J);
                this.f7376g = iM4286J;
            } else {
                bArrM4281E = m4281E(iM4286J);
            }
        }
        return AbstractC2536tD.f8842a.mo1360i(bArrM4281E, i, iM4286J);
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: B */
    public final int mo2927B() throws C0673Pl {
        if (mo2938g()) {
            this.f7377h = 0;
            return 0;
        }
        int iM4286J = m4286J();
        this.f7377h = iM4286J;
        if ((iM4286J >>> 3) != 0) {
            return iM4286J;
        }
        throw C0673Pl.m1364a();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: C */
    public final int mo2928C() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: D */
    public final long mo2929D() {
        return m4287K();
    }

    /* JADX INFO: renamed from: E */
    public final byte[] m4281E(int i) throws IOException {
        byte[] bArrM4282F = m4282F(i);
        if (bArrM4282F != null) {
            return bArrM4282F;
        }
        int i2 = this.f7376g;
        int i3 = this.f7374e;
        int length = i3 - i2;
        this.f7378i += i3;
        this.f7376g = 0;
        this.f7374e = 0;
        ArrayList<byte[]> arrayListM4283G = m4283G(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7373d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM4283G) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m4282F(int i) throws IOException {
        if (i == 0) {
            return AbstractC0501Ll.f1638b;
        }
        if (i < 0) {
            throw C0673Pl.m1368e();
        }
        int i2 = this.f7378i;
        int i3 = this.f7376g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new C0673Pl("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f7379j;
        if (i4 > i5) {
            m4291O((i5 - i2) - i3);
            throw C0673Pl.m1370g();
        }
        int i6 = this.f7374e - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.f7372c;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (C0673Pl e) {
                e.f2146a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7373d, this.f7376g, bArr, 0, i6);
        this.f7378i += this.f7374e;
        this.f7376g = 0;
        this.f7374e = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw C0673Pl.m1370g();
                }
                this.f7378i += i8;
                i6 += i8;
            } catch (C0673Pl e2) {
                e2.f2146a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m4283G(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f7372c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw C0673Pl.m1370g();
                }
                this.f7378i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final int m4284H() throws C0673Pl {
        int i = this.f7376g;
        if (this.f7374e - i < 4) {
            m4290N(4);
            i = this.f7376g;
        }
        this.f7376g = i + 4;
        byte[] bArr = this.f7373d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: I */
    public final long m4285I() throws C0673Pl {
        int i = this.f7376g;
        if (this.f7374e - i < 8) {
            m4290N(8);
            i = this.f7376g;
        }
        this.f7376g = i + 8;
        byte[] bArr = this.f7373d;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: J */
    public final int m4286J() {
        int i;
        int i2 = this.f7376g;
        int i3 = this.f7374e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f7373d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f7376g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f7376g = i5;
                return i;
            }
        }
        return (int) m4288L();
    }

    /* JADX INFO: renamed from: K */
    public final long m4287K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f7376g;
        int i2 = this.f7374e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.f7373d;
            byte b = bArr[i];
            if (b >= 0) {
                this.f7376g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.f7376g = i4;
                return j;
            }
        }
        return m4288L();
    }

    /* JADX INFO: renamed from: L */
    public final long m4288L() throws C0673Pl {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f7376g == this.f7374e) {
                m4290N(1);
            }
            int i2 = this.f7376g;
            this.f7376g = i2 + 1;
            byte b = this.f7373d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw C0673Pl.m1367d();
    }

    /* JADX INFO: renamed from: M */
    public final void m4289M() {
        int i = this.f7374e + this.f7375f;
        this.f7374e = i;
        int i2 = this.f7378i + i;
        int i3 = this.f7379j;
        if (i2 <= i3) {
            this.f7375f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f7375f = i4;
        this.f7374e = i - i4;
    }

    /* JADX INFO: renamed from: N */
    public final void m4290N(int i) throws C0673Pl {
        if (m4292P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f7378i) - this.f7376g) {
            throw C0673Pl.m1370g();
        }
        throw new C0673Pl("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: O */
    public final void m4291O(int i) throws C0673Pl {
        int i2 = this.f7374e;
        int i3 = this.f7376g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f7376g = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f7372c;
        if (i < 0) {
            throw C0673Pl.m1368e();
        }
        int i5 = this.f7378i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f7379j;
        if (i7 > i8) {
            m4291O((i8 - i5) - i3);
            throw C0673Pl.m1370g();
        }
        this.f7378i = i6;
        this.f7374e = 0;
        this.f7376g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (C0673Pl e) {
                    e.f2146a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f7378i += i4;
                m4289M();
                throw th;
            }
        }
        this.f7378i += i4;
        m4289M();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f7374e;
        int i10 = i9 - this.f7376g;
        this.f7376g = i9;
        m4290N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f7374e;
            if (i11 <= i12) {
                this.f7376g = i11;
                return;
            } else {
                i10 += i12;
                this.f7376g = i12;
                m4290N(1);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m4292P(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f7372c;
        int i2 = this.f7376g;
        int i3 = i2 + i;
        int i4 = this.f7374e;
        if (i3 <= i4) {
            throw new IllegalStateException(AbstractC2374ph.m4813j(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.f7378i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.f7379j) {
            byte[] bArr = this.f7373d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f7378i += i2;
                this.f7374e -= i2;
                this.f7376g = 0;
            }
            int i6 = this.f7374e;
            try {
                int i7 = byteArrayInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f7378i) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f7374e += i7;
                    m4289M();
                    if (this.f7374e >= i) {
                        return true;
                    }
                    return m4292P(i);
                }
            } catch (C0673Pl e) {
                e.f2146a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: b */
    public final void mo2936b(int i) throws C0673Pl {
        if (this.f7377h != i) {
            throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: f */
    public final int mo2937f() {
        return this.f7378i + this.f7376g;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: g */
    public final boolean mo2938g() {
        return this.f7376g == this.f7374e && !m4292P(1);
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: j */
    public final void mo2939j(int i) {
        this.f7379j = i;
        m4289M();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: l */
    public final int mo2940l(int i) throws C0673Pl {
        if (i < 0) {
            throw C0673Pl.m1368e();
        }
        int i2 = this.f7378i + this.f7376g + i;
        int i3 = this.f7379j;
        if (i2 > i3) {
            throw C0673Pl.m1370g();
        }
        this.f7379j = i2;
        m4289M();
        return i3;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: m */
    public final boolean mo2941m() {
        return m4287K() != 0;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: n */
    public final C2701x6 mo2942n() throws IOException {
        int iM4286J = m4286J();
        int i = this.f7374e;
        int i2 = this.f7376g;
        int i3 = i - i2;
        byte[] bArr = this.f7373d;
        if (iM4286J <= i3 && iM4286J > 0) {
            C2701x6 c2701x6M5328c = AbstractC2744y6.m5328c(bArr, i2, iM4286J);
            this.f7376g += iM4286J;
            return c2701x6M5328c;
        }
        if (iM4286J == 0) {
            return AbstractC2744y6.f9369b;
        }
        byte[] bArrM4282F = m4282F(iM4286J);
        if (bArrM4282F != null) {
            return AbstractC2744y6.m5328c(bArrM4282F, 0, bArrM4282F.length);
        }
        int i4 = this.f7376g;
        int i5 = this.f7374e;
        int length = i5 - i4;
        this.f7378i += i5;
        this.f7376g = 0;
        this.f7374e = 0;
        ArrayList<byte[]> arrayListM4283G = m4283G(iM4286J - length);
        byte[] bArr2 = new byte[iM4286J];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM4283G) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C2701x6 c2701x6 = AbstractC2744y6.f9369b;
        return new C2701x6(bArr2);
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: o */
    public final double mo2943o() {
        return Double.longBitsToDouble(m4285I());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: p */
    public final int mo2944p() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: q */
    public final int mo2945q() {
        return m4284H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: r */
    public final long mo2946r() {
        return m4285I();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: s */
    public final float mo2947s() {
        return Float.intBitsToFloat(m4284H());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: t */
    public final int mo2948t() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: u */
    public final long mo2949u() {
        return m4287K();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: v */
    public final int mo2950v() {
        return m4284H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: w */
    public final long mo2951w() {
        return m4285I();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: x */
    public final int mo2952x() {
        return AbstractC2140ka.m4321d(m4286J());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: y */
    public final long mo2953y() {
        return AbstractC2140ka.m4322e(m4287K());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: z */
    public final String mo2954z() throws C0673Pl {
        int iM4286J = m4286J();
        byte[] bArr = this.f7373d;
        if (iM4286J > 0) {
            int i = this.f7374e;
            int i2 = this.f7376g;
            if (iM4286J <= i - i2) {
                String str = new String(bArr, i2, iM4286J, AbstractC0501Ll.f1637a);
                this.f7376g += iM4286J;
                return str;
            }
        }
        if (iM4286J == 0) {
            return "";
        }
        if (iM4286J > this.f7374e) {
            return new String(m4281E(iM4286J), AbstractC0501Ll.f1637a);
        }
        m4290N(iM4286J);
        String str2 = new String(bArr, this.f7376g, iM4286J, AbstractC0501Ll.f1637a);
        this.f7376g += iM4286J;
        return str2;
    }
}
