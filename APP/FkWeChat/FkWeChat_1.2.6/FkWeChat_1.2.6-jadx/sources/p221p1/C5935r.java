package p221p1;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.C3185o;
import p121i3.C3189s;
import p135j2.AbstractC3545l1;
import p135j2.AbstractC3586y1;
import p135j2.InterfaceC3527h;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p166l2.InterfaceC4587t;
import p172l8.C4700i0;
import p250r1.C6461k;
import p265s1.AbstractC7133r1;
import p290u1.InterfaceC8484c;
import p334x1.AbstractC9307c;

/* JADX INFO: renamed from: p1.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5935r extends InterfaceC4507m.c implements InterfaceC4534e0, InterfaceC4587t {

    /* JADX INFO: renamed from: F */
    public AbstractC9307c f18843F;

    /* JADX INFO: renamed from: G */
    public boolean f18844G;

    /* JADX INFO: renamed from: H */
    public InterfaceC4499e f18845H;

    /* JADX INFO: renamed from: I */
    public InterfaceC3527h f18846I;

    /* JADX INFO: renamed from: J */
    public float f18847J;

    /* JADX INFO: renamed from: K */
    public AbstractC7133r1 f18848K;

    /* JADX INFO: renamed from: p1.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ AbstractC3545l1 f18849r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC3545l1 abstractC3545l1) {
            super(1);
            this.f18849r = abstractC3545l1;
        }

        /* JADX INFO: renamed from: a */
        public final void m23868a(AbstractC3545l1.a aVar) {
            AbstractC3545l1.a.m13270O(aVar, this.f18849r, 0, 0, 0.0f, 4, null);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m23868a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C5935r(AbstractC9307c abstractC9307c, boolean z10, InterfaceC4499e interfaceC4499e, InterfaceC3527h interfaceC3527h, float f10, AbstractC7133r1 abstractC7133r1) {
        this.f18843F = abstractC9307c;
        this.f18844G = z10;
        this.f18845H = interfaceC4499e;
        this.f18846I = interfaceC3527h;
        this.f18847J = f10;
        this.f18848K = abstractC7133r1;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!m23858J2()) {
            return interfaceC3563r.mo13151z0(i10);
        }
        long jM23861M2 = m23861M2(AbstractC3174d.m11985b(0, i10, 0, 0, 13, null));
        return Math.max(C3173c.m11974m(jM23861M2), interfaceC3563r.mo13151z0(i10));
    }

    /* JADX INFO: renamed from: G2 */
    public final long m23855G2(long j10) {
        if (!m23858J2()) {
            return j10;
        }
        long jM25616d = C6461k.m25616d((((long) Float.floatToRawIntBits(!m23860L2(this.f18843F.mo36269h()) ? Float.intBitsToFloat((int) (j10 >> 32)) : Float.intBitsToFloat((int) (this.f18843F.mo36269h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m23859K2(this.f18843F.mo36269h()) ? Float.intBitsToFloat((int) (j10 & 4294967295L)) : Float.intBitsToFloat((int) (this.f18843F.mo36269h() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j10 >> 32)) == 0.0f || Float.intBitsToFloat((int) (j10 & 4294967295L)) == 0.0f) ? C6461k.f20335b.m25627b() : AbstractC3586y1.m13424a(jM25616d, this.f18846I.mo13126a(jM25616d, j10));
    }

    /* JADX INFO: renamed from: H2 */
    public final AbstractC9307c m23856H2() {
        return this.f18843F;
    }

    /* JADX INFO: renamed from: I2 */
    public final boolean m23857I2() {
        return this.f18844G;
    }

    /* JADX INFO: renamed from: J2 */
    public final boolean m23858J2() {
        return this.f18844G && this.f18843F.mo36269h() != 9205357640488583168L;
    }

    /* JADX INFO: renamed from: K2 */
    public final boolean m23859K2(long j10) {
        return !C6461k.m25618f(j10, C6461k.f20335b.m25626a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m23860L2(long j10) {
        return !C6461k.m25618f(j10, C6461k.f20335b.m25626a()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: M2 */
    public final long m23861M2(long j10) {
        boolean z10 = false;
        boolean z11 = C3173c.m11969h(j10) && C3173c.m11968g(j10);
        if (C3173c.m11971j(j10) && C3173c.m11970i(j10)) {
            z10 = true;
        }
        if ((!m23858J2() && z11) || z10) {
            return C3173c.m11965d(j10, C3173c.m11973l(j10), 0, C3173c.m11972k(j10), 0, 10, null);
        }
        long jMo36269h = this.f18843F.mo36269h();
        int iRound = m23860L2(jMo36269h) ? Math.round(Float.intBitsToFloat((int) (jMo36269h >> 32))) : C3173c.m11975n(j10);
        int iRound2 = m23859K2(jMo36269h) ? Math.round(Float.intBitsToFloat((int) (jMo36269h & 4294967295L))) : C3173c.m11974m(j10);
        long jM23855G2 = m23855G2(C6461k.m25616d((((long) Float.floatToRawIntBits(AbstractC3174d.m11989f(j10, iRound2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC3174d.m11990g(j10, iRound))) << 32)));
        return C3173c.m11965d(j10, AbstractC3174d.m11990g(j10, Math.round(Float.intBitsToFloat((int) (jM23855G2 >> 32)))), 0, AbstractC3174d.m11989f(j10, Math.round(Float.intBitsToFloat((int) (jM23855G2 & 4294967295L)))), 0, 10, null);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m23862N2(InterfaceC4499e interfaceC4499e) {
        this.f18845H = interfaceC4499e;
    }

    /* JADX INFO: renamed from: O2 */
    public final void m23863O2(InterfaceC3527h interfaceC3527h) {
        this.f18846I = interfaceC3527h;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m23864P2(AbstractC9307c abstractC9307c) {
        this.f18843F = abstractC9307c;
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m23865Q2(boolean z10) {
        this.f18844G = z10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(m23861M2(j10));
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new a(abstractC3545l1Mo13148X), 4, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m23866e(float f10) {
        this.f18847J = f10;
    }

    /* JADX INFO: renamed from: f */
    public final void m23867f(AbstractC7133r1 abstractC7133r1) {
        this.f18848K = abstractC7133r1;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!m23858J2()) {
            return interfaceC3563r.mo13150t(i10);
        }
        long jM23861M2 = m23861M2(AbstractC3174d.m11985b(0, i10, 0, 0, 13, null));
        return Math.max(C3173c.m11974m(jM23861M2), interfaceC3563r.mo13150t(i10));
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return false;
    }

    @Override // p166l2.InterfaceC4587t
    /* JADX INFO: renamed from: o */
    public void mo1376o(InterfaceC8484c interfaceC8484c) {
        long jMo36269h = this.f18843F.mo36269h();
        float fIntBitsToFloat = m23860L2(jMo36269h) ? Float.intBitsToFloat((int) (jMo36269h >> 32)) : Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() >> 32));
        long jM25616d = C6461k.m25616d((((long) Float.floatToRawIntBits(m23859K2(jMo36269h) ? Float.intBitsToFloat((int) (jMo36269h & 4294967295L)) : Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jM25627b = (Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() & 4294967295L)) == 0.0f) ? C6461k.f20335b.m25627b() : AbstractC3586y1.m13424a(jM25616d, this.f18846I.mo13126a(jM25616d, interfaceC8484c.mo18037b()));
        long jMo17411a = this.f18845H.mo17411a(C3189s.m12082c((((long) Math.round(Float.intBitsToFloat((int) (jM25627b & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jM25627b >> 32)))) << 32)), C3189s.m12082c((((long) Math.round(Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (interfaceC8484c.mo18037b() & 4294967295L)))) & 4294967295L)), interfaceC8484c.getLayoutDirection());
        float fM12049i = C3185o.m12049i(jMo17411a);
        float fM12050j = C3185o.m12050j(jMo17411a);
        interfaceC8484c.mo18044n1().mo32632f().mo32641d(fM12049i, fM12050j);
        try {
            this.f18843F.m36279g(interfaceC8484c, jM25627b, this.f18847J, this.f18848K);
            interfaceC8484c.mo18044n1().mo32632f().mo32641d(-fM12049i, -fM12050j);
            interfaceC8484c.mo18034W1();
        } catch (Throwable th) {
            interfaceC8484c.mo18044n1().mo32632f().mo32641d(-fM12049i, -fM12050j);
            throw th;
        }
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!m23858J2()) {
            return interfaceC3563r.mo13146S(i10);
        }
        long jM23861M2 = m23861M2(AbstractC3174d.m11985b(0, 0, 0, i10, 7, null));
        return Math.max(C3173c.m11975n(jM23861M2), interfaceC3563r.mo13146S(i10));
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f18843F + ", sizeToIntrinsics=" + this.f18844G + ", alignment=" + this.f18845H + ", alpha=" + this.f18847J + ", colorFilter=" + this.f18848K + ')';
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        if (!m23858J2()) {
            return interfaceC3563r.mo13147W(i10);
        }
        long jM23861M2 = m23861M2(AbstractC3174d.m11985b(0, 0, 0, i10, 7, null));
        return Math.max(C3173c.m11975n(jM23861M2), interfaceC3563r.mo13147W(i10));
    }
}
