package p187mb;

import gb.AbstractC2650c1;
import gb.AbstractC2659e2;
import gb.AbstractC2675i2;
import gb.AbstractC2683k2;
import gb.AbstractC2685l0;
import gb.AbstractC2687l2;
import gb.AbstractC2706r0;
import gb.AbstractC2719v1;
import gb.C2651c2;
import gb.C2663f2;
import gb.C2715u0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lb.AbstractC4734d;
import p024b9.AbstractC1061t;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p186m9.AbstractC5128i;
import p215oc.C5729x;
import p229p9.InterfaceC6018l1;
import p285ta.AbstractC8213e;
import p285ta.InterfaceC8210b;
import p327wa.AbstractC9211e;
import p343xa.C9475e;

/* JADX INFO: renamed from: mb.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5143c {

    /* JADX INFO: renamed from: mb.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15743a;

        static {
            int[] iArr = new int[EnumC2691m2.values().length];
            try {
                iArr[EnumC2691m2.f7042u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2691m2.f7043v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2691m2.f7044w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15743a = iArr;
        }
    }

    /* JADX INFO: renamed from: mb.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC2719v1 {
        @Override // gb.AbstractC2719v1
        /* JADX INFO: renamed from: k */
        public InterfaceC2643a2 mo9487k(InterfaceC2716u1 interfaceC2716u1) {
            interfaceC2716u1.getClass();
            InterfaceC8210b interfaceC8210b = interfaceC2716u1 instanceof InterfaceC8210b ? (InterfaceC8210b) interfaceC2716u1 : null;
            if (interfaceC8210b == null) {
                return null;
            }
            return interfaceC8210b.mo10870b().mo9336c() ? new C2651c2(EnumC2691m2.f7044w, interfaceC8210b.mo10870b().getType()) : interfaceC8210b.mo10870b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C5141a m21149b(AbstractC2706r0 abstractC2706r0) {
        Object objM21154g;
        abstractC2706r0.getClass();
        if (AbstractC2685l0.m9493b(abstractC2706r0)) {
            C5141a c5141aM21149b = m21149b(AbstractC2685l0.m9494c(abstractC2706r0));
            C5141a c5141aM21149b2 = m21149b(AbstractC2685l0.m9495d(abstractC2706r0));
            return new C5141a(AbstractC2683k2.m9489b(C2715u0.m9624e(AbstractC2685l0.m9494c((AbstractC2706r0) c5141aM21149b.m21146c()), AbstractC2685l0.m9495d((AbstractC2706r0) c5141aM21149b2.m21146c())), abstractC2706r0), AbstractC2683k2.m9489b(C2715u0.m9624e(AbstractC2685l0.m9494c((AbstractC2706r0) c5141aM21149b.m21147d()), AbstractC2685l0.m9495d((AbstractC2706r0) c5141aM21149b2.m21147d())), abstractC2706r0));
        }
        InterfaceC2716u1 interfaceC2716u1Mo9332T0 = abstractC2706r0.mo9332T0();
        if (AbstractC8213e.m31910f(abstractC2706r0)) {
            interfaceC2716u1Mo9332T0.getClass();
            InterfaceC2643a2 interfaceC2643a2Mo10870b = ((InterfaceC8210b) interfaceC2716u1Mo9332T0).mo10870b();
            AbstractC2706r0 type = interfaceC2643a2Mo10870b.getType();
            type.getClass();
            AbstractC2706r0 abstractC2706r0M21150c = m21150c(type, abstractC2706r0);
            int i10 = a.f15743a[interfaceC2643a2Mo10870b.mo9335b().ordinal()];
            if (i10 == 2) {
                return new C5141a(abstractC2706r0M21150c, AbstractC4734d.m18919n(abstractC2706r0).m20902J());
            }
            if (i10 != 3) {
                C9475e.m36910a("Only nontrivial projections should have been captured, not: ", interfaceC2643a2Mo10870b);
                return null;
            }
            AbstractC2650c1 abstractC2650c1M20901I = AbstractC4734d.m18919n(abstractC2706r0).m20901I();
            abstractC2650c1M20901I.getClass();
            return new C5141a(m21150c(abstractC2650c1M20901I, abstractC2706r0), abstractC2706r0M21150c);
        }
        if (abstractC2706r0.mo9330R0().isEmpty() || abstractC2706r0.mo9330R0().size() != interfaceC2716u1Mo9332T0.mo5600d().size()) {
            return new C5141a(abstractC2706r0, abstractC2706r0);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listMo9330R0 = abstractC2706r0.mo9330R0();
        List listMo5600d = interfaceC2716u1Mo9332T0.mo5600d();
        listMo5600d.getClass();
        for (C4711r c4711r : AbstractC5081g0.m20574h1(listMo9330R0, listMo5600d)) {
            InterfaceC2643a2 interfaceC2643a2 = (InterfaceC2643a2) c4711r.m18792a();
            InterfaceC6018l1 interfaceC6018l1 = (InterfaceC6018l1) c4711r.m18793b();
            interfaceC6018l1.getClass();
            C5144d c5144dM21156i = m21156i(interfaceC2643a2, interfaceC6018l1);
            if (interfaceC2643a2.mo9336c()) {
                arrayList.add(c5144dM21156i);
                arrayList2.add(c5144dM21156i);
            } else {
                C5141a c5141aM21153f = m21153f(c5144dM21156i);
                C5144d c5144d = (C5144d) c5141aM21153f.m21144a();
                C5144d c5144d2 = (C5144d) c5141aM21153f.m21145b();
                arrayList.add(c5144d);
                arrayList2.add(c5144d2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((C5144d) it.next()).m21162d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objM21154g = AbstractC4734d.m18919n(abstractC2706r0).m20901I();
            objM21154g.getClass();
        } else {
            objM21154g = m21154g(abstractC2706r0, arrayList);
        }
        return new C5141a(objM21154g, m21154g(abstractC2706r0, arrayList2));
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2706r0 m21150c(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02) {
        AbstractC2706r0 abstractC2706r0M9469q = AbstractC2675i2.m9469q(abstractC2706r0, abstractC2706r02.mo9258U0());
        abstractC2706r0M9469q.getClass();
        return abstractC2706r0M9469q;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2643a2 m21151d(InterfaceC2643a2 interfaceC2643a2, boolean z10) {
        if (interfaceC2643a2 == null) {
            return null;
        }
        if (!interfaceC2643a2.mo9336c()) {
            AbstractC2706r0 type = interfaceC2643a2.getType();
            type.getClass();
            if (AbstractC2675i2.m9455c(type, C5142b.f15742q)) {
                EnumC2691m2 enumC2691m2Mo9335b = interfaceC2643a2.mo9335b();
                enumC2691m2Mo9335b.getClass();
                return enumC2691m2Mo9335b == EnumC2691m2.f7044w ? new C2651c2(enumC2691m2Mo9335b, (AbstractC2706r0) m21149b(type).m21147d()) : z10 ? new C2651c2(enumC2691m2Mo9335b, (AbstractC2706r0) m21149b(type).m21146c()) : m21155h(interfaceC2643a2);
            }
        }
        return interfaceC2643a2;
    }

    /* JADX INFO: renamed from: e */
    public static final Boolean m21152e(AbstractC2687l2 abstractC2687l2) {
        abstractC2687l2.getClass();
        return Boolean.valueOf(AbstractC8213e.m31910f(abstractC2687l2));
    }

    /* JADX INFO: renamed from: f */
    public static final C5141a m21153f(C5144d c5144d) {
        C5141a c5141aM21149b = m21149b(c5144d.m21159a());
        AbstractC2706r0 abstractC2706r0 = (AbstractC2706r0) c5141aM21149b.m21144a();
        AbstractC2706r0 abstractC2706r02 = (AbstractC2706r0) c5141aM21149b.m21145b();
        C5141a c5141aM21149b2 = m21149b(c5144d.m21160b());
        return new C5141a(new C5144d(c5144d.m21161c(), abstractC2706r02, (AbstractC2706r0) c5141aM21149b2.m21144a()), new C5144d(c5144d.m21161c(), abstractC2706r0, (AbstractC2706r0) c5141aM21149b2.m21145b()));
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC2706r0 m21154g(AbstractC2706r0 abstractC2706r0, List list) {
        abstractC2706r0.mo9330R0().size();
        list.size();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m21157j((C5144d) it.next()));
        }
        return AbstractC2659e2.m9370e(abstractC2706r0, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2643a2 m21155h(InterfaceC2643a2 interfaceC2643a2) {
        C2663f2 c2663f2M9384g = C2663f2.m9384g(new b());
        c2663f2M9384g.getClass();
        return c2663f2M9384g.m9397t(interfaceC2643a2);
    }

    /* JADX INFO: renamed from: i */
    public static final C5144d m21156i(InterfaceC2643a2 interfaceC2643a2, InterfaceC6018l1 interfaceC6018l1) {
        int i10 = a.f15743a[C2663f2.m9380c(interfaceC6018l1.mo23995s(), interfaceC2643a2).ordinal()];
        if (i10 == 1) {
            AbstractC2706r0 type = interfaceC2643a2.getType();
            type.getClass();
            AbstractC2706r0 type2 = interfaceC2643a2.getType();
            type2.getClass();
            return new C5144d(interfaceC6018l1, type, type2);
        }
        if (i10 == 2) {
            AbstractC2706r0 type3 = interfaceC2643a2.getType();
            type3.getClass();
            AbstractC2650c1 abstractC2650c1M20902J = AbstractC9211e.m35858m(interfaceC6018l1).m20902J();
            abstractC2650c1M20902J.getClass();
            return new C5144d(interfaceC6018l1, type3, abstractC2650c1M20902J);
        }
        if (i10 != 3) {
            C5729x.m23182a();
            return null;
        }
        AbstractC2650c1 abstractC2650c1M20901I = AbstractC9211e.m35858m(interfaceC6018l1).m20901I();
        abstractC2650c1M20901I.getClass();
        AbstractC2706r0 type4 = interfaceC2643a2.getType();
        type4.getClass();
        return new C5144d(interfaceC6018l1, abstractC2650c1M20901I, type4);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2643a2 m21157j(C5144d c5144d) {
        c5144d.m21162d();
        if (!AbstractC1061t.m3842c(c5144d.m21159a(), c5144d.m21160b())) {
            EnumC2691m2 enumC2691m2Mo23995s = c5144d.m21161c().mo23995s();
            EnumC2691m2 enumC2691m2 = EnumC2691m2.f7043v;
            if (enumC2691m2Mo23995s != enumC2691m2) {
                return (!AbstractC5128i.m20881o0(c5144d.m21159a()) || c5144d.m21161c().mo23995s() == enumC2691m2) ? AbstractC5128i.m20883q0(c5144d.m21160b()) ? new C2651c2(m21158k(c5144d, enumC2691m2), c5144d.m21159a()) : new C2651c2(m21158k(c5144d, EnumC2691m2.f7044w), c5144d.m21160b()) : new C2651c2(m21158k(c5144d, EnumC2691m2.f7044w), c5144d.m21160b());
            }
        }
        return new C2651c2(c5144d.m21159a());
    }

    /* JADX INFO: renamed from: k */
    public static final EnumC2691m2 m21158k(C5144d c5144d, EnumC2691m2 enumC2691m2) {
        return enumC2691m2 == c5144d.m21161c().mo23995s() ? EnumC2691m2.f7042u : enumC2691m2;
    }
}
