package p290u1;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p215oc.C5729x;
import p250r1.C6461k;
import p265s1.AbstractC7054b2;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.AbstractC7127q0;
import p265s1.AbstractC7133r1;
import p265s1.AbstractC7139s2;
import p265s1.AbstractC7168z0;
import p265s1.C7128q1;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7089i2;
import p265s1.InterfaceC7134r2;
import p265s1.InterfaceC7144t2;
import p265s1.InterfaceC7149u2;
import p305v1.C8761c;

/* JADX INFO: renamed from: u1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8482a implements InterfaceC8487f {

    /* JADX INFO: renamed from: q */
    public final a f28327q = new a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: r */
    public final InterfaceC8485d f28328r = new b();

    /* JADX INFO: renamed from: s */
    public InterfaceC7134r2 f28329s;

    /* JADX INFO: renamed from: t */
    public InterfaceC7134r2 f28330t;

    /* JADX INFO: renamed from: u1.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC8485d {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8489h f28335a = AbstractC8483b.m32637b(this);

        /* JADX INFO: renamed from: b */
        public C8761c f28336b;

        public b() {
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: a */
        public void mo32627a(EnumC3191u enumC3191u) {
            C8482a.this.m32613x().m32625k(enumC3191u);
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: b */
        public long mo32628b() {
            return C8482a.this.m32613x().m32622h();
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: c */
        public void mo32629c(InterfaceC7088i1 interfaceC7088i1) {
            C8482a.this.m32613x().m32623i(interfaceC7088i1);
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: d */
        public void mo32630d(C8761c c8761c) {
            this.f28336b = c8761c;
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: e */
        public void mo32631e(InterfaceC3175e interfaceC3175e) {
            C8482a.this.m32613x().m32624j(interfaceC3175e);
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: f */
        public InterfaceC8489h mo32632f() {
            return this.f28335a;
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: g */
        public void mo32633g(long j10) {
            C8482a.this.m32613x().m32626l(j10);
        }

        @Override // p290u1.InterfaceC8485d
        public InterfaceC3175e getDensity() {
            return C8482a.this.m32613x().m32620f();
        }

        @Override // p290u1.InterfaceC8485d
        public EnumC3191u getLayoutDirection() {
            return C8482a.this.m32613x().m32621g();
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: h */
        public C8761c mo32634h() {
            return this.f28336b;
        }

        @Override // p290u1.InterfaceC8485d
        /* JADX INFO: renamed from: i */
        public InterfaceC7088i1 mo32635i() {
            return C8482a.this.m32613x().m32619e();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC7134r2 m32602g(C8482a c8482a, long j10, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10, int i11, int i12, Object obj) {
        return c8482a.m32609d(j10, abstractC8488g, f10, abstractC7133r1, i10, (i12 & 32) != 0 ? InterfaceC8487f.f28340p.m32662b() : i11);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC7134r2 m32603o(C8482a c8482a, AbstractC7078g1 abstractC7078g1, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = InterfaceC8487f.f28340p.m32662b();
        }
        return c8482a.m32610l(abstractC7078g1, abstractC8488g, f10, abstractC7133r1, i10, i11);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ InterfaceC7134r2 m32604t(C8482a c8482a, long j10, float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, float f12, AbstractC7133r1 abstractC7133r1, int i12, int i13, int i14, Object obj) {
        return c8482a.m32611q(j10, f10, f11, i10, i11, interfaceC7149u2, f12, abstractC7133r1, i12, (i14 & 512) != 0 ? InterfaceC8487f.f28340p.m32662b() : i13);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ InterfaceC7134r2 m32605v(C8482a c8482a, AbstractC7078g1 abstractC7078g1, float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, float f12, AbstractC7133r1 abstractC7133r1, int i12, int i13, int i14, Object obj) {
        return c8482a.m32612u(abstractC7078g1, f10, f11, i10, i11, interfaceC7149u2, f12, abstractC7133r1, i12, (i14 & 512) != 0 ? InterfaceC8487f.f28340p.m32662b() : i13);
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: A1 */
    public void mo18026A1(AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f28327q.m32619e().mo27837i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), m32603o(this, abstractC7078g1, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC7134r2 m32606B() {
        InterfaceC7134r2 interfaceC7134r2 = this.f28329s;
        if (interfaceC7134r2 != null) {
            return interfaceC7134r2;
        }
        InterfaceC7134r2 interfaceC7134r2M28093a = AbstractC7127q0.m28093a();
        interfaceC7134r2M28093a.mo28075t(AbstractC7139s2.f23669a.m28210a());
        this.f28329s = interfaceC7134r2M28093a;
        return interfaceC7134r2M28093a;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: C1 */
    public void mo18027C1(long j10, long j11, long j12, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11) {
        this.f28327q.m32619e().mo27835g(j11, j12, m32604t(this, j10, f10, 4.0f, i10, AbstractC7110m3.f23617a.m28010b(), interfaceC7149u2, f11, abstractC7133r1, i11, 0, 512, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: D1 */
    public void mo18028D1(long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f28327q.m32619e().mo27837i(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), m32602g(this, j10, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: E1 */
    public void mo18029E1(InterfaceC7144t2 interfaceC7144t2, AbstractC7078g1 abstractC7078g1, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        this.f28327q.m32619e().mo27839k(interfaceC7144t2, m32603o(this, abstractC7078g1, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    /* JADX INFO: renamed from: G */
    public final InterfaceC7134r2 m32607G() {
        InterfaceC7134r2 interfaceC7134r2 = this.f28330t;
        if (interfaceC7134r2 != null) {
            return interfaceC7134r2;
        }
        InterfaceC7134r2 interfaceC7134r2M28093a = AbstractC7127q0.m28093a();
        interfaceC7134r2M28093a.mo28075t(AbstractC7139s2.f23669a.m28211b());
        this.f28330t = interfaceC7134r2M28093a;
        return interfaceC7134r2M28093a;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: K1 */
    public void mo18031K1(AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11) {
        this.f28327q.m32619e().mo27835g(j10, j11, m32605v(this, abstractC7078g1, f10, 4.0f, i10, AbstractC7110m3.f23617a.m28010b(), interfaceC7149u2, f11, abstractC7133r1, i11, 0, 512, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: N */
    public void mo18032N(AbstractC7078g1 abstractC7078g1, long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f28327q.m32619e().mo27833e(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), m32603o(this, abstractC7078g1, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    /* JADX INFO: renamed from: O */
    public final InterfaceC7134r2 m32608O(AbstractC8488g abstractC8488g) {
        if (AbstractC1061t.m3842c(abstractC8488g, C8491j.f28345a)) {
            return m32606B();
        }
        if (!(abstractC8488g instanceof C8492k)) {
            C5729x.m23182a();
            return null;
        }
        InterfaceC7134r2 interfaceC7134r2M32607G = m32607G();
        C8492k c8492k = (C8492k) abstractC8488g;
        if (interfaceC7134r2M32607G.mo28079x() != c8492k.m32670f()) {
            interfaceC7134r2M32607G.mo28078w(c8492k.m32670f());
        }
        if (!AbstractC7105l3.m27993e(interfaceC7134r2M32607G.mo28073r(), c8492k.m32666b())) {
            interfaceC7134r2M32607G.mo28064i(c8492k.m32666b());
        }
        if (interfaceC7134r2M32607G.mo28065j() != c8492k.m32668d()) {
            interfaceC7134r2M32607G.mo28070o(c8492k.m32668d());
        }
        if (!AbstractC7110m3.m28006e(interfaceC7134r2M32607G.mo28063h(), c8492k.m32667c())) {
            interfaceC7134r2M32607G.mo28074s(c8492k.m32667c());
        }
        interfaceC7134r2M32607G.mo28077v();
        c8492k.m32669e();
        if (!AbstractC1061t.m3842c(null, null)) {
            c8492k.m32669e();
            interfaceC7134r2M32607G.mo28069n(null);
        }
        return interfaceC7134r2M32607G;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: S1 */
    public void mo18033S1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f28327q.m32619e().mo27843p(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), f10, f11, z10, m32602g(this, j10, abstractC8488g, f12, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: Y */
    public void mo18035Y(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, long j12, long j13, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11) {
        this.f28327q.m32619e().mo27838j(interfaceC7089i2, j10, j11, j12, j13, m32610l(null, abstractC8488g, f10, abstractC7133r1, i10, i11));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: Z1 */
    public void mo18036Z1(long j10, float f10, long j11, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        this.f28327q.m32619e().mo27846u(j11, f10, m32602g(this, j10, abstractC8488g, f11, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f28327q.m32620f().mo1231c1();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7134r2 m32609d(long j10, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10, int i11) {
        InterfaceC7134r2 interfaceC7134r2M32608O = m32608O(abstractC8488g);
        long jM32614z = m32614z(j10, f10);
        if (!C7128q1.m28131q(interfaceC7134r2M32608O.mo28057b(), jM32614z)) {
            interfaceC7134r2M32608O.mo28076u(jM32614z);
        }
        if (interfaceC7134r2M32608O.mo28068m() != null) {
            interfaceC7134r2M32608O.mo28067l(null);
        }
        if (!AbstractC1061t.m3842c(interfaceC7134r2M32608O.mo28059d(), abstractC7133r1)) {
            interfaceC7134r2M32608O.mo28061f(abstractC7133r1);
        }
        if (!AbstractC7168z0.m28276E(interfaceC7134r2M32608O.mo28062g(), i10)) {
            interfaceC7134r2M32608O.mo28058c(i10);
        }
        if (!AbstractC7054b2.m27765d(interfaceC7134r2M32608O.mo28072q(), i11)) {
            interfaceC7134r2M32608O.mo28071p(i11);
        }
        return interfaceC7134r2M32608O;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: f1 */
    public void mo18039f1(InterfaceC7144t2 interfaceC7144t2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        this.f28327q.m32619e().mo27839k(interfaceC7144t2, m32602g(this, j10, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f28327q.m32620f().getDensity();
    }

    @Override // p290u1.InterfaceC8487f
    public EnumC3191u getLayoutDirection() {
        return this.f28327q.m32621g();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC7134r2 m32610l(AbstractC7078g1 abstractC7078g1, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10, int i11) {
        InterfaceC7134r2 interfaceC7134r2M32608O = m32608O(abstractC8488g);
        if (abstractC7078g1 != null) {
            abstractC7078g1.mo27855a(mo18037b(), interfaceC7134r2M32608O, f10);
        } else {
            if (interfaceC7134r2M32608O.mo28068m() != null) {
                interfaceC7134r2M32608O.mo28067l(null);
            }
            long jMo28057b = interfaceC7134r2M32608O.mo28057b();
            C7128q1.a aVar = C7128q1.f23644b;
            if (!C7128q1.m28131q(jMo28057b, aVar.m28140a())) {
                interfaceC7134r2M32608O.mo28076u(aVar.m28140a());
            }
            if (interfaceC7134r2M32608O.mo28056a() != f10) {
                interfaceC7134r2M32608O.mo28060e(f10);
            }
        }
        if (!AbstractC1061t.m3842c(interfaceC7134r2M32608O.mo28059d(), abstractC7133r1)) {
            interfaceC7134r2M32608O.mo28061f(abstractC7133r1);
        }
        if (!AbstractC7168z0.m28276E(interfaceC7134r2M32608O.mo28062g(), i10)) {
            interfaceC7134r2M32608O.mo28058c(i10);
        }
        if (!AbstractC7054b2.m27765d(interfaceC7134r2M32608O.mo28072q(), i11)) {
            interfaceC7134r2M32608O.mo28071p(i11);
        }
        return interfaceC7134r2M32608O;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: l0 */
    public void mo18042l0(AbstractC7078g1 abstractC7078g1, float f10, long j10, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        this.f28327q.m32619e().mo27846u(j10, f10, m32603o(this, abstractC7078g1, abstractC8488g, f11, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: m1 */
    public void mo18043m1(long j10, long j11, long j12, long j13, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        this.f28327q.m32619e().mo27833e(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), m32602g(this, j10, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: n1 */
    public InterfaceC8485d mo18044n1() {
        return this.f28328r;
    }

    @Override // p290u1.InterfaceC8487f
    /* JADX INFO: renamed from: p0 */
    public void mo18045p0(InterfaceC7089i2 interfaceC7089i2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        this.f28327q.m32619e().mo27845s(interfaceC7089i2, j10, m32603o(this, null, abstractC8488g, f10, abstractC7133r1, i10, 0, 32, null));
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC7134r2 m32611q(long j10, float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, float f12, AbstractC7133r1 abstractC7133r1, int i12, int i13) {
        InterfaceC7134r2 interfaceC7134r2M32607G = m32607G();
        long jM32614z = m32614z(j10, f12);
        if (!C7128q1.m28131q(interfaceC7134r2M32607G.mo28057b(), jM32614z)) {
            interfaceC7134r2M32607G.mo28076u(jM32614z);
        }
        if (interfaceC7134r2M32607G.mo28068m() != null) {
            interfaceC7134r2M32607G.mo28067l(null);
        }
        if (!AbstractC1061t.m3842c(interfaceC7134r2M32607G.mo28059d(), abstractC7133r1)) {
            interfaceC7134r2M32607G.mo28061f(abstractC7133r1);
        }
        if (!AbstractC7168z0.m28276E(interfaceC7134r2M32607G.mo28062g(), i12)) {
            interfaceC7134r2M32607G.mo28058c(i12);
        }
        if (interfaceC7134r2M32607G.mo28079x() != f10) {
            interfaceC7134r2M32607G.mo28078w(f10);
        }
        if (interfaceC7134r2M32607G.mo28065j() != f11) {
            interfaceC7134r2M32607G.mo28070o(f11);
        }
        if (!AbstractC7105l3.m27993e(interfaceC7134r2M32607G.mo28073r(), i10)) {
            interfaceC7134r2M32607G.mo28064i(i10);
        }
        if (!AbstractC7110m3.m28006e(interfaceC7134r2M32607G.mo28063h(), i11)) {
            interfaceC7134r2M32607G.mo28074s(i11);
        }
        interfaceC7134r2M32607G.mo28077v();
        if (!AbstractC1061t.m3842c(null, interfaceC7149u2)) {
            interfaceC7134r2M32607G.mo28069n(interfaceC7149u2);
        }
        if (!AbstractC7054b2.m27765d(interfaceC7134r2M32607G.mo28072q(), i13)) {
            interfaceC7134r2M32607G.mo28071p(i13);
        }
        return interfaceC7134r2M32607G;
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC7134r2 m32612u(AbstractC7078g1 abstractC7078g1, float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, float f12, AbstractC7133r1 abstractC7133r1, int i12, int i13) {
        InterfaceC7134r2 interfaceC7134r2M32607G = m32607G();
        if (abstractC7078g1 != null) {
            abstractC7078g1.mo27855a(mo18037b(), interfaceC7134r2M32607G, f12);
        } else if (interfaceC7134r2M32607G.mo28056a() != f12) {
            interfaceC7134r2M32607G.mo28060e(f12);
        }
        if (!AbstractC1061t.m3842c(interfaceC7134r2M32607G.mo28059d(), abstractC7133r1)) {
            interfaceC7134r2M32607G.mo28061f(abstractC7133r1);
        }
        if (!AbstractC7168z0.m28276E(interfaceC7134r2M32607G.mo28062g(), i12)) {
            interfaceC7134r2M32607G.mo28058c(i12);
        }
        if (interfaceC7134r2M32607G.mo28079x() != f10) {
            interfaceC7134r2M32607G.mo28078w(f10);
        }
        if (interfaceC7134r2M32607G.mo28065j() != f11) {
            interfaceC7134r2M32607G.mo28070o(f11);
        }
        if (!AbstractC7105l3.m27993e(interfaceC7134r2M32607G.mo28073r(), i10)) {
            interfaceC7134r2M32607G.mo28064i(i10);
        }
        if (!AbstractC7110m3.m28006e(interfaceC7134r2M32607G.mo28063h(), i11)) {
            interfaceC7134r2M32607G.mo28074s(i11);
        }
        interfaceC7134r2M32607G.mo28077v();
        if (!AbstractC1061t.m3842c(null, interfaceC7149u2)) {
            interfaceC7134r2M32607G.mo28069n(interfaceC7149u2);
        }
        if (!AbstractC7054b2.m27765d(interfaceC7134r2M32607G.mo28072q(), i13)) {
            interfaceC7134r2M32607G.mo28071p(i13);
        }
        return interfaceC7134r2M32607G;
    }

    /* JADX INFO: renamed from: x */
    public final a m32613x() {
        return this.f28327q;
    }

    /* JADX INFO: renamed from: z */
    public final long m32614z(long j10, float f10) {
        return f10 == 1.0f ? j10 : C7128q1.m28129o(j10, C7128q1.m28132r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: renamed from: u1.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC3175e f28331a;

        /* JADX INFO: renamed from: b */
        public EnumC3191u f28332b;

        /* JADX INFO: renamed from: c */
        public InterfaceC7088i1 f28333c;

        /* JADX INFO: renamed from: d */
        public long f28334d;

        public /* synthetic */ a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, InterfaceC7088i1 interfaceC7088i1, long j10, int i10, AbstractC1043k abstractC1043k) {
            this((i10 & 1) != 0 ? AbstractC8486e.m32646a() : interfaceC3175e, (i10 & 2) != 0 ? EnumC3191u.f8484q : enumC3191u, (i10 & 4) != 0 ? C8490i.f28344a : interfaceC7088i1, (i10 & 8) != 0 ? C6461k.f20335b.m25627b() : j10, null);
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC3175e m32615a() {
            return this.f28331a;
        }

        /* JADX INFO: renamed from: b */
        public final EnumC3191u m32616b() {
            return this.f28332b;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC7088i1 m32617c() {
            return this.f28333c;
        }

        /* JADX INFO: renamed from: d */
        public final long m32618d() {
            return this.f28334d;
        }

        /* JADX INFO: renamed from: e */
        public final InterfaceC7088i1 m32619e() {
            return this.f28333c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f28331a, aVar.f28331a) && this.f28332b == aVar.f28332b && AbstractC1061t.m3842c(this.f28333c, aVar.f28333c) && C6461k.m25618f(this.f28334d, aVar.f28334d);
        }

        /* JADX INFO: renamed from: f */
        public final InterfaceC3175e m32620f() {
            return this.f28331a;
        }

        /* JADX INFO: renamed from: g */
        public final EnumC3191u m32621g() {
            return this.f28332b;
        }

        /* JADX INFO: renamed from: h */
        public final long m32622h() {
            return this.f28334d;
        }

        public int hashCode() {
            return (((((this.f28331a.hashCode() * 31) + this.f28332b.hashCode()) * 31) + this.f28333c.hashCode()) * 31) + C6461k.m25622j(this.f28334d);
        }

        /* JADX INFO: renamed from: i */
        public final void m32623i(InterfaceC7088i1 interfaceC7088i1) {
            this.f28333c = interfaceC7088i1;
        }

        /* JADX INFO: renamed from: j */
        public final void m32624j(InterfaceC3175e interfaceC3175e) {
            this.f28331a = interfaceC3175e;
        }

        /* JADX INFO: renamed from: k */
        public final void m32625k(EnumC3191u enumC3191u) {
            this.f28332b = enumC3191u;
        }

        /* JADX INFO: renamed from: l */
        public final void m32626l(long j10) {
            this.f28334d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f28331a + ", layoutDirection=" + this.f28332b + ", canvas=" + this.f28333c + ", size=" + ((Object) C6461k.m25624l(this.f28334d)) + ')';
        }

        public a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, InterfaceC7088i1 interfaceC7088i1, long j10) {
            this.f28331a = interfaceC3175e;
            this.f28332b = enumC3191u;
            this.f28333c = interfaceC7088i1;
            this.f28334d = j10;
        }

        public /* synthetic */ a(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, InterfaceC7088i1 interfaceC7088i1, long j10, AbstractC1043k abstractC1043k) {
            this(interfaceC3175e, enumC3191u, interfaceC7088i1, j10);
        }
    }
}
