package p163l;

import androidx.compose.runtime.AbstractC0456a2;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0471c3;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0595t4;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0491f2;
import androidx.compose.runtime.InterfaceC0505h2;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0564p5;
import androidx.compose.runtime.InterfaceC0572r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import ec.AbstractC2148k;
import ec.AbstractC2169p0;
import ec.EnumC2173q0;
import ec.InterfaceC2165o0;
import java.util.List;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p049d9.AbstractC1927c;
import p163l.AbstractC4304h1;
import p163l.C4295f2;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l.f2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4295f2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4355r2 f12570a;

    /* JADX INFO: renamed from: b */
    public final C4295f2 f12571b;

    /* JADX INFO: renamed from: c */
    public final String f12572c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0512i2 f12573d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f12574e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0505h2 f12575f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0505h2 f12576g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0512i2 f12577h;

    /* JADX INFO: renamed from: i */
    public final SnapshotStateList f12578i;

    /* JADX INFO: renamed from: j */
    public final SnapshotStateList f12579j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0512i2 f12580k;

    /* JADX INFO: renamed from: l */
    public long f12581l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC0564p5 f12582m;

    /* JADX INFO: renamed from: l.f2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4365t2 f12583a;

        /* JADX INFO: renamed from: b */
        public final String f12584b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0512i2 f12585c = AbstractC0522j5.m1773e(null, null, 2, null);

        /* JADX INFO: renamed from: l.f2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public final class C10137a implements InterfaceC0564p5 {

            /* JADX INFO: renamed from: q */
            public final d f12587q;

            /* JADX INFO: renamed from: r */
            public InterfaceC0184l f12588r;

            /* JADX INFO: renamed from: s */
            public InterfaceC0184l f12589s;

            public C10137a(d dVar, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
                this.f12587q = dVar;
                this.f12588r = interfaceC0184l;
                this.f12589s = interfaceC0184l2;
            }

            /* JADX INFO: renamed from: d */
            public final d m16896d() {
                return this.f12587q;
            }

            /* JADX INFO: renamed from: e */
            public final InterfaceC0184l m16897e() {
                return this.f12589s;
            }

            @Override // androidx.compose.runtime.InterfaceC0564p5
            public Object getValue() {
                m16901o(C4295f2.this.m16882q());
                return this.f12587q.getValue();
            }

            /* JADX INFO: renamed from: k */
            public final InterfaceC0184l m16898k() {
                return this.f12588r;
            }

            /* JADX INFO: renamed from: l */
            public final void m16899l(InterfaceC0184l interfaceC0184l) {
                this.f12589s = interfaceC0184l;
            }

            /* JADX INFO: renamed from: m */
            public final void m16900m(InterfaceC0184l interfaceC0184l) {
                this.f12588r = interfaceC0184l;
            }

            /* JADX INFO: renamed from: o */
            public final void m16901o(b bVar) {
                Object objMo27m = this.f12589s.mo27m(bVar.mo15356c());
                if (!C4295f2.this.m16888w()) {
                    this.f12587q.m16912J(objMo27m, (InterfaceC4303h0) this.f12588r.mo27m(bVar));
                } else {
                    this.f12587q.m16911I(this.f12589s.mo27m(bVar.mo15355a()), objMo27m, (InterfaceC4303h0) this.f12588r.mo27m(bVar));
                }
            }
        }

        public a(InterfaceC4365t2 interfaceC4365t2, String str) {
            this.f12583a = interfaceC4365t2;
            this.f12584b = str;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0564p5 m16892a(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
            C10137a c10137aM16893b = m16893b();
            if (c10137aM16893b == null) {
                C4295f2 c4295f2 = C4295f2.this;
                c10137aM16893b = new C10137a(c4295f2.new d(interfaceC0184l2.mo27m(c4295f2.m16877l()), AbstractC4332n.m17000i(this.f12583a, interfaceC0184l2.mo27m(C4295f2.this.m16877l())), this.f12583a, this.f12584b), interfaceC0184l, interfaceC0184l2);
                C4295f2 c4295f22 = C4295f2.this;
                m16894c(c10137aM16893b);
                c4295f22.m16872f(c10137aM16893b.m16896d());
            }
            C4295f2 c4295f23 = C4295f2.this;
            c10137aM16893b.m16899l(interfaceC0184l2);
            c10137aM16893b.m16900m(interfaceC0184l);
            c10137aM16893b.m16901o(c4295f23.m16882q());
            return c10137aM16893b;
        }

        /* JADX INFO: renamed from: b */
        public final C10137a m16893b() {
            return (C10137a) this.f12585c.getValue();
        }

        /* JADX INFO: renamed from: c */
        public final void m16894c(C10137a c10137a) {
            this.f12585c.setValue(c10137a);
        }

        /* JADX INFO: renamed from: d */
        public final void m16895d() {
            C10137a c10137aM16893b = m16893b();
            if (c10137aM16893b != null) {
                C4295f2 c4295f2 = C4295f2.this;
                c10137aM16893b.m16896d().m16911I(c10137aM16893b.m16897e().mo27m(c4295f2.m16882q().mo15355a()), c10137aM16893b.m16897e().mo27m(c4295f2.m16882q().mo15356c()), (InterfaceC4303h0) c10137aM16893b.m16898k().mo27m(c4295f2.m16882q()));
            }
        }
    }

    /* JADX INFO: renamed from: l.f2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        Object mo15355a();

        /* JADX INFO: renamed from: b */
        default boolean m16902b(Object obj, Object obj2) {
            return AbstractC1061t.m3842c(obj, mo15355a()) && AbstractC1061t.m3842c(obj2, mo15356c());
        }

        /* JADX INFO: renamed from: c */
        Object mo15356c();
    }

    /* JADX INFO: renamed from: l.f2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final Object f12591a;

        /* JADX INFO: renamed from: b */
        public final Object f12592b;

        public c(Object obj, Object obj2) {
            this.f12591a = obj;
            this.f12592b = obj2;
        }

        @Override // p163l.C4295f2.b
        /* JADX INFO: renamed from: a */
        public Object mo15355a() {
            return this.f12591a;
        }

        @Override // p163l.C4295f2.b
        /* JADX INFO: renamed from: c */
        public Object mo15356c() {
            return this.f12592b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(mo15355a(), bVar.mo15355a()) && AbstractC1061t.m3842c(mo15356c(), bVar.mo15356c());
        }

        public int hashCode() {
            Object objMo15355a = mo15355a();
            int iHashCode = (objMo15355a != null ? objMo15355a.hashCode() : 0) * 31;
            Object objMo15356c = mo15356c();
            return iHashCode + (objMo15356c != null ? objMo15356c.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: l.f2$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class d implements InterfaceC0564p5 {

        /* JADX INFO: renamed from: A */
        public final InterfaceC0512i2 f12593A;

        /* JADX INFO: renamed from: B */
        public AbstractC4357s f12594B;

        /* JADX INFO: renamed from: C */
        public final InterfaceC0505h2 f12595C;

        /* JADX INFO: renamed from: D */
        public boolean f12596D;

        /* JADX INFO: renamed from: E */
        public final InterfaceC4303h0 f12597E;

        /* JADX INFO: renamed from: q */
        public final InterfaceC4365t2 f12599q;

        /* JADX INFO: renamed from: r */
        public final String f12600r;

        /* JADX INFO: renamed from: s */
        public final InterfaceC0512i2 f12601s;

        /* JADX INFO: renamed from: t */
        public final C4324l1 f12602t;

        /* JADX INFO: renamed from: u */
        public final InterfaceC0512i2 f12603u;

        /* JADX INFO: renamed from: v */
        public final InterfaceC0512i2 f12604v;

        /* JADX INFO: renamed from: w */
        public C4268a2 f12605w;

        /* JADX INFO: renamed from: x */
        public final InterfaceC0512i2 f12606x;

        /* JADX INFO: renamed from: y */
        public final InterfaceC0491f2 f12607y;

        /* JADX INFO: renamed from: z */
        public boolean f12608z;

        public d(Object obj, AbstractC4357s abstractC4357s, InterfaceC4365t2 interfaceC4365t2, String str) {
            Object objMo27m;
            this.f12599q = interfaceC4365t2;
            this.f12600r = str;
            this.f12601s = AbstractC0522j5.m1773e(obj, null, 2, null);
            C4324l1 c4324l1M16974j = AbstractC4322l.m16974j(0.0f, 0.0f, null, 7, null);
            this.f12602t = c4324l1M16974j;
            this.f12603u = AbstractC0522j5.m1773e(c4324l1M16974j, null, 2, null);
            this.f12604v = AbstractC0522j5.m1773e(new C4268a2(m16914e(), interfaceC4365t2, obj, m16918o(), abstractC4357s), null, 2, null);
            this.f12606x = AbstractC0522j5.m1773e(Boolean.TRUE, null, 2, null);
            this.f12607y = AbstractC0471c3.m1561a(-1.0f);
            this.f12593A = AbstractC0522j5.m1773e(obj, null, 2, null);
            this.f12594B = abstractC4357s;
            this.f12595C = AbstractC0595t4.m2225a(m16913d().mo16772b());
            Float f10 = (Float) AbstractC4276b4.m16814h().get(interfaceC4365t2);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                AbstractC4357s abstractC4357s2 = (AbstractC4357s) interfaceC4365t2.mo17122a().mo27m(obj);
                int iMo17033b = abstractC4357s2.mo17033b();
                for (int i10 = 0; i10 < iMo17033b; i10++) {
                    abstractC4357s2.mo17036e(i10, fFloatValue);
                }
                objMo27m = this.f12599q.mo17123b().mo27m(abstractC4357s2);
            } else {
                objMo27m = null;
            }
            this.f12597E = AbstractC4322l.m16974j(0.0f, 0.0f, objMo27m, 3, null);
        }

        /* JADX INFO: renamed from: A */
        private final void m16903A(InterfaceC4303h0 interfaceC4303h0) {
            this.f12603u.setValue(interfaceC4303h0);
        }

        /* JADX INFO: renamed from: H */
        public static /* synthetic */ void m16904H(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.m16910G(obj, z10);
        }

        /* JADX INFO: renamed from: B */
        public final void m16905B(long j10) {
            this.f12595C.mo1693n(j10);
        }

        /* JADX INFO: renamed from: C */
        public final void m16906C(boolean z10) {
            this.f12606x.setValue(Boolean.valueOf(z10));
        }

        /* JADX INFO: renamed from: D */
        public final void m16907D(float f10) {
            this.f12607y.mo1664h(f10);
        }

        /* JADX INFO: renamed from: E */
        public final void m16908E(Object obj) {
            this.f12601s.setValue(obj);
        }

        /* JADX INFO: renamed from: F */
        public void m16909F(Object obj) {
            this.f12593A.setValue(obj);
        }

        /* JADX INFO: renamed from: G */
        public final void m16910G(Object obj, boolean z10) {
            C4268a2 c4268a2 = this.f12605w;
            if (AbstractC1061t.m3842c(c4268a2 != null ? c4268a2.mo16776g() : null, m16918o())) {
                m16923z(new C4268a2(this.f12597E, this.f12599q, obj, obj, AbstractC4362t.m17121g(this.f12594B)));
                this.f12608z = true;
                m16905B(m16913d().mo16772b());
                return;
            }
            InterfaceC4317k interfaceC4317kM16914e = (!z10 || this.f12596D || (m16914e() instanceof C4324l1)) ? m16914e() : this.f12597E;
            if (C4295f2.this.m16881p() > 0) {
                interfaceC4317kM16914e = AbstractC4322l.m16967c(interfaceC4317kM16914e, C4295f2.this.m16881p());
            }
            m16923z(new C4268a2(interfaceC4317kM16914e, this.f12599q, obj, m16918o(), this.f12594B));
            m16905B(m16913d().mo16772b());
            this.f12608z = false;
            C4295f2.this.m16889x();
        }

        /* JADX INFO: renamed from: I */
        public final void m16911I(Object obj, Object obj2, InterfaceC4303h0 interfaceC4303h0) {
            m16908E(obj2);
            m16903A(interfaceC4303h0);
            if (AbstractC1061t.m3842c(m16913d().m16778i(), obj) && AbstractC1061t.m3842c(m16913d().mo16776g(), obj2)) {
                return;
            }
            m16904H(this, obj, false, 2, null);
        }

        /* JADX INFO: renamed from: J */
        public final void m16912J(Object obj, InterfaceC4303h0 interfaceC4303h0) {
            if (this.f12608z) {
                C4268a2 c4268a2 = this.f12605w;
                if (AbstractC1061t.m3842c(obj, c4268a2 != null ? c4268a2.mo16776g() : null)) {
                    return;
                }
            }
            if (AbstractC1061t.m3842c(m16918o(), obj) && m16917m() == -1.0f) {
                return;
            }
            m16908E(obj);
            m16903A(interfaceC4303h0);
            m16910G(m16917m() == -3.0f ? obj : getValue(), !m16919v());
            m16906C(m16917m() == -3.0f);
            if (m16917m() >= 0.0f) {
                m16909F(m16913d().mo16775f((long) (m16913d().mo16772b() * m16917m())));
            } else if (m16917m() == -3.0f) {
                m16909F(obj);
            }
            this.f12608z = false;
            m16907D(-1.0f);
        }

        /* JADX INFO: renamed from: d */
        public final C4268a2 m16913d() {
            return (C4268a2) this.f12604v.getValue();
        }

        /* JADX INFO: renamed from: e */
        public final InterfaceC4303h0 m16914e() {
            return (InterfaceC4303h0) this.f12603u.getValue();
        }

        @Override // androidx.compose.runtime.InterfaceC0564p5
        public Object getValue() {
            return this.f12593A.getValue();
        }

        /* JADX INFO: renamed from: k */
        public final long m16915k() {
            return this.f12595C.mo1692a();
        }

        /* JADX INFO: renamed from: l */
        public final AbstractC4304h1.a m16916l() {
            return null;
        }

        /* JADX INFO: renamed from: m */
        public final float m16917m() {
            return this.f12607y.mo1663b();
        }

        /* JADX INFO: renamed from: o */
        public final Object m16918o() {
            return this.f12601s.getValue();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + m16918o() + ", spec: " + m16914e();
        }

        /* JADX INFO: renamed from: v */
        public final boolean m16919v() {
            return ((Boolean) this.f12606x.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: w */
        public final void m16920w(long j10, boolean z10) {
            if (z10) {
                j10 = m16913d().mo16772b();
            }
            m16909F(m16913d().mo16775f(j10));
            this.f12594B = m16913d().mo16774d(j10);
            if (m16913d().m16848e(j10)) {
                m16906C(true);
            }
        }

        /* JADX INFO: renamed from: x */
        public final void m16921x() {
            m16907D(-2.0f);
        }

        /* JADX INFO: renamed from: y */
        public final void m16922y(long j10) {
            if (m16917m() == -1.0f) {
                this.f12596D = true;
                if (AbstractC1061t.m3842c(m16913d().mo16776g(), m16913d().m16778i())) {
                    m16909F(m16913d().mo16776g());
                } else {
                    m16909F(m16913d().mo16775f(j10));
                    this.f12594B = m16913d().mo16774d(j10);
                }
            }
        }

        /* JADX INFO: renamed from: z */
        public final void m16923z(C4268a2 c4268a2) {
            this.f12604v.setValue(c4268a2);
        }
    }

    /* JADX INFO: renamed from: l.f2$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public float f12609q;

        /* JADX INFO: renamed from: r */
        public int f12610r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f12611s;

        public e(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        /* JADX INFO: renamed from: r */
        public static C4700i0 m16924r(C4295f2 c4295f2, float f10, long j10) {
            if (!c4295f2.m16888w()) {
                c4295f2.m16891z(j10, f10);
            }
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            e eVar = C4295f2.this.new e(interfaceC5976f);
            eVar.f12611s = obj;
            return eVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((e) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            final float fM17192v;
            InterfaceC2165o0 interfaceC2165o0;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f12610r;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o02 = (InterfaceC2165o0) this.f12611s;
                fM17192v = AbstractC4394z1.m17192v(interfaceC2165o02.getCoroutineContext());
                interfaceC2165o0 = interfaceC2165o02;
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fM17192v = this.f12609q;
                interfaceC2165o0 = (InterfaceC2165o0) this.f12611s;
                AbstractC4713t.m18808b(obj);
            }
            while (AbstractC2169p0.m7884g(interfaceC2165o0)) {
                final C4295f2 c4295f2 = C4295f2.this;
                InterfaceC0184l interfaceC0184l = new InterfaceC0184l() { // from class: l.g2
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return C4295f2.e.m16924r(c4295f2, fM17192v, ((Long) obj2).longValue());
                    }
                };
                this.f12611s = interfaceC2165o0;
                this.f12609q = fM17192v;
                this.f12610r = 1;
                if (AbstractC0456a2.m1515c(interfaceC0184l, this) == objM24992g) {
                    return objM24992g;
                }
            }
            return C4700i0.f13910a;
        }
    }

    public C4295f2(AbstractC4355r2 abstractC4355r2, C4295f2 c4295f2, String str) {
        this.f12570a = abstractC4355r2;
        this.f12571b = c4295f2;
        this.f12572c = str;
        this.f12573d = AbstractC0522j5.m1773e(m16877l(), null, 2, null);
        this.f12574e = AbstractC0522j5.m1773e(new c(m16877l(), m16877l()), null, 2, null);
        this.f12575f = AbstractC0595t4.m2225a(0L);
        this.f12576g = AbstractC0595t4.m2225a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f12577h = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f12578i = AbstractC0473c5.m1567f();
        this.f12579j = AbstractC0473c5.m1567f();
        this.f12580k = AbstractC0522j5.m1773e(bool, null, 2, null);
        this.f12582m = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: l.e2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return Long.valueOf(C4295f2.m16853c(this.f12569q));
            }
        });
        abstractC4355r2.mo16768f(this);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16851a(C4295f2 c4295f2) {
        return !AbstractC1061t.m3842c(c4295f2.m16884s(), c4295f2.m16877l()) || c4295f2.m16887v() || c4295f2.m16885t();
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m16852b(C4295f2 c4295f2, Object obj, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c4295f2.m16874h(obj, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static long m16853c(C4295f2 c4295f2) {
        return c4295f2.m16875j();
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0469c1 m16854d(InterfaceC2165o0 interfaceC2165o0, C4295f2 c4295f2, C0476d1 c0476d1) {
        AbstractC2148k.m7817d(interfaceC2165o0, null, EnumC2173q0.f6001t, c4295f2.new e(null), 1, null);
        return new f();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m16856i(InterfaceC0564p5 interfaceC0564p5) {
        return ((Boolean) interfaceC0564p5.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final void m16857A(long j10, boolean z10) {
        boolean z11 = true;
        if (m16883r() == Long.MIN_VALUE) {
            m16859C(j10);
        } else if (!this.f12570a.m17112c()) {
            this.f12570a.m17113e(true);
        }
        m16869M(false);
        SnapshotStateList snapshotStateList = this.f12578i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) snapshotStateList.get(i10);
            if (!dVar.m16919v()) {
                dVar.m16920w(j10, z10);
            }
            if (!dVar.m16919v()) {
                z11 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f12579j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4295f2 c4295f2 = (C4295f2) snapshotStateList2.get(i11);
            if (!AbstractC1061t.m3842c(c4295f2.m16884s(), c4295f2.m16877l())) {
                c4295f2.m16857A(j10, z10);
            }
            if (!AbstractC1061t.m3842c(c4295f2.m16884s(), c4295f2.m16877l())) {
                z11 = false;
            }
        }
        if (z11) {
            m16858B();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m16858B() {
        m16867K(Long.MIN_VALUE);
        AbstractC4355r2 abstractC4355r2 = this.f12570a;
        if (abstractC4355r2 instanceof C4267a1) {
            ((C4267a1) abstractC4355r2).mo16767d(m16884s());
        }
        m16864H(0L);
        this.f12570a.m17113e(false);
        SnapshotStateList snapshotStateList = this.f12579j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C4295f2) snapshotStateList.get(i10)).m16858B();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m16859C(long j10) {
        m16867K(j10);
        this.f12570a.m17113e(true);
    }

    /* JADX INFO: renamed from: D */
    public final void m16860D(a aVar) {
        d dVarM16896d;
        a.C10137a c10137aM16893b = aVar.m16893b();
        if (c10137aM16893b == null || (dVarM16896d = c10137aM16893b.m16896d()) == null) {
            return;
        }
        m16861E(dVarM16896d);
    }

    /* JADX INFO: renamed from: E */
    public final void m16861E(d dVar) {
        this.f12578i.remove(dVar);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m16862F(C4295f2 c4295f2) {
        return this.f12579j.remove(c4295f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public final void m16863G(Object obj, Object obj2, long j10) {
        m16867K(Long.MIN_VALUE);
        this.f12570a.m17113e(false);
        if (!m16888w() || !AbstractC1061t.m3842c(m16877l(), obj) || !AbstractC1061t.m3842c(m16884s(), obj2)) {
            if (!AbstractC1061t.m3842c(m16877l(), obj)) {
                AbstractC4355r2 abstractC4355r2 = this.f12570a;
                if (abstractC4355r2 instanceof C4267a1) {
                    ((C4267a1) abstractC4355r2).mo16767d(obj);
                }
            }
            m16868L(obj2);
            m16865I(true);
            m16866J(new c(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f12579j;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4295f2 c4295f2 = (C4295f2) snapshotStateList.get(i10);
            c4295f2.getClass();
            if (c4295f2.m16888w()) {
                c4295f2.m16863G(c4295f2.m16877l(), c4295f2.m16884s(), j10);
            }
        }
        SnapshotStateList snapshotStateList2 = this.f12578i;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d) snapshotStateList2.get(i11)).m16922y(j10);
        }
        this.f12581l = j10;
    }

    /* JADX INFO: renamed from: H */
    public final void m16864H(long j10) {
        if (this.f12571b == null) {
            m16870N(j10);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m16865I(boolean z10) {
        this.f12580k.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: J */
    public final void m16866J(b bVar) {
        this.f12574e.setValue(bVar);
    }

    /* JADX INFO: renamed from: K */
    public final void m16867K(long j10) {
        this.f12576g.mo1693n(j10);
    }

    /* JADX INFO: renamed from: L */
    public final void m16868L(Object obj) {
        this.f12573d.setValue(obj);
    }

    /* JADX INFO: renamed from: M */
    public final void m16869M(boolean z10) {
        this.f12577h.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: N */
    public final void m16870N(long j10) {
        this.f12575f.mo1693n(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final void m16871O(Object obj) {
        if (AbstractC1061t.m3842c(m16884s(), obj)) {
            return;
        }
        m16866J(new c(m16884s(), obj));
        if (!AbstractC1061t.m3842c(m16877l(), m16884s())) {
            this.f12570a.mo16767d(m16884s());
        }
        m16868L(obj);
        if (!m16887v()) {
            m16869M(true);
        }
        SnapshotStateList snapshotStateList = this.f12578i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) snapshotStateList.get(i10)).m16921x();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16872f(d dVar) {
        return this.f12578i.add(dVar);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m16873g(C4295f2 c4295f2) {
        return this.f12579j.add(c4295f2);
    }

    /* JADX INFO: renamed from: h */
    public final void m16874h(final Object obj, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC0572rMo2181q.mo2162U(obj) : interfaceC0572rMo2181q.mo2175k(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2162U(this) ? 32 : 16;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & 19) != 18, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1180)");
            }
            if (m16888w()) {
                interfaceC0572rMo2181q.mo2163V(467781377);
                interfaceC0572rMo2181q.mo2152K();
            } else {
                interfaceC0572rMo2181q.mo2163V(466120769);
                m16871O(obj);
                int i12 = i11 & Opcodes.IREM;
                boolean z10 = i12 == 32;
                Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
                if (z10 || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                    objMo2170f = AbstractC0473c5.m1565d(new InterfaceC0173a() { // from class: l.b2
                        @Override // p010a9.InterfaceC0173a
                        public final Object invoke() {
                            return Boolean.valueOf(C4295f2.m16851a(this.f12519q));
                        }
                    });
                    interfaceC0572rMo2181q.mo2153L(objMo2170f);
                }
                if (m16856i((InterfaceC0564p5) objMo2170f)) {
                    interfaceC0572rMo2181q.mo2163V(466528884);
                    Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
                    InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
                    if (objMo2170f2 == aVar.m2191a()) {
                        objMo2170f2 = AbstractC0497g1.m1685i(C5981k.f18917q, interfaceC0572rMo2181q);
                        interfaceC0572rMo2181q.mo2153L(objMo2170f2);
                    }
                    final InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) objMo2170f2;
                    boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(interfaceC2165o0) | (i12 == 32);
                    Object objMo2170f3 = interfaceC0572rMo2181q.mo2170f();
                    if (zMo2175k || objMo2170f3 == aVar.m2191a()) {
                        objMo2170f3 = new InterfaceC0184l() { // from class: l.c2
                            @Override // p010a9.InterfaceC0184l
                            /* JADX INFO: renamed from: m */
                            public final Object mo27m(Object obj2) {
                                return C4295f2.m16854d(interfaceC2165o0, this, (C0476d1) obj2);
                            }
                        };
                        interfaceC0572rMo2181q.mo2153L(objMo2170f3);
                    }
                    AbstractC0497g1.m1678b(interfaceC2165o0, this, (InterfaceC0184l) objMo2170f3, interfaceC0572rMo2181q, i12);
                    interfaceC0572rMo2181q.mo2152K();
                } else {
                    interfaceC0572rMo2181q.mo2163V(467771457);
                    interfaceC0572rMo2181q.mo2152K();
                }
                interfaceC0572rMo2181q.mo2152K();
            }
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: l.d2
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj2, Object obj3) {
                    return C4295f2.m16852b(this.f12534q, obj, i10, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final long m16875j() {
        SnapshotStateList snapshotStateList = this.f12578i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((d) snapshotStateList.get(i10)).m16915k());
        }
        SnapshotStateList snapshotStateList2 = this.f12579j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((C4295f2) snapshotStateList2.get(i11)).m16875j());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: k */
    public final List m16876k() {
        return this.f12578i;
    }

    /* JADX INFO: renamed from: l */
    public final Object m16877l() {
        return this.f12570a.mo16765a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final boolean m16878m() {
        SnapshotStateList snapshotStateList = this.f12578i;
        int size = snapshotStateList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) snapshotStateList.get(i10)).m16916l();
        }
        SnapshotStateList snapshotStateList2 = this.f12579j;
        int size2 = snapshotStateList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((C4295f2) snapshotStateList2.get(i11)).m16878m()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final String m16879n() {
        return this.f12572c;
    }

    /* JADX INFO: renamed from: o */
    public final long m16880o() {
        return this.f12581l;
    }

    /* JADX INFO: renamed from: p */
    public final long m16881p() {
        C4295f2 c4295f2 = this.f12571b;
        return c4295f2 != null ? c4295f2.m16881p() : m16886u();
    }

    /* JADX INFO: renamed from: q */
    public final b m16882q() {
        return (b) this.f12574e.getValue();
    }

    /* JADX INFO: renamed from: r */
    public final long m16883r() {
        return this.f12576g.mo1692a();
    }

    /* JADX INFO: renamed from: s */
    public final Object m16884s() {
        return this.f12573d.getValue();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16885t() {
        return ((Boolean) this.f12577h.getValue()).booleanValue();
    }

    public String toString() {
        List listM16876k = m16876k();
        int size = listM16876k.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((d) listM16876k.get(i10)) + ", ";
        }
        return str;
    }

    /* JADX INFO: renamed from: u */
    public final long m16886u() {
        return this.f12575f.mo1692a();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m16887v() {
        return m16883r() != Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m16888w() {
        return ((Boolean) this.f12580k.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m16889x() {
        m16869M(true);
        if (m16888w()) {
            SnapshotStateList snapshotStateList = this.f12578i;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) snapshotStateList.get(i10);
                jMax = Math.max(jMax, dVar.m16915k());
                dVar.m16922y(this.f12581l);
            }
            m16869M(false);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m16890y() {
        m16858B();
        this.f12570a.mo16769g();
    }

    /* JADX INFO: renamed from: z */
    public final void m16891z(long j10, float f10) {
        if (m16883r() == Long.MIN_VALUE) {
            m16859C(j10);
        }
        long jM16883r = j10 - m16883r();
        if (f10 != 0.0f) {
            jM16883r = AbstractC1927c.m6981e(jM16883r / ((double) f10));
        }
        m16864H(jM16883r);
        m16857A(jM16883r, f10 == 0.0f);
    }

    /* JADX INFO: renamed from: l.f2$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f implements InterfaceC0469c1 {
        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
        }
    }

    public C4295f2(AbstractC4355r2 abstractC4355r2, String str) {
        this(abstractC4355r2, null, str);
    }

    public C4295f2(Object obj, String str) {
        this(new C4267a1(obj), null, str);
    }
}
