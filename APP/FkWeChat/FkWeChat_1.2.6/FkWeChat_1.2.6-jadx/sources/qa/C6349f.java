package qa;

import com.alibaba.fastjson2.JSONB;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.url._UrlKt;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: qa.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6349f {

    /* JADX INFO: renamed from: d */
    public int f19976d;

    /* JADX INFO: renamed from: f */
    public final InputStream f19978f;

    /* JADX INFO: renamed from: g */
    public int f19979g;

    /* JADX INFO: renamed from: k */
    public int f19983k;

    /* JADX INFO: renamed from: h */
    public boolean f19980h = false;

    /* JADX INFO: renamed from: j */
    public int f19982j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public int f19984l = 64;

    /* JADX INFO: renamed from: m */
    public int f19985m = 67108864;

    /* JADX INFO: renamed from: a */
    public final byte[] f19973a = new byte[4096];

    /* JADX INFO: renamed from: c */
    public int f19975c = 0;

    /* JADX INFO: renamed from: e */
    public int f19977e = 0;

    /* JADX INFO: renamed from: i */
    public int f19981i = 0;

    /* JADX INFO: renamed from: b */
    public final boolean f19974b = false;

    public C6349f(InputStream inputStream) {
        this.f19978f = inputStream;
    }

    /* JADX INFO: renamed from: A */
    public static int m25059A(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw C6355l.m25259k();
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw C6355l.m25259k();
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw C6355l.m25255f();
    }

    /* JADX INFO: renamed from: b */
    public static int m25060b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m25061c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* JADX INFO: renamed from: g */
    public static C6349f m25062g(InputStream inputStream) {
        return new C6349f(inputStream);
    }

    /* JADX INFO: renamed from: B */
    public long m25063B() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f19977e;
        int i11 = this.f19975c;
        if (i11 != i10) {
            byte[] bArr = this.f19973a;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f19977e = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                long j13 = (bArr[i12] << 7) ^ b10;
                if (j13 >= 0) {
                    int i14 = i10 + 3;
                    long j14 = j13 ^ ((long) (bArr[i13] << 14));
                    if (j14 >= 0) {
                        j12 = 16256;
                    } else {
                        i13 = i10 + 4;
                        j13 = j14 ^ ((long) (bArr[i14] << 21));
                        if (j13 < 0) {
                            j11 = -2080896;
                        } else {
                            i14 = i10 + 5;
                            j14 = j13 ^ (((long) bArr[i13]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                i13 = i10 + 6;
                                j13 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j13 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i10 + 7;
                                    j14 = j13 ^ (((long) bArr[i13]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j13 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j13 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i10 + 9;
                                            long j15 = (j13 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j15 >= 0) {
                                                j10 = j15;
                                                i13 = i14;
                                                this.f19977e = i13;
                                                return j10;
                                            }
                                            i13 = i10 + 10;
                                            if (bArr[i14] >= 0) {
                                                j10 = j15;
                                                this.f19977e = i13;
                                                return j10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j10 = j14 ^ j12;
                    i13 = i14;
                    this.f19977e = i13;
                    return j10;
                }
                j11 = -128;
                j10 = j13 ^ j11;
                this.f19977e = i13;
                return j10;
            }
        }
        return m25064C();
    }

    /* JADX INFO: renamed from: C */
    public long m25064C() throws C6355l {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bM25099v = m25099v();
            j10 |= ((long) (bM25099v & JSONB.Constants.BC_SYMBOL)) << i10;
            if ((bM25099v & 128) == 0) {
                return j10;
            }
        }
        throw C6355l.m25255f();
    }

    /* JADX INFO: renamed from: D */
    public int m25065D() {
        return m25101x();
    }

    /* JADX INFO: renamed from: E */
    public long m25066E() {
        return m25102y();
    }

    /* JADX INFO: renamed from: F */
    public int m25067F() {
        return m25060b(m25103z());
    }

    /* JADX INFO: renamed from: G */
    public long m25068G() {
        return m25061c(m25063B());
    }

    /* JADX INFO: renamed from: H */
    public String m25069H() {
        int iM25103z = m25103z();
        int i10 = this.f19975c;
        int i11 = this.f19977e;
        if (iM25103z > i10 - i11 || iM25103z <= 0) {
            return iM25103z == 0 ? _UrlKt.FRAGMENT_ENCODE_SET : new String(m25100w(iM25103z), "UTF-8");
        }
        String str = new String(this.f19973a, i11, iM25103z, "UTF-8");
        this.f19977e += iM25103z;
        return str;
    }

    /* JADX INFO: renamed from: I */
    public String m25070I() throws C6355l {
        byte[] bArrM25100w;
        int iM25103z = m25103z();
        int i10 = this.f19977e;
        if (iM25103z <= this.f19975c - i10 && iM25103z > 0) {
            bArrM25100w = this.f19973a;
            this.f19977e = i10 + iM25103z;
        } else {
            if (iM25103z == 0) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            bArrM25100w = m25100w(iM25103z);
            i10 = 0;
        }
        if (AbstractC6368y.m25329f(bArrM25100w, i10, i10 + iM25103z)) {
            return new String(bArrM25100w, i10, iM25103z, "UTF-8");
        }
        throw C6355l.m25253d();
    }

    /* JADX INFO: renamed from: J */
    public int m25071J() throws C6355l {
        if (m25084f()) {
            this.f19979g = 0;
            return 0;
        }
        int iM25103z = m25103z();
        this.f19979g = iM25103z;
        if (AbstractC6369z.m25333a(iM25103z) != 0) {
            return this.f19979g;
        }
        throw C6355l.m25252c();
    }

    /* JADX INFO: renamed from: K */
    public int m25072K() {
        return m25103z();
    }

    /* JADX INFO: renamed from: L */
    public long m25073L() {
        return m25063B();
    }

    /* JADX INFO: renamed from: M */
    public final void m25074M() {
        int i10 = this.f19975c + this.f19976d;
        this.f19975c = i10;
        int i11 = this.f19981i + i10;
        int i12 = this.f19982j;
        if (i11 <= i12) {
            this.f19976d = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f19976d = i13;
        this.f19975c = i10 - i13;
    }

    /* JADX INFO: renamed from: N */
    public final void m25075N(int i10) throws C6355l {
        if (!m25080S(i10)) {
            throw C6355l.m25259k();
        }
    }

    /* JADX INFO: renamed from: O */
    public boolean m25076O(int i10, C6350g c6350g) throws C6355l {
        int iM25334b = AbstractC6369z.m25334b(i10);
        if (iM25334b == 0) {
            long jM25096s = m25096s();
            c6350g.m25169n0(i10);
            c6350g.m25180y0(jM25096s);
            return true;
        }
        if (iM25334b == 1) {
            long jM25102y = m25102y();
            c6350g.m25169n0(i10);
            c6350g.m25150U(jM25102y);
            return true;
        }
        if (iM25334b == 2) {
            AbstractC6348e abstractC6348eM25088k = m25088k();
            c6350g.m25169n0(i10);
            c6350g.m25144O(abstractC6348eM25088k);
            return true;
        }
        if (iM25334b == 3) {
            c6350g.m25169n0(i10);
            m25077P(c6350g);
            int iM25335c = AbstractC6369z.m25335c(AbstractC6369z.m25333a(i10), 4);
            m25081a(iM25335c);
            c6350g.m25169n0(iM25335c);
            return true;
        }
        if (iM25334b == 4) {
            return false;
        }
        if (iM25334b != 5) {
            throw C6355l.m25254e();
        }
        int iM25101x = m25101x();
        c6350g.m25169n0(i10);
        c6350g.m25149T(iM25101x);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public void m25077P(C6350g c6350g) throws C6355l {
        int iM25071J;
        do {
            iM25071J = m25071J();
            if (iM25071J == 0) {
                return;
            }
        } while (m25076O(iM25071J, c6350g));
    }

    /* JADX INFO: renamed from: Q */
    public void m25078Q(int i10) throws C6355l {
        int i11 = this.f19975c;
        int i12 = this.f19977e;
        if (i10 > i11 - i12 || i10 < 0) {
            m25079R(i10);
        } else {
            this.f19977e = i12 + i10;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m25079R(int i10) throws C6355l {
        if (i10 < 0) {
            throw C6355l.m25256g();
        }
        int i11 = this.f19981i;
        int i12 = this.f19977e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f19982j;
        if (i13 > i14) {
            m25078Q((i14 - i11) - i12);
            throw C6355l.m25259k();
        }
        int i15 = this.f19975c;
        int i16 = i15 - i12;
        this.f19977e = i15;
        m25075N(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.f19975c;
            if (i17 <= i18) {
                this.f19977e = i17;
                return;
            } else {
                i16 += i18;
                this.f19977e = i18;
                m25075N(1);
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m25080S(int i10) throws IOException {
        int i11 = this.f19977e;
        int i12 = i11 + i10;
        int i13 = this.f19975c;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f19981i + i11 + i10 <= this.f19982j && this.f19978f != null) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f19973a;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f19981i += i11;
                this.f19975c -= i11;
                this.f19977e = 0;
            }
            InputStream inputStream = this.f19978f;
            byte[] bArr2 = this.f19973a;
            int i14 = this.f19975c;
            int i15 = inputStream.read(bArr2, i14, bArr2.length - i14);
            if (i15 == 0 || i15 < -1 || i15 > this.f19973a.length) {
                StringBuilder sb3 = new StringBuilder(HttpStatusCodesKt.HTTP_PROCESSING);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(i15);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (i15 > 0) {
                this.f19975c += i15;
                if ((this.f19981i + i10) - this.f19985m > 0) {
                    throw C6355l.m25258j();
                }
                m25074M();
                if (this.f19975c >= i10) {
                    return true;
                }
                return m25080S(i10);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m25081a(int i10) throws C6355l {
        if (this.f19979g != i10) {
            throw C6355l.m25251b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m25082d(int i10) throws C6355l {
        if (this.f19975c - this.f19977e < i10) {
            m25075N(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m25083e() {
        int i10 = this.f19982j;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f19981i + this.f19977e);
    }

    /* JADX INFO: renamed from: f */
    public boolean m25084f() {
        return this.f19977e == this.f19975c && !m25080S(1);
    }

    /* JADX INFO: renamed from: h */
    public void m25085h(int i10) {
        this.f19982j = i10;
        m25074M();
    }

    /* JADX INFO: renamed from: i */
    public int m25086i(int i10) throws C6355l {
        if (i10 < 0) {
            throw C6355l.m25256g();
        }
        int i11 = i10 + this.f19981i + this.f19977e;
        int i12 = this.f19982j;
        if (i11 > i12) {
            throw C6355l.m25259k();
        }
        this.f19982j = i11;
        m25074M();
        return i12;
    }

    /* JADX INFO: renamed from: j */
    public boolean m25087j() {
        return m25063B() != 0;
    }

    /* JADX INFO: renamed from: k */
    public AbstractC6348e m25088k() {
        int iM25103z = m25103z();
        int i10 = this.f19975c;
        int i11 = this.f19977e;
        if (iM25103z > i10 - i11 || iM25103z <= 0) {
            return iM25103z == 0 ? AbstractC6348e.f19966q : new C6359p(m25100w(iM25103z));
        }
        AbstractC6348e c6346c = (this.f19974b && this.f19980h) ? new C6346c(this.f19973a, this.f19977e, iM25103z) : AbstractC6348e.m25038h(this.f19973a, i11, iM25103z);
        this.f19977e += iM25103z;
        return c6346c;
    }

    /* JADX INFO: renamed from: l */
    public double m25089l() {
        return Double.longBitsToDouble(m25102y());
    }

    /* JADX INFO: renamed from: m */
    public int m25090m() {
        return m25103z();
    }

    /* JADX INFO: renamed from: n */
    public int m25091n() {
        return m25101x();
    }

    /* JADX INFO: renamed from: o */
    public long m25092o() {
        return m25102y();
    }

    /* JADX INFO: renamed from: p */
    public float m25093p() {
        return Float.intBitsToFloat(m25101x());
    }

    /* JADX INFO: renamed from: q */
    public void m25094q(int i10, InterfaceC6360q.a aVar, C6351h c6351h) throws C6355l {
        int i11 = this.f19983k;
        if (i11 >= this.f19984l) {
            throw C6355l.m25257h();
        }
        this.f19983k = i11 + 1;
        aVar.mo14018e(this, c6351h);
        m25081a(AbstractC6369z.m25335c(i10, 4));
        this.f19983k--;
    }

    /* JADX INFO: renamed from: r */
    public int m25095r() {
        return m25103z();
    }

    /* JADX INFO: renamed from: s */
    public long m25096s() {
        return m25063B();
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC6360q m25097t(InterfaceC6362s interfaceC6362s, C6351h c6351h) throws C6355l {
        int iM25103z = m25103z();
        if (this.f19983k >= this.f19984l) {
            throw C6355l.m25257h();
        }
        int iM25086i = m25086i(iM25103z);
        this.f19983k++;
        InterfaceC6360q interfaceC6360q = (InterfaceC6360q) interfaceC6362s.mo13999c(this, c6351h);
        m25081a(0);
        this.f19983k--;
        m25085h(iM25086i);
        return interfaceC6360q;
    }

    /* JADX INFO: renamed from: u */
    public void m25098u(InterfaceC6360q.a aVar, C6351h c6351h) throws C6355l {
        int iM25103z = m25103z();
        if (this.f19983k >= this.f19984l) {
            throw C6355l.m25257h();
        }
        int iM25086i = m25086i(iM25103z);
        this.f19983k++;
        aVar.mo14018e(this, c6351h);
        m25081a(0);
        this.f19983k--;
        m25085h(iM25086i);
    }

    /* JADX INFO: renamed from: v */
    public byte m25099v() throws C6355l {
        if (this.f19977e == this.f19975c) {
            m25075N(1);
        }
        byte[] bArr = this.f19973a;
        int i10 = this.f19977e;
        this.f19977e = i10 + 1;
        return bArr[i10];
    }

    /* JADX INFO: renamed from: w */
    public final byte[] m25100w(int i10) throws C6355l {
        if (i10 <= 0) {
            if (i10 == 0) {
                return AbstractC6354k.f20021a;
            }
            throw C6355l.m25256g();
        }
        int i11 = this.f19981i;
        int i12 = this.f19977e;
        int i13 = i11 + i12 + i10;
        int i14 = this.f19982j;
        if (i13 > i14) {
            m25078Q((i14 - i11) - i12);
            throw C6355l.m25259k();
        }
        if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.f19975c - i12;
            System.arraycopy(this.f19973a, i12, bArr, 0, i15);
            this.f19977e = this.f19975c;
            int i16 = i10 - i15;
            m25082d(i16);
            System.arraycopy(this.f19973a, 0, bArr, i15, i16);
            this.f19977e = i16;
            return bArr;
        }
        int i17 = this.f19975c;
        this.f19981i = i11 + i17;
        this.f19977e = 0;
        this.f19975c = 0;
        int length = i17 - i12;
        int i18 = i10 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i18 > 0) {
            int iMin = Math.min(i18, 4096);
            byte[] bArr2 = new byte[iMin];
            int i19 = 0;
            while (i19 < iMin) {
                InputStream inputStream = this.f19978f;
                int i20 = inputStream == null ? -1 : inputStream.read(bArr2, i19, iMin - i19);
                if (i20 == -1) {
                    throw C6355l.m25259k();
                }
                this.f19981i += i20;
                i19 += i20;
            }
            i18 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i10];
        System.arraycopy(this.f19973a, i12, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: x */
    public int m25101x() throws C6355l {
        int i10 = this.f19977e;
        if (this.f19975c - i10 < 4) {
            m25075N(4);
            i10 = this.f19977e;
        }
        byte[] bArr = this.f19973a;
        this.f19977e = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: y */
    public long m25102y() throws C6355l {
        int i10 = this.f19977e;
        if (this.f19975c - i10 < 8) {
            m25075N(8);
            i10 = this.f19977e;
        }
        byte[] bArr = this.f19973a;
        this.f19977e = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: z */
    public int m25103z() {
        int i10;
        int i11 = this.f19977e;
        int i12 = this.f19975c;
        if (i12 != i11) {
            byte[] bArr = this.f19973a;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f19977e = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                long j10 = i15;
                if (j10 < 0) {
                    i10 = (int) ((-128) ^ j10);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    long j11 = i17;
                    if (j11 >= 0) {
                        i10 = (int) (16256 ^ j11);
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        long j12 = i19;
                        if (j12 < 0) {
                            i10 = (int) ((-2080896) ^ j12);
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (int) (((long) (i19 ^ (b11 << 28))) ^ 266354560);
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f19977e = i14;
                return i10;
            }
        }
        return (int) m25064C();
    }
}
