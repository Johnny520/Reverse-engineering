package p148k;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import ec.AbstractC2148k;
import ec.InterfaceC2165o0;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p121i3.AbstractC3174d;
import p121i3.C3189s;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p163l.AbstractC4336n3;
import p163l.C4271b;
import p163l.C4307i;
import p163l.EnumC4297g;
import p163l.InterfaceC4317k;
import p165l1.InterfaceC4499e;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: k.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3881i0 extends AbstractC3871d0 {

    /* JADX INFO: renamed from: G */
    public InterfaceC4317k f11206G;

    /* JADX INFO: renamed from: H */
    public InterfaceC4499e f11207H;

    /* JADX INFO: renamed from: I */
    public InterfaceC0188p f11208I;

    /* JADX INFO: renamed from: L */
    public boolean f11211L;

    /* JADX INFO: renamed from: J */
    public long f11209J = AbstractC3886l.m15429c();

    /* JADX INFO: renamed from: K */
    public long f11210K = AbstractC3174d.m11985b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: M */
    public final InterfaceC0512i2 f11212M = AbstractC0522j5.m1773e(null, null, 2, null);

    /* JADX INFO: renamed from: k.i0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f11215q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ a f11216r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f11217s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ C3881i0 f11218t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, long j10, C3881i0 c3881i0, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f11216r = aVar;
            this.f11217s = j10;
            this.f11218t = c3881i0;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new b(this.f11216r, this.f11217s, this.f11218t, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            InterfaceC0188p interfaceC0188pM15414K2;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f11215q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                C4271b c4271bM15420a = this.f11216r.m15420a();
                C3189s c3189sM12081b = C3189s.m12081b(this.f11217s);
                InterfaceC4317k interfaceC4317kM15413J2 = this.f11218t.m15413J2();
                this.f11215q = 1;
                bVar = this;
                obj = C4271b.m16787f(c4271bM15420a, c3189sM12081b, interfaceC4317kM15413J2, null, null, bVar, 12, null);
                if (obj == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
                bVar = this;
            }
            C4307i c4307i = (C4307i) obj;
            if (c4307i.m16933a() == EnumC4297g.f12614r && (interfaceC0188pM15414K2 = bVar.f11218t.m15414K2()) != null) {
                interfaceC0188pM15414K2.invoke(C3189s.m12081b(bVar.f11216r.m15421b()), c4307i.m16934b().getValue());
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: k.i0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ long f11220s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ int f11221t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ int f11222u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC3561q0 f11223v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC3545l1 f11224w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, int i10, int i11, InterfaceC3561q0 interfaceC3561q0, AbstractC3545l1 abstractC3545l1) {
            super(1);
            this.f11220s = j10;
            this.f11221t = i10;
            this.f11222u = i11;
            this.f11223v = interfaceC3561q0;
            this.f11224w = abstractC3545l1;
        }

        /* JADX INFO: renamed from: a */
        public final void m15423a(AbstractC3545l1.a aVar) {
            AbstractC3545l1.a.m13269B(aVar, this.f11224w, C3881i0.this.m15411H2().mo17411a(this.f11220s, C3189s.m12082c((((long) this.f11221t) << 32) | (((long) this.f11222u) & 4294967295L)), this.f11223v.getLayoutDirection()), 0.0f, 2, null);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m15423a((AbstractC3545l1.a) obj);
            return C4700i0.f13910a;
        }
    }

    public C3881i0(InterfaceC4317k interfaceC4317k, InterfaceC4499e interfaceC4499e, InterfaceC0188p interfaceC0188p) {
        this.f11206G = interfaceC4317k;
        this.f11207H = interfaceC4499e;
        this.f11208I = interfaceC0188p;
    }

    /* JADX INFO: renamed from: P2 */
    private final void m15409P2(long j10) {
        this.f11210K = j10;
        this.f11211L = true;
    }

    /* JADX INFO: renamed from: G2 */
    public final long m15410G2(long j10) {
        a aVarM15412I2 = m15412I2();
        if (aVarM15412I2 != null) {
            boolean z10 = (C3189s.m12084e(j10, ((C3189s) aVarM15412I2.m15420a().m16795m()).m12087h()) || aVarM15412I2.m15420a().m16798p()) ? false : true;
            if (!C3189s.m12084e(j10, ((C3189s) aVarM15412I2.m15420a().m16793k()).m12087h()) || z10) {
                aVarM15412I2.m15422c(((C3189s) aVarM15412I2.m15420a().m16795m()).m12087h());
                AbstractC2148k.m7817d(m17455f2(), null, null, new b(aVarM15412I2, j10, this, null), 3, null);
            }
        } else {
            long j11 = 1;
            aVarM15412I2 = new a(new C4271b(C3189s.m12081b(j10), AbstractC4336n3.m17030y(C3189s.f8481b), C3189s.m12081b(C3189s.m12082c((j11 & 4294967295L) | (j11 << 32))), null, 8, null), j10, null);
        }
        m15416M2(aVarM15412I2);
        return ((C3189s) aVarM15412I2.m15420a().m16795m()).m12087h();
    }

    /* JADX INFO: renamed from: H2 */
    public final InterfaceC4499e m15411H2() {
        return this.f11207H;
    }

    /* JADX INFO: renamed from: I2 */
    public final a m15412I2() {
        return (a) this.f11212M.getValue();
    }

    /* JADX INFO: renamed from: J2 */
    public final InterfaceC4317k m15413J2() {
        return this.f11206G;
    }

    /* JADX INFO: renamed from: K2 */
    public final InterfaceC0188p m15414K2() {
        return this.f11208I;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m15415L2(InterfaceC4499e interfaceC4499e) {
        this.f11207H = interfaceC4499e;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m15416M2(a aVar) {
        this.f11212M.setValue(aVar);
    }

    /* JADX INFO: renamed from: N2 */
    public final void m15417N2(InterfaceC4317k interfaceC4317k) {
        this.f11206G = interfaceC4317k;
    }

    /* JADX INFO: renamed from: O2 */
    public final void m15418O2(InterfaceC0188p interfaceC0188p) {
        this.f11208I = interfaceC0188p;
    }

    /* JADX INFO: renamed from: Q2 */
    public final long m15419Q2(long j10) {
        return this.f11211L ? this.f11210K : j10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        AbstractC3545l1 abstractC3545l1Mo13148X;
        long jM11987d;
        if (interfaceC3561q0.mo1232g1()) {
            m15409P2(j10);
            abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        } else {
            abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(m15419Q2(j10));
        }
        AbstractC3545l1 abstractC3545l1 = abstractC3545l1Mo13148X;
        long jM12082c = C3189s.m12082c((((long) abstractC3545l1.m13264M0()) << 32) | (((long) abstractC3545l1.m13259G0()) & 4294967295L));
        if (interfaceC3561q0.mo1232g1()) {
            this.f11209J = jM12082c;
            jM11987d = jM12082c;
        } else {
            jM11987d = AbstractC3174d.m11987d(j10, m15410G2(AbstractC3886l.m15430d(this.f11209J) ? this.f11209J : jM12082c));
        }
        int i10 = (int) (jM11987d >> 32);
        int i11 = (int) (jM11987d & 4294967295L);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, i10, i11, null, new c(jM12082c, i10, i11, interfaceC3561q0, abstractC3545l1), 4, null);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: p2 */
    public void mo1377p2() {
        super.mo1377p2();
        this.f11209J = AbstractC3886l.m15429c();
        this.f11211L = false;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: r2 */
    public void mo15375r2() {
        super.mo15375r2();
        m15416M2(null);
    }

    /* JADX INFO: renamed from: k.i0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C4271b f11213a;

        /* JADX INFO: renamed from: b */
        public long f11214b;

        public a(C4271b c4271b, long j10) {
            this.f11213a = c4271b;
            this.f11214b = j10;
        }

        /* JADX INFO: renamed from: a */
        public final C4271b m15420a() {
            return this.f11213a;
        }

        /* JADX INFO: renamed from: b */
        public final long m15421b() {
            return this.f11214b;
        }

        /* JADX INFO: renamed from: c */
        public final void m15422c(long j10) {
            this.f11214b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f11213a, aVar.f11213a) && C3189s.m12084e(this.f11214b, aVar.f11214b);
        }

        public int hashCode() {
            return (this.f11213a.hashCode() * 31) + C3189s.m12085f(this.f11214b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f11213a + ", startSize=" + ((Object) C3189s.m12086g(this.f11214b)) + ')';
        }

        public /* synthetic */ a(C4271b c4271b, long j10, AbstractC1043k abstractC1043k) {
            this(c4271b, j10);
        }
    }
}
