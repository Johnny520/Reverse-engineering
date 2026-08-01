package p215oc;

import com.alibaba.fastjson2.JSONWriter;
import java.io.EOFException;
import p376zd.C9987e;
import p376zd.C9991g;
import tc.AbstractC8219e;
import tc.C8218d;
import tc.InterfaceC8216b;

/* JADX INFO: renamed from: oc.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5708d implements InterfaceC5728w, InterfaceC5726u {

    /* JADX INFO: renamed from: q */
    public C5721p f18034q;

    /* JADX INFO: renamed from: r */
    public C5721p f18035r;

    /* JADX INFO: renamed from: s */
    public long f18036s;

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: D */
    public long mo23095D(InterfaceC5717l interfaceC5717l) {
        interfaceC5717l.getClass();
        long jM23111j = m23111j();
        if (jM23111j > 0) {
            interfaceC5717l.mo23106e0(this, jM23111j);
        }
        return jM23111j;
    }

    /* JADX INFO: renamed from: F */
    public final Void m23096F(long j10) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + m23111j() + ", required: " + j10 + ')');
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C5721p m23097G(int i10) {
        if (i10 < 1 || i10 > 8192) {
            C5704b.m23087a("unexpected capacity (", i10, "), should be in range [1, 8192]");
            return null;
        }
        C5721p c5721p = this.f18035r;
        if (c5721p == null) {
            C5721p c5721pM23173f = C5724s.m23173f();
            this.f18034q = c5721pM23173f;
            this.f18035r = c5721pM23173f;
            return c5721pM23173f;
        }
        c5721p.getClass();
        if (c5721p.m23144d() + i10 <= 8192 && c5721p.f18056e) {
            return c5721p;
        }
        C5721p c5721pM23153m = c5721p.m23153m(C5724s.m23173f());
        this.f18035r = c5721pM23153m;
        return c5721pM23153m;
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: H */
    public int mo23098H(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC5709d0.m23124a(bArr.length, i10, i11);
        C5721p c5721p = this.f18034q;
        if (c5721p == null) {
            return -1;
        }
        int iMin = Math.min(i11 - i10, c5721p.m23150j());
        c5721p.m23155o(bArr, i10, i10 + iMin);
        this.f18036s -= (long) iMin;
        if (AbstractC5723r.m23170b(c5721p)) {
            m23114m();
        }
        return iMin;
    }

    @Override // p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: I */
    public void mo23099I(byte b10) {
        m23097G(1).m23138B(b10);
        this.f18036s++;
    }

    @Override // p215oc.InterfaceC5718m
    /* JADX INFO: renamed from: N */
    public long mo23100N(C5708d c5708d, long j10) {
        c5708d.getClass();
        if (j10 < 0) {
            C5702a.m23079a("byteCount (", j10, ") < 0");
            return 0L;
        }
        if (m23111j() == 0) {
            return -1L;
        }
        if (j10 > m23111j()) {
            j10 = m23111j();
        }
        c5708d.mo23106e0(this, j10);
        return j10;
    }

    @Override // p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: Y */
    public void mo23101Y(InterfaceC5718m interfaceC5718m, long j10) throws EOFException {
        interfaceC5718m.getClass();
        if (j10 < 0) {
            C5702a.m23079a("byteCount (", j10, ") < 0");
            return;
        }
        long j11 = j10;
        while (j11 > 0) {
            long jMo23100N = interfaceC5718m.mo23100N(this, j11);
            if (jMo23100N == -1) {
                throw new EOFException("Source exhausted before reading " + j10 + " bytes. Only " + (j10 - j11) + " were read.");
            }
            j11 -= jMo23100N;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23103c() throws EOFException {
        skip(m23111j());
    }

    /* JADX INFO: renamed from: d */
    public final long m23104d() {
        long jM23111j = m23111j();
        if (jM23111j == 0) {
            return 0L;
        }
        C5721p c5721p = this.f18035r;
        c5721p.getClass();
        return (c5721p.m23144d() >= 8192 || !c5721p.f18056e) ? jM23111j : jM23111j - ((long) (c5721p.m23144d() - c5721p.m23146f()));
    }

    /* JADX INFO: renamed from: e */
    public final void m23105e(C5708d c5708d, long j10, long j11) {
        c5708d.getClass();
        AbstractC5709d0.m23124a(m23111j(), j10, j11);
        if (j10 == j11) {
            return;
        }
        long jM23144d = j11 - j10;
        c5708d.f18036s += jM23144d;
        C5721p c5721pM23145e = this.f18034q;
        long jM23144d2 = j10;
        while (true) {
            c5721pM23145e.getClass();
            if (jM23144d2 < c5721pM23145e.m23144d() - c5721pM23145e.m23146f()) {
                break;
            }
            jM23144d2 -= (long) (c5721pM23145e.m23144d() - c5721pM23145e.m23146f());
            c5721pM23145e = c5721pM23145e.m23145e();
        }
        while (jM23144d > 0) {
            c5721pM23145e.getClass();
            C5721p c5721pM23164x = c5721pM23145e.m23164x();
            c5721pM23164x.m23158r(c5721pM23164x.m23146f() + ((int) jM23144d2));
            c5721pM23164x.m23156p(Math.min(c5721pM23164x.m23146f() + ((int) jM23144d), c5721pM23164x.m23144d()));
            if (c5708d.m23109h() == null) {
                c5708d.m23119q(c5721pM23164x);
                c5708d.m23123x(c5721pM23164x);
            } else {
                C5721p c5721pM23113l = c5708d.m23113l();
                c5721pM23113l.getClass();
                c5708d.m23123x(c5721pM23113l.m23153m(c5721pM23164x));
            }
            jM23144d -= (long) (c5721pM23164x.m23144d() - c5721pM23164x.m23146f());
            c5721pM23145e = c5721pM23145e.m23145e();
            jM23144d2 = 0;
        }
    }

    @Override // p215oc.InterfaceC5717l
    /* JADX INFO: renamed from: e0 */
    public void mo23106e0(C5708d c5708d, long j10) {
        c5708d.getClass();
        if (c5708d == this) {
            C9987e.m38645a("source == this");
            return;
        }
        AbstractC5709d0.m23125b(c5708d.f18036s, 0L, j10);
        while (j10 > 0) {
            c5708d.f18034q.getClass();
            if (j10 < r0.m23150j()) {
                C5721p c5721p = this.f18035r;
                if (c5721p != null && c5721p.f18056e) {
                    if ((((long) c5721p.m23144d()) + j10) - ((long) (c5721p.m23149i() ? 0 : c5721p.m23146f())) <= JSONWriter.MASK_WRITE_ENUMS_USING_NAME) {
                        C5721p c5721p2 = c5708d.f18034q;
                        c5721p2.getClass();
                        c5721p2.m23140D(c5721p, (int) j10);
                        c5708d.f18036s -= j10;
                        this.f18036s += j10;
                        return;
                    }
                }
                C5721p c5721p3 = c5708d.f18034q;
                c5721p3.getClass();
                c5708d.f18034q = c5721p3.m23165y((int) j10);
            }
            C5721p c5721p4 = c5708d.f18034q;
            c5721p4.getClass();
            long jM23150j = c5721p4.m23150j();
            C5721p c5721pM23152l = c5721p4.m23152l();
            c5708d.f18034q = c5721pM23152l;
            if (c5721pM23152l == null) {
                c5708d.f18035r = null;
            }
            if (m23109h() == null) {
                m23119q(c5721p4);
                m23123x(c5721p4);
            } else {
                C5721p c5721pM23113l = m23113l();
                c5721pM23113l.getClass();
                m23123x(c5721pM23113l.m23153m(c5721p4).m23141a());
                C5721p c5721pM23113l2 = m23113l();
                c5721pM23113l2.getClass();
                if (c5721pM23113l2.m23147g() == null) {
                    m23119q(m23113l());
                }
            }
            c5708d.f18036s -= jM23150j;
            this.f18036s += jM23150j;
            j10 -= jM23150j;
        }
    }

    /* JADX INFO: renamed from: f */
    public final byte m23107f(long j10) {
        long j11 = 0;
        if (j10 < 0 || j10 >= m23111j()) {
            throw new IndexOutOfBoundsException("position (" + j10 + ") is not within the range [0..size(" + m23111j() + "))");
        }
        if (j10 == 0) {
            C5721p c5721p = this.f18034q;
            c5721p.getClass();
            return c5721p.m23151k(0);
        }
        m23109h().getClass();
        if (m23111j() - j10 >= j10) {
            C5721p c5721pM23109h = m23109h();
            while (c5721pM23109h != null) {
                long jM23144d = ((long) (c5721pM23109h.m23144d() - c5721pM23109h.m23146f())) + j11;
                if (jM23144d > j10) {
                    break;
                }
                c5721pM23109h = c5721pM23109h.m23145e();
                j11 = jM23144d;
            }
            c5721pM23109h.getClass();
            return c5721pM23109h.m23151k((int) (j10 - j11));
        }
        C5721p c5721pM23113l = m23113l();
        long jM23111j = m23111j();
        while (c5721pM23113l != null && jM23111j > j10) {
            jM23111j -= (long) (c5721pM23113l.m23144d() - c5721pM23113l.m23146f());
            if (jM23111j <= j10) {
                break;
            }
            c5721pM23113l = c5721pM23113l.m23147g();
        }
        c5721pM23113l.getClass();
        return c5721pM23113l.m23151k((int) (j10 - jM23111j));
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: g */
    public boolean mo23108g() {
        return m23111j() == 0;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5721p m23109h() {
        return this.f18034q;
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: i */
    public boolean mo23110i(long j10) {
        if (j10 >= 0) {
            return m23111j() >= j10;
        }
        C5702a.m23079a("byteCount: ", j10, " < 0");
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final long m23111j() {
        return this.f18036s;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long m23112k() {
        return this.f18036s;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5721p m23113l() {
        return this.f18035r;
    }

    /* JADX INFO: renamed from: m */
    public final void m23114m() {
        C5721p c5721p = this.f18034q;
        c5721p.getClass();
        C5721p c5721pM23145e = c5721p.m23145e();
        this.f18034q = c5721pM23145e;
        if (c5721pM23145e == null) {
            this.f18035r = null;
        } else {
            c5721pM23145e.m23159s(null);
        }
        c5721p.m23157q(null);
        C5724s.m23171d(c5721p);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m23115n() {
        C5721p c5721p = this.f18035r;
        c5721p.getClass();
        C5721p c5721pM23147g = c5721p.m23147g();
        this.f18035r = c5721pM23147g;
        if (c5721pM23147g == null) {
            this.f18034q = null;
        } else {
            c5721pM23147g.m23157q(null);
        }
        c5721p.m23159s(null);
        C5724s.m23171d(c5721p);
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: o */
    public void mo23116o(long j10) throws EOFException {
        if (j10 < 0) {
            C9991g.m38662a("byteCount: ", j10);
            return;
        }
        if (m23111j() >= j10) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + m23111j() + ", required: " + j10 + ')');
    }

    @Override // p215oc.InterfaceC5728w
    /* JADX INFO: renamed from: o0 */
    public void mo23117o0(InterfaceC5717l interfaceC5717l, long j10) throws EOFException {
        interfaceC5717l.getClass();
        if (j10 < 0) {
            C5702a.m23079a("byteCount (", j10, ") < 0");
            return;
        }
        if (m23111j() >= j10) {
            interfaceC5717l.mo23106e0(this, j10);
            return;
        }
        interfaceC5717l.mo23106e0(this, m23111j());
        throw new EOFException("Buffer exhausted before writing " + j10 + " bytes. Only " + m23111j() + " bytes were written.");
    }

    @Override // p215oc.InterfaceC5728w
    public InterfaceC5728w peek() {
        return AbstractC5713h.m23131a(new C5716k(this));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m23119q(C5721p c5721p) {
        this.f18034q = c5721p;
    }

    @Override // p215oc.InterfaceC5728w
    public byte readByte() throws EOFException {
        C5721p c5721p = this.f18034q;
        if (c5721p == null) {
            m23096F(1L);
            C5706c.m23089a();
            return (byte) 0;
        }
        int iM23150j = c5721p.m23150j();
        if (iM23150j == 0) {
            m23114m();
            return readByte();
        }
        byte bM23154n = c5721p.m23154n();
        this.f18036s--;
        if (iM23150j == 1) {
            m23114m();
        }
        return bM23154n;
    }

    @Override // p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: s0 */
    public long mo23120s0(InterfaceC5718m interfaceC5718m) {
        interfaceC5718m.getClass();
        long j10 = 0;
        while (true) {
            long jMo23100N = interfaceC5718m.mo23100N(this, JSONWriter.MASK_WRITE_ENUMS_USING_NAME);
            if (jMo23100N == -1) {
                return j10;
            }
            j10 += jMo23100N;
        }
    }

    public void skip(long j10) throws EOFException {
        if (j10 < 0) {
            C5702a.m23079a("byteCount (", j10, ") < 0");
            return;
        }
        long j11 = j10;
        while (j11 > 0) {
            C5721p c5721p = this.f18034q;
            if (c5721p == null) {
                throw new EOFException("Buffer exhausted before skipping " + j10 + " bytes.");
            }
            int iMin = (int) Math.min(j11, c5721p.m23144d() - c5721p.m23146f());
            long j12 = iMin;
            this.f18036s -= j12;
            j11 -= j12;
            c5721p.m23158r(c5721p.m23146f() + iMin);
            if (c5721p.m23146f() == c5721p.m23144d()) {
                m23114m();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m23121t(long j10) {
        this.f18036s = j10;
    }

    public String toString() {
        if (m23111j() == 0) {
            return "Buffer(size=0)";
        }
        long j10 = 64;
        int iMin = (int) Math.min(j10, m23111j());
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (m23111j() > j10 ? 1 : 0));
        C8218d c8218d = C8218d.f27528a;
        int i10 = 0;
        for (C5721p c5721pM23109h = m23109h(); c5721pM23109h != null; c5721pM23109h = c5721pM23109h.m23145e()) {
            InterfaceC8216b interfaceC8216b = AbstractC8219e.f27529a;
            int i11 = 0;
            while (i10 < iMin && i11 < c5721pM23109h.m23150j()) {
                int i12 = i11 + 1;
                byte bMo31913a = interfaceC8216b.mo31913a(c5721pM23109h, i11);
                i10++;
                sb2.append(AbstractC5709d0.m23126c()[(bMo31913a >> 4) & 15]);
                sb2.append(AbstractC5709d0.m23126c()[bMo31913a & 15]);
                i11 = i12;
            }
        }
        if (m23111j() > j10) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + m23111j() + " hex=" + ((Object) sb2) + ')';
    }

    @Override // p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: v */
    public void mo23122v(short s10) {
        m23097G(2).m23139C(s10);
        this.f18036s += 2;
    }

    @Override // p215oc.InterfaceC5726u
    public void write(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC5709d0.m23124a(bArr.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            C5721p c5721pM23097G = m23097G(1);
            int iMin = Math.min(i11 - i12, c5721pM23097G.m23148h()) + i12;
            c5721pM23097G.m23166z(bArr, i12, iMin);
            i12 = iMin;
        }
        this.f18036s += (long) (i11 - i10);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m23123x(C5721p c5721p) {
        this.f18035r = c5721p;
    }

    @Override // p215oc.InterfaceC5728w, p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: b */
    public C5708d mo23102b() {
        return this;
    }

    @Override // p215oc.InterfaceC5718m, java.lang.AutoCloseable, p215oc.InterfaceC5717l
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // p215oc.InterfaceC5726u
    /* JADX INFO: renamed from: p0 */
    public void mo23118p0() {
    }
}
