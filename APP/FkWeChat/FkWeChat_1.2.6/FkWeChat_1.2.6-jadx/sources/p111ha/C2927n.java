package p111ha;

import java.util.Collection;
import java.util.Set;
import la.C4723c;
import na.C5530e;
import na.C5533h;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p037cb.C1476i;
import p037cb.C1486n;
import p037cb.C1508y;
import p067eb.C2085m0;
import p067eb.EnumC2094r;
import p128ia.C3368a;
import p143ja.C3770c;
import p143ja.C3780m;
import p172l8.C4711r;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6023n0;
import qa.C6355l;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: ha.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2927n {

    /* JADX INFO: renamed from: b */
    public static final a f7735b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final Set f7736c = AbstractC5065a1.m20479d(C3368a.a.f9170u);

    /* JADX INFO: renamed from: d */
    public static final Set f7737d = AbstractC5068b1.m20487i(C3368a.a.f9171v, C3368a.a.f9174y);

    /* JADX INFO: renamed from: e */
    public static final C4723c f7738e = new C4723c(1, 1, 2);

    /* JADX INFO: renamed from: f */
    public static final C4723c f7739f = new C4723c(1, 1, 11);

    /* JADX INFO: renamed from: g */
    public static final C4723c f7740g = new C4723c(1, 1, 13);

    /* JADX INFO: renamed from: a */
    public C1486n f7741a;

    /* JADX INFO: renamed from: d */
    public static final Collection m10674d() {
        return AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC9913k m10675c(InterfaceC6023n0 interfaceC6023n0, InterfaceC2937x interfaceC2937x) {
        C4711r c4711rM22549m;
        interfaceC6023n0.getClass();
        interfaceC2937x.getClass();
        String[] strArrM10684m = m10684m(interfaceC2937x, f7737d);
        if (strArrM10684m == null) {
            return null;
        }
        String[] strArrM12596g = interfaceC2937x.mo10733b().m12596g();
        try {
            if (strArrM12596g == null) {
                return null;
            }
            try {
                c4711rM22549m = C5533h.m22549m(strArrM10684m, strArrM12596g);
            } catch (C6355l e10) {
                throw new IllegalStateException("Could not read data from " + interfaceC2937x.mo10732a(), e10);
            }
        } catch (Throwable th) {
            if (m10680i() || interfaceC2937x.mo10733b().m12593d().m18863h(m10679h())) {
                throw th;
            }
            c4711rM22549m = null;
        }
        if (c4711rM22549m == null) {
            return null;
        }
        C5530e c5530e = (C5530e) c4711rM22549m.m18792a();
        C3780m c3780m = (C3780m) c4711rM22549m.m18793b();
        C2931r c2931r = new C2931r(interfaceC2937x, c3780m, c5530e, m10678g(interfaceC2937x), m10682k(interfaceC2937x), m10676e(interfaceC2937x));
        return new C2085m0(interfaceC6023n0, c3780m, c5530e, interfaceC2937x.mo10733b().m12593d(), c2931r, m10677f(), "scope for " + c2931r + " in " + interfaceC6023n0, C2926m.f7734q);
    }

    /* JADX INFO: renamed from: e */
    public final EnumC2094r m10676e(InterfaceC2937x interfaceC2937x) {
        return m10677f().m5829g().mo5855b() ? EnumC2094r.f5860q : interfaceC2937x.mo10733b().m12599j() ? EnumC2094r.f5861r : EnumC2094r.f5860q;
    }

    /* JADX INFO: renamed from: f */
    public final C1486n m10677f() {
        C1486n c1486n = this.f7741a;
        if (c1486n != null) {
            return c1486n;
        }
        AbstractC1061t.m3851l("components");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C1508y m10678g(InterfaceC2937x interfaceC2937x) {
        if (m10680i() || interfaceC2937x.mo10733b().m12593d().m18863h(m10679h())) {
            return null;
        }
        return new C1508y(interfaceC2937x.mo10733b().m12593d(), C4723c.f14003i, m10679h(), m10679h().m18866k(interfaceC2937x.mo10733b().m12593d().m18865j()), interfaceC2937x.mo10732a(), interfaceC2937x.mo10736h());
    }

    /* JADX INFO: renamed from: h */
    public final C4723c m10679h() {
        return m10677f().m5829g().mo5860g();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m10680i() {
        return m10677f().m5829g().mo5857d();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10681j(InterfaceC2937x interfaceC2937x) {
        return !m10677f().m5829g().mo5856c() && interfaceC2937x.mo10733b().m12598i() && AbstractC1061t.m3842c(interfaceC2937x.mo10733b().m12593d(), f7739f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m10682k(InterfaceC2937x interfaceC2937x) {
        return (m10677f().m5829g().mo5858e() && (interfaceC2937x.mo10733b().m12598i() || AbstractC1061t.m3842c(interfaceC2937x.mo10733b().m12593d(), f7738e))) || m10681j(interfaceC2937x);
    }

    /* JADX INFO: renamed from: l */
    public final C1476i m10683l(InterfaceC2937x interfaceC2937x) {
        String[] strArrM12596g;
        C4711r c4711rM22546i;
        interfaceC2937x.getClass();
        String[] strArrM10684m = m10684m(interfaceC2937x, f7736c);
        if (strArrM10684m == null || (strArrM12596g = interfaceC2937x.mo10733b().m12596g()) == null) {
            return null;
        }
        try {
            try {
                c4711rM22546i = C5533h.m22546i(strArrM10684m, strArrM12596g);
            } catch (C6355l e10) {
                throw new IllegalStateException("Could not read data from " + interfaceC2937x.mo10732a(), e10);
            }
        } catch (Throwable th) {
            if (m10680i() || interfaceC2937x.mo10733b().m12593d().m18863h(m10679h())) {
                throw th;
            }
            c4711rM22546i = null;
        }
        if (c4711rM22546i == null) {
            return null;
        }
        return new C1476i((C5530e) c4711rM22546i.m18792a(), (C3770c) c4711rM22546i.m18793b(), interfaceC2937x.mo10733b().m12593d(), new C2939z(interfaceC2937x, m10678g(interfaceC2937x), m10682k(interfaceC2937x), m10676e(interfaceC2937x)));
    }

    /* JADX INFO: renamed from: m */
    public final String[] m10684m(InterfaceC2937x interfaceC2937x, Set set) {
        C3368a c3368aMo10733b = interfaceC2937x.mo10733b();
        String[] strArrM12590a = c3368aMo10733b.m12590a();
        if (strArrM12590a == null) {
            strArrM12590a = c3368aMo10733b.m12591b();
        }
        if (strArrM12590a == null || !set.contains(c3368aMo10733b.m12592c())) {
            return null;
        }
        return strArrM12590a;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC5995e m10685n(InterfaceC2937x interfaceC2937x) {
        interfaceC2937x.getClass();
        C1476i c1476iM10683l = m10683l(interfaceC2937x);
        if (c1476iM10683l == null) {
            return null;
        }
        return m10677f().m5828f().m5814e(interfaceC2937x.mo10736h(), c1476iM10683l);
    }

    /* JADX INFO: renamed from: o */
    public final void m10686o(C1486n c1486n) {
        c1486n.getClass();
        this.f7741a = c1486n;
    }

    /* JADX INFO: renamed from: p */
    public final void m10687p(C2924k c2924k) {
        c2924k.getClass();
        m10686o(c2924k.m10664a());
    }

    /* JADX INFO: renamed from: ha.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4723c m10688a() {
            return C2927n.f7740g;
        }

        public a() {
        }
    }
}
