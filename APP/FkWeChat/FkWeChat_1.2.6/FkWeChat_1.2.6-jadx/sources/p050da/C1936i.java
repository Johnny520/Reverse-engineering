package p050da;

import gb.AbstractC2650c1;
import gb.AbstractC2655d2;
import gb.AbstractC2661f0;
import gb.AbstractC2685l0;
import gb.AbstractC2706r0;
import gb.AbstractC2718v0;
import gb.C2651c2;
import gb.C2704q1;
import gb.C2715u0;
import gb.C2731z1;
import gb.EnumC2671h2;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p112hb.AbstractC2949h;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p213oa.C5691b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6018l1;
import p314vb.C8897d;
import p327wa.AbstractC9211e;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: da.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1936i extends AbstractC2655d2 {

    /* JADX INFO: renamed from: e */
    public static final a f5410e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C1928a f5411f;

    /* JADX INFO: renamed from: g */
    public static final C1928a f5412g;

    /* JADX INFO: renamed from: c */
    public final C1934g f5413c;

    /* JADX INFO: renamed from: d */
    public final C2731z1 f5414d;

    static {
        EnumC2671h2 enumC2671h2 = EnumC2671h2.f7006r;
        f5411f = AbstractC1929b.m6997b(enumC2671h2, false, true, null, 5, null).m6994l(EnumC1930c.f5392s);
        f5412g = AbstractC1929b.m6997b(enumC2671h2, false, true, null, 5, null).m6994l(EnumC1930c.f5391r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1936i(C2731z1 c2731z1) {
        C1934g c1934g = new C1934g();
        this.f5413c = c1934g;
        if (c2731z1 == null) {
            c2731z1 = new C2731z1(c1934g, null, 2, 0 == true ? 1 : 0);
        }
        this.f5414d = c2731z1;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC2650c1 m7019k(InterfaceC5995e interfaceC5995e, C1936i c1936i, AbstractC2650c1 abstractC2650c1, C1928a c1928a, AbstractC2949h abstractC2949h) {
        InterfaceC5995e interfaceC5995eMo10846b;
        abstractC2949h.getClass();
        C5691b c5691bM35859n = AbstractC9211e.m35859n(interfaceC5995e);
        if (c5691bM35859n == null || (interfaceC5995eMo10846b = abstractC2949h.mo10846b(c5691bM35859n)) == null || AbstractC1061t.m3842c(interfaceC5995eMo10846b, interfaceC5995e)) {
            return null;
        }
        return (AbstractC2650c1) c1936i.m7023j(abstractC2650c1, interfaceC5995eMo10846b, c1928a).m18795e();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AbstractC2706r0 m7020m(C1936i c1936i, AbstractC2706r0 abstractC2706r0, C1928a c1928a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c1928a = new C1928a(EnumC2671h2.f7006r, null, false, false, null, null, 62, null);
        }
        return c1936i.m7024l(abstractC2706r0, c1928a);
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: f */
    public boolean mo7022f() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final C4711r m7023j(AbstractC2650c1 abstractC2650c1, InterfaceC5995e interfaceC5995e, C1928a c1928a) {
        if (abstractC2650c1.mo9332T0().mo5600d().isEmpty()) {
            return AbstractC4717x.m18815a(abstractC2650c1, Boolean.FALSE);
        }
        if (AbstractC5128i.m20869d0(abstractC2650c1)) {
            InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) abstractC2650c1.mo9330R0().get(0);
            EnumC2691m2 enumC2691m2Mo9335b = interfaceC2643a2.mo9335b();
            AbstractC2706r0 type = interfaceC2643a2.getType();
            type.getClass();
            return AbstractC4717x.m18815a(C2715u0.m9631m(abstractC2650c1.mo9331S0(), abstractC2650c1.mo9332T0(), AbstractC5112w.m20789e(new C2651c2(enumC2691m2Mo9335b, m7024l(type, c1928a))), abstractC2650c1.mo9258U0(), null, 16, null), Boolean.FALSE);
        }
        if (AbstractC2718v0.m9643a(abstractC2650c1)) {
            return AbstractC4717x.m18815a(C3381l.m12703d(EnumC3380k.f9291Z, abstractC2650c1.mo9332T0().toString()), Boolean.FALSE);
        }
        InterfaceC9913k interfaceC9913kMo23998O0 = interfaceC5995e.mo23998O0(this);
        interfaceC9913kMo23998O0.getClass();
        C2704q1 c2704q1Mo9331S0 = abstractC2650c1.mo9331S0();
        InterfaceC2716u1 interfaceC2716u1Mo5591o = interfaceC5995e.mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        List<InterfaceC6018l1> listMo5600d = interfaceC5995e.mo5591o().mo5600d();
        listMo5600d.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listMo5600d, 10));
        for (InterfaceC6018l1 interfaceC6018l1 : listMo5600d) {
            C1934g c1934g = this.f5413c;
            interfaceC6018l1.getClass();
            arrayList.add(AbstractC2661f0.m9372b(c1934g, interfaceC6018l1, c1928a, this.f5414d, null, 8, null));
        }
        return AbstractC4717x.m18815a(C2715u0.m9634p(c2704q1Mo9331S0, interfaceC2716u1Mo5591o, arrayList, abstractC2650c1.mo9258U0(), interfaceC9913kMo23998O0, new C1935h(interfaceC5995e, this, abstractC2650c1, c1928a)), Boolean.TRUE);
    }

    /* JADX INFO: renamed from: l */
    public final AbstractC2706r0 m7024l(AbstractC2706r0 abstractC2706r0, C1928a c1928a) {
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
            return m7024l(this.f5414d.m9669e((InterfaceC6018l1) interfaceC6004hMo5602u, c1928a.m6992j(true)), c1928a);
        }
        if (!(interfaceC6004hMo5602u instanceof InterfaceC5995e)) {
            C8897d.m34134a("Unexpected declaration kind: ", interfaceC6004hMo5602u);
            return null;
        }
        InterfaceC6004h interfaceC6004hMo5602u2 = AbstractC2685l0.m9495d(abstractC2706r0).mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u2 instanceof InterfaceC5995e) {
            C4711r c4711rM7023j = m7023j(AbstractC2685l0.m9494c(abstractC2706r0), (InterfaceC5995e) interfaceC6004hMo5602u, f5411f);
            AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) c4711rM7023j.m18792a();
            boolean zBooleanValue = ((Boolean) c4711rM7023j.m18793b()).booleanValue();
            C4711r c4711rM7023j2 = m7023j(AbstractC2685l0.m9495d(abstractC2706r0), (InterfaceC5995e) interfaceC6004hMo5602u2, f5412g);
            AbstractC2650c1 abstractC2650c12 = (AbstractC2650c1) c4711rM7023j2.m18792a();
            return (zBooleanValue || ((Boolean) c4711rM7023j2.m18793b()).booleanValue()) ? new C1938k(abstractC2650c1, abstractC2650c12) : C2715u0.m9624e(abstractC2650c1, abstractC2650c12);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC6004hMo5602u2 + "\" while for lower it's \"" + interfaceC6004hMo5602u + '\"').toString());
    }

    @Override // gb.AbstractC2655d2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C2651c2 mo7021e(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        return new C2651c2(m7020m(this, abstractC2706r0, null, 2, null));
    }

    /* JADX INFO: renamed from: da.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C1936i(C2731z1 c2731z1, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : c2731z1);
    }
}
