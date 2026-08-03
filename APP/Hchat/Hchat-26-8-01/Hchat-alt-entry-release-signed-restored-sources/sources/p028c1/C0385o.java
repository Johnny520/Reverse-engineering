package p028c1;

import androidx.lifecycle.C0119x;
import p057e1.C0810e;
import p071f1.C1017n;
import p101h1.C1565b;
import p146k1.AbstractC2233b;
import p293u2.AbstractC4232b;
import p293u2.C4231a;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4434w;
import p308v1.C4427s0;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5628n0;
import p339x1.C5610h0;
import p339x1.InterfaceC5624m;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5841c;
import tf.C4174u;

/* JADX INFO: renamed from: c1.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0385o extends AbstractC5852n implements InterfaceC5651v, InterfaceC5624m {

    /* JADX INFO: renamed from: u */
    public AbstractC2233b f1068u;

    /* JADX INFO: renamed from: v */
    public boolean f1069v;

    /* JADX INFO: renamed from: w */
    public InterfaceC5841c f1070w;

    /* JADX INFO: renamed from: x */
    public C4427s0 f1071x;

    /* JADX INFO: renamed from: y */
    public float f1072y;

    /* JADX INFO: renamed from: z */
    public C1017n f1073z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public static boolean m1343l1(long j3) {
        return !C0810e.m2054a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public static boolean m1344m1(long j3) {
        return !C0810e.m2054a(j3, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5624m
    /* JADX INFO: renamed from: B */
    public final void mo1326B(C5610h0 c5610h0) {
        C1565b c1565b = c5610h0.f22833g;
        long jMo5469d = this.f1068u.mo5469d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m1344m1(jMo5469d) ? Float.intBitsToFloat((int) (jMo5469d >> 32)) : Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(m1343l1(jMo5469d) ? Float.intBitsToFloat((int) (jMo5469d & 4294967295L)) : Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)))) & 4294967295L);
        long jM8891o = (Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)) == 0.0f) ? 0L : AbstractC4434w.m8891o(jFloatToRawIntBits, this.f1071x.m8876a(jFloatToRawIntBits, c1565b.mo4091a()));
        long jMo10544a = this.f1070w.mo10544a((((long) Math.round(Float.intBitsToFloat((int) (jM8891o >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jM8891o & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c1565b.mo4091a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c1565b.mo4091a() & 4294967295L)))) & 4294967295L), c5610h0.getLayoutDirection());
        float f3 = (int) (jMo10544a >> 32);
        float f10 = (int) (jMo10544a & 4294967295L);
        ((C0119x) c1565b.f5220h.f469a).m598c0(f3, f10);
        try {
            this.f1068u.m5471c(c5610h0, jM8891o, this.f1072y, this.f1073z);
            ((C0119x) c1565b.f5220h.f469a).m598c0(-f3, -f10);
            c5610h0.m10064e();
        } catch (Throwable th2) {
            ((C0119x) c1565b.f5220h.f469a).m598c0(-f3, -f10);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: G */
    public final int mo1345G(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        if (!m1351k1()) {
            return interfaceC4409m0.mo8829G(i9);
        }
        long jM1352n1 = m1352n1(AbstractC4232b.m8509b(0, 0, 0, i9, 7));
        return Math.max(C4231a.m8506j(jM1352n1), interfaceC4409m0.mo8829G(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: K0 */
    public final int mo1346K0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        if (!m1351k1()) {
            return interfaceC4409m0.mo8833p0(i9);
        }
        long jM1352n1 = m1352n1(AbstractC4232b.m8509b(0, i9, 0, 0, 13));
        return Math.max(C4231a.m8505i(jM1352n1), interfaceC4409m0.mo8833p0(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: Q */
    public final int mo1347Q(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        if (!m1351k1()) {
            return interfaceC4409m0.mo8830M(i9);
        }
        long jM1352n1 = m1352n1(AbstractC4232b.m8509b(0, 0, 0, i9, 7));
        return Math.max(C4231a.m8506j(jM1352n1), interfaceC4409m0.mo8830M(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: R0 */
    public final int mo1348R0(AbstractC5628n0 abstractC5628n0, InterfaceC4409m0 interfaceC4409m0, int i9) {
        if (!m1351k1()) {
            return interfaceC4409m0.mo8832j(i9);
        }
        long jM1352n1 = m1352n1(AbstractC4232b.m8509b(0, i9, 0, 0, 13));
        return Math.max(C4231a.m8505i(jM1352n1), interfaceC4409m0.mo8832j(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(m1352n1(j3));
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C0384n(abstractC4377b1Mo8831Q, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final boolean m1351k1() {
        return this.f1069v && this.f1068u.mo5469d() != 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final long m1352n1(long j3) {
        boolean z9 = false;
        boolean z10 = C4231a.m8500d(j3) && C4231a.m8499c(j3);
        if (C4231a.m8502f(j3) && C4231a.m8501e(j3)) {
            z9 = true;
        }
        if ((!m1351k1() && z10) || z9) {
            return C4231a.m8497a(j3, C4231a.m8504h(j3), 0, C4231a.m8503g(j3), 0, 10);
        }
        long jMo5469d = this.f1068u.mo5469d();
        int iRound = m1344m1(jMo5469d) ? Math.round(Float.intBitsToFloat((int) (jMo5469d >> 32))) : C4231a.m8506j(j3);
        int iRound2 = m1343l1(jMo5469d) ? Math.round(Float.intBitsToFloat((int) (jMo5469d & 4294967295L))) : C4231a.m8505i(j3);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC4232b.m8513f(iRound2, j3))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC4232b.m8514g(iRound, j3))) << 32);
        if (m1351k1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!m1344m1(this.f1068u.mo5469d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f1068u.mo5469d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m1343l1(this.f1068u.mo5469d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f1068u.mo5469d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC4434w.m8891o(jFloatToRawIntBits2, this.f1071x.m8876a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C4231a.m8497a(j3, AbstractC4232b.m8514g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j3), 0, AbstractC4232b.m8513f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j3), 0, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterModifier(painter=" + this.f1068u + ", sizeToIntrinsics=" + this.f1069v + ", alignment=" + this.f1070w + ", alpha=" + this.f1072y + ", colorFilter=" + this.f1073z + ')';
    }
}
