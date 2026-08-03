package p099h;

import p016b1.C0167g;
import p028c1.C0384n;
import p085fg.InterfaceC1220a;
import p116i.C1741c1;
import p116i.C1744d1;
import p116i.C1765k1;
import p293u2.AbstractC4232b;
import p293u2.C4240j;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p356y0.C5840b;
import p356y0.InterfaceC5841c;
import tf.C4174u;

/* JADX INFO: renamed from: h.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1481q0 extends AbstractC1495x0 {

    /* JADX INFO: renamed from: A */
    public C1485s0 f4911A;

    /* JADX INFO: renamed from: B */
    public InterfaceC1220a f4912B;

    /* JADX INFO: renamed from: C */
    public C1462h0 f4913C;

    /* JADX INFO: renamed from: D */
    public long f4914D;

    /* JADX INFO: renamed from: E */
    public InterfaceC5841c f4915E;

    /* JADX INFO: renamed from: F */
    public final C1479p0 f4916F;

    /* JADX INFO: renamed from: G */
    public final C1479p0 f4917G;

    /* JADX INFO: renamed from: v */
    public C1765k1 f4918v;

    /* JADX INFO: renamed from: w */
    public C1744d1 f4919w;

    /* JADX INFO: renamed from: x */
    public C1744d1 f4920x;

    /* JADX INFO: renamed from: y */
    public C1744d1 f4921y;

    /* JADX INFO: renamed from: z */
    public C1483r0 f4922z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1481q0(C1765k1 c1765k1, C1744d1 c1744d1, C1744d1 c1744d12, C1744d1 c1744d13, C1483r0 c1483r0, C1485s0 c1485s0, InterfaceC1220a interfaceC1220a, C1462h0 c1462h0) {
        super(0);
        this.f4918v = c1765k1;
        this.f4919w = c1744d1;
        this.f4920x = c1744d12;
        this.f4921y = c1744d13;
        this.f4922z = c1483r0;
        this.f4911A = c1485s0;
        this.f4912B = interfaceC1220a;
        this.f4913C = c1462h0;
        this.f4914D = AbstractC1450d0.f4817a;
        AbstractC4232b.m8509b(0, 0, 0, 0, 15);
        this.f4916F = new C1479p0(this, 0);
        this.f4917G = new C1479p0(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        this.f4914D = AbstractC1450d0.f4817a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099h.AbstractC1495x0, p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        long j4;
        if (this.f4918v.m4414c() == this.f4918v.f5892d.getValue()) {
            this.f4915E = null;
        } else if (this.f4915E == null) {
            InterfaceC5841c interfaceC5841cM3999m1 = m3999m1();
            if (interfaceC5841cM3999m1 == null) {
                interfaceC5841cM3999m1 = C5840b.f23761g;
            }
            this.f4915E = interfaceC5841cM3999m1;
        }
        boolean zMo8009u0 = interfaceC4418p0.mo8009u0();
        C4174u c4174u = C4174u.f13711g;
        if (zMo8009u0) {
            AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
            long j5 = (((long) abstractC4377b1Mo8831Q.f14593g) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L);
            this.f4914D = j5;
            return interfaceC4418p0.mo8010z((int) (j5 >> 32), (int) (4294967295L & j5), c4174u, new C0384n(abstractC4377b1Mo8831Q, 2));
        }
        if (!((Boolean) this.f4912B.invoke()).booleanValue()) {
            AbstractC4377b1 abstractC4377b1Mo8831Q2 = interfaceC4409m0.mo8831Q(j3);
            return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q2.f14593g, abstractC4377b1Mo8831Q2.f14594h, c4174u, new C0384n(abstractC4377b1Mo8831Q2, 3));
        }
        C1462h0 c1462h0 = this.f4913C;
        C1744d1 c1744d1 = c1462h0.f4858a;
        C1744d1 c1744d12 = c1462h0.f4859b;
        C1765k1 c1765k1 = c1462h0.f4860c;
        C1483r0 c1483r0 = c1462h0.f4861d;
        C1485s0 c1485s0 = c1462h0.f4862e;
        C1744d1 c1744d13 = c1462h0.f4863f;
        C1741c1 c1741c1M4383a = c1744d1 != null ? c1744d1.m4383a(new C1465i0(c1483r0, c1485s0, 0), new C1465i0(c1483r0, c1485s0, 1)) : null;
        C1741c1 c1741c1M4383a2 = c1744d12 != null ? c1744d12.m4383a(new C1465i0(c1483r0, c1485s0, 2), new C1465i0(c1483r0, c1485s0, 3)) : null;
        if (c1765k1.m4414c() == EnumC1456f0.f4833g) {
            C1463h1 c1463h1 = c1485s0.f4934a;
        } else {
            C1463h1 c1463h12 = c1485s0.f4934a;
        }
        C0167g c0167g = new C0167g(c1741c1M4383a, c1741c1M4383a2, c1744d13 != null ? c1744d13.m4383a(C1446c.f4799m, new C0167g(null, c1483r0, c1485s0, 4)) : null, 3);
        AbstractC4377b1 abstractC4377b1Mo8831Q3 = interfaceC4409m0.mo8831Q(j3);
        long j10 = (((long) abstractC4377b1Mo8831Q3.f14594h) & 4294967295L) | (((long) abstractC4377b1Mo8831Q3.f14593g) << 32);
        long j11 = !C4242l.m8534a(this.f4914D, AbstractC1450d0.f4817a) ? this.f4914D : j10;
        C1744d1 c1744d14 = this.f4919w;
        C1741c1 c1741c1M4383a3 = c1744d14 != null ? c1744d14.m4383a(this.f4916F, new C1477o0(this, j11, 0)) : null;
        if (c1741c1M4383a3 != null) {
            j10 = ((C4242l) c1741c1M4383a3.getValue()).f13918a;
        }
        long jM8511d = AbstractC4232b.m8511d(j3, j10);
        C1744d1 c1744d15 = this.f4920x;
        long jMo10544a = 0;
        long j12 = c1744d15 != null ? ((C4240j) c1744d15.m4383a(C1446c.f4800n, new C1477o0(this, j11, 1)).getValue()).f13912a : 0L;
        C1744d1 c1744d16 = this.f4921y;
        long j13 = c1744d16 != null ? ((C4240j) c1744d16.m4383a(this.f4917G, new C1477o0(this, j11, 2)).getValue()).f13912a : 0L;
        InterfaceC5841c interfaceC5841c = this.f4915E;
        if (interfaceC5841c != null) {
            long j14 = j11;
            j4 = j13;
            jMo10544a = interfaceC5841c.mo10544a(j14, jM8511d, EnumC4243m.f13919g);
        } else {
            j4 = j13;
        }
        return interfaceC4418p0.mo8010z((int) (jM8511d >> 32), (int) (jM8511d & 4294967295L), c4174u, new C1475n0(abstractC4377b1Mo8831Q3, C4240j.m8530d(jMo10544a, j4), j12, c0167g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final InterfaceC5841c m3999m1() {
        if (this.f4918v.m4417f().m4391a(EnumC1456f0.f4833g, EnumC1456f0.f4834h)) {
            C1463h1 c1463h1 = this.f4911A.f4934a;
            return null;
        }
        C1463h1 c1463h12 = this.f4911A.f4934a;
        return null;
    }
}
