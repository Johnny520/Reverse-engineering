package qa;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import p280t5.C8130u;

/* JADX INFO: renamed from: qa.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6350g {

    /* JADX INFO: renamed from: a */
    public final byte[] f19986a;

    /* JADX INFO: renamed from: b */
    public final int f19987b;

    /* JADX INFO: renamed from: e */
    public final OutputStream f19990e;

    /* JADX INFO: renamed from: d */
    public int f19989d = 0;

    /* JADX INFO: renamed from: c */
    public int f19988c = 0;

    /* JADX INFO: renamed from: qa.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends IOException {
        public a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C6350g(OutputStream outputStream, byte[] bArr) {
        this.f19990e = outputStream;
        this.f19986a = bArr;
        this.f19987b = bArr.length;
    }

    /* JADX INFO: renamed from: A */
    public static int m25104A(long j10) {
        return m25133v(m25110G(j10));
    }

    /* JADX INFO: renamed from: B */
    public static int m25105B(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m25132u(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            C8130u.m31512a("UTF-8 not supported.", e10);
            return 0;
        }
    }

    /* JADX INFO: renamed from: C */
    public static int m25106C(int i10) {
        return m25132u(AbstractC6369z.m25335c(i10, 0));
    }

    /* JADX INFO: renamed from: D */
    public static int m25107D(int i10) {
        return m25132u(i10);
    }

    /* JADX INFO: renamed from: E */
    public static int m25108E(long j10) {
        return m25133v(j10);
    }

    /* JADX INFO: renamed from: F */
    public static int m25109F(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* JADX INFO: renamed from: G */
    public static long m25110G(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* JADX INFO: renamed from: I */
    public static C6350g m25111I(OutputStream outputStream, int i10) {
        return new C6350g(outputStream, new byte[i10]);
    }

    /* JADX INFO: renamed from: a */
    public static int m25112a(int i10, boolean z10) {
        return m25106C(i10) + m25113b(z10);
    }

    /* JADX INFO: renamed from: b */
    public static int m25113b(boolean z10) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m25114c(byte[] bArr) {
        return m25132u(bArr.length) + bArr.length;
    }

    /* JADX INFO: renamed from: d */
    public static int m25115d(int i10, AbstractC6348e abstractC6348e) {
        return m25106C(i10) + m25116e(abstractC6348e);
    }

    /* JADX INFO: renamed from: e */
    public static int m25116e(AbstractC6348e abstractC6348e) {
        return m25132u(abstractC6348e.size()) + abstractC6348e.size();
    }

    /* JADX INFO: renamed from: f */
    public static int m25117f(int i10, double d10) {
        return m25106C(i10) + m25118g(d10);
    }

    /* JADX INFO: renamed from: g */
    public static int m25118g(double d10) {
        return 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m25119h(int i10, int i11) {
        return m25106C(i10) + m25120i(i11);
    }

    /* JADX INFO: renamed from: i */
    public static int m25120i(int i10) {
        return m25127p(i10);
    }

    /* JADX INFO: renamed from: j */
    public static int m25121j(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: k */
    public static int m25122k(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m25123l(int i10, float f10) {
        return m25106C(i10) + m25124m(f10);
    }

    /* JADX INFO: renamed from: m */
    public static int m25124m(float f10) {
        return 4;
    }

    /* JADX INFO: renamed from: n */
    public static int m25125n(InterfaceC6360q interfaceC6360q) {
        return interfaceC6360q.mo13994f();
    }

    /* JADX INFO: renamed from: o */
    public static int m25126o(int i10, int i11) {
        return m25106C(i10) + m25127p(i11);
    }

    /* JADX INFO: renamed from: p */
    public static int m25127p(int i10) {
        if (i10 >= 0) {
            return m25132u(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: q */
    public static int m25128q(long j10) {
        return m25133v(j10);
    }

    /* JADX INFO: renamed from: r */
    public static int m25129r(int i10, InterfaceC6360q interfaceC6360q) {
        return m25106C(i10) + m25130s(interfaceC6360q);
    }

    /* JADX INFO: renamed from: s */
    public static int m25130s(InterfaceC6360q interfaceC6360q) {
        int iMo13994f = interfaceC6360q.mo13994f();
        return m25132u(iMo13994f) + iMo13994f;
    }

    /* JADX INFO: renamed from: t */
    public static int m25131t(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    /* JADX INFO: renamed from: u */
    public static int m25132u(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: v */
    public static int m25133v(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: w */
    public static int m25134w(int i10) {
        return 4;
    }

    /* JADX INFO: renamed from: x */
    public static int m25135x(long j10) {
        return 8;
    }

    /* JADX INFO: renamed from: y */
    public static int m25136y(int i10) {
        return m25132u(m25109F(i10));
    }

    /* JADX INFO: renamed from: z */
    public static int m25137z(int i10, long j10) {
        return m25106C(i10) + m25104A(j10);
    }

    /* JADX INFO: renamed from: H */
    public void m25138H() throws IOException {
        if (this.f19990e != null) {
            m25139J();
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m25139J() throws IOException {
        OutputStream outputStream = this.f19990e;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f19986a, 0, this.f19988c);
        this.f19988c = 0;
    }

    /* JADX INFO: renamed from: K */
    public void m25140K(int i10, boolean z10) throws IOException {
        m25177v0(i10, 0);
        m25141L(z10);
    }

    /* JADX INFO: renamed from: L */
    public void m25141L(boolean z10) throws IOException {
        m25162g0(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: M */
    public void m25142M(byte[] bArr) throws IOException {
        m25169n0(bArr.length);
        m25165j0(bArr);
    }

    /* JADX INFO: renamed from: N */
    public void m25143N(int i10, AbstractC6348e abstractC6348e) {
        m25177v0(i10, 2);
        m25144O(abstractC6348e);
    }

    /* JADX INFO: renamed from: O */
    public void m25144O(AbstractC6348e abstractC6348e) {
        m25169n0(abstractC6348e.size());
        m25163h0(abstractC6348e);
    }

    /* JADX INFO: renamed from: P */
    public void m25145P(int i10, double d10) throws IOException {
        m25177v0(i10, 1);
        m25146Q(d10);
    }

    /* JADX INFO: renamed from: Q */
    public void m25146Q(double d10) throws IOException {
        m25168m0(Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: R */
    public void m25147R(int i10, int i11) throws IOException {
        m25177v0(i10, 0);
        m25148S(i11);
    }

    /* JADX INFO: renamed from: S */
    public void m25148S(int i10) throws IOException {
        m25156a0(i10);
    }

    /* JADX INFO: renamed from: T */
    public void m25149T(int i10) {
        m25167l0(i10);
    }

    /* JADX INFO: renamed from: U */
    public void m25150U(long j10) {
        m25168m0(j10);
    }

    /* JADX INFO: renamed from: V */
    public void m25151V(int i10, float f10) throws IOException {
        m25177v0(i10, 5);
        m25152W(f10);
    }

    /* JADX INFO: renamed from: W */
    public void m25152W(float f10) throws IOException {
        m25167l0(Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: X */
    public void m25153X(int i10, InterfaceC6360q interfaceC6360q) {
        m25177v0(i10, 3);
        m25154Y(interfaceC6360q);
        m25177v0(i10, 4);
    }

    /* JADX INFO: renamed from: Y */
    public void m25154Y(InterfaceC6360q interfaceC6360q) {
        interfaceC6360q.mo13993d(this);
    }

    /* JADX INFO: renamed from: Z */
    public void m25155Z(int i10, int i11) throws IOException {
        m25177v0(i10, 0);
        m25156a0(i11);
    }

    /* JADX INFO: renamed from: a0 */
    public void m25156a0(int i10) throws IOException {
        if (i10 >= 0) {
            m25169n0(i10);
        } else {
            m25170o0(i10);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m25157b0(long j10) throws IOException {
        m25170o0(j10);
    }

    /* JADX INFO: renamed from: c0 */
    public void m25158c0(int i10, InterfaceC6360q interfaceC6360q) {
        m25177v0(i10, 2);
        m25159d0(interfaceC6360q);
    }

    /* JADX INFO: renamed from: d0 */
    public void m25159d0(InterfaceC6360q interfaceC6360q) {
        m25169n0(interfaceC6360q.mo13994f());
        interfaceC6360q.mo13993d(this);
    }

    /* JADX INFO: renamed from: e0 */
    public void m25160e0(int i10, InterfaceC6360q interfaceC6360q) {
        m25177v0(1, 3);
        m25178w0(2, i10);
        m25158c0(3, interfaceC6360q);
        m25177v0(1, 4);
    }

    /* JADX INFO: renamed from: f0 */
    public void m25161f0(byte b10) throws IOException {
        if (this.f19988c == this.f19987b) {
            m25139J();
        }
        byte[] bArr = this.f19986a;
        int i10 = this.f19988c;
        this.f19988c = i10 + 1;
        bArr[i10] = b10;
        this.f19989d++;
    }

    /* JADX INFO: renamed from: g0 */
    public void m25162g0(int i10) throws IOException {
        m25161f0((byte) i10);
    }

    /* JADX INFO: renamed from: h0 */
    public void m25163h0(AbstractC6348e abstractC6348e) throws IOException {
        m25164i0(abstractC6348e, 0, abstractC6348e.size());
    }

    /* JADX INFO: renamed from: i0 */
    public void m25164i0(AbstractC6348e abstractC6348e, int i10, int i11) throws IOException {
        int i12 = this.f19987b;
        int i13 = this.f19988c;
        int i14 = i12 - i13;
        byte[] bArr = this.f19986a;
        if (i14 >= i11) {
            abstractC6348e.m25044o(bArr, i10, i13, i11);
            this.f19988c += i11;
            this.f19989d += i11;
            return;
        }
        int i15 = i12 - i13;
        abstractC6348e.m25044o(bArr, i10, i13, i15);
        int i16 = i10 + i15;
        int i17 = i11 - i15;
        this.f19988c = this.f19987b;
        this.f19989d += i15;
        m25139J();
        if (i17 <= this.f19987b) {
            abstractC6348e.m25044o(this.f19986a, i16, 0, i17);
            this.f19988c = i17;
        } else {
            abstractC6348e.m25041A(this.f19990e, i16, i17);
        }
        this.f19989d += i17;
    }

    /* JADX INFO: renamed from: j0 */
    public void m25165j0(byte[] bArr) throws IOException {
        m25166k0(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k0 */
    public void m25166k0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f19987b;
        int i13 = this.f19988c;
        int i14 = i12 - i13;
        byte[] bArr2 = this.f19986a;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i13, i11);
            this.f19988c += i11;
            this.f19989d += i11;
            return;
        }
        int i15 = i12 - i13;
        System.arraycopy(bArr, i10, bArr2, i13, i15);
        int i16 = i10 + i15;
        int i17 = i11 - i15;
        this.f19988c = this.f19987b;
        this.f19989d += i15;
        m25139J();
        if (i17 <= this.f19987b) {
            System.arraycopy(bArr, i16, this.f19986a, 0, i17);
            this.f19988c = i17;
        } else {
            this.f19990e.write(bArr, i16, i17);
        }
        this.f19989d += i17;
    }

    /* JADX INFO: renamed from: l0 */
    public void m25167l0(int i10) throws IOException {
        m25162g0(i10 & 255);
        m25162g0((i10 >> 8) & 255);
        m25162g0((i10 >> 16) & 255);
        m25162g0((i10 >> 24) & 255);
    }

    /* JADX INFO: renamed from: m0 */
    public void m25168m0(long j10) throws IOException {
        m25162g0(((int) j10) & 255);
        m25162g0(((int) (j10 >> 8)) & 255);
        m25162g0(((int) (j10 >> 16)) & 255);
        m25162g0(((int) (j10 >> 24)) & 255);
        m25162g0(((int) (j10 >> 32)) & 255);
        m25162g0(((int) (j10 >> 40)) & 255);
        m25162g0(((int) (j10 >> 48)) & 255);
        m25162g0(((int) (j10 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: n0 */
    public void m25169n0(int i10) {
        while ((i10 & (-128)) != 0) {
            m25162g0((i10 & 127) | 128);
            i10 >>>= 7;
        }
        m25162g0(i10);
    }

    /* JADX INFO: renamed from: o0 */
    public void m25170o0(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            m25162g0((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        m25162g0((int) j10);
    }

    /* JADX INFO: renamed from: p0 */
    public void m25171p0(int i10) throws IOException {
        m25167l0(i10);
    }

    /* JADX INFO: renamed from: q0 */
    public void m25172q0(long j10) throws IOException {
        m25168m0(j10);
    }

    /* JADX INFO: renamed from: r0 */
    public void m25173r0(int i10) {
        m25169n0(m25109F(i10));
    }

    /* JADX INFO: renamed from: s0 */
    public void m25174s0(int i10, long j10) throws IOException {
        m25177v0(i10, 0);
        m25175t0(j10);
    }

    /* JADX INFO: renamed from: t0 */
    public void m25175t0(long j10) throws IOException {
        m25170o0(m25110G(j10));
    }

    /* JADX INFO: renamed from: u0 */
    public void m25176u0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m25169n0(bytes.length);
        m25165j0(bytes);
    }

    /* JADX INFO: renamed from: v0 */
    public void m25177v0(int i10, int i11) {
        m25169n0(AbstractC6369z.m25335c(i10, i11));
    }

    /* JADX INFO: renamed from: w0 */
    public void m25178w0(int i10, int i11) {
        m25177v0(i10, 0);
        m25179x0(i11);
    }

    /* JADX INFO: renamed from: x0 */
    public void m25179x0(int i10) {
        m25169n0(i10);
    }

    /* JADX INFO: renamed from: y0 */
    public void m25180y0(long j10) {
        m25170o0(j10);
    }
}
