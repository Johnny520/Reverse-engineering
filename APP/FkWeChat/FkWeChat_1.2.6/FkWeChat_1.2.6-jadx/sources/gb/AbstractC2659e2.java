package gb;

import java.util.List;
import p129ib.C3378i;
import p215oc.C5729x;
import p243q9.C6341p;
import p243q9.InterfaceC6333h;
import p314vb.C8897d;

/* JADX INFO: renamed from: gb.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2659e2 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2650c1 m9366a(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
        AbstractC2687l2 abstractC2687l2Mo9510W0 = abstractC2706r0.mo9510W0();
        AbstractC2650c1 abstractC2650c1 = abstractC2687l2Mo9510W0 instanceof AbstractC2650c1 ? (AbstractC2650c1) abstractC2687l2Mo9510W0 : null;
        if (abstractC2650c1 != null) {
            return abstractC2650c1;
        }
        C8897d.m34134a("This is should be simple type: ", abstractC2706r0);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2706r0 m9367b(AbstractC2706r0 abstractC2706r0, List list, InterfaceC6333h interfaceC6333h) {
        abstractC2706r0.getClass();
        list.getClass();
        interfaceC6333h.getClass();
        return m9370e(abstractC2706r0, list, interfaceC6333h, null, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC2706r0 m9368c(AbstractC2706r0 abstractC2706r0, List list, InterfaceC6333h interfaceC6333h, List list2) {
        abstractC2706r0.getClass();
        list.getClass();
        interfaceC6333h.getClass();
        list2.getClass();
        if ((list.isEmpty() || list == abstractC2706r0.mo9330R0()) && interfaceC6333h == abstractC2706r0.getAnnotations()) {
            return abstractC2706r0;
        }
        C2704q1 c2704q1Mo9331S0 = abstractC2706r0.mo9331S0();
        if ((interfaceC6333h instanceof C6341p) && ((C6341p) interfaceC6333h).isEmpty()) {
            interfaceC6333h = InterfaceC6333h.f19873o.m25003b();
        }
        C2704q1 c2704q1M9588a = AbstractC2707r1.m9588a(c2704q1Mo9331S0, interfaceC6333h);
        AbstractC2687l2 abstractC2687l2Mo9510W0 = abstractC2706r0.mo9510W0();
        if (abstractC2687l2Mo9510W0 instanceof AbstractC2673i0) {
            AbstractC2673i0 abstractC2673i0 = (AbstractC2673i0) abstractC2687l2Mo9510W0;
            return C2715u0.m9624e(m9369d(abstractC2673i0.m9451b1(), list, c2704q1M9588a), m9369d(abstractC2673i0.m9452c1(), list2, c2704q1M9588a));
        }
        if (abstractC2687l2Mo9510W0 instanceof AbstractC2650c1) {
            return m9369d((AbstractC2650c1) abstractC2687l2Mo9510W0, list, c2704q1M9588a);
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2650c1 m9369d(AbstractC2650c1 abstractC2650c1, List list, C2704q1 c2704q1) {
        abstractC2650c1.getClass();
        list.getClass();
        c2704q1.getClass();
        return (list.isEmpty() && c2704q1 == abstractC2650c1.mo9331S0()) ? abstractC2650c1 : list.isEmpty() ? abstractC2650c1.mo7034Z0(c2704q1) : abstractC2650c1 instanceof C3378i ? ((C3378i) abstractC2650c1).m12695f1(list) : C2715u0.m9631m(c2704q1, abstractC2650c1.mo9332T0(), list, abstractC2650c1.mo9258U0(), null, 16, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC2706r0 m9370e(AbstractC2706r0 abstractC2706r0, List list, InterfaceC6333h interfaceC6333h, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC2706r0.mo9330R0();
        }
        if ((i10 & 2) != 0) {
            interfaceC6333h = abstractC2706r0.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return m9368c(abstractC2706r0, list, interfaceC6333h, list2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AbstractC2650c1 m9371f(AbstractC2650c1 abstractC2650c1, List list, C2704q1 c2704q1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = abstractC2650c1.mo9330R0();
        }
        if ((i10 & 2) != 0) {
            c2704q1 = abstractC2650c1.mo9331S0();
        }
        return m9369d(abstractC2650c1, list, c2704q1);
    }
}
