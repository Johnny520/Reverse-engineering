package lb;

import gb.AbstractC2650c1;
import gb.AbstractC2659e2;
import gb.AbstractC2673i0;
import gb.AbstractC2675i2;
import gb.AbstractC2683k2;
import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.AbstractC2707r1;
import gb.C2651c2;
import gb.C2678j1;
import gb.C2715u0;
import gb.C2726y;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p112hb.InterfaceC2947f;
import p129ib.C3378i;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p185m8.C5095n0;
import p186m9.AbstractC5128i;
import p215oc.C5729x;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6007i;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6018l1;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: lb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4734d {
    /* JADX INFO: renamed from: A */
    public static final AbstractC2706r0 m18900A(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC2706r0 abstractC2706r0M9466n = AbstractC2675i2.m9466n(abstractC2706r0);
        abstractC2706r0M9466n.getClass();
        return abstractC2706r0M9466n;
    }

    /* JADX INFO: renamed from: B */
    public static final AbstractC2706r0 m18901B(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC2706r0 abstractC2706r0M9467o = AbstractC2675i2.m9467o(abstractC2706r0);
        abstractC2706r0M9467o.getClass();
        return abstractC2706r0M9467o;
    }

    /* JADX INFO: renamed from: C */
    public static final AbstractC2706r0 m18902C(AbstractC2706r0 abstractC2706r0, InterfaceC6333h interfaceC6333h) {
        abstractC2706r0.getClass();
        interfaceC6333h.getClass();
        return (abstractC2706r0.getAnnotations().isEmpty() && interfaceC6333h.isEmpty()) ? abstractC2706r0 : abstractC2706r0.mo9510W0().mo7034Z0(AbstractC2707r1.m9588a(abstractC2706r0.mo9331S0(), interfaceC6333h));
    }

    /* JADX INFO: renamed from: D */
    public static final AbstractC2706r0 m18903D(AbstractC2706r0 abstractC2706r0) {
        AbstractC2687l2 abstractC2687l2M9371f;
        abstractC2706r0.getClass();
        AbstractC2687l2 abstractC2687l2Mo9510W0 = abstractC2706r0.mo9510W0();
        if (abstractC2687l2Mo9510W0 instanceof AbstractC2673i0) {
            AbstractC2673i0 abstractC2673i0 = (AbstractC2673i0) abstractC2687l2Mo9510W0;
            AbstractC2650c1 abstractC2650c1M9451b1 = abstractC2673i0.m9451b1();
            if (!abstractC2650c1M9451b1.mo9332T0().mo5600d().isEmpty() && abstractC2650c1M9451b1.mo9332T0().mo5602u() != null) {
                List listMo5600d = abstractC2650c1M9451b1.mo9332T0().mo5600d();
                listMo5600d.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5600d, 10));
                Iterator it = listMo5600d.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2678j1((InterfaceC6018l1) it.next()));
                }
                abstractC2650c1M9451b1 = AbstractC2659e2.m9371f(abstractC2650c1M9451b1, arrayList, null, 2, null);
            }
            AbstractC2650c1 abstractC2650c1M9452c1 = abstractC2673i0.m9452c1();
            if (!abstractC2650c1M9452c1.mo9332T0().mo5600d().isEmpty() && abstractC2650c1M9452c1.mo9332T0().mo5602u() != null) {
                List listMo5600d2 = abstractC2650c1M9452c1.mo9332T0().mo5600d();
                listMo5600d2.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(listMo5600d2, 10));
                Iterator it2 = listMo5600d2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C2678j1((InterfaceC6018l1) it2.next()));
                }
                abstractC2650c1M9452c1 = AbstractC2659e2.m9371f(abstractC2650c1M9452c1, arrayList2, null, 2, null);
            }
            abstractC2687l2M9371f = C2715u0.m9624e(abstractC2650c1M9451b1, abstractC2650c1M9452c1);
        } else {
            if (!(abstractC2687l2Mo9510W0 instanceof AbstractC2650c1)) {
                C5729x.m23182a();
                return null;
            }
            AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) abstractC2687l2Mo9510W0;
            boolean zIsEmpty = abstractC2650c1.mo9332T0().mo5600d().isEmpty();
            abstractC2687l2M9371f = abstractC2650c1;
            if (!zIsEmpty) {
                InterfaceC6004h interfaceC6004hMo5602u = abstractC2650c1.mo9332T0().mo5602u();
                abstractC2687l2M9371f = abstractC2650c1;
                if (interfaceC6004hMo5602u != null) {
                    List listMo5600d3 = abstractC2650c1.mo9332T0().mo5600d();
                    listMo5600d3.getClass();
                    ArrayList arrayList3 = new ArrayList(AbstractC5116y.m20814z(listMo5600d3, 10));
                    Iterator it3 = listMo5600d3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C2678j1((InterfaceC6018l1) it3.next()));
                    }
                    abstractC2687l2M9371f = AbstractC2659e2.m9371f(abstractC2650c1, arrayList3, null, 2, null);
                }
            }
        }
        return AbstractC2683k2.m9489b(abstractC2687l2M9371f, abstractC2687l2Mo9510W0);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m18904E(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return m18910e(abstractC2706r0, C4733c.f14016q);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m18905F(AbstractC2687l2 abstractC2687l2) {
        abstractC2687l2.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2687l2.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u != null) {
            return (interfaceC6004hMo5602u instanceof InterfaceC6015k1) || (interfaceC6004hMo5602u instanceof InterfaceC6018l1);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2643a2 m18909d(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return new C2651c2(abstractC2706r0);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m18910e(AbstractC2706r0 abstractC2706r0, InterfaceC0184l interfaceC0184l) {
        abstractC2706r0.getClass();
        interfaceC0184l.getClass();
        return AbstractC2675i2.m9455c(abstractC2706r0, interfaceC0184l);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m18911f(AbstractC2706r0 abstractC2706r0, InterfaceC2716u1 interfaceC2716u1, Set set) {
        boolean zM18911f;
        if (AbstractC1061t.m3842c(abstractC2706r0.mo9332T0(), interfaceC2716u1)) {
            return true;
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        InterfaceC6007i interfaceC6007i = interfaceC6004hMo5602u instanceof InterfaceC6007i ? (InterfaceC6007i) interfaceC6004hMo5602u : null;
        List listMo5594z = interfaceC6007i != null ? interfaceC6007i.mo5594z() : null;
        Iterable<C5095n0> iterableM20570f1 = AbstractC5081g0.m20570f1(abstractC2706r0.mo9330R0());
        if ((iterableM20570f1 instanceof Collection) && ((Collection) iterableM20570f1).isEmpty()) {
            return false;
        }
        for (C5095n0 c5095n0 : iterableM20570f1) {
            int iM20619a = c5095n0.m20619a();
            InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) c5095n0.m20620b();
            InterfaceC6018l1 interfaceC6018l1 = listMo5594z != null ? (InterfaceC6018l1) AbstractC5081g0.m20579m0(listMo5594z, iM20619a) : null;
            if ((interfaceC6018l1 == null || set == null || !set.contains(interfaceC6018l1)) && !interfaceC2643a2.mo9336c()) {
                AbstractC2706r0 type = interfaceC2643a2.getType();
                type.getClass();
                zM18911f = m18911f(type, interfaceC2716u1, set);
            } else {
                zM18911f = false;
            }
            if (zM18911f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m18912g(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return m18910e(abstractC2706r0, C4732b.f14015q);
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m18913h(AbstractC2687l2 abstractC2687l2) {
        abstractC2687l2.getClass();
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2687l2.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u != null) {
            return m18929x(interfaceC6004hMo5602u);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m18914i(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return AbstractC2675i2.m9455c(abstractC2706r0, C4731a.f14014q);
    }

    /* JADX INFO: renamed from: j */
    public static final Boolean m18915j(AbstractC2687l2 abstractC2687l2) {
        return Boolean.valueOf(AbstractC2675i2.m9465m(abstractC2687l2));
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC2643a2 m18916k(AbstractC2706r0 abstractC2706r0, EnumC2691m2 enumC2691m2, InterfaceC6018l1 interfaceC6018l1) {
        abstractC2706r0.getClass();
        enumC2691m2.getClass();
        if ((interfaceC6018l1 != null ? interfaceC6018l1.mo23995s() : null) == enumC2691m2) {
            enumC2691m2 = EnumC2691m2.f7042u;
        }
        return new C2651c2(enumC2691m2, abstractC2706r0);
    }

    /* JADX INFO: renamed from: l */
    public static final Set m18917l(AbstractC2706r0 abstractC2706r0, Set set) {
        abstractC2706r0.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m18918m(abstractC2706r0, abstractC2706r0, linkedHashSet, set);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: m */
    public static final void m18918m(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, Set set, Set set2) {
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
            if (!AbstractC1061t.m3842c(abstractC2706r0.mo9332T0(), abstractC2706r02.mo9332T0())) {
                set.add(interfaceC6004hMo5602u);
                return;
            }
            for (AbstractC2706r0 abstractC2706r03 : ((InterfaceC6018l1) interfaceC6004hMo5602u).getUpperBounds()) {
                abstractC2706r03.getClass();
                m18918m(abstractC2706r03, abstractC2706r02, set, set2);
            }
            return;
        }
        InterfaceC6004h interfaceC6004hMo5602u2 = abstractC2706r0.mo9332T0().mo5602u();
        InterfaceC6007i interfaceC6007i = interfaceC6004hMo5602u2 instanceof InterfaceC6007i ? (InterfaceC6007i) interfaceC6004hMo5602u2 : null;
        List listMo5594z = interfaceC6007i != null ? interfaceC6007i.mo5594z() : null;
        int i10 = 0;
        for (InterfaceC2643a2 interfaceC2643a2 : abstractC2706r0.mo9330R0()) {
            int i11 = i10 + 1;
            InterfaceC6018l1 interfaceC6018l1 = listMo5594z != null ? (InterfaceC6018l1) AbstractC5081g0.m20579m0(listMo5594z, i10) : null;
            if ((interfaceC6018l1 == null || set2 == null || !set2.contains(interfaceC6018l1)) && !interfaceC2643a2.mo9336c() && !AbstractC5081g0.m20559a0(set, interfaceC2643a2.getType().mo9332T0().mo5602u()) && !AbstractC1061t.m3842c(interfaceC2643a2.getType().mo9332T0(), abstractC2706r02.mo9332T0())) {
                AbstractC2706r0 type = interfaceC2643a2.getType();
                type.getClass();
                m18918m(type, abstractC2706r02, set, set2);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC5128i m18919n(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC5128i abstractC5128iMo9341t = abstractC2706r0.mo9332T0().mo9341t();
        abstractC5128iMo9341t.getClass();
        return abstractC5128iMo9341t;
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2706r0 m18920o(InterfaceC6018l1 interfaceC6018l1) {
        Object obj;
        interfaceC6018l1.getClass();
        List upperBounds = interfaceC6018l1.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC6018l1.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC6004h interfaceC6004hMo5602u = ((AbstractC2706r0) next).mo9332T0().mo5602u();
            InterfaceC5995e interfaceC5995e = interfaceC6004hMo5602u instanceof InterfaceC5995e ? (InterfaceC5995e) interfaceC6004hMo5602u : null;
            if (interfaceC5995e != null && interfaceC5995e.mo5588j() != EnumC5998f.f18949s && interfaceC5995e.mo5588j() != EnumC5998f.f18952v) {
                obj = next;
                break;
            }
        }
        AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) obj;
        if (abstractC2706r0 != null) {
            return abstractC2706r0;
        }
        List upperBounds3 = interfaceC6018l1.getUpperBounds();
        upperBounds3.getClass();
        Object objM20576j0 = AbstractC5081g0.m20576j0(upperBounds3);
        objM20576j0.getClass();
        return (AbstractC2706r0) objM20576j0;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m18921p(InterfaceC6018l1 interfaceC6018l1) {
        interfaceC6018l1.getClass();
        return m18923r(interfaceC6018l1, null, null, 6, null);
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m18922q(InterfaceC6018l1 interfaceC6018l1, InterfaceC2716u1 interfaceC2716u1, Set set) {
        interfaceC6018l1.getClass();
        List<AbstractC2706r0> upperBounds = interfaceC6018l1.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds != null && upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC2706r0 abstractC2706r0 : upperBounds) {
            abstractC2706r0.getClass();
            if (m18911f(abstractC2706r0, interfaceC6018l1.mo7508x().mo9332T0(), set) && (interfaceC2716u1 == null || AbstractC1061t.m3842c(abstractC2706r0.mo9332T0(), interfaceC2716u1))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m18923r(InterfaceC6018l1 interfaceC6018l1, InterfaceC2716u1 interfaceC2716u1, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC2716u1 = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return m18922q(interfaceC6018l1, interfaceC2716u1, set);
    }

    /* JADX INFO: renamed from: s */
    public static final boolean m18924s(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return AbstractC5128i.m20873g0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m18925t(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return AbstractC5128i.m20881o0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: u */
    public static final boolean m18926u(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        if (!(abstractC2706r0 instanceof C2726y)) {
            return false;
        }
        ((C2726y) abstractC2706r0).m9657f1();
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m18927v(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        if (!(abstractC2706r0 instanceof C2726y)) {
            return false;
        }
        ((C2726y) abstractC2706r0).m9657f1();
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m18928w(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        abstractC2706r0.getClass();
        abstractC2706r02.getClass();
        return InterfaceC2947f.f7782a.mo10840b(abstractC2706r0, abstractC2706r02);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m18929x(InterfaceC6004h interfaceC6004h) {
        interfaceC6004h.getClass();
        return (interfaceC6004h instanceof InterfaceC6018l1) && (((InterfaceC6018l1) interfaceC6004h).mo7443b() instanceof InterfaceC6015k1);
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m18930y(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return AbstractC2675i2.m9465m(abstractC2706r0);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m18931z(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return (abstractC2706r0 instanceof C3378i) && ((C3378i) abstractC2706r0).m12693d1().m12700g();
    }
}
