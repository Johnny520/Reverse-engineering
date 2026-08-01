package p037cb;

import gb.AbstractC2650c1;
import gb.AbstractC2666g1;
import gb.AbstractC2706r0;
import gb.AbstractC2718v0;
import gb.C2651c2;
import gb.C2670h1;
import gb.C2678j1;
import gb.C2704q1;
import gb.C2715u0;
import gb.C2726y;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2701p1;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import la.AbstractC4722b;
import la.AbstractC4727g;
import lb.AbstractC4734d;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p067eb.C2060a;
import p067eb.C2095r0;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p143ja.C3785r;
import p143ja.C3787t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5127h;
import p186m9.AbstractC5128i;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5692c;
import p229p9.AbstractC6054y;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p243q9.InterfaceC6333h;
import p327wa.AbstractC9211e;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: cb.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1505w0 {

    /* JADX INFO: renamed from: a */
    public final C1490p f4451a;

    /* JADX INFO: renamed from: b */
    public final C1505w0 f4452b;

    /* JADX INFO: renamed from: c */
    public final String f4453c;

    /* JADX INFO: renamed from: d */
    public final String f4454d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f4455e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0184l f4456f;

    /* JADX INFO: renamed from: g */
    public final Map f4457g;

    public C1505w0(C1490p c1490p, C1505w0 c1505w0, List list, String str, String str2) {
        Map linkedHashMap;
        c1490p.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f4451a = c1490p;
        this.f4452b = c1505w0;
        this.f4453c = str;
        this.f4454d = str2;
        this.f4455e = c1490p.m5872h().mo8665h(new C1495r0(this));
        this.f4456f = c1490p.m5872h().mo8665h(new C1497s0(this));
        if (list.isEmpty()) {
            linkedHashMap = AbstractC5109u0.m20768i();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                C3787t c3787t = (C3787t) it.next();
                linkedHashMap.put(Integer.valueOf(c3787t.m14954M()), new C2095r0(this.f4451a, c3787t, i10));
                i10++;
            }
        }
        this.f4457g = linkedHashMap;
    }

    /* JADX INFO: renamed from: A */
    public static final int m5890A(C3785r c3785r) {
        c3785r.getClass();
        return c3785r.m14793U();
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC6004h m5896f(C1505w0 c1505w0, int i10) {
        return c1505w0.m5903g(i10);
    }

    /* JADX INFO: renamed from: p */
    public static final List m5897p(C3785r c3785r, C1505w0 c1505w0) {
        List listM14794V = c3785r.m14794V();
        listM14794V.getClass();
        C3785r c3785rM18883j = AbstractC4727g.m18883j(c3785r, c1505w0.f4451a.m5874j());
        List listM5897p = c3785rM18883j != null ? m5897p(c3785rM18883j, c1505w0) : null;
        if (listM5897p == null) {
            listM5897p = AbstractC5114x.m20800o();
        }
        return AbstractC5081g0.m20533E0(listM14794V, listM5897p);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ AbstractC2650c1 m5898q(C1505w0 c1505w0, C3785r c3785r, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return c1505w0.m5911o(c3785r, z10);
    }

    /* JADX INFO: renamed from: r */
    public static final List m5899r(C1505w0 c1505w0, C3785r c3785r) {
        return c1505w0.f4451a.m5867c().m5826d().mo5750l(c3785r, c1505w0.f4451a.m5871g());
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC6004h m5900v(C1505w0 c1505w0, int i10) {
        return c1505w0.m5905i(i10);
    }

    /* JADX INFO: renamed from: y */
    public static final InterfaceC5995e m5901y(C1505w0 c1505w0, C3785r c3785r, int i10) {
        C5691b c5691bM5818a = AbstractC1483l0.m5818a(c1505w0.f4451a.m5871g(), i10);
        List listM28909Q = AbstractC7294t.m28909Q(AbstractC7294t.m28901I(AbstractC7291q.m28888p(c3785r, new C1501u0(c1505w0)), C1503v0.f4449q));
        int iM28913w = AbstractC7294t.m28913w(AbstractC7291q.m28888p(c5691bM5818a, new C1038h0() { // from class: cb.w0.a
            @Override // p024b9.C1038h0, p098g9.InterfaceC2559m
            public Object get(Object obj) {
                return ((C5691b) obj).m22985e();
            }
        }));
        while (listM28909Q.size() < iM28913w) {
            listM28909Q.add(0);
        }
        return c1505w0.f4451a.m5867c().m5840r().m24025d(c5691bM5818a, listM28909Q);
    }

    /* JADX INFO: renamed from: z */
    public static final C3785r m5902z(C1505w0 c1505w0, C3785r c3785r) {
        c3785r.getClass();
        return AbstractC4727g.m18883j(c3785r, c1505w0.f4451a.m5874j());
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC6004h m5903g(int i10) {
        C5691b c5691bM5818a = AbstractC1483l0.m5818a(this.f4451a.m5871g(), i10);
        boolean zM22989i = c5691bM5818a.m22989i();
        C1490p c1490p = this.f4451a;
        return zM22989i ? c1490p.m5867c().m5824b(c5691bM5818a) : AbstractC6054y.m24113c(c1490p.m5867c().m5839q(), c5691bM5818a);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2650c1 m5904h(int i10) {
        if (AbstractC1483l0.m5818a(this.f4451a.m5871g(), i10).m22989i()) {
            return this.f4451a.m5867c().m5837o().mo5753a();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC6004h m5905i(int i10) {
        C5691b c5691bM5818a = AbstractC1483l0.m5818a(this.f4451a.m5871g(), i10);
        if (c5691bM5818a.m22989i()) {
            return null;
        }
        return AbstractC6054y.m24116f(this.f4451a.m5867c().m5839q(), c5691bM5818a);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC2650c1 m5906j(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        AbstractC5128i abstractC5128iM18919n = AbstractC4734d.m18919n(abstractC2706r0);
        InterfaceC6333h annotations = abstractC2706r0.getAnnotations();
        AbstractC2706r0 abstractC2706r0M20843k = AbstractC5127h.m20843k(abstractC2706r0);
        List listM20837e = AbstractC5127h.m20837e(abstractC2706r0);
        List listM20567e0 = AbstractC5081g0.m20567e0(AbstractC5127h.m20845m(abstractC2706r0), 1);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20567e0, 10));
        Iterator it = listM20567e0.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2643a2) it.next()).getType());
        }
        return AbstractC5127h.m20834b(abstractC5128iM18919n, annotations, abstractC2706r0M20843k, listM20837e, arrayList, null, abstractC2706r02, true).mo7032X0(abstractC2706r0.mo9258U0());
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC2650c1 m5907k(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10) {
        List list2;
        AbstractC2650c1 abstractC2650c1M5908l;
        int size;
        int size2 = interfaceC2716u1.mo5600d().size() - list.size();
        if (size2 != 0) {
            abstractC2650c1M5908l = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                InterfaceC2716u1 interfaceC2716u1Mo5591o = interfaceC2716u1.mo9341t().m20914Y(size).mo5591o();
                interfaceC2716u1Mo5591o.getClass();
                list2 = list;
                abstractC2650c1M5908l = C2715u0.m9631m(c2704q1, interfaceC2716u1Mo5591o, list2, z10, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            abstractC2650c1M5908l = m5908l(c2704q1, interfaceC2716u1, list2, z10);
        }
        return abstractC2650c1M5908l == null ? C3381l.f9328a.m12708f(EnumC3380k.f9296e0, list2, interfaceC2716u1, new String[0]) : abstractC2650c1M5908l;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2650c1 m5908l(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10) {
        AbstractC2650c1 abstractC2650c1M9631m = C2715u0.m9631m(c2704q1, interfaceC2716u1, list, z10, null, 16, null);
        if (AbstractC5127h.m20849q(abstractC2650c1M9631m)) {
            return m5913t(abstractC2650c1M9631m);
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final List m5909m() {
        return AbstractC5081g0.m20554X0(this.f4457g.values());
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC6018l1 m5910n(int i10) {
        InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) this.f4457g.get(Integer.valueOf(i10));
        if (interfaceC6018l1 != null) {
            return interfaceC6018l1;
        }
        C1505w0 c1505w0 = this.f4452b;
        if (c1505w0 != null) {
            return c1505w0.m5910n(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC2650c1 m5911o(C3785r c3785r, boolean z10) {
        AbstractC2650c1 abstractC2650c1M9659c;
        AbstractC2650c1 abstractC2650c1M9437j;
        c3785r.getClass();
        AbstractC2650c1 abstractC2650c1M5904h = c3785r.m14809l0() ? m5904h(c3785r.m14795W()) : c3785r.m14817t0() ? m5904h(c3785r.m14804g0()) : null;
        if (abstractC2650c1M5904h != null) {
            return abstractC2650c1M5904h;
        }
        InterfaceC2716u1 interfaceC2716u1M5916x = m5916x(c3785r);
        if (C3381l.m12704m(interfaceC2716u1M5916x.mo5602u())) {
            return C3381l.f9328a.m12706c(EnumC3380k.f9260J0, interfaceC2716u1M5916x, interfaceC2716u1M5916x.toString());
        }
        C2060a c2060a = new C2060a(this.f4451a.m5872h(), new C1499t0(this, c3785r));
        C2704q1 c2704q1M5912s = m5912s(this.f4451a.m5867c().m5844v(), c2060a, interfaceC2716u1M5916x, this.f4451a.m5869e());
        List listM5897p = m5897p(c3785r, this);
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM5897p, 10));
        int i10 = 0;
        for (Object obj : listM5897p) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            List listMo5600d = interfaceC2716u1M5916x.mo5600d();
            listMo5600d.getClass();
            arrayList.add(m5915w((InterfaceC6018l1) AbstractC5081g0.m20579m0(listMo5600d, i10), (C3785r.b) obj));
            i10 = i11;
        }
        List listM20554X0 = AbstractC5081g0.m20554X0(arrayList);
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1M5916x.mo5602u();
        if (z10 && (interfaceC6004hMo5602u instanceof InterfaceC6015k1)) {
            AbstractC2650c1 abstractC2650c1M9623c = C2715u0.m9623c((InterfaceC6015k1) interfaceC6004hMo5602u, listM20554X0);
            abstractC2650c1M9659c = abstractC2650c1M9623c.mo7032X0(AbstractC2718v0.m9644b(abstractC2650c1M9623c) || c3785r.m14801d0()).mo7034Z0(m5912s(this.f4451a.m5867c().m5844v(), InterfaceC6333h.f19873o.m25002a(AbstractC5081g0.m20531C0(c2060a, abstractC2650c1M9623c.getAnnotations())), interfaceC2716u1M5916x, this.f4451a.m5869e()));
        } else if (AbstractC4722b.f13973a.mo18852d(c3785r.m14797Z()).booleanValue()) {
            abstractC2650c1M9659c = m5907k(c2704q1M5912s, interfaceC2716u1M5916x, listM20554X0, c3785r.m14801d0());
        } else {
            AbstractC2650c1 abstractC2650c1M9631m = C2715u0.m9631m(c2704q1M5912s, interfaceC2716u1M5916x, listM20554X0, c3785r.m14801d0(), null, 16, null);
            if (AbstractC4722b.f13974b.mo18852d(c3785r.m14797Z()).booleanValue()) {
                abstractC2650c1M9659c = C2726y.a.m9659c(C2726y.f7125t, abstractC2650c1M9631m, true, false, 4, null);
                if (abstractC2650c1M9659c == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + abstractC2650c1M9631m + '\'').toString());
                }
            } else {
                abstractC2650c1M9659c = abstractC2650c1M9631m;
            }
        }
        C3785r c3785rM18874a = AbstractC4727g.m18874a(c3785r, this.f4451a.m5874j());
        return (c3785rM18874a == null || (abstractC2650c1M9437j = AbstractC2666g1.m9437j(abstractC2650c1M9659c, m5911o(c3785rM18874a, false))) == null) ? abstractC2650c1M9659c : abstractC2650c1M9437j;
    }

    /* JADX INFO: renamed from: s */
    public final C2704q1 m5912s(List list, InterfaceC6333h interfaceC6333h, InterfaceC2716u1 interfaceC2716u1, InterfaceC6019m interfaceC6019m) {
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC2701p1) it.next()).mo9559a(interfaceC6333h, interfaceC2716u1, interfaceC6019m));
        }
        return C2704q1.f7069r.m9584j(AbstractC5116y.m20813B(arrayList));
    }

    /* JADX INFO: renamed from: t */
    public final AbstractC2650c1 m5913t(AbstractC2706r0 abstractC2706r0) {
        AbstractC2706r0 type;
        InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) AbstractC5081g0.m20589w0(AbstractC5127h.m20845m(abstractC2706r0));
        if (interfaceC2643a2 == null || (type = interfaceC2643a2.getType()) == null) {
            return null;
        }
        InterfaceC6004h interfaceC6004hMo5602u = type.mo9332T0().mo5602u();
        C5692c c5692cM35860o = interfaceC6004hMo5602u != null ? AbstractC9211e.m35860o(interfaceC6004hMo5602u) : null;
        if (type.mo9330R0().size() != 1 || (!AbstractC1061t.m3842c(c5692cM35860o, C5135p.f15519v) && !AbstractC1061t.m3842c(c5692cM35860o, AbstractC1507x0.f4460a))) {
            return (AbstractC2650c1) abstractC2706r0;
        }
        AbstractC2706r0 type2 = ((InterfaceC2643a2) AbstractC5081g0.m20537I0(type.mo9330R0())).getType();
        type2.getClass();
        InterfaceC6019m interfaceC6019mM5869e = this.f4451a.m5869e();
        InterfaceC5983a interfaceC5983a = interfaceC6019mM5869e instanceof InterfaceC5983a ? (InterfaceC5983a) interfaceC6019mM5869e : null;
        return AbstractC1061t.m3842c(interfaceC5983a != null ? AbstractC9211e.m35856k(interfaceC5983a) : null, AbstractC1493q0.f4432a) ? m5906j(abstractC2706r0, type2) : m5906j(abstractC2706r0, type2);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f4453c);
        if (this.f4452b == null) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str = ". Child of " + this.f4452b.f4453c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC2706r0 m5914u(C3785r c3785r) {
        c3785r.getClass();
        if (!c3785r.m14811n0()) {
            return m5911o(c3785r, true);
        }
        String string = this.f4451a.m5871g().getString(c3785r.m14798a0());
        AbstractC2650c1 abstractC2650c1M5898q = m5898q(this, c3785r, false, 2, null);
        C3785r c3785rM18879f = AbstractC4727g.m18879f(c3785r, this.f4451a.m5874j());
        c3785rM18879f.getClass();
        return this.f4451a.m5867c().m5835m().mo5917a(c3785r, string, abstractC2650c1M5898q, m5898q(this, c3785rM18879f, false, 2, null));
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC2643a2 m5915w(InterfaceC6018l1 interfaceC6018l1, C3785r.b bVar) {
        if (bVar.m14836x() == C3785r.b.c.STAR) {
            return interfaceC6018l1 == null ? new C2670h1(this.f4451a.m5867c().m5839q().mo12669t()) : new C2678j1(interfaceC6018l1);
        }
        C1489o0 c1489o0 = C1489o0.f4410a;
        C3785r.b.c cVarM14836x = bVar.m14836x();
        cVarM14836x.getClass();
        EnumC2691m2 enumC2691m2M5863c = c1489o0.m5863c(cVarM14836x);
        C3785r c3785rM18889p = AbstractC4727g.m18889p(bVar, this.f4451a.m5874j());
        return c3785rM18889p == null ? new C2651c2(C3381l.m12703d(EnumC3380k.f9270O0, bVar.toString())) : new C2651c2(enumC2691m2M5863c, m5914u(c3785rM18889p));
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC2716u1 m5916x(C3785r c3785r) {
        InterfaceC6004h interfaceC6004hM5901y;
        Object next;
        if (c3785r.m14809l0()) {
            interfaceC6004hM5901y = (InterfaceC6004h) this.f4455e.mo27m(Integer.valueOf(c3785r.m14795W()));
            if (interfaceC6004hM5901y == null) {
                interfaceC6004hM5901y = m5901y(this, c3785r, c3785r.m14795W());
            }
        } else if (c3785r.m14818u0()) {
            interfaceC6004hM5901y = m5910n(c3785r.m14805h0());
            if (interfaceC6004hM5901y == null) {
                return C3381l.f9328a.m12707e(EnumC3380k.f9294c0, String.valueOf(c3785r.m14805h0()), this.f4454d);
            }
        } else if (c3785r.m14819v0()) {
            String string = this.f4451a.m5871g().getString(c3785r.m14806i0());
            Iterator it = m5909m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC1061t.m3842c(((InterfaceC6018l1) next).getName().m23030c(), string)) {
                    break;
                }
            }
            interfaceC6004hM5901y = (InterfaceC6018l1) next;
            if (interfaceC6004hM5901y == null) {
                return C3381l.f9328a.m12707e(EnumC3380k.f9295d0, string, this.f4451a.m5869e().toString());
            }
        } else {
            if (!c3785r.m14817t0()) {
                return C3381l.f9328a.m12707e(EnumC3380k.f9298g0, new String[0]);
            }
            interfaceC6004hM5901y = (InterfaceC6004h) this.f4456f.mo27m(Integer.valueOf(c3785r.m14804g0()));
            if (interfaceC6004hM5901y == null) {
                interfaceC6004hM5901y = m5901y(this, c3785r, c3785r.m14804g0());
            }
        }
        InterfaceC2716u1 interfaceC2716u1Mo5591o = interfaceC6004hM5901y.mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        return interfaceC2716u1Mo5591o;
    }
}
