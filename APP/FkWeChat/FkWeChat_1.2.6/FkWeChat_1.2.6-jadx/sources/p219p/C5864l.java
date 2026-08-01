package p219p;

import ec.AbstractC2140i;
import ec.InterfaceC2165o0;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.C1044k0;
import p121i3.InterfaceC3175e;
import p148k.AbstractC3889m0;
import p163l.AbstractC4332n;
import p163l.AbstractC4394z1;
import p163l.C4312j;
import p163l.C4327m;
import p163l.InterfaceC4266a0;
import p165l1.InterfaceC4509o;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p219p.C5864l;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6533b;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: p.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5864l implements InterfaceC5844e1 {

    /* JADX INFO: renamed from: a */
    public InterfaceC4266a0 f18439a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4509o f18440b;

    /* JADX INFO: renamed from: c */
    public int f18441c;

    /* JADX INFO: renamed from: p.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public Object f18442q;

        /* JADX INFO: renamed from: r */
        public Object f18443r;

        /* JADX INFO: renamed from: s */
        public int f18444s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ float f18445t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C5864l f18446u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC5836c1 f18447v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, C5864l c5864l, InterfaceC5836c1 interfaceC5836c1, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f18445t = f10;
            this.f18446u = c5864l;
            this.f18447v = interfaceC5836c1;
        }

        /* JADX INFO: renamed from: r */
        public static C4700i0 m23627r(C1044k0 c1044k0, InterfaceC5836c1 interfaceC5836c1, C1044k0 c1044k02, C5864l c5864l, C4312j c4312j) {
            float fFloatValue = ((Number) c4312j.m16943e()).floatValue() - c1044k0.f3203q;
            float fMo23523g = interfaceC5836c1.mo23523g(fFloatValue);
            c1044k0.f3203q = ((Number) c4312j.m16943e()).floatValue();
            c1044k02.f3203q = ((Number) c4312j.m16944f()).floatValue();
            if (Math.abs(fFloatValue - fMo23523g) > 0.5f) {
                c4312j.m16939a();
            }
            c5864l.m23625f(c5864l.m23624e() + 1);
            return C4700i0.f13910a;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            return new a(this.f18445t, this.f18446u, this.f18447v, interfaceC5976f);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            float f10;
            C4327m c4327m;
            C1044k0 c1044k0;
            InterfaceC4266a0 interfaceC4266a0;
            InterfaceC0184l interfaceC0184l;
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f18444s;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                if (Math.abs(this.f18445t) > 1.0f) {
                    final C1044k0 c1044k02 = new C1044k0();
                    c1044k02.f3203q = this.f18445t;
                    final C1044k0 c1044k03 = new C1044k0();
                    C4327m c4327mM16994c = AbstractC4332n.m16994c(0.0f, this.f18445t, 0L, 0L, false, 28, null);
                    try {
                        interfaceC4266a0 = this.f18446u.f18439a;
                        final InterfaceC5836c1 interfaceC5836c1 = this.f18447v;
                        final C5864l c5864l = this.f18446u;
                        interfaceC0184l = new InterfaceC0184l() { // from class: p.k
                            @Override // p010a9.InterfaceC0184l
                            /* JADX INFO: renamed from: m */
                            public final Object mo27m(Object obj2) {
                                return C5864l.a.m23627r(c1044k03, interfaceC5836c1, c1044k02, c5864l, (C4312j) obj2);
                            }
                        };
                        this.f18442q = c1044k02;
                        this.f18443r = c4327mM16994c;
                        this.f18444s = 1;
                        c4327m = c4327mM16994c;
                        try {
                        } catch (CancellationException unused) {
                            c1044k0 = c1044k02;
                            c1044k0.f3203q = ((Number) c4327m.m16984l()).floatValue();
                        }
                    } catch (CancellationException unused2) {
                        c4327m = c4327mM16994c;
                    }
                    if (AbstractC4394z1.m17186p(c4327m, interfaceC4266a0, false, interfaceC0184l, this, 2, null) == objM24992g) {
                        return objM24992g;
                    }
                    c1044k0 = c1044k02;
                    f10 = c1044k0.f3203q;
                } else {
                    f10 = this.f18445t;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c4327m = (C4327m) this.f18443r;
                c1044k0 = (C1044k0) this.f18442q;
                try {
                    AbstractC4713t.m18808b(obj);
                } catch (CancellationException unused3) {
                    c1044k0.f3203q = ((Number) c4327m.m16984l()).floatValue();
                }
                f10 = c1044k0.f3203q;
            }
            return AbstractC6533b.m25847c(f10);
        }
    }

    public /* synthetic */ C5864l(InterfaceC4266a0 interfaceC4266a0, InterfaceC4509o interfaceC4509o, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC4266a0, (i10 & 2) != 0 ? AbstractC5857i1.m23611f() : interfaceC4509o);
    }

    @Override // p219p.InterfaceC5859j0
    /* JADX INFO: renamed from: a */
    public Object mo23621a(InterfaceC5836c1 interfaceC5836c1, float f10, InterfaceC5976f interfaceC5976f) {
        this.f18441c = 0;
        return AbstractC2140i.m7762g(this.f18440b, new a(f10, this, interfaceC5836c1, null), interfaceC5976f);
    }

    /* JADX INFO: renamed from: e */
    public final int m23624e() {
        return this.f18441c;
    }

    /* JADX INFO: renamed from: f */
    public final void m23625f(int i10) {
        this.f18441c = i10;
    }

    /* JADX INFO: renamed from: g */
    public void m23626g(InterfaceC3175e interfaceC3175e) {
        this.f18439a = AbstractC3889m0.m15439c(interfaceC3175e);
    }

    public C5864l(InterfaceC4266a0 interfaceC4266a0, InterfaceC4509o interfaceC4509o) {
        this.f18439a = interfaceC4266a0;
        this.f18440b = interfaceC4509o;
    }
}
