package p029F0;

import com.bumptech.glide.AbstractC1923e;
import p023E0.AbstractC0277a;
import p041H0.AbstractC0573S;
import p041H0.AbstractC0596h0;
import p117X2.AbstractC1665j;
import p153e1.C2014j;
import p204n0.C2683b;
import p204n0.C2684c;

/* JADX INFO: renamed from: F0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0375M implements InterfaceC0430v {

    /* JADX INFO: renamed from: d */
    public final AbstractC0573S f1189d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0375M(AbstractC0573S abstractC0573S) {
        this.f1189d = abstractC0573S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: B */
    public final long mo631B(long j5) {
        return C2683b.m4647e(this.f1189d.f1785r.mo631B(j5), m639a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: D */
    public final boolean mo632D() {
        return this.f1189d.f1785r.mo981R0().f7199q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: I */
    public final void mo633I(float[] fArr) {
        this.f1189d.f1785r.mo633I(fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: K */
    public final C2684c mo634K(InterfaceC0430v interfaceC0430v, boolean z5) {
        return this.f1189d.f1785r.mo634K(interfaceC0430v, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: O */
    public final long mo635O(InterfaceC0430v interfaceC0430v, long j5) {
        boolean z5 = interfaceC0430v instanceof C0375M;
        AbstractC0573S abstractC0573S = this.f1189d;
        if (!z5) {
            AbstractC0573S abstractC0573SM694g = AbstractC0435z.m694g(abstractC0573S);
            AbstractC0596h0 abstractC0596h0 = abstractC0573SM694g.f1785r;
            long jMo635O = mo635O(abstractC0573SM694g.f1788u, j5);
            long j6 = abstractC0573SM694g.f1786s;
            long jM4646d = C2683b.m4646d(jMo635O, (4294967295L & ((long) Float.floatToRawIntBits((int) (j6 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32));
            if (!abstractC0596h0.mo981R0().f7199q) {
                AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            abstractC0596h0.m990a1();
            AbstractC0596h0 abstractC0596h02 = abstractC0596h0.f1934t;
            if (abstractC0596h02 != null) {
                abstractC0596h0 = abstractC0596h02;
            }
            return C2683b.m4647e(jM4646d, abstractC0596h0.mo635O(interfaceC0430v, 0L));
        }
        AbstractC0573S abstractC0573S2 = ((C0375M) interfaceC0430v).f1189d;
        AbstractC0596h0 abstractC0596h03 = abstractC0573S2.f1785r;
        abstractC0596h03.m990a1();
        AbstractC0573S abstractC0573SMo979P0 = abstractC0573S.f1785r.m977N0(abstractC0596h03).mo979P0();
        if (abstractC0573SMo979P0 != null) {
            long jM3701b = C2014j.m3701b(C2014j.m3702c(abstractC0573S2.m898J0(abstractC0573SMo979P0, false), AbstractC1923e.m3457Q(j5)), abstractC0573S.m898J0(abstractC0573SMo979P0, false));
            return (((long) Float.floatToRawIntBits((int) (jM3701b >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jM3701b & 4294967295L))) & 4294967295L);
        }
        AbstractC0573S abstractC0573SM694g2 = AbstractC0435z.m694g(abstractC0573S2);
        long jM3702c = C2014j.m3702c(C2014j.m3702c(abstractC0573S2.m898J0(abstractC0573SM694g2, false), abstractC0573SM694g2.f1786s), AbstractC1923e.m3457Q(j5));
        AbstractC0573S abstractC0573SM694g3 = AbstractC0435z.m694g(abstractC0573S);
        long jM3701b2 = C2014j.m3701b(jM3702c, C2014j.m3702c(abstractC0573S.m898J0(abstractC0573SM694g3, false), abstractC0573SM694g3.f1786s));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jM3701b2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jM3701b2 & 4294967295L))) & 4294967295L;
        AbstractC0596h0 abstractC0596h04 = abstractC0573SM694g3.f1785r.f1934t;
        AbstractC1665j.m2982b(abstractC0596h04);
        AbstractC0596h0 abstractC0596h05 = abstractC0573SM694g2.f1785r.f1934t;
        AbstractC1665j.m2982b(abstractC0596h05);
        return abstractC0596h04.mo635O(abstractC0596h05, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: P */
    public final long mo636P(InterfaceC0430v interfaceC0430v, long j5) {
        return mo635O(interfaceC0430v, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: Q */
    public final long mo637Q() {
        AbstractC0573S abstractC0573S = this.f1189d;
        return (((long) abstractC0573S.f1206d) << 32) | (((long) abstractC0573S.f1207e) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: R */
    public final long mo638R(long j5) {
        return this.f1189d.f1785r.mo638R(C2683b.m4647e(j5, m639a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m639a() {
        AbstractC0573S abstractC0573S = this.f1189d;
        AbstractC0573S abstractC0573SM694g = AbstractC0435z.m694g(abstractC0573S);
        return C2683b.m4646d(mo635O(abstractC0573SM694g.f1788u, 0L), abstractC0573S.f1785r.mo635O(abstractC0573SM694g.f1785r, 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: d */
    public final long mo640d(long j5) {
        return this.f1189d.f1785r.mo640d(C2683b.m4647e(0L, m639a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: i */
    public final long mo641i(long j5) {
        return C2683b.m4647e(this.f1189d.f1785r.mo641i(j5), m639a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: k */
    public final long mo642k(long j5) {
        return this.f1189d.f1785r.mo642k(C2683b.m4647e(j5, m639a()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: n */
    public final InterfaceC0430v mo643n() {
        AbstractC0573S abstractC0573SMo979P0;
        if (!mo632D()) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC0596h0 abstractC0596h0 = this.f1189d.f1785r.f1932r.f1699J.f1894d.f1934t;
        if (abstractC0596h0 == null || (abstractC0573SMo979P0 = abstractC0596h0.mo979P0()) == null) {
            return null;
        }
        return abstractC0573SMo979P0.f1788u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: s */
    public final void mo644s(InterfaceC0430v interfaceC0430v, float[] fArr) {
        this.f1189d.f1785r.mo644s(interfaceC0430v, fArr);
    }
}
