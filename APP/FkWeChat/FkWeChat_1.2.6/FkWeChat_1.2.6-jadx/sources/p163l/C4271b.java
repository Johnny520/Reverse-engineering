package p163l;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0564p5;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1042j0;
import p080f9.AbstractC2368o;
import p163l.C4271b;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: l.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4271b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4365t2 f12490a;

    /* JADX INFO: renamed from: b */
    public final Object f12491b;

    /* JADX INFO: renamed from: c */
    public final String f12492c;

    /* JADX INFO: renamed from: d */
    public final C4327m f12493d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f12494e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0512i2 f12495f;

    /* JADX INFO: renamed from: g */
    public final C4289e1 f12496g;

    /* JADX INFO: renamed from: h */
    public final C4324l1 f12497h;

    /* JADX INFO: renamed from: i */
    public final AbstractC4357s f12498i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4357s f12499j;

    /* JADX INFO: renamed from: k */
    public AbstractC4357s f12500k;

    /* JADX INFO: renamed from: l */
    public AbstractC4357s f12501l;

    /* JADX INFO: renamed from: l.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public Object f12502q;

        /* JADX INFO: renamed from: r */
        public Object f12503r;

        /* JADX INFO: renamed from: s */
        public int f12504s;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Object f12506u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC4292f f12507v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ long f12508w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ InterfaceC0184l f12509x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, InterfaceC4292f interfaceC4292f, long j10, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f12506u = obj;
            this.f12507v = interfaceC4292f;
            this.f12508w = j10;
            this.f12509x = interfaceC0184l;
        }

        /* JADX INFO: renamed from: r */
        public static C4700i0 m16803r(C4271b c4271b, C4327m c4327m, InterfaceC0184l interfaceC0184l, C1042j0 c1042j0, C4312j c4312j) {
            AbstractC4394z1.m17193w(c4312j, c4271b.m16792j());
            Object objM16790h = c4271b.m16790h(c4312j.m16943e());
            if (!AbstractC1061t.m3842c(objM16790h, c4312j.m16943e())) {
                c4271b.m16792j().m16990y(objM16790h);
                c4327m.m16990y(objM16790h);
                if (interfaceC0184l != null) {
                    interfaceC0184l.mo27m(c4271b);
                }
                c4312j.m16939a();
                c1042j0.f3202q = true;
            } else if (interfaceC0184l != null) {
                interfaceC0184l.mo27m(c4271b);
            }
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C4271b.this.new a(this.f12506u, this.f12507v, this.f12508w, this.f12509x, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C4327m c4327m;
            C1042j0 c1042j0;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f12504s;
            try {
                if (i10 == 0) {
                    AbstractC4713t.m18808b(obj);
                    C4271b.this.m16792j().m16991z((AbstractC4357s) C4271b.this.m16794l().mo17122a().mo27m(this.f12506u));
                    C4271b.this.m16801s(this.f12507v.mo16776g());
                    C4271b.this.m16800r(true);
                    final C4327m c4327mM16999h = AbstractC4332n.m16999h(C4271b.this.m16792j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    final C1042j0 c1042j02 = new C1042j0();
                    InterfaceC4292f interfaceC4292f = this.f12507v;
                    long j10 = this.f12508w;
                    final C4271b c4271b = C4271b.this;
                    final InterfaceC0184l interfaceC0184l = this.f12509x;
                    InterfaceC0184l interfaceC0184l2 = new InterfaceC0184l() { // from class: l.a
                        @Override // p010a9.InterfaceC0184l
                        /* JADX INFO: renamed from: m */
                        public final Object mo27m(Object obj2) {
                            return C4271b.a.m16803r(c4271b, c4327mM16999h, interfaceC0184l, c1042j02, (C4312j) obj2);
                        }
                    };
                    this.f12502q = c4327mM16999h;
                    this.f12503r = c1042j02;
                    this.f12504s = 1;
                    if (AbstractC4394z1.m17181k(c4327mM16999h, interfaceC4292f, j10, interfaceC0184l2, this) == objM24992g) {
                        return objM24992g;
                    }
                    c4327m = c4327mM16999h;
                    c1042j0 = c1042j02;
                } else {
                    if (i10 != 1) {
                        C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1042j0 = (C1042j0) this.f12503r;
                    c4327m = (C4327m) this.f12502q;
                    AbstractC4713t.m18808b(obj);
                }
                EnumC4297g enumC4297g = c1042j0.f3202q ? EnumC4297g.f12613q : EnumC4297g.f12614r;
                C4271b.this.m16791i();
                return new C4307i(c4327m, enumC4297g);
            } catch (CancellationException e10) {
                C4271b.this.m16791i();
                throw e10;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: l.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public int f12510q;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ Object f12512s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, InterfaceC5976f interfaceC5976f) {
            super(1, interfaceC5976f);
            this.f12512s = obj;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
            return C4271b.this.new b(this.f12512s, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC6325c.m24992g();
            if (this.f12510q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C4271b.this.m16791i();
            Object objM16790h = C4271b.this.m16790h(this.f12512s);
            C4271b.this.m16792j().m16990y(objM16790h);
            C4271b.this.m16801s(objM16790h);
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo27m(InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public C4271b(Object obj, InterfaceC4365t2 interfaceC4365t2, Object obj2, String str) {
        this.f12490a = interfaceC4365t2;
        this.f12491b = obj2;
        this.f12492c = str;
        this.f12493d = new C4327m(interfaceC4365t2, obj, null, 0L, 0L, false, 60, null);
        this.f12494e = AbstractC0522j5.m1773e(Boolean.FALSE, null, 2, null);
        this.f12495f = AbstractC0522j5.m1773e(obj, null, 2, null);
        this.f12496g = new C4289e1();
        this.f12497h = new C4324l1(0.0f, 0.0f, obj2, 3, null);
        AbstractC4357s abstractC4357sM16797o = m16797o();
        AbstractC4357s abstractC4357s = abstractC4357sM16797o instanceof C4337o ? AbstractC4277c.f12526e : abstractC4357sM16797o instanceof C4342p ? AbstractC4277c.f12527f : abstractC4357sM16797o instanceof C4347q ? AbstractC4277c.f12528g : AbstractC4277c.f12529h;
        abstractC4357s.getClass();
        this.f12498i = abstractC4357s;
        AbstractC4357s abstractC4357sM16797o2 = m16797o();
        AbstractC4357s abstractC4357s2 = abstractC4357sM16797o2 instanceof C4337o ? AbstractC4277c.f12522a : abstractC4357sM16797o2 instanceof C4342p ? AbstractC4277c.f12523b : abstractC4357sM16797o2 instanceof C4347q ? AbstractC4277c.f12524c : AbstractC4277c.f12525d;
        abstractC4357s2.getClass();
        this.f12499j = abstractC4357s2;
        this.f12500k = abstractC4357s;
        this.f12501l = abstractC4357s2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m16787f(C4271b c4271b, Object obj, InterfaceC4317k interfaceC4317k, Object obj2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            interfaceC4317k = c4271b.f12497h;
        }
        InterfaceC4317k interfaceC4317k2 = interfaceC4317k;
        if ((i10 & 4) != 0) {
            obj2 = c4271b.m16796n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            interfaceC0184l = null;
        }
        return c4271b.m16788e(obj, interfaceC4317k2, obj4, interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: e */
    public final Object m16788e(Object obj, InterfaceC4317k interfaceC4317k, Object obj2, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return m16799q(AbstractC4302h.m16931a(interfaceC4317k, this.f12490a, m16795m(), obj, obj2), obj2, interfaceC0184l, interfaceC5976f);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0564p5 m16789g() {
        return this.f12493d;
    }

    /* JADX INFO: renamed from: h */
    public final Object m16790h(Object obj) {
        if (AbstractC1061t.m3842c(this.f12500k, this.f12498i) && AbstractC1061t.m3842c(this.f12501l, this.f12499j)) {
            return obj;
        }
        AbstractC4357s abstractC4357s = (AbstractC4357s) this.f12490a.mo17122a().mo27m(obj);
        int iMo17033b = abstractC4357s.mo17033b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iMo17033b; i10++) {
            if (abstractC4357s.mo17032a(i10) < this.f12500k.mo17032a(i10) || abstractC4357s.mo17032a(i10) > this.f12501l.mo17032a(i10)) {
                abstractC4357s.mo17036e(i10, AbstractC2368o.m8585l(abstractC4357s.mo17032a(i10), this.f12500k.mo17032a(i10), this.f12501l.mo17032a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.f12490a.mo17123b().mo27m(abstractC4357s) : obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m16791i() {
        C4327m c4327m = this.f12493d;
        c4327m.m16985m().mo17035d();
        c4327m.m16988w(Long.MIN_VALUE);
        m16800r(false);
    }

    /* JADX INFO: renamed from: j */
    public final C4327m m16792j() {
        return this.f12493d;
    }

    /* JADX INFO: renamed from: k */
    public final Object m16793k() {
        return this.f12495f.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC4365t2 m16794l() {
        return this.f12490a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m16795m() {
        return this.f12493d.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final Object m16796n() {
        return this.f12490a.mo17123b().mo27m(m16797o());
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC4357s m16797o() {
        return this.f12493d.m16985m();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16798p() {
        return ((Boolean) this.f12494e.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public final Object m16799q(InterfaceC4292f interfaceC4292f, Object obj, InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return C4289e1.m16843e(this.f12496g, null, new a(obj, interfaceC4292f, this.f12493d.m16982e(), interfaceC0184l, null), interfaceC5976f, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m16800r(boolean z10) {
        this.f12494e.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: s */
    public final void m16801s(Object obj) {
        this.f12495f.setValue(obj);
    }

    /* JADX INFO: renamed from: t */
    public final Object m16802t(Object obj, InterfaceC5976f interfaceC5976f) {
        Object objM16843e = C4289e1.m16843e(this.f12496g, null, new b(obj, null), interfaceC5976f, 1, null);
        return objM16843e == AbstractC6325c.m24992g() ? objM16843e : C4700i0.f13910a;
    }

    public /* synthetic */ C4271b(Object obj, InterfaceC4365t2 interfaceC4365t2, Object obj2, String str, int i10, AbstractC1043k abstractC1043k) {
        this(obj, interfaceC4365t2, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
