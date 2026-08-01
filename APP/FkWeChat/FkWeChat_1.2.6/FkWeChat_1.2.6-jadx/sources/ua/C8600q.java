package ua;

import gb.AbstractC2650c1;
import gb.AbstractC2659e2;
import gb.AbstractC2706r0;
import gb.C2651c2;
import gb.C2704q1;
import gb.C2715u0;
import gb.EnumC2691m2;
import gb.InterfaceC2716u1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1043k;
import p112hb.AbstractC2949h;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p215oc.C5725t;
import p215oc.C5729x;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: ua.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8600q implements InterfaceC2716u1 {

    /* JADX INFO: renamed from: f */
    public static final a f28635f = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f28636a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6005h0 f28637b;

    /* JADX INFO: renamed from: c */
    public final Set f28638c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2650c1 f28639d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4705l f28640e;

    public C8600q(long j10, InterfaceC6005h0 interfaceC6005h0, Set set) {
        this.f28639d = C2715u0.m9625f(C2704q1.f7069r.m9585k(), this, false);
        this.f28640e = AbstractC4706m.m18787a(new C8598o(this));
        this.f28636a = j10;
        this.f28637b = interfaceC6005h0;
        this.f28638c = set;
    }

    /* JADX INFO: renamed from: i */
    private final List m33027i() {
        return (List) this.f28640e.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final List m33028k(C8600q c8600q) {
        AbstractC2650c1 abstractC2650c1Mo7508x = c8600q.mo9341t().m20936y().mo7508x();
        abstractC2650c1Mo7508x.getClass();
        List listM20806u = AbstractC5114x.m20806u(AbstractC2659e2.m9371f(abstractC2650c1Mo7508x, AbstractC5112w.m20789e(new C2651c2(EnumC2691m2.f7043v, c8600q.f28639d)), null, 2, null));
        if (!c8600q.m33031j()) {
            listM20806u.add(c8600q.mo9341t().m20905M());
        }
        return listM20806u;
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m33029m(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return abstractC2706r0.toString();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: a */
    public InterfaceC2716u1 mo9545a(AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        return this;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: d */
    public List mo5600d() {
        return AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: h */
    public final Set m33030h() {
        return this.f28638c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m33031j() {
        Collection collectionM33047a = AbstractC8605v.m33047a(this.f28637b);
        if ((collectionM33047a instanceof Collection) && collectionM33047a.isEmpty()) {
            return true;
        }
        Iterator it = collectionM33047a.iterator();
        while (it.hasNext()) {
            if (this.f28638c.contains((AbstractC2706r0) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final String m33032l() {
        return "[" + AbstractC5081g0.m20585s0(this.f28638c, ",", null, null, 0, null, C8599p.f28634q, 30, null) + ']';
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: n */
    public Collection mo9546n() {
        return m33027i();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo9341t() {
        return this.f28637b.mo12669t();
    }

    public String toString() {
        return "IntegerLiteralType" + m33032l();
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: u */
    public InterfaceC6004h mo5602u() {
        return null;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: v */
    public boolean mo5603v() {
        return false;
    }

    /* JADX INFO: renamed from: ua.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: ua.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class EnumC10244a {

            /* JADX INFO: renamed from: q */
            public static final EnumC10244a f28641q = new EnumC10244a("COMMON_SUPER_TYPE", 0);

            /* JADX INFO: renamed from: r */
            public static final EnumC10244a f28642r = new EnumC10244a("INTERSECTION_TYPE", 1);

            /* JADX INFO: renamed from: s */
            public static final /* synthetic */ EnumC10244a[] f28643s;

            /* JADX INFO: renamed from: t */
            public static final /* synthetic */ InterfaceC7197a f28644t;

            static {
                EnumC10244a[] enumC10244aArrM33038a = m33038a();
                f28643s = enumC10244aArrM33038a;
                f28644t = AbstractC7198b.m28437a(enumC10244aArrM33038a);
            }

            public EnumC10244a(String str, int i10) {
            }

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ EnumC10244a[] m33038a() {
                return new EnumC10244a[]{f28641q, f28642r};
            }

            public static EnumC10244a valueOf(String str) {
                return (EnumC10244a) Enum.valueOf(EnumC10244a.class, str);
            }

            public static EnumC10244a[] values() {
                return (EnumC10244a[]) f28643s.clone();
            }
        }

        /* JADX INFO: renamed from: ua.q$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f28645a;

            static {
                int[] iArr = new int[EnumC10244a.values().length];
                try {
                    iArr[EnumC10244a.f28641q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC10244a.f28642r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f28645a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2650c1 m33033a(Collection collection, EnumC10244a enumC10244a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                C5725t.m23179a("Empty collection can't be reduced.");
                return null;
            }
            Object next = it.next();
            while (it.hasNext()) {
                AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) it.next();
                next = C8600q.f28635f.m33035c((AbstractC2650c1) next, abstractC2650c1, enumC10244a);
            }
            return (AbstractC2650c1) next;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC2650c1 m33034b(Collection collection) {
            collection.getClass();
            return m33033a(collection, EnumC10244a.f28642r);
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC2650c1 m33035c(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12, EnumC10244a enumC10244a) {
            if (abstractC2650c1 != null && abstractC2650c12 != null) {
                InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2650c1.mo9332T0();
                InterfaceC2716u1 interfaceC2716u1Mo9332T02 = abstractC2650c12.mo9332T0();
                boolean z10 = interfaceC2716u1Mo9332T0 instanceof C8600q;
                if (z10 && (interfaceC2716u1Mo9332T02 instanceof C8600q)) {
                    return m33037e((C8600q) interfaceC2716u1Mo9332T0, (C8600q) interfaceC2716u1Mo9332T02, enumC10244a);
                }
                if (z10) {
                    return m33036d((C8600q) interfaceC2716u1Mo9332T0, abstractC2650c12);
                }
                if (interfaceC2716u1Mo9332T02 instanceof C8600q) {
                    return m33036d((C8600q) interfaceC2716u1Mo9332T02, abstractC2650c1);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final AbstractC2650c1 m33036d(C8600q c8600q, AbstractC2650c1 abstractC2650c1) {
            if (c8600q.m33030h().contains(abstractC2650c1)) {
                return abstractC2650c1;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC2650c1 m33037e(C8600q c8600q, C8600q c8600q2, EnumC10244a enumC10244a) {
            Set setM20581o0;
            int i10 = b.f28645a[enumC10244a.ordinal()];
            if (i10 == 1) {
                setM20581o0 = AbstractC5081g0.m20581o0(c8600q.m33030h(), c8600q2.m33030h());
            } else {
                if (i10 != 2) {
                    C5729x.m23182a();
                    return null;
                }
                setM20581o0 = AbstractC5081g0.m20566d1(c8600q.m33030h(), c8600q2.m33030h());
            }
            return C2715u0.m9625f(C2704q1.f7069r.m9585k(), new C8600q(c8600q.f28636a, c8600q.f28637b, setM20581o0, null), false);
        }

        public a() {
        }
    }

    public /* synthetic */ C8600q(long j10, InterfaceC6005h0 interfaceC6005h0, Set set, AbstractC1043k abstractC1043k) {
        this(j10, interfaceC6005h0, set);
    }
}
