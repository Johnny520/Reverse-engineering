package p193l0;

import p029F0.AbstractC0391b0;
import p029F0.AbstractC0435z;
import p029F0.C0397e0;
import p029F0.C0402h;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.C0566K;
import p041H0.InterfaceC0605m;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p121Y1.C1753n;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.AbstractC2206o;
import p169h0.C2199h;
import p204n0.C2686e;
import p211o0.C2753l;
import p222q0.C2901b;
import p239t0.AbstractC3207b;

/* JADX INFO: renamed from: l0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2491n extends AbstractC2206o implements InterfaceC0627x, InterfaceC0605m {

    /* JADX INFO: renamed from: r */
    public AbstractC3207b f7993r;

    /* JADX INFO: renamed from: s */
    public boolean f7994s;

    /* JADX INFO: renamed from: t */
    public C2199h f7995t;

    /* JADX INFO: renamed from: u */
    public C0402h f7996u;

    /* JADX INFO: renamed from: v */
    public float f7997v;

    /* JADX INFO: renamed from: w */
    public C2753l f7998w;

    /* JADX INFO: renamed from: K0 */
    public static boolean m4434K0(long j5) {
        return !C2686e.m4661a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: L0 */
    public static boolean m4435L0(long j5) {
        return !C2686e.m4661a(j5, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m4436J0() {
        return this.f7994s && this.f7993r.mo5483d() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: M0 */
    public final long m4437M0(long j5) {
        boolean z5 = false;
        boolean z6 = C2005a.m3676d(j5) && C2005a.m3675c(j5);
        if (C2005a.m3678f(j5) && C2005a.m3677e(j5)) {
            z5 = true;
        }
        if ((!m4436J0() && z6) || z5) {
            return C2005a.m3673a(j5, C2005a.m3680h(j5), 0, C2005a.m3679g(j5), 0, 10);
        }
        long jMo5483d = this.f7993r.mo5483d();
        int iRound = m4435L0(jMo5483d) ? Math.round(Float.intBitsToFloat((int) (jMo5483d >> 32))) : C2005a.m3682j(j5);
        int iRound2 = m4434K0(jMo5483d) ? Math.round(Float.intBitsToFloat((int) (jMo5483d & 4294967295L))) : C2005a.m3681i(j5);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2006b.m3689f(j5, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2006b.m3690g(j5, iRound))) << 32);
        if (m4436J0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m4435L0(this.f7993r.mo5483d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f7993r.mo5483d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m4434K0(this.f7993r.mo5483d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f7993r.mo5483d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC0435z.m698k(jFloatToRawIntBits2, this.f7996u.m670a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C2005a.m3673a(j5, AbstractC2006b.m3690g(j5, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))), 0, AbstractC2006b.m3689f(j5, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    @Override // p041H0.InterfaceC0605m
    /* JADX INFO: renamed from: R */
    public final void mo940R(C0566K c0566k) {
        C2901b c2901b = c0566k.f1742d;
        long jMo5483d = this.f7993r.mo5483d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m4435L0(jMo5483d) ? Float.intBitsToFloat((int) (jMo5483d >> 32)) : Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m4434K0(jMo5483d) ? Float.intBitsToFloat((int) (jMo5483d & 4294967295L)) : Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)))) & 4294967295L);
        long jM698k = (Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)) == 0.0f) ? 0L : AbstractC0435z.m698k(jFloatToRawIntBits, this.f7996u.m670a(jFloatToRawIntBits, c2901b.mo859c()));
        long jMo4017a = this.f7995t.mo4017a((((long) Math.round(Float.intBitsToFloat((int) (jM698k >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM698k & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c2901b.mo859c() & 4294967295L)))) & 4294967295L), c0566k.getLayoutDirection());
        float f2 = (int) (jMo4017a >> 32);
        float f5 = (int) (jMo4017a & 4294967295L);
        ((C1753n) c2901b.f9185e.f307e).m3115L(f2, f5);
        try {
            this.f7993r.m5485c(c0566k, jM698k, this.f7997v, this.f7998w);
            ((C1753n) c2901b.f9185e.f307e).m3115L(-f2, -f5);
            c0566k.m857a();
        } catch (Throwable th) {
            ((C1753n) c2901b.f9185e.f307e).m3115L(-f2, -f5);
            throw th;
        }
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!m4436J0()) {
            return interfaceC0376N.mo649f(i5);
        }
        long jM4437M0 = m4437M0(AbstractC2006b.m3685b(i5, 0, 13));
        return Math.max(C2005a.m3681i(jM4437M0), interfaceC0376N.mo649f(i5));
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(m4437M0(j5));
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0397e0(abstractC0391b0Mo648e, 3));
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!m4436J0()) {
            return interfaceC0376N.mo645T(i5);
        }
        long jM4437M0 = m4437M0(AbstractC2006b.m3685b(0, i5, 7));
        return Math.max(C2005a.m3682j(jM4437M0), interfaceC0376N.mo645T(i5));
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!m4436J0()) {
            return interfaceC0376N.mo647Z(i5);
        }
        long jM4437M0 = m4437M0(AbstractC2006b.m3685b(i5, 0, 13));
        return Math.max(C2005a.m3681i(jM4437M0), interfaceC0376N.mo647Z(i5));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f7993r + ", sizeToIntrinsics=" + this.f7994s + ", alignment=" + this.f7995t + ", alpha=" + this.f7997v + ", colorFilter=" + this.f7998w + ')';
    }

    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        if (!m4436J0()) {
            return interfaceC0376N.mo646X(i5);
        }
        long jM4437M0 = m4437M0(AbstractC2006b.m3685b(0, i5, 7));
        return Math.max(C2005a.m3682j(jM4437M0), interfaceC0376N.mo646X(i5));
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }
}
