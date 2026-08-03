package p308v1;

import p057e1.C0807b;
import p057e1.C0808c;
import p129ig.AbstractC2043a;
import p292u1.AbstractC4229a;
import p293u2.C4240j;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5631o0;

/* JADX INFO: renamed from: v1.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4406l0 implements InterfaceC4428t {

    /* JADX INFO: renamed from: g */
    public final AbstractC5631o0 f14675g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4406l0(AbstractC5631o0 abstractC5631o0) {
        this.f14675g = abstractC5631o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: C */
    public final boolean mo8856C() {
        return this.f14675g.f22932u.mo10106r1().f23801t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: E */
    public final void mo8857E(float[] fArr) {
        this.f14675g.f22932u.mo8857E(fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: F */
    public final long mo8858F() {
        AbstractC5631o0 abstractC5631o0 = this.f14675g;
        return (((long) abstractC5631o0.f14593g) << 32) | (((long) abstractC5631o0.f14594h) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: P */
    public final long mo8859P(long j3) {
        return this.f14675g.f22932u.mo8859P(C0807b.m2042e(0L, m8862a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: R */
    public final long mo8860R(long j3) {
        return C0807b.m2042e(this.f14675g.f22932u.mo8860R(j3), m8862a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: W */
    public final long mo8861W(InterfaceC4428t interfaceC4428t, long j3) {
        boolean z9 = interfaceC4428t instanceof C4406l0;
        AbstractC5631o0 abstractC5631o0 = this.f14675g;
        if (!z9) {
            AbstractC5631o0 abstractC5631o0M8886j = AbstractC4434w.m8886j(abstractC5631o0);
            AbstractC5614i1 abstractC5614i1 = abstractC5631o0M8886j.f22932u;
            long jMo8861W = mo8861W(abstractC5631o0M8886j.f22935x, j3);
            long j4 = abstractC5631o0M8886j.f22933v;
            long jM2041d = C0807b.m2041d(jMo8861W, (4294967295L & ((long) Float.floatToRawIntBits((int) (j4 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j4 >> 32)) << 32));
            if (!abstractC5614i1.mo10106r1().f23801t) {
                AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC5614i1.m10069A1();
            AbstractC5614i1 abstractC5614i12 = abstractC5614i1.f22870w;
            if (abstractC5614i12 != null) {
                abstractC5614i1 = abstractC5614i12;
            }
            return C0807b.m2042e(jM2041d, abstractC5614i1.mo8861W(interfaceC4428t, 0L));
        }
        AbstractC5631o0 abstractC5631o02 = ((C4406l0) interfaceC4428t).f14675g;
        AbstractC5614i1 abstractC5614i13 = abstractC5631o02.f22932u;
        abstractC5614i13.m10069A1();
        AbstractC5631o0 abstractC5631o0Mo10104p1 = abstractC5631o0.f22932u.m10102n1(abstractC5614i13).mo10104p1();
        if (abstractC5631o0Mo10104p1 != null) {
            long jM8529c = C4240j.m8529c(C4240j.m8530d(abstractC5631o02.m10184j1(abstractC5631o0Mo10104p1, false), AbstractC2043a.m5017W(j3)), abstractC5631o0.m10184j1(abstractC5631o0Mo10104p1, false));
            return (((long) Float.floatToRawIntBits((int) (jM8529c >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM8529c & 4294967295L))) & 4294967295L);
        }
        AbstractC5631o0 abstractC5631o0M8886j2 = AbstractC4434w.m8886j(abstractC5631o02);
        long jM8530d = C4240j.m8530d(C4240j.m8530d(abstractC5631o02.m10184j1(abstractC5631o0M8886j2, false), abstractC5631o0M8886j2.f22933v), AbstractC2043a.m5017W(j3));
        AbstractC5631o0 abstractC5631o0M8886j3 = AbstractC4434w.m8886j(abstractC5631o0);
        long jM8529c2 = C4240j.m8529c(jM8530d, C4240j.m8530d(abstractC5631o0.m10184j1(abstractC5631o0M8886j3, false), abstractC5631o0M8886j3.f22933v));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM8529c2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM8529c2 & 4294967295L))) & 4294967295L;
        AbstractC5614i1 abstractC5614i14 = abstractC5631o0M8886j3.f22932u.f22870w;
        abstractC5614i14.getClass();
        AbstractC5614i1 abstractC5614i15 = abstractC5631o0M8886j2.f22932u.f22870w;
        abstractC5614i15.getClass();
        return abstractC5614i14.mo8861W(abstractC5614i15, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m8862a() {
        AbstractC5631o0 abstractC5631o0 = this.f14675g;
        AbstractC5631o0 abstractC5631o0M8886j = AbstractC4434w.m8886j(abstractC5631o0);
        return C0807b.m2041d(mo8861W(abstractC5631o0M8886j.f22935x, 0L), abstractC5631o0.f22932u.mo8861W(abstractC5631o0M8886j.f22932u, 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC4428t mo8863b0() {
        AbstractC5631o0 abstractC5631o0Mo10104p1;
        if (!mo8856C()) {
            AbstractC4229a.m8494b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC5614i1 abstractC5614i1 = this.f14675g.f22932u.f22868u.f22778L.f22717d.f22870w;
        if (abstractC5614i1 == null || (abstractC5631o0Mo10104p1 = abstractC5614i1.mo10104p1()) == null) {
            return null;
        }
        return abstractC5631o0Mo10104p1.f22935x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: g0 */
    public final void mo8864g0(InterfaceC4428t interfaceC4428t, float[] fArr) {
        this.f14675g.f22932u.mo8864g0(interfaceC4428t, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: j0 */
    public final long mo8865j0(long j3) {
        return C0807b.m2042e(this.f14675g.f22932u.mo8865j0(j3), m8862a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: k0 */
    public final C0808c mo8866k0(InterfaceC4428t interfaceC4428t, boolean z9) {
        return this.f14675g.f22932u.mo8866k0(interfaceC4428t, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: m */
    public final long mo8867m(long j3) {
        return this.f14675g.f22932u.mo8867m(C0807b.m2042e(j3, m8862a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: m0 */
    public final long mo8868m0(long j3) {
        return this.f14675g.f22932u.mo8868m0(C0807b.m2042e(j3, m8862a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4428t
    /* JADX INFO: renamed from: w */
    public final long mo8869w(InterfaceC4428t interfaceC4428t, long j3) {
        return mo8861W(interfaceC4428t, j3);
    }
}
