package p189n;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1050n0;
import p121i3.C3179i;
import p166l2.AbstractC4565m;
import p166l2.InterfaceC4524b2;
import p172l8.C4700i0;
import p215oc.C5729x;
import p221p1.AbstractC5927j;
import p221p1.C5922e;
import p221p1.C5928k;
import p221p1.InterfaceC5920c;
import p250r1.AbstractC6460j;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6461k;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7123p1;
import p265s1.AbstractC7124p2;
import p265s1.AbstractC7133r1;
import p265s1.InterfaceC7089i2;
import p265s1.InterfaceC7090i3;
import p265s1.InterfaceC7144t2;
import p277t2.InterfaceC8074h0;
import p290u1.C8492k;
import p290u1.InterfaceC8484c;
import p290u1.InterfaceC8485d;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: n.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5286u extends AbstractC4565m implements InterfaceC4524b2 {

    /* JADX INFO: renamed from: H */
    public final boolean f16235H;

    /* JADX INFO: renamed from: I */
    public final boolean f16236I;

    /* JADX INFO: renamed from: J */
    public C5242l f16237J;

    /* JADX INFO: renamed from: K */
    public float f16238K;

    /* JADX INFO: renamed from: L */
    public AbstractC7078g1 f16239L;

    /* JADX INFO: renamed from: M */
    public InterfaceC7090i3 f16240M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC5920c f16241N;

    public C5286u(float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3) {
        this.f16238K = f10;
        this.f16239L = abstractC7078g1;
        this.f16240M = interfaceC7090i3;
        this.f16241N = (InterfaceC5920c) m18049G2(AbstractC5927j.m23841a(new InterfaceC0184l() { // from class: n.p
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5286u.m21554O2(this.f16178q, (C5922e) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M2 */
    public static C4700i0 m21552M2(boolean z10, AbstractC7078g1 abstractC7078g1, long j10, float f10, float f11, long j11, long j12, C8492k c8492k, InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        if (z10) {
            InterfaceC8487f.m32656t0(interfaceC8484c, abstractC7078g1, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
        } else if (Float.intBitsToFloat((int) (j10 >> 32)) < f10) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() >> 32)) - f11;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() & 4294967295L)) - f11;
            int iM28084a = AbstractC7123p1.f23633a.m28084a();
            InterfaceC8485d interfaceC8485dMo18044n1 = interfaceC8484c.mo18044n1();
            long jMo32628b = interfaceC8485dMo18044n1.mo32628b();
            interfaceC8485dMo18044n1.mo32635i().mo27841n();
            try {
                interfaceC8485dMo18044n1.mo32632f().mo32640c(f11, f11, fIntBitsToFloat, fIntBitsToFloat2, iM28084a);
                InterfaceC8487f.m32656t0(interfaceC8484c, abstractC7078g1, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
            } finally {
                interfaceC8485dMo18044n1.mo32635i().mo27847w();
                interfaceC8485dMo18044n1.mo32633g(jMo32628b);
            }
        } else {
            InterfaceC8487f.m32656t0(interfaceC8484c, abstractC7078g1, j11, j12, AbstractC5257o.m21505n(j10, f10), 0.0f, c8492k, null, 0, 208, null);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: N2 */
    public static C4700i0 m21553N2(AbstractC7124p2.a aVar, AbstractC7078g1 abstractC7078g1, InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        InterfaceC8487f.m32659y0(interfaceC8484c, aVar.m28087b(), abstractC7078g1, 0.0f, null, null, 0, 60, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: O2 */
    public static C5928k m21554O2(C5286u c5286u, C5922e c5922e) {
        if (c5922e.mo1233i1(c5286u.f16238K) < 0.0f || C6461k.m25620h(c5922e.m23827b()) <= 0.0f) {
            return AbstractC5257o.m21503l(c5922e);
        }
        float f10 = 2;
        float fMin = Math.min(C3179i.m12005m(c5286u.f16238K, C3179i.f8458r.m12010a()) ? 1.0f : (float) Math.ceil(c5922e.mo1233i1(c5286u.f16238K)), (float) Math.ceil(C6461k.m25620h(c5922e.m23827b()) / f10));
        float f11 = fMin / f10;
        long jM25551e = C6455e.m25551e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32));
        long jM25616d = C6461k.m25616d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c5922e.m23827b() & 4294967295L)) - fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c5922e.m23827b() >> 32)) - fMin)) << 32));
        boolean z10 = f10 * fMin > C6461k.m25620h(c5922e.m23827b());
        AbstractC7124p2 abstractC7124p2Mo4a = c5286u.f16240M.mo4a(c5922e.m23827b(), c5922e.getLayoutDirection(), c5922e);
        if (abstractC7124p2Mo4a instanceof AbstractC7124p2.a) {
            return c5286u.m21557R2(c5922e, c5286u.f16239L, (AbstractC7124p2.a) abstractC7124p2Mo4a, z10, fMin);
        }
        if (abstractC7124p2Mo4a instanceof AbstractC7124p2.c) {
            return c5286u.m21558S2(c5922e, c5286u.f16239L, (AbstractC7124p2.c) abstractC7124p2Mo4a, jM25551e, jM25616d, z10, fMin);
        }
        if (abstractC7124p2Mo4a instanceof AbstractC7124p2.b) {
            return AbstractC5257o.m21504m(c5922e, c5286u.f16239L, jM25551e, jM25616d, z10, fMin);
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: P2 */
    public static C4700i0 m21555P2(InterfaceC7144t2 interfaceC7144t2, AbstractC7078g1 abstractC7078g1, InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        InterfaceC8487f.m32659y0(interfaceC8484c, interfaceC7144t2, abstractC7078g1, 0.0f, null, null, 0, 60, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: Q2 */
    public static C4700i0 m21556Q2(C6457g c6457g, C1050n0 c1050n0, long j10, AbstractC7133r1 abstractC7133r1, InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        float fM25583l = c6457g.m25583l();
        float fM25586o = c6457g.m25586o();
        interfaceC8484c.mo18044n1().mo32632f().mo32641d(fM25583l, fM25586o);
        try {
            InterfaceC8487f.m32647F0(interfaceC8484c, (InterfaceC7089i2) c1050n0.f3208q, 0L, j10, 0L, 0L, 0.0f, null, abstractC7133r1, 0, 0, 890, null);
            interfaceC8484c.mo18044n1().mo32632f().mo32641d(-fM25583l, -fM25586o);
            return C4700i0.f13910a;
        } catch (Throwable th) {
            interfaceC8484c.mo18044n1().mo32632f().mo32641d(-fM25583l, -fM25586o);
            throw th;
        }
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: P */
    public boolean mo17543P() {
        return this.f16236I;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
    /* JADX INFO: renamed from: R2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p221p1.C5928k m21557R2(p221p1.C5922e r43, final p265s1.AbstractC7078g1 r44, final p265s1.AbstractC7124p2.a r45, boolean r46, float r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p189n.C5286u.m21557R2(p1.e, s1.g1, s1.p2$a, boolean, float):p1.k");
    }

    /* JADX INFO: renamed from: S2 */
    public final C5928k m21558S2(C5922e c5922e, final AbstractC7078g1 abstractC7078g1, AbstractC7124p2.c cVar, final long j10, final long j11, final boolean z10, final float f10) {
        if (AbstractC6460j.m25612e(cVar.m28089b())) {
            final long jM25605h = cVar.m28089b().m25605h();
            final float f11 = f10 / 2;
            final C8492k c8492k = new C8492k(f10, 0.0f, 0, 0, null, 30, null);
            return c5922e.m23830l(new InterfaceC0184l() { // from class: n.q
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C5286u.m21552M2(z10, abstractC7078g1, jM25605h, f11, f10, j10, j11, c8492k, (InterfaceC8484c) obj);
                }
            });
        }
        if (this.f16237J == null) {
            this.f16237J = new C5242l(null, null, null, null, 15, null);
        }
        C5242l c5242l = this.f16237J;
        c5242l.getClass();
        final InterfaceC7144t2 interfaceC7144t2M21502k = AbstractC5257o.m21502k(c5242l.m21478g(), cVar.m28089b(), f10, z10);
        return c5922e.m23830l(new InterfaceC0184l() { // from class: n.r
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5286u.m21555P2(interfaceC7144t2M21502k, abstractC7078g1, (InterfaceC8484c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T2 */
    public final void m21559T2(AbstractC7078g1 abstractC7078g1) {
        if (AbstractC1061t.m3842c(this.f16239L, abstractC7078g1)) {
            return;
        }
        this.f16239L = abstractC7078g1;
        this.f16241N.mo23820Z();
    }

    /* JADX INFO: renamed from: U2 */
    public final void m21560U2(float f10) {
        if (C3179i.m12005m(this.f16238K, f10)) {
            return;
        }
        this.f16238K = f10;
        this.f16241N.mo23820Z();
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f16235H;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m21561r1(InterfaceC7090i3 interfaceC7090i3) {
        if (AbstractC1061t.m3842c(this.f16240M, interfaceC7090i3)) {
            return;
        }
        this.f16240M = interfaceC7090i3;
        this.f16241N.mo23820Z();
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
    }

    public /* synthetic */ C5286u(float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3, AbstractC1043k abstractC1043k) {
        this(f10, abstractC7078g1, interfaceC7090i3);
    }
}
