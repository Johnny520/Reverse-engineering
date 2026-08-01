package gb;

import gb.InterfaceC2694n1;
import java.util.List;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p112hb.AbstractC2949h;
import p129ib.C3381l;
import p129ib.EnumC3377h;
import p185m8.AbstractC5114x;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6018l1;
import p273s9.AbstractC7202a0;
import p327wa.AbstractC9211e;
import ua.C8600q;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: gb.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2715u0 {

    /* JADX INFO: renamed from: a */
    public static final C2715u0 f7107a = new C2715u0();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0184l f7108b = a.f7109q;

    /* JADX INFO: renamed from: gb.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public static final a f7109q = new a();

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void mo27m(AbstractC2949h abstractC2949h) {
            abstractC2949h.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: gb.u0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC2650c1 f7110a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2716u1 f7111b;

        public b(AbstractC2650c1 abstractC2650c1, InterfaceC2716u1 interfaceC2716u1) {
            this.f7110a = abstractC2650c1;
            this.f7111b = interfaceC2716u1;
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2650c1 m9639a() {
            return this.f7110a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2716u1 m9640b() {
            return this.f7111b;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2650c1 m9623c(InterfaceC6015k1 interfaceC6015k1, List list) {
        interfaceC6015k1.getClass();
        list.getClass();
        return new C2686l1(InterfaceC2694n1.a.f7053a, false).m9503h(C2690m1.f7037e.m9517a(null, interfaceC6015k1, list), C2704q1.f7069r.m9585k());
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2687l2 m9624e(AbstractC2650c1 abstractC2650c1, AbstractC2650c1 abstractC2650c12) {
        abstractC2650c1.getClass();
        abstractC2650c12.getClass();
        return AbstractC1061t.m3842c(abstractC2650c1, abstractC2650c12) ? abstractC2650c1 : new C2677j0(abstractC2650c1, abstractC2650c12);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC2650c1 m9625f(C2704q1 c2704q1, C8600q c8600q, boolean z10) {
        c2704q1.getClass();
        c8600q.getClass();
        return m9633o(c2704q1, c8600q, AbstractC5114x.m20800o(), z10, C3381l.m12701a(EnumC3377h.f9222s, true, "unknown integer literal type"));
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC2650c1 m9626h(C2704q1 c2704q1, InterfaceC5995e interfaceC5995e, List list) {
        c2704q1.getClass();
        interfaceC5995e.getClass();
        list.getClass();
        InterfaceC2716u1 interfaceC2716u1Mo5591o = interfaceC5995e.mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        return m9631m(c2704q1, interfaceC2716u1Mo5591o, list, false, null, 16, null);
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC2650c1 m9627i(AbstractC2650c1 abstractC2650c1, C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10) {
        abstractC2650c1.getClass();
        c2704q1.getClass();
        interfaceC2716u1.getClass();
        list.getClass();
        return m9631m(c2704q1, interfaceC2716u1, list, z10, null, 16, null);
    }

    /* JADX INFO: renamed from: j */
    public static final AbstractC2650c1 m9628j(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10) {
        c2704q1.getClass();
        interfaceC2716u1.getClass();
        list.getClass();
        return m9631m(c2704q1, interfaceC2716u1, list, z10, null, 16, null);
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC2650c1 m9629k(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, AbstractC2949h abstractC2949h) {
        c2704q1.getClass();
        interfaceC2716u1.getClass();
        list.getClass();
        if (!c2704q1.isEmpty() || !list.isEmpty() || z10 || interfaceC2716u1.mo5602u() == null) {
            return m9634p(c2704q1, interfaceC2716u1, list, z10, f7107a.m9636d(interfaceC2716u1, list, abstractC2949h), new C2709s0(interfaceC2716u1, list, c2704q1, z10));
        }
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        interfaceC6004hMo5602u.getClass();
        AbstractC2650c1 abstractC2650c1Mo7508x = interfaceC6004hMo5602u.mo7508x();
        abstractC2650c1Mo7508x.getClass();
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ AbstractC2650c1 m9630l(AbstractC2650c1 abstractC2650c1, C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c2704q1 = abstractC2650c1.mo9331S0();
        }
        if ((i10 & 4) != 0) {
            interfaceC2716u1 = abstractC2650c1.mo9332T0();
        }
        if ((i10 & 8) != 0) {
            list = abstractC2650c1.mo9330R0();
        }
        if ((i10 & 16) != 0) {
            z10 = abstractC2650c1.mo9258U0();
        }
        return m9627i(abstractC2650c1, c2704q1, interfaceC2716u1, list, z10);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AbstractC2650c1 m9631m(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, AbstractC2949h abstractC2949h, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            abstractC2949h = null;
        }
        return m9629k(c2704q1, interfaceC2716u1, list, z10, abstractC2949h);
    }

    /* JADX INFO: renamed from: n */
    public static final AbstractC2650c1 m9632n(InterfaceC2716u1 interfaceC2716u1, List list, C2704q1 c2704q1, boolean z10, AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        b bVarM9637g = f7107a.m9637g(interfaceC2716u1, abstractC2949h, list);
        if (bVarM9637g == null) {
            return null;
        }
        AbstractC2650c1 abstractC2650c1M9639a = bVarM9637g.m9639a();
        if (abstractC2650c1M9639a != null) {
            return abstractC2650c1M9639a;
        }
        InterfaceC2716u1 interfaceC2716u1M9640b = bVarM9637g.m9640b();
        interfaceC2716u1M9640b.getClass();
        return m9629k(c2704q1, interfaceC2716u1M9640b, list, z10, abstractC2949h);
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC2650c1 m9633o(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, InterfaceC9913k interfaceC9913k) {
        c2704q1.getClass();
        interfaceC2716u1.getClass();
        list.getClass();
        interfaceC9913k.getClass();
        C2654d1 c2654d1 = new C2654d1(interfaceC2716u1, list, z10, interfaceC9913k, new C2712t0(interfaceC2716u1, list, c2704q1, z10, interfaceC9913k));
        return c2704q1.isEmpty() ? c2654d1 : new C2658e1(c2654d1, c2704q1);
    }

    /* JADX INFO: renamed from: p */
    public static final AbstractC2650c1 m9634p(C2704q1 c2704q1, InterfaceC2716u1 interfaceC2716u1, List list, boolean z10, InterfaceC9913k interfaceC9913k, InterfaceC0184l interfaceC0184l) {
        c2704q1.getClass();
        interfaceC2716u1.getClass();
        list.getClass();
        interfaceC9913k.getClass();
        interfaceC0184l.getClass();
        C2654d1 c2654d1 = new C2654d1(interfaceC2716u1, list, z10, interfaceC9913k, interfaceC0184l);
        return c2704q1.isEmpty() ? c2654d1 : new C2658e1(c2654d1, c2704q1);
    }

    /* JADX INFO: renamed from: q */
    public static final AbstractC2650c1 m9635q(InterfaceC2716u1 interfaceC2716u1, List list, C2704q1 c2704q1, boolean z10, InterfaceC9913k interfaceC9913k, AbstractC2949h abstractC2949h) {
        abstractC2949h.getClass();
        b bVarM9637g = f7107a.m9637g(interfaceC2716u1, abstractC2949h, list);
        if (bVarM9637g == null) {
            return null;
        }
        AbstractC2650c1 abstractC2650c1M9639a = bVarM9637g.m9639a();
        if (abstractC2650c1M9639a != null) {
            return abstractC2650c1M9639a;
        }
        InterfaceC2716u1 interfaceC2716u1M9640b = bVarM9637g.m9640b();
        interfaceC2716u1M9640b.getClass();
        return m9633o(c2704q1, interfaceC2716u1M9640b, list, z10, interfaceC9913k);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC9913k m9636d(InterfaceC2716u1 interfaceC2716u1, List list, AbstractC2949h abstractC2949h) {
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        if (interfaceC6004hMo5602u instanceof InterfaceC6018l1) {
            return ((InterfaceC6018l1) interfaceC6004hMo5602u).mo7508x().mo7040v();
        }
        if (interfaceC6004hMo5602u instanceof InterfaceC5995e) {
            if (abstractC2949h == null) {
                abstractC2949h = AbstractC9211e.m35863r(AbstractC9211e.m35864s(interfaceC6004hMo5602u));
            }
            return list.isEmpty() ? AbstractC7202a0.m28448b((InterfaceC5995e) interfaceC6004hMo5602u, abstractC2949h) : AbstractC7202a0.m28447a((InterfaceC5995e) interfaceC6004hMo5602u, AbstractC2719v1.f7113c.m9649b(interfaceC2716u1, list), abstractC2949h);
        }
        if (interfaceC6004hMo5602u instanceof InterfaceC6015k1) {
            return C3381l.m12701a(EnumC3377h.f9224u, true, ((InterfaceC6015k1) interfaceC6004hMo5602u).getName().toString());
        }
        if (interfaceC2716u1 instanceof C2703q0) {
            return ((C2703q0) interfaceC2716u1).m9569g();
        }
        throw new IllegalStateException("Unsupported classifier: " + interfaceC6004hMo5602u + " for constructor: " + interfaceC2716u1);
    }

    /* JADX INFO: renamed from: g */
    public final b m9637g(InterfaceC2716u1 interfaceC2716u1, AbstractC2949h abstractC2949h, List list) {
        InterfaceC6004h interfaceC6004hMo10850f;
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        if (interfaceC6004hMo5602u == null || (interfaceC6004hMo10850f = abstractC2949h.mo10850f(interfaceC6004hMo5602u)) == null) {
            return null;
        }
        if (interfaceC6004hMo10850f instanceof InterfaceC6015k1) {
            return new b(m9623c((InterfaceC6015k1) interfaceC6004hMo10850f, list), null);
        }
        InterfaceC2716u1 interfaceC2716u1Mo9545a = interfaceC6004hMo10850f.mo5591o().mo9545a(abstractC2949h);
        interfaceC2716u1Mo9545a.getClass();
        return new b(null, interfaceC2716u1Mo9545a);
    }
}
