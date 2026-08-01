package p208n4;

import com.bumptech.glide.AbstractC1926h;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1973a;
import p215o4.AbstractC2802a;

/* JADX INFO: renamed from: n4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2706e implements InterfaceC2708g, InterfaceC2707f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: d */
    public C2717p f8628d;

    /* JADX INFO: renamed from: e */
    public long f8629e;

    /* JADX INFO: renamed from: A */
    public final String m4699A() {
        return m4730x(this.f8629e, AbstractC1973a.f6662a);
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: B */
    public final InputStream mo4700B() {
        return new C2704c(this, 0);
    }

    /* JADX INFO: renamed from: C */
    public final C2709h m4701C(int i5) {
        if (i5 == 0) {
            return C2709h.f8630g;
        }
        AbstractC1926h.m3564g(this.f8629e, 0L, i5);
        C2717p c2717p = this.f8628d;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            AbstractC1665j.m2982b(c2717p);
            int i9 = c2717p.f8655c;
            int i10 = c2717p.f8654b;
            if (i9 == i10) {
                throw new AssertionError("s.limit == s.pos");
            }
            i7 += i9 - i10;
            i8++;
            c2717p = c2717p.f8658f;
        }
        byte[][] bArr = new byte[i8][];
        int[] iArr = new int[i8 * 2];
        C2717p c2717p2 = this.f8628d;
        int i11 = 0;
        while (i6 < i5) {
            AbstractC1665j.m2982b(c2717p2);
            bArr[i11] = c2717p2.f8653a;
            i6 += c2717p2.f8655c - c2717p2.f8654b;
            iArr[i11] = Math.min(i6, i5);
            iArr[i11 + i8] = c2717p2.f8654b;
            c2717p2.f8656d = true;
            i11++;
            c2717p2 = c2717p2.f8658f;
        }
        return new C2719r(bArr, iArr);
    }

    /* JADX INFO: renamed from: D */
    public final C2717p m4702D(int i5) {
        if (i5 < 1 || i5 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C2717p c2717p = this.f8628d;
        if (c2717p == null) {
            C2717p c2717pM4762b = AbstractC2718q.m4762b();
            this.f8628d = c2717pM4762b;
            c2717pM4762b.f8659g = c2717pM4762b;
            c2717pM4762b.f8658f = c2717pM4762b;
            return c2717pM4762b;
        }
        C2717p c2717p2 = c2717p.f8659g;
        AbstractC1665j.m2982b(c2717p2);
        if (c2717p2.f8655c + i5 <= 8192 && c2717p2.f8657e) {
            return c2717p2;
        }
        C2717p c2717pM4762b2 = AbstractC2718q.m4762b();
        c2717p2.m4758b(c2717pM4762b2);
        return c2717pM4762b2;
    }

    /* JADX INFO: renamed from: E */
    public final void m4703E(C2709h c2709h) {
        AbstractC1665j.m2985e(c2709h, "byteString");
        c2709h.mo4742k(this, c2709h.mo4732a());
    }

    /* JADX INFO: renamed from: F */
    public final void m4704F(InterfaceC2722u interfaceC2722u) {
        AbstractC1665j.m2985e(interfaceC2722u, "source");
        while (interfaceC2722u.mo554y(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4705G(int i5) {
        C2717p c2717pM4702D = m4702D(1);
        byte[] bArr = c2717pM4702D.f8653a;
        int i6 = c2717pM4702D.f8655c;
        c2717pM4702D.f8655c = i6 + 1;
        bArr[i6] = (byte) i5;
        this.f8629e++;
    }

    /* JADX INFO: renamed from: H */
    public final void m4706H(long j5) {
        boolean z5;
        if (j5 == 0) {
            m4705G(48);
            return;
        }
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                m4711M("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        byte[] bArr = AbstractC2802a.f8825a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j5)) * 10) >>> 5;
        int i5 = iNumberOfLeadingZeros + (j5 > AbstractC2802a.f8826b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z5) {
            i5++;
        }
        C2717p c2717pM4702D = m4702D(i5);
        byte[] bArr2 = c2717pM4702D.f8653a;
        int i6 = c2717pM4702D.f8655c + i5;
        while (j5 != 0) {
            long j6 = 10;
            i6--;
            bArr2[i6] = AbstractC2802a.f8825a[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z5) {
            bArr2[i6 - 1] = 45;
        }
        c2717pM4702D.f8655c += i5;
        this.f8629e += (long) i5;
    }

    /* JADX INFO: renamed from: I */
    public final void m4707I(long j5) {
        if (j5 == 0) {
            m4705G(48);
            return;
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i5 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C2717p c2717pM4702D = m4702D(i5);
        byte[] bArr = c2717pM4702D.f8653a;
        int i6 = c2717pM4702D.f8655c;
        for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
            bArr[i7] = AbstractC2802a.f8825a[(int) (15 & j5)];
            j5 >>>= 4;
        }
        c2717pM4702D.f8655c += i5;
        this.f8629e += (long) i5;
    }

    /* JADX INFO: renamed from: J */
    public final void m4708J(int i5) {
        C2717p c2717pM4702D = m4702D(4);
        byte[] bArr = c2717pM4702D.f8653a;
        int i6 = c2717pM4702D.f8655c;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        bArr[i6 + 1] = (byte) ((i5 >>> 16) & 255);
        bArr[i6 + 2] = (byte) ((i5 >>> 8) & 255);
        bArr[i6 + 3] = (byte) (i5 & 255);
        c2717pM4702D.f8655c = i6 + 4;
        this.f8629e += 4;
    }

    /* JADX INFO: renamed from: K */
    public final void m4709K(int i5) {
        C2717p c2717pM4702D = m4702D(2);
        byte[] bArr = c2717pM4702D.f8653a;
        int i6 = c2717pM4702D.f8655c;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i6 + 1] = (byte) (i5 & 255);
        c2717pM4702D.f8655c = i6 + 2;
        this.f8629e += 2;
    }

    /* JADX INFO: renamed from: L */
    public final void m4710L(int i5, int i6, String str) {
        char cCharAt;
        AbstractC1665j.m2985e(str, "string");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("beginIndex < 0: ", i5).toString());
        }
        if (i6 < i5) {
            throw new IllegalArgumentException(AbstractC0231b.m399j("endIndex < beginIndex: ", i6, " < ", i5).toString());
        }
        if (i6 > str.length()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i6, "endIndex > string.length: ", " > ");
            sbM404o.append(str.length());
            throw new IllegalArgumentException(sbM404o.toString().toString());
        }
        while (i5 < i6) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 128) {
                C2717p c2717pM4702D = m4702D(1);
                byte[] bArr = c2717pM4702D.f8653a;
                int i7 = c2717pM4702D.f8655c - i5;
                int iMin = Math.min(i6, 8192 - i7);
                int i8 = i5 + 1;
                bArr[i5 + i7] = (byte) cCharAt2;
                while (true) {
                    i5 = i8;
                    if (i5 >= iMin || (cCharAt = str.charAt(i5)) >= 128) {
                        break;
                    }
                    i8 = i5 + 1;
                    bArr[i5 + i7] = (byte) cCharAt;
                }
                int i9 = c2717pM4702D.f8655c;
                int i10 = (i7 + i5) - i9;
                c2717pM4702D.f8655c = i9 + i10;
                this.f8629e += (long) i10;
            } else {
                if (cCharAt2 < 2048) {
                    C2717p c2717pM4702D2 = m4702D(2);
                    byte[] bArr2 = c2717pM4702D2.f8653a;
                    int i11 = c2717pM4702D2.f8655c;
                    bArr2[i11] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i11 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c2717pM4702D2.f8655c = i11 + 2;
                    this.f8629e += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C2717p c2717pM4702D3 = m4702D(3);
                    byte[] bArr3 = c2717pM4702D3.f8653a;
                    int i12 = c2717pM4702D3.f8655c;
                    bArr3[i12] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i12 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i12 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c2717pM4702D3.f8655c = i12 + 3;
                    this.f8629e += 3;
                } else {
                    int i13 = i5 + 1;
                    char cCharAt3 = i13 < i6 ? str.charAt(i13) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m4705G(63);
                        i5 = i13;
                    } else {
                        int i14 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C2717p c2717pM4702D4 = m4702D(4);
                        byte[] bArr4 = c2717pM4702D4.f8653a;
                        int i15 = c2717pM4702D4.f8655c;
                        bArr4[i15] = (byte) ((i14 >> 18) | 240);
                        bArr4[i15 + 1] = (byte) (((i14 >> 12) & 63) | 128);
                        bArr4[i15 + 2] = (byte) (((i14 >> 6) & 63) | 128);
                        bArr4[i15 + 3] = (byte) ((i14 & 63) | 128);
                        c2717pM4702D4.f8655c = i15 + 4;
                        this.f8629e += 4;
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4711M(String str) {
        AbstractC1665j.m2985e(str, "string");
        m4710L(0, str.length(), str);
    }

    /* JADX INFO: renamed from: N */
    public final void m4712N(int i5) {
        if (i5 < 128) {
            m4705G(i5);
            return;
        }
        if (i5 < 2048) {
            C2717p c2717pM4702D = m4702D(2);
            byte[] bArr = c2717pM4702D.f8653a;
            int i6 = c2717pM4702D.f8655c;
            bArr[i6] = (byte) ((i5 >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i5 & 63) | 128);
            c2717pM4702D.f8655c = i6 + 2;
            this.f8629e += 2;
            return;
        }
        if (55296 <= i5 && i5 < 57344) {
            m4705G(63);
            return;
        }
        if (i5 < 65536) {
            C2717p c2717pM4702D2 = m4702D(3);
            byte[] bArr2 = c2717pM4702D2.f8653a;
            int i7 = c2717pM4702D2.f8655c;
            bArr2[i7] = (byte) ((i5 >> 12) | 224);
            bArr2[i7 + 1] = (byte) (((i5 >> 6) & 63) | 128);
            bArr2[i7 + 2] = (byte) ((i5 & 63) | 128);
            c2717pM4702D2.f8655c = i7 + 3;
            this.f8629e += 3;
            return;
        }
        if (i5 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC1926h.m3553F(i5)));
        }
        C2717p c2717pM4702D3 = m4702D(4);
        byte[] bArr3 = c2717pM4702D3.f8653a;
        int i8 = c2717pM4702D3.f8655c;
        bArr3[i8] = (byte) ((i5 >> 18) | 240);
        bArr3[i8 + 1] = (byte) (((i5 >> 12) & 63) | 128);
        bArr3[i8 + 2] = (byte) (((i5 >> 6) & 63) | 128);
        bArr3[i8 + 3] = (byte) ((i5 & 63) | 128);
        c2717pM4702D3.f8655c = i8 + 4;
        this.f8629e += 4;
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return AbstractC2724w.f8665d;
    }

    public final Object clone() {
        C2706e c2706e = new C2706e();
        if (this.f8629e == 0) {
            return c2706e;
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        C2717p c2717pM4759c = c2717p.m4759c();
        c2706e.f8628d = c2717pM4759c;
        c2717pM4759c.f8659g = c2717pM4759c;
        c2717pM4759c.f8658f = c2717pM4759c;
        for (C2717p c2717p2 = c2717p.f8658f; c2717p2 != c2717p; c2717p2 = c2717p2.f8658f) {
            C2717p c2717p3 = c2717pM4759c.f8659g;
            AbstractC1665j.m2982b(c2717p3);
            AbstractC1665j.m2982b(c2717p2);
            c2717p3.m4758b(c2717p2.m4759c());
        }
        c2706e.f8629e = this.f8629e;
        return c2706e;
    }

    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC2707f mo4713e(C2709h c2709h) {
        m4703E(c2709h);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2706e)) {
            return false;
        }
        long j5 = this.f8629e;
        C2706e c2706e = (C2706e) obj;
        if (j5 != c2706e.f8629e) {
            return false;
        }
        if (j5 == 0) {
            return true;
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        C2717p c2717p2 = c2706e.f8628d;
        AbstractC1665j.m2982b(c2717p2);
        int i5 = c2717p.f8654b;
        int i6 = c2717p2.f8654b;
        long j6 = 0;
        while (j6 < this.f8629e) {
            long jMin = Math.min(c2717p.f8655c - i5, c2717p2.f8655c - i6);
            long j7 = 0;
            while (j7 < jMin) {
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (c2717p.f8653a[i5] != c2717p2.f8653a[i6]) {
                    return false;
                }
                j7++;
                i5 = i7;
                i6 = i8;
            }
            if (i5 == c2717p.f8655c) {
                c2717p = c2717p.f8658f;
                AbstractC1665j.m2982b(c2717p);
                i5 = c2717p.f8654b;
            }
            if (i6 == c2717p2.f8655c) {
                c2717p2 = c2717p2.f8658f;
                AbstractC1665j.m2982b(c2717p2);
                i6 = c2717p2.f8654b;
            }
            j6 += jMin;
        }
        return true;
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: g */
    public final C2709h mo4714g(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f8629e < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new C2709h(m4726t(j5));
        }
        C2709h c2709hM4701C = m4701C((int) j5);
        skip(j5);
        return c2709hM4701C;
    }

    /* JADX INFO: renamed from: h */
    public final void m4715h() throws EOFException {
        skip(this.f8629e);
    }

    public final int hashCode() {
        C2717p c2717p = this.f8628d;
        if (c2717p == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = c2717p.f8655c;
            for (int i7 = c2717p.f8654b; i7 < i6; i7++) {
                i5 = (i5 * 31) + c2717p.f8653a[i7];
            }
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
        } while (c2717p != this.f8628d);
        return i5;
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: i */
    public final int mo4716i(C2714m c2714m) throws EOFException {
        AbstractC1665j.m2985e(c2714m, "options");
        int iM4987b = AbstractC2802a.m4987b(this, c2714m, false);
        if (iM4987b == -1) {
            return -1;
        }
        skip(c2714m.f8645d[iM4987b].mo4732a());
        return iM4987b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final long m4717j() {
        long j5 = this.f8629e;
        if (j5 == 0) {
            return 0L;
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        C2717p c2717p2 = c2717p.f8659g;
        AbstractC1665j.m2982b(c2717p2);
        int i5 = c2717p2.f8655c;
        return (i5 >= 8192 || !c2717p2.f8657e) ? j5 : j5 - ((long) (i5 - c2717p2.f8654b));
    }

    /* JADX INFO: renamed from: l */
    public final void m4719l(C2706e c2706e, long j5, long j6) {
        AbstractC1665j.m2985e(c2706e, "out");
        long j7 = j5;
        AbstractC1926h.m3564g(this.f8629e, j7, j6);
        if (j6 == 0) {
            return;
        }
        c2706e.f8629e += j6;
        C2717p c2717p = this.f8628d;
        while (true) {
            AbstractC1665j.m2982b(c2717p);
            long j8 = c2717p.f8655c - c2717p.f8654b;
            if (j7 < j8) {
                break;
            }
            j7 -= j8;
            c2717p = c2717p.f8658f;
        }
        C2717p c2717p2 = c2717p;
        long j9 = j6;
        while (j9 > 0) {
            AbstractC1665j.m2982b(c2717p2);
            C2717p c2717pM4759c = c2717p2.m4759c();
            int i5 = c2717pM4759c.f8654b + ((int) j7);
            c2717pM4759c.f8654b = i5;
            c2717pM4759c.f8655c = Math.min(i5 + ((int) j9), c2717pM4759c.f8655c);
            C2717p c2717p3 = c2706e.f8628d;
            if (c2717p3 == null) {
                c2717pM4759c.f8659g = c2717pM4759c;
                c2717pM4759c.f8658f = c2717pM4759c;
                c2706e.f8628d = c2717pM4759c;
            } else {
                C2717p c2717p4 = c2717p3.f8659g;
                AbstractC1665j.m2982b(c2717p4);
                c2717p4.m4758b(c2717pM4759c);
            }
            j9 -= (long) (c2717pM4759c.f8655c - c2717pM4759c.f8654b);
            c2717p2 = c2717p2.f8658f;
            j7 = 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4720m() {
        return this.f8629e == 0;
    }

    /* JADX INFO: renamed from: n */
    public final byte m4721n(long j5) {
        AbstractC1926h.m3564g(this.f8629e, j5, 1L);
        C2717p c2717p = this.f8628d;
        if (c2717p == null) {
            AbstractC1665j.m2982b(null);
            throw null;
        }
        long j6 = this.f8629e;
        if (j6 - j5 < j5) {
            while (j6 > j5) {
                c2717p = c2717p.f8659g;
                AbstractC1665j.m2982b(c2717p);
                j6 -= (long) (c2717p.f8655c - c2717p.f8654b);
            }
            return c2717p.f8653a[(int) ((((long) c2717p.f8654b) + j5) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i5 = c2717p.f8655c;
            int i6 = c2717p.f8654b;
            long j8 = ((long) (i5 - i6)) + j7;
            if (j8 > j5) {
                return c2717p.f8653a[(int) ((((long) i6) + j5) - j7)];
            }
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
            j7 = j8;
        }
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: o */
    public final String mo4722o(long j5) throws EOFException {
        if (j5 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j5).toString());
        }
        long j6 = j5 != Long.MAX_VALUE ? j5 + 1 : Long.MAX_VALUE;
        long jM4724r = m4724r((byte) 10, 0L, j6);
        if (jM4724r != -1) {
            return AbstractC2802a.m4986a(this, jM4724r);
        }
        if (j6 < this.f8629e && m4721n(j6 - 1) == 13 && m4721n(j6) == 10) {
            return AbstractC2802a.m4986a(this, j6);
        }
        C2706e c2706e = new C2706e();
        m4719l(c2706e, 0L, Math.min(32, this.f8629e));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f8629e, j5) + " content=" + c2706e.mo4714g(c2706e.f8629e).mo4733b() + (char) 8230);
    }

    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) {
        C2717p c2717pM4762b;
        AbstractC1665j.m2985e(c2706e, "source");
        if (c2706e == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1926h.m3564g(c2706e.f8629e, 0L, j5);
        while (j5 > 0) {
            C2717p c2717p = c2706e.f8628d;
            AbstractC1665j.m2982b(c2717p);
            int i5 = c2717p.f8655c;
            C2717p c2717p2 = c2706e.f8628d;
            AbstractC1665j.m2982b(c2717p2);
            long j6 = i5 - c2717p2.f8654b;
            int i6 = 0;
            if (j5 < j6) {
                C2717p c2717p3 = this.f8628d;
                C2717p c2717p4 = c2717p3 != null ? c2717p3.f8659g : null;
                if (c2717p4 != null && c2717p4.f8657e) {
                    if ((((long) c2717p4.f8655c) + j5) - ((long) (c2717p4.f8656d ? 0 : c2717p4.f8654b)) <= 8192) {
                        C2717p c2717p5 = c2706e.f8628d;
                        AbstractC1665j.m2982b(c2717p5);
                        c2717p5.m4760d(c2717p4, (int) j5);
                        c2706e.f8629e -= j5;
                        this.f8629e += j5;
                        return;
                    }
                }
                C2717p c2717p6 = c2706e.f8628d;
                AbstractC1665j.m2982b(c2717p6);
                int i7 = (int) j5;
                if (i7 <= 0 || i7 > c2717p6.f8655c - c2717p6.f8654b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i7 >= 1024) {
                    c2717pM4762b = c2717p6.m4759c();
                } else {
                    c2717pM4762b = AbstractC2718q.m4762b();
                    byte[] bArr = c2717p6.f8653a;
                    byte[] bArr2 = c2717pM4762b.f8653a;
                    int i8 = c2717p6.f8654b;
                    AbstractC0972l.m1989M(0, i8, i8 + i7, bArr, bArr2);
                }
                c2717pM4762b.f8655c = c2717pM4762b.f8654b + i7;
                c2717p6.f8654b += i7;
                C2717p c2717p7 = c2717p6.f8659g;
                AbstractC1665j.m2982b(c2717p7);
                c2717p7.m4758b(c2717pM4762b);
                c2706e.f8628d = c2717pM4762b;
            }
            C2717p c2717p8 = c2706e.f8628d;
            AbstractC1665j.m2982b(c2717p8);
            long j7 = c2717p8.f8655c - c2717p8.f8654b;
            c2706e.f8628d = c2717p8.m4757a();
            C2717p c2717p9 = this.f8628d;
            if (c2717p9 == null) {
                this.f8628d = c2717p8;
                c2717p8.f8659g = c2717p8;
                c2717p8.f8658f = c2717p8;
            } else {
                C2717p c2717p10 = c2717p9.f8659g;
                AbstractC1665j.m2982b(c2717p10);
                c2717p10.m4758b(c2717p8);
                C2717p c2717p11 = c2717p8.f8659g;
                if (c2717p11 == c2717p8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC1665j.m2982b(c2717p11);
                if (c2717p11.f8657e) {
                    int i9 = c2717p8.f8655c - c2717p8.f8654b;
                    C2717p c2717p12 = c2717p8.f8659g;
                    AbstractC1665j.m2982b(c2717p12);
                    int i10 = 8192 - c2717p12.f8655c;
                    C2717p c2717p13 = c2717p8.f8659g;
                    AbstractC1665j.m2982b(c2717p13);
                    if (!c2717p13.f8656d) {
                        C2717p c2717p14 = c2717p8.f8659g;
                        AbstractC1665j.m2982b(c2717p14);
                        i6 = c2717p14.f8654b;
                    }
                    if (i9 <= i10 + i6) {
                        C2717p c2717p15 = c2717p8.f8659g;
                        AbstractC1665j.m2982b(c2717p15);
                        c2717p8.m4760d(c2717p15, i9);
                        c2717p8.m4757a();
                        AbstractC2718q.m4761a(c2717p8);
                    }
                }
            }
            c2706e.f8629e -= j7;
            this.f8629e += j7;
            j5 -= j7;
        }
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: q */
    public final long mo4723q(C2706e c2706e) {
        long j5 = this.f8629e;
        if (j5 > 0) {
            c2706e.mo3343p(this, j5);
        }
        return j5;
    }

    /* JADX INFO: renamed from: r */
    public final long m4724r(byte b2, long j5, long j6) {
        C2717p c2717p;
        long j7 = 0;
        if (0 > j5 || j5 > j6) {
            throw new IllegalArgumentException(("size=" + this.f8629e + " fromIndex=" + j5 + " toIndex=" + j6).toString());
        }
        long j8 = this.f8629e;
        if (j6 > j8) {
            j6 = j8;
        }
        if (j5 == j6 || (c2717p = this.f8628d) == null) {
            return -1L;
        }
        if (j8 - j5 < j5) {
            while (j8 > j5) {
                c2717p = c2717p.f8659g;
                AbstractC1665j.m2982b(c2717p);
                j8 -= (long) (c2717p.f8655c - c2717p.f8654b);
            }
            while (j8 < j6) {
                byte[] bArr = c2717p.f8653a;
                int iMin = (int) Math.min(c2717p.f8655c, (((long) c2717p.f8654b) + j6) - j8);
                for (int i5 = (int) ((((long) c2717p.f8654b) + j5) - j8); i5 < iMin; i5++) {
                    if (bArr[i5] == b2) {
                        return ((long) (i5 - c2717p.f8654b)) + j8;
                    }
                }
                j8 += (long) (c2717p.f8655c - c2717p.f8654b);
                c2717p = c2717p.f8658f;
                AbstractC1665j.m2982b(c2717p);
                j5 = j8;
            }
            return -1L;
        }
        while (true) {
            long j9 = ((long) (c2717p.f8655c - c2717p.f8654b)) + j7;
            if (j9 > j5) {
                break;
            }
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
            j7 = j9;
        }
        while (j7 < j6) {
            byte[] bArr2 = c2717p.f8653a;
            int iMin2 = (int) Math.min(c2717p.f8655c, (((long) c2717p.f8654b) + j6) - j7);
            for (int i6 = (int) ((((long) c2717p.f8654b) + j5) - j7); i6 < iMin2; i6++) {
                if (bArr2[i6] == b2) {
                    return ((long) (i6 - c2717p.f8654b)) + j7;
                }
            }
            j7 += (long) (c2717p.f8655c - c2717p.f8654b);
            c2717p = c2717p.f8658f;
            AbstractC1665j.m2982b(c2717p);
            j5 = j7;
        }
        return -1L;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1665j.m2985e(byteBuffer, "sink");
        C2717p c2717p = this.f8628d;
        if (c2717p == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c2717p.f8655c - c2717p.f8654b);
        byteBuffer.put(c2717p.f8653a, c2717p.f8654b, iMin);
        int i5 = c2717p.f8654b + iMin;
        c2717p.f8654b = i5;
        this.f8629e -= (long) iMin;
        if (i5 == c2717p.f8655c) {
            this.f8628d = c2717p.m4757a();
            AbstractC2718q.m4761a(c2717p);
        }
        return iMin;
    }

    @Override // p208n4.InterfaceC2708g
    public final byte readByte() throws EOFException {
        if (this.f8629e == 0) {
            throw new EOFException();
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        int i5 = c2717p.f8654b;
        int i6 = c2717p.f8655c;
        int i7 = i5 + 1;
        byte b2 = c2717p.f8653a[i5];
        this.f8629e--;
        if (i7 != i6) {
            c2717p.f8654b = i7;
            return b2;
        }
        this.f8628d = c2717p.m4757a();
        AbstractC2718q.m4761a(c2717p);
        return b2;
    }

    @Override // p208n4.InterfaceC2708g
    public final int readInt() throws EOFException {
        if (this.f8629e < 4) {
            throw new EOFException();
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        int i5 = c2717p.f8654b;
        int i6 = c2717p.f8655c;
        if (i6 - i5 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c2717p.f8653a;
        int i7 = i5 + 3;
        int i8 = ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 2] & 255) << 8);
        int i9 = i5 + 4;
        int i10 = (bArr[i7] & 255) | i8;
        this.f8629e -= 4;
        if (i9 != i6) {
            c2717p.f8654b = i9;
            return i10;
        }
        this.f8628d = c2717p.m4757a();
        AbstractC2718q.m4761a(c2717p);
        return i10;
    }

    @Override // p208n4.InterfaceC2708g
    public final short readShort() throws EOFException {
        if (this.f8629e < 2) {
            throw new EOFException();
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        int i5 = c2717p.f8654b;
        int i6 = c2717p.f8655c;
        if (i6 - i5 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c2717p.f8653a;
        int i7 = i5 + 1;
        int i8 = (bArr[i5] & 255) << 8;
        int i9 = i5 + 2;
        int i10 = (bArr[i7] & 255) | i8;
        this.f8629e -= 2;
        if (i9 == i6) {
            this.f8628d = c2717p.m4757a();
            AbstractC2718q.m4761a(c2717p);
        } else {
            c2717p.f8654b = i9;
        }
        return (short) i10;
    }

    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ InterfaceC2707f mo4725s(int i5, byte[] bArr) {
        write(bArr, 0, i5);
        return this;
    }

    @Override // p208n4.InterfaceC2708g
    public final void skip(long j5) throws EOFException {
        while (j5 > 0) {
            C2717p c2717p = this.f8628d;
            if (c2717p == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j5, c2717p.f8655c - c2717p.f8654b);
            long j6 = iMin;
            this.f8629e -= j6;
            j5 -= j6;
            int i5 = c2717p.f8654b + iMin;
            c2717p.f8654b = i5;
            if (i5 == c2717p.f8655c) {
                this.f8628d = c2717p.m4757a();
                AbstractC2718q.m4761a(c2717p);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m4726t(long j5) throws EOFException {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f8629e < j5) {
            throw new EOFException();
        }
        int i5 = (int) j5;
        byte[] bArr = new byte[i5];
        int i6 = 0;
        while (i6 < i5) {
            int i7 = read(bArr, i6, i5 - i6);
            if (i7 == -1) {
                throw new EOFException();
            }
            i6 += i7;
        }
        return bArr;
    }

    public final String toString() {
        long j5 = this.f8629e;
        if (j5 <= 2147483647L) {
            return m4701C((int) j5).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f8629e).toString());
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: u */
    public final void mo4727u(long j5) throws EOFException {
        if (this.f8629e < j5) {
            throw new EOFException();
        }
    }

    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ InterfaceC2707f mo4728v(String str) {
        m4711M(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[EDGE_INSN: B:44:0x00a2->B:38:0x00a2 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m4729w() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f8629e
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La9
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            n4.p r7 = r15.f8628d
            p117X2.AbstractC1665j.m2982b(r7)
            byte[] r8 = r7.f8653a
            int r9 = r7.f8654b
            int r10 = r7.f8655c
        L17:
            if (r9 >= r10) goto L8e
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L66
            r12 = 70
            if (r11 > r12) goto L66
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            n4.e r0 = new n4.e
            r0.<init>()
            r0.m4707I(r4)
            r0.m4705G(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.m4699A()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L66:
            r6 = 1
            if (r1 == 0) goto L6a
            goto L8e
        L6a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = p215o4.AbstractC2803b.f8827a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L8e:
            if (r9 != r10) goto L9a
            n4.p r8 = r7.m4757a()
            r15.f8628d = r8
            p208n4.AbstractC2718q.m4761a(r7)
            goto L9c
        L9a:
            r7.f8654b = r9
        L9c:
            if (r6 != 0) goto La2
            n4.p r7 = r15.f8628d
            if (r7 != 0) goto Lc
        La2:
            long r2 = r15.f8629e
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f8629e = r2
            return r4
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p208n4.C2706e.m4729w():long");
    }

    @Override // p208n4.InterfaceC2707f
    public final InterfaceC2707f write(byte[] bArr) {
        AbstractC1665j.m2985e(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    @Override // p208n4.InterfaceC2707f
    public final /* bridge */ /* synthetic */ InterfaceC2707f writeByte(int i5) {
        m4705G(i5);
        return this;
    }

    @Override // p208n4.InterfaceC2707f
    public final /* bridge */ /* synthetic */ InterfaceC2707f writeInt(int i5) {
        m4708J(i5);
        return this;
    }

    @Override // p208n4.InterfaceC2707f
    public final /* bridge */ /* synthetic */ InterfaceC2707f writeShort(int i5) {
        m4709K(i5);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final String m4730x(long j5, Charset charset) throws EOFException {
        AbstractC1665j.m2985e(charset, "charset");
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j5).toString());
        }
        if (this.f8629e < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        C2717p c2717p = this.f8628d;
        AbstractC1665j.m2982b(c2717p);
        int i5 = c2717p.f8654b;
        if (((long) i5) + j5 > c2717p.f8655c) {
            return new String(m4726t(j5), charset);
        }
        int i6 = (int) j5;
        String str = new String(c2717p.f8653a, i5, i6, charset);
        int i7 = c2717p.f8654b + i6;
        c2717p.f8654b = i7;
        this.f8629e -= j5;
        if (i7 == c2717p.f8655c) {
            this.f8628d = c2717p.m4757a();
            AbstractC2718q.m4761a(c2717p);
        }
        return str;
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public final long mo554y(C2706e c2706e, long j5) {
        AbstractC1665j.m2985e(c2706e, "sink");
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        long j6 = this.f8629e;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        c2706e.mo3343p(this, j5);
        return j5;
    }

    @Override // p208n4.InterfaceC2708g
    /* JADX INFO: renamed from: z */
    public final String mo4731z(Charset charset) {
        AbstractC1665j.m2985e(charset, "charset");
        return m4730x(this.f8629e, charset);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1665j.m2985e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i5 = iRemaining;
        while (i5 > 0) {
            C2717p c2717pM4702D = m4702D(1);
            int iMin = Math.min(i5, 8192 - c2717pM4702D.f8655c);
            byteBuffer.get(c2717pM4702D.f8653a, c2717pM4702D.f8655c, iMin);
            i5 -= iMin;
            c2717pM4702D.f8655c += iMin;
        }
        this.f8629e += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i5, int i6) {
        AbstractC1926h.m3564g(bArr.length, i5, i6);
        C2717p c2717p = this.f8628d;
        if (c2717p == null) {
            return -1;
        }
        int iMin = Math.min(i6, c2717p.f8655c - c2717p.f8654b);
        byte[] bArr2 = c2717p.f8653a;
        int i7 = c2717p.f8654b;
        AbstractC0972l.m1989M(i5, i7, i7 + iMin, bArr2, bArr);
        int i8 = c2717p.f8654b + iMin;
        c2717p.f8654b = i8;
        this.f8629e -= (long) iMin;
        if (i8 == c2717p.f8655c) {
            this.f8628d = c2717p.m4757a();
            AbstractC2718q.m4761a(c2717p);
        }
        return iMin;
    }

    public final void write(byte[] bArr, int i5, int i6) {
        AbstractC1665j.m2985e(bArr, "source");
        long j5 = i6;
        AbstractC1926h.m3564g(bArr.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            C2717p c2717pM4702D = m4702D(1);
            int iMin = Math.min(i7 - i5, 8192 - c2717pM4702D.f8655c);
            int i8 = i5 + iMin;
            AbstractC0972l.m1989M(c2717pM4702D.f8655c, i5, i8, bArr, c2717pM4702D.f8653a);
            c2717pM4702D.f8655c += iMin;
            i5 = i8;
        }
        this.f8629e += j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p208n4.InterfaceC2720s
    public final void close() {
    }

    @Override // p208n4.InterfaceC2707f, p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() {
    }

    @Override // p208n4.InterfaceC2707f
    /* JADX INFO: renamed from: k */
    public final C2706e mo4718k() {
        return this;
    }
}
